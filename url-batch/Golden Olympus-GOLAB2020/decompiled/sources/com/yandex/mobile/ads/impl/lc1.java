package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class lc1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28505a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f28506b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f28507c;

    /* renamed from: d, reason: collision with root package name */
    public final List<ze0> f28508d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28509e;

    @Deprecated
    public lc1() {
        throw null;
    }

    private static List<ze0> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new ze0(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private lc1(int i4, byte[] bArr, Map map, List list, boolean z4) {
        this.f28505a = i4;
        this.f28506b = bArr;
        this.f28507c = map;
        if (list == null) {
            this.f28508d = null;
        } else {
            this.f28508d = Collections.unmodifiableList(list);
        }
        this.f28509e = z4;
    }

    private static Map<String, String> a(List<ze0> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (ze0 ze0Var : list) {
            treeMap.put(ze0Var.a(), ze0Var.b());
        }
        return treeMap;
    }

    @Deprecated
    public lc1(int i4, byte[] bArr, Map map, boolean z4) {
        this(i4, bArr, map, a((Map<String, String>) map), z4);
    }

    public lc1(int i4, byte[] bArr, boolean z4, long j4, List<ze0> list) {
        this(i4, bArr, a(list), list, z4);
    }
}
