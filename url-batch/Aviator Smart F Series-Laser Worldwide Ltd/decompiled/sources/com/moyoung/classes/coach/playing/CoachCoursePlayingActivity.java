package com.moyoung.classes.coach.playing;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.moyoung.classes.R$color;
import com.moyoung.classes.coach.CoachCourseDoneActivity;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.classes.coach.model.CoachCourseBean;
import com.moyoung.classes.coach.model.CoachCoursePlayedBean;
import com.moyoung.classes.coach.model.event.CoachActionRestedEvent;
import com.moyoung.classes.coach.model.event.CoachCompletedCourseEvent;
import com.moyoung.classes.coach.model.event.CoachContinueActionEvent;
import com.moyoung.classes.coach.model.event.CoachNextActionEvent;
import com.moyoung.classes.coach.model.event.CoachStopCourseEvent;
import com.moyoung.classes.coach.playing.CoachCoursePlayingActivity;
import com.moyoung.classes.coach.playing.s0;
import com.moyoung.classes.databinding.ActivityCoachCoursePlayingBinding;
import com.moyoung.classes.db.ClassesHistory;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public class CoachCoursePlayingActivity extends BaseVBActivity<ActivityCoachCoursePlayingBinding> {
    private s0 coachVideoPlayerUI;
    private boolean isPagePaused = false;
    private boolean isRested = false;
    private Timer pageTimer;
    private int spentTime;
    private long startTimestamp;

    class a implements s0.e {
        a() {
        }

        @Override // com.moyoung.classes.coach.playing.s0.e
        public void onActionCompleted(CoachActionBean coachActionBean, String str, List<Integer> list, int i8, int i9) {
            if (coachActionBean.getRestDuration() <= 0) {
                CoachCoursePlayingActivity.this.coachVideoPlayerUI.playNextAction();
                return;
            }
            CoachCoursePlayingActivity.this.isRested = true;
            CoachCourseRestActivity.start(CoachCoursePlayingActivity.this, CoachCoursePlayingActivity.this.getResources().getConfiguration().orientation, (int) TimeUnit.MILLISECONDS.toSeconds(coachActionBean.getRestDuration()), str, CoachCoursePlayingActivity.this.coachVideoPlayerUI.getNextActionBean(), list, i8, i9);
        }

        @Override // com.moyoung.classes.coach.playing.s0.e
        public void onActionContinued() {
            CoachCoursePlayingActivity.this.resumeCourse();
        }

        @Override // com.moyoung.classes.coach.playing.s0.e
        public void onActionPaused(CoachActionBean coachActionBean) {
            CoachCoursePlayingActivity.this.showPausedDialog(coachActionBean);
        }

        @Override // com.moyoung.classes.coach.playing.s0.e
        @SuppressLint({"SetTextI18n"})
        public void onActionPlayedCount(int i8) {
            int repeatCount = CoachCoursePlayingActivity.this.coachVideoPlayerUI.getCurrentActionBean().getRepeatCount();
            ((ActivityCoachCoursePlayingBinding) ((BaseVBActivity) CoachCoursePlayingActivity.this).binding).tvCurrentActionTotal.setText("/" + repeatCount);
            if (i8 == 0) {
                i8 = 1;
            }
            ((ActivityCoachCoursePlayingBinding) ((BaseVBActivity) CoachCoursePlayingActivity.this).binding).tvCurrentActionPlayedCount.setText(String.valueOf(i8));
        }

        @Override // com.moyoung.classes.coach.playing.s0.e
        public void onCourseCompleted() {
            if (CoachCoursePlayingActivity.this.spentTime < 120) {
                CoachCoursePlayingActivity.this.finish();
            } else {
                CoachCoursePlayingActivity.this.executeCourseCompleted();
            }
        }

        @Override // com.moyoung.classes.coach.playing.s0.e
        public void onPlaying(long j8) {
        }

        @Override // com.moyoung.classes.coach.playing.s0.e
        @SuppressLint({"SetTextI18n"})
        public void onStart(String str, int i8, int i9) {
            ((ActivityCoachCoursePlayingBinding) ((BaseVBActivity) CoachCoursePlayingActivity.this).binding).tvCourseActionIndex.setText((i8 + 1) + "/" + i9);
            ((ActivityCoachCoursePlayingBinding) ((BaseVBActivity) CoachCoursePlayingActivity.this).binding).tvActionTitle.setText(str);
        }
    }

    class b extends TimerTask {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            ((ActivityCoachCoursePlayingBinding) ((BaseVBActivity) CoachCoursePlayingActivity.this).binding).tvPosition.setText(c5.b.ms2MinAndSecondStr(CoachCoursePlayingActivity.this.spentTime * 1000));
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (CoachCoursePlayingActivity.this.isPagePaused) {
                return;
            }
            CoachCoursePlayingActivity.access$808(CoachCoursePlayingActivity.this);
            ((ActivityCoachCoursePlayingBinding) ((BaseVBActivity) CoachCoursePlayingActivity.this).binding).tvPosition.post(new Runnable() { // from class: com.moyoung.classes.coach.playing.v
                @Override // java.lang.Runnable
                public final void run() {
                    CoachCoursePlayingActivity.b.this.lambda$run$0();
                }
            });
        }
    }

    static /* synthetic */ int access$808(CoachCoursePlayingActivity coachCoursePlayingActivity) {
        int i8 = coachCoursePlayingActivity.spentTime;
        coachCoursePlayingActivity.spentTime = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeCourseCompleted() {
        this.coachVideoPlayerUI.addUnPlayActionPlayedMsToList();
        this.coachVideoPlayerUI.stop();
        CoachCourseBean coachCourseBean = (CoachCourseBean) getIntent().getSerializableExtra(CoachCourseBean.class.getName());
        CoachCoursePlayedBean coachCoursePlayedBean = new CoachCoursePlayedBean(coachCourseBean.getId(), this.startTimestamp, System.currentTimeMillis(), coachCourseBean.getCoverUrl(), coachCourseBean.getTitle(), coachCourseBean.getNameLanguageList(), coachCourseBean.getTotalDuration(), coachCourseBean.getKcal(), coachCourseBean.getLevel(), this.coachVideoPlayerUI.actionPlayedList);
        float f8 = this.spentTime * 1000.0f;
        float courseKcal = f8 >= ((float) coachCoursePlayedBean.getCourseDuration()) ? coachCoursePlayedBean.getCourseKcal() : coachCoursePlayedBean.getCourseKcal() * (f8 / coachCoursePlayedBean.getCourseDuration());
        ClassesHistory classesHistory = new ClassesHistory();
        classesHistory.setClassesId(coachCourseBean.getId());
        classesHistory.setClassesTitle(coachCourseBean.getTitle());
        classesHistory.setClassesType(1);
        classesHistory.setStartTimestamp(this.startTimestamp);
        classesHistory.setSpentTime((int) f8);
        classesHistory.setSpentKcal((int) courseKcal);
        classesHistory.setClassesJson(new Gson().toJson(coachCoursePlayedBean));
        new com.moyoung.classes.db.d().save(classesHistory);
        CoachCourseDoneActivity.start(this, classesHistory);
        finish();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void initListener() {
        ((ActivityCoachCoursePlayingBinding) this.binding).tvActionDetail.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCoursePlayingActivity.this.lambda$initListener$4(view);
            }
        });
        ((ActivityCoachCoursePlayingBinding) this.binding).viewSwitchToLand.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCoursePlayingActivity.this.lambda$initListener$5(view);
            }
        });
        ((ActivityCoachCoursePlayingBinding) this.binding).viewSwitchToPort.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCoursePlayingActivity.this.lambda$initListener$6(view);
            }
        });
    }

    private void initVideoPlayerUI() {
        s0 s0Var = new s0(this, (ActivityCoachCoursePlayingBinding) this.binding);
        this.coachVideoPlayerUI = s0Var;
        s0Var.setOnVideoPlayingCallback(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(DialogInterface dialogInterface) {
        pauseCourse();
        ((ActivityCoachCoursePlayingBinding) this.binding).tvActionDetail.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$3(DialogInterface dialogInterface) {
        resumeCourse();
        ((ActivityCoachCoursePlayingBinding) this.binding).tvActionDetail.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$4(View view) {
        CoachActionBean currentActionBean = this.coachVideoPlayerUI.getCurrentActionBean();
        CoachActionDetailDialog coachActionDetailDialog = new CoachActionDetailDialog(this);
        coachActionDetailDialog.showData(currentActionBean);
        coachActionDetailDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.moyoung.classes.coach.playing.r
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoachCoursePlayingActivity.this.lambda$initListener$2(dialogInterface);
            }
        });
        coachActionDetailDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.moyoung.classes.coach.playing.s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoachCoursePlayingActivity.this.lambda$initListener$3(dialogInterface);
            }
        });
        coachActionDetailDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$5(View view) {
        setRequestedOrientation(0);
        ((ActivityCoachCoursePlayingBinding) this.binding).viewSwitchToLand.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$6(View view) {
        setRequestedOrientation(1);
        ((ActivityCoachCoursePlayingBinding) this.binding).viewSwitchToLand.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showContinueDialog$7(DialogInterface dialogInterface) {
        pauseCourse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showContinueDialog$8() {
        org.greenrobot.eventbus.c.getDefault().post(new CoachStopCourseEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showContinueDialog$9() {
        this.coachVideoPlayerUI.executePrevClick();
        org.greenrobot.eventbus.c.getDefault().post(new CoachContinueActionEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPausedDialog$0(DialogInterface dialogInterface) {
        pauseCourse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPausedDialog$1(DialogInterface dialogInterface) {
        resumeCourse();
    }

    private void pauseCourse() {
        this.isPagePaused = true;
        this.coachVideoPlayerUI.videoPlayer.setPlayWhenReady(false);
        this.coachVideoPlayerUI.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeCourse() {
        this.isPagePaused = false;
        this.isRested = false;
        this.coachVideoPlayerUI.videoPlayer.setPlayWhenReady(true);
        this.coachVideoPlayerUI.resume();
    }

    private void showContinueDialog() {
        BaseCustomConfirmDialog isContinueDialog = CoachCoursePausedDialog.getIsContinueDialog(this);
        isContinueDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.moyoung.classes.coach.playing.o
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoachCoursePlayingActivity.this.lambda$showContinueDialog$7(dialogInterface);
            }
        });
        isContinueDialog.setCancelable(false);
        isContinueDialog.setOnCancelClick(new BaseCustomConfirmDialog.a() { // from class: com.moyoung.classes.coach.playing.p
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.a
            public final void onCancel() {
                CoachCoursePlayingActivity.lambda$showContinueDialog$8();
            }
        });
        isContinueDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.moyoung.classes.coach.playing.q
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                CoachCoursePlayingActivity.this.lambda$showContinueDialog$9();
            }
        });
        isContinueDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPausedDialog(CoachActionBean coachActionBean) {
        CoachCoursePausedDialog coachCoursePausedDialog = new CoachCoursePausedDialog(this, coachActionBean, this.coachVideoPlayerUI.getActionPlayedPercent(), this.spentTime);
        coachCoursePausedDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.moyoung.classes.coach.playing.t
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoachCoursePlayingActivity.this.lambda$showPausedDialog$0(dialogInterface);
            }
        });
        coachCoursePausedDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.moyoung.classes.coach.playing.u
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoachCoursePlayingActivity.this.lambda$showPausedDialog$1(dialogInterface);
            }
        });
        coachCoursePausedDialog.show();
    }

    public static void start(Context context, CoachCourseBean coachCourseBean) {
        Intent intent = new Intent(context, (Class<?>) CoachCoursePlayingActivity.class);
        intent.putExtra(CoachCourseBean.class.getName(), coachCourseBean);
        context.startActivity(intent);
    }

    private void updateViewByOrientation(boolean z7) {
        c5.c.showFullscreenByOrientation(this, z7);
        this.coachVideoPlayerUI.coachVideoPlayer.setVideoResizeModeByOrientation(z7);
        ((ActivityCoachCoursePlayingBinding) this.binding).videoView.hideController();
        ((ActivityCoachCoursePlayingBinding) this.binding).rlVideoHandleLandBtn.setVisibility(8);
        if (z7) {
            ((ActivityCoachCoursePlayingBinding) this.binding).rlVideoHandleLand.setVisibility(0);
            ((ActivityCoachCoursePlayingBinding) this.binding).videoHandlePort.viewHandle.setVisibility(8);
            ((ActivityCoachCoursePlayingBinding) this.binding).viewSwitchToLand.setVisibility(8);
            ((ActivityCoachCoursePlayingBinding) this.binding).viewSwitchToPort.setVisibility(0);
        } else {
            ((ActivityCoachCoursePlayingBinding) this.binding).rlVideoHandleLand.setVisibility(8);
            ((ActivityCoachCoursePlayingBinding) this.binding).videoHandlePort.viewHandle.setVisibility(0);
            ((ActivityCoachCoursePlayingBinding) this.binding).viewSwitchToLand.setVisibility(0);
            ((ActivityCoachCoursePlayingBinding) this.binding).viewSwitchToPort.setVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityCoachCoursePlayingBinding) this.binding).videoView.getLayoutParams();
        if (z7) {
            layoutParams.height = -1;
        } else {
            layoutParams.height = com.moyoung.dafit.module.common.utils.o.dp2px(this, 225.0f);
        }
        ((ActivityCoachCoursePlayingBinding) this.binding).videoView.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) ((ActivityCoachCoursePlayingBinding) this.binding).segmentVideoTimeBar.getLayoutParams();
        if (z7) {
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.topMargin = 0;
        } else {
            layoutParams2.leftMargin = com.moyoung.dafit.module.common.utils.o.dp2px(this, 20.0f);
            layoutParams2.rightMargin = com.moyoung.dafit.module.common.utils.o.dp2px(this, 20.0f);
            layoutParams2.topMargin = com.moyoung.dafit.module.common.utils.o.dp2px(this, 60.0f);
        }
        ((ActivityCoachCoursePlayingBinding) this.binding).segmentVideoTimeBar.setLayoutParams(layoutParams2);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        com.moyoung.dafit.module.common.utils.k0.setDarkMode(getWindow());
        org.greenrobot.eventbus.c.getDefault().register(this);
        ((ActivityCoachCoursePlayingBinding) this.binding).segmentVideoTimeBar.setSegmentColorRes(R$color.assist_13_00);
        initVideoPlayerUI();
        initListener();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        CoachCourseBean coachCourseBean = (CoachCourseBean) getIntent().getSerializableExtra(CoachCourseBean.class.getName());
        if (coachCourseBean == null) {
            finish();
            return;
        }
        this.startTimestamp = System.currentTimeMillis();
        startPageTimer();
        this.coachVideoPlayerUI.playActionList(coachCourseBean.getCourseZipUrl(), CoachActionBean.getActionList(coachCourseBean));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onCoachActionRestedEvent(CoachActionRestedEvent coachActionRestedEvent) {
        this.spentTime += coachActionRestedEvent.getRestSeconds();
        resumeCourse();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onCoachCompletedCourseEvent(CoachCompletedCourseEvent coachCompletedCourseEvent) {
        executeCourseCompleted();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onCoachContinueActionEvent(CoachContinueActionEvent coachContinueActionEvent) {
        resumeCourse();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onCoachNextActionEvent(CoachNextActionEvent coachNextActionEvent) {
        this.coachVideoPlayerUI.playNextAction();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onCoachStopCourseEvent(CoachStopCourseEvent coachStopCourseEvent) {
        this.coachVideoPlayerUI.stop();
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateViewByOrientation(configuration.orientation == 2);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        s0 s0Var = this.coachVideoPlayerUI;
        if (s0Var != null) {
            s0Var.release();
        }
        Timer timer = this.pageTimer;
        if (timer != null) {
            timer.cancel();
            this.pageTimer = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (!this.isRested) {
            showPausedDialog(this.coachVideoPlayerUI.getCurrentActionBean());
        }
        getWindow().clearFlags(128);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getWindow().addFlags(128);
    }

    public void startPageTimer() {
        this.isPagePaused = false;
        b bVar = new b();
        Timer timer = new Timer();
        this.pageTimer = timer;
        timer.scheduleAtFixedRate(bVar, 0L, 1000L);
    }
}
