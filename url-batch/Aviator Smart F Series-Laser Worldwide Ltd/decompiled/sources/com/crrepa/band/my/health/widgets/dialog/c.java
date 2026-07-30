package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogCommonConfirmBinding;

/* loaded from: classes2.dex */
public class c extends Dialog {
    private DialogCommonConfirmBinding binding;
    private a onDoneClickListener;

    public interface a {
        void onClick();
    }

    public c(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.8d);
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    private void initView() {
        DialogCommonConfirmBinding inflate = DialogCommonConfirmBinding.inflate(LayoutInflater.from(getContext()));
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.btnOk.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.lambda$initView$0(view);
            }
        });
        this.binding.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onClick();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initLayout();
    }

    public void setContent(String str) {
        this.binding.tvContent.setText(str);
    }

    public c setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
        return this;
    }

    public void setTitle(String str) {
        this.binding.tvTitle.setText(str);
    }
}
