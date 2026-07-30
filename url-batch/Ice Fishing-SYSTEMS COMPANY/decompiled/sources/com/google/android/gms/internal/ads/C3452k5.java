package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3452k5 {

    /* renamed from: a, reason: collision with root package name */
    public long f32254a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32255b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32256c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32257d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32258e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32259f;

    /* renamed from: g, reason: collision with root package name */
    public final long f32260g;

    /* renamed from: h, reason: collision with root package name */
    public final List f32261h;

    public C3452k5(String str, String str2, long j9, long j10, long j11, long j12, List list) {
        this.f32255b = str;
        this.f32256c = true == "".equals(str2) ? null : str2;
        this.f32257d = j9;
        this.f32258e = j10;
        this.f32259f = j11;
        this.f32260g = j12;
        this.f32261h = list;
    }

    public static C3452k5 a(C3506l5 c3506l5) {
        if (C3614n5.v(c3506l5) != 538247942) {
            throw new IOException();
        }
        String z8 = C3614n5.z(c3506l5);
        String z9 = C3614n5.z(c3506l5);
        long x3 = C3614n5.x(c3506l5);
        long x9 = C3614n5.x(c3506l5);
        long x10 = C3614n5.x(c3506l5);
        long x11 = C3614n5.x(c3506l5);
        int v6 = C3614n5.v(c3506l5);
        if (v6 < 0) {
            throw new IOException(D.y.j(v6, "readHeaderList size=", new StringBuilder(String.valueOf(v6).length() + 20)));
        }
        List arrayList = v6 == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < v6; i++) {
            arrayList.add(new X4(C3614n5.z(c3506l5).intern(), C3614n5.z(c3506l5).intern()));
        }
        return new C3452k5(z8, z9, x3, x9, x10, x11, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3452k5(String str, T4 t42) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = t42.f27710b;
        long j9 = t42.f27711c;
        long j10 = t42.f27712d;
        long j11 = t42.f27713e;
        long j12 = t42.f27714f;
        List list = t42.f27716h;
        if (list == 0) {
            Map map = t42.f27715g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new X4((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}
