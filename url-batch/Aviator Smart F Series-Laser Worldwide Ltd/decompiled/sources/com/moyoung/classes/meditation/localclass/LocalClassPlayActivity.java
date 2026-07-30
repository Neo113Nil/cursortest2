package com.moyoung.classes.meditation.localclass;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$raw;
import com.moyoung.classes.R$string;
import com.moyoung.classes.databinding.ActivityMeditationLocalClassPlayBinding;
import com.moyoung.classes.meditation.localclass.LocalClassPlayActivity;
import com.moyoung.classes.meditation.localclass.WhiteNoiseDialog;
import com.moyoung.classes.meditation.localclass.model.LocalClassBean;
import com.moyoung.classes.meditation.localclass.model.MeditationLocalModel;
import com.moyoung.classes.meditation.localclass.model.WhiteNoiseBean;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.y0;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class LocalClassPlayActivity extends BaseVBActivity<ActivityMeditationLocalClassPlayBinding> {
    private LocalClassBean.ActionMsg.ActionType actionType;
    private com.moyoung.classes.meditation.c audioPlayerUI;
    private Integer classDuration;
    private int classPlayedSecond;
    private Timer classTimer;
    private LocalClassBean localClassBean;
    private WhiteNoiseDialog noiseDialog;
    private WhiteNoiseBean whiteNoiseBean;
    private Integer whiteNoiseId;
    private float blurRadius = 0.0f;
    private boolean isClassPaused = false;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ((ActivityMeditationLocalClassPlayBinding) ((BaseVBActivity) LocalClassPlayActivity.this).binding).llCountDown.setVisibility(8);
            LocalClassPlayActivity.this.playClass();
        }
    }

    class b extends TimerTask {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            LocalClassPlayActivity.this.classFinished(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1() {
            LocalClassPlayActivity.this.audioPlayerUI.setVolumeFadeOut();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (LocalClassPlayActivity.this.isClassPaused) {
                return;
            }
            LocalClassPlayActivity.access$108(LocalClassPlayActivity.this);
            if (LocalClassPlayActivity.this.classPlayedSecond >= LocalClassPlayActivity.this.classDuration.intValue() * 60) {
                new Handler(LocalClassPlayActivity.this.getMainLooper()).post(new Runnable() { // from class: com.moyoung.classes.meditation.localclass.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalClassPlayActivity.b.this.lambda$run$0();
                    }
                });
            }
            if ((LocalClassPlayActivity.this.classDuration.intValue() * 60) - LocalClassPlayActivity.this.classPlayedSecond == 2) {
                new Handler(LocalClassPlayActivity.this.getMainLooper()).post(new Runnable() { // from class: com.moyoung.classes.meditation.localclass.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalClassPlayActivity.b.this.lambda$run$1();
                    }
                });
            }
        }
    }

    static /* synthetic */ int access$108(LocalClassPlayActivity localClassPlayActivity) {
        int i8 = localClassPlayActivity.classPlayedSecond;
        localClassPlayActivity.classPlayedSecond = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void classFinished(boolean z7) {
        if (this.classPlayedSecond < 60) {
            r0.showShort(getApplicationContext(), R$string.meditation_local_class_unfinished);
            finish();
            return;
        }
        int intValue = this.classDuration.intValue();
        if (z7) {
            int i8 = this.classPlayedSecond;
            intValue = i8 % 60 > 30 ? (i8 / 60) + 1 : i8 / 60;
        }
        LocalClassDoneActivity.start(this, this.localClassBean, this.whiteNoiseId.intValue(), this.classDuration.intValue(), intValue);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvBreathTimes.setVisibility(8);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).rlPicker.setVisibility(8);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvWhiteNoise.setVisibility(4);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvStart.setVisibility(8);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).llCountDown.setVisibility(0);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).animCountDown.setAnimation(R$raw.anim_count_down);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).animCountDown.playAnimation();
        ((ActivityMeditationLocalClassPlayBinding) this.binding).animCountDown.addAnimatorListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        classFinished(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(int i8) {
        this.whiteNoiseId = Integer.valueOf(i8);
        updateWhiteNoiseUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(DialogInterface dialogInterface) {
        this.noiseDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$5(View view) {
        WhiteNoiseDialog whiteNoiseDialog = new WhiteNoiseDialog(this);
        this.noiseDialog = whiteNoiseDialog;
        whiteNoiseDialog.setWhiteNoiseList(MeditationLocalModel.getWhiteNoiseList());
        this.noiseDialog.setSelectedData(this.whiteNoiseId.intValue());
        this.noiseDialog.setShowBottom();
        this.noiseDialog.show();
        this.noiseDialog.setOnDoneClickListener(new WhiteNoiseDialog.a() { // from class: com.moyoung.classes.meditation.localclass.i
            @Override // com.moyoung.classes.meditation.localclass.WhiteNoiseDialog.a
            public final void onDone(int i8) {
                LocalClassPlayActivity.this.lambda$initBinding$3(i8);
            }
        });
        this.noiseDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.moyoung.classes.meditation.localclass.j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LocalClassPlayActivity.this.lambda$initBinding$4(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$6(WheelPicker wheelPicker, Object obj, int i8) {
        this.classDuration = (Integer) obj;
        updateBreathTimes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playClass$7(LocalClassBean.ActionMsg actionMsg, int i8, List list, int i9, LocalClassBean.ActionMsg actionMsg2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction() * 100.0f;
        updateInhaleUI(actionMsg, animatedFraction, i8);
        updateHoldOnUI(list, animatedFraction, i8, i9);
        updateExhaleUI(actionMsg2, animatedFraction, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playClass() {
        startTimer();
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvEnd.setVisibility(0);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).rlBreath.setVisibility(0);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).animBreath.setAnimation(this.localClassBean.getAnimResId());
        ((ActivityMeditationLocalClassPlayBinding) this.binding).animBreath.playAnimation();
        com.moyoung.classes.meditation.c cVar = new com.moyoung.classes.meditation.c(this, null);
        this.audioPlayerUI = cVar;
        cVar.setAudioWithUrl(WhiteNoiseBean.getAudioUrl(this.whiteNoiseBean.getAudioResId()));
        this.audioPlayerUI.setIsRepeat(true);
        this.audioPlayerUI.play();
        final List<LocalClassBean.ActionMsg> actionMsgList = this.localClassBean.getActionMsgList();
        int breathDuration = LocalClassBean.ActionMsg.getBreathDuration(actionMsgList);
        final LocalClassBean.ActionMsg actionMsgByType = LocalClassBean.ActionMsg.getActionMsgByType(actionMsgList, LocalClassBean.ActionMsg.ActionType.INHALE);
        final int duration = actionMsgByType != null ? (actionMsgByType.getDuration() * 100) / breathDuration : 0;
        final LocalClassBean.ActionMsg actionMsgByType2 = LocalClassBean.ActionMsg.getActionMsgByType(actionMsgList, LocalClassBean.ActionMsg.ActionType.EXHALE);
        final int duration2 = actionMsgByType2 != null ? ((breathDuration - actionMsgByType2.getDuration()) * 100) / breathDuration : 0;
        ((ActivityMeditationLocalClassPlayBinding) this.binding).animBreath.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.moyoung.classes.meditation.localclass.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LocalClassPlayActivity.this.lambda$playClass$7(actionMsgByType, duration, actionMsgList, duration2, actionMsgByType2, valueAnimator);
            }
        });
    }

    public static void start(Context context, LocalClassBean localClassBean) {
        Intent intent = new Intent(context, (Class<?>) LocalClassPlayActivity.class);
        intent.putExtra(LocalClassBean.class.getName(), localClassBean);
        context.startActivity(intent);
    }

    private void updateBlurEffect(float f8) {
        if (f8 <= 0.0f || Math.abs(this.blurRadius - f8) < 1.0f) {
            return;
        }
        try {
            c.imageViewBlurEffect(((ActivityMeditationLocalClassPlayBinding) this.binding).ivBlur, f8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.blurRadius = f8;
    }

    private void updateBreathTimes() {
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvBreathTimes.setText(getString(R$string.meditation_class_breath_unit, Integer.valueOf(LocalClassBean.ActionMsg.getBreathTimes(this.classDuration.intValue(), this.localClassBean.getActionMsgList()))));
    }

    private void updateExhaleUI(LocalClassBean.ActionMsg actionMsg, float f8, int i8) {
        if (actionMsg != null && f8 >= i8) {
            ((ActivityMeditationLocalClassPlayBinding) this.binding).tvBreathStatus.setText(LocalClassBean.ActionMsg.getActionName(this, actionMsg.getActionType()));
            updateBlurEffect(((100.0f - f8) / (100 - i8)) * 25.0f);
            updateVibrate(actionMsg.getActionType());
        }
    }

    private void updateHoldOnUI(List<LocalClassBean.ActionMsg> list, float f8, int i8, int i9) {
        LocalClassBean.ActionMsg actionMsgByType = LocalClassBean.ActionMsg.getActionMsgByType(list, LocalClassBean.ActionMsg.ActionType.HOLD_ON);
        if (actionMsgByType == null || actionMsgByType.getDuration() == 0 || f8 <= i8 || f8 >= i9) {
            return;
        }
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvBreathStatus.setText(LocalClassBean.ActionMsg.getActionName(this, actionMsgByType.getActionType()));
        updateVibrate(actionMsgByType.getActionType());
    }

    private void updateInhaleUI(LocalClassBean.ActionMsg actionMsg, float f8, int i8) {
        if (actionMsg == null) {
            return;
        }
        float f9 = i8;
        if (f8 <= f9) {
            ((ActivityMeditationLocalClassPlayBinding) this.binding).tvBreathStatus.setText(LocalClassBean.ActionMsg.getActionName(this, actionMsg.getActionType()));
            updateBlurEffect((f8 / f9) * 25.0f);
            updateVibrate(actionMsg.getActionType());
        }
    }

    private void updateVibrate(LocalClassBean.ActionMsg.ActionType actionType) {
        if (actionType == this.actionType) {
            return;
        }
        this.actionType = actionType;
        y0.getInstance().vibrate(this, new long[]{10, 200, 10}, false);
    }

    private void updateWhiteNoiseUI() {
        WhiteNoiseBean whiteNoiseById = MeditationLocalModel.getWhiteNoiseById(this.whiteNoiseId);
        this.whiteNoiseBean = whiteNoiseById;
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvWhiteNoise.setText(whiteNoiseById.getTitle());
        Picasso.get().load(this.whiteNoiseBean.getBgResId()).resize(c5.d.getScreenWidth(this), c5.d.getScreenHeight(this)).centerCrop().placeholder(R$drawable.shape_local_img_placeholder).into(((ActivityMeditationLocalClassPlayBinding) this.binding).ivBlur);
        try {
            c.imageViewBlurEffect(((ActivityMeditationLocalClassPlayBinding) this.binding).ivBlur, 25.0f);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(getWindow());
        getWindow().addFlags(128);
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvStart.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.localclass.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalClassPlayActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityMeditationLocalClassPlayBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.localclass.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalClassPlayActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvEnd.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.localclass.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalClassPlayActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvWhiteNoise.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.localclass.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalClassPlayActivity.this.lambda$initBinding$5(view);
            }
        });
        ((ActivityMeditationLocalClassPlayBinding) this.binding).wheelPicker.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.moyoung.classes.meditation.localclass.o
            @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
            public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                LocalClassPlayActivity.this.lambda$initBinding$6(wheelPicker, obj, i8);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        LocalClassBean localClassBean = (LocalClassBean) getIntent().getSerializableExtra(LocalClassBean.class.getName());
        this.localClassBean = localClassBean;
        if (localClassBean == null) {
            finish();
            return;
        }
        ((ActivityMeditationLocalClassPlayBinding) this.binding).tvTitle.setText(localClassBean.getTitle());
        List<Integer> localClassDurationList = MeditationLocalModel.getLocalClassDurationList();
        ((ActivityMeditationLocalClassPlayBinding) this.binding).wheelPicker.setData(localClassDurationList);
        Integer num = (Integer) com.moyoung.dafit.module.common.network.provider.g.getInstance().getMap(LocalClassDoneActivity.RELAX_ID_WITH_WHITE_NOISE).get(String.valueOf(this.localClassBean.getId()));
        this.whiteNoiseId = num;
        if (num == null) {
            this.whiteNoiseId = 0;
        }
        updateWhiteNoiseUI();
        Integer num2 = (Integer) com.moyoung.dafit.module.common.network.provider.g.getInstance().getMap(LocalClassDoneActivity.RELAX_ID_WITH_DURATION).get(String.valueOf(this.localClassBean.getId()));
        this.classDuration = num2;
        if (num2 == null) {
            this.classDuration = 3;
        }
        ((ActivityMeditationLocalClassPlayBinding) this.binding).wheelPicker.setSelectedItemPosition(localClassDurationList.indexOf(this.classDuration));
        updateBreathTimes();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.moyoung.classes.meditation.c cVar = this.audioPlayerUI;
        if (cVar != null) {
            cVar.release();
        }
        Timer timer = this.classTimer;
        if (timer != null) {
            timer.cancel();
            this.classTimer = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.moyoung.classes.meditation.c cVar = this.audioPlayerUI;
        if (cVar != null) {
            cVar.pause();
        }
        WhiteNoiseDialog whiteNoiseDialog = this.noiseDialog;
        if (whiteNoiseDialog != null) {
            whiteNoiseDialog.getAudioPlayerUI().pause();
        }
        this.isClassPaused = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.moyoung.classes.meditation.c cVar = this.audioPlayerUI;
        if (cVar != null) {
            cVar.play();
        }
        WhiteNoiseDialog whiteNoiseDialog = this.noiseDialog;
        if (whiteNoiseDialog != null) {
            whiteNoiseDialog.getAudioPlayerUI().play();
        }
        this.isClassPaused = false;
    }

    public void startTimer() {
        this.isClassPaused = false;
        b bVar = new b();
        Timer timer = new Timer();
        this.classTimer = timer;
        timer.scheduleAtFixedRate(bVar, 0L, 1000L);
    }
}
