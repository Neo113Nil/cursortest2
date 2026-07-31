package com.chartboost.sdk.impl;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {
    public static final u b = new u("BANNER", 0);
    public static final u c = new u("INTERSTITIAL", 1);
    public static final u d = new u(BrandSafetyUtils.k, 2);
    public static final /* synthetic */ u[] e;
    public static final /* synthetic */ EnumEntries f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    static {
        u[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public static final /* synthetic */ u[] a() {
        return new u[]{b, c, d};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) e.clone();
    }

    public final boolean b() {
        return a.a[ordinal()] == 1;
    }

    public u(String str, int i) {
    }
}
