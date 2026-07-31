package com.chartboost.sdk.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vj {
    public static final a c;
    public static final Map d;
    public static final vj e = new vj("TIMESTAMP", 0, "[TIMESTAMP]");
    public static final vj f = new vj("CACHEBUSTING", 1, "[CACHEBUSTING]");
    public static final vj g = new vj("ERRORCODE", 2, "[ERRORCODE]");
    public static final vj h = new vj("REASON", 3, "[REASON]");
    public static final vj i = new vj("LIMITADTRACKING", 4, "[LIMITADTRACKING]");
    public static final vj j = new vj("APPBUNDLE", 5, "[APPBUNDLE]");
    public static final vj k = new vj("OMIDPARTNER", 6, "[OMIDPARTNER]");
    public static final vj l = new vj("INVENTORYSTATE", 7, "[INVENTORYSTATE]");
    public static final vj m = new vj("CLICKPOS", 8, "[CLICKPOS]");
    public static final vj n = new vj("CLICKTYPE", 9, "[CLICKTYPE]");
    public static final vj o = new vj("PLAYERSIZE", 10, "[PLAYERSIZE]");
    public static final vj p = new vj("ASSETURI", 11, "[ASSETURI]");
    public static final vj q = new vj("CONTENTPLAYHEAD", 12, "[CONTENTPLAYHEAD]");
    public static final vj r = new vj("MEDIAPLAYHEAD", 13, "[MEDIAPLAYHEAD]");
    public static final vj s = new vj("ADPLAYHEAD", 14, "[ADPLAYHEAD]");
    public static final /* synthetic */ vj[] t;
    public static final /* synthetic */ EnumEntries u;
    public final String b;

    static {
        vj[] a2 = a();
        t = a2;
        u = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
        EnumEntries c2 = c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(c2, 10)), 16));
        for (Object obj : c2) {
            linkedHashMap.put(((vj) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public static final /* synthetic */ vj[] a() {
        return new vj[]{e, f, g, h, i, j, k, l, m, n, o, p, q, r, s};
    }

    public static EnumEntries c() {
        return u;
    }

    public static vj valueOf(String str) {
        return (vj) Enum.valueOf(vj.class, str);
    }

    public static vj[] values() {
        return (vj[]) t.clone();
    }

    public vj(String str, int i2, String str2) {
        this.b = str2;
    }

    public static final class a {
        public final vj a(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return (vj) vj.d.get(token);
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
