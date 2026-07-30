package com.moyoung.classes.completed.model;

import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ClassesRecentModel {
    public static final String RECENT_CLASSES_RECORD = "classes_recent_record";

    private static void deleteAlreadyRecentClass(List<ClassesRecentBean> list, ClassesRecentBean classesRecentBean) {
        for (ClassesRecentBean classesRecentBean2 : list) {
            if (classesRecentBean2.getClassesType() == classesRecentBean.getClassesType() && classesRecentBean2.getClassId() == classesRecentBean.getClassId()) {
                list.remove(classesRecentBean2);
                return;
            }
        }
    }

    public static List<ClassesRecentBean> getRecentPlayedClassList() {
        return s.json2List(g.getInstance().getString(RECENT_CLASSES_RECORD, null), ClassesRecentBean[].class);
    }

    public static void recordRecentPlayedClass(ClassesRecentBean classesRecentBean) {
        List recentPlayedClassList = getRecentPlayedClassList();
        if (recentPlayedClassList == null) {
            recentPlayedClassList = new ArrayList();
        }
        deleteAlreadyRecentClass(recentPlayedClassList, classesRecentBean);
        recentPlayedClassList.add(0, classesRecentBean);
        if (recentPlayedClassList.size() >= 5) {
            recentPlayedClassList = recentPlayedClassList.subList(0, 5);
        }
        g.getInstance().putString(RECENT_CLASSES_RECORD, s.bean2Json(recentPlayedClassList));
    }
}
