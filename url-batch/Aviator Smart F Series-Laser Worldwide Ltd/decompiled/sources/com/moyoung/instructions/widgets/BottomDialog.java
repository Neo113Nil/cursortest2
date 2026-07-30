package com.moyoung.instructions.widgets;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;
import com.moyoung.instructions.databinding.DialogBottomBinding;
import com.moyoung.instructions.model.InstructBean;
import com.moyoung.instructions.utils.InstructionsType;
import com.moyoung.instructions.utils.d;
import java.util.List;

/* loaded from: classes4.dex */
public class BottomDialog extends BaseVBBottomSheetDialog<DialogBottomBinding> {
    private DialogInterface.OnDismissListener onDismissListener;
    InstructionsType type;

    public BottomDialog(Context context, InstructionsType instructionsType) {
        super(context);
        this.type = instructionsType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$1() {
        super.dismiss();
        DialogInterface.OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        hide();
        new Handler().postDelayed(new Runnable() { // from class: com.moyoung.instructions.widgets.b
            @Override // java.lang.Runnable
            public final void run() {
                BottomDialog.this.lambda$dismiss$1();
            }
        }, 300L);
    }

    public void fillLayout(List<InstructBean> list) {
        com.moyoung.instructions.utils.c.fillLayout(((DialogBottomBinding) this.binding).llContent, list);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fillLayout(d.getInstructionBeanList(this.type));
        ((DialogBottomBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.instructions.widgets.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomDialog.this.lambda$onCreate$0(view);
            }
        });
        setMaxHeight(getWindowHeight() - com.moyoung.instructions.utils.c.dpToPx(54));
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogBottomBinding getViewBinding() {
        return DialogBottomBinding.inflate(getLayoutInflater());
    }
}
