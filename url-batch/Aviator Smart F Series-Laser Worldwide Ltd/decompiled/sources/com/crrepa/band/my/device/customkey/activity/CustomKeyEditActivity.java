package com.crrepa.band.my.device.customkey.activity;

import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityActionEditBinding;
import com.crrepa.band.my.health.widgets.dialog.j;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class CustomKeyEditActivity extends BaseVBActivity<ActivityActionEditBinding> implements d1.a {
    ActivityResultLauncher<Intent> actionIntent;
    private com.crrepa.band.my.health.widgets.dialog.j dialog;
    ActivityResultLauncher<Intent> openIntent;
    ActivityResultLauncher<Intent> optionIntent;
    private boolean success;
    c1.a presenter = new c1.a();
    public int currentTrainingType = -1;
    public String currentActionDescribe = "";
    public CRPCustomKeyType currentKeyType = CRPCustomKeyType.KEY_NONE;
    public byte currentGoalType = 0;
    public int currentGoalValue = 0;
    public byte currentKeyState = 0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType;

        static {
            int[] iArr = new int[CRPCustomKeyType.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType = iArr;
            try {
                iArr[CRPCustomKeyType.KEY_HEARTRATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_BLOODPRESSURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_BLOODOXYGEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_HRV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void getCustomKeyInfoFromIntent() {
        this.currentKeyType = (CRPCustomKeyType) getIntent().getSerializableExtra(BaseParamNames.CUSTOM_KEY_TYPE);
        this.currentGoalType = getIntent().getByteExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, (byte) 0);
        this.currentGoalValue = getIntent().getIntExtra(BaseParamNames.CUSTOM_KEY_GOAL_VALUE, 0);
        byte byteExtra = getIntent().getByteExtra(BaseParamNames.CUSTOM_KEY_STATE, (byte) 0);
        this.currentKeyState = byteExtra;
        CRPCustomKeyType cRPCustomKeyType = this.currentKeyType;
        if (cRPCustomKeyType == CRPCustomKeyType.KEY_TRAINING) {
            this.currentTrainingType = byteExtra;
        }
        this.currentActionDescribe = com.crrepa.band.my.device.customkey.util.a.getActionDescribe(cRPCustomKeyType, this.currentGoalType, byteExtra);
    }

    private void initLaunchIntent() {
        this.openIntent = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.device.customkey.activity.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                CustomKeyEditActivity.this.lambda$initLaunchIntent$1((ActivityResult) obj);
            }
        });
        this.optionIntent = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.device.customkey.activity.d
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                CustomKeyEditActivity.this.lambda$initLaunchIntent$2((ActivityResult) obj);
            }
        });
        this.actionIntent = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.device.customkey.activity.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                CustomKeyEditActivity.this.lambda$initLaunchIntent$3((ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initLaunchIntent$1(ActivityResult activityResult) {
        Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        CRPCustomKeyType cRPCustomKeyType = CRPCustomKeyType.getInstance((byte) data.getIntExtra(BaseParamNames.ACTION_FUNCTION_TYPE, CRPCustomKeyType.KEY_NONE.getValue()));
        this.currentKeyType = cRPCustomKeyType;
        if (cRPCustomKeyType == CRPCustomKeyType.KEY_TRAINING) {
            this.currentGoalType = (byte) 3;
        } else if (cRPCustomKeyType == CRPCustomKeyType.KEY_BREATHE) {
            this.currentGoalType = (byte) 1;
        } else {
            this.currentGoalType = (byte) 0;
        }
        this.currentGoalValue = 0;
        this.currentKeyState = (byte) 0;
        this.currentTrainingType = 0;
        this.currentActionDescribe = com.crrepa.band.my.device.customkey.util.a.getActionDescribe(cRPCustomKeyType, this.currentGoalType, (byte) 0);
        renderFunction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initLaunchIntent$2(ActivityResult activityResult) {
        Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        int intExtra = data.getIntExtra(BaseParamNames.ACTION_TRAINING_TYPE, 0);
        this.currentTrainingType = intExtra;
        byte b8 = (byte) intExtra;
        this.currentKeyState = b8;
        this.currentGoalType = (byte) 3;
        this.currentActionDescribe = com.crrepa.band.my.device.customkey.util.a.getActionDescribe(this.currentKeyType, (byte) 3, b8);
        renderOption();
        renderAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initLaunchIntent$3(ActivityResult activityResult) {
        Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        this.currentActionDescribe = data.getStringExtra(BaseParamNames.ACTION_DESCRIBE);
        this.currentGoalType = data.getByteExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, (byte) 0);
        this.currentGoalValue = data.getIntExtra(BaseParamNames.CUSTOM_KEY_GOAL_VALUE, 0);
        if (this.currentKeyType != CRPCustomKeyType.KEY_TRAINING) {
            this.currentKeyState = data.getByteExtra(BaseParamNames.CUSTOM_KEY_STATE, (byte) 0);
        }
        com.orhanobut.logger.f.d("currentGoalType: " + ((int) this.currentGoalType));
        com.orhanobut.logger.f.d("currentGoalValue: " + this.currentGoalValue);
        com.orhanobut.logger.f.d("currentKeyState: " + ((int) this.currentKeyState));
        renderAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActionAddBtnClicked$4() {
        if (this.success) {
            Intent intent = new Intent();
            intent.putExtra(BaseParamNames.CUSTOM_KEY_TYPE, this.currentKeyType);
            intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, this.currentGoalType);
            intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_VALUE, this.currentGoalValue);
            intent.putExtra(BaseParamNames.CUSTOM_KEY_STATE, this.currentKeyState);
            setResult(-1, intent);
            finish();
        }
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityActionEditBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityActionEditBinding) vb).includeTitle.tvTitle, ((ActivityActionEditBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityActionEditBinding) this.binding).includeTitle.toolbar);
        ((ActivityActionEditBinding) this.binding).includeTitle.tvTitle.setText(R.string.action_button_edit_title);
        ((ActivityActionEditBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.action_button_edit_title);
        ((ActivityActionEditBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        setSupportActionBar();
        initLaunchIntent();
        getCustomKeyInfoFromIntent();
        renderFunction();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityActionEditBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomKeyEditActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityActionEditBinding) this.binding).rlOpen.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomKeyEditActivity.this.onOpenClicked(view);
            }
        });
        ((ActivityActionEditBinding) this.binding).rlOption.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomKeyEditActivity.this.onOptionClicked(view);
            }
        });
        ((ActivityActionEditBinding) this.binding).rlAction.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomKeyEditActivity.this.onActionClicked(view);
            }
        });
        ((ActivityActionEditBinding) this.binding).btnActionAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomKeyEditActivity.this.onActionAddBtnClicked(view);
            }
        });
    }

    public void onActionAddBtnClicked(View view) {
        int i8 = a.$SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[this.currentKeyType.ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4) {
            this.currentKeyState = (byte) 1;
        }
        CRPCustomKeyInfo cRPCustomKeyInfo = new CRPCustomKeyInfo(this.currentKeyType, this.currentKeyState);
        cRPCustomKeyInfo.setGoalValue(this.currentGoalValue);
        cRPCustomKeyInfo.setGoalType(this.currentGoalType);
        com.crrepa.band.my.health.widgets.dialog.j jVar = new com.crrepa.band.my.health.widgets.dialog.j(this);
        this.dialog = jVar;
        jVar.setOnDoneListener(new j.c() { // from class: com.crrepa.band.my.device.customkey.activity.k
            @Override // com.crrepa.band.my.health.widgets.dialog.j.c
            public final void onDone() {
                CustomKeyEditActivity.this.lambda$onActionAddBtnClicked$4();
            }
        });
        this.dialog.show();
        this.dialog.loading(R.string.action_button_uploading_content);
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            i4.getInstance().sendCustomKey(cRPCustomKeyInfo);
        } else {
            renderLoadingDialogError();
        }
    }

    public void onActionClicked(View view) {
        Intent intent = new Intent(this, (Class<?>) ActionListActivity.class);
        intent.putExtra(BaseParamNames.CUSTOM_KEY_TYPE, this.currentKeyType);
        intent.putExtra(BaseParamNames.CUSTOM_KEY_STATE, this.currentKeyState);
        intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, this.currentGoalType);
        this.actionIntent.launch(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void onOpenClicked(View view) {
        Intent intent = new Intent(this, (Class<?>) FeatureListActivity.class);
        intent.putExtra(BaseParamNames.ACTION_FUNCTION_TYPE, (int) this.currentKeyType.getValue());
        this.openIntent.launch(intent);
    }

    public void onOptionClicked(View view) {
        Intent intent = new Intent(this, (Class<?>) TrainingCategoryListActivity.class);
        intent.putExtra(BaseParamNames.ACTION_TRAINING_TYPE, this.currentTrainingType);
        this.optionIntent.launch(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "自定义按键编辑页");
    }

    @Override // d1.a
    public void renderAction() {
        CRPCustomKeyInfo cRPCustomKeyInfo = new CRPCustomKeyInfo(this.currentKeyType, this.currentKeyState);
        cRPCustomKeyInfo.setGoalType(this.currentGoalType);
        cRPCustomKeyInfo.setGoalValue(this.currentGoalValue);
        ((ActivityActionEditBinding) this.binding).tvActionValue.setText(this.currentActionDescribe);
        ((ActivityActionEditBinding) this.binding).tvActionGoal.setText(com.crrepa.band.my.device.customkey.util.c.getGoalStr(cRPCustomKeyInfo));
    }

    @Override // d1.a
    public void renderActionViewGone() {
        ((ActivityActionEditBinding) this.binding).tvActionTitle.setVisibility(8);
        ((ActivityActionEditBinding) this.binding).rlAction.setVisibility(8);
    }

    @Override // d1.a
    public void renderActionViewVisible() {
        ((ActivityActionEditBinding) this.binding).tvActionTitle.setVisibility(0);
        ((ActivityActionEditBinding) this.binding).rlAction.setVisibility(0);
    }

    @Override // d1.a
    public void renderFunction() {
        ((ActivityActionEditBinding) this.binding).tvOpenValue.setText(com.crrepa.band.my.device.customkey.util.c.getCustomKeyFeatureTitle(this.currentKeyType));
        ((ActivityActionEditBinding) this.binding).ivOpenValue.setImageResource(com.crrepa.band.my.device.customkey.util.c.getCustomKeyDrawable(this.currentKeyType));
        if (this.currentKeyType == CRPCustomKeyType.KEY_NONE) {
            renderActionViewGone();
            renderOptionsViewGone();
            return;
        }
        renderActionViewVisible();
        renderAction();
        if (this.currentKeyType != CRPCustomKeyType.KEY_TRAINING) {
            renderOptionsViewGone();
        } else {
            renderOptionsViewVisible();
            renderOption();
        }
    }

    @Override // d1.a
    public void renderLoadingDialogComplete() {
        this.success = true;
        com.crrepa.band.my.health.widgets.dialog.j jVar = this.dialog;
        if (jVar != null) {
            jVar.complete(R.string.action_button_add_success_content);
        }
    }

    @Override // d1.a
    public void renderLoadingDialogError() {
        this.success = false;
        com.crrepa.band.my.health.widgets.dialog.j jVar = this.dialog;
        if (jVar != null) {
            jVar.error(R.string.action_button_add_fail_content);
        }
    }

    @Override // d1.a
    public void renderOption() {
        int i8 = this.currentTrainingType;
        if (i8 != -1) {
            int trainingIconId = com.crrepa.band.my.training.utils.q.getTrainingIconId(this, i8);
            ((ActivityActionEditBinding) this.binding).tvOptionValue.setText(com.crrepa.band.my.device.customkey.util.a.capitalize(com.crrepa.band.my.training.utils.q.getTrainingName(this, this.currentTrainingType)));
            ((ActivityActionEditBinding) this.binding).ivOptionValue.setImageResource(trainingIconId);
        }
    }

    @Override // d1.a
    public void renderOptionsViewGone() {
        ((ActivityActionEditBinding) this.binding).tvOptionTitle.setVisibility(8);
        ((ActivityActionEditBinding) this.binding).rlOption.setVisibility(8);
    }

    @Override // d1.a
    public void renderOptionsViewVisible() {
        ((ActivityActionEditBinding) this.binding).tvOptionTitle.setVisibility(0);
        ((ActivityActionEditBinding) this.binding).rlOption.setVisibility(0);
    }
}
