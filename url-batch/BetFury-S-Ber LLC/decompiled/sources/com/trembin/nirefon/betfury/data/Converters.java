package com.trembin.nirefon.betfury.data;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class Converters {
    public final String fromPriority(Priority priority) {
        priority.getClass();
        return priority.name();
    }

    public final Priority toPriority(String str) {
        str.getClass();
        return Priority.valueOf(str);
    }
}
