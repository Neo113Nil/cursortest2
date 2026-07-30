package com.moyoung.dafit.module.common.baseui;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.moyoung.dafit.module.common.databinding.DialogCustomConfirmBinding;

/* loaded from: classes4.dex */
public class BaseCustomConfirmDialog extends BaseVBDialog<DialogCustomConfirmBinding> {
    private a onCancelClick;
    private b onOkClick;

    public interface a {
        void onCancel();
    }

    public interface b {
        void onConfirm();
    }

    public BaseCustomConfirmDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        dismiss();
        a aVar = this.onCancelClick;
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        dismiss();
        b bVar = this.onOkClick;
        if (bVar != null) {
            bVar.onConfirm();
        }
    }

    public void exchangeOperationTvColor() {
        int currentTextColor = ((DialogCustomConfirmBinding) this.binding).tvOk.getCurrentTextColor();
        ((DialogCustomConfirmBinding) this.binding).tvOk.setTextColor(((DialogCustomConfirmBinding) this.binding).tvCancel.getCurrentTextColor());
        ((DialogCustomConfirmBinding) this.binding).tvCancel.setTextColor(currentTextColor);
    }

    public void exchangeOperationTvPosition() {
        VB vb = this.binding;
        ((DialogCustomConfirmBinding) vb).llOperation.removeView(((DialogCustomConfirmBinding) vb).tvCancel);
        VB vb2 = this.binding;
        ((DialogCustomConfirmBinding) vb2).llOperation.removeView(((DialogCustomConfirmBinding) vb2).border);
        VB vb3 = this.binding;
        ((DialogCustomConfirmBinding) vb3).llOperation.removeView(((DialogCustomConfirmBinding) vb3).tvOk);
        VB vb4 = this.binding;
        ((DialogCustomConfirmBinding) vb4).llOperation.addView(((DialogCustomConfirmBinding) vb4).tvOk);
        VB vb5 = this.binding;
        ((DialogCustomConfirmBinding) vb5).llOperation.addView(((DialogCustomConfirmBinding) vb5).border);
        VB vb6 = this.binding;
        ((DialogCustomConfirmBinding) vb6).llOperation.addView(((DialogCustomConfirmBinding) vb6).tvCancel);
    }

    public TextView getCancelTv() {
        return ((DialogCustomConfirmBinding) this.binding).tvCancel;
    }

    public TextView getContentTv() {
        return ((DialogCustomConfirmBinding) this.binding).tvContent.getVisibility() == 0 ? ((DialogCustomConfirmBinding) this.binding).tvContent : ((DialogCustomConfirmBinding) this.binding).tvContentOnly;
    }

    public TextView getOkTv() {
        return ((DialogCustomConfirmBinding) this.binding).tvOk;
    }

    public TextView getTitleTv() {
        return ((DialogCustomConfirmBinding) this.binding).tvTitle;
    }

    public void hideCancelTv() {
        ((DialogCustomConfirmBinding) this.binding).tvCancel.setVisibility(8);
        ((DialogCustomConfirmBinding) this.binding).border.setVisibility(8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ((DialogCustomConfirmBinding) this.binding).tvContent.setMovementMethod(ScrollingMovementMethod.getInstance());
        ((DialogCustomConfirmBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.dafit.module.common.baseui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseCustomConfirmDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogCustomConfirmBinding) this.binding).tvOk.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.dafit.module.common.baseui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseCustomConfirmDialog.this.lambda$initBinding$1(view);
            }
        });
    }

    public void setCancelTxt(String str) {
        ((DialogCustomConfirmBinding) this.binding).tvCancel.setText(str);
    }

    public void setContentTxt(String str) {
        if (((DialogCustomConfirmBinding) this.binding).tvContent.getVisibility() == 0) {
            ((DialogCustomConfirmBinding) this.binding).tvContent.setText(str);
        } else {
            ((DialogCustomConfirmBinding) this.binding).tvContentOnly.setText(str);
        }
    }

    public void setIvIcon(@DrawableRes int i8) {
        ((DialogCustomConfirmBinding) this.binding).ivIcon.setImageResource(i8);
        ((DialogCustomConfirmBinding) this.binding).ivIcon.setVisibility(0);
    }

    public void setNoTitleMode() {
        ((DialogCustomConfirmBinding) this.binding).tvTitle.setVisibility(8);
        ((DialogCustomConfirmBinding) this.binding).tvContent.setVisibility(8);
        ((DialogCustomConfirmBinding) this.binding).tvContentOnly.setVisibility(0);
    }

    public void setOkTxt(String str) {
        ((DialogCustomConfirmBinding) this.binding).tvOk.setText(str);
    }

    public void setOnCancelClick(a aVar) {
        this.onCancelClick = aVar;
    }

    public void setOnOkClick(b bVar) {
        this.onOkClick = bVar;
    }

    public void setTitleTxt(String str) {
        ((DialogCustomConfirmBinding) this.binding).tvTitle.setText(str);
    }

    public void setCancelTxt(@StringRes int i8) {
        ((DialogCustomConfirmBinding) this.binding).tvCancel.setText(i8);
    }

    public void setOkTxt(@StringRes int i8) {
        ((DialogCustomConfirmBinding) this.binding).tvOk.setText(i8);
    }

    public void setTitleTxt(@StringRes int i8) {
        ((DialogCustomConfirmBinding) this.binding).tvTitle.setText(i8);
    }

    public void setContentTxt(@StringRes int i8) {
        if (((DialogCustomConfirmBinding) this.binding).tvContent.getVisibility() == 0) {
            ((DialogCustomConfirmBinding) this.binding).tvContent.setText(i8);
        } else {
            ((DialogCustomConfirmBinding) this.binding).tvContentOnly.setText(i8);
        }
    }
}
