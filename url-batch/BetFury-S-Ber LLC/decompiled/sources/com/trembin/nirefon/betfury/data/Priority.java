package com.trembin.nirefon.betfury.data;

import defpackage.hn;
import defpackage.n9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class Priority {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ Priority[] $VALUES;
    public static final Priority LOW = new Priority("LOW", 0);
    public static final Priority MEDIUM = new Priority("MEDIUM", 1);
    public static final Priority HIGH = new Priority("HIGH", 2);
    public static final Priority URGENT = new Priority("URGENT", 3);

    private static final /* synthetic */ Priority[] $values() {
        return new Priority[]{LOW, MEDIUM, HIGH, URGENT};
    }

    static {
        Priority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private Priority(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }
}
