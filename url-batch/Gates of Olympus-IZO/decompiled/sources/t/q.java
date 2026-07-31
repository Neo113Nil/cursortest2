package t;

import java.util.List;
import r0.H;

/* loaded from: classes.dex */
public final class q implements u.z {

    /* renamed from: a, reason: collision with root package name */
    public final int f7643a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7644b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7645c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7646d;

    /* renamed from: e, reason: collision with root package name */
    public final M0.j f7647e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7648f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7649g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7650h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f7651i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7652j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7653k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7654l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7655m;

    /* renamed from: n, reason: collision with root package name */
    public int f7656n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public final long f7657o;
    public long p;

    /* renamed from: q, reason: collision with root package name */
    public int f7658q;

    /* renamed from: r, reason: collision with root package name */
    public int f7659r;

    public q(int i3, Object obj, int i4, int i5, boolean z3, M0.j jVar, int i6, int i7, List list, long j3, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j4, int i8, int i9) {
        this.f7643a = i3;
        this.f7644b = obj;
        this.f7645c = i4;
        this.f7646d = z3;
        this.f7647e = jVar;
        this.f7648f = list;
        this.f7649g = j3;
        this.f7650h = obj2;
        this.f7651i = aVar;
        this.f7652j = i8;
        this.f7653k = i9;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, ((H) list.get(i11)).f7115e);
        }
        this.f7654l = i10;
        int i12 = i10 + i5;
        this.f7655m = i12 >= 0 ? i12 : 0;
        this.f7657o = I2.l.e(this.f7645c, i10);
        this.p = 0L;
        this.f7658q = -1;
        this.f7659r = -1;
    }

    @Override // u.z
    public final int a() {
        return this.f7655m;
    }

    @Override // u.z
    public final int b() {
        return this.f7648f.size();
    }

    @Override // u.z
    public final long c(int i3) {
        return this.p;
    }

    @Override // u.z
    public final int d() {
        return this.f7653k;
    }

    @Override // u.z
    public final Object e(int i3) {
        return ((H) this.f7648f.get(i3)).r();
    }

    @Override // u.z
    public final int f() {
        return this.f7652j;
    }

    public final void g(int i3, int i4, int i5, int i6) {
        h(i3, i4, i5, i6, -1, -1);
    }

    @Override // u.z
    public final int getIndex() {
        return this.f7643a;
    }

    @Override // u.z
    public final Object getKey() {
        return this.f7644b;
    }

    public final void h(int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f7656n = i6;
        if (this.f7647e == M0.j.f2776e) {
            i4 = (i5 - i4) - this.f7645c;
        }
        this.p = I2.d.c(i4, i3);
        this.f7658q = i7;
        this.f7659r = i8;
    }
}
