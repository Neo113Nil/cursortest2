package com.crrepa.band.my.training.goalsetting;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentGpsTrainingGoalBinding;
import com.crrepa.band.my.home.health.decoration.GridSpacingItemDecoration;
import com.crrepa.band.my.model.GpsTrainingGoalModel;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.adapter.GpsTrainingGoalAdapter;
import com.crrepa.band.my.training.goalsetting.TrainingGoalDialog;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.o;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseGpsTrainingGoalFragment extends BaseVBFragment<FragmentGpsTrainingGoalBinding> {
    public static final float DEFAULT_GOAL = 0.0f;
    private List<com.crrepa.band.my.training.goalsetting.widget.a> customGoalDataList;
    private GpsTrainingGoalAdapter goalAdapter;
    private int lastGoalIndex;
    RecyclerView rcvGoalList;
    private final GpsTrainingModel.GpsTrainingType trainingType;
    TextView tvGoal;
    TextView tvGoalUnit;
    protected boolean imperialSystem = BandUnitSystemProvider.isImperialSystem();
    private float selectedGoal = 0.0f;
    private boolean isCustomGoal = false;

    public BaseGpsTrainingGoalFragment(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        this.trainingType = gpsTrainingType;
    }

    private int addLastGoalTxt2List(TrainingGoalType trainingGoalType, List<com.crrepa.band.my.training.goalsetting.widget.a> list) {
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(GpsTrainingGoalActivity.getLastGoalKey(this.trainingType), null);
        int i8 = -1;
        if (string == null) {
            return -1;
        }
        String[] split = string.split("_");
        if (trainingGoalType.getValue() != Integer.parseInt(split[0])) {
            return -1;
        }
        float parseFloat = Float.parseFloat(split[1]);
        for (int i9 = 0; i9 < list.size(); i9++) {
            com.crrepa.band.my.training.goalsetting.widget.a aVar = list.get(i9);
            if (aVar.data == parseFloat) {
                String string2 = requireContext().getResources().getString(R.string.gps_exercise_goal_Last_target);
                if (TextUtils.isEmpty(aVar.description)) {
                    aVar.description = string2;
                } else {
                    aVar.description = string2 + "/" + aVar.description;
                }
                i8 = list.indexOf(aVar);
            }
        }
        return i8;
    }

    private void initGoalList() {
        this.customGoalDataList = getCustomGoalDataList();
        this.lastGoalIndex = addLastGoalTxt2List(getGoalType(), this.customGoalDataList);
        this.rcvGoalList.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.rcvGoalList.addItemDecoration(new GridSpacingItemDecoration(3, o.dp2px(requireContext(), 10.0f), false));
        GpsTrainingGoalAdapter gpsTrainingGoalAdapter = new GpsTrainingGoalAdapter();
        this.goalAdapter = gpsTrainingGoalAdapter;
        gpsTrainingGoalAdapter.setNewData(getData());
        this.rcvGoalList.setAdapter(this.goalAdapter);
        selectDefaultValue(this.goalAdapter);
        this.goalAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.training.goalsetting.c
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                BaseGpsTrainingGoalFragment.this.lambda$initGoalList$1(baseQuickAdapter, view, i8);
            }
        });
        int i8 = this.lastGoalIndex;
        if (i8 != -1) {
            setGoalValue(this.customGoalDataList.get(i8).data);
            showCustomBtnSelected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        showCustomDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGoalList$1(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        updateSelectedItem(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCustomDialog$2(int i8) {
        setGoalValue(this.customGoalDataList.get(i8).data);
        showCustomBtnSelected();
    }

    private void selectDefaultValue(GpsTrainingGoalAdapter gpsTrainingGoalAdapter) {
        int defaultSelectedPosition = getDefaultSelectedPosition();
        GpsTrainingGoalModel gpsTrainingGoalModel = gpsTrainingGoalAdapter.getData().get(defaultSelectedPosition);
        gpsTrainingGoalModel.setChecked(true);
        float value = gpsTrainingGoalModel.getValue();
        this.selectedGoal = value;
        setGoalValue(value);
        gpsTrainingGoalAdapter.notifyItemChanged(defaultSelectedPosition);
    }

    private void showCustomBtnSelected() {
        updateSelectedItem(-1);
        ((FragmentGpsTrainingGoalBinding) this.binding).tvCustom.setBackgroundResource(R.drawable.shape_gps_training_goal_custom_h);
        ((FragmentGpsTrainingGoalBinding) this.binding).tvCustom.setTextColor(getResources().getColor(R.color.white));
        this.isCustomGoal = true;
    }

    private void showCustomDialog() {
        TrainingGoalDialog trainingGoalDialog = new TrainingGoalDialog(requireActivity(), this.customGoalDataList, getUnit(), getGoalType(), this.lastGoalIndex);
        trainingGoalDialog.show();
        trainingGoalDialog.setOnDoneClickListener(new TrainingGoalDialog.b() { // from class: com.crrepa.band.my.training.goalsetting.a
            @Override // com.crrepa.band.my.training.goalsetting.TrainingGoalDialog.b
            public final void onDone(int i8) {
                BaseGpsTrainingGoalFragment.this.lambda$showCustomDialog$2(i8);
            }
        });
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void updateSelectedItem(int i8) {
        List<GpsTrainingGoalModel> data = this.goalAdapter.getData();
        int i9 = 0;
        while (i9 < data.size()) {
            GpsTrainingGoalModel gpsTrainingGoalModel = data.get(i9);
            gpsTrainingGoalModel.setChecked(i9 == i8);
            if (i9 == i8) {
                float value = gpsTrainingGoalModel.getValue();
                this.selectedGoal = value;
                setGoalValue(value);
                ((FragmentGpsTrainingGoalBinding) this.binding).tvCustom.setBackgroundResource(R.drawable.shape_gps_training_goal_custom_n);
                ((FragmentGpsTrainingGoalBinding) this.binding).tvCustom.setTextColor(getResources().getColor(R.color.assist_11_33));
                this.isCustomGoal = false;
            }
            i9++;
        }
        this.goalAdapter.notifyDataSetChanged();
    }

    public abstract List<com.crrepa.band.my.training.goalsetting.widget.a> getCustomGoalDataList();

    protected abstract List<GpsTrainingGoalModel> getData();

    protected abstract int getDefaultSelectedPosition();

    public abstract TrainingGoalType getGoalType();

    protected abstract String getGoalValue(float f8);

    public float getSelectedGoal() {
        return this.selectedGoal;
    }

    protected abstract String getUnit();

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        VB vb = this.binding;
        this.tvGoal = ((FragmentGpsTrainingGoalBinding) vb).tvGoal;
        TextView textView = ((FragmentGpsTrainingGoalBinding) vb).tvGoalUnit;
        this.tvGoalUnit = textView;
        this.rcvGoalList = ((FragmentGpsTrainingGoalBinding) vb).rcvGoalList;
        textView.setText(getUnit());
        initGoalList();
        ((FragmentGpsTrainingGoalBinding) this.binding).tvCustom.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.goalsetting.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseGpsTrainingGoalFragment.this.lambda$initBinding$0(view);
            }
        });
    }

    public boolean isCustomGoal() {
        return this.isCustomGoal;
    }

    protected void setGoalValue(float f8) {
        this.tvGoal.setText(getGoalValue(f8));
        this.selectedGoal = f8;
    }
}
