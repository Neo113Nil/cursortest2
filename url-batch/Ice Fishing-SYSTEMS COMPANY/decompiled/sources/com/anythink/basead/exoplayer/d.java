package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6919a = 15000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6920b = 50000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6921c = 2500;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6922d = 5000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6923e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f6924f = true;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.l f6925g;

    /* renamed from: h, reason: collision with root package name */
    private final long f6926h;
    private final long i;

    /* renamed from: j, reason: collision with root package name */
    private final long f6927j;

    /* renamed from: k, reason: collision with root package name */
    private final long f6928k;

    /* renamed from: l, reason: collision with root package name */
    private final int f6929l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f6930m;

    /* renamed from: n, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.v f6931n;

    /* renamed from: o, reason: collision with root package name */
    private int f6932o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6933p;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.basead.exoplayer.j.l f6934a = null;

        /* renamed from: b, reason: collision with root package name */
        private int f6935b = d.f6919a;

        /* renamed from: c, reason: collision with root package name */
        private int f6936c = d.f6920b;

        /* renamed from: d, reason: collision with root package name */
        private int f6937d = d.f6921c;

        /* renamed from: e, reason: collision with root package name */
        private int f6938e = 5000;

        /* renamed from: f, reason: collision with root package name */
        private int f6939f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f6940g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.v f6941h = null;

        private a a(com.anythink.basead.exoplayer.j.l lVar) {
            this.f6934a = lVar;
            return this;
        }

        private a a(int i, int i4, int i9, int i10) {
            this.f6935b = i;
            this.f6936c = i4;
            this.f6937d = i9;
            this.f6938e = i10;
            return this;
        }

        private a a(int i) {
            this.f6939f = i;
            return this;
        }

        private a a(boolean z8) {
            this.f6940g = z8;
            return this;
        }

        private a a(com.anythink.basead.exoplayer.k.v vVar) {
            this.f6941h = vVar;
            return this;
        }

        private d a() {
            if (this.f6934a == null) {
                this.f6934a = new com.anythink.basead.exoplayer.j.l((byte) 0);
            }
            return new d(this.f6934a, this.f6935b, this.f6936c, this.f6937d, this.f6938e, this.f6939f, this.f6940g, this.f6941h);
        }
    }

    public d() {
        this(new com.anythink.basead.exoplayer.j.l((byte) 0));
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void a() {
        a(false);
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void b() {
        a(true);
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void c() {
        a(true);
    }

    @Override // com.anythink.basead.exoplayer.p
    public final com.anythink.basead.exoplayer.j.b d() {
        return this.f6925g;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final long e() {
        return 0L;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final boolean f() {
        return false;
    }

    @Deprecated
    private d(com.anythink.basead.exoplayer.j.l lVar) {
        this(lVar, (byte) 0);
    }

    private static int b(y[] yVarArr, com.anythink.basead.exoplayer.i.g gVar) {
        int i = 0;
        for (int i4 = 0; i4 < yVarArr.length; i4++) {
            if (gVar.a(i4) != null) {
                i = af.g(yVarArr[i4].a()) + i;
            }
        }
        return i;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void a(y[] yVarArr, com.anythink.basead.exoplayer.i.g gVar) {
        int i = this.f6929l;
        if (i == -1) {
            int i4 = 0;
            for (int i9 = 0; i9 < yVarArr.length; i9++) {
                if (gVar.a(i9) != null) {
                    i4 += af.g(yVarArr[i9].a());
                }
            }
            i = i4;
        }
        this.f6932o = i;
        this.f6925g.a(i);
    }

    @Deprecated
    private d(com.anythink.basead.exoplayer.j.l lVar, byte b9) {
        this(lVar, f6919a, f6920b, f6921c, 5000, -1, true, null);
    }

    @Deprecated
    public d(com.anythink.basead.exoplayer.j.l lVar, int i, int i4, int i9, int i10, int i11, boolean z8, com.anythink.basead.exoplayer.k.v vVar) {
        a(i9, 0, "bufferForPlaybackMs", "0");
        a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i9, "minBufferMs", "bufferForPlaybackMs");
        a(i, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i4, i, "maxBufferMs", "minBufferMs");
        this.f6925g = lVar;
        this.f6926h = i * 1000;
        this.i = i4 * 1000;
        this.f6927j = i9 * 1000;
        this.f6928k = i10 * 1000;
        this.f6929l = i11;
        this.f6930m = z8;
        this.f6931n = vVar;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final boolean a(long j9, float f6) {
        boolean z8;
        boolean z9 = true;
        boolean z10 = this.f6925g.c() >= this.f6932o;
        boolean z11 = this.f6933p;
        long j10 = this.f6926h;
        if (f6 > 1.0f) {
            j10 = Math.min(af.a(j10, f6), this.i);
        }
        if (j9 < j10) {
            if (!this.f6930m && z10) {
                z9 = false;
            }
            this.f6933p = z9;
        } else if (j9 > this.i || z10) {
            this.f6933p = false;
        }
        com.anythink.basead.exoplayer.k.v vVar = this.f6931n;
        if (vVar != null && (z8 = this.f6933p) != z11) {
            if (z8) {
                vVar.a();
            } else {
                vVar.c();
            }
        }
        return this.f6933p;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final boolean a(long j9, float f6, boolean z8) {
        long b9 = af.b(j9, f6);
        long j10 = z8 ? this.f6928k : this.f6927j;
        if (j10 <= 0 || b9 >= j10) {
            return true;
        }
        return !this.f6930m && this.f6925g.c() >= this.f6932o;
    }

    private void a(boolean z8) {
        this.f6932o = 0;
        com.anythink.basead.exoplayer.k.v vVar = this.f6931n;
        if (vVar != null && this.f6933p) {
            vVar.c();
        }
        this.f6933p = false;
        if (z8) {
            this.f6925g.e();
        }
    }

    private static void a(int i, int i4, String str, String str2) {
        C0544a.a(i >= i4, str + " cannot be less than " + str2);
    }
}
