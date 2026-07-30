package com.crrepa.band.my.device.customkey.activity;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.my.databinding.ActivityActionListBinding;
import com.crrepa.band.my.device.customkey.adapter.SingleSelectionAdapter;
import com.crrepa.band.my.device.customkey.model.FeatureInfo;
import com.crrepa.band.my.device.customkey.model.OptionTrainingType;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TrainingListActivity extends BaseVBActivity<ActivityActionListBinding> implements OnItemClickListener {
    private int selectedType;
    private ArrayList<Integer> trainingList = new ArrayList<>();
    private int trainingType;

    private ArrayList<FeatureInfo> getTrainingList() {
        ArrayList<FeatureInfo> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < this.trainingList.size(); i8++) {
            int intValue = this.trainingList.get(i8).intValue();
            FeatureInfo featureInfo = new FeatureInfo();
            int trainingIconId = com.crrepa.band.my.training.utils.q.getTrainingIconId(this, intValue);
            String trainingName = com.crrepa.band.my.training.utils.q.getTrainingName(this, intValue);
            featureInfo.setIcon(trainingIconId);
            featureInfo.setName(com.crrepa.band.my.device.customkey.util.a.capitalize(trainingName));
            arrayList.add(featureInfo);
        }
        return arrayList;
    }

    private void initRecyclerView() {
        SingleSelectionAdapter singleSelectionAdapter = new SingleSelectionAdapter();
        ((ActivityActionListBinding) this.binding).rvList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityActionListBinding) this.binding).rvList.setAdapter(singleSelectionAdapter);
        singleSelectionAdapter.setOnItemClickListener(this);
        ArrayList<FeatureInfo> trainingList = getTrainingList();
        int i8 = 0;
        while (true) {
            if (i8 >= trainingList.size()) {
                break;
            }
            if (this.trainingType == this.trainingList.get(i8).intValue()) {
                trainingList.get(i8).setSelected(true);
                break;
            }
            i8++;
        }
        singleSelectionAdapter.setNewData(trainingList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        setResult(0);
        finish();
    }

    private void setTitle() {
        OptionTrainingType[] values = OptionTrainingType.values();
        for (int i8 = 0; i8 < values.length; i8++) {
            if (this.selectedType == i8) {
                ((ActivityActionListBinding) this.binding).tvTitle.setText(values[i8].getName());
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.trainingType = getIntent().getIntExtra(BaseParamNames.ACTION_TRAINING_TYPE, -1);
        this.selectedType = getIntent().getIntExtra(BaseParamNames.ACTION_FUNCTION_TYPE, CRPCustomKeyType.KEY_NONE.getValue());
        this.trainingList = getIntent().getIntegerArrayListExtra(BaseParamNames.DETAIL_TRAINING_LIST);
        initRecyclerView();
        setTitle();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityActionListBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingListActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        FeatureInfo featureInfo = (FeatureInfo) baseQuickAdapter.getItem(i8);
        if (featureInfo != null) {
            featureInfo.setSelected(true);
        }
        baseQuickAdapter.notifyItemChanged(i8);
        Intent intent = new Intent();
        intent.putExtra(BaseParamNames.ACTION_TRAINING_TYPE, this.trainingList.get(i8));
        setResult(-1, intent);
        finish();
    }
}
