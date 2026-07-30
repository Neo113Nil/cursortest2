package com.moyoung.classes.coach.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.moyoung.classes.ClassesLanguageBean;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachActionPlayedBean implements Serializable {
    private static final long serialVersionUID = 1;
    private final int actionId;
    private final int actionIndex;
    private final String actionName;
    private final String actionNameLanguageListJson;
    private long spentTimeMs;

    public CoachActionPlayedBean(int i8, int i9, String str, List<ClassesLanguageBean> list, long j8) {
        this.actionId = i8;
        this.actionIndex = i9;
        this.actionName = str;
        this.actionNameLanguageListJson = getActionNameLanguageListStr(list);
        this.spentTimeMs = j8;
    }

    private String getActionNameLanguageListStr(List<ClassesLanguageBean> list) {
        return new Gson().toJson(list);
    }

    public int getActionId() {
        return this.actionId;
    }

    public int getActionIndex() {
        return this.actionIndex;
    }

    public String getActionName() {
        return this.actionName;
    }

    public List<ClassesLanguageBean> getActionNameLanguageList() {
        return (List) new Gson().fromJson(this.actionNameLanguageListJson, new TypeToken<List<ClassesLanguageBean>>() { // from class: com.moyoung.classes.coach.model.CoachActionPlayedBean.1
        }.getType());
    }

    public String getActionNameLanguageListJson() {
        return this.actionNameLanguageListJson;
    }

    public long getSpentTimeMs() {
        return this.spentTimeMs;
    }

    public void setSpentTimeMs(long j8) {
        this.spentTimeMs = j8;
    }
}
