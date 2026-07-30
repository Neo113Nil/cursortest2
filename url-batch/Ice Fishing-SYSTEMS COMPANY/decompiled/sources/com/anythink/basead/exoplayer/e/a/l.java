package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    public c f7285a;

    /* renamed from: b, reason: collision with root package name */
    public long f7286b;

    /* renamed from: c, reason: collision with root package name */
    public long f7287c;

    /* renamed from: d, reason: collision with root package name */
    public long f7288d;

    /* renamed from: e, reason: collision with root package name */
    public int f7289e;

    /* renamed from: f, reason: collision with root package name */
    public int f7290f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f7291g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f7292h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f7293j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f7294k;

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f7295l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7296m;

    /* renamed from: n, reason: collision with root package name */
    public boolean[] f7297n;

    /* renamed from: o, reason: collision with root package name */
    public k f7298o;

    /* renamed from: p, reason: collision with root package name */
    public int f7299p;

    /* renamed from: q, reason: collision with root package name */
    public s f7300q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7301r;

    /* renamed from: s, reason: collision with root package name */
    public long f7302s;

    public final void a() {
        this.f7289e = 0;
        this.f7302s = 0L;
        this.f7296m = false;
        this.f7301r = false;
        this.f7298o = null;
    }

    public final long b(int i) {
        return this.f7294k[i] + this.f7293j[i];
    }

    public final void a(int i, int i4) {
        this.f7289e = i;
        this.f7290f = i4;
        int[] iArr = this.f7292h;
        if (iArr == null || iArr.length < i) {
            this.f7291g = new long[i];
            this.f7292h = new int[i];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i4) {
            int i9 = (i4 * 125) / 100;
            this.i = new int[i9];
            this.f7293j = new int[i9];
            this.f7294k = new long[i9];
            this.f7295l = new boolean[i9];
            this.f7297n = new boolean[i9];
        }
    }

    public final void a(int i) {
        s sVar = this.f7300q;
        if (sVar == null || sVar.b() < i) {
            this.f7300q = new s(i);
        }
        this.f7299p = i;
        this.f7296m = true;
        this.f7301r = true;
    }

    private void a(com.anythink.basead.exoplayer.e.f fVar) {
        fVar.b(this.f7300q.f8659a, 0, this.f7299p);
        this.f7300q.c(0);
        this.f7301r = false;
    }

    public final void a(s sVar) {
        sVar.a(this.f7300q.f8659a, 0, this.f7299p);
        this.f7300q.c(0);
        this.f7301r = false;
    }
}
