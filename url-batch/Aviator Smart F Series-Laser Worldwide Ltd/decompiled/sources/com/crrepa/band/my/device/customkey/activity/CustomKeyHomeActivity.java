package com.crrepa.band.my.device.customkey.activity;

import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.text.TextUtilsCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityActionHomeBinding;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
public class CustomKeyHomeActivity extends BaseVBActivity<ActivityActionHomeBinding> implements d1.b {
    ActivityResultLauncher<Intent> launchIntent;
    c1.b presenter = new c1.b();
    public CRPCustomKeyType currentKeyType = CRPCustomKeyType.KEY_NONE;
    public byte currentGoalType = 0;
    public int currentGoalValue = 0;
    public byte currentKeyState = 0;

    private void initLaunchIntent() {
        this.launchIntent = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.device.customkey.activity.n
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                CustomKeyHomeActivity.this.lambda$initLaunchIntent$2((ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initLaunchIntent$2(ActivityResult activityResult) {
        Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        this.currentKeyType = (CRPCustomKeyType) data.getSerializableExtra(BaseParamNames.CUSTOM_KEY_TYPE);
        this.currentGoalType = data.getByteExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, (byte) 0);
        this.currentGoalValue = data.getIntExtra(BaseParamNames.CUSTOM_KEY_GOAL_VALUE, 0);
        byte byteExtra = data.getByteExtra(BaseParamNames.CUSTOM_KEY_STATE, (byte) 0);
        this.currentKeyState = byteExtra;
        CRPCustomKeyInfo cRPCustomKeyInfo = new CRPCustomKeyInfo(this.currentKeyType, byteExtra);
        cRPCustomKeyInfo.setGoalType(this.currentGoalType);
        cRPCustomKeyInfo.setGoalValue(this.currentGoalValue);
        this.presenter.renderFeature(cRPCustomKeyInfo);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cRPCustomKeyInfo);
        com.crrepa.band.my.device.customkey.util.b.saveCustomKeyFeature(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        this.launchIntent.launch(getCallIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        finish();
    }

    private void setLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityActionHomeBinding) this.binding).ivAction.getLayoutParams();
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            layoutParams.setMarginStart(com.moyoung.dafit.module.common.utils.o.dp2px(this, 52.0f));
        } else {
            layoutParams.setMarginStart(com.moyoung.dafit.module.common.utils.o.dp2px(this, 34.0f));
        }
        ((ActivityActionHomeBinding) this.binding).ivAction.setLayoutParams(layoutParams);
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityActionHomeBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityActionHomeBinding) vb).includeTitle.tvTitle, ((ActivityActionHomeBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityActionHomeBinding) this.binding).includeTitle.toolbar);
        ((ActivityActionHomeBinding) this.binding).includeTitle.tvTitle.setText(R.string.action_button_title);
        ((ActivityActionHomeBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.action_button_title);
        ((ActivityActionHomeBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    public Intent getCallIntent() {
        Intent intent = new Intent(this, (Class<?>) CustomKeyEditActivity.class);
        intent.putExtra(BaseParamNames.CUSTOM_KEY_TYPE, this.currentKeyType);
        intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, this.currentGoalType);
        intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_VALUE, this.currentGoalValue);
        intent.putExtra(BaseParamNames.CUSTOM_KEY_STATE, this.currentKeyState);
        return intent;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        initLaunchIntent();
        setSupportActionBar();
        this.presenter.setView(this);
        CRPCustomKeyInfo customKeyFeature = com.crrepa.band.my.device.customkey.util.b.getCustomKeyFeature();
        setCurrentCustomKeyInfo(customKeyFeature);
        this.presenter.renderFeature(customKeyFeature);
        setLayoutParams();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityActionHomeBinding) this.binding).btnActionEdit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomKeyHomeActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityActionHomeBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomKeyHomeActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "自定义按键首页");
    }

    @Override // d1.b
    public void renderActionDescribe(String str) {
        ((ActivityActionHomeBinding) this.binding).tvActionDescribe.setText(Html.fromHtml(str));
    }

    @Override // d1.b
    public void renderActionIcon(int i8) {
        ((ActivityActionHomeBinding) this.binding).ivAction.setImageResource(i8);
    }

    @Override // d1.b
    public void renderFeatureDescribe(String str) {
        ((ActivityActionHomeBinding) this.binding).tvFeatureDescribe.setText(str);
    }

    @Override // d1.b
    public void renderFeatureIcon(int i8) {
        ((ActivityActionHomeBinding) this.binding).ivFeature.setImageResource(i8);
    }

    @Override // d1.b
    public void renderFeaturePath(String str, String str2) {
        ((ActivityActionHomeBinding) this.binding).tvFeature.setText(str);
        if (TextUtils.isEmpty(str2)) {
            ((ActivityActionHomeBinding) this.binding).ivFeatureContinue.setVisibility(8);
            ((ActivityActionHomeBinding) this.binding).tvActionTitle.setVisibility(8);
        } else {
            ((ActivityActionHomeBinding) this.binding).ivFeatureContinue.setVisibility(0);
            ((ActivityActionHomeBinding) this.binding).tvActionTitle.setVisibility(0);
            ((ActivityActionHomeBinding) this.binding).tvActionTitle.setText(str2);
        }
    }

    @Override // d1.b
    public void renderNoneAction() {
        ((ActivityActionHomeBinding) this.binding).ivAction.setImageResource(R$drawable.ic_action_none);
        ((ActivityActionHomeBinding) this.binding).ivFeature.setImageResource(R$drawable.ic_action_none);
        ((ActivityActionHomeBinding) this.binding).ivFeatureContinue.setVisibility(8);
        ((ActivityActionHomeBinding) this.binding).tvActionTitle.setVisibility(8);
        ((ActivityActionHomeBinding) this.binding).tvFeatureDescribe.setText(R.string.action_button_none_hint);
        ((ActivityActionHomeBinding) this.binding).tvActionDescribe.setText(R.string.action_button_none_content_hint);
        ((ActivityActionHomeBinding) this.binding).tvFeature.setText(R.string.action_button_none);
    }

    @Override // d1.b
    public void setCurrentCustomKeyInfo(CRPCustomKeyInfo cRPCustomKeyInfo) {
        this.currentKeyType = cRPCustomKeyInfo.getKeyType();
        this.currentKeyState = cRPCustomKeyInfo.getState();
        this.currentGoalType = cRPCustomKeyInfo.getGoalType();
        this.currentGoalValue = cRPCustomKeyInfo.getGoalValue();
    }
}
