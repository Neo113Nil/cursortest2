package com.crrepa.band.my;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.StringRes;
import com.crrepa.band.my.databinding.DialogRequestPermissionHintBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;

/* loaded from: classes2.dex */
public class RequestPermissionHintDialog extends BaseVBDialog<DialogRequestPermissionHintBinding> {
    public RequestPermissionHintDialog(Context context) {
        super(context);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        setShowPosition(48);
    }

    public void setHint(@StringRes int i8, @StringRes int i9) {
        setHint(getContext().getResources().getString(i8), getContext().getResources().getString(i9));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    public void setShowPosition(int i8) {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setDimAmount(0.0f);
        window.setGravity(i8);
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public void setHint(String str, String str2) {
        ((DialogRequestPermissionHintBinding) this.binding).tvTitle.setText(str);
        ((DialogRequestPermissionHintBinding) this.binding).tvContent.setText(str2);
    }
}
