package com.crrepa.band.my.training.gomoresport;

import android.content.Context;
import androidx.annotation.StringRes;
import com.crrepa.band.my.databinding.DialogGomoreSportTipsBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;

/* loaded from: classes3.dex */
public class GomoreSportTipsDialog extends BaseVBBottomSheetDialog<DialogGomoreSportTipsBinding> {
    public GomoreSportTipsDialog(Context context) {
        super(context);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
    }

    public void showData(@StringRes int i8, @StringRes int i9) {
        ((DialogGomoreSportTipsBinding) this.binding).tvTitle.setText(i8);
        ((DialogGomoreSportTipsBinding) this.binding).tvDescription.setText(i9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogGomoreSportTipsBinding getViewBinding() {
        return DialogGomoreSportTipsBinding.inflate(getLayoutInflater());
    }
}
