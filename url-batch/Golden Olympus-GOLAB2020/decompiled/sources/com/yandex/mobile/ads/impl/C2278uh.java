package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s31;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.uh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2278uh {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f33124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33125b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33126c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33127d;

    /* renamed from: e, reason: collision with root package name */
    public final float f33128e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33129f;

    private C2278uh(ArrayList arrayList, int i4, int i5, int i6, float f4, String str) {
        this.f33124a = arrayList;
        this.f33125b = i4;
        this.f33126c = i5;
        this.f33127d = i6;
        this.f33128e = f4;
        this.f33129f = str;
    }

    public static C2278uh a(sf1 sf1Var) {
        float f4;
        String str;
        int i4;
        int i5;
        try {
            sf1Var.f(4);
            int t4 = (sf1Var.t() & 3) + 1;
            if (t4 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int t5 = sf1Var.t() & 31;
            for (int i6 = 0; i6 < t5; i6++) {
                int z4 = sf1Var.z();
                int d4 = sf1Var.d();
                sf1Var.f(z4);
                arrayList.add(bq.a(sf1Var.c(), d4, z4));
            }
            int t6 = sf1Var.t();
            for (int i7 = 0; i7 < t6; i7++) {
                int z5 = sf1Var.z();
                int d5 = sf1Var.d();
                sf1Var.f(z5);
                arrayList.add(bq.a(sf1Var.c(), d5, z5));
            }
            if (t5 > 0) {
                s31.c b4 = s31.b((byte[]) arrayList.get(0), t4, ((byte[]) arrayList.get(0)).length);
                int i8 = b4.f31573e;
                int i9 = b4.f31574f;
                f4 = b4.f31575g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(b4.f31569a), Integer.valueOf(b4.f31570b), Integer.valueOf(b4.f31571c));
                i4 = i8;
                i5 = i9;
            } else {
                f4 = 1.0f;
                str = null;
                i4 = -1;
                i5 = -1;
            }
            return new C2278uh(arrayList, t4, i4, i5, f4, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw wf1.a("Error parsing AVC config", e4);
        }
    }
}
