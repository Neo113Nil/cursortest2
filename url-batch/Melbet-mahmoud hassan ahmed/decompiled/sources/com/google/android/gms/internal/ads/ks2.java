package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import u2.e;

/* loaded from: classes.dex */
public final class ks2 {

    /* renamed from: a, reason: collision with root package name */
    public final s00 f7615a;

    /* renamed from: b, reason: collision with root package name */
    public final r90 f7616b;

    /* renamed from: c, reason: collision with root package name */
    public final lc2 f7617c;

    /* renamed from: d, reason: collision with root package name */
    public final kv f7618d;

    /* renamed from: e, reason: collision with root package name */
    public final pv f7619e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7620f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<String> f7621g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<String> f7622h;

    /* renamed from: i, reason: collision with root package name */
    public final b40 f7623i;

    /* renamed from: j, reason: collision with root package name */
    public final vv f7624j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7625k;

    /* renamed from: l, reason: collision with root package name */
    public final u2.a f7626l;

    /* renamed from: m, reason: collision with root package name */
    public final u2.g f7627m;

    /* renamed from: n, reason: collision with root package name */
    public final ux f7628n;

    /* renamed from: o, reason: collision with root package name */
    public final zr2 f7629o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7630p;

    /* renamed from: q, reason: collision with root package name */
    public final yx f7631q;

    /* synthetic */ ks2(is2 is2Var, js2 js2Var) {
        pv pvVar;
        String str;
        yx yxVar;
        kv kvVar;
        kv kvVar2;
        kv kvVar3;
        kv kvVar4;
        kv kvVar5;
        kv kvVar6;
        kv kvVar7;
        kv kvVar8;
        kv kvVar9;
        kv kvVar10;
        kv kvVar11;
        kv kvVar12;
        kv kvVar13;
        kv kvVar14;
        kv kvVar15;
        kv kvVar16;
        kv kvVar17;
        kv kvVar18;
        kv kvVar19;
        kv kvVar20;
        kv kvVar21;
        kv kvVar22;
        kv kvVar23;
        kv kvVar24;
        s00 s00Var;
        b40 b40Var;
        s00 s00Var2;
        b40 b40Var2;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        ArrayList arrayList3;
        b40 b40Var3;
        b40 b40Var4;
        vv vvVar;
        int i7;
        u2.a aVar;
        u2.g gVar;
        ux uxVar;
        r90 r90Var;
        xr2 xr2Var;
        boolean z6;
        lc2 lc2Var;
        boolean z7;
        pvVar = is2Var.f6762b;
        this.f7619e = pvVar;
        str = is2Var.f6763c;
        this.f7620f = str;
        yxVar = is2Var.f6778r;
        this.f7631q = yxVar;
        kvVar = is2Var.f6761a;
        int i8 = kvVar.f7643f;
        kvVar2 = is2Var.f6761a;
        long j7 = kvVar2.f7644g;
        kvVar3 = is2Var.f6761a;
        Bundle bundle = kvVar3.f7645h;
        kvVar4 = is2Var.f6761a;
        int i9 = kvVar4.f7646i;
        kvVar5 = is2Var.f6761a;
        List<String> list = kvVar5.f7647j;
        kvVar6 = is2Var.f6761a;
        boolean z8 = kvVar6.f7648k;
        kvVar7 = is2Var.f6761a;
        int i10 = kvVar7.f7649l;
        kvVar8 = is2Var.f6761a;
        boolean z9 = true;
        if (!kvVar8.f7650m) {
            z7 = is2Var.f6765e;
            if (!z7) {
                z9 = false;
            }
        }
        kvVar9 = is2Var.f6761a;
        String str2 = kvVar9.f7651n;
        kvVar10 = is2Var.f6761a;
        p00 p00Var = kvVar10.f7652o;
        kvVar11 = is2Var.f6761a;
        Location location = kvVar11.f7653p;
        kvVar12 = is2Var.f6761a;
        String str3 = kvVar12.f7654q;
        kvVar13 = is2Var.f6761a;
        Bundle bundle2 = kvVar13.f7655r;
        kvVar14 = is2Var.f6761a;
        Bundle bundle3 = kvVar14.f7656s;
        kvVar15 = is2Var.f6761a;
        List<String> list2 = kvVar15.f7657t;
        kvVar16 = is2Var.f6761a;
        String str4 = kvVar16.f7658u;
        kvVar17 = is2Var.f6761a;
        String str5 = kvVar17.f7659v;
        kvVar18 = is2Var.f6761a;
        boolean z10 = kvVar18.f7660w;
        kvVar19 = is2Var.f6761a;
        av avVar = kvVar19.f7661x;
        kvVar20 = is2Var.f6761a;
        int i11 = kvVar20.f7662y;
        kvVar21 = is2Var.f6761a;
        String str6 = kvVar21.f7663z;
        kvVar22 = is2Var.f6761a;
        List<String> list3 = kvVar22.A;
        kvVar23 = is2Var.f6761a;
        int A = a3.g2.A(kvVar23.B);
        kvVar24 = is2Var.f6761a;
        this.f7618d = new kv(i8, j7, bundle, i9, list, z8, i10, z9, str2, p00Var, location, str3, bundle2, bundle3, list2, str4, str5, z10, avVar, i11, str6, list3, A, kvVar24.C);
        s00Var = is2Var.f6764d;
        if (s00Var != null) {
            s00Var2 = is2Var.f6764d;
        } else {
            b40Var = is2Var.f6768h;
            if (b40Var != null) {
                b40Var2 = is2Var.f6768h;
                s00Var2 = b40Var2.f3207k;
            } else {
                s00Var2 = null;
            }
        }
        this.f7615a = s00Var2;
        arrayList = is2Var.f6766f;
        this.f7621g = arrayList;
        arrayList2 = is2Var.f6767g;
        this.f7622h = arrayList2;
        arrayList3 = is2Var.f6766f;
        if (arrayList3 == null) {
            b40Var4 = null;
        } else {
            b40Var3 = is2Var.f6768h;
            b40Var4 = b40Var3 == null ? new b40(new e.a().a()) : is2Var.f6768h;
        }
        this.f7623i = b40Var4;
        vvVar = is2Var.f6769i;
        this.f7624j = vvVar;
        i7 = is2Var.f6773m;
        this.f7625k = i7;
        aVar = is2Var.f6770j;
        this.f7626l = aVar;
        gVar = is2Var.f6771k;
        this.f7627m = gVar;
        uxVar = is2Var.f6772l;
        this.f7628n = uxVar;
        r90Var = is2Var.f6774n;
        this.f7616b = r90Var;
        xr2Var = is2Var.f6775o;
        this.f7629o = new zr2(xr2Var, null);
        z6 = is2Var.f6776p;
        this.f7630p = z6;
        lc2Var = is2Var.f6777q;
        this.f7617c = lc2Var;
    }

    public final b60 a() {
        u2.g gVar = this.f7627m;
        if (gVar == null && this.f7626l == null) {
            return null;
        }
        return gVar != null ? gVar.g() : this.f7626l.g();
    }
}
