package com.crrepa.band.my.home.device.permisisonexplain;

import android.content.Context;
import android.view.View;
import androidx.annotation.StringRes;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogGeneralPermissonBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import com.moyoung.dafit.module.common.utils.d;

/* loaded from: classes2.dex */
public class PermissionRequestDialog extends BaseVBDialog<DialogGeneralPermissonBinding> {
    private a onMessageTypeClickListener;

    public interface a {
    }

    public PermissionRequestDialog(Context context) {
        super(context, R.style.BottomDialogAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        setShowBottomWithAnim();
        setCanceledOnTouchOutside(false);
        ((DialogGeneralPermissonBinding) this.binding).btnPermit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.device.permisisonexplain.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionRequestDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogGeneralPermissonBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.device.permisisonexplain.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionRequestDialog.this.lambda$initBinding$1(view);
            }
        });
    }

    public void setContentText(@StringRes int i8) {
        ((DialogGeneralPermissonBinding) this.binding).tvPermissionRequest.setText(d.get().getText(i8));
    }

    public void setOnMessageTypeClickListener(a aVar) {
    }
}
