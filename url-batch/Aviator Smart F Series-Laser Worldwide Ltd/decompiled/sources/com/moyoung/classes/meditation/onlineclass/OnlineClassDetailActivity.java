package com.moyoung.classes.meditation.onlineclass;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.liulishuo.filedownloader.k;
import com.liulishuo.filedownloader.s;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$string;
import com.moyoung.classes.databinding.ActivityMeditationOnlineClassDetailBinding;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassBean;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassResp;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class OnlineClassDetailActivity extends BaseVBActivity<ActivityMeditationOnlineClassDetailBinding> {
    private com.moyoung.classes.i classesModel;
    private OnlineClassBean onlineClassBean;

    private static class a extends k {
        private final WeakReference<OnlineClassDetailActivity> weakReference;

        public a(OnlineClassDetailActivity onlineClassDetailActivity) {
            this.weakReference = new WeakReference<>(onlineClassDetailActivity);
            ((ActivityMeditationOnlineClassDetailBinding) ((BaseVBActivity) onlineClassDetailActivity).binding).pbAudio.setVisibility(0);
            ((ActivityMeditationOnlineClassDetailBinding) ((BaseVBActivity) onlineClassDetailActivity).binding).tvProgress.setVisibility(0);
        }

        @Override // com.liulishuo.filedownloader.k
        protected void completed(com.liulishuo.filedownloader.a aVar) {
            OnlineClassDetailActivity onlineClassDetailActivity = this.weakReference.get();
            if (onlineClassDetailActivity != null) {
                onlineClassDetailActivity.showStartBtn();
                ((ActivityMeditationOnlineClassDetailBinding) ((BaseVBActivity) onlineClassDetailActivity).binding).tvStart.performClick();
            }
        }

        @Override // com.liulishuo.filedownloader.k
        protected void error(com.liulishuo.filedownloader.a aVar, Throwable th) {
            OnlineClassDetailActivity onlineClassDetailActivity = this.weakReference.get();
            if (onlineClassDetailActivity != null) {
                onlineClassDetailActivity.showNetworkError();
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
            OnlineClassDetailActivity onlineClassDetailActivity = this.weakReference.get();
            if (onlineClassDetailActivity != null) {
                int i10 = (i8 * 100) / i9;
                ((ActivityMeditationOnlineClassDetailBinding) ((BaseVBActivity) onlineClassDetailActivity).binding).pbAudio.setProgress(i10);
                ((ActivityMeditationOnlineClassDetailBinding) ((BaseVBActivity) onlineClassDetailActivity).binding).tvProgress.setText(i10 + "%");
            }
        }

        @Override // com.liulishuo.filedownloader.k
        protected void warn(com.liulishuo.filedownloader.a aVar) {
        }
    }

    private void downloadAudioFile(String str) {
        File onlineClassAudioFile = getOnlineClassAudioFile(getApplicationContext(), str);
        if (onlineClassAudioFile.exists()) {
            showStartBtn();
            return;
        }
        a aVar = new a(this);
        if (!a0.isNetworkConnected(getApplicationContext())) {
            showNetworkError();
            return;
        }
        com.orhanobut.logger.f.d("audioUrl: " + str);
        s fileDownloader = com.moyoung.dafit.module.common.imageload.b.getInstance().getFileDownloader();
        fileDownloader.create(str).setPath(onlineClassAudioFile.getPath()).setCallbackProgressMinInterval(50).setListener(aVar).setAutoRetryTimes(5).asInQueueTask().enqueue();
        if (fileDownloader.start(aVar, true)) {
            return;
        }
        showNetworkError();
    }

    @NonNull
    public static File getOnlineClassAudioFile(Context context, String str) {
        return new File(g0.getMusicFilePath(context, g0.getFileNameFromUrl(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        OnlineClassPlayActivity.start(this, this.onlineClassBean);
        s0.logEvent("点击冥想课程开始", "meditationCourseName", this.onlineClassBean.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).slStart.setVisibility(4);
        downloadAudioFile(this.onlineClassBean.getAudioUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestOnlineClass$3(OnlineClassResp onlineClassResp) {
        if (onlineClassResp == null) {
            showNetworkError();
        } else {
            this.onlineClassBean = OnlineClassBean.convert(onlineClassResp);
            showDetailUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestOnlineClass$4(Throwable th) {
        showNetworkError();
    }

    @SuppressLint({"CheckResult"})
    private void requestOnlineClass(int i8) {
        if (this.classesModel == null) {
            this.classesModel = new com.moyoung.classes.i();
        }
        this.classesModel.requestMeditationOnlineClassDetail(i8).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.moyoung.classes.meditation.onlineclass.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnlineClassDetailActivity.this.lambda$requestOnlineClass$3((OnlineClassResp) obj);
            }
        }, new Consumer() { // from class: com.moyoung.classes.meditation.onlineclass.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnlineClassDetailActivity.this.lambda$requestOnlineClass$4((Throwable) obj);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    private void showDetailUI() {
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvDuration.setVisibility(0);
        com.moyoung.dafit.module.common.imageload.c.load(((ActivityMeditationOnlineClassDetailBinding) this.binding).ivThumb, this.onlineClassBean.getThumbUrl(), R$drawable.shape_net_img_placeholder, c5.d.getScreenWidth(this), o.dp2px(282.0f));
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvTitle.setText(this.onlineClassBean.getTitle());
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvDescription.setText(Html.fromHtml(this.onlineClassBean.getDescription()));
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvDuration.setText(this.onlineClassBean.getDuration() + l.SPACE + getString(R$string.meditation_class_duration_unit));
        if (!TextUtils.isEmpty(this.onlineClassBean.getSkill())) {
            ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvSkill.setText(Html.fromHtml(this.onlineClassBean.getSkill()));
            ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvSkill.setVisibility(0);
            ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvSkillTitle.setVisibility(0);
        }
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).slStart.setVisibility(0);
        if (getOnlineClassAudioFile(getApplicationContext(), this.onlineClassBean.getAudioUrl()).exists()) {
            showStartBtn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNetworkError() {
        r0.showShort(getApplicationContext(), R$string.classes_network_exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showStartBtn() {
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).slStart.setVisibility(0);
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvStart.setVisibility(0);
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvDownload.setVisibility(8);
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).pbAudio.setVisibility(8);
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvProgress.setVisibility(8);
    }

    public static void start(Context context, int i8) {
        Intent intent = new Intent(context, (Class<?>) OnlineClassDetailActivity.class);
        intent.putExtra("classId", i8);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(getWindow());
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.onlineclass.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineClassDetailActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvStart.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.onlineclass.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineClassDetailActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityMeditationOnlineClassDetailBinding) this.binding).tvDownload.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.onlineclass.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineClassDetailActivity.this.lambda$initBinding$2(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        requestOnlineClass(getIntent().getIntExtra("classId", -1));
    }
}
