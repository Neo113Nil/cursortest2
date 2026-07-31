package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
final class re {

    /* renamed from: a, reason: collision with root package name */
    public final ik f11113a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11115c;

    /* renamed from: d, reason: collision with root package name */
    public final uk[] f11116d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f11117e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11118f;

    /* renamed from: g, reason: collision with root package name */
    public int f11119g;

    /* renamed from: h, reason: collision with root package name */
    public long f11120h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11121i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11122j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11123k;

    /* renamed from: l, reason: collision with root package name */
    public re f11124l;

    /* renamed from: m, reason: collision with root package name */
    public pl f11125m;

    /* renamed from: n, reason: collision with root package name */
    private final cf[] f11126n;

    /* renamed from: o, reason: collision with root package name */
    private final df[] f11127o;

    /* renamed from: p, reason: collision with root package name */
    private final ol f11128p;

    /* renamed from: q, reason: collision with root package name */
    private final kk f11129q;

    /* renamed from: r, reason: collision with root package name */
    private pl f11130r;

    /* renamed from: s, reason: collision with root package name */
    private final qr0 f11131s;

    public re(cf[] cfVarArr, df[] dfVarArr, long j7, ol olVar, qr0 qr0Var, kk kkVar, Object obj, int i7, int i8, boolean z6, long j8, byte[] bArr) {
        this.f11126n = cfVarArr;
        this.f11127o = dfVarArr;
        this.f11118f = j7;
        this.f11128p = olVar;
        this.f11131s = qr0Var;
        this.f11129q = kkVar;
        Objects.requireNonNull(obj);
        this.f11114b = obj;
        this.f11115c = i7;
        this.f11119g = i8;
        this.f11121i = z6;
        this.f11120h = j8;
        this.f11116d = new uk[2];
        this.f11117e = new boolean[2];
        this.f11113a = kkVar.d(i8, qr0Var.l());
    }

    public final long a(long j7, boolean z6) {
        return b(j7, false, new boolean[2]);
    }

    public final long b(long j7, boolean z6, boolean[] zArr) {
        ml mlVar = this.f11125m.f10265b;
        int i7 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= 2) {
                break;
            }
            boolean[] zArr2 = this.f11117e;
            if (z6 || !this.f11125m.a(this.f11130r, i7)) {
                z7 = false;
            }
            zArr2[i7] = z7;
            i7++;
        }
        long t6 = this.f11113a.t(mlVar.b(), this.f11117e, this.f11116d, zArr, j7);
        this.f11130r = this.f11125m;
        this.f11123k = false;
        int i8 = 0;
        while (true) {
            uk[] ukVarArr = this.f11116d;
            if (i8 >= 2) {
                this.f11131s.d(this.f11126n, this.f11125m.f10264a, mlVar);
                return t6;
            }
            if (ukVarArr[i8] != null) {
                jm.e(mlVar.a(i8) != null);
                this.f11123k = true;
            } else {
                jm.e(mlVar.a(i8) == null);
            }
            i8++;
        }
    }

    public final void c() {
        try {
            this.f11129q.b(this.f11113a);
        } catch (RuntimeException e7) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e7);
        }
    }

    public final boolean d() {
        return this.f11122j && (!this.f11123k || this.f11113a.e() == Long.MIN_VALUE);
    }

    public final boolean e() {
        pl a7 = this.f11128p.a(this.f11127o, this.f11113a.m());
        pl plVar = this.f11130r;
        if (plVar != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (a7.a(plVar, i7)) {
                }
            }
            return false;
        }
        this.f11125m = a7;
        return true;
    }
}
