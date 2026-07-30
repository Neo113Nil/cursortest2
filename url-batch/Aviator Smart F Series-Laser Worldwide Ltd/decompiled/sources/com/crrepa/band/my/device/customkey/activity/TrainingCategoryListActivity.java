package com.crrepa.band.my.device.customkey.activity;

import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityActionListBinding;
import com.crrepa.band.my.device.customkey.adapter.TrainingCategoryAdapter;
import com.crrepa.band.my.device.customkey.model.FeatureInfo;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TrainingCategoryListActivity extends BaseVBActivity<ActivityActionListBinding> implements OnItemClickListener {
    ActivityResultLauncher<Intent> optionIntent;
    private int trainingType;
    private final int[] trainingCategoryIconArray = {R$drawable.ic_training_01_walking, R$drawable.ic_training_08_swimming, R$drawable.ic_training_51_rock_climbing, R$drawable.ic_training_58_stair_climber, R$drawable.ic_training_81_square_dancing, R$drawable.ic_training_89_boxing, R$drawable.ic_training_100_volleyball, R$drawable.ic_training_111_ice_skating, R$drawable.ic_training_118_archery, R$drawable.ic_training_126_equestrian_sports};
    private final int[] trainingCategoryTitleArray = {R.string.sport_popular, R.string.sport_water_sports, R.string.sport_outdoor_activities, R.string.sport_trainings, R.string.options_sport_dance, R.string.sport_combat_sports, R.string.sport_ball_sports, R.string.sport_winter_sports, R.string.sport_recreational_sports, R.string.sport_other_sports};
    private final int[][] trainingDefaultTypeArray = {new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, new int[]{35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49}, new int[]{50, 51, 52, 53, 54, 55, 56, 20, 25, 29}, new int[]{57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 23, 70, 71, 72, 24, 73, 74, 75, 76, 77, 78, 26, 27, 79}, new int[]{80, 81, 82, 83, 84, 85, 86, 87}, new int[]{88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98}, new int[]{99, 100, 101, 102, 28, 103, 104, 105, 106, 107, 108, 109, 22}, new int[]{110, 111, 112, 113, 114, 115, 116, 21}, new int[]{117, 118, 119, 120, 121, 122, 123, 124}, new int[]{125, 126, 127}};
    private final int[][] trainingTypeArray = {new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1}};

    private ArrayList<FeatureInfo> getCategoryList() {
        ArrayList<FeatureInfo> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < this.trainingCategoryIconArray.length; i8++) {
            if (!isTrainingListEmpty(i8)) {
                FeatureInfo featureInfo = new FeatureInfo();
                featureInfo.setIcon(this.trainingCategoryIconArray[i8]);
                featureInfo.setTitle(this.trainingCategoryTitleArray[i8]);
                featureInfo.setFeatureType(i8);
                arrayList.add(featureInfo);
            }
        }
        return arrayList;
    }

    private void initRecyclerView() {
        TrainingCategoryAdapter trainingCategoryAdapter = new TrainingCategoryAdapter();
        ((ActivityActionListBinding) this.binding).rvList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityActionListBinding) this.binding).rvList.setAdapter(trainingCategoryAdapter);
        trainingCategoryAdapter.setOnItemClickListener(this);
        trainingCategoryAdapter.setNewData(getCategoryList());
    }

    private boolean isTrainingListEmpty(int i8) {
        int i9 = 0;
        while (true) {
            int[] iArr = this.trainingTypeArray[i8];
            if (i9 >= iArr.length) {
                return true;
            }
            if (iArr[i9] >= 0) {
                return false;
            }
            i9++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            setResult(activityResult.getResultCode(), activityResult.getData());
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        finish();
    }

    private void mergeTrainingList() {
        List<Integer> customKeyTrainingList = com.crrepa.band.my.device.customkey.util.b.getCustomKeyTrainingList();
        for (int i8 = 0; i8 < customKeyTrainingList.size(); i8++) {
            int intValue = customKeyTrainingList.get(i8).intValue();
            for (int i9 = 0; i9 < this.trainingCategoryIconArray.length; i9++) {
                int i10 = 0;
                while (true) {
                    int[] iArr = this.trainingDefaultTypeArray[i9];
                    if (i10 >= iArr.length) {
                        break;
                    }
                    if (intValue == iArr[i10]) {
                        this.trainingTypeArray[i9][i10] = intValue;
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.trainingType = getIntent().getIntExtra(BaseParamNames.ACTION_TRAINING_TYPE, -1);
        mergeTrainingList();
        initRecyclerView();
        ((ActivityActionListBinding) this.binding).tvTitle.setText(R.string.options_title);
        this.optionIntent = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.device.customkey.activity.v
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TrainingCategoryListActivity.this.lambda$initBinding$0((ActivityResult) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityActionListBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingCategoryListActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        Intent intent = new Intent(this, (Class<?>) TrainingListActivity.class);
        ArrayList<Integer> arrayList = new ArrayList<>();
        FeatureInfo featureInfo = (FeatureInfo) baseQuickAdapter.getItem(i8);
        if (featureInfo != null) {
            for (int i9 = 0; i9 < this.trainingTypeArray[featureInfo.getFeatureType()].length; i9++) {
                if (this.trainingTypeArray[featureInfo.getFeatureType()][i9] >= 0) {
                    arrayList.add(Integer.valueOf(this.trainingTypeArray[featureInfo.getFeatureType()][i9]));
                }
            }
            intent.putIntegerArrayListExtra(BaseParamNames.DETAIL_TRAINING_LIST, arrayList);
            intent.putExtra(BaseParamNames.ACTION_TRAINING_TYPE, this.trainingType);
            intent.putExtra(BaseParamNames.ACTION_FUNCTION_TYPE, featureInfo.getFeatureType());
            this.optionIntent.launch(intent);
        }
    }
}
