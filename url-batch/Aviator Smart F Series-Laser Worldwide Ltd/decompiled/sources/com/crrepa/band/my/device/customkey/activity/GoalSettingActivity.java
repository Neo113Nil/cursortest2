package com.crrepa.band.my.device.customkey.activity;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.text.TextUtilsCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityActionGoalSettingBinding;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GoalSettingActivity extends BaseVBActivity<ActivityActionGoalSettingBinding> {
    public CRPCustomKeyType currentKeyType = CRPCustomKeyType.KEY_NONE;
    public byte goalType = 0;
    public byte keyState = 1;
    int hourPosition = 0;
    int minutePosition = 0;
    int secondsPosition = 0;

    private void initView() {
        if (this.currentKeyType == CRPCustomKeyType.KEY_STOPWATCH) {
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalSecond.setVisibility(0);
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalInfo.setData(com.crrepa.band.my.device.customkey.util.c.getTimerHourList());
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalUnit.setData(com.crrepa.band.my.device.customkey.util.c.getTimerMinuteList());
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalSecond.setData(com.crrepa.band.my.device.customkey.util.c.getTimerSecondList());
            renderBtnDone();
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalInfo.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.crrepa.band.my.device.customkey.activity.p
                @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
                public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                    GoalSettingActivity.this.lambda$initView$1(wheelPicker, obj, i8);
                }
            });
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalUnit.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.crrepa.band.my.device.customkey.activity.q
                @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
                public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                    GoalSettingActivity.this.lambda$initView$2(wheelPicker, obj, i8);
                }
            });
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalSecond.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.crrepa.band.my.device.customkey.activity.r
                @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
                public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                    GoalSettingActivity.this.lambda$initView$3(wheelPicker, obj, i8);
                }
            });
            return;
        }
        ((ActivityActionGoalSettingBinding) this.binding).wpGoalSecond.setVisibility(8);
        ((ActivityActionGoalSettingBinding) this.binding).wpGoalInfo.setData(com.crrepa.band.my.device.customkey.util.c.getGoalValueList(this.currentKeyType, this.goalType));
        ((ActivityActionGoalSettingBinding) this.binding).wpGoalUnit.setData(com.crrepa.band.my.device.customkey.util.c.getGoalUnitList(this.currentKeyType, this.goalType));
        ((ActivityActionGoalSettingBinding) this.binding).wpGoalUnit.setOnTouchListener(new View.OnTouchListener() { // from class: com.crrepa.band.my.device.customkey.activity.s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initView$4;
                lambda$initView$4 = GoalSettingActivity.lambda$initView$4(view, motionEvent);
                return lambda$initView$4;
            }
        });
        ((ActivityActionGoalSettingBinding) this.binding).wpGoalUnit.setItemTextSize(com.moyoung.dafit.module.common.utils.o.dp2px(this, 14.0f));
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalInfo.setItemAlign(1);
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalUnit.setItemAlign(2);
        } else {
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalInfo.setItemAlign(2);
            ((ActivityActionGoalSettingBinding) this.binding).wpGoalUnit.setItemAlign(1);
        }
    }

    private boolean isBtnDoneEnable() {
        return (this.hourPosition + this.minutePosition) + this.secondsPosition != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(WheelPicker wheelPicker, Object obj, int i8) {
        this.hourPosition = i8;
        renderBtnDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(WheelPicker wheelPicker, Object obj, int i8) {
        this.minutePosition = i8;
        renderBtnDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$3(WheelPicker wheelPicker, Object obj, int i8) {
        this.secondsPosition = i8;
        renderBtnDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$initView$4(View view, MotionEvent motionEvent) {
        return true;
    }

    private void renderBtnDone() {
        if (isBtnDoneEnable()) {
            ((ActivityActionGoalSettingBinding) this.binding).tvDone.setEnabled(true);
            ((ActivityActionGoalSettingBinding) this.binding).tvDone.setTextColor(ContextCompat.getColor(this, R.color.main));
        } else {
            ((ActivityActionGoalSettingBinding) this.binding).tvDone.setEnabled(false);
            ((ActivityActionGoalSettingBinding) this.binding).tvDone.setTextColor(ContextCompat.getColor(this, R.color.grey));
        }
    }

    private void setTitle() {
        CRPCustomKeyType cRPCustomKeyType = this.currentKeyType;
        if (cRPCustomKeyType == CRPCustomKeyType.KEY_STOPWATCH || cRPCustomKeyType == CRPCustomKeyType.KEY_BREATHE) {
            ((ActivityActionGoalSettingBinding) this.binding).tvTitle.setText(R.string.action_button_setting_time_nav_title);
        } else {
            byte b8 = this.goalType;
            ((ActivityActionGoalSettingBinding) this.binding).tvTitle.setText(getString(R.string.action_button_time_goal_nav_title, b8 == 0 ? getString(R.string.total_run_time) : b8 == 1 ? getString(R.string.goal_type_calories) : b8 == 2 ? com.crrepa.band.my.device.customkey.util.a.capitalize(getString(R.string.gps_training_goal_set_distance_title)) : ""));
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.currentKeyType = (CRPCustomKeyType) getIntent().getSerializableExtra(BaseParamNames.CUSTOM_KEY_TYPE);
        this.goalType = getIntent().getByteExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, (byte) 0);
        this.keyState = getIntent().getByteExtra(BaseParamNames.CUSTOM_KEY_STATE, (byte) 0);
        initView();
        setTitle();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityActionGoalSettingBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalSettingActivity.this.onDoneBtnClicked(view);
            }
        });
        ((ActivityActionGoalSettingBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.customkey.activity.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalSettingActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    public void onDoneBtnClicked(View view) {
        Intent intent = new Intent();
        if (this.currentKeyType == CRPCustomKeyType.KEY_STOPWATCH) {
            String str = (String) ((ActivityActionGoalSettingBinding) this.binding).wpGoalInfo.getData().get(this.hourPosition);
            String str2 = (String) ((ActivityActionGoalSettingBinding) this.binding).wpGoalUnit.getData().get(this.minutePosition);
            String str3 = (String) ((ActivityActionGoalSettingBinding) this.binding).wpGoalSecond.getData().get(this.secondsPosition);
            intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, Byte.parseByte(str));
            intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_VALUE, (Integer.parseInt(str2) * 60) + Integer.parseInt(str3));
            intent.putExtra(BaseParamNames.CUSTOM_KEY_STATE, getIntent().getByteExtra(BaseParamNames.CUSTOM_KEY_STATE, (byte) 0));
        } else {
            String str4 = (String) ((ActivityActionGoalSettingBinding) this.binding).wpGoalInfo.getData().get(((ActivityActionGoalSettingBinding) this.binding).wpGoalInfo.getCurrentItemPosition());
            if (this.currentKeyType == CRPCustomKeyType.KEY_BREATHE) {
                intent.putExtra(BaseParamNames.CUSTOM_KEY_STATE, getIntent().getByteExtra(BaseParamNames.CUSTOM_KEY_STATE, (byte) 0));
                intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, Byte.parseByte(str4));
            } else {
                intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_TYPE, this.goalType);
                intent.putExtra(BaseParamNames.CUSTOM_KEY_GOAL_VALUE, Integer.parseInt(str4));
            }
        }
        intent.putExtra(BaseParamNames.ACTION_DESCRIBE, getIntent().getStringExtra(BaseParamNames.ACTION_DESCRIBE));
        setResult(-1, intent);
        finish();
    }
}
