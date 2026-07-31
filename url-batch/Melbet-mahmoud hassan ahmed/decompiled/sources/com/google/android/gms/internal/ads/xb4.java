package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class xb4 {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f14114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14115b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14116c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14117d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14118e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14119f;

    private xb4(List<byte[]> list, int i7, int i8, int i9, float f7, String str) {
        this.f14114a = list;
        this.f14115b = i7;
        this.f14116c = i8;
        this.f14117d = i9;
        this.f14118e = f7;
        this.f14119f = str;
    }

    public static xb4 a(dr2 dr2Var) {
        String str;
        int i7;
        int i8;
        float f7;
        try {
            dr2Var.g(4);
            int s7 = (dr2Var.s() & 3) + 1;
            if (s7 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int s8 = dr2Var.s() & 31;
            for (int i9 = 0; i9 < s8; i9++) {
                arrayList.add(b(dr2Var));
            }
            int s9 = dr2Var.s();
            for (int i10 = 0; i10 < s9; i10++) {
                arrayList.add(b(dr2Var));
            }
            if (s8 > 0) {
                sg2 d7 = th2.d((byte[]) arrayList.get(0), s7 + 1, ((byte[]) arrayList.get(0)).length);
                int i11 = d7.f11820e;
                int i12 = d7.f11821f;
                float f8 = d7.f11822g;
                str = zw1.a(d7.f11816a, d7.f11817b, d7.f11818c);
                i7 = i11;
                i8 = i12;
                f7 = f8;
            } else {
                str = null;
                i7 = -1;
                i8 = -1;
                f7 = 1.0f;
            }
            return new xb4(arrayList, s7, i7, i8, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw dz.a("Error parsing AVC config", e7);
        }
    }

    private static byte[] b(dr2 dr2Var) {
        int w6 = dr2Var.w();
        int k7 = dr2Var.k();
        dr2Var.g(w6);
        return zw1.c(dr2Var.h(), k7, w6);
    }
}
