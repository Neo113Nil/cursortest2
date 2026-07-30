package com.moyoung.classes.coach.model;

import com.moyoung.classes.ClassesLanguageBean;
import com.moyoung.classes.coach.model.net.CoachCourseDetailResp;
import com.moyoung.dafit.module.common.utils.g0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachActionBean implements Serializable {
    private final String actionNameAudio;
    private final String actionVideo;
    private final String bgAudio;
    private final String countdownAudio;
    private final String courseZipUrl;
    private final String coverUrl;
    private final String explainAudio;
    private final int id;
    private final boolean isShowRepeatCount;
    private final List<ClassesLanguageBean> nameLanguageList;
    private final int repeatCount;
    private final String restAudio;
    private int restDuration;
    private final String title;
    private int videoDurationMs;

    public CoachActionBean(int i8, String str, List<ClassesLanguageBean> list, String str2, String str3, boolean z7, int i9, int i10, int i11, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.id = i8;
        this.title = str;
        this.nameLanguageList = list;
        this.courseZipUrl = str2;
        this.coverUrl = str3;
        this.isShowRepeatCount = z7;
        this.repeatCount = i11;
        this.videoDurationMs = i9;
        this.restDuration = i10;
        this.actionVideo = str4;
        this.bgAudio = str5;
        this.actionNameAudio = str6;
        this.countdownAudio = str7;
        this.explainAudio = str8;
        this.restAudio = str9;
    }

    public static List<CoachActionBean> convert(List<CoachCourseDetailResp.Courses> list, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoachCourseDetailResp.Courses> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convert(it.next(), str, str2, str3));
        }
        return arrayList;
    }

    public static List<CoachActionBean> getActionList(CoachCourseBean coachCourseBean) {
        List<CoachActionTypeBean> actionTypeBeanList = coachCourseBean.getActionTypeBeanList();
        ArrayList arrayList = new ArrayList();
        Iterator<CoachActionTypeBean> it = actionTypeBeanList.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getActionBeanList());
        }
        return arrayList;
    }

    public int getActionDurationMs() {
        return getVideoDurationMs() * getRepeatCount();
    }

    public String getActionNameAudio() {
        return this.actionNameAudio;
    }

    public String getActionVideo() {
        return this.actionVideo;
    }

    public String getBgAudio() {
        return this.bgAudio;
    }

    public String getCountdownAudio() {
        return this.countdownAudio;
    }

    public String getCourseZipUrl() {
        return this.courseZipUrl;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public String getExplainAudio() {
        return this.explainAudio;
    }

    public int getId() {
        return this.id;
    }

    public List<ClassesLanguageBean> getNameLanguageList() {
        return this.nameLanguageList;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public String getRestAudio() {
        return this.restAudio;
    }

    public int getRestDuration() {
        return this.restDuration;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVideoDurationMs() {
        return this.videoDurationMs;
    }

    public boolean isShowRepeatCount() {
        return this.isShowRepeatCount;
    }

    public void setRestDuration(int i8) {
        this.restDuration = i8;
    }

    public void setVideoDurationMs(int i8) {
        this.videoDurationMs = i8;
    }

    public static CoachActionBean convert(CoachCourseDetailResp.Courses courses, String str, String str2, String str3) {
        CoachCourseDetailResp.Workout workout = courses.getWorkout();
        return new CoachActionBean(workout.getId(), workout.getName(), workout.getName_language(), str, workout.getPicture(), courses.getIs_show_spent() == 0, workout.getVideo_time(), Integer.parseInt(courses.getRest_duration()), Integer.parseInt(courses.getLoop_number()), g0.getFileNameFromUrl(workout.getVideo()), g0.getFileNameFromUrl(str2), g0.getFileNameFromUrl(workout.getAction_name_audio()), g0.getFileNameFromUrl(str3), g0.getFileNameFromUrl(workout.getAction_explanation_audio()), g0.getFileNameFromUrl(workout.getRest_audio()));
    }
}
