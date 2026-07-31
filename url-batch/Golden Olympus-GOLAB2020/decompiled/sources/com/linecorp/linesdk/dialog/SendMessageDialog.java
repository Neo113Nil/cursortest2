package com.linecorp.linesdk.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.r;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.dialog.internal.SendMessageContract;
import com.linecorp.linesdk.dialog.internal.SendMessagePresenter;
import com.linecorp.linesdk.dialog.internal.SendMessageTargetPagerAdapter;
import com.linecorp.linesdk.dialog.internal.TargetUser;
import com.linecorp.linesdk.dialog.internal.UserThumbnailView;
import com.linecorp.linesdk.message.MessageData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class SendMessageDialog extends r implements SendMessageContract.View {
    private Button buttonConfirm;
    private View.OnClickListener confirmClickListener;
    private HorizontalScrollView horizontalScrollView;
    private LinearLayout.LayoutParams layoutParams;
    private LinearLayout linearLayoutTargetUser;
    private MessageData messageData;
    private OnSendListener onSendListener;
    private SendMessagePresenter presenter;
    private SendMessageTargetPagerAdapter sendMessageTargetAdapter;
    private TabLayout tabLayout;
    private Map<String, View> targetUserViewCacheMap;
    private ViewPager viewPager;

    public interface OnSendListener {
        void onSendFailure(DialogInterface dialogInterface);

        void onSendSuccess(DialogInterface dialogInterface);
    }

    public SendMessageDialog(@NonNull Context context, @NonNull LineApiClient lineApiClient) {
        super(context, R.style.DialogTheme);
        this.targetUserViewCacheMap = new HashMap();
        this.layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.confirmClickListener = new View.OnClickListener() { // from class: com.linecorp.linesdk.dialog.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r0.presenter.sendMessage(SendMessageDialog.this.messageData);
            }
        };
        SendMessagePresenter sendMessagePresenter = new SendMessagePresenter(lineApiClient, this);
        this.presenter = sendMessagePresenter;
        this.sendMessageTargetAdapter = new SendMessageTargetPagerAdapter(context, sendMessagePresenter, sendMessagePresenter);
    }

    @NonNull
    private UserThumbnailView createUserThumbnailView(final TargetUser targetUser) {
        UserThumbnailView userThumbnailView = new UserThumbnailView(getContext());
        userThumbnailView.setOnClickListener(new View.OnClickListener() { // from class: com.linecorp.linesdk.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendMessageDialog.this.presenter.removeTargetUser(targetUser);
            }
        });
        userThumbnailView.setTargetUser(targetUser);
        return userThumbnailView;
    }

    private void setupUi() {
        this.viewPager.setAdapter(this.sendMessageTargetAdapter);
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.buttonConfirm.setOnClickListener(this.confirmClickListener);
        this.viewPager.post(new Runnable() { // from class: com.linecorp.linesdk.dialog.b
            @Override // java.lang.Runnable
            public final void run() {
                SendMessageDialog.this.getWindow().clearFlags(131080);
            }
        });
    }

    private void updateConfirmButtonLabel() {
        int targetUserListSize = this.presenter.getTargetUserListSize();
        if (targetUserListSize == 0) {
            this.buttonConfirm.setText(android.R.string.ok);
            this.buttonConfirm.setVisibility(8);
            return;
        }
        this.buttonConfirm.setText(getContext().getString(android.R.string.ok) + " (" + targetUserListSize + ")");
        this.buttonConfirm.setVisibility(0);
    }

    @Override // androidx.appcompat.app.r, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.presenter.release();
        super.dismiss();
    }

    @Override // androidx.appcompat.app.r, androidx.activity.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_send_message, (ViewGroup) null);
        setContentView(inflate);
        this.viewPager = (ViewPager) inflate.findViewById(R.id.viewPager);
        this.tabLayout = (TabLayout) inflate.findViewById(R.id.tabLayout);
        this.buttonConfirm = (Button) inflate.findViewById(R.id.buttonConfirm);
        this.linearLayoutTargetUser = (LinearLayout) inflate.findViewById(R.id.linearLayoutTargetUserList);
        this.horizontalScrollView = (HorizontalScrollView) inflate.findViewById(R.id.horizontalScrollView);
        setupUi();
    }

    @Override // com.linecorp.linesdk.dialog.internal.SendMessageContract.View
    public void onExceedMaxTargetUserCount(int i4) {
    }

    @Override // com.linecorp.linesdk.dialog.internal.SendMessageContract.View
    public void onSendMessageFailure() {
        OnSendListener onSendListener = this.onSendListener;
        if (onSendListener != null) {
            onSendListener.onSendFailure(this);
        }
        dismiss();
    }

    @Override // com.linecorp.linesdk.dialog.internal.SendMessageContract.View
    public void onSendMessageSuccess() {
        OnSendListener onSendListener = this.onSendListener;
        if (onSendListener != null) {
            onSendListener.onSendSuccess(this);
        }
        dismiss();
    }

    @Override // com.linecorp.linesdk.dialog.internal.SendMessageContract.View
    public void onTargetUserAdded(TargetUser targetUser) {
        if (this.targetUserViewCacheMap.get(targetUser.getId()) == null) {
            this.targetUserViewCacheMap.put(targetUser.getId(), createUserThumbnailView(targetUser));
        }
        this.linearLayoutTargetUser.addView(this.targetUserViewCacheMap.get(targetUser.getId()), this.layoutParams);
        this.horizontalScrollView.post(new Runnable() { // from class: com.linecorp.linesdk.dialog.c
            @Override // java.lang.Runnable
            public final void run() {
                SendMessageDialog.this.horizontalScrollView.fullScroll(66);
            }
        });
        updateConfirmButtonLabel();
    }

    @Override // com.linecorp.linesdk.dialog.internal.SendMessageContract.View
    public void onTargetUserRemoved(TargetUser targetUser) {
        this.linearLayoutTargetUser.removeView(this.targetUserViewCacheMap.get(targetUser.getId()));
        this.sendMessageTargetAdapter.unSelect(targetUser);
        updateConfirmButtonLabel();
    }

    public void setMessageData(MessageData messageData) {
        this.messageData = messageData;
    }

    public void setOnSendListener(OnSendListener onSendListener) {
        if (this.onSendListener != null) {
            throw new IllegalStateException("OnSendListener is already taken and can not be replaced.");
        }
        this.onSendListener = onSendListener;
    }
}
