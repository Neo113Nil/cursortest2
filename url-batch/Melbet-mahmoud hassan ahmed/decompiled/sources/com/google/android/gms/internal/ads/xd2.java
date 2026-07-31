package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class xd2 implements ij2<yd2> {

    /* renamed from: a, reason: collision with root package name */
    private final ij2<nj2> f14149a;

    /* renamed from: b, reason: collision with root package name */
    private final ks2 f14150b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f14151c;

    /* renamed from: d, reason: collision with root package name */
    private final tn0 f14152d;

    public xd2(nf2<nj2> nf2Var, ks2 ks2Var, Context context, tn0 tn0Var) {
        this.f14149a = nf2Var;
        this.f14150b = ks2Var;
        this.f14151c = context;
        this.f14152d = tn0Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<yd2> a() {
        return rb3.m(this.f14149a.a(), new e43() { // from class: com.google.android.gms.internal.ads.wd2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return xd2.this.b((nj2) obj);
            }
        }, wo0.f13899f);
    }

    final /* synthetic */ yd2 b(nj2 nj2Var) {
        String str;
        boolean z6;
        String str2;
        float f7;
        int i7;
        int i8;
        int i9;
        DisplayMetrics displayMetrics;
        pv pvVar = this.f14150b.f7619e;
        pv[] pvVarArr = pvVar.f10382l;
        if (pvVarArr != null) {
            str = null;
            boolean z7 = false;
            boolean z8 = false;
            z6 = false;
            for (pv pvVar2 : pvVarArr) {
                boolean z9 = pvVar2.f10384n;
                if (!z9 && !z7) {
                    str = pvVar2.f10376f;
                    z7 = true;
                }
                if (z9) {
                    if (z8) {
                        z8 = true;
                    } else {
                        z8 = true;
                        z6 = true;
                    }
                }
                if (z7 && z8) {
                    break;
                }
            }
        } else {
            str = pvVar.f10376f;
            z6 = pvVar.f10384n;
        }
        Resources resources = this.f14151c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f7 = 0.0f;
            i7 = 0;
            i8 = 0;
        } else {
            float f8 = displayMetrics.density;
            int i10 = displayMetrics.widthPixels;
            i8 = displayMetrics.heightPixels;
            str2 = this.f14152d.h().k();
            i7 = i10;
            f7 = f8;
        }
        StringBuilder sb = new StringBuilder();
        pv[] pvVarArr2 = pvVar.f10382l;
        if (pvVarArr2 != null) {
            boolean z10 = false;
            for (pv pvVar3 : pvVarArr2) {
                if (pvVar3.f10384n) {
                    z10 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i11 = pvVar3.f10380j;
                    if (i11 == -1) {
                        i11 = f7 != 0.0f ? (int) (pvVar3.f10381k / f7) : -1;
                    }
                    sb.append(i11);
                    sb.append("x");
                    int i12 = pvVar3.f10377g;
                    if (i12 == -2) {
                        i12 = f7 != 0.0f ? (int) (pvVar3.f10378h / f7) : -2;
                    }
                    sb.append(i12);
                }
            }
            if (z10) {
                if (sb.length() != 0) {
                    i9 = 0;
                    sb.insert(0, "|");
                } else {
                    i9 = 0;
                }
                sb.insert(i9, "320x50");
            }
        }
        return new yd2(pvVar, str, z6, sb.toString(), f7, i7, i8, str2, this.f14150b.f7630p);
    }
}
