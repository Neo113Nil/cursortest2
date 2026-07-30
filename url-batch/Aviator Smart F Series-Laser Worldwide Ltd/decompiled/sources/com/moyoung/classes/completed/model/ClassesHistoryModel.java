package com.moyoung.classes.completed.model;

import com.google.gson.Gson;
import com.moyoung.classes.ClassesLanguageBean;
import com.moyoung.classes.coach.model.CoachCoursePlayedBean;
import com.moyoung.classes.db.ClassesHistory;
import com.moyoung.classes.db.d;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassBean;
import com.moyoung.dafit.module.common.utils.ServerLanguageUtil;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ClassesHistoryModel {
    public static final int TAB_POSITION_ALL = 4;
    public static final int TAB_POSITION_DAY = 0;
    public static final int TAB_POSITION_MONTH = 2;
    public static final int TAB_POSITION_WEEK = 1;
    public static final int TAB_POSITION_YEAR = 3;

    public static Map<String, Integer> calculateTotalInfo(List<ClassesHistory> list) {
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ClassesHistory classesHistory = list.get(i11);
            i9 += classesHistory.getSpentTime();
            i8 += classesHistory.getSpentKcal();
            i10++;
        }
        n.getDecimalFormat("0.0").format(i8);
        HashMap hashMap = new HashMap();
        hashMap.put("totalSpentTime", Integer.valueOf((int) TimeUnit.MILLISECONDS.toMinutes(i9)));
        hashMap.put("totalSpentKcal", Integer.valueOf(i8));
        hashMap.put("totalTimes", Integer.valueOf(i10));
        return hashMap;
    }

    public static CoachCoursePlayedBean getCoachCoursePlayedBean(ClassesHistory classesHistory) {
        return (CoachCoursePlayedBean) new Gson().fromJson(classesHistory.getClassesJson(), CoachCoursePlayedBean.class);
    }

    public static OnlineClassBean getMedationOnlineClassBean(ClassesHistory classesHistory) {
        return (OnlineClassBean) new Gson().fromJson(classesHistory.getClassesJson(), OnlineClassBean.class);
    }

    public static String getTitleWithLocale(List<ClassesLanguageBean> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        String requestLanguage = ServerLanguageUtil.getRequestLanguage();
        ClassesLanguageBean classesLanguageBean = null;
        for (ClassesLanguageBean classesLanguageBean2 : list) {
            if (requestLanguage.equals(classesLanguageBean2.getCode())) {
                return classesLanguageBean2.getTranslate();
            }
            if ("en".equals(classesLanguageBean2.getCode())) {
                classesLanguageBean = classesLanguageBean2;
            }
        }
        return classesLanguageBean != null ? classesLanguageBean.getTranslate() : list.get(0).getTranslate();
    }

    public static List<ClassesHistory> queryClassesHistoryList(int i8) {
        ArrayList arrayList = new ArrayList();
        d dVar = new d();
        Date sameDayStartTime = m.getSameDayStartTime(new Date());
        if (i8 == 0) {
            arrayList.addAll(dVar.getTodayList(sameDayStartTime));
        } else if (i8 == 1) {
            arrayList.addAll(dVar.getWeekList(sameDayStartTime));
        } else if (i8 == 2) {
            arrayList.addAll(dVar.getMonthTrainingList(sameDayStartTime));
        } else if (i8 == 3) {
            arrayList.addAll(dVar.getYearTrainingList(sameDayStartTime));
        } else if (i8 == 4) {
            arrayList.addAll(dVar.getAll());
        }
        return arrayList;
    }
}
