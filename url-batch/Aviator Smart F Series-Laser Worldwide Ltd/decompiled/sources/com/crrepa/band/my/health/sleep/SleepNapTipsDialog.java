package com.crrepa.band.my.health.sleep;

import android.content.Context;
import android.view.View;
import com.crrepa.band.my.databinding.DialogSleepNapTipsBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;

/* loaded from: classes2.dex */
public class SleepNapTipsDialog extends BaseVBBottomSheetDialog<DialogSleepNapTipsBinding> {
    public SleepNapTipsDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
        ((DialogSleepNapTipsBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.sleep.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepNapTipsDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogSleepNapTipsBinding getViewBinding() {
        return DialogSleepNapTipsBinding.inflate(getLayoutInflater());
    }
}
