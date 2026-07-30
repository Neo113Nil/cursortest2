package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogDeleteConfirmBinding;

/* loaded from: classes2.dex */
public class i extends Dialog {
    private DialogDeleteConfirmBinding binding;
    private a onDoneClickListener;
    private String titleText;

    public interface a {
        void onClick();
    }

    public i(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.76d);
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    private void initListener() {
        this.binding.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.this.lambda$initListener$0(view);
            }
        });
        this.binding.tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.this.lambda$initListener$1(view);
            }
        });
    }

    private void initView() {
        DialogDeleteConfirmBinding inflate = DialogDeleteConfirmBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvTitle.setText(this.titleText);
        initLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onClick();
        }
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initListener();
    }

    public i setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
        return this;
    }

    public i setTitle(String str) {
        this.titleText = str;
        return this;
    }
}
