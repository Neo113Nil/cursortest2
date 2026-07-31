package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13716a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13717b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f13718c;

    /* renamed from: d, reason: collision with root package name */
    public final List<s5> f13719d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13720e;

    private w5(int i7, byte[] bArr, Map<String, String> map, List<s5> list, boolean z6, long j7) {
        this.f13716a = i7;
        this.f13717b = bArr;
        this.f13718c = map;
        this.f13719d = list == null ? null : Collections.unmodifiableList(list);
        this.f13720e = z6;
    }

    @Deprecated
    public w5(int i7, byte[] bArr, Map<String, String> map, boolean z6, long j7) {
        this(i7, bArr, map, a(map), z6, j7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w5(int i7, byte[] bArr, boolean z6, long j7, List<s5> list) {
        this(i7, bArr, r0, list, z6, j7);
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (s5 s5Var : list) {
                treeMap.put(s5Var.a(), s5Var.b());
            }
        }
    }

    @Deprecated
    public w5(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, a(map), false, 0L);
    }

    private static List<s5> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new s5(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
