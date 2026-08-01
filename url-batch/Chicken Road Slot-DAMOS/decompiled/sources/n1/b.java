package n1;

import a2.r;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import k1.a0;
import k1.v;
import k1.y;
import k1.z;
import s.i0;
import s.q0;
import wd.p;
import z4.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f6900a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f6905f;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public v f6908k;

    /* renamed from: l, reason: collision with root package name */
    public k1.g f6909l;

    /* renamed from: m, reason: collision with root package name */
    public k1.g f6910m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6911n;

    /* renamed from: o, reason: collision with root package name */
    public m1.b f6912o;

    /* renamed from: p, reason: collision with root package name */
    public y6.l f6913p;

    /* renamed from: q, reason: collision with root package name */
    public int f6914q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6916s;

    /* renamed from: t, reason: collision with root package name */
    public long f6917t;

    /* renamed from: u, reason: collision with root package name */
    public long f6918u;

    /* renamed from: v, reason: collision with root package name */
    public long f6919v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6920w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f6921x;

    /* renamed from: b, reason: collision with root package name */
    public x2.c f6901b = m1.c.f6409a;

    /* renamed from: c, reason: collision with root package name */
    public x2.l f6902c = x2.l.f10330d;

    /* renamed from: d, reason: collision with root package name */
    public p f6903d = a.f6897e;

    /* renamed from: e, reason: collision with root package name */
    public final a3.e f6904e = new a3.e(16, this);
    public boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f6906h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f6907i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final b7.h f6915r = new b7.h();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public b(d dVar) {
        this.f6900a = dVar;
        dVar.u(false);
        this.f6917t = 0L;
        this.f6918u = 0L;
        this.f6919v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z10 = this.f6920w;
            Outline outline2 = null;
            d dVar = this.f6900a;
            if (z10 || dVar.G() > 0.0f) {
                k1.g gVar = this.f6909l;
                if (gVar != null) {
                    RectF rectF = this.f6921x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f6921x = rectF;
                    }
                    boolean z11 = gVar instanceof k1.g;
                    if (!z11) {
                        r.r("Unable to obtain android.graphics.Path");
                        return;
                    }
                    gVar.f5321a.computeBounds(rectF, false);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 > 28 || gVar.f5321a.isConvex()) {
                        outline = this.f6905f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f6905f = outline;
                        }
                        if (i3 >= 30) {
                            if (!z11) {
                                r.r("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(gVar.f5321a);
                        } else {
                            if (!z11) {
                                r.r("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(gVar.f5321a);
                        }
                        this.f6911n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f6905f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f6911n = true;
                        outline = null;
                    }
                    this.f6909l = gVar;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.k(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f6911n && this.f6920w) {
                        dVar.u(false);
                        dVar.p();
                    } else {
                        dVar.u(this.f6920w);
                    }
                } else {
                    dVar.u(this.f6920w);
                    Outline outline4 = this.f6905f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f6905f = outline4;
                    }
                    Outline outline5 = outline4;
                    long b10 = m.b(this.f6918u);
                    long j = this.f6906h;
                    long j3 = this.f6907i;
                    if (j3 != 9205357640488583168L) {
                        b10 = j3;
                    }
                    int i10 = (int) (j >> 32);
                    int i11 = (int) (j & 4294967295L);
                    int i12 = (int) (b10 >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12) + Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat((int) (b10 & 4294967295L)) + Float.intBitsToFloat(i11)), this.j);
                    outline5.setAlpha(dVar.a());
                    dVar.k(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i12)) << 32));
                }
            } else {
                dVar.u(false);
                dVar.k(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.f6916s && this.f6914q == 0) {
            b7.h hVar = this.f6915r;
            b bVar = (b) hVar.f1293b;
            if (bVar != null) {
                bVar.f6914q--;
                bVar.b();
                hVar.f1293b = null;
            }
            i0 i0Var = (i0) hVar.f1295d;
            if (i0Var != null) {
                Object[] objArr = i0Var.f8320b;
                long[] jArr = i0Var.f8319a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j) < 128) {
                                    r11.f6914q--;
                                    ((b) objArr[(i3 << 3) + i11]).b();
                                }
                                j >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                i0Var.b();
            }
            this.f6900a.p();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, wd.p] */
    public final void c(m1.d dVar) {
        b7.h hVar = this.f6915r;
        hVar.f1294c = (b) hVar.f1293b;
        i0 i0Var = (i0) hVar.f1295d;
        if (i0Var != null && i0Var.h()) {
            i0 i0Var2 = (i0) hVar.f1296e;
            if (i0Var2 == null) {
                int i3 = q0.f8360a;
                i0Var2 = new i0();
                hVar.f1296e = i0Var2;
            }
            i0Var2.j(i0Var);
            i0Var.b();
        }
        hVar.f1292a = true;
        this.f6903d.invoke(dVar);
        hVar.f1292a = false;
        b bVar = (b) hVar.f1294c;
        if (bVar != null) {
            bVar.f6914q--;
            bVar.b();
        }
        i0 i0Var3 = (i0) hVar.f1296e;
        if (i0Var3 == null || !i0Var3.h()) {
            return;
        }
        Object[] objArr = i0Var3.f8320b;
        long[] jArr = i0Var3.f8319a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            r10.f6914q--;
                            ((b) objArr[(i10 << 3) + i12]).b();
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i0Var3.b();
    }

    public final v d() {
        v zVar;
        v vVar = this.f6908k;
        k1.g gVar = this.f6909l;
        if (vVar != null) {
            return vVar;
        }
        if (gVar != null) {
            y yVar = new y(gVar);
            this.f6908k = yVar;
            return yVar;
        }
        long b10 = m.b(this.f6918u);
        long j = this.f6906h;
        long j3 = this.f6907i;
        if (j3 != 9205357640488583168L) {
            b10 = j3;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (b10 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (b10 & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            zVar = new a0(g8.b.i(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            zVar = new z(new j1.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f6908k = zVar;
        return zVar;
    }

    public final void e(long j, long j3, float f3) {
        if (j1.b.a(this.f6906h, j) && j1.e.a(this.f6907i, j3) && this.j == f3 && this.f6909l == null) {
            return;
        }
        this.f6908k = null;
        this.f6909l = null;
        this.g = true;
        this.f6911n = false;
        this.f6906h = j;
        this.f6907i = j3;
        this.j = f3;
        a();
    }
}
