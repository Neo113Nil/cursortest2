package com.moyoung.classes.completed.model;

import com.moyoung.classes.db.ClassesHistory;

/* loaded from: classes4.dex */
public class ClassesType {
    public static final int TYPE_COACH = 1;
    public static final int TYPE_MEDITATION = 0;

    public static boolean isCoachType(ClassesHistory classesHistory) {
        return classesHistory.getClassesType() == 1;
    }
}
