package com.crrepa.band.my;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.databinding.DialogCustomConfirmBinding;

/* loaded from: classes2.dex */
public class CustomConfirmDialog extends BaseCustomConfirmDialog {
    public CustomConfirmDialog(Context context) {
        super(context);
        ((DialogCustomConfirmBinding) this.binding).tvOk.setText(R.string.btn_ok);
        ((DialogCustomConfirmBinding) this.binding).tvCancel.setText(R.string.btn_cancel);
    }
}
