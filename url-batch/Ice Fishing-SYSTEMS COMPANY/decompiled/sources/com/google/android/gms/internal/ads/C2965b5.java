package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2965b5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29401a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f29402b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f29403c;

    /* renamed from: d, reason: collision with root package name */
    public final List f29404d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29405e;

    public C2965b5(int i, byte[] bArr, Map map, List list, boolean z8) {
        this.f29401a = i;
        this.f29402b = bArr;
        this.f29403c = map;
        this.f29404d = list == null ? null : Collections.unmodifiableList(list);
        this.f29405e = z8;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new X4((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2965b5(int i, byte[] bArr, boolean z8, List list) {
        this(i, bArr, r0, list, z8);
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                X4 x42 = (X4) it.next();
                treeMap.put(x42.f28602a, x42.f28603b);
            }
        }
    }
}
