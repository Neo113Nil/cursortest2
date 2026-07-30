package com.crrepa.band.my.training;

import android.content.Context;
import android.view.View;
import com.crrepa.band.my.databinding.DialogTrainingSettingTipsFrequencyBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class TrainingSettingTipsFrequencyDialog extends BaseVBDialog<DialogTrainingSettingTipsFrequencyBinding> {
    private List<Float> distanceList;
    private a onDoneClickListener;

    public interface a {
        void onDone(float f8);
    }

    public TrainingSettingTipsFrequencyDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        int currentItemPosition = ((DialogTrainingSettingTipsFrequencyBinding) this.binding).wheelPicker.getCurrentItemPosition();
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onDone(this.distanceList.get(currentItemPosition).floatValue());
        }
        hide();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ArrayList arrayList = new ArrayList();
        this.distanceList = arrayList;
        arrayList.add(Float.valueOf(0.5f));
        this.distanceList.add(Float.valueOf(1.0f));
        this.distanceList.add(Float.valueOf(2.0f));
        this.distanceList.add(Float.valueOf(5.0f));
        this.distanceList.add(Float.valueOf(10.0f));
        ((DialogTrainingSettingTipsFrequencyBinding) this.binding).wheelPicker.setData(this.distanceList);
        ((DialogTrainingSettingTipsFrequencyBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingSettingTipsFrequencyDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogTrainingSettingTipsFrequencyBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingSettingTipsFrequencyDialog.this.lambda$initBinding$1(view);
            }
        });
    }

    public void setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
    }

    public void setSelectedDistance(float f8) {
        ((DialogTrainingSettingTipsFrequencyBinding) this.binding).wheelPicker.setSelectedItemPosition(this.distanceList.indexOf(Float.valueOf(f8)));
    }
}
