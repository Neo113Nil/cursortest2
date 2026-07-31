package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class pe implements me {

    /* renamed from: a, reason: collision with root package name */
    private final cf[] f10180a;

    /* renamed from: b, reason: collision with root package name */
    private final ol f10181b;

    /* renamed from: c, reason: collision with root package name */
    private final ml f10182c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f10183d;

    /* renamed from: e, reason: collision with root package name */
    private final ve f10184e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<je> f10185f;

    /* renamed from: g, reason: collision with root package name */
    private final hf f10186g;

    /* renamed from: h, reason: collision with root package name */
    private final gf f10187h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10188i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10189j;

    /* renamed from: k, reason: collision with root package name */
    private int f10190k;

    /* renamed from: l, reason: collision with root package name */
    private int f10191l;

    /* renamed from: m, reason: collision with root package name */
    private int f10192m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f10193n;

    /* renamed from: o, reason: collision with root package name */
    private Cif f10194o;

    /* renamed from: p, reason: collision with root package name */
    private Object f10195p;

    /* renamed from: q, reason: collision with root package name */
    private al f10196q;

    /* renamed from: r, reason: collision with root package name */
    private ml f10197r;

    /* renamed from: s, reason: collision with root package name */
    private bf f10198s;

    /* renamed from: t, reason: collision with root package name */
    private se f10199t;

    /* renamed from: u, reason: collision with root package name */
    private long f10200u;

    @SuppressLint({"HandlerLeak"})
    public pe(cf[] cfVarArr, ol olVar, qr0 qr0Var, byte[] bArr) {
        String str = zm.f15190e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.f10180a = cfVarArr;
        Objects.requireNonNull(olVar);
        this.f10181b = olVar;
        this.f10189j = false;
        this.f10190k = 1;
        this.f10185f = new CopyOnWriteArraySet<>();
        ml mlVar = new ml(new el[2], null);
        this.f10182c = mlVar;
        this.f10194o = Cif.f6634a;
        this.f10186g = new hf();
        this.f10187h = new gf();
        this.f10196q = al.f2854d;
        this.f10197r = mlVar;
        this.f10198s = bf.f3385d;
        oe oeVar = new oe(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f10183d = oeVar;
        se seVar = new se(0, 0L);
        this.f10199t = seVar;
        this.f10184e = new ve(cfVarArr, olVar, qr0Var, this.f10189j, 0, oeVar, seVar, this, null);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void F0(boolean z6) {
        if (this.f10189j != z6) {
            this.f10189j = z6;
            this.f10184e.z(z6);
            Iterator<je> it = this.f10185f.iterator();
            while (it.hasNext()) {
                it.next().t(z6, this.f10190k);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void G0(int i7) {
        this.f10184e.y(i7);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void H0(le... leVarArr) {
        this.f10184e.w(leVarArr);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void I0(je jeVar) {
        this.f10185f.remove(jeVar);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void J0(long j7) {
        b();
        if (!this.f10194o.h() && this.f10194o.c() <= 0) {
            throw new ze(this.f10194o, 0, j7);
        }
        this.f10191l++;
        if (!this.f10194o.h()) {
            this.f10194o.g(0, this.f10186g, false);
            long a7 = he.a(j7);
            long j8 = this.f10194o.d(0, this.f10187h, false).f5595c;
            if (j8 != -9223372036854775807L) {
                int i7 = (a7 > j8 ? 1 : (a7 == j8 ? 0 : -1));
            }
        }
        this.f10200u = j7;
        this.f10184e.v(this.f10194o, 0, he.a(j7));
        Iterator<je> it = this.f10185f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void K0(kk kkVar) {
        if (!this.f10194o.h() || this.f10195p != null) {
            this.f10194o = Cif.f6634a;
            this.f10195p = null;
            Iterator<je> it = this.f10185f.iterator();
            while (it.hasNext()) {
                it.next().h(this.f10194o, this.f10195p);
            }
        }
        if (this.f10188i) {
            this.f10188i = false;
            this.f10196q = al.f2854d;
            this.f10197r = this.f10182c;
            this.f10181b.b(null);
            Iterator<je> it2 = this.f10185f.iterator();
            while (it2.hasNext()) {
                it2.next().f(this.f10196q, this.f10197r);
            }
        }
        this.f10192m++;
        this.f10184e.t(kkVar, true);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void L0(le... leVarArr) {
        this.f10184e.r(leVarArr);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void M0(je jeVar) {
        this.f10185f.add(jeVar);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final long a() {
        if (this.f10194o.h() || this.f10191l > 0) {
            return this.f10200u;
        }
        this.f10194o.d(this.f10199t.f11794a, this.f10187h, false);
        return he.b(0L) + he.b(this.f10199t.f11797d);
    }

    public final int b() {
        if (!this.f10194o.h() && this.f10191l <= 0) {
            this.f10194o.d(this.f10199t.f11794a, this.f10187h, false);
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final long c() {
        if (this.f10194o.h() || this.f10191l > 0) {
            return this.f10200u;
        }
        this.f10194o.d(this.f10199t.f11794a, this.f10187h, false);
        return he.b(0L) + he.b(this.f10199t.f11796c);
    }

    final void d(Message message) {
        switch (message.what) {
            case 0:
                this.f10192m--;
                return;
            case 1:
                this.f10190k = message.arg1;
                Iterator<je> it = this.f10185f.iterator();
                while (it.hasNext()) {
                    it.next().t(this.f10189j, this.f10190k);
                }
                return;
            case 2:
                this.f10193n = message.arg1 != 0;
                Iterator<je> it2 = this.f10185f.iterator();
                while (it2.hasNext()) {
                    it2.next().c(this.f10193n);
                }
                return;
            case 3:
                if (this.f10192m == 0) {
                    pl plVar = (pl) message.obj;
                    this.f10188i = true;
                    this.f10196q = plVar.f10264a;
                    this.f10197r = plVar.f10265b;
                    this.f10181b.b(plVar.f10266c);
                    Iterator<je> it3 = this.f10185f.iterator();
                    while (it3.hasNext()) {
                        it3.next().f(this.f10196q, this.f10197r);
                    }
                    return;
                }
                return;
            case 4:
                int i7 = this.f10191l - 1;
                this.f10191l = i7;
                if (i7 == 0) {
                    this.f10199t = (se) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<je> it4 = this.f10185f.iterator();
                        while (it4.hasNext()) {
                            it4.next().b();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f10191l == 0) {
                    this.f10199t = (se) message.obj;
                    Iterator<je> it5 = this.f10185f.iterator();
                    while (it5.hasNext()) {
                        it5.next().b();
                    }
                    return;
                }
                return;
            case 6:
                ue ueVar = (ue) message.obj;
                this.f10191l -= ueVar.f12764d;
                if (this.f10192m == 0) {
                    this.f10194o = ueVar.f12761a;
                    this.f10195p = ueVar.f12762b;
                    this.f10199t = ueVar.f12763c;
                    Iterator<je> it6 = this.f10185f.iterator();
                    while (it6.hasNext()) {
                        it6.next().h(this.f10194o, this.f10195p);
                    }
                    return;
                }
                return;
            case c4.w0.f2149o /* 7 */:
                bf bfVar = (bf) message.obj;
                if (this.f10198s.equals(bfVar)) {
                    return;
                }
                this.f10198s = bfVar;
                Iterator<je> it7 = this.f10185f.iterator();
                while (it7.hasNext()) {
                    it7.next().n(bfVar);
                }
                return;
            case c4.w0.f2150p /* 8 */:
                ie ieVar = (ie) message.obj;
                Iterator<je> it8 = this.f10185f.iterator();
                while (it8.hasNext()) {
                    it8.next().l(ieVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void e() {
        this.f10184e.s();
    }

    @Override // com.google.android.gms.internal.ads.me
    public final long g() {
        if (this.f10194o.h()) {
            return -9223372036854775807L;
        }
        Cif cif = this.f10194o;
        b();
        return he.b(cif.g(0, this.f10186g, false).f6216a);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void h() {
        this.f10184e.u();
        this.f10183d.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void l() {
        this.f10184e.A();
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void n(int i7) {
        this.f10184e.x(i7);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final boolean r() {
        return this.f10189j;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final int zza() {
        return this.f10190k;
    }
}
