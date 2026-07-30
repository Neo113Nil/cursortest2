package com.moyoung.classes.completed.model;

import com.moyoung.classes.ClassesLanguageBean;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ClassesRecentBean {
    private final int classDuration;
    private final int classId;
    private final int classesType;
    private final String thumbUrl;
    private final List<ClassesLanguageBean> titleLanguageList;

    public ClassesRecentBean(int i8, int i9, String str, List<ClassesLanguageBean> list, String str2, int i10) {
        if (list == null || list.size() == 0) {
            list = new ArrayList<>();
            list.add(new ClassesLanguageBean("en", str));
        }
        this.classId = i8;
        this.classesType = i9;
        this.titleLanguageList = list;
        this.thumbUrl = str2;
        this.classDuration = i10;
    }

    public int getClassDuration() {
        return this.classDuration;
    }

    public int getClassId() {
        return this.classId;
    }

    public int getClassesType() {
        return this.classesType;
    }

    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public List<ClassesLanguageBean> getTitleLanguageList() {
        return this.titleLanguageList;
    }
}
