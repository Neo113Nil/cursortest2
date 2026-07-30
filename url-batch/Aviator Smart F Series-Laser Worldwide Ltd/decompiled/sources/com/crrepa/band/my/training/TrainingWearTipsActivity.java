package com.crrepa.band.my.training;

import android.view.View;
import com.crrepa.band.my.databinding.ActivityTrainingWearTipsBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes3.dex */
public class TrainingWearTipsActivity extends BaseVBActivity<ActivityTrainingWearTipsBinding> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        ((ActivityTrainingWearTipsBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingWearTipsActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityTrainingWearTipsBinding) this.binding).btnOk.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingWearTipsActivity.this.lambda$initBinding$1(view);
            }
        });
    }
}
