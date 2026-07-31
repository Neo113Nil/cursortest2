package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.squareup.picasso.o;
import com.squareup.picasso.q;
import com.squareup.picasso.v;
import d1.InterfaceC2402a;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.B;

/* loaded from: classes2.dex */
class c implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    private static final Object f21672u = new Object();

    /* renamed from: v, reason: collision with root package name */
    private static final ThreadLocal f21673v = new a();

    /* renamed from: w, reason: collision with root package name */
    private static final AtomicInteger f21674w = new AtomicInteger();

    /* renamed from: x, reason: collision with root package name */
    private static final v f21675x = new b();

    /* renamed from: b, reason: collision with root package name */
    final int f21676b = f21674w.incrementAndGet();

    /* renamed from: c, reason: collision with root package name */
    final q f21677c;

    /* renamed from: d, reason: collision with root package name */
    final g f21678d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC2402a f21679e;

    /* renamed from: f, reason: collision with root package name */
    final x f21680f;

    /* renamed from: g, reason: collision with root package name */
    final String f21681g;

    /* renamed from: h, reason: collision with root package name */
    final t f21682h;

    /* renamed from: i, reason: collision with root package name */
    final int f21683i;

    /* renamed from: j, reason: collision with root package name */
    int f21684j;

    /* renamed from: k, reason: collision with root package name */
    final v f21685k;

    /* renamed from: l, reason: collision with root package name */
    com.squareup.picasso.a f21686l;

    /* renamed from: m, reason: collision with root package name */
    List f21687m;

    /* renamed from: n, reason: collision with root package name */
    Bitmap f21688n;

    /* renamed from: o, reason: collision with root package name */
    Future f21689o;

    /* renamed from: p, reason: collision with root package name */
    q.e f21690p;

    /* renamed from: q, reason: collision with root package name */
    Exception f21691q;

    /* renamed from: r, reason: collision with root package name */
    int f21692r;

    /* renamed from: s, reason: collision with root package name */
    int f21693s;

    /* renamed from: t, reason: collision with root package name */
    q.f f21694t;

    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    static class b extends v {
        b() {
        }

        @Override // com.squareup.picasso.v
        public boolean c(t tVar) {
            return true;
        }

        @Override // com.squareup.picasso.v
        public v.a f(t tVar, int i4) {
            throw new IllegalStateException("Unrecognized type of request: " + tVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    static class RunnableC0176c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RuntimeException f21695b;

        RunnableC0176c(d1.e eVar, RuntimeException runtimeException) {
            this.f21695b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            new StringBuilder().append("Transformation ");
            throw null;
        }
    }

    c(q qVar, g gVar, InterfaceC2402a interfaceC2402a, x xVar, com.squareup.picasso.a aVar, v vVar) {
        this.f21677c = qVar;
        this.f21678d = gVar;
        this.f21679e = interfaceC2402a;
        this.f21680f = xVar;
        this.f21686l = aVar;
        this.f21681g = aVar.d();
        this.f21682h = aVar.i();
        this.f21694t = aVar.h();
        this.f21683i = aVar.e();
        this.f21684j = aVar.f();
        this.f21685k = vVar;
        this.f21693s = vVar.e();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        if (list.size() <= 0) {
            return bitmap;
        }
        android.support.v4.media.session.b.a(list.get(0));
        try {
            throw null;
        } catch (RuntimeException e4) {
            q.f21756o.post(new RunnableC0176c(null, e4));
            return null;
        }
    }

    private q.f d() {
        q.f fVar = q.f.LOW;
        List list = this.f21687m;
        boolean z4 = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.a aVar = this.f21686l;
        if (aVar == null && !z4) {
            return fVar;
        }
        if (aVar != null) {
            fVar = aVar.h();
        }
        if (z4) {
            int size = this.f21687m.size();
            for (int i4 = 0; i4 < size; i4++) {
                q.f h4 = ((com.squareup.picasso.a) this.f21687m.get(i4)).h();
                if (h4.ordinal() > fVar.ordinal()) {
                    fVar = h4;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(B b4, t tVar) {
        okio.g d4 = okio.p.d(b4);
        boolean r4 = y.r(d4);
        boolean z4 = tVar.f21822r;
        BitmapFactory.Options d5 = v.d(tVar);
        boolean g4 = v.g(d5);
        if (r4) {
            byte[] u4 = d4.u();
            if (g4) {
                BitmapFactory.decodeByteArray(u4, 0, u4.length, d5);
                v.b(tVar.f21812h, tVar.f21813i, d5, tVar);
            }
            return BitmapFactory.decodeByteArray(u4, 0, u4.length, d5);
        }
        InputStream S3 = d4.S();
        if (g4) {
            k kVar = new k(S3);
            kVar.a(false);
            long c4 = kVar.c(1024);
            BitmapFactory.decodeStream(kVar, null, d5);
            v.b(tVar.f21812h, tVar.f21813i, d5, tVar);
            kVar.b(c4);
            kVar.a(true);
            S3 = kVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(S3, null, d5);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static c g(q qVar, g gVar, InterfaceC2402a interfaceC2402a, x xVar, com.squareup.picasso.a aVar) {
        t i4 = aVar.i();
        List h4 = qVar.h();
        int size = h4.size();
        for (int i5 = 0; i5 < size; i5++) {
            v vVar = (v) h4.get(i5);
            if (vVar.c(i4)) {
                return new c(qVar, gVar, interfaceC2402a, xVar, aVar, vVar);
            }
        }
        return new c(qVar, gVar, interfaceC2402a, xVar, aVar, f21675x);
    }

    static int l(int i4) {
        switch (i4) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int m(int i4) {
        return (i4 == 2 || i4 == 7 || i4 == 4 || i4 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z4, int i4, int i5, int i6, int i7) {
        if (!z4) {
            return true;
        }
        if (i6 == 0 || i4 <= i6) {
            return i7 != 0 && i5 > i7;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x027a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Bitmap y(t tVar, Bitmap bitmap, int i4) {
        int i5;
        int i6;
        boolean z4;
        Matrix matrix;
        int i7;
        int i8;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i9;
        int i10;
        float f12;
        float f13;
        float f14;
        int i11;
        int i12;
        boolean z5;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z6 = tVar.f21817m;
        Matrix matrix2 = new Matrix();
        if (tVar.e() || i4 != 0) {
            int i18 = tVar.f21812h;
            int i19 = tVar.f21813i;
            float f15 = tVar.f21818n;
            if (f15 != 0.0f) {
                double d4 = f15;
                double cos = Math.cos(Math.toRadians(d4));
                double sin = Math.sin(Math.toRadians(d4));
                if (tVar.f21821q) {
                    matrix2.setRotate(f15, tVar.f21819o, tVar.f21820p);
                    float f16 = tVar.f21819o;
                    double d5 = 1.0d - cos;
                    float f17 = tVar.f21820p;
                    double d6 = (f16 * d5) + (f17 * sin);
                    double d7 = (f17 * d5) - (f16 * sin);
                    int i20 = tVar.f21812h;
                    double d8 = (i20 * cos) + d6;
                    double d9 = (i20 * sin) + d7;
                    int i21 = tVar.f21813i;
                    double d10 = ((i20 * cos) + d6) - (i21 * sin);
                    i5 = width;
                    double d11 = (i20 * sin) + d7 + (i21 * cos);
                    matrix = matrix2;
                    i6 = height;
                    double d12 = d6 - (i21 * sin);
                    double d13 = (i21 * cos) + d7;
                    double max = Math.max(d12, Math.max(d10, Math.max(d6, d8)));
                    double min = Math.min(d12, Math.min(d10, Math.min(d6, d8)));
                    double max2 = Math.max(d13, Math.max(d11, Math.max(d7, d9)));
                    double min2 = Math.min(d13, Math.min(d11, Math.min(d7, d9)));
                    int floor = (int) Math.floor(max - min);
                    i19 = (int) Math.floor(max2 - min2);
                    i18 = floor;
                    z4 = z6;
                } else {
                    i5 = width;
                    i6 = height;
                    matrix2.setRotate(f15);
                    int i22 = tVar.f21812h;
                    double d14 = i22 * cos;
                    double d15 = i22 * sin;
                    int i23 = tVar.f21813i;
                    double d16 = (i22 * cos) - (i23 * sin);
                    double d17 = (i22 * sin) + (i23 * cos);
                    double d18 = -(i23 * sin);
                    double d19 = i23 * cos;
                    z4 = z6;
                    matrix = matrix2;
                    double max3 = Math.max(d18, Math.max(d16, Math.max(0.0d, d14)));
                    double min3 = Math.min(d18, Math.min(d16, Math.min(0.0d, d14)));
                    double max4 = Math.max(d19, Math.max(d17, Math.max(0.0d, d15)));
                    double min4 = Math.min(d19, Math.min(d17, Math.min(0.0d, d15)));
                    i18 = (int) Math.floor(max3 - min3);
                    i19 = (int) Math.floor(max4 - min4);
                }
            } else {
                i5 = width;
                i6 = height;
                z4 = z6;
                matrix = matrix2;
            }
            if (i4 != 0) {
                int l4 = l(i4);
                int m4 = m(i4);
                if (l4 != 0) {
                    matrix2 = matrix;
                    matrix2.preRotate(l4);
                    if (l4 == 90 || l4 == 270) {
                        int i24 = i19;
                        i19 = i18;
                        i18 = i24;
                    }
                } else {
                    matrix2 = matrix;
                }
                if (m4 != 1) {
                    matrix2.postScale(m4, 1.0f);
                }
            } else {
                matrix2 = matrix;
            }
            if (tVar.f21814j) {
                if (i18 != 0) {
                    i9 = i5;
                    f12 = i18 / i9;
                    i10 = i6;
                } else {
                    i9 = i5;
                    i10 = i6;
                    f12 = i19 / i10;
                }
                if (i19 != 0) {
                    f13 = i19;
                    f14 = i10;
                } else {
                    f13 = i18;
                    f14 = i9;
                }
                float f18 = f13 / f14;
                if (f12 > f18) {
                    int ceil = (int) Math.ceil(i10 * (f18 / f12));
                    int i25 = tVar.f21815k;
                    i13 = (i25 & 48) == 48 ? 0 : (i25 & 80) == 80 ? i10 - ceil : (i10 - ceil) / 2;
                    i12 = ceil;
                    i11 = i9;
                    f18 = i19 / ceil;
                    z5 = z4;
                } else {
                    if (f12 < f18) {
                        int ceil2 = (int) Math.ceil(i9 * (f12 / f18));
                        int i26 = tVar.f21815k;
                        i14 = (i26 & 3) == 3 ? 0 : (i26 & 5) == 5 ? i9 - ceil2 : (i9 - ceil2) / 2;
                        i11 = ceil2;
                        i12 = i10;
                        f12 = i18 / ceil2;
                        z5 = z4;
                        i13 = 0;
                        if (v(z5, i9, i10, i18, i19)) {
                            matrix2.preScale(f12, f18);
                        }
                        i15 = i13;
                        i16 = i14;
                        i7 = i11;
                        i17 = i12;
                        createBitmap = Bitmap.createBitmap(bitmap, i16, i15, i7, i17, matrix2, true);
                        if (createBitmap == bitmap) {
                            return bitmap;
                        }
                        bitmap.recycle();
                        return createBitmap;
                    }
                    f12 = f18;
                    i11 = i9;
                    i12 = i10;
                    z5 = z4;
                    i13 = 0;
                }
                i14 = 0;
                if (v(z5, i9, i10, i18, i19)) {
                }
                i15 = i13;
                i16 = i14;
                i7 = i11;
                i17 = i12;
                createBitmap = Bitmap.createBitmap(bitmap, i16, i15, i7, i17, matrix2, true);
                if (createBitmap == bitmap) {
                }
            } else {
                boolean z7 = z4;
                i7 = i5;
                i8 = i6;
                if (tVar.f21816l) {
                    if (i18 != 0) {
                        f8 = i18;
                        f9 = i7;
                    } else {
                        f8 = i19;
                        f9 = i8;
                    }
                    float f19 = f8 / f9;
                    if (i19 != 0) {
                        f10 = i19;
                        f11 = i8;
                    } else {
                        f10 = i18;
                        f11 = i7;
                    }
                    float f20 = f10 / f11;
                    if (f19 >= f20) {
                        f19 = f20;
                    }
                    if (v(z7, i7, i8, i18, i19)) {
                        matrix2.preScale(f19, f19);
                    }
                } else if ((i18 != 0 || i19 != 0) && (i18 != i7 || i19 != i8)) {
                    if (i18 != 0) {
                        f4 = i18;
                        f5 = i7;
                    } else {
                        f4 = i19;
                        f5 = i8;
                    }
                    float f21 = f4 / f5;
                    if (i19 != 0) {
                        f6 = i19;
                        f7 = i8;
                    } else {
                        f6 = i18;
                        f7 = i7;
                    }
                    float f22 = f6 / f7;
                    if (v(z7, i7, i8, i18, i19)) {
                        matrix2.preScale(f21, f22);
                    }
                }
            }
        } else {
            i7 = width;
            i8 = height;
        }
        i17 = i8;
        i16 = 0;
        i15 = 0;
        createBitmap = Bitmap.createBitmap(bitmap, i16, i15, i7, i17, matrix2, true);
        if (createBitmap == bitmap) {
        }
    }

    static void z(t tVar) {
        String a4 = tVar.a();
        StringBuilder sb = (StringBuilder) f21673v.get();
        sb.ensureCapacity(a4.length() + 8);
        sb.replace(8, sb.length(), a4);
        Thread.currentThread().setName(sb.toString());
    }

    void b(com.squareup.picasso.a aVar) {
        boolean z4 = this.f21677c.f21770m;
        t tVar = aVar.f21656b;
        if (this.f21686l == null) {
            this.f21686l = aVar;
            if (z4) {
                List list = this.f21687m;
                if (list == null || list.isEmpty()) {
                    y.t("Hunter", "joined", tVar.d(), "to empty hunter");
                    return;
                } else {
                    y.t("Hunter", "joined", tVar.d(), y.k(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.f21687m == null) {
            this.f21687m = new ArrayList(3);
        }
        this.f21687m.add(aVar);
        if (z4) {
            y.t("Hunter", "joined", tVar.d(), y.k(this, "to "));
        }
        q.f h4 = aVar.h();
        if (h4.ordinal() > this.f21694t.ordinal()) {
            this.f21694t = h4;
        }
    }

    boolean c() {
        List list;
        Future future;
        return this.f21686l == null && ((list = this.f21687m) == null || list.isEmpty()) && (future = this.f21689o) != null && future.cancel(false);
    }

    void f(com.squareup.picasso.a aVar) {
        boolean remove;
        if (this.f21686l == aVar) {
            this.f21686l = null;
            remove = true;
        } else {
            List list = this.f21687m;
            remove = list != null ? list.remove(aVar) : false;
        }
        if (remove && aVar.h() == this.f21694t) {
            this.f21694t = d();
        }
        if (this.f21677c.f21770m) {
            y.t("Hunter", "removed", aVar.f21656b.d(), y.k(this, "from "));
        }
    }

    com.squareup.picasso.a h() {
        return this.f21686l;
    }

    List i() {
        return this.f21687m;
    }

    t j() {
        return this.f21682h;
    }

    Exception k() {
        return this.f21691q;
    }

    String n() {
        return this.f21681g;
    }

    q.e o() {
        return this.f21690p;
    }

    int p() {
        return this.f21683i;
    }

    q q() {
        return this.f21677c;
    }

    q.f r() {
        return this.f21694t;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.f21682h);
                        if (this.f21677c.f21770m) {
                            y.s("Hunter", "executing", y.j(this));
                        }
                        Bitmap t4 = t();
                        this.f21688n = t4;
                        if (t4 == null) {
                            this.f21678d.e(this);
                        } else {
                            this.f21678d.d(this);
                        }
                        Thread.currentThread().setName("Picasso-Idle");
                    } catch (IOException e4) {
                        this.f21691q = e4;
                        this.f21678d.g(this);
                        Thread.currentThread().setName("Picasso-Idle");
                    }
                } catch (o.b e5) {
                    if (!n.a(e5.f21752c) || e5.f21751b != 504) {
                        this.f21691q = e5;
                    }
                    this.f21678d.e(this);
                    Thread.currentThread().setName("Picasso-Idle");
                }
            } catch (Exception e6) {
                this.f21691q = e6;
                this.f21678d.e(this);
                Thread.currentThread().setName("Picasso-Idle");
            } catch (OutOfMemoryError e7) {
                StringWriter stringWriter = new StringWriter();
                this.f21680f.a().a(new PrintWriter(stringWriter));
                this.f21691q = new RuntimeException(stringWriter.toString(), e7);
                this.f21678d.e(this);
                Thread.currentThread().setName("Picasso-Idle");
            }
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    Bitmap s() {
        return this.f21688n;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:43:0x0098, B:45:0x00a0, B:48:0x00c2, B:50:0x00ca, B:52:0x00d8, B:53:0x00e7, B:57:0x00a7, B:59:0x00b5), top: B:42:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Bitmap t() {
        Bitmap bitmap;
        if (m.a(this.f21683i)) {
            bitmap = this.f21679e.get(this.f21681g);
            if (bitmap != null) {
                this.f21680f.d();
                this.f21690p = q.e.MEMORY;
                if (this.f21677c.f21770m) {
                    y.t("Hunter", "decoded", this.f21682h.d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i4 = this.f21693s == 0 ? n.OFFLINE.f21748b : this.f21684j;
        this.f21684j = i4;
        v.a f4 = this.f21685k.f(this.f21682h, i4);
        if (f4 != null) {
            this.f21690p = f4.c();
            this.f21692r = f4.b();
            bitmap = f4.a();
            if (bitmap == null) {
                B d4 = f4.d();
                try {
                    bitmap = e(d4, this.f21682h);
                } finally {
                    try {
                        d4.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f21677c.f21770m) {
                y.s("Hunter", "decoded", this.f21682h.d());
            }
            this.f21680f.b(bitmap);
            if (this.f21682h.f() || this.f21692r != 0) {
                synchronized (f21672u) {
                    try {
                        if (!this.f21682h.e()) {
                            if (this.f21692r != 0) {
                            }
                            if (this.f21682h.b()) {
                                bitmap = a(this.f21682h.f21811g, bitmap);
                                if (this.f21677c.f21770m) {
                                    y.t("Hunter", "transformed", this.f21682h.d(), "from custom transformations");
                                }
                            }
                        }
                        bitmap = y(this.f21682h, bitmap, this.f21692r);
                        if (this.f21677c.f21770m) {
                            y.s("Hunter", "transformed", this.f21682h.d());
                        }
                        if (this.f21682h.b()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmap != null) {
                    this.f21680f.c(bitmap);
                }
            }
        }
        return bitmap;
    }

    boolean u() {
        Future future = this.f21689o;
        return future != null && future.isCancelled();
    }

    boolean w(boolean z4, NetworkInfo networkInfo) {
        int i4 = this.f21693s;
        if (i4 <= 0) {
            return false;
        }
        this.f21693s = i4 - 1;
        return this.f21685k.h(z4, networkInfo);
    }

    boolean x() {
        return this.f21685k.i();
    }
}
