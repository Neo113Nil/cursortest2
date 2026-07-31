package i1;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import f1.c0;
import f1.d0;
import f1.e0;
import f1.p;
import java.util.Locale;
import o.k0;
import o.s0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f3294a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f3299f;

    /* renamed from: j, reason: collision with root package name */
    public float f3302j;

    /* renamed from: k, reason: collision with root package name */
    public p f3303k;

    /* renamed from: l, reason: collision with root package name */
    public f1.j f3304l;

    /* renamed from: m, reason: collision with root package name */
    public f1.j f3305m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3306n;

    /* renamed from: o, reason: collision with root package name */
    public h1.b f3307o;

    /* renamed from: p, reason: collision with root package name */
    public f1.h f3308p;

    /* renamed from: q, reason: collision with root package name */
    public int f3309q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3311s;

    /* renamed from: t, reason: collision with root package name */
    public long f3312t;

    /* renamed from: u, reason: collision with root package name */
    public long f3313u;

    /* renamed from: v, reason: collision with root package name */
    public long f3314v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3315w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f3316x;

    /* renamed from: b, reason: collision with root package name */
    public r2.c f3295b = h1.c.f3078a;

    /* renamed from: c, reason: collision with root package name */
    public r2.l f3296c = r2.l.f6529d;

    /* renamed from: d, reason: collision with root package name */
    public q6.j f3297d = a.f3291f;

    /* renamed from: e, reason: collision with root package name */
    public final b1.e f3298e = new b1.e(7, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f3300g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f3301h = 0;
    public long i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final i0.h f3310r = new i0.h();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        q6.i.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public b(d dVar) {
        this.f3294a = dVar;
        dVar.t(false);
        this.f3312t = 0L;
        this.f3313u = 0L;
        this.f3314v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f3300g) {
            boolean z3 = this.f3315w;
            Outline outline2 = null;
            d dVar = this.f3294a;
            if (z3 || dVar.F() > 0.0f) {
                f1.j jVar = this.f3304l;
                if (jVar != null) {
                    RectF rectF = this.f3316x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f3316x = rectF;
                    }
                    boolean z7 = jVar instanceof f1.j;
                    if (!z7) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    jVar.f2669a.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || jVar.f2669a.isConvex()) {
                        outline = this.f3299f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f3299f = outline;
                        }
                        if (i >= 30) {
                            if (!z7) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(jVar.f2669a);
                        } else {
                            if (!z7) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(jVar.f2669a);
                        }
                        this.f3306n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f3299f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f3306n = true;
                        outline = null;
                    }
                    this.f3304l = jVar;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.l(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f3306n && this.f3315w) {
                        dVar.t(false);
                        dVar.q();
                    } else {
                        dVar.t(this.f3315w);
                    }
                } else {
                    dVar.t(this.f3315w);
                    Outline outline4 = this.f3299f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f3299f = outline4;
                    }
                    Outline outline5 = outline4;
                    long R = m.a.R(this.f3313u);
                    long j7 = this.f3301h;
                    long j8 = this.i;
                    if (j8 != 9205357640488583168L) {
                        R = j8;
                    }
                    int i8 = (int) (j7 >> 32);
                    int i9 = (int) (j7 & 4294967295L);
                    int i10 = (int) (R >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat(i9)), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat((int) (R & 4294967295L)) + Float.intBitsToFloat(i9)), this.f3302j);
                    outline5.setAlpha(dVar.a());
                    dVar.l(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i10)) << 32));
                }
            } else {
                dVar.t(false);
                dVar.l(null, 0L);
            }
        }
        this.f3300g = false;
    }

    public final void b() {
        if (this.f3311s && this.f3309q == 0) {
            i0.h hVar = this.f3310r;
            b bVar = (b) hVar.f3283b;
            if (bVar != null) {
                bVar.f3309q--;
                bVar.b();
                hVar.f3283b = null;
            }
            k0 k0Var = (k0) hVar.f3285d;
            if (k0Var != null) {
                Object[] objArr = k0Var.f5490b;
                long[] jArr = k0Var.f5489a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j7 = jArr[i];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j7) < 128) {
                                    r11.f3309q--;
                                    ((b) objArr[(i << 3) + i9]).b();
                                }
                                j7 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                k0Var.b();
            }
            this.f3294a.q();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [p6.c, q6.j] */
    public final void c(h1.d dVar) {
        i0.h hVar = this.f3310r;
        hVar.f3284c = (b) hVar.f3283b;
        k0 k0Var = (k0) hVar.f3285d;
        if (k0Var != null && k0Var.h()) {
            k0 k0Var2 = (k0) hVar.f3286e;
            if (k0Var2 == null) {
                k0 k0Var3 = s0.f5536a;
                k0Var2 = new k0();
                hVar.f3286e = k0Var2;
            }
            k0Var2.k(k0Var);
            k0Var.b();
        }
        hVar.f3282a = true;
        this.f3297d.i(dVar);
        hVar.f3282a = false;
        b bVar = (b) hVar.f3284c;
        if (bVar != null) {
            bVar.f3309q--;
            bVar.b();
        }
        k0 k0Var4 = (k0) hVar.f3286e;
        if (k0Var4 == null || !k0Var4.h()) {
            return;
        }
        Object[] objArr = k0Var4.f5490b;
        long[] jArr = k0Var4.f5489a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            r10.f3309q--;
                            ((b) objArr[(i << 3) + i9]).b();
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        k0Var4.b();
    }

    public final p d() {
        p d0Var;
        p pVar = this.f3303k;
        f1.j jVar = this.f3304l;
        if (pVar != null) {
            return pVar;
        }
        if (jVar != null) {
            c0 c0Var = new c0(jVar);
            this.f3303k = c0Var;
            return c0Var;
        }
        long R = m.a.R(this.f3313u);
        long j7 = this.f3301h;
        long j8 = this.i;
        if (j8 != 9205357640488583168L) {
            R = j8;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (R >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (R & 4294967295L)) + intBitsToFloat2;
        if (this.f3302j > 0.0f) {
            d0Var = new e0(s6.a.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            d0Var = new d0(new e1.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f3303k = d0Var;
        return d0Var;
    }

    public final void e(float f6, long j7, long j8) {
        if (e1.b.b(this.f3301h, j7) && e1.e.a(this.i, j8) && this.f3302j == f6 && this.f3304l == null) {
            return;
        }
        this.f3303k = null;
        this.f3304l = null;
        this.f3300g = true;
        this.f3306n = false;
        this.f3301h = j7;
        this.i = j8;
        this.f3302j = f6;
        a();
    }
}
