package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j64 extends d54<Integer> {

    /* renamed from: s, reason: collision with root package name */
    private static final zo f6993s;

    /* renamed from: j, reason: collision with root package name */
    private final v54[] f6994j;

    /* renamed from: k, reason: collision with root package name */
    private final ei0[] f6995k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<v54> f6996l;

    /* renamed from: m, reason: collision with root package name */
    private final Map<Object, Long> f6997m;

    /* renamed from: n, reason: collision with root package name */
    private final e83<Object, z44> f6998n;

    /* renamed from: o, reason: collision with root package name */
    private int f6999o;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f7000p;

    /* renamed from: q, reason: collision with root package name */
    private i64 f7001q;

    /* renamed from: r, reason: collision with root package name */
    private final f54 f7002r;

    static {
        g4 g4Var = new g4();
        g4Var.a("MergingMediaSource");
        f6993s = g4Var.c();
    }

    public j64(boolean z6, boolean z7, v54... v54VarArr) {
        f54 f54Var = new f54();
        this.f6994j = v54VarArr;
        this.f7002r = f54Var;
        this.f6996l = new ArrayList<>(Arrays.asList(v54VarArr));
        this.f6999o = -1;
        this.f6995k = new ei0[v54VarArr.length];
        this.f7000p = new long[0][];
        this.f6997m = new HashMap();
        this.f6998n = n83.a(8).b(2).c();
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final zo C() {
        v54[] v54VarArr = this.f6994j;
        return v54VarArr.length > 0 ? v54VarArr[0].C() : f6993s;
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final r54 h(s54 s54Var, g94 g94Var, long j7) {
        int length = this.f6994j.length;
        r54[] r54VarArr = new r54[length];
        int a7 = this.f6995k[0].a(s54Var.f5772a);
        for (int i7 = 0; i7 < length; i7++) {
            r54VarArr[i7] = this.f6994j[i7].h(s54Var.c(this.f6995k[i7].f(a7)), g94Var, j7 - this.f7000p[a7][i7]);
        }
        return new h64(this.f7002r, this.f7000p[a7], r54VarArr, null);
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void j(r54 r54Var) {
        h64 h64Var = (h64) r54Var;
        int i7 = 0;
        while (true) {
            v54[] v54VarArr = this.f6994j;
            if (i7 >= v54VarArr.length) {
                return;
            }
            v54VarArr[i7].j(h64Var.m(i7));
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.d54, com.google.android.gms.internal.ads.v44
    protected final void s(vt1 vt1Var) {
        super.s(vt1Var);
        for (int i7 = 0; i7 < this.f6994j.length; i7++) {
            z(Integer.valueOf(i7), this.f6994j[i7]);
        }
    }

    @Override // com.google.android.gms.internal.ads.d54, com.google.android.gms.internal.ads.v44
    protected final void u() {
        super.u();
        Arrays.fill(this.f6995k, (Object) null);
        this.f6999o = -1;
        this.f7001q = null;
        this.f6996l.clear();
        Collections.addAll(this.f6996l, this.f6994j);
    }

    @Override // com.google.android.gms.internal.ads.d54
    protected final /* bridge */ /* synthetic */ s54 w(Integer num, s54 s54Var) {
        if (num.intValue() == 0) {
            return s54Var;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d54, com.google.android.gms.internal.ads.v54
    public final void x() {
        i64 i64Var = this.f7001q;
        if (i64Var != null) {
            throw i64Var;
        }
        super.x();
    }

    @Override // com.google.android.gms.internal.ads.d54
    protected final /* bridge */ /* synthetic */ void y(Integer num, v54 v54Var, ei0 ei0Var) {
        int i7;
        if (this.f7001q != null) {
            return;
        }
        if (this.f6999o == -1) {
            i7 = ei0Var.b();
            this.f6999o = i7;
        } else {
            int b7 = ei0Var.b();
            int i8 = this.f6999o;
            if (b7 != i8) {
                this.f7001q = new i64(0);
                return;
            }
            i7 = i8;
        }
        if (this.f7000p.length == 0) {
            this.f7000p = (long[][]) Array.newInstance((Class<?>) long.class, i7, this.f6995k.length);
        }
        this.f6996l.remove(v54Var);
        this.f6995k[num.intValue()] = ei0Var;
        if (this.f6996l.isEmpty()) {
            t(this.f6995k[0]);
        }
    }
}
