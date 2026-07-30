package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.j.h;
import com.anythink.basead.exoplayer.j.t;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class ac implements r, t.a<b> {
    private static final int i = 1024;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.basead.exoplayer.m f7629b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f7630c;

    /* renamed from: d, reason: collision with root package name */
    boolean f7631d;

    /* renamed from: e, reason: collision with root package name */
    boolean f7632e;

    /* renamed from: f, reason: collision with root package name */
    boolean f7633f;

    /* renamed from: g, reason: collision with root package name */
    byte[] f7634g;

    /* renamed from: h, reason: collision with root package name */
    int f7635h;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.k f7636j;

    /* renamed from: k, reason: collision with root package name */
    private final h.a f7637k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7638l;

    /* renamed from: m, reason: collision with root package name */
    private final t.a f7639m;

    /* renamed from: n, reason: collision with root package name */
    private final af f7640n;

    /* renamed from: p, reason: collision with root package name */
    private final long f7642p;

    /* renamed from: q, reason: collision with root package name */
    private int f7643q;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList<a> f7641o = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    final com.anythink.basead.exoplayer.j.t f7628a = new com.anythink.basead.exoplayer.j.t("Loader:SingleSampleMediaPeriod");

    public final class a implements y {

        /* renamed from: b, reason: collision with root package name */
        private static final int f7644b = 0;

        /* renamed from: c, reason: collision with root package name */
        private static final int f7645c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f7646d = 2;

        /* renamed from: e, reason: collision with root package name */
        private int f7648e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7649f;

        private a() {
        }

        private void d() {
            if (this.f7649f) {
                return;
            }
            ac.this.f7639m.a(com.anythink.basead.exoplayer.k.o.d(ac.this.f7629b.f8822h), ac.this.f7629b, 0, (Object) null, 0L);
            this.f7649f = true;
        }

        public final void a() {
            if (this.f7648e == 2) {
                this.f7648e = 1;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return ac.this.f7632e;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            ac acVar = ac.this;
            if (acVar.f7630c) {
                return;
            }
            acVar.f7628a.c();
        }

        public /* synthetic */ a(ac acVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8) {
            int i = this.f7648e;
            if (i == 2) {
                eVar.b(4);
                return -4;
            }
            if (!z8 && i != 0) {
                ac acVar = ac.this;
                if (!acVar.f7632e) {
                    return -3;
                }
                if (acVar.f7633f) {
                    eVar.f6900f = 0L;
                    eVar.b(1);
                    eVar.d(ac.this.f7635h);
                    ByteBuffer byteBuffer = eVar.f6899e;
                    ac acVar2 = ac.this;
                    byteBuffer.put(acVar2.f7634g, 0, acVar2.f7635h);
                    d();
                } else {
                    eVar.b(4);
                }
                this.f7648e = 2;
                return -4;
            }
            nVar.f8840a = ac.this.f7629b;
            this.f7648e = 1;
            return -5;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j9) {
            if (j9 <= 0 || this.f7648e == 2) {
                return 0;
            }
            this.f7648e = 2;
            d();
            return 1;
        }
    }

    public static final class b implements t.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.j.k f7650a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.h f7651b;

        /* renamed from: c, reason: collision with root package name */
        private int f7652c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f7653d;

        public b(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.h hVar) {
            this.f7650a = kVar;
            this.f7651b = hVar;
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void a() {
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void b() {
            int i = 0;
            this.f7652c = 0;
            try {
                this.f7651b.a(this.f7650a);
                while (i != -1) {
                    int i4 = this.f7652c + i;
                    this.f7652c = i4;
                    byte[] bArr = this.f7653d;
                    if (bArr == null) {
                        this.f7653d = new byte[ac.i];
                    } else if (i4 == bArr.length) {
                        this.f7653d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    com.anythink.basead.exoplayer.j.h hVar = this.f7651b;
                    byte[] bArr2 = this.f7653d;
                    int i9 = this.f7652c;
                    i = hVar.a(bArr2, i9, bArr2.length - i9);
                }
                com.anythink.basead.exoplayer.k.af.a(this.f7651b);
            } catch (Throwable th) {
                com.anythink.basead.exoplayer.k.af.a(this.f7651b);
                throw th;
            }
        }
    }

    public ac(com.anythink.basead.exoplayer.j.k kVar, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j9, int i4, t.a aVar2, boolean z8) {
        this.f7636j = kVar;
        this.f7637k = aVar;
        this.f7629b = mVar;
        this.f7642p = j9;
        this.f7638l = i4;
        this.f7639m = aVar2;
        this.f7630c = z8;
        this.f7640n = new af(new ae(mVar));
        aVar2.a();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j9, com.anythink.basead.exoplayer.ac acVar) {
        return j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j9) {
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7640n;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j9) {
        if (this.f7632e || this.f7628a.a()) {
            return false;
        }
        this.f7639m.a(this.f7636j, 1, -1, this.f7629b, 0, null, 0L, this.f7642p, this.f7628a.a(new b(this.f7636j, this.f7637k.a()), this, this.f7638l));
        return true;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f7632e ? Long.MIN_VALUE : 0L;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return (this.f7632e || this.f7628a.a()) ? Long.MIN_VALUE : 0L;
    }

    public final void f() {
        this.f7628a.a((t.d) null);
        this.f7639m.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j9) {
        for (int i4 = 0; i4 < this.f7641o.size(); i4++) {
            this.f7641o.get(i4).a();
        }
        return j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j9, boolean z8) {
    }

    private void b(b bVar, long j9, long j10) {
        this.f7639m.b(bVar.f7650a, 1, -1, null, 0, null, 0L, this.f7642p, j9, j10, bVar.f7652c);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* bridge */ /* synthetic */ int a(b bVar, long j9, long j10, IOException iOException) {
        b bVar2 = bVar;
        int i4 = this.f7643q + 1;
        this.f7643q = i4;
        boolean z8 = this.f7630c && i4 >= this.f7638l;
        this.f7639m.a(bVar2.f7650a, 1, -1, this.f7629b, 0, null, 0L, this.f7642p, j9, j10, bVar2.f7652c, iOException, z8);
        if (!z8) {
            return 0;
        }
        this.f7632e = true;
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (this.f7631d) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        this.f7639m.c();
        this.f7631d = true;
        return com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(b bVar, long j9, long j10) {
        b bVar2 = bVar;
        this.f7639m.a(bVar2.f7650a, 1, -1, this.f7629b, 0, null, 0L, this.f7642p, j9, j10, bVar2.f7652c);
        this.f7635h = bVar2.f7652c;
        this.f7634g = bVar2.f7653d;
        this.f7632e = true;
        this.f7633f = true;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(b bVar, long j9, long j10, boolean z8) {
        this.f7639m.b(bVar.f7650a, 1, -1, null, 0, null, 0L, this.f7642p, j9, j10, r1.f7652c);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j9) {
        aVar.a((r) this);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j9) {
        byte b9 = 0;
        for (int i4 = 0; i4 < fVarArr.length; i4++) {
            y yVar = yVarArr[i4];
            if (yVar != null && (fVarArr[i4] == null || !zArr[i4])) {
                this.f7641o.remove(yVar);
                yVarArr[i4] = null;
            }
            if (yVarArr[i4] == null && fVarArr[i4] != null) {
                a aVar = new a(this, b9);
                this.f7641o.add(aVar);
                yVarArr[i4] = aVar;
                zArr2[i4] = true;
            }
        }
        return j9;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(b bVar, long j9, long j10) {
        this.f7639m.a(bVar.f7650a, 1, -1, this.f7629b, 0, null, 0L, this.f7642p, j9, j10, bVar.f7652c);
        this.f7635h = bVar.f7652c;
        this.f7634g = bVar.f7653d;
        this.f7632e = true;
        this.f7633f = true;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private int a2(b bVar, long j9, long j10, IOException iOException) {
        int i4 = this.f7643q + 1;
        this.f7643q = i4;
        boolean z8 = this.f7630c && i4 >= this.f7638l;
        this.f7639m.a(bVar.f7650a, 1, -1, this.f7629b, 0, null, 0L, this.f7642p, j9, j10, bVar.f7652c, iOException, z8);
        if (!z8) {
            return 0;
        }
        this.f7632e = true;
        return 2;
    }
}
