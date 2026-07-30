package com.crrepa.band.my.training.map;

import android.content.Context;
import android.view.View;
import com.crrepa.band.my.databinding.DialogTrainingPathShareBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;

/* loaded from: classes3.dex */
public class TrainingPathShareDialog extends BaseVBBottomSheetDialog<DialogTrainingPathShareBinding> {
    private a onDoneClickListener;

    public interface a {
        void onStravaClick();
    }

    public TrainingPathShareDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onStravaClick();
        }
        dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
        ((DialogTrainingPathShareBinding) this.binding).ivStrava.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingPathShareDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    public void setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogTrainingPathShareBinding getViewBinding() {
        return DialogTrainingPathShareBinding.inflate(getLayoutInflater());
    }
}
