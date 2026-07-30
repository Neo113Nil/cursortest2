package com.baidu.location.c;

import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f4982a;

    /* renamed from: b, reason: collision with root package name */
    public long f4983b;

    /* renamed from: c, reason: collision with root package name */
    public int f4984c;

    /* renamed from: d, reason: collision with root package name */
    public int f4985d;

    /* renamed from: e, reason: collision with root package name */
    public int f4986e;

    /* renamed from: f, reason: collision with root package name */
    public int f4987f;

    /* renamed from: g, reason: collision with root package name */
    public long f4988g;

    /* renamed from: h, reason: collision with root package name */
    public int f4989h;

    /* renamed from: i, reason: collision with root package name */
    public char f4990i;

    /* renamed from: j, reason: collision with root package name */
    public int f4991j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4992k;

    /* renamed from: l, reason: collision with root package name */
    public int f4993l;

    /* renamed from: m, reason: collision with root package name */
    public int f4994m;

    /* renamed from: n, reason: collision with root package name */
    public String f4995n;

    /* renamed from: o, reason: collision with root package name */
    public String f4996o;

    /* renamed from: p, reason: collision with root package name */
    public String f4997p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4998q;

    public b() {
        this.f4982a = -1;
        this.f4983b = -1L;
        this.f4984c = -1;
        this.f4985d = -1;
        this.f4986e = Integer.MAX_VALUE;
        this.f4987f = Integer.MAX_VALUE;
        this.f4988g = 0L;
        this.f4989h = -1;
        this.f4990i = '0';
        this.f4991j = Integer.MAX_VALUE;
        this.f4992k = false;
        this.f4993l = 0;
        this.f4994m = 0;
        this.f4995n = null;
        this.f4996o = null;
        this.f4997p = null;
        this.f4998q = false;
        this.f4988g = System.currentTimeMillis();
    }

    public boolean a() {
        long currentTimeMillis = System.currentTimeMillis() - this.f4988g;
        return currentTimeMillis > 0 && currentTimeMillis < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    }

    public boolean b() {
        return this.f4982a > -1 && this.f4983b > 0;
    }

    public boolean c() {
        return this.f4982a == -1 && this.f4983b == -1 && this.f4985d == -1 && this.f4984c == -1;
    }

    public boolean d() {
        return this.f4982a > -1 && this.f4983b > -1 && this.f4985d == -1 && this.f4984c == -1;
    }

    public boolean e() {
        return this.f4982a > -1 && this.f4983b > -1 && this.f4985d > -1 && this.f4984c > -1;
    }

    public b(int i8, long j8, int i9, int i10, int i11, char c8, int i12) {
        this.f4986e = Integer.MAX_VALUE;
        this.f4987f = Integer.MAX_VALUE;
        this.f4988g = 0L;
        this.f4991j = Integer.MAX_VALUE;
        this.f4992k = false;
        this.f4993l = 0;
        this.f4994m = 0;
        this.f4995n = null;
        this.f4996o = null;
        this.f4997p = null;
        this.f4998q = false;
        this.f4982a = i8;
        this.f4983b = j8;
        this.f4984c = i9;
        this.f4985d = i10;
        this.f4989h = i11;
        this.f4990i = c8;
        this.f4988g = System.currentTimeMillis();
        this.f4991j = i12;
    }

    public boolean a(b bVar) {
        if (this.f4982a != bVar.f4982a || this.f4983b != bVar.f4983b || this.f4985d != bVar.f4985d || this.f4984c != bVar.f4984c) {
            return false;
        }
        String str = this.f4996o;
        if (str == null || !str.equals(bVar.f4996o)) {
            return this.f4996o == null && bVar.f4996o == null;
        }
        return true;
    }

    public b(b bVar) {
        this(bVar.f4982a, bVar.f4983b, bVar.f4984c, bVar.f4985d, bVar.f4989h, bVar.f4990i, bVar.f4991j);
        this.f4988g = bVar.f4988g;
        this.f4995n = bVar.f4995n;
        this.f4993l = bVar.f4993l;
        this.f4997p = bVar.f4997p;
        this.f4994m = bVar.f4994m;
        this.f4996o = bVar.f4996o;
        this.f4992k = bVar.f4992k;
    }
}
