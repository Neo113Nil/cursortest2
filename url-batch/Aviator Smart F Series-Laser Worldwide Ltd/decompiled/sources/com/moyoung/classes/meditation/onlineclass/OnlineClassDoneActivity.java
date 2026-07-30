package com.moyoung.classes.meditation.onlineclass;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.gson.Gson;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.completed.model.ClassesRecentBean;
import com.moyoung.classes.completed.model.ClassesRecentModel;
import com.moyoung.classes.databinding.ActivityMeditationOnlineClassDoneBinding;
import com.moyoung.classes.db.ClassesHistory;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassBean;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassDoneEvent;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes4.dex */
public class OnlineClassDoneActivity extends BaseVBActivity<ActivityMeditationOnlineClassDoneBinding> {
    private OnlineClassBean onlineClassBean;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        OnlineClassBean onlineClassBean = this.onlineClassBean;
        if (onlineClassBean != null) {
            s0.logEvent("点击冥想课程done", "meditationCourseName", onlineClassBean.getTitle());
        }
        finish();
    }

    private void recordRecentPlayedClass(OnlineClassBean onlineClassBean, int i8) {
        com.moyoung.dafit.module.common.imageload.c.load(((ActivityMeditationOnlineClassDoneBinding) this.binding).ivBg, onlineClassBean.getBigImgUrl(), R$drawable.shape_net_img_placeholder, c5.d.getScreenWidth(this), c5.d.getScreenHeight(this));
        ClassesRecentModel.recordRecentPlayedClass(new ClassesRecentBean(onlineClassBean.getId(), 0, onlineClassBean.getTitle(), onlineClassBean.getTitleLanguageList(), onlineClassBean.getThumbUrl(), i8));
        org.greenrobot.eventbus.c.getDefault().post(new OnlineClassDoneEvent());
    }

    private void save2ClassesHistory(OnlineClassBean onlineClassBean, int i8) {
        long longExtra = getIntent().getLongExtra("startTimestamp", -1L);
        ClassesHistory classesHistory = new ClassesHistory();
        classesHistory.setClassesId(onlineClassBean.getId());
        classesHistory.setClassesTitle(onlineClassBean.getTitle());
        classesHistory.setClassesType(0);
        classesHistory.setStartTimestamp(longExtra);
        classesHistory.setSpentTime(i8);
        classesHistory.setSpentKcal(0);
        classesHistory.setClassesJson(new Gson().toJson(onlineClassBean));
        new com.moyoung.classes.db.d().save(classesHistory);
    }

    public static void start(Context context, OnlineClassBean onlineClassBean, long j8) {
        Intent intent = new Intent(context, (Class<?>) OnlineClassDoneActivity.class);
        intent.putExtra(OnlineClassBean.class.getName(), onlineClassBean);
        intent.putExtra("startTimestamp", j8);
        context.startActivity(intent);
    }

    public static void startFromHistory(Context context) {
        Intent intent = new Intent(context, (Class<?>) OnlineClassDoneActivity.class);
        intent.putExtra("isFromHistory", true);
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
        ((ActivityMeditationOnlineClassDoneBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.onlineclass.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineClassDoneActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        if (getIntent().getBooleanExtra("isFromHistory", false)) {
            ((ActivityMeditationOnlineClassDoneBinding) this.binding).tvDone.setVisibility(8);
            return;
        }
        OnlineClassBean onlineClassBean = (OnlineClassBean) getIntent().getSerializableExtra(OnlineClassBean.class.getName());
        this.onlineClassBean = onlineClassBean;
        recordRecentPlayedClass(this.onlineClassBean, onlineClassBean.getDuration() * 60000);
    }
}
