package com.crrepa.band.my.profile.backgroundrun.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogPermissionRequestHintBinding;

/* loaded from: classes2.dex */
public class c extends Dialog {
    private a onChoiceClickListener;
    private final int titleHintId;
    private final int titleId;
    private final int type;

    public interface a {
        void onCancel();

        void onPermit(int i8);
    }

    public c(@NonNull Context context, int i8, int i9, int i10) {
        super(context, R.style.UserInfoChooceDialog);
        this.type = i8;
        this.titleId = i9;
        this.titleHintId = i10;
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.8d);
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(false);
    }

    private void initView() {
        DialogPermissionRequestHintBinding bind = DialogPermissionRequestHintBinding.bind(LayoutInflater.from(getContext()).inflate(R.layout.dialog_permission_request_hint, (ViewGroup) null));
        setContentView(bind.getRoot());
        bind.tvTitle.setText(this.titleId);
        bind.tvTitleHint.setText(this.titleHintId);
        bind.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.lambda$initView$0(view);
            }
        });
        bind.tvPermit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        a aVar = this.onChoiceClickListener;
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        a aVar = this.onChoiceClickListener;
        if (aVar != null) {
            aVar.onPermit(this.type);
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initLayout();
    }

    public void setOnChoiceClickListener(a aVar) {
        this.onChoiceClickListener = aVar;
    }
}
