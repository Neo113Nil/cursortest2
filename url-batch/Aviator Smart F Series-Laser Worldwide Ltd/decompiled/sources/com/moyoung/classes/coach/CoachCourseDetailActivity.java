package com.moyoung.classes.coach;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$string;
import com.moyoung.classes.coach.adapter.CoachActionAdapter;
import com.moyoung.classes.coach.adapter.CoachRelatedCourseAdapter;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.classes.coach.model.CoachCourseBean;
import com.moyoung.classes.coach.model.net.RelatedCourseResp;
import com.moyoung.classes.coach.playing.CoachActionDetailDialog;
import com.moyoung.classes.coach.playing.CoachCoursePlayingActivity;
import com.moyoung.classes.databinding.ActivityCoachCourseDetailBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachCourseDetailActivity extends BaseVBActivity<ActivityCoachCourseDetailBinding> {
    private com.moyoung.classes.i classesModel;
    private CoachCourseBean courseBean;

    private static class a extends com.liulishuo.filedownloader.k {
        private final WeakReference<CoachCourseDetailActivity> weakReference;

        public a(CoachCourseDetailActivity coachCourseDetailActivity) {
            this.weakReference = new WeakReference<>(coachCourseDetailActivity);
            ((ActivityCoachCourseDetailBinding) ((BaseVBActivity) coachCourseDetailActivity).binding).pbAudio.setVisibility(0);
            ((ActivityCoachCourseDetailBinding) ((BaseVBActivity) coachCourseDetailActivity).binding).tvProgress.setVisibility(0);
        }

        @Override // com.liulishuo.filedownloader.k
        protected void completed(com.liulishuo.filedownloader.a aVar) {
            CoachCourseDetailActivity coachCourseDetailActivity = this.weakReference.get();
            if (coachCourseDetailActivity != null) {
                coachCourseDetailActivity.unZipFolder(aVar.getPath());
            }
        }

        @Override // com.liulishuo.filedownloader.k
        protected void error(com.liulishuo.filedownloader.a aVar, Throwable th) {
            CoachCourseDetailActivity coachCourseDetailActivity = this.weakReference.get();
            if (coachCourseDetailActivity != null) {
                coachCourseDetailActivity.showNetError();
                ((ActivityCoachCourseDetailBinding) ((BaseVBActivity) coachCourseDetailActivity).binding).slStart.setVisibility(0);
                ((ActivityCoachCourseDetailBinding) ((BaseVBActivity) coachCourseDetailActivity).binding).pbAudio.setVisibility(8);
                ((ActivityCoachCourseDetailBinding) ((BaseVBActivity) coachCourseDetailActivity).binding).tvProgress.setVisibility(8);
            }
        }

        @Override // com.liulishuo.filedownloader.k
        protected void paused(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void pending(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void progress(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
            CoachCourseDetailActivity coachCourseDetailActivity = this.weakReference.get();
            if (coachCourseDetailActivity != null) {
                int i10 = (i8 * 100) / i9;
                int i11 = i10 >= 0 ? i10 : 100;
                ((ActivityCoachCourseDetailBinding) ((BaseVBActivity) coachCourseDetailActivity).binding).pbAudio.setProgress(i11);
                ((ActivityCoachCourseDetailBinding) ((BaseVBActivity) coachCourseDetailActivity).binding).tvProgress.setText(i11 + "%");
            }
        }

        @Override // com.liulishuo.filedownloader.k
        protected void warn(com.liulishuo.filedownloader.a aVar) {
        }
    }

    private void downloadZipFile(String str) {
        File zipFile = getZipFile(getApplicationContext(), str);
        if (zipFile.exists()) {
            showStartBtn();
            return;
        }
        a aVar = new a(this);
        if (!a0.isNetworkConnected(getApplicationContext())) {
            showNetError();
            return;
        }
        Log.d("zipUrl: ", str);
        com.liulishuo.filedownloader.s fileDownloader = com.moyoung.dafit.module.common.imageload.b.getInstance().getFileDownloader();
        fileDownloader.create(str).setPath(zipFile.getPath()).setCallbackProgressMinInterval(50).setListener(aVar).setAutoRetryTimes(5).asInQueueTask().enqueue();
        if (fileDownloader.start(aVar, true)) {
            return;
        }
        showNetError();
    }

    @NonNull
    private static File getUnZipFolderPath(Context context, String str) {
        return new File(g0.getDownloadsFileDir(context) + File.separator + g0.getFileNameSuffixlessFromUrl(str));
    }

    @NonNull
    public static File getZipFile(Context context, String str) {
        return new File(g0.getDownloadFilePath(context, g0.getFileNameFromUrl(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        CoachCourseDescriptionDialog coachCourseDescriptionDialog = new CoachCourseDescriptionDialog(this);
        coachCourseDescriptionDialog.showData(this.courseBean.getDescription());
        coachCourseDescriptionDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        CoachCoursePlayingActivity.start(this, this.courseBean);
        s0.logEvent("点击健身课程开始", "courseName", this.courseBean.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        ((ActivityCoachCourseDetailBinding) this.binding).slStart.setVisibility(4);
        downloadZipFile(this.courseBean.getCourseZipUrl());
        s0.logEvent("点击健身课程下载", "courseName", this.courseBean.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        new CoachActionTypeDialog(this, this.courseBean).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestCoachCourse$5(int i8, CoachCourseBean coachCourseBean) {
        if (coachCourseBean == null) {
            showNetError();
        } else {
            showCoachDetail(coachCourseBean);
            requestRelatedClassesList(coachCourseBean.getCategoryIdListStr(), i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestCoachCourse$6(Throwable th) {
        showNetError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestRelatedClassesList$7(List list) {
        if (list == null || list.isEmpty()) {
            showRelatedNetError();
        } else {
            showRelatedClassesList(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestRelatedClassesList$8(Throwable th) {
        showRelatedNetError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showActionList$12(BaseQuickAdapter baseQuickAdapter, final View view, int i8) {
        CoachActionBean coachActionBean = (CoachActionBean) baseQuickAdapter.getData().get(i8);
        CoachActionDetailDialog coachActionDetailDialog = new CoachActionDetailDialog(this);
        coachActionDetailDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.moyoung.classes.coach.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                view.setClickable(false);
            }
        });
        coachActionDetailDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.moyoung.classes.coach.e
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                view.setClickable(true);
            }
        });
        coachActionDetailDialog.showData(coachActionBean);
        coachActionDetailDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showRelatedClassesList$9(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        start(this, ((RelatedCourseResp) baseQuickAdapter.getData().get(i8)).getId());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unZipFolder$13(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            showDownloadBtn();
            return;
        }
        ((ActivityCoachCourseDetailBinding) this.binding).tvStart.performClick();
        showStartBtn();
        new File(str).delete();
    }

    @SuppressLint({"CheckResult"})
    private void requestCoachCourse(final int i8) {
        if (this.classesModel == null) {
            this.classesModel = new com.moyoung.classes.i();
        }
        this.classesModel.requestCoachCourse(i8).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.moyoung.classes.coach.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachCourseDetailActivity.this.lambda$requestCoachCourse$5(i8, (CoachCourseBean) obj);
            }
        }, new Consumer() { // from class: com.moyoung.classes.coach.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachCourseDetailActivity.this.lambda$requestCoachCourse$6((Throwable) obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    private void requestRelatedClassesList(String str, int i8) {
        this.classesModel.requestCoachRelatedCourseList(str, i8).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.moyoung.classes.coach.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachCourseDetailActivity.this.lambda$requestRelatedClassesList$7((List) obj);
            }
        }, new Consumer() { // from class: com.moyoung.classes.coach.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachCourseDetailActivity.this.lambda$requestRelatedClassesList$8((Throwable) obj);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    private void showActionList(CoachCourseBean coachCourseBean) {
        List<CoachActionBean> actionList = CoachActionBean.getActionList(coachCourseBean);
        ((ActivityCoachCourseDetailBinding) this.binding).tvCoachActionCount.setText(actionList.size() + cn.hutool.core.text.l.SPACE + getString(R$string.course_fitness_detail_number_moves_text));
        CoachActionAdapter coachActionAdapter = new CoachActionAdapter();
        coachActionAdapter.setNewData(actionList);
        ((ActivityCoachCourseDetailBinding) this.binding).rvCoachAction.setAdapter(coachActionAdapter);
        coachActionAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.coach.g
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                CoachCourseDetailActivity.this.lambda$showActionList$12(baseQuickAdapter, view, i8);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    private void showCoachDetail(CoachCourseBean coachCourseBean) {
        this.courseBean = coachCourseBean;
        com.moyoung.dafit.module.common.imageload.c.load(((ActivityCoachCourseDetailBinding) this.binding).ivCover, coachCourseBean.getCoverUrl(), R$drawable.shape_net_img_placeholder, c5.d.getScreenWidth(this), com.moyoung.dafit.module.common.utils.o.dp2px(282.0f));
        ((ActivityCoachCourseDetailBinding) this.binding).tvTitle.setText(coachCourseBean.getTitle());
        ((ActivityCoachCourseDetailBinding) this.binding).tvDescription.setText(Html.fromHtml(coachCourseBean.getDescription()));
        ((ActivityCoachCourseDetailBinding) this.binding).tvDuration.setText(c5.b.ms2MinuteRoundStr(this, coachCourseBean.getTotalDuration()));
        ((ActivityCoachCourseDetailBinding) this.binding).tvKcal.setText(c5.b.getKcalStr(getApplicationContext(), coachCourseBean.getKcal()));
        ((ActivityCoachCourseDetailBinding) this.binding).tvLevel.setText(c5.b.getLevelStr(getApplicationContext(), coachCourseBean.getLevel()));
        ((ActivityCoachCourseDetailBinding) this.binding).tvLevel.setCompoundDrawablesWithIntrinsicBounds(c5.b.getLevelDrawable(getApplicationContext(), coachCourseBean.getLevel()), (Drawable) null, (Drawable) null, (Drawable) null);
        ((ActivityCoachCourseDetailBinding) this.binding).slStart.setVisibility(0);
        if (getUnZipFolderPath(getApplicationContext(), coachCourseBean.getCourseZipUrl()).exists()) {
            showStartBtn();
        }
        showActionList(coachCourseBean);
    }

    private void showDownloadBtn() {
        ((ActivityCoachCourseDetailBinding) this.binding).slStart.setVisibility(0);
        ((ActivityCoachCourseDetailBinding) this.binding).tvStart.setVisibility(8);
        ((ActivityCoachCourseDetailBinding) this.binding).tvDownload.setVisibility(0);
        ((ActivityCoachCourseDetailBinding) this.binding).pbAudio.setVisibility(8);
        ((ActivityCoachCourseDetailBinding) this.binding).tvProgress.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNetError() {
        r0.showShort(getApplicationContext(), R$string.classes_network_exception);
    }

    private void showRelatedClassesList(List<RelatedCourseResp> list) {
        ((ActivityCoachCourseDetailBinding) this.binding).tvRelatedCoursesTitle.setVisibility(0);
        ((ActivityCoachCourseDetailBinding) this.binding).rvRelatedCourses.setVisibility(0);
        CoachRelatedCourseAdapter coachRelatedCourseAdapter = new CoachRelatedCourseAdapter();
        coachRelatedCourseAdapter.setNewData(list);
        ((ActivityCoachCourseDetailBinding) this.binding).rvRelatedCourses.setAdapter(coachRelatedCourseAdapter);
        coachRelatedCourseAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.coach.c
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                CoachCourseDetailActivity.this.lambda$showRelatedClassesList$9(baseQuickAdapter, view, i8);
            }
        });
    }

    private void showRelatedNetError() {
    }

    private void showStartBtn() {
        ((ActivityCoachCourseDetailBinding) this.binding).slStart.setVisibility(0);
        ((ActivityCoachCourseDetailBinding) this.binding).tvStart.setVisibility(0);
        ((ActivityCoachCourseDetailBinding) this.binding).tvDownload.setVisibility(8);
        ((ActivityCoachCourseDetailBinding) this.binding).pbAudio.setVisibility(8);
        ((ActivityCoachCourseDetailBinding) this.binding).tvProgress.setVisibility(8);
    }

    public static void start(Context context, int i8) {
        Intent intent = new Intent(context, (Class<?>) CoachCourseDetailActivity.class);
        intent.putExtra("courseId", i8);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void unZipFolder(final String str) {
        String unZipFolderPath = getUnZipFolderPath(str);
        new File(unZipFolderPath).mkdir();
        Observable.just(Boolean.valueOf(c5.e.unZipFolder(str, unZipFolderPath))).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.moyoung.classes.coach.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachCourseDetailActivity.this.lambda$unZipFolder$13(str, (Boolean) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(getWindow());
        ((ActivityCoachCourseDetailBinding) this.binding).rvCoachAction.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ((ActivityCoachCourseDetailBinding) this.binding).rvCoachAction.addItemDecoration(new SpacesItemDecoration(com.moyoung.dafit.module.common.utils.o.dp2px(this, 8.0f)));
        ((ActivityCoachCourseDetailBinding) this.binding).rvRelatedCourses.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((ActivityCoachCourseDetailBinding) this.binding).rvRelatedCourses.addItemDecoration(new SpacesItemDecoration(com.moyoung.dafit.module.common.utils.o.dp2px(this, 8.0f)));
        ((ActivityCoachCourseDetailBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseDetailActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityCoachCourseDetailBinding) this.binding).tvViewMore.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseDetailActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityCoachCourseDetailBinding) this.binding).tvStart.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseDetailActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityCoachCourseDetailBinding) this.binding).tvDownload.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseDetailActivity.this.lambda$initBinding$3(view);
            }
        });
        ((ActivityCoachCourseDetailBinding) this.binding).tvCoachActionCount.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCourseDetailActivity.this.lambda$initBinding$4(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        int intExtra = getIntent().getIntExtra("courseId", -1);
        if (intExtra == -1) {
            finish();
        } else {
            requestCoachCourse(intExtra);
        }
    }

    @NonNull
    private static String getUnZipFolderPath(String str) {
        return g0.getFileDirFromPath(str) + File.separator + g0.getFileNameSuffixlessFromPath(str);
    }
}
