package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogNotificationPermissionBinding;

/* loaded from: classes2.dex */
public class p extends Dialog {
    private DialogNotificationPermissionBinding binding;
    private boolean isGoSetting;
    private a onSelectDoneListener;

    public interface a {
        void onSelect(boolean z7);
    }

    public p(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
        this.isGoSetting = false;
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = getContext().getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    private void initListener() {
        this.binding.tvCalenderRefuse.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.lambda$initListener$0(view);
            }
        });
        this.binding.tvCalenderGoSetting.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.lambda$initListener$1(view);
            }
        });
    }

    private void initView() {
        DialogNotificationPermissionBinding inflate = DialogNotificationPermissionBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvCalenderTitle.setText(getContext().getString(R.string.water_notification_request_title, getContext().getString(R.string.app_name_dafit)));
        initLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        this.isGoSetting = false;
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        this.isGoSetting = true;
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a aVar = this.onSelectDoneListener;
        if (aVar != null) {
            aVar.onSelect(this.isGoSetting);
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initListener();
    }

    public p setOnSelectDoneListener(a aVar) {
        this.onSelectDoneListener = aVar;
        return this;
    }
}
