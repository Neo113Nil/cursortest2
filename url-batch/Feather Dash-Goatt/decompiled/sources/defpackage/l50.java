package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l50 {
    public final p50 a;
    public Outline f;
    public float j;
    public ka0 k;
    public c6 l;
    public c6 m;
    public boolean n;
    public zf o;
    public xu1 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public nr b = uq1.d;
    public vc0 c = vc0.d;
    public Function1 d = y3.u;
    public final a3 e = new a3(13, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final vg r = new vg();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public l50(p50 p50Var) {
        this.a = p50Var;
        p50Var.p = false;
        p50Var.a();
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        p50 p50Var = this.a;
        RenderNode renderNode = p50Var.c;
        if (this.g) {
            boolean z = this.w;
            if (z || p50Var.l > 0.0f) {
                c6 c6Var = this.l;
                if (c6Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = c6Var instanceof c6;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = c6Var.a;
                    path.computeBounds(rectF, false);
                    Outline outline = this.f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f = outline;
                    }
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    outline.setPath(path);
                    this.n = !outline.canClip();
                    this.l = c6Var;
                    outline.setAlpha(p50Var.h);
                    Math.round(rectF.width());
                    Math.round(rectF.height());
                    renderNode.setOutline(outline);
                    p50Var.g = true;
                    p50Var.a();
                    if (this.n && this.w) {
                        p50Var.p = false;
                        p50Var.a();
                        renderNode.discardDisplayList();
                    } else {
                        p50Var.p = this.w;
                        p50Var.a();
                    }
                } else {
                    p50Var.p = z;
                    p50Var.a();
                    Outline outline2 = this.f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f = outline2;
                    }
                    Outline outline3 = outline2;
                    long x = ca0.x(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        x = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    int i3 = (int) (x >> 32);
                    int i4 = (int) (x & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), this.j);
                    outline3.setAlpha(p50Var.h);
                    Math.round(Float.intBitsToFloat(i3));
                    Math.round(Float.intBitsToFloat(i4));
                    renderNode.setOutline(outline3);
                    p50Var.g = true;
                    p50Var.a();
                }
            } else {
                p50Var.p = false;
                p50Var.a();
                renderNode.setOutline(null);
                p50Var.g = false;
                p50Var.a();
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            vg vgVar = this.r;
            l50 l50Var = (l50) vgVar.b;
            if (l50Var != null) {
                l50Var.q--;
                l50Var.b();
                vgVar.b = null;
            }
            wn0 wn0Var = (wn0) vgVar.d;
            if (wn0Var != null) {
                Object[] objArr = wn0Var.b;
                long[] jArr = wn0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((l50) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
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
                wn0Var.b();
            }
            this.a.c.discardDisplayList();
        }
    }

    public final void c(hu huVar) {
        vg vgVar = this.r;
        vgVar.c = (l50) vgVar.b;
        wn0 wn0Var = (wn0) vgVar.d;
        if (wn0Var != null && wn0Var.h()) {
            wn0 wn0Var2 = (wn0) vgVar.e;
            if (wn0Var2 == null) {
                wn0 wn0Var3 = r61.a;
                wn0Var2 = new wn0();
                vgVar.e = wn0Var2;
            }
            wn0Var2.j(wn0Var);
            wn0Var.b();
        }
        vgVar.a = true;
        this.d.invoke(huVar);
        vgVar.a = false;
        l50 l50Var = (l50) vgVar.c;
        if (l50Var != null) {
            l50Var.q--;
            l50Var.b();
        }
        wn0 wn0Var4 = (wn0) vgVar.e;
        if (wn0Var4 == null || !wn0Var4.h()) {
            return;
        }
        Object[] objArr = wn0Var4.b;
        long[] jArr = wn0Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((l50) objArr[(i << 3) + i3]).b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
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
        wn0Var4.b();
    }

    public final ka0 d() {
        ka0 ht0Var;
        ka0 ka0Var = this.k;
        c6 c6Var = this.l;
        if (ka0Var != null) {
            return ka0Var;
        }
        if (c6Var != null) {
            gt0 gt0Var = new gt0(c6Var);
            this.k = gt0Var;
            return gt0Var;
        }
        long x = ca0.x(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            x = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (x >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (x & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            ht0Var = new it0(xa0.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            ht0Var = new ht0(new s11(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = ht0Var;
        return ht0Var;
    }

    public final void e() {
        nr nrVar = this.b;
        vc0 vc0Var = this.c;
        a3 a3Var = this.e;
        p50 p50Var = this.a;
        zf zfVar = p50Var.b;
        RenderNode renderNode = p50Var.c;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        try {
            s40 s40Var = p50Var.a;
            j3 j3Var = (j3) s40Var.e;
            Canvas canvas = j3Var.a;
            j3Var.a = beginRecording;
            i8 i8Var = zfVar.e;
            i8Var.t(nrVar);
            i8Var.u(vc0Var);
            i8Var.g = this;
            i8Var.v(p50Var.d);
            i8Var.s(j3Var);
            a3Var.invoke(zfVar);
            ((j3) s40Var.e).a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    public final void f(long j) {
        if (wq0.b(this.v, j)) {
            return;
        }
        this.v = j;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.a.c;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            renderNode.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    public final void g(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        p50 p50Var = this.a;
        p50Var.c.setPosition(i, i2, ((int) (j2 >> 32)) + i, ((int) (4294967295L & j2)) + i2);
        p50Var.d = ca0.x(j2);
    }

    public final void h(float f, long j, long j2) {
        if (wq0.b(this.h, j) && va1.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
