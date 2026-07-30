package com.moyoung.classes.coach.playing;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.moyoung.classes.R$color;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.classes.coach.model.event.CoachActionRestedEvent;
import com.moyoung.classes.coach.model.event.CoachNextActionEvent;
import com.moyoung.classes.coach.playing.CoachCourseRestActivity;
import com.moyoung.classes.databinding.ActivityCoachCourseRestBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class CoachCourseRestActivity extends BaseVBActivity<ActivityCoachCourseRestBinding> {
    private d audioPlayer;
    private boolean isPagePaused = false;
    private AtomicInteger pageStayedTime;
    private AtomicInteger restDuration;
    private Timer restTimer;
    private AtomicInteger restedSecond;

    class a extends TimerTask {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            if (CoachCourseRestActivity.this.isPagePaused) {
                return;
            }
            CoachCourseRestActivity.this.pageStayedTime.incrementAndGet();
            CoachCourseRestActivity.this.restedSecond.incrementAndGet();
            CoachCourseRestActivity.this.showCountdownView();
            if (CoachCourseRestActivity.this.restedSecond.get() >= CoachCourseRestActivity.this.restDuration.get()) {
                ((ActivityCoachCourseRestBinding) ((BaseVBActivity) CoachCourseRestActivity.this).binding).slSkip.performClick();
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ((ActivityCoachCourseRestBinding) ((BaseVBActivity) CoachCourseRestActivity.this).binding).cdvCountDown.post(new Runnable() { // from class: com.moyoung.classes.coach.playing.c0
                @Override // java.lang.Runnable
                public final void run() {
                    CoachCourseRestActivity.a.this.lambda$run$0();
                }
            });
        }
    }

    private void initCountDownView() {
        CircleDisplayView circleDisplayView = ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown;
        int i8 = R$color.class_assist_1;
        circleDisplayView.setColor(ContextCompat.getColor(this, i8));
        ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown.setProgressBgColor(ContextCompat.getColor(this, R$color.assist_4_ED));
        ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown.setTextColor(ContextCompat.getColor(this, i8));
        ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown.setTextSize(48.0f);
        ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown.setTextBold(true);
        ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown.setValueWidthPercent(10.0f);
    }

    private void initCourseProgressBar() {
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("segmentTimeList");
        int intExtra = getIntent().getIntExtra("coursePlayedMs", 50);
        int intExtra2 = getIntent().getIntExtra("courseTotalMs", 100);
        ((ActivityCoachCourseRestBinding) this.binding).segmentVideoTimeBar.setSegmentColorRes(R$color.assist_1_ff);
        ((ActivityCoachCourseRestBinding) this.binding).segmentVideoTimeBar.showSegment(integerArrayListExtra);
        ((ActivityCoachCourseRestBinding) this.binding).segmentVideoTimeBar.setMax(intExtra2);
        ((ActivityCoachCourseRestBinding) this.binding).segmentVideoTimeBar.setProgress(intExtra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        org.greenrobot.eventbus.c.getDefault().post(new CoachNextActionEvent());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        this.restDuration.set(this.restDuration.addAndGet(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playRestAudio$2() {
        this.audioPlayer = new d(this);
        this.audioPlayer.setAudioUri(Uri.fromFile(new File(getIntent().getStringExtra("restAudioPath"))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNextAction$3(DialogInterface dialogInterface) {
        this.isPagePaused = true;
        ((ActivityCoachCourseRestBinding) this.binding).rlNextAction.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNextAction$4(DialogInterface dialogInterface) {
        this.isPagePaused = false;
        ((ActivityCoachCourseRestBinding) this.binding).rlNextAction.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNextAction$5(CoachActionBean coachActionBean, View view) {
        CoachActionDetailDialog coachActionDetailDialog = new CoachActionDetailDialog(this);
        coachActionDetailDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.moyoung.classes.coach.playing.a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoachCourseRestActivity.this.lambda$showNextAction$3(dialogInterface);
            }
        });
        coachActionDetailDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.moyoung.classes.coach.playing.b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoachCourseRestActivity.this.lambda$showNextAction$4(dialogInterface);
            }
        });
        coachActionDetailDialog.showData(coachActionBean);
        coachActionDetailDialog.show();
    }

    private void playRestAudio() {
        ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown.postDelayed(new Runnable() { // from class: com.moyoung.classes.coach.playing.y
            @Override // java.lang.Runnable
            public final void run() {
                CoachCourseRestActivity.this.lambda$playRestAudio$2();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCountdownView() {
        int i8 = this.restDuration.get() - this.restedSecond.get();
        ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown.setCustomText(String.valueOf(i8));
        ((ActivityCoachCourseRestBinding) this.binding).cdvCountDown.showValue(i8, this.restDuration.get());
    }

    private void showNextAction() {
        final CoachActionBean coachActionBean = (CoachActionBean) getIntent().getSerializableExtra(CoachActionBean.class.getName());
        if (coachActionBean != null) {
            ((ActivityCoachCourseRestBinding) this.binding).rlNextAction.setVisibility(0);
            ((ActivityCoachCourseRestBinding) this.binding).tvNextActionTitle.setText(coachActionBean.getTitle());
            com.moyoung.dafit.module.common.imageload.c.load(((ActivityCoachCourseRestBinding) this.binding).ivNextActionCover, coachActionBean.getCoverUrl(), R$drawable.shape_net_img_placeholder, new int[0]);
            ((ActivityCoachCourseRestBinding) this.binding).rlNextAction.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoachCourseRestActivity.this.lambda$showNextAction$5(coachActionBean, view);
                }
            });
        }
    }

    public static void start(Context context, int i8, int i9, String str, CoachActionBean coachActionBean, List<Integer> list, int i10, int i11) {
        Intent intent = new Intent(context, (Class<?>) CoachCourseRestActivity.class);
        intent.putExtra("screenOrientation", i8);
        intent.putExtra("restDuration", i9);
        intent.putExtra("restAudioPath", str);
        intent.putExtra(CoachActionBean.class.getName(), coachActionBean);
        intent.putIntegerArrayListExtra("segmentTimeList", (ArrayList) list);
        intent.putExtra("coursePlayedMs", i10);
        intent.putExtra("courseTotalMs", i11);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.moyoung.dafit.module.common.utils.k0.setLightMode(getWindow());
        initCountDownView();
        initCourseProgressBar();
        ((ActivityCoachCourseRestBinding) this.binding).slSkip.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseRestActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityCoachCourseRestBinding) this.binding).tvDelayed.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseRestActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        this.restDuration = new AtomicInteger(getIntent().getIntExtra("restDuration", 20));
        this.restedSecond = new AtomicInteger();
        this.pageStayedTime = new AtomicInteger();
        playRestAudio();
        showCountdownView();
        showNextAction();
        startTimer();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        org.greenrobot.eventbus.c.getDefault().post(new CoachNextActionEvent());
        super.onBackPressed();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        if (getIntent().getIntExtra("screenOrientation", 1) == 2) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Timer timer = this.restTimer;
        if (timer != null) {
            timer.cancel();
            this.restTimer = null;
        }
        d dVar = this.audioPlayer;
        if (dVar != null) {
            dVar.release();
            this.audioPlayer = null;
        }
        org.greenrobot.eventbus.c.getDefault().post(new CoachActionRestedEvent(this.pageStayedTime.get()));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.isPagePaused = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.isPagePaused = false;
    }

    public void startTimer() {
        this.isPagePaused = false;
        a aVar = new a();
        Timer timer = new Timer();
        this.restTimer = timer;
        timer.scheduleAtFixedRate(aVar, 1000L, 1000L);
    }
}
