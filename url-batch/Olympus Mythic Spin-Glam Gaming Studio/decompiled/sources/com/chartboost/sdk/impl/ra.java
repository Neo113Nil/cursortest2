package com.chartboost.sdk.impl;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ra {
    public static final ra c = new ra("LOADING", 0, 0);
    public static final ra d = new ra(POBOMSDKLogConstants.MSG_OMSDK_LOADED_EVENT, 1, 1);
    public static final ra e = new ra("DISPLAYED", 2, 2);
    public static final ra f = new ra("CACHED", 3, 3);
    public static final ra g = new ra("DISMISSING", 4, 4);
    public static final ra h = new ra("NONE", 5, 5);
    public static final /* synthetic */ ra[] i;
    public static final /* synthetic */ EnumEntries j;
    public final int b;

    static {
        ra[] a = a();
        i = a;
        j = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ ra[] a() {
        return new ra[]{c, d, e, f, g, h};
    }

    public static ra valueOf(String str) {
        return (ra) Enum.valueOf(ra.class, str);
    }

    public static ra[] values() {
        return (ra[]) i.clone();
    }

    public ra(String str, int i2, int i3) {
        this.b = i3;
    }
}
