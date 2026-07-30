package com.moyoung.classes.coach.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.moyoung.classes.ClassesLanguageBean;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachCoursePlayedBean implements Serializable {
    private static final long serialVersionUID = 1;
    private final String actionPlayedListJson;
    private final long completedTimestamp;
    private final int courseDuration;
    private final int courseId;
    private final int courseKcal;
    private final int courseLevel;
    private final String courseNameLanguageListJson;
    private final String courseTitle;
    private final String coverUrl;
    private long id;
    private final long startTimestamp;

    public CoachCoursePlayedBean(int i8, long j8, long j9, String str, String str2, List<ClassesLanguageBean> list, int i9, int i10, int i11, List<CoachActionPlayedBean> list2) {
        this.courseId = i8;
        this.startTimestamp = j8;
        this.completedTimestamp = j9;
        this.coverUrl = str;
        this.courseTitle = str2;
        this.courseNameLanguageListJson = getCourseNameLanguageListStr(list);
        this.courseDuration = i9;
        this.courseKcal = i10;
        this.courseLevel = i11;
        this.actionPlayedListJson = getActionPlayedListStr(list2);
    }

    private String getActionPlayedListStr(List<CoachActionPlayedBean> list) {
        return new Gson().toJson(list);
    }

    private String getCourseNameLanguageListStr(List<ClassesLanguageBean> list) {
        return new Gson().toJson(list);
    }

    public List<CoachActionPlayedBean> getActionPlayedList() {
        return (List) new Gson().fromJson(this.actionPlayedListJson, new TypeToken<List<CoachActionPlayedBean>>() { // from class: com.moyoung.classes.coach.model.CoachCoursePlayedBean.2
        }.getType());
    }

    public String getActionPlayedListJson() {
        return this.actionPlayedListJson;
    }

    public long getCompletedTimestamp() {
        return this.completedTimestamp;
    }

    public int getCourseDuration() {
        return this.courseDuration;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public int getCourseKcal() {
        return this.courseKcal;
    }

    public int getCourseLevel() {
        return this.courseLevel;
    }

    public List<ClassesLanguageBean> getCourseNameLanguageList() {
        return (List) new Gson().fromJson(this.courseNameLanguageListJson, new TypeToken<List<ClassesLanguageBean>>() { // from class: com.moyoung.classes.coach.model.CoachCoursePlayedBean.1
        }.getType());
    }

    public String getCourseNameLanguageListJson() {
        return this.courseNameLanguageListJson;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public long getId() {
        return this.id;
    }

    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public void setId(long j8) {
        this.id = j8;
    }
}
