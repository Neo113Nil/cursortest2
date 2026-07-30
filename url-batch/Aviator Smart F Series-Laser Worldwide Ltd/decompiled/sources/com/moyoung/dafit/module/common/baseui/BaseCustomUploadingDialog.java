package com.moyoung.dafit.module.common.baseui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.StringRes;
import com.moyoung.dafit.module.common.databinding.DialogCustomUploadingBinding;

/* loaded from: classes4.dex */
public class BaseCustomUploadingDialog extends BaseVBDialog<DialogCustomUploadingBinding> {
    private boolean isInterceptBackKey;
    private a onCancelClick;

    public interface a {
    }

    public BaseCustomUploadingDialog(Context context) {
        super(context);
        this.isInterceptBackKey = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        dismiss();
    }

    public void hideCancelTv() {
        ((DialogCustomUploadingBinding) this.binding).tvCancel.setVisibility(8);
    }

    public void hideProgressTv() {
        ((DialogCustomUploadingBinding) this.binding).tvProgress.setVisibility(8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        setCanceledOnTouchOutside(false);
        getWindow().setLayout(-1, -2);
        ((DialogCustomUploadingBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.dafit.module.common.baseui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseCustomUploadingDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (i8 == 4 && this.isInterceptBackKey) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    public void setCancelTxt(String str) {
        ((DialogCustomUploadingBinding) this.binding).tvCancel.setText(str);
    }

    public void setInterceptBackKey(boolean z7) {
        this.isInterceptBackKey = z7;
    }

    public void setOnCancelClick(a aVar) {
    }

    public void setProgress(int i8) {
        setProgressTv(i8);
        setProgressPb(i8);
    }

    public void setProgressPb(int i8) {
        ((DialogCustomUploadingBinding) this.binding).pb.setProgress(i8);
    }

    public void setProgressTv(String str) {
        ((DialogCustomUploadingBinding) this.binding).tvProgress.setText(str);
    }

    public void setTitleTxt(String str) {
        ((DialogCustomUploadingBinding) this.binding).tvTitle.setText(str);
    }

    public void setCancelTxt(@StringRes int i8) {
        ((DialogCustomUploadingBinding) this.binding).tvCancel.setText(i8);
    }

    @SuppressLint({"SetTextI18n"})
    public void setProgressTv(int i8) {
        ((DialogCustomUploadingBinding) this.binding).tvProgress.setText(i8 + "%");
    }

    public void setTitleTxt(@StringRes int i8) {
        ((DialogCustomUploadingBinding) this.binding).tvTitle.setText(i8);
    }
}
