package com.crrepa.band.my.device.customkey.activity;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityActionListBinding;
import com.crrepa.band.my.device.customkey.adapter.SingleSelectionAdapter;
import com.crrepa.band.my.device.customkey.model.FeatureInfo;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FeatureListActivity extends BaseVBActivity<ActivityActionListBinding> implements OnItemClickListener {
    private int selectedType = 0;
    private ArrayList<FeatureInfo> functionList = new ArrayList<>();

    private void addBloodOxygen() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_o2);
        featureInfo.setTitle(R.string.action_button_blood_oxygen);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_BLOODOXYGEN.getValue());
        this.functionList.add(featureInfo);
    }

    private void addBloodPressure() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_bp);
        featureInfo.setTitle(R.string.action_button_blood_pressure);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_BLOODPRESSURE.getValue());
        this.functionList.add(featureInfo);
    }

    private void addExercise() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_steps);
        featureInfo.setTitle(R.string.action_button_exercise);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_TRAINING.getValue());
        this.functionList.add(featureInfo);
    }

    private void addGame() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_game);
        featureInfo.setTitle(R.string.action_button_game);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_GAMER.getValue());
        this.functionList.add(featureInfo);
    }

    private void addHearRate() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_hr);
        featureInfo.setTitle(R.string.action_button_heart_rate);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_HEARTRATE.getValue());
        this.functionList.add(featureInfo);
    }

    private void addNone() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_none);
        featureInfo.setTitle(R.string.action_button_none);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_NONE.getValue());
        this.functionList.add(featureInfo);
    }

    private void addRelaxation() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_relaxation);
        featureInfo.setTitle(R.string.action_button_relaxation);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_BREATHE.getValue());
        this.functionList.add(featureInfo);
    }

    private void addShutter() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_shutter);
        featureInfo.setTitle(R.string.action_button_shutter);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_CAMERA.getValue());
        this.functionList.add(featureInfo);
    }

    private void addStopWatch() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_stopwatch);
        featureInfo.setTitle(R.string.action_button_stopwatch);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_TIMER.getValue());
        this.functionList.add(featureInfo);
    }

    private void addStress() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_stress);
        featureInfo.setTitle(R.string.action_button_pressure);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_HRV.getValue());
        this.functionList.add(featureInfo);
    }

    private void addTimer() {
        FeatureInfo featureInfo = new FeatureInfo();
        featureInfo.setIcon(R$drawable.ic_action_timer);
        featureInfo.setFeatureType(CRPCustomKeyType.KEY_STOPWATCH.getValue());
        featureInfo.setTitle(R.string.action_button_timer);
        this.functionList.add(featureInfo);
    }

    private void initRecyclerView() {
        SingleSelectionAdapter singleSelectionAdapter = new SingleSelectionAdapter();
        ((ActivityActionListBinding) this.binding).rvList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityActionListBinding) this.binding).rvList.setAdapter(singleSelectionAdapter);
        singleSelectionAdapter.setOnItemClickListener(this);
        ArrayList<FeatureInfo> featureList = getFeatureList();
        int i8 = 0;
        while (true) {
            if (i8 >= featureList.size()) {
                break;
            }
            FeatureInfo featureInfo = featureList.get(i8);
            if (this.selectedType == featureInfo.getFeatureType()) {
                featureInfo.setSelected(true);
                break;
            }
            i8++;
        }
        singleSelectionAdapter.setNewData(featureList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    public ArrayList<FeatureInfo> getFeatureList() {
        List<CRPCustomKeyType> customKeyFeatureList = com.crrepa.band.my.device.customkey.util.b.getCustomKeyFeatureList();
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_TRAINING)) {
            addExercise();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_HEARTRATE)) {
            addHearRate();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_BLOODPRESSURE)) {
            addBloodPressure();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_BLOODOXYGEN)) {
            addBloodOxygen();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_HRV)) {
            addStress();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_CAMERA)) {
            addShutter();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_BREATHE)) {
            addRelaxation();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_STOPWATCH)) {
            addTimer();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_TIMER)) {
            addStopWatch();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_GAMER)) {
            addGame();
        }
        if (customKeyFeatureList.contains(CRPCustomKeyType.KEY_NONE)) {
            addNone();
        }
        return this.functionList;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        ((ActivityActionListBinding) this.binding).tvTitle.setText(R.string.open_title);
        this.selectedType = getIntent().getIntExtra(BaseParamNames.ACTION_FUNCTION_TYPE, CRPCustomKeyType.KEY_NONE.getValue());
        initRecyclerView();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityActionListBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeatureListActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        FeatureInfo featureInfo = (FeatureInfo) baseQuickAdapter.getItem(i8);
        if (featureInfo != null) {
            featureInfo.setSelected(true);
            baseQuickAdapter.notifyItemChanged(i8);
            Intent intent = new Intent();
            intent.putExtra(BaseParamNames.ACTION_FUNCTION_TYPE, featureInfo.getFeatureType());
            setResult(-1, intent);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "自定义按键选择页");
    }
}
