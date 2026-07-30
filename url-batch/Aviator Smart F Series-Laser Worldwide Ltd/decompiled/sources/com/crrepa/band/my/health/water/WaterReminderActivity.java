package com.crrepa.band.my.health.water;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityWaterReminderBinding;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.proxy.WaterDaoProxy;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import java.util.Date;

/* loaded from: classes2.dex */
public class WaterReminderActivity extends BaseVBActivity<ActivityWaterReminderBinding> {
    private static final long TIMER_FINISH_MS = 180000;
    long curTime = 0;
    private final Runnable finishRunnable = new Runnable() { // from class: com.crrepa.band.my.health.water.e
        @Override // java.lang.Runnable
        public final void run() {
            WaterReminderActivity.this.onBackPressed();
        }
    };
    private final Handler finishHandler = new Handler();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z7) {
            super.onAnimationEnd(animator, z7);
            WaterReminderActivity.this.setCirculatePlayAnimation();
        }
    }

    private void cancelTimer() {
        this.finishHandler.removeCallbacks(this.finishRunnable);
    }

    private void initData() {
        String valueOf;
        String str;
        Water calendarWater = new WaterDaoProxy().getCalendarWater(new Date(), true, 1);
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            valueOf = String.valueOf(calendarWater.getTotalIntakeMl());
            str = cn.hutool.core.text.l.SPACE + calendarWater.getGoalMl() + cn.hutool.core.text.l.SPACE + getString(R.string.water_ml);
        } else {
            valueOf = String.valueOf(calendarWater.getTotalIntakeOz());
            str = cn.hutool.core.text.l.SPACE + calendarWater.getGoalOz() + cn.hutool.core.text.l.SPACE + getString(R.string.water_oz);
        }
        ((ActivityWaterReminderBinding) this.binding).tvDrinkTotal.setText(valueOf);
        ((ActivityWaterReminderBinding) this.binding).tvDrinkGoal.setText(getString(R.string.water_reminder_intake, str));
        ((ActivityWaterReminderBinding) this.binding).tvDrinkTip.setText(WaterProvider.getAppPromptTip(this));
    }

    private void initListener() {
        ((ActivityWaterReminderBinding) this.binding).tvGotIt.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaterReminderActivity.this.lambda$initListener$0(view);
            }
        });
        ((ActivityWaterReminderBinding) this.binding).tvGoDrink.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.water.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WaterReminderActivity.this.lambda$initListener$1(view);
            }
        });
    }

    private void initTimer(long j8) {
        StringBuilder sb = new StringBuilder();
        sb.append("water ==> initTimer......");
        long j9 = TIMER_FINISH_MS - j8;
        sb.append(j9);
        com.orhanobut.logger.f.d(sb.toString());
        this.finishHandler.postDelayed(this.finishRunnable, j9);
    }

    private void initView() {
        initData();
        setOncePlayAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        startActivity(WaterStatisticsActivity.getCallingIntent(this, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCirculatePlayAnimation() {
        ((ActivityWaterReminderBinding) this.binding).lavDrinkCirculateAnimation.setAnimation(R.raw.drink_circulate);
        ((ActivityWaterReminderBinding) this.binding).lavDrinkCirculateAnimation.setRepeatCount(-1);
        ((ActivityWaterReminderBinding) this.binding).lavDrinkCirculateAnimation.playAnimation();
    }

    private void setOncePlayAnimation() {
        ((ActivityWaterReminderBinding) this.binding).lavDrinkOnceAnimation.addAnimatorListener(new a());
        ((ActivityWaterReminderBinding) this.binding).lavDrinkOnceAnimation.setAnimation(R.raw.drink_once);
        ((ActivityWaterReminderBinding) this.binding).lavDrinkOnceAnimation.setRepeatCount(0);
        ((ActivityWaterReminderBinding) this.binding).lavDrinkOnceAnimation.playAnimation();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.translucent));
        this.curTime = System.currentTimeMillis();
        initView();
        initListener();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        com.orhanobut.logger.f.d("water ==> reminder dialog onDestroy......");
        cancelTimer();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis() - this.curTime;
        if (currentTimeMillis >= TIMER_FINISH_MS) {
            onBackPressed();
        } else {
            cancelTimer();
            initTimer(currentTimeMillis);
        }
    }
}
