package com.crrepa.band.my.training.goalsetting;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogTrainingGoalBinding;
import com.crrepa.band.my.training.goalsetting.widget.PickerLayoutManager;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.crrepa.band.my.training.utils.k;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;
import com.moyoung.dafit.module.common.utils.n;
import java.util.List;

/* loaded from: classes3.dex */
public class TrainingGoalDialog extends BaseVBBottomSheetDialog<DialogTrainingGoalBinding> {
    private static final int spaceIndex = 3;
    private final List<com.crrepa.band.my.training.goalsetting.widget.a> dataList;
    private final TrainingGoalType goalType;
    private final String goalUnit;
    private b onDoneClickListener;
    private int selectedPosition;

    class a implements PickerLayoutManager.a {
        a() {
        }

        @Override // com.crrepa.band.my.training.goalsetting.widget.PickerLayoutManager.a
        public void onScrollMidView(View view, boolean z7) {
            TextView textView = (TextView) view.findViewById(R.id.tv_content);
            if (z7) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
                textView.setTextColor(TrainingGoalDialog.this.getContext().getResources().getColor(R.color.assist_13_00));
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
                textView.setTextColor(TrainingGoalDialog.this.getContext().getResources().getColor(R.color.assist_6_C4));
            }
        }

        @Override // com.crrepa.band.my.training.goalsetting.widget.PickerLayoutManager.a
        public void onSelectedView(View view, int i8, int i9) {
            ((DialogTrainingGoalBinding) ((BaseVBBottomSheetDialog) TrainingGoalDialog.this).binding).tvGoal.setText(TrainingGoalDialog.getGoalByType(((com.crrepa.band.my.training.goalsetting.widget.a) TrainingGoalDialog.this.dataList.get(i8)).data, TrainingGoalDialog.this.goalType));
            TrainingGoalDialog.this.selectedPosition = i8;
        }
    }

    public interface b {
        void onDone(int i8);
    }

    public TrainingGoalDialog(Context context, List<com.crrepa.band.my.training.goalsetting.widget.a> list, String str, TrainingGoalType trainingGoalType, int i8) {
        super(context);
        this.dataList = list;
        this.goalUnit = str;
        this.goalType = trainingGoalType;
        this.selectedPosition = i8 == -1 ? 3 : i8;
        showData();
    }

    public static String getGoalByType(float f8, TrainingGoalType trainingGoalType) {
        if (trainingGoalType == TrainingGoalType.DISTANCE) {
            return String.valueOf(f8);
        }
        if (trainingGoalType != TrainingGoalType.TIME) {
            return trainingGoalType == TrainingGoalType.PACE ? k.getPaceStr(f8) : n.format(f8, n.TWO_INTEGERS_PATTERN);
        }
        return n.format((int) (f8 / 60.0f), n.TWO_INTEGERS_PATTERN) + ":" + n.format((int) (f8 % 60.0f), n.TWO_INTEGERS_PATTERN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        b bVar = this.onDoneClickListener;
        if (bVar != null) {
            bVar.onDone(this.selectedPosition);
        }
        dismiss();
    }

    private void showData() {
        ((DialogTrainingGoalBinding) this.binding).tvGoalUnit.setText(this.goalUnit);
        ((DialogTrainingGoalBinding) this.binding).tvGoal.setText(getGoalByType(this.dataList.get(this.selectedPosition).data, this.goalType));
        ((DialogTrainingGoalBinding) this.binding).rvPicker.setAdapter(new TrainingGoalPickAdapter(this.dataList, this.goalType));
        PickerLayoutManager create = PickerLayoutManager.create(((DialogTrainingGoalBinding) this.binding).rvPicker);
        create.setOnSelectedViewListener(new a());
        int i8 = this.selectedPosition - 3;
        if (i8 < 0) {
            i8 = 0;
        }
        create.scrollToPosition(i8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
        ((DialogTrainingGoalBinding) this.binding).btnDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.goalsetting.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingGoalDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    public void setOnDoneClickListener(b bVar) {
        this.onDoneClickListener = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogTrainingGoalBinding getViewBinding() {
        return DialogTrainingGoalBinding.inflate(getLayoutInflater());
    }
}
