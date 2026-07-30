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
import com.crrepa.band.my.databinding.ActivityActionListBinding;
import com.crrepa.band.my.device.customkey.adapter.ActionAdapter;
import com.crrepa.band.my.device.customkey.model.ActionInfo;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ActionListActivity extends BaseVBActivity<ActivityActionListBinding> implements OnItemClickListener {
    ActivityResultLauncher<Intent> goalIntent;
    public CRPCustomKeyType keyType = CRPCustomKeyType.KEY_NONE;
    public byte keyState = 0;
    public byte goalType = 0;
    ActionAdapter adapter = new ActionAdapter();

    private void initRecyclerView() {
        ((ActivityActionListBinding) this.binding).rvList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityActionListBinding) this.binding).rvList.setAdapter(this.adapter);
        this.adapter.setOnItemClickListener(this);
        com.orhanobut.logger.f.d("keyType: " + this.keyType);
        com.orhanobut.logger.f.d("keyType: " + ((int) this.keyState));
        com.orhanobut.logger.f.d("goalType: " + ((int) this.goalType));
        ArrayList<ActionInfo> actionList = com.crrepa.band.my.device.customkey.util.a.getActionList(this.keyType, this.keyState);
        CRPCustomKeyType cRPCustomKeyType = this.keyType;
        CRPCustomKeyType cRPCustomKeyType2 = CRPCustomKeyType.KEY_TRAINING;
        if (cRPCustomKeyType == cRPCustomKeyType2) {
            int size = actionList.size();
            byte b8 = this.goalType;
            if (size > b8) {
                actionList.get(b8).setSelected(true);
            }
        }
        if (this.keyType != cRPCustomKeyType2) {
            int size2 = actionList.size();
            byte b9 = this.keyState;
            if (size2 > b9) {
                actionList.get(b9).setSelected(true);
            }
        }
        this.adapter.setNewData(actionList);
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

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        ((ActivityActionListBinding) this.binding).tvTitle.setText(R.string.action_title);
        this.keyType = (CRPCustomKeyType) getIntent().getSerializableExtra(BaseParamNames.CUSTOM_KEY_TYPE);
        this.keyState = getIntent().getByteExtra(BaseParamNames.CUSTOM_KEY_STATE, (byte) 0);
        this.goalType = getIntent().getByteExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, (byte) 0);
        initRecyclerView();
        this.goalIntent = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.device.customkey.activity.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActionListActivity.this.lambda$initBinding$0((ActivityResult) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityActionListBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActionListActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        ActionInfo actionInfo = (ActionInfo) baseQuickAdapter.getItem(i8);
        com.orhanobut.logger.f.d("onItemClick actionInfo: " + actionInfo);
        if (actionInfo != null) {
            if (!actionInfo.isHasGoal()) {
                actionInfo.setSelected(true);
                baseQuickAdapter.notifyItemChanged(i8);
                Intent intent = new Intent();
                intent.putExtra(BaseParamNames.ACTION_DESCRIBE, actionInfo.getDescribe());
                if (this.keyType == CRPCustomKeyType.KEY_TRAINING) {
                    intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, actionInfo.getActionIndex());
                } else {
                    intent.putExtra(BaseParamNames.CUSTOM_KEY_STATE, actionInfo.getActionIndex());
                }
                setResult(-1, intent);
                finish();
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) GoalSettingActivity.class);
            intent2.putExtra(BaseParamNames.CUSTOM_KEY_TYPE, this.keyType);
            intent2.putExtra(BaseParamNames.ACTION_DESCRIBE, actionInfo.getDescribe());
            CRPCustomKeyType cRPCustomKeyType = this.keyType;
            if (cRPCustomKeyType == CRPCustomKeyType.KEY_BREATHE) {
                intent2.putExtra(BaseParamNames.CUSTOM_KEY_STATE, actionInfo.getActionIndex());
            } else if (cRPCustomKeyType == CRPCustomKeyType.KEY_TRAINING) {
                intent2.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, actionInfo.getActionIndex());
            } else {
                intent2.putExtra(BaseParamNames.CUSTOM_KEY_STATE, actionInfo.getActionIndex());
            }
            this.goalIntent.launch(intent2);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "自定义按键行动页");
    }
}
