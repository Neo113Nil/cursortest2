package com.chartboost.sdk.impl;

import com.facebook.share.internal.ShareConstants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class jc {
    public static final jc c = new jc("UNKNOWN", 0, 0);
    public static final jc d = new jc("HTML", 1, 1);
    public static final jc e = new jc(ShareConstants.VIDEO_URL, 2, 2);
    public static final jc f = new jc("AUDIO", 3, 3);
    public static final jc g = new jc("NATIVE", 4, 4);
    public static final /* synthetic */ jc[] h;
    public static final /* synthetic */ EnumEntries i;
    public final int b;

    static {
        jc[] a = a();
        h = a;
        i = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ jc[] a() {
        return new jc[]{c, d, e, f, g};
    }

    public static EnumEntries b() {
        return i;
    }

    public static jc valueOf(String str) {
        return (jc) Enum.valueOf(jc.class, str);
    }

    public static jc[] values() {
        return (jc[]) h.clone();
    }

    public jc(String str, int i2, int i3) {
        this.b = i3;
    }

    public final int c() {
        return this.b;
    }
}
