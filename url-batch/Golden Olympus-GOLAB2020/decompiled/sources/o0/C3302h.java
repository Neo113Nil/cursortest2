package o0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import kotlin.KotlinVersion;
import o0.C3271b;
import o0.C3274e;
import o0.C3276g;

/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3302h {

    /* renamed from: i, reason: collision with root package name */
    private static HashSet f41747i;

    /* renamed from: a, reason: collision with root package name */
    private Canvas f41748a;

    /* renamed from: b, reason: collision with root package name */
    private float f41749b;

    /* renamed from: c, reason: collision with root package name */
    private C3276g f41750c;

    /* renamed from: d, reason: collision with root package name */
    private C0240h f41751d;

    /* renamed from: e, reason: collision with root package name */
    private Stack f41752e;

    /* renamed from: f, reason: collision with root package name */
    private Stack f41753f;

    /* renamed from: g, reason: collision with root package name */
    private Stack f41754g;

    /* renamed from: h, reason: collision with root package name */
    private C3271b.q f41755h = null;

    /* renamed from: o0.h$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41756a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f41757b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f41758c;

        static {
            int[] iArr = new int[C3276g.E.d.values().length];
            f41758c = iArr;
            try {
                iArr[C3276g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41758c[C3276g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41758c[C3276g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C3276g.E.c.values().length];
            f41757b = iArr2;
            try {
                iArr2[C3276g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41757b[C3276g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41757b[C3276g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[C3274e.a.values().length];
            f41756a = iArr3;
            try {
                iArr3[C3274e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41756a[C3274e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41756a[C3274e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41756a[C3274e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41756a[C3274e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41756a[C3274e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41756a[C3274e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41756a[C3274e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* renamed from: o0.h$b */
    private class b implements C3276g.InterfaceC3299x {

        /* renamed from: b, reason: collision with root package name */
        private float f41760b;

        /* renamed from: c, reason: collision with root package name */
        private float f41761c;

        /* renamed from: h, reason: collision with root package name */
        private boolean f41766h;

        /* renamed from: a, reason: collision with root package name */
        private List f41759a = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private c f41762d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f41763e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f41764f = true;

        /* renamed from: g, reason: collision with root package name */
        private int f41765g = -1;

        b(C3276g.C3298w c3298w) {
            if (c3298w == null) {
                return;
            }
            c3298w.h(this);
            if (this.f41766h) {
                this.f41762d.b((c) this.f41759a.get(this.f41765g));
                this.f41759a.set(this.f41765g, this.f41762d);
                this.f41766h = false;
            }
            c cVar = this.f41762d;
            if (cVar != null) {
                this.f41759a.add(cVar);
            }
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void a(float f4, float f5, float f6, float f7) {
            this.f41762d.a(f4, f5);
            this.f41759a.add(this.f41762d);
            this.f41762d = C3302h.this.new c(f6, f7, f6 - f4, f7 - f5);
            this.f41766h = false;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void b(float f4, float f5) {
            if (this.f41766h) {
                this.f41762d.b((c) this.f41759a.get(this.f41765g));
                this.f41759a.set(this.f41765g, this.f41762d);
                this.f41766h = false;
            }
            c cVar = this.f41762d;
            if (cVar != null) {
                this.f41759a.add(cVar);
            }
            this.f41760b = f4;
            this.f41761c = f5;
            this.f41762d = C3302h.this.new c(f4, f5, 0.0f, 0.0f);
            this.f41765g = this.f41759a.size();
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void c(float f4, float f5, float f6, float f7, float f8, float f9) {
            if (this.f41764f || this.f41763e) {
                this.f41762d.a(f4, f5);
                this.f41759a.add(this.f41762d);
                this.f41763e = false;
            }
            this.f41762d = C3302h.this.new c(f8, f9, f8 - f6, f9 - f7);
            this.f41766h = false;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void close() {
            this.f41759a.add(this.f41762d);
            e(this.f41760b, this.f41761c);
            this.f41766h = true;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void d(float f4, float f5, float f6, boolean z4, boolean z5, float f7, float f8) {
            this.f41763e = true;
            this.f41764f = false;
            c cVar = this.f41762d;
            C3302h.h(cVar.f41768a, cVar.f41769b, f4, f5, f6, z4, z5, f7, f8, this);
            this.f41764f = true;
            this.f41766h = false;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void e(float f4, float f5) {
            this.f41762d.a(f4, f5);
            this.f41759a.add(this.f41762d);
            C3302h c3302h = C3302h.this;
            c cVar = this.f41762d;
            this.f41762d = c3302h.new c(f4, f5, f4 - cVar.f41768a, f5 - cVar.f41769b);
            this.f41766h = false;
        }

        List f() {
            return this.f41759a;
        }
    }

    /* renamed from: o0.h$c */
    private class c {

        /* renamed from: a, reason: collision with root package name */
        float f41768a;

        /* renamed from: b, reason: collision with root package name */
        float f41769b;

        /* renamed from: c, reason: collision with root package name */
        float f41770c;

        /* renamed from: d, reason: collision with root package name */
        float f41771d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41772e = false;

        c(float f4, float f5, float f6, float f7) {
            this.f41770c = 0.0f;
            this.f41771d = 0.0f;
            this.f41768a = f4;
            this.f41769b = f5;
            double sqrt = Math.sqrt((f6 * f6) + (f7 * f7));
            if (sqrt != 0.0d) {
                this.f41770c = (float) (f6 / sqrt);
                this.f41771d = (float) (f7 / sqrt);
            }
        }

        void a(float f4, float f5) {
            float f6 = f4 - this.f41768a;
            float f7 = f5 - this.f41769b;
            double sqrt = Math.sqrt((f6 * f6) + (f7 * f7));
            if (sqrt != 0.0d) {
                f6 = (float) (f6 / sqrt);
                f7 = (float) (f7 / sqrt);
            }
            float f8 = this.f41770c;
            if (f6 != (-f8) || f7 != (-this.f41771d)) {
                this.f41770c = f8 + f6;
                this.f41771d += f7;
            } else {
                this.f41772e = true;
                this.f41770c = -f7;
                this.f41771d = f6;
            }
        }

        void b(c cVar) {
            float f4 = cVar.f41770c;
            float f5 = this.f41770c;
            if (f4 == (-f5)) {
                float f6 = cVar.f41771d;
                if (f6 == (-this.f41771d)) {
                    this.f41772e = true;
                    this.f41770c = -f6;
                    this.f41771d = cVar.f41770c;
                    return;
                }
            }
            this.f41770c = f5 + f4;
            this.f41771d += cVar.f41771d;
        }

        public String toString() {
            return "(" + this.f41768a + StringUtils.COMMA + this.f41769b + " " + this.f41770c + StringUtils.COMMA + this.f41771d + ")";
        }
    }

    /* renamed from: o0.h$d */
    private class d implements C3276g.InterfaceC3299x {

        /* renamed from: a, reason: collision with root package name */
        Path f41774a = new Path();

        /* renamed from: b, reason: collision with root package name */
        float f41775b;

        /* renamed from: c, reason: collision with root package name */
        float f41776c;

        d(C3276g.C3298w c3298w) {
            if (c3298w == null) {
                return;
            }
            c3298w.h(this);
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void a(float f4, float f5, float f6, float f7) {
            this.f41774a.quadTo(f4, f5, f6, f7);
            this.f41775b = f6;
            this.f41776c = f7;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void b(float f4, float f5) {
            this.f41774a.moveTo(f4, f5);
            this.f41775b = f4;
            this.f41776c = f5;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void c(float f4, float f5, float f6, float f7, float f8, float f9) {
            this.f41774a.cubicTo(f4, f5, f6, f7, f8, f9);
            this.f41775b = f8;
            this.f41776c = f9;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void close() {
            this.f41774a.close();
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void d(float f4, float f5, float f6, boolean z4, boolean z5, float f7, float f8) {
            C3302h.h(this.f41775b, this.f41776c, f4, f5, f6, z4, z5, f7, f8, this);
            this.f41775b = f7;
            this.f41776c = f8;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void e(float f4, float f5) {
            this.f41774a.lineTo(f4, f5);
            this.f41775b = f4;
            this.f41776c = f5;
        }

        Path f() {
            return this.f41774a;
        }
    }

    /* renamed from: o0.h$e */
    private class e extends f {

        /* renamed from: e, reason: collision with root package name */
        private Path f41778e;

        e(Path path, float f4, float f5) {
            super(f4, f5);
            this.f41778e = path;
        }

        @Override // o0.C3302h.f, o0.C3302h.j
        public void b(String str) {
            String str2;
            if (C3302h.this.Y0()) {
                if (C3302h.this.f41751d.f41788b) {
                    str2 = str;
                    C3302h.this.f41748a.drawTextOnPath(str2, this.f41778e, this.f41780b, this.f41781c, C3302h.this.f41751d.f41790d);
                } else {
                    str2 = str;
                }
                if (C3302h.this.f41751d.f41789c) {
                    C3302h.this.f41748a.drawTextOnPath(str2, this.f41778e, this.f41780b, this.f41781c, C3302h.this.f41751d.f41791e);
                }
            } else {
                str2 = str;
            }
            this.f41780b += C3302h.this.f41751d.f41790d.measureText(str2);
        }
    }

    /* renamed from: o0.h$f */
    private class f extends j {

        /* renamed from: b, reason: collision with root package name */
        float f41780b;

        /* renamed from: c, reason: collision with root package name */
        float f41781c;

        f(float f4, float f5) {
            super(C3302h.this, null);
            this.f41780b = f4;
            this.f41781c = f5;
        }

        @Override // o0.C3302h.j
        public void b(String str) {
            C3302h.y("TextSequence render", new Object[0]);
            if (C3302h.this.Y0()) {
                if (C3302h.this.f41751d.f41788b) {
                    C3302h.this.f41748a.drawText(str, this.f41780b, this.f41781c, C3302h.this.f41751d.f41790d);
                }
                if (C3302h.this.f41751d.f41789c) {
                    C3302h.this.f41748a.drawText(str, this.f41780b, this.f41781c, C3302h.this.f41751d.f41791e);
                }
            }
            this.f41780b += C3302h.this.f41751d.f41790d.measureText(str);
        }
    }

    /* renamed from: o0.h$g */
    private class g extends j {

        /* renamed from: b, reason: collision with root package name */
        float f41783b;

        /* renamed from: c, reason: collision with root package name */
        float f41784c;

        /* renamed from: d, reason: collision with root package name */
        Path f41785d;

        g(float f4, float f5, Path path) {
            super(C3302h.this, null);
            this.f41783b = f4;
            this.f41784c = f5;
            this.f41785d = path;
        }

        @Override // o0.C3302h.j
        public boolean a(C3276g.Y y4) {
            if (!(y4 instanceof C3276g.Z)) {
                return true;
            }
            C3302h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // o0.C3302h.j
        public void b(String str) {
            String str2;
            if (C3302h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                C3302h.this.f41751d.f41790d.getTextPath(str2, 0, str.length(), this.f41783b, this.f41784c, path);
                this.f41785d.addPath(path);
            } else {
                str2 = str;
            }
            this.f41783b += C3302h.this.f41751d.f41790d.measureText(str2);
        }
    }

    /* renamed from: o0.h$i */
    private class i extends j {

        /* renamed from: b, reason: collision with root package name */
        float f41796b;

        /* renamed from: c, reason: collision with root package name */
        float f41797c;

        /* renamed from: d, reason: collision with root package name */
        RectF f41798d;

        i(float f4, float f5) {
            super(C3302h.this, null);
            this.f41798d = new RectF();
            this.f41796b = f4;
            this.f41797c = f5;
        }

        @Override // o0.C3302h.j
        public boolean a(C3276g.Y y4) {
            if (!(y4 instanceof C3276g.Z)) {
                return true;
            }
            C3276g.Z z4 = (C3276g.Z) y4;
            C3276g.N r4 = y4.f41637a.r(z4.f41650o);
            if (r4 == null) {
                C3302h.F("TextPath path reference '%s' not found", z4.f41650o);
                return false;
            }
            C3276g.C3297v c3297v = (C3276g.C3297v) r4;
            Path f4 = C3302h.this.new d(c3297v.f41732o).f();
            Matrix matrix = c3297v.f41704n;
            if (matrix != null) {
                f4.transform(matrix);
            }
            RectF rectF = new RectF();
            f4.computeBounds(rectF, true);
            this.f41798d.union(rectF);
            return false;
        }

        @Override // o0.C3302h.j
        public void b(String str) {
            if (C3302h.this.Y0()) {
                Rect rect = new Rect();
                C3302h.this.f41751d.f41790d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f41796b, this.f41797c);
                this.f41798d.union(rectF);
            }
            this.f41796b += C3302h.this.f41751d.f41790d.measureText(str);
        }
    }

    /* renamed from: o0.h$j */
    private abstract class j {
        private j() {
        }

        public boolean a(C3276g.Y y4) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(C3302h c3302h, a aVar) {
            this();
        }
    }

    C3302h(Canvas canvas, float f4) {
        this.f41748a = canvas;
        this.f41749b = f4;
    }

    private boolean A() {
        Boolean bool = this.f41751d.f41787a.f41538B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(C3276g.N n4) {
        if (n4 instanceof C3276g.InterfaceC3295t) {
            return;
        }
        S0();
        u(n4);
        if (n4 instanceof C3276g.F) {
            x0((C3276g.F) n4);
        } else if (n4 instanceof C3276g.e0) {
            E0((C3276g.e0) n4);
        } else if (n4 instanceof C3276g.S) {
            B0((C3276g.S) n4);
        } else if (n4 instanceof C3276g.C3288m) {
            q0((C3276g.C3288m) n4);
        } else if (n4 instanceof C3276g.C3290o) {
            r0((C3276g.C3290o) n4);
        } else if (n4 instanceof C3276g.C3297v) {
            t0((C3276g.C3297v) n4);
        } else if (n4 instanceof C3276g.B) {
            w0((C3276g.B) n4);
        } else if (n4 instanceof C3276g.C3280d) {
            o0((C3276g.C3280d) n4);
        } else if (n4 instanceof C3276g.C3284i) {
            p0((C3276g.C3284i) n4);
        } else if (n4 instanceof C3276g.C3292q) {
            s0((C3276g.C3292q) n4);
        } else if (n4 instanceof C3276g.A) {
            v0((C3276g.A) n4);
        } else if (n4 instanceof C3276g.C3301z) {
            u0((C3276g.C3301z) n4);
        } else if (n4 instanceof C3276g.W) {
            D0((C3276g.W) n4);
        }
        R0();
    }

    private void B(C3276g.K k4, Path path) {
        C3276g.O o4 = this.f41751d.f41787a.f41552c;
        if (o4 instanceof C3276g.C3296u) {
            C3276g.N r4 = this.f41750c.r(((C3276g.C3296u) o4).f41730b);
            if (r4 instanceof C3276g.C3300y) {
                L(k4, path, (C3276g.C3300y) r4);
                return;
            }
        }
        this.f41748a.drawPath(path, this.f41751d.f41790d);
    }

    private void B0(C3276g.S s4) {
        y("Switch render", new Object[0]);
        W0(this.f41751d, s4);
        if (A()) {
            Matrix matrix = s4.f41705o;
            if (matrix != null) {
                this.f41748a.concat(matrix);
            }
            p(s4);
            boolean m02 = m0();
            K0(s4);
            if (m02) {
                j0(s4);
            }
            U0(s4);
        }
    }

    private void C(Path path) {
        C0240h c0240h = this.f41751d;
        if (c0240h.f41787a.f41549M != C3276g.E.i.NonScalingStroke) {
            this.f41748a.drawPath(path, c0240h.f41791e);
            return;
        }
        Matrix matrix = this.f41748a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f41748a.setMatrix(new Matrix());
        Shader shader = this.f41751d.f41791e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f41748a.drawPath(path2, this.f41751d.f41791e);
        this.f41748a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(C3276g.T t4, C3276g.C3278b c3278b) {
        y("Symbol render", new Object[0]);
        if (c3278b.f41660c == 0.0f || c3278b.f41661d == 0.0f) {
            return;
        }
        C3274e c3274e = t4.f41639o;
        if (c3274e == null) {
            c3274e = C3274e.f41494e;
        }
        W0(this.f41751d, t4);
        C0240h c0240h = this.f41751d;
        c0240h.f41792f = c3278b;
        if (!c0240h.f41787a.f41572w.booleanValue()) {
            C3276g.C3278b c3278b2 = this.f41751d.f41792f;
            O0(c3278b2.f41658a, c3278b2.f41659b, c3278b2.f41660c, c3278b2.f41661d);
        }
        C3276g.C3278b c3278b3 = t4.f41645p;
        if (c3278b3 != null) {
            this.f41748a.concat(o(this.f41751d.f41792f, c3278b3, c3274e));
            this.f41751d.f41793g = t4.f41645p;
        } else {
            Canvas canvas = this.f41748a;
            C3276g.C3278b c3278b4 = this.f41751d.f41792f;
            canvas.translate(c3278b4.f41658a, c3278b4.f41659b);
        }
        boolean m02 = m0();
        F0(t4, true);
        if (m02) {
            j0(t4);
        }
        U0(t4);
    }

    private float D(float f4, float f5, float f6, float f7) {
        return (f4 * f6) + (f5 * f7);
    }

    private void D0(C3276g.W w4) {
        y("Text render", new Object[0]);
        W0(this.f41751d, w4);
        if (A()) {
            Matrix matrix = w4.f41649s;
            if (matrix != null) {
                this.f41748a.concat(matrix);
            }
            List list = w4.f41654o;
            float f4 = 0.0f;
            float e4 = (list == null || list.size() == 0) ? 0.0f : ((C3276g.C3291p) w4.f41654o.get(0)).e(this);
            List list2 = w4.f41655p;
            float f5 = (list2 == null || list2.size() == 0) ? 0.0f : ((C3276g.C3291p) w4.f41655p.get(0)).f(this);
            List list3 = w4.f41656q;
            float e5 = (list3 == null || list3.size() == 0) ? 0.0f : ((C3276g.C3291p) w4.f41656q.get(0)).e(this);
            List list4 = w4.f41657r;
            if (list4 != null && list4.size() != 0) {
                f4 = ((C3276g.C3291p) w4.f41657r.get(0)).f(this);
            }
            C3276g.E.f O3 = O();
            if (O3 != C3276g.E.f.Start) {
                float n4 = n(w4);
                if (O3 == C3276g.E.f.Middle) {
                    n4 /= 2.0f;
                }
                e4 -= n4;
            }
            if (w4.f41627h == null) {
                i iVar = new i(e4, f5);
                E(w4, iVar);
                RectF rectF = iVar.f41798d;
                w4.f41627h = new C3276g.C3278b(rectF.left, rectF.top, rectF.width(), iVar.f41798d.height());
            }
            U0(w4);
            r(w4);
            p(w4);
            boolean m02 = m0();
            E(w4, new f(e4 + e5, f5 + f4));
            if (m02) {
                j0(w4);
            }
        }
    }

    private void E(C3276g.Y y4, j jVar) {
        if (A()) {
            Iterator it = y4.f41616i.iterator();
            boolean z4 = true;
            while (it.hasNext()) {
                C3276g.N n4 = (C3276g.N) it.next();
                if (n4 instanceof C3276g.c0) {
                    jVar.b(T0(((C3276g.c0) n4).f41666c, z4, !it.hasNext()));
                } else {
                    l0(n4, jVar);
                }
                z4 = false;
            }
        }
    }

    private void E0(C3276g.e0 e0Var) {
        y("Use render", new Object[0]);
        C3276g.C3291p c3291p = e0Var.f41685s;
        if (c3291p == null || !c3291p.i()) {
            C3276g.C3291p c3291p2 = e0Var.f41686t;
            if (c3291p2 == null || !c3291p2.i()) {
                W0(this.f41751d, e0Var);
                if (A()) {
                    C3276g.N r4 = e0Var.f41637a.r(e0Var.f41682p);
                    if (r4 == null) {
                        F("Use reference '%s' not found", e0Var.f41682p);
                        return;
                    }
                    Matrix matrix = e0Var.f41705o;
                    if (matrix != null) {
                        this.f41748a.concat(matrix);
                    }
                    C3276g.C3291p c3291p3 = e0Var.f41683q;
                    float e4 = c3291p3 != null ? c3291p3.e(this) : 0.0f;
                    C3276g.C3291p c3291p4 = e0Var.f41684r;
                    this.f41748a.translate(e4, c3291p4 != null ? c3291p4.f(this) : 0.0f);
                    p(e0Var);
                    boolean m02 = m0();
                    i0(e0Var);
                    if (r4 instanceof C3276g.F) {
                        C3276g.C3278b f02 = f0(null, null, e0Var.f41685s, e0Var.f41686t);
                        S0();
                        y0((C3276g.F) r4, f02);
                        R0();
                    } else if (r4 instanceof C3276g.T) {
                        C3276g.C3291p c3291p5 = e0Var.f41685s;
                        if (c3291p5 == null) {
                            c3291p5 = new C3276g.C3291p(100.0f, C3276g.d0.percent);
                        }
                        C3276g.C3291p c3291p6 = e0Var.f41686t;
                        if (c3291p6 == null) {
                            c3291p6 = new C3276g.C3291p(100.0f, C3276g.d0.percent);
                        }
                        C3276g.C3278b f03 = f0(null, null, c3291p5, c3291p6);
                        S0();
                        C0((C3276g.T) r4, f03);
                        R0();
                    } else {
                        A0(r4);
                    }
                    h0();
                    if (m02) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(C3276g.J j4, boolean z4) {
        if (z4) {
            i0(j4);
        }
        Iterator it = j4.getChildren().iterator();
        while (it.hasNext()) {
            A0((C3276g.N) it.next());
        }
        if (z4) {
            h0();
        }
    }

    private void G(C3276g.Y y4, StringBuilder sb) {
        Iterator it = y4.f41616i.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            C3276g.N n4 = (C3276g.N) it.next();
            if (n4 instanceof C3276g.Y) {
                G((C3276g.Y) n4, sb);
            } else if (n4 instanceof C3276g.c0) {
                sb.append(T0(((C3276g.c0) n4).f41666c, z4, !it.hasNext()));
            }
            z4 = false;
        }
    }

    private void H(C3276g.AbstractC3285j abstractC3285j, String str) {
        C3276g.N r4 = abstractC3285j.f41637a.r(str);
        if (r4 == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(r4 instanceof C3276g.AbstractC3285j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (r4 == abstractC3285j) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        C3276g.AbstractC3285j abstractC3285j2 = (C3276g.AbstractC3285j) r4;
        if (abstractC3285j.f41696i == null) {
            abstractC3285j.f41696i = abstractC3285j2.f41696i;
        }
        if (abstractC3285j.f41697j == null) {
            abstractC3285j.f41697j = abstractC3285j2.f41697j;
        }
        if (abstractC3285j.f41698k == null) {
            abstractC3285j.f41698k = abstractC3285j2.f41698k;
        }
        if (abstractC3285j.f41695h.isEmpty()) {
            abstractC3285j.f41695h = abstractC3285j2.f41695h;
        }
        try {
            if (abstractC3285j instanceof C3276g.M) {
                I((C3276g.M) abstractC3285j, (C3276g.M) r4);
            } else {
                J((C3276g.Q) abstractC3285j, (C3276g.Q) r4);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC3285j2.f41699l;
        if (str2 != null) {
            H(abstractC3285j, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void H0(C3276g.C3293r c3293r, c cVar) {
        float f4;
        C3276g.C3278b c3278b;
        boolean m02;
        float f5;
        float f6;
        float f7;
        S0();
        Float f8 = c3293r.f41723v;
        float f9 = 0.0f;
        if (f8 != null) {
            if (Float.isNaN(f8.floatValue())) {
                float f10 = cVar.f41770c;
                if (f10 != 0.0f || cVar.f41771d != 0.0f) {
                    f4 = (float) Math.toDegrees(Math.atan2(cVar.f41771d, f10));
                }
            } else {
                f4 = c3293r.f41723v.floatValue();
            }
            float b4 = !c3293r.f41718q ? 1.0f : this.f41751d.f41787a.f41557h.b(this.f41749b);
            this.f41751d = M(c3293r);
            Matrix matrix = new Matrix();
            matrix.preTranslate(cVar.f41768a, cVar.f41769b);
            matrix.preRotate(f4);
            matrix.preScale(b4, b4);
            C3276g.C3291p c3291p = c3293r.f41719r;
            float e4 = c3291p == null ? c3291p.e(this) : 0.0f;
            C3276g.C3291p c3291p2 = c3293r.f41720s;
            float f11 = c3291p2 == null ? c3291p2.f(this) : 0.0f;
            C3276g.C3291p c3291p3 = c3293r.f41721t;
            float e5 = c3291p3 == null ? c3291p3.e(this) : 3.0f;
            C3276g.C3291p c3291p4 = c3293r.f41722u;
            float f12 = c3291p4 != null ? c3291p4.f(this) : 3.0f;
            c3278b = c3293r.f41645p;
            if (c3278b == null) {
                float f13 = e5 / c3278b.f41660c;
                float f14 = f12 / c3278b.f41661d;
                C3274e c3274e = c3293r.f41639o;
                if (c3274e == null) {
                    c3274e = C3274e.f41494e;
                }
                if (!c3274e.equals(C3274e.f41493d)) {
                    f13 = c3274e.b() == C3274e.b.slice ? Math.max(f13, f14) : Math.min(f13, f14);
                    f14 = f13;
                }
                matrix.preTranslate((-e4) * f13, (-f11) * f14);
                this.f41748a.concat(matrix);
                C3276g.C3278b c3278b2 = c3293r.f41645p;
                float f15 = c3278b2.f41660c * f13;
                float f16 = c3278b2.f41661d * f14;
                int[] iArr = a.f41756a;
                switch (iArr[c3274e.a().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f5 = (e5 - f15) / 2.0f;
                        f6 = 0.0f - f5;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f5 = e5 - f15;
                        f6 = 0.0f - f5;
                        break;
                    default:
                        f6 = 0.0f;
                        break;
                }
                int i4 = iArr[c3274e.a().ordinal()];
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 5) {
                            if (i4 != 6) {
                                if (i4 != 7) {
                                }
                            }
                        }
                    }
                    f7 = f12 - f16;
                    f9 = 0.0f - f7;
                    if (!this.f41751d.f41787a.f41572w.booleanValue()) {
                        O0(f6, f9, e5, f12);
                    }
                    matrix.reset();
                    matrix.preScale(f13, f14);
                    this.f41748a.concat(matrix);
                }
                f7 = (f12 - f16) / 2.0f;
                f9 = 0.0f - f7;
                if (!this.f41751d.f41787a.f41572w.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f13, f14);
                this.f41748a.concat(matrix);
            } else {
                matrix.preTranslate(-e4, -f11);
                this.f41748a.concat(matrix);
                if (!this.f41751d.f41787a.f41572w.booleanValue()) {
                    O0(0.0f, 0.0f, e5, f12);
                }
            }
            m02 = m0();
            F0(c3293r, false);
            if (m02) {
                j0(c3293r);
            }
            R0();
        }
        f4 = 0.0f;
        if (!c3293r.f41718q) {
        }
        this.f41751d = M(c3293r);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(cVar.f41768a, cVar.f41769b);
        matrix2.preRotate(f4);
        matrix2.preScale(b4, b4);
        C3276g.C3291p c3291p5 = c3293r.f41719r;
        if (c3291p5 == null) {
        }
        C3276g.C3291p c3291p22 = c3293r.f41720s;
        if (c3291p22 == null) {
        }
        C3276g.C3291p c3291p32 = c3293r.f41721t;
        if (c3291p32 == null) {
        }
        C3276g.C3291p c3291p42 = c3293r.f41722u;
        if (c3291p42 != null) {
        }
        c3278b = c3293r.f41645p;
        if (c3278b == null) {
        }
        m02 = m0();
        F0(c3293r, false);
        if (m02) {
        }
        R0();
    }

    private void I(C3276g.M m4, C3276g.M m5) {
        if (m4.f41633m == null) {
            m4.f41633m = m5.f41633m;
        }
        if (m4.f41634n == null) {
            m4.f41634n = m5.f41634n;
        }
        if (m4.f41635o == null) {
            m4.f41635o = m5.f41635o;
        }
        if (m4.f41636p == null) {
            m4.f41636p = m5.f41636p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void I0(C3276g.AbstractC3287l abstractC3287l) {
        C3276g.C3293r c3293r;
        String str;
        C3276g.C3293r c3293r2;
        String str2;
        C3276g.C3293r c3293r3;
        List f4;
        int size;
        int i4;
        C3276g.E e4 = this.f41751d.f41787a;
        String str3 = e4.f41574y;
        if (str3 == null && e4.f41575z == null && e4.f41537A == null) {
            return;
        }
        if (str3 != null) {
            C3276g.N r4 = abstractC3287l.f41637a.r(str3);
            if (r4 != null) {
                c3293r = (C3276g.C3293r) r4;
                str = this.f41751d.f41787a.f41575z;
                if (str != null) {
                    C3276g.N r5 = abstractC3287l.f41637a.r(str);
                    if (r5 != null) {
                        c3293r2 = (C3276g.C3293r) r5;
                        str2 = this.f41751d.f41787a.f41537A;
                        if (str2 != null) {
                            C3276g.N r6 = abstractC3287l.f41637a.r(str2);
                            if (r6 != null) {
                                c3293r3 = (C3276g.C3293r) r6;
                                f4 = !(abstractC3287l instanceof C3276g.C3297v) ? new b(((C3276g.C3297v) abstractC3287l).f41732o).f() : abstractC3287l instanceof C3276g.C3292q ? k((C3276g.C3292q) abstractC3287l) : l((C3276g.C3301z) abstractC3287l);
                                if (f4 == null && (size = f4.size()) != 0) {
                                    C3276g.E e5 = this.f41751d.f41787a;
                                    e5.f41537A = null;
                                    e5.f41575z = null;
                                    e5.f41574y = null;
                                    if (c3293r != null) {
                                        H0(c3293r, (c) f4.get(0));
                                    }
                                    if (c3293r2 != null && f4.size() > 2) {
                                        c cVar = (c) f4.get(0);
                                        c cVar2 = (c) f4.get(1);
                                        i4 = 1;
                                        while (i4 < size - 1) {
                                            i4++;
                                            c cVar3 = (c) f4.get(i4);
                                            cVar = cVar2.f41772e ? n0(cVar, cVar2, cVar3) : cVar2;
                                            H0(c3293r2, cVar);
                                            cVar2 = cVar3;
                                        }
                                    }
                                    if (c3293r3 == null) {
                                        H0(c3293r3, (c) f4.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            F("Marker reference '%s' not found", this.f41751d.f41787a.f41537A);
                        }
                        c3293r3 = null;
                        if (!(abstractC3287l instanceof C3276g.C3297v)) {
                        }
                        if (f4 == null) {
                            return;
                        }
                        C3276g.E e52 = this.f41751d.f41787a;
                        e52.f41537A = null;
                        e52.f41575z = null;
                        e52.f41574y = null;
                        if (c3293r != null) {
                        }
                        if (c3293r2 != null) {
                            c cVar4 = (c) f4.get(0);
                            c cVar22 = (c) f4.get(1);
                            i4 = 1;
                            while (i4 < size - 1) {
                            }
                        }
                        if (c3293r3 == null) {
                        }
                    } else {
                        F("Marker reference '%s' not found", this.f41751d.f41787a.f41575z);
                    }
                }
                c3293r2 = null;
                str2 = this.f41751d.f41787a.f41537A;
                if (str2 != null) {
                }
                c3293r3 = null;
                if (!(abstractC3287l instanceof C3276g.C3297v)) {
                }
                if (f4 == null) {
                }
            } else {
                F("Marker reference '%s' not found", this.f41751d.f41787a.f41574y);
            }
        }
        c3293r = null;
        str = this.f41751d.f41787a.f41575z;
        if (str != null) {
        }
        c3293r2 = null;
        str2 = this.f41751d.f41787a.f41537A;
        if (str2 != null) {
        }
        c3293r3 = null;
        if (!(abstractC3287l instanceof C3276g.C3297v)) {
        }
        if (f4 == null) {
        }
    }

    private void J(C3276g.Q q4, C3276g.Q q5) {
        if (q4.f41640m == null) {
            q4.f41640m = q5.f41640m;
        }
        if (q4.f41641n == null) {
            q4.f41641n = q5.f41641n;
        }
        if (q4.f41642o == null) {
            q4.f41642o = q5.f41642o;
        }
        if (q4.f41643p == null) {
            q4.f41643p = q5.f41643p;
        }
        if (q4.f41644q == null) {
            q4.f41644q = q5.f41644q;
        }
    }

    private void J0(C3276g.C3294s c3294s, C3276g.K k4, C3276g.C3278b c3278b) {
        float f4;
        float f5;
        y("Mask render", new Object[0]);
        Boolean bool = c3294s.f41724o;
        if (bool == null || !bool.booleanValue()) {
            C3276g.C3291p c3291p = c3294s.f41728s;
            float d4 = c3291p != null ? c3291p.d(this, 1.0f) : 1.2f;
            C3276g.C3291p c3291p2 = c3294s.f41729t;
            float d5 = c3291p2 != null ? c3291p2.d(this, 1.0f) : 1.2f;
            f4 = d4 * c3278b.f41660c;
            f5 = d5 * c3278b.f41661d;
        } else {
            C3276g.C3291p c3291p3 = c3294s.f41728s;
            f4 = c3291p3 != null ? c3291p3.e(this) : c3278b.f41660c;
            C3276g.C3291p c3291p4 = c3294s.f41729t;
            f5 = c3291p4 != null ? c3291p4.f(this) : c3278b.f41661d;
        }
        if (f4 == 0.0f || f5 == 0.0f) {
            return;
        }
        S0();
        C0240h M3 = M(c3294s);
        this.f41751d = M3;
        M3.f41787a.f41563n = Float.valueOf(1.0f);
        boolean m02 = m0();
        this.f41748a.save();
        Boolean bool2 = c3294s.f41725p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f41748a.translate(c3278b.f41658a, c3278b.f41659b);
            this.f41748a.scale(c3278b.f41660c, c3278b.f41661d);
        }
        F0(c3294s, false);
        this.f41748a.restore();
        if (m02) {
            k0(k4, c3278b);
        }
        R0();
    }

    private void K(C3276g.C3300y c3300y, String str) {
        C3276g.N r4 = c3300y.f41637a.r(str);
        if (r4 == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(r4 instanceof C3276g.C3300y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (r4 == c3300y) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C3276g.C3300y c3300y2 = (C3276g.C3300y) r4;
        if (c3300y.f41738q == null) {
            c3300y.f41738q = c3300y2.f41738q;
        }
        if (c3300y.f41739r == null) {
            c3300y.f41739r = c3300y2.f41739r;
        }
        if (c3300y.f41740s == null) {
            c3300y.f41740s = c3300y2.f41740s;
        }
        if (c3300y.f41741t == null) {
            c3300y.f41741t = c3300y2.f41741t;
        }
        if (c3300y.f41742u == null) {
            c3300y.f41742u = c3300y2.f41742u;
        }
        if (c3300y.f41743v == null) {
            c3300y.f41743v = c3300y2.f41743v;
        }
        if (c3300y.f41744w == null) {
            c3300y.f41744w = c3300y2.f41744w;
        }
        if (c3300y.f41616i.isEmpty()) {
            c3300y.f41616i = c3300y2.f41616i;
        }
        if (c3300y.f41645p == null) {
            c3300y.f41645p = c3300y2.f41645p;
        }
        if (c3300y.f41639o == null) {
            c3300y.f41639o = c3300y2.f41639o;
        }
        String str2 = c3300y2.f41745x;
        if (str2 != null) {
            K(c3300y, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(C3276g.S s4) {
        Set a4;
        String language = Locale.getDefault().getLanguage();
        C3276g.k();
        for (C3276g.N n4 : s4.getChildren()) {
            if (n4 instanceof C3276g.G) {
                C3276g.G g4 = (C3276g.G) n4;
                if (g4.c() == null && ((a4 = g4.a()) == null || (!a4.isEmpty() && a4.contains(language)))) {
                    Set requiredFeatures = g4.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f41747i == null) {
                            V();
                        }
                        if (!requiredFeatures.isEmpty() && f41747i.containsAll(requiredFeatures)) {
                        }
                    }
                    Set k4 = g4.k();
                    if (k4 != null) {
                        k4.isEmpty();
                    } else {
                        Set l4 = g4.l();
                        if (l4 == null) {
                            A0(n4);
                            return;
                        }
                        l4.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void L(C3276g.K k4, Path path, C3276g.C3300y c3300y) {
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z4;
        boolean z5;
        float floor;
        float c4;
        boolean m02;
        float f8;
        Boolean bool = c3300y.f41738q;
        boolean z6 = bool != null && bool.booleanValue();
        String str = c3300y.f41745x;
        if (str != null) {
            K(c3300y, str);
        }
        if (z6) {
            C3276g.C3291p c3291p = c3300y.f41741t;
            f4 = c3291p != null ? c3291p.e(this) : 0.0f;
            C3276g.C3291p c3291p2 = c3300y.f41742u;
            f6 = c3291p2 != null ? c3291p2.f(this) : 0.0f;
            C3276g.C3291p c3291p3 = c3300y.f41743v;
            f7 = c3291p3 != null ? c3291p3.e(this) : 0.0f;
            C3276g.C3291p c3291p4 = c3300y.f41744w;
            f5 = c3291p4 != null ? c3291p4.f(this) : 0.0f;
        } else {
            C3276g.C3291p c3291p5 = c3300y.f41741t;
            float d4 = c3291p5 != null ? c3291p5.d(this, 1.0f) : 0.0f;
            C3276g.C3291p c3291p6 = c3300y.f41742u;
            float d5 = c3291p6 != null ? c3291p6.d(this, 1.0f) : 0.0f;
            C3276g.C3291p c3291p7 = c3300y.f41743v;
            float d6 = c3291p7 != null ? c3291p7.d(this, 1.0f) : 0.0f;
            C3276g.C3291p c3291p8 = c3300y.f41744w;
            float d7 = c3291p8 != null ? c3291p8.d(this, 1.0f) : 0.0f;
            C3276g.C3278b c3278b = k4.f41627h;
            float f9 = c3278b.f41658a;
            float f10 = c3278b.f41660c;
            f4 = (d4 * f10) + f9;
            float f11 = c3278b.f41659b;
            float f12 = c3278b.f41661d;
            float f13 = d6 * f10;
            f5 = d7 * f12;
            f6 = (d5 * f12) + f11;
            f7 = f13;
        }
        if (f7 == 0.0f || f5 == 0.0f) {
            return;
        }
        C3274e c3274e = c3300y.f41639o;
        if (c3274e == null) {
            c3274e = C3274e.f41494e;
        }
        S0();
        this.f41748a.clipPath(path);
        C0240h c0240h = new C0240h();
        V0(c0240h, C3276g.E.a());
        c0240h.f41787a.f41572w = Boolean.FALSE;
        this.f41751d = N(c3300y, c0240h);
        C3276g.C3278b c3278b2 = k4.f41627h;
        Matrix matrix = c3300y.f41740s;
        if (matrix != null) {
            this.f41748a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (c3300y.f41740s.invert(matrix2)) {
                C3276g.C3278b c3278b3 = k4.f41627h;
                float f14 = c3278b3.f41658a;
                float f15 = c3278b3.f41659b;
                float b4 = c3278b3.b();
                z4 = false;
                C3276g.C3278b c3278b4 = k4.f41627h;
                z5 = true;
                float f16 = c3278b4.f41659b;
                float b5 = c3278b4.b();
                float c5 = k4.f41627h.c();
                C3276g.C3278b c3278b5 = k4.f41627h;
                float[] fArr = {f14, f15, b4, f16, b5, c5, c3278b5.f41658a, c3278b5.c()};
                matrix2.mapPoints(fArr);
                float f17 = fArr[0];
                float f18 = fArr[1];
                RectF rectF = new RectF(f17, f18, f17, f18);
                for (int i4 = 2; i4 <= 6; i4 += 2) {
                    float f19 = fArr[i4];
                    if (f19 < rectF.left) {
                        rectF.left = f19;
                    }
                    if (f19 > rectF.right) {
                        rectF.right = f19;
                    }
                    float f20 = fArr[i4 + 1];
                    if (f20 < rectF.top) {
                        rectF.top = f20;
                    }
                    if (f20 > rectF.bottom) {
                        rectF.bottom = f20;
                    }
                }
                float f21 = rectF.left;
                float f22 = rectF.top;
                c3278b2 = new C3276g.C3278b(f21, f22, rectF.right - f21, rectF.bottom - f22);
                float floor2 = f4 + (((float) Math.floor((c3278b2.f41658a - f4) / f7)) * f7);
                float b6 = c3278b2.b();
                c4 = c3278b2.c();
                C3276g.C3278b c3278b6 = new C3276g.C3278b(0.0f, 0.0f, f7, f5);
                m02 = m0();
                for (floor = f6 + (((float) Math.floor((c3278b2.f41659b - f6) / f5)) * f5); floor < c4; floor += f5) {
                    float f23 = floor2;
                    while (f23 < b6) {
                        c3278b6.f41658a = f23;
                        c3278b6.f41659b = floor;
                        S0();
                        if (this.f41751d.f41787a.f41572w.booleanValue()) {
                            f8 = b6;
                        } else {
                            f8 = b6;
                            O0(c3278b6.f41658a, c3278b6.f41659b, c3278b6.f41660c, c3278b6.f41661d);
                        }
                        C3276g.C3278b c3278b7 = c3300y.f41645p;
                        if (c3278b7 != null) {
                            this.f41748a.concat(o(c3278b6, c3278b7, c3274e));
                        } else {
                            Boolean bool2 = c3300y.f41739r;
                            boolean z7 = (bool2 == null || bool2.booleanValue()) ? z5 : z4;
                            this.f41748a.translate(f23, floor);
                            if (!z7) {
                                Canvas canvas = this.f41748a;
                                C3276g.C3278b c3278b8 = k4.f41627h;
                                canvas.scale(c3278b8.f41660c, c3278b8.f41661d);
                            }
                        }
                        Iterator it = c3300y.f41616i.iterator();
                        while (it.hasNext()) {
                            A0((C3276g.N) it.next());
                        }
                        R0();
                        f23 += f7;
                        b6 = f8;
                    }
                }
                if (m02) {
                    j0(c3300y);
                }
                R0();
            }
        }
        z4 = false;
        z5 = true;
        float floor22 = f4 + (((float) Math.floor((c3278b2.f41658a - f4) / f7)) * f7);
        float b62 = c3278b2.b();
        c4 = c3278b2.c();
        C3276g.C3278b c3278b62 = new C3276g.C3278b(0.0f, 0.0f, f7, f5);
        m02 = m0();
        while (floor < c4) {
        }
        if (m02) {
        }
        R0();
    }

    private void L0(C3276g.Z z4) {
        y("TextPath render", new Object[0]);
        W0(this.f41751d, z4);
        if (A() && Y0()) {
            C3276g.N r4 = z4.f41637a.r(z4.f41650o);
            if (r4 == null) {
                F("TextPath reference '%s' not found", z4.f41650o);
                return;
            }
            C3276g.C3297v c3297v = (C3276g.C3297v) r4;
            Path f4 = new d(c3297v.f41732o).f();
            Matrix matrix = c3297v.f41704n;
            if (matrix != null) {
                f4.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(f4, false);
            C3276g.C3291p c3291p = z4.f41651p;
            float d4 = c3291p != null ? c3291p.d(this, pathMeasure.getLength()) : 0.0f;
            C3276g.E.f O3 = O();
            if (O3 != C3276g.E.f.Start) {
                float n4 = n(z4);
                if (O3 == C3276g.E.f.Middle) {
                    n4 /= 2.0f;
                }
                d4 -= n4;
            }
            r((C3276g.K) z4.e());
            boolean m02 = m0();
            E(z4, new e(f4, d4, 0.0f));
            if (m02) {
                j0(z4);
            }
        }
    }

    private C0240h M(C3276g.N n4) {
        C0240h c0240h = new C0240h();
        V0(c0240h, C3276g.E.a());
        return N(n4, c0240h);
    }

    private boolean M0() {
        return this.f41751d.f41787a.f41563n.floatValue() < 1.0f || this.f41751d.f41787a.f41544H != null;
    }

    private C0240h N(C3276g.N n4, C0240h c0240h) {
        int i4;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i4 = 0;
            if (n4 instanceof C3276g.L) {
                arrayList.add(0, (C3276g.L) n4);
            }
            Object obj = n4.f41638b;
            if (obj == null) {
                break;
            }
            n4 = (C3276g.N) obj;
        }
        int size = arrayList.size();
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            W0(c0240h, (C3276g.L) obj2);
        }
        C0240h c0240h2 = this.f41751d;
        c0240h.f41793g = c0240h2.f41793g;
        c0240h.f41792f = c0240h2.f41792f;
        return c0240h;
    }

    private void N0() {
        this.f41751d = new C0240h();
        this.f41752e = new Stack();
        V0(this.f41751d, C3276g.E.a());
        C0240h c0240h = this.f41751d;
        c0240h.f41792f = null;
        c0240h.f41794h = false;
        this.f41752e.push(new C0240h(c0240h));
        this.f41754g = new Stack();
        this.f41753f = new Stack();
    }

    private C3276g.E.f O() {
        C3276g.E.f fVar;
        C3276g.E e4 = this.f41751d.f41787a;
        if (e4.f41570u == C3276g.E.h.LTR || (fVar = e4.f41571v) == C3276g.E.f.Middle) {
            return e4.f41571v;
        }
        C3276g.E.f fVar2 = C3276g.E.f.Start;
        return fVar == fVar2 ? C3276g.E.f.End : fVar2;
    }

    private void O0(float f4, float f5, float f6, float f7) {
        float f8 = f6 + f4;
        float f9 = f7 + f5;
        C3276g.C3279c c3279c = this.f41751d.f41787a.f41573x;
        if (c3279c != null) {
            f4 += c3279c.f41665d.e(this);
            f5 += this.f41751d.f41787a.f41573x.f41662a.f(this);
            f8 -= this.f41751d.f41787a.f41573x.f41663b.e(this);
            f9 -= this.f41751d.f41787a.f41573x.f41664c.f(this);
        }
        this.f41748a.clipRect(f4, f5, f8, f9);
    }

    private Path.FillType P() {
        C3276g.E.a aVar = this.f41751d.f41787a.f41543G;
        return (aVar == null || aVar != C3276g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0240h c0240h, boolean z4, C3276g.O o4) {
        int i4;
        C3276g.E e4 = c0240h.f41787a;
        float floatValue = (z4 ? e4.f41554e : e4.f41556g).floatValue();
        if (o4 instanceof C3276g.C3282f) {
            i4 = ((C3276g.C3282f) o4).f41689b;
        } else if (!(o4 instanceof C3276g.C0239g)) {
            return;
        } else {
            i4 = c0240h.f41787a.f41564o.f41689b;
        }
        int x4 = x(i4, floatValue);
        if (z4) {
            c0240h.f41790d.setColor(x4);
        } else {
            c0240h.f41791e.setColor(x4);
        }
    }

    private void Q0(boolean z4, C3276g.C c4) {
        if (z4) {
            if (W(c4.f41630e, 2147483648L)) {
                C0240h c0240h = this.f41751d;
                C3276g.E e4 = c0240h.f41787a;
                C3276g.O o4 = c4.f41630e.f41545I;
                e4.f41552c = o4;
                c0240h.f41788b = o4 != null;
            }
            if (W(c4.f41630e, 4294967296L)) {
                this.f41751d.f41787a.f41554e = c4.f41630e.f41546J;
            }
            if (W(c4.f41630e, 6442450944L)) {
                C0240h c0240h2 = this.f41751d;
                P0(c0240h2, z4, c0240h2.f41787a.f41552c);
                return;
            }
            return;
        }
        if (W(c4.f41630e, 2147483648L)) {
            C0240h c0240h3 = this.f41751d;
            C3276g.E e5 = c0240h3.f41787a;
            C3276g.O o5 = c4.f41630e.f41545I;
            e5.f41555f = o5;
            c0240h3.f41789c = o5 != null;
        }
        if (W(c4.f41630e, 4294967296L)) {
            this.f41751d.f41787a.f41556g = c4.f41630e.f41546J;
        }
        if (W(c4.f41630e, 6442450944L)) {
            C0240h c0240h4 = this.f41751d;
            P0(c0240h4, z4, c0240h4.f41787a.f41555f);
        }
    }

    private void R0() {
        this.f41748a.restore();
        this.f41751d = (C0240h) this.f41752e.pop();
    }

    private void S0() {
        this.f41748a.save();
        this.f41752e.push(this.f41751d);
        this.f41751d = new C0240h(this.f41751d);
    }

    private String T0(String str, boolean z4, boolean z5) {
        if (this.f41751d.f41794h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z4) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z5) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        C3276g.E.a aVar = this.f41751d.f41787a.f41553d;
        return (aVar == null || aVar != C3276g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(C3276g.K k4) {
        if (k4.f41638b == null || k4.f41627h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f41754g.peek()).invert(matrix)) {
            C3276g.C3278b c3278b = k4.f41627h;
            float f4 = c3278b.f41658a;
            float f5 = c3278b.f41659b;
            float b4 = c3278b.b();
            C3276g.C3278b c3278b2 = k4.f41627h;
            float f6 = c3278b2.f41659b;
            float b5 = c3278b2.b();
            float c4 = k4.f41627h.c();
            C3276g.C3278b c3278b3 = k4.f41627h;
            float[] fArr = {f4, f5, b4, f6, b5, c4, c3278b3.f41658a, c3278b3.c()};
            matrix.preConcat(this.f41748a.getMatrix());
            matrix.mapPoints(fArr);
            float f7 = fArr[0];
            float f8 = fArr[1];
            RectF rectF = new RectF(f7, f8, f7, f8);
            for (int i4 = 2; i4 <= 6; i4 += 2) {
                float f9 = fArr[i4];
                if (f9 < rectF.left) {
                    rectF.left = f9;
                }
                if (f9 > rectF.right) {
                    rectF.right = f9;
                }
                float f10 = fArr[i4 + 1];
                if (f10 < rectF.top) {
                    rectF.top = f10;
                }
                if (f10 > rectF.bottom) {
                    rectF.bottom = f10;
                }
            }
            C3276g.K k5 = (C3276g.K) this.f41753f.peek();
            C3276g.C3278b c3278b4 = k5.f41627h;
            if (c3278b4 == null) {
                k5.f41627h = C3276g.C3278b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c3278b4.e(C3276g.C3278b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        synchronized (C3302h.class) {
            HashSet hashSet = new HashSet();
            f41747i = hashSet;
            hashSet.add("Structure");
            f41747i.add("BasicStructure");
            f41747i.add("ConditionalProcessing");
            f41747i.add("Image");
            f41747i.add("Style");
            f41747i.add("ViewportAttribute");
            f41747i.add("Shape");
            f41747i.add("BasicText");
            f41747i.add("PaintAttribute");
            f41747i.add("BasicPaintAttribute");
            f41747i.add("OpacityAttribute");
            f41747i.add("BasicGraphicsAttribute");
            f41747i.add("Marker");
            f41747i.add("Gradient");
            f41747i.add("Pattern");
            f41747i.add("Clip");
            f41747i.add("BasicClip");
            f41747i.add("Mask");
            f41747i.add("View");
        }
    }

    private void V0(C0240h c0240h, C3276g.E e4) {
        if (W(e4, 4096L)) {
            c0240h.f41787a.f41564o = e4.f41564o;
        }
        if (W(e4, 2048L)) {
            c0240h.f41787a.f41563n = e4.f41563n;
        }
        if (W(e4, 1L)) {
            c0240h.f41787a.f41552c = e4.f41552c;
            C3276g.O o4 = e4.f41552c;
            c0240h.f41788b = (o4 == null || o4 == C3276g.C3282f.f41688d) ? false : true;
        }
        if (W(e4, 4L)) {
            c0240h.f41787a.f41554e = e4.f41554e;
        }
        if (W(e4, 6149L)) {
            P0(c0240h, true, c0240h.f41787a.f41552c);
        }
        if (W(e4, 2L)) {
            c0240h.f41787a.f41553d = e4.f41553d;
        }
        if (W(e4, 8L)) {
            c0240h.f41787a.f41555f = e4.f41555f;
            C3276g.O o5 = e4.f41555f;
            c0240h.f41789c = (o5 == null || o5 == C3276g.C3282f.f41688d) ? false : true;
        }
        if (W(e4, 16L)) {
            c0240h.f41787a.f41556g = e4.f41556g;
        }
        if (W(e4, 6168L)) {
            P0(c0240h, false, c0240h.f41787a.f41555f);
        }
        if (W(e4, 34359738368L)) {
            c0240h.f41787a.f41549M = e4.f41549M;
        }
        if (W(e4, 32L)) {
            C3276g.E e5 = c0240h.f41787a;
            C3276g.C3291p c3291p = e4.f41557h;
            e5.f41557h = c3291p;
            c0240h.f41791e.setStrokeWidth(c3291p.c(this));
        }
        if (W(e4, 64L)) {
            c0240h.f41787a.f41558i = e4.f41558i;
            int i4 = a.f41757b[e4.f41558i.ordinal()];
            if (i4 == 1) {
                c0240h.f41791e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i4 == 2) {
                c0240h.f41791e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i4 == 3) {
                c0240h.f41791e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e4, 128L)) {
            c0240h.f41787a.f41559j = e4.f41559j;
            int i5 = a.f41758c[e4.f41559j.ordinal()];
            if (i5 == 1) {
                c0240h.f41791e.setStrokeJoin(Paint.Join.MITER);
            } else if (i5 == 2) {
                c0240h.f41791e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i5 == 3) {
                c0240h.f41791e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e4, 256L)) {
            c0240h.f41787a.f41560k = e4.f41560k;
            c0240h.f41791e.setStrokeMiter(e4.f41560k.floatValue());
        }
        if (W(e4, 512L)) {
            c0240h.f41787a.f41561l = e4.f41561l;
        }
        if (W(e4, 1024L)) {
            c0240h.f41787a.f41562m = e4.f41562m;
        }
        Typeface typeface = null;
        if (W(e4, 1536L)) {
            C3276g.C3291p[] c3291pArr = c0240h.f41787a.f41561l;
            if (c3291pArr == null) {
                c0240h.f41791e.setPathEffect(null);
            } else {
                int length = c3291pArr.length;
                int i6 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i6];
                float f4 = 0.0f;
                for (int i7 = 0; i7 < i6; i7++) {
                    float c4 = c0240h.f41787a.f41561l[i7 % length].c(this);
                    fArr[i7] = c4;
                    f4 += c4;
                }
                if (f4 == 0.0f) {
                    c0240h.f41791e.setPathEffect(null);
                } else {
                    float c5 = c0240h.f41787a.f41562m.c(this);
                    if (c5 < 0.0f) {
                        c5 = (c5 % f4) + f4;
                    }
                    c0240h.f41791e.setPathEffect(new DashPathEffect(fArr, c5));
                }
            }
        }
        if (W(e4, 16384L)) {
            float Q3 = Q();
            c0240h.f41787a.f41566q = e4.f41566q;
            c0240h.f41790d.setTextSize(e4.f41566q.d(this, Q3));
            c0240h.f41791e.setTextSize(e4.f41566q.d(this, Q3));
        }
        if (W(e4, 8192L)) {
            c0240h.f41787a.f41565p = e4.f41565p;
        }
        if (W(e4, 32768L)) {
            if (e4.f41567r.intValue() == -1 && c0240h.f41787a.f41567r.intValue() > 100) {
                C3276g.E e6 = c0240h.f41787a;
                e6.f41567r = Integer.valueOf(e6.f41567r.intValue() - 100);
            } else if (e4.f41567r.intValue() != 1 || c0240h.f41787a.f41567r.intValue() >= 900) {
                c0240h.f41787a.f41567r = e4.f41567r;
            } else {
                C3276g.E e7 = c0240h.f41787a;
                e7.f41567r = Integer.valueOf(e7.f41567r.intValue() + 100);
            }
        }
        if (W(e4, 65536L)) {
            c0240h.f41787a.f41568s = e4.f41568s;
        }
        if (W(e4, 106496L)) {
            if (c0240h.f41787a.f41565p != null && this.f41750c != null) {
                C3276g.k();
                for (String str : c0240h.f41787a.f41565p) {
                    C3276g.E e8 = c0240h.f41787a;
                    typeface = t(str, e8.f41567r, e8.f41568s);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                C3276g.E e9 = c0240h.f41787a;
                typeface = t("serif", e9.f41567r, e9.f41568s);
            }
            c0240h.f41790d.setTypeface(typeface);
            c0240h.f41791e.setTypeface(typeface);
        }
        if (W(e4, 131072L)) {
            c0240h.f41787a.f41569t = e4.f41569t;
            Paint paint = c0240h.f41790d;
            C3276g.E.EnumC0238g enumC0238g = e4.f41569t;
            C3276g.E.EnumC0238g enumC0238g2 = C3276g.E.EnumC0238g.LineThrough;
            paint.setStrikeThruText(enumC0238g == enumC0238g2);
            Paint paint2 = c0240h.f41790d;
            C3276g.E.EnumC0238g enumC0238g3 = e4.f41569t;
            C3276g.E.EnumC0238g enumC0238g4 = C3276g.E.EnumC0238g.Underline;
            paint2.setUnderlineText(enumC0238g3 == enumC0238g4);
            c0240h.f41791e.setStrikeThruText(e4.f41569t == enumC0238g2);
            c0240h.f41791e.setUnderlineText(e4.f41569t == enumC0238g4);
        }
        if (W(e4, 68719476736L)) {
            c0240h.f41787a.f41570u = e4.f41570u;
        }
        if (W(e4, 262144L)) {
            c0240h.f41787a.f41571v = e4.f41571v;
        }
        if (W(e4, 524288L)) {
            c0240h.f41787a.f41572w = e4.f41572w;
        }
        if (W(e4, 2097152L)) {
            c0240h.f41787a.f41574y = e4.f41574y;
        }
        if (W(e4, 4194304L)) {
            c0240h.f41787a.f41575z = e4.f41575z;
        }
        if (W(e4, 8388608L)) {
            c0240h.f41787a.f41537A = e4.f41537A;
        }
        if (W(e4, 16777216L)) {
            c0240h.f41787a.f41538B = e4.f41538B;
        }
        if (W(e4, 33554432L)) {
            c0240h.f41787a.f41539C = e4.f41539C;
        }
        if (W(e4, 1048576L)) {
            c0240h.f41787a.f41573x = e4.f41573x;
        }
        if (W(e4, 268435456L)) {
            c0240h.f41787a.f41542F = e4.f41542F;
        }
        if (W(e4, 536870912L)) {
            c0240h.f41787a.f41543G = e4.f41543G;
        }
        if (W(e4, 1073741824L)) {
            c0240h.f41787a.f41544H = e4.f41544H;
        }
        if (W(e4, 67108864L)) {
            c0240h.f41787a.f41540D = e4.f41540D;
        }
        if (W(e4, 134217728L)) {
            c0240h.f41787a.f41541E = e4.f41541E;
        }
        if (W(e4, 8589934592L)) {
            c0240h.f41787a.f41547K = e4.f41547K;
        }
        if (W(e4, 17179869184L)) {
            c0240h.f41787a.f41548L = e4.f41548L;
        }
        if (W(e4, 137438953472L)) {
            c0240h.f41787a.f41550N = e4.f41550N;
        }
    }

    private boolean W(C3276g.E e4, long j4) {
        return (e4.f41551b & j4) != 0;
    }

    private void W0(C0240h c0240h, C3276g.L l4) {
        c0240h.f41787a.b(l4.f41638b == null);
        C3276g.E e4 = l4.f41630e;
        if (e4 != null) {
            V0(c0240h, e4);
        }
        if (this.f41750c.n()) {
            for (C3271b.p pVar : this.f41750c.d()) {
                if (C3271b.l(this.f41755h, pVar.f41473a, l4)) {
                    V0(c0240h, pVar.f41474b);
                }
            }
        }
        C3276g.E e5 = l4.f41631f;
        if (e5 != null) {
            V0(c0240h, e5);
        }
    }

    private void X(boolean z4, C3276g.C3278b c3278b, C3276g.M m4) {
        float d4;
        float f4;
        float d5;
        float f5;
        String str = m4.f41699l;
        if (str != null) {
            H(m4, str);
        }
        Boolean bool = m4.f41696i;
        int i4 = 0;
        boolean z5 = bool != null && bool.booleanValue();
        C0240h c0240h = this.f41751d;
        Paint paint = z4 ? c0240h.f41790d : c0240h.f41791e;
        if (z5) {
            C3276g.C3278b S3 = S();
            C3276g.C3291p c3291p = m4.f41633m;
            float e4 = c3291p != null ? c3291p.e(this) : 0.0f;
            C3276g.C3291p c3291p2 = m4.f41634n;
            d4 = c3291p2 != null ? c3291p2.f(this) : 0.0f;
            C3276g.C3291p c3291p3 = m4.f41635o;
            float e5 = c3291p3 != null ? c3291p3.e(this) : S3.f41660c;
            C3276g.C3291p c3291p4 = m4.f41636p;
            f5 = e5;
            f4 = e4;
            d5 = c3291p4 != null ? c3291p4.f(this) : 0.0f;
        } else {
            C3276g.C3291p c3291p5 = m4.f41633m;
            float d6 = c3291p5 != null ? c3291p5.d(this, 1.0f) : 0.0f;
            C3276g.C3291p c3291p6 = m4.f41634n;
            d4 = c3291p6 != null ? c3291p6.d(this, 1.0f) : 0.0f;
            C3276g.C3291p c3291p7 = m4.f41635o;
            float d7 = c3291p7 != null ? c3291p7.d(this, 1.0f) : 1.0f;
            C3276g.C3291p c3291p8 = m4.f41636p;
            f4 = d6;
            d5 = c3291p8 != null ? c3291p8.d(this, 1.0f) : 0.0f;
            f5 = d7;
        }
        float f6 = d4;
        S0();
        this.f41751d = M(m4);
        Matrix matrix = new Matrix();
        if (!z5) {
            matrix.preTranslate(c3278b.f41658a, c3278b.f41659b);
            matrix.preScale(c3278b.f41660c, c3278b.f41661d);
        }
        Matrix matrix2 = m4.f41697j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m4.f41695h.size();
        if (size == 0) {
            R0();
            if (z4) {
                this.f41751d.f41788b = false;
                return;
            } else {
                this.f41751d.f41789c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m4.f41695h.iterator();
        float f7 = -1.0f;
        while (it.hasNext()) {
            C3276g.D d8 = (C3276g.D) ((C3276g.N) it.next());
            Float f8 = d8.f41536h;
            float floatValue = f8 != null ? f8.floatValue() : 0.0f;
            if (i4 == 0 || floatValue >= f7) {
                fArr[i4] = floatValue;
                f7 = floatValue;
            } else {
                fArr[i4] = f7;
            }
            S0();
            W0(this.f41751d, d8);
            C3276g.E e6 = this.f41751d.f41787a;
            C3276g.C3282f c3282f = (C3276g.C3282f) e6.f41540D;
            if (c3282f == null) {
                c3282f = C3276g.C3282f.f41687c;
            }
            iArr[i4] = x(c3282f.f41689b, e6.f41541E.floatValue());
            i4++;
            R0();
        }
        if ((f4 == f5 && f6 == d5) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        C3276g.EnumC3286k enumC3286k = m4.f41698k;
        if (enumC3286k != null) {
            if (enumC3286k == C3276g.EnumC3286k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC3286k == C3276g.EnumC3286k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f4, f6, f5, d5, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f41751d.f41787a.f41554e.floatValue()));
    }

    private void X0() {
        int i4;
        C3276g.E e4 = this.f41751d.f41787a;
        C3276g.O o4 = e4.f41547K;
        if (o4 instanceof C3276g.C3282f) {
            i4 = ((C3276g.C3282f) o4).f41689b;
        } else if (!(o4 instanceof C3276g.C0239g)) {
            return;
        } else {
            i4 = e4.f41564o.f41689b;
        }
        Float f4 = e4.f41548L;
        if (f4 != null) {
            i4 = x(i4, f4.floatValue());
        }
        this.f41748a.drawColor(i4);
    }

    private Path Y(C3276g.C3280d c3280d) {
        C3276g.C3291p c3291p = c3280d.f41668o;
        float e4 = c3291p != null ? c3291p.e(this) : 0.0f;
        C3276g.C3291p c3291p2 = c3280d.f41669p;
        float f4 = c3291p2 != null ? c3291p2.f(this) : 0.0f;
        float c4 = c3280d.f41670q.c(this);
        float f5 = e4 - c4;
        float f6 = f4 - c4;
        float f7 = e4 + c4;
        float f8 = f4 + c4;
        if (c3280d.f41627h == null) {
            float f9 = 2.0f * c4;
            c3280d.f41627h = new C3276g.C3278b(f5, f6, f9, f9);
        }
        float f10 = c4 * 0.5522848f;
        Path path = new Path();
        path.moveTo(e4, f6);
        float f11 = e4 + f10;
        float f12 = f4 - f10;
        path.cubicTo(f11, f6, f7, f12, f7, f4);
        float f13 = f4 + f10;
        path.cubicTo(f7, f13, f11, f8, e4, f8);
        float f14 = e4 - f10;
        path.cubicTo(f14, f8, f5, f13, f5, f4);
        path.cubicTo(f5, f12, f14, f6, e4, f6);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f41751d.f41787a.f41539C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(C3276g.C3284i c3284i) {
        C3276g.C3291p c3291p = c3284i.f41691o;
        float e4 = c3291p != null ? c3291p.e(this) : 0.0f;
        C3276g.C3291p c3291p2 = c3284i.f41692p;
        float f4 = c3291p2 != null ? c3291p2.f(this) : 0.0f;
        float e5 = c3284i.f41693q.e(this);
        float f5 = c3284i.f41694r.f(this);
        float f6 = e4 - e5;
        float f7 = f4 - f5;
        float f8 = e4 + e5;
        float f9 = f4 + f5;
        if (c3284i.f41627h == null) {
            c3284i.f41627h = new C3276g.C3278b(f6, f7, e5 * 2.0f, 2.0f * f5);
        }
        float f10 = e5 * 0.5522848f;
        float f11 = f5 * 0.5522848f;
        Path path = new Path();
        path.moveTo(e4, f7);
        float f12 = e4 + f10;
        float f13 = f4 - f11;
        path.cubicTo(f12, f7, f8, f13, f8, f4);
        float f14 = f4 + f11;
        path.cubicTo(f8, f14, f12, f9, e4, f9);
        float f15 = e4 - f10;
        path.cubicTo(f15, f9, f6, f14, f6, f4);
        path.cubicTo(f6, f13, f15, f7, e4, f7);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(C3276g.C3292q c3292q) {
        C3276g.C3291p c3291p = c3292q.f41714o;
        float e4 = c3291p == null ? 0.0f : c3291p.e(this);
        C3276g.C3291p c3291p2 = c3292q.f41715p;
        float f4 = c3291p2 == null ? 0.0f : c3291p2.f(this);
        C3276g.C3291p c3291p3 = c3292q.f41716q;
        float e5 = c3291p3 == null ? 0.0f : c3291p3.e(this);
        C3276g.C3291p c3291p4 = c3292q.f41717r;
        float f5 = c3291p4 != null ? c3291p4.f(this) : 0.0f;
        if (c3292q.f41627h == null) {
            c3292q.f41627h = new C3276g.C3278b(Math.min(e4, e5), Math.min(f4, f5), Math.abs(e5 - e4), Math.abs(f5 - f4));
        }
        Path path = new Path();
        path.moveTo(e4, f4);
        path.lineTo(e5, f5);
        return path;
    }

    private Path b0(C3276g.C3301z c3301z) {
        Path path = new Path();
        float[] fArr = c3301z.f41746o;
        path.moveTo(fArr[0], fArr[1]);
        int i4 = 2;
        while (true) {
            float[] fArr2 = c3301z.f41746o;
            if (i4 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i4], fArr2[i4 + 1]);
            i4 += 2;
        }
        if (c3301z instanceof C3276g.A) {
            path.close();
        }
        if (c3301z.f41627h == null) {
            c3301z.f41627h = m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path c0(C3276g.B b4) {
        float e4;
        float f4;
        float min;
        float e5;
        float f5;
        float f6;
        float f7;
        Path path;
        C3276g.C3291p c3291p = b4.f41534s;
        if (c3291p == null && b4.f41535t == null) {
            e4 = 0.0f;
        } else if (c3291p == null) {
            e4 = b4.f41535t.f(this);
        } else {
            if (b4.f41535t != null) {
                e4 = c3291p.e(this);
                f4 = b4.f41535t.f(this);
                min = Math.min(e4, b4.f41532q.e(this) / 2.0f);
                float min2 = Math.min(f4, b4.f41533r.f(this) / 2.0f);
                C3276g.C3291p c3291p2 = b4.f41530o;
                e5 = c3291p2 == null ? c3291p2.e(this) : 0.0f;
                C3276g.C3291p c3291p3 = b4.f41531p;
                f5 = c3291p3 == null ? c3291p3.f(this) : 0.0f;
                float e6 = b4.f41532q.e(this);
                float f8 = b4.f41533r.f(this);
                if (b4.f41627h == null) {
                    b4.f41627h = new C3276g.C3278b(e5, f5, e6, f8);
                }
                f6 = e6 + e5;
                f7 = f5 + f8;
                path = new Path();
                if (min != 0.0f || min2 == 0.0f) {
                    path.moveTo(e5, f5);
                    path.lineTo(f6, f5);
                    path.lineTo(f6, f7);
                    path.lineTo(e5, f7);
                    path.lineTo(e5, f5);
                } else {
                    float f9 = min * 0.5522848f;
                    float f10 = 0.5522848f * min2;
                    float f11 = f5 + min2;
                    path.moveTo(e5, f11);
                    float f12 = f11 - f10;
                    float f13 = e5 + min;
                    float f14 = f13 - f9;
                    path.cubicTo(e5, f12, f14, f5, f13, f5);
                    float f15 = f6 - min;
                    path.lineTo(f15, f5);
                    float f16 = f15 + f9;
                    path.cubicTo(f16, f5, f6, f12, f6, f11);
                    float f17 = f7 - min2;
                    path.lineTo(f6, f17);
                    float f18 = f17 + f10;
                    path.cubicTo(f6, f18, f16, f7, f15, f7);
                    path.lineTo(f13, f7);
                    float f19 = e5;
                    path.cubicTo(f14, f7, f19, f18, e5, f17);
                    path.lineTo(f19, f11);
                }
                path.close();
                return path;
            }
            e4 = c3291p.e(this);
        }
        f4 = e4;
        min = Math.min(e4, b4.f41532q.e(this) / 2.0f);
        float min22 = Math.min(f4, b4.f41533r.f(this) / 2.0f);
        C3276g.C3291p c3291p22 = b4.f41530o;
        if (c3291p22 == null) {
        }
        C3276g.C3291p c3291p32 = b4.f41531p;
        if (c3291p32 == null) {
        }
        float e62 = b4.f41532q.e(this);
        float f82 = b4.f41533r.f(this);
        if (b4.f41627h == null) {
        }
        f6 = e62 + e5;
        f7 = f5 + f82;
        path = new Path();
        if (min != 0.0f) {
        }
        path.moveTo(e5, f5);
        path.lineTo(f6, f5);
        path.lineTo(f6, f7);
        path.lineTo(e5, f7);
        path.lineTo(e5, f5);
        path.close();
        return path;
    }

    private Path d0(C3276g.W w4) {
        List list = w4.f41654o;
        float f4 = 0.0f;
        float e4 = (list == null || list.size() == 0) ? 0.0f : ((C3276g.C3291p) w4.f41654o.get(0)).e(this);
        List list2 = w4.f41655p;
        float f5 = (list2 == null || list2.size() == 0) ? 0.0f : ((C3276g.C3291p) w4.f41655p.get(0)).f(this);
        List list3 = w4.f41656q;
        float e5 = (list3 == null || list3.size() == 0) ? 0.0f : ((C3276g.C3291p) w4.f41656q.get(0)).e(this);
        List list4 = w4.f41657r;
        if (list4 != null && list4.size() != 0) {
            f4 = ((C3276g.C3291p) w4.f41657r.get(0)).f(this);
        }
        if (this.f41751d.f41787a.f41571v != C3276g.E.f.Start) {
            float n4 = n(w4);
            if (this.f41751d.f41787a.f41571v == C3276g.E.f.Middle) {
                n4 /= 2.0f;
            }
            e4 -= n4;
        }
        if (w4.f41627h == null) {
            i iVar = new i(e4, f5);
            E(w4, iVar);
            RectF rectF = iVar.f41798d;
            w4.f41627h = new C3276g.C3278b(rectF.left, rectF.top, rectF.width(), iVar.f41798d.height());
        }
        Path path = new Path();
        E(w4, new g(e4 + e5, f5 + f4, path));
        return path;
    }

    private void e0(boolean z4, C3276g.C3278b c3278b, C3276g.Q q4) {
        float f4;
        float d4;
        float f5;
        String str = q4.f41699l;
        if (str != null) {
            H(q4, str);
        }
        Boolean bool = q4.f41696i;
        int i4 = 0;
        boolean z5 = bool != null && bool.booleanValue();
        C0240h c0240h = this.f41751d;
        Paint paint = z4 ? c0240h.f41790d : c0240h.f41791e;
        if (z5) {
            C3276g.C3291p c3291p = new C3276g.C3291p(50.0f, C3276g.d0.percent);
            C3276g.C3291p c3291p2 = q4.f41640m;
            float e4 = c3291p2 != null ? c3291p2.e(this) : c3291p.e(this);
            C3276g.C3291p c3291p3 = q4.f41641n;
            float f6 = c3291p3 != null ? c3291p3.f(this) : c3291p.f(this);
            C3276g.C3291p c3291p4 = q4.f41642o;
            d4 = c3291p4 != null ? c3291p4.c(this) : c3291p.c(this);
            f4 = e4;
            f5 = f6;
        } else {
            C3276g.C3291p c3291p5 = q4.f41640m;
            float d5 = c3291p5 != null ? c3291p5.d(this, 1.0f) : 0.5f;
            C3276g.C3291p c3291p6 = q4.f41641n;
            float d6 = c3291p6 != null ? c3291p6.d(this, 1.0f) : 0.5f;
            C3276g.C3291p c3291p7 = q4.f41642o;
            f4 = d5;
            d4 = c3291p7 != null ? c3291p7.d(this, 1.0f) : 0.5f;
            f5 = d6;
        }
        S0();
        this.f41751d = M(q4);
        Matrix matrix = new Matrix();
        if (!z5) {
            matrix.preTranslate(c3278b.f41658a, c3278b.f41659b);
            matrix.preScale(c3278b.f41660c, c3278b.f41661d);
        }
        Matrix matrix2 = q4.f41697j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q4.f41695h.size();
        if (size == 0) {
            R0();
            if (z4) {
                this.f41751d.f41788b = false;
                return;
            } else {
                this.f41751d.f41789c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = q4.f41695h.iterator();
        float f7 = -1.0f;
        while (it.hasNext()) {
            C3276g.D d7 = (C3276g.D) ((C3276g.N) it.next());
            Float f8 = d7.f41536h;
            float floatValue = f8 != null ? f8.floatValue() : 0.0f;
            if (i4 == 0 || floatValue >= f7) {
                fArr[i4] = floatValue;
                f7 = floatValue;
            } else {
                fArr[i4] = f7;
            }
            S0();
            W0(this.f41751d, d7);
            C3276g.E e5 = this.f41751d.f41787a;
            C3276g.C3282f c3282f = (C3276g.C3282f) e5.f41540D;
            if (c3282f == null) {
                c3282f = C3276g.C3282f.f41687c;
            }
            iArr[i4] = x(c3282f.f41689b, e5.f41541E.floatValue());
            i4++;
            R0();
        }
        if (d4 == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        C3276g.EnumC3286k enumC3286k = q4.f41698k;
        if (enumC3286k != null) {
            if (enumC3286k == C3276g.EnumC3286k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC3286k == C3276g.EnumC3286k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f4, f5, d4, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f41751d.f41787a.f41554e.floatValue()));
    }

    private C3276g.C3278b f0(C3276g.C3291p c3291p, C3276g.C3291p c3291p2, C3276g.C3291p c3291p3, C3276g.C3291p c3291p4) {
        float e4 = c3291p != null ? c3291p.e(this) : 0.0f;
        float f4 = c3291p2 != null ? c3291p2.f(this) : 0.0f;
        C3276g.C3278b S3 = S();
        return new C3276g.C3278b(e4, f4, c3291p3 != null ? c3291p3.e(this) : S3.f41660c, c3291p4 != null ? c3291p4.f(this) : S3.f41661d);
    }

    private Path g0(C3276g.K k4, boolean z4) {
        Path d02;
        Path j4;
        this.f41752e.push(this.f41751d);
        C0240h c0240h = new C0240h(this.f41751d);
        this.f41751d = c0240h;
        W0(c0240h, k4);
        if (!A() || !Y0()) {
            this.f41751d = (C0240h) this.f41752e.pop();
            return null;
        }
        if (k4 instanceof C3276g.e0) {
            if (!z4) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C3276g.e0 e0Var = (C3276g.e0) k4;
            C3276g.N r4 = k4.f41637a.r(e0Var.f41682p);
            if (r4 == null) {
                F("Use reference '%s' not found", e0Var.f41682p);
                this.f41751d = (C0240h) this.f41752e.pop();
                return null;
            }
            if (!(r4 instanceof C3276g.K)) {
                this.f41751d = (C0240h) this.f41752e.pop();
                return null;
            }
            d02 = g0((C3276g.K) r4, false);
            if (d02 == null) {
                return null;
            }
            if (e0Var.f41627h == null) {
                e0Var.f41627h = m(d02);
            }
            Matrix matrix = e0Var.f41705o;
            if (matrix != null) {
                d02.transform(matrix);
            }
        } else if (k4 instanceof C3276g.AbstractC3287l) {
            C3276g.AbstractC3287l abstractC3287l = (C3276g.AbstractC3287l) k4;
            if (k4 instanceof C3276g.C3297v) {
                d02 = new d(((C3276g.C3297v) k4).f41732o).f();
                if (k4.f41627h == null) {
                    k4.f41627h = m(d02);
                }
            } else {
                d02 = k4 instanceof C3276g.B ? c0((C3276g.B) k4) : k4 instanceof C3276g.C3280d ? Y((C3276g.C3280d) k4) : k4 instanceof C3276g.C3284i ? Z((C3276g.C3284i) k4) : k4 instanceof C3276g.C3301z ? b0((C3276g.C3301z) k4) : null;
            }
            if (d02 == null) {
                return null;
            }
            if (abstractC3287l.f41627h == null) {
                abstractC3287l.f41627h = m(d02);
            }
            Matrix matrix2 = abstractC3287l.f41704n;
            if (matrix2 != null) {
                d02.transform(matrix2);
            }
            d02.setFillType(P());
        } else {
            if (!(k4 instanceof C3276g.W)) {
                F("Invalid %s element found in clipPath definition", k4.m());
                return null;
            }
            C3276g.W w4 = (C3276g.W) k4;
            d02 = d0(w4);
            if (d02 == null) {
                return null;
            }
            Matrix matrix3 = w4.f41649s;
            if (matrix3 != null) {
                d02.transform(matrix3);
            }
            d02.setFillType(P());
        }
        if (this.f41751d.f41787a.f41542F != null && (j4 = j(k4, k4.f41627h)) != null) {
            d02.op(j4, Path.Op.INTERSECT);
        }
        this.f41751d = (C0240h) this.f41752e.pop();
        return d02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f4, float f5, float f6, float f7, float f8, boolean z4, boolean z5, float f9, float f10, C3276g.InterfaceC3299x interfaceC3299x) {
        if (f4 == f9 && f5 == f10) {
            return;
        }
        if (f6 == 0.0f || f7 == 0.0f) {
            interfaceC3299x.e(f9, f10);
            return;
        }
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f7);
        double radians = Math.toRadians(f8 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = (f4 - f9) / 2.0d;
        double d5 = (f5 - f10) / 2.0d;
        double d6 = (cos * d4) + (sin * d5);
        double d7 = ((-sin) * d4) + (cos * d5);
        double d8 = abs * abs;
        double d9 = abs2 * abs2;
        double d10 = d6 * d6;
        double d11 = d7 * d7;
        double d12 = (d10 / d8) + (d11 / d9);
        if (d12 > 0.99999d) {
            double sqrt = Math.sqrt(d12) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d8 = abs * abs;
            d9 = abs2 * abs2;
        }
        double d13 = z4 == z5 ? -1.0d : 1.0d;
        double d14 = d8 * d9;
        double d15 = d8 * d11;
        double d16 = d9 * d10;
        double d17 = ((d14 - d15) - d16) / (d15 + d16);
        if (d17 < 0.0d) {
            d17 = 0.0d;
        }
        double sqrt2 = d13 * Math.sqrt(d17);
        double d18 = abs;
        double d19 = abs2;
        double d20 = ((d18 * d7) / d19) * sqrt2;
        double d21 = (-((d19 * d6) / d18)) * sqrt2;
        double d22 = ((f4 + f9) / 2.0d) + ((cos * d20) - (sin * d21));
        double d23 = ((f5 + f10) / 2.0d) + (sin * d20) + (cos * d21);
        double d24 = (d6 - d20) / d18;
        double d25 = (d7 - d21) / d19;
        double d26 = ((-d6) - d20) / d18;
        double d27 = ((-d7) - d21) / d19;
        double d28 = (d24 * d24) + (d25 * d25);
        double acos = (d25 < 0.0d ? -1.0d : 1.0d) * Math.acos(d24 / Math.sqrt(d28));
        double v4 = ((d24 * d27) - (d25 * d26) < 0.0d ? -1.0d : 1.0d) * v(((d24 * d26) + (d25 * d27)) / Math.sqrt(d28 * ((d26 * d26) + (d27 * d27))));
        if (!z5 && v4 > 0.0d) {
            v4 -= 6.283185307179586d;
        } else if (z5 && v4 < 0.0d) {
            v4 += 6.283185307179586d;
        }
        float[] i4 = i(acos % 6.283185307179586d, v4 % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f8);
        matrix.postTranslate((float) d22, (float) d23);
        matrix.mapPoints(i4);
        i4[i4.length - 2] = f9;
        i4[i4.length - 1] = f10;
        for (int i5 = 0; i5 < i4.length; i5 += 6) {
            interfaceC3299x.c(i4[i5], i4[i5 + 1], i4[i5 + 2], i4[i5 + 3], i4[i5 + 4], i4[i5 + 5]);
        }
    }

    private void h0() {
        this.f41753f.pop();
        this.f41754g.pop();
    }

    private static float[] i(double d4, double d5) {
        int ceil = (int) Math.ceil((Math.abs(d5) * 2.0d) / 3.141592653589793d);
        double d6 = d5 / ceil;
        double d7 = d6 / 2.0d;
        double sin = (Math.sin(d7) * 1.3333333333333333d) / (Math.cos(d7) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i4 = 0;
        int i5 = 0;
        while (i4 < ceil) {
            double d8 = d4 + (i4 * d6);
            double cos = Math.cos(d8);
            double sin2 = Math.sin(d8);
            float[] fArr2 = fArr;
            fArr2[i5] = (float) (cos - (sin * sin2));
            fArr2[i5 + 1] = (float) (sin2 + (cos * sin));
            double d9 = d8 + d6;
            double cos2 = Math.cos(d9);
            double sin3 = Math.sin(d9);
            fArr2[i5 + 2] = (float) ((sin * sin3) + cos2);
            fArr2[i5 + 3] = (float) (sin3 - (sin * cos2));
            int i6 = i5 + 5;
            fArr2[i5 + 4] = (float) cos2;
            i5 += 6;
            fArr2[i6] = (float) sin3;
            i4++;
            fArr = fArr2;
            ceil = ceil;
        }
        return fArr;
    }

    private void i0(C3276g.J j4) {
        this.f41753f.push(j4);
        this.f41754g.push(this.f41748a.getMatrix());
    }

    private Path j(C3276g.K k4, C3276g.C3278b c3278b) {
        Path g02;
        C3276g.N r4 = k4.f41637a.r(this.f41751d.f41787a.f41542F);
        if (r4 == null) {
            F("ClipPath reference '%s' not found", this.f41751d.f41787a.f41542F);
            return null;
        }
        C3276g.C3281e c3281e = (C3276g.C3281e) r4;
        this.f41752e.push(this.f41751d);
        this.f41751d = M(c3281e);
        Boolean bool = c3281e.f41681p;
        boolean z4 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z4) {
            matrix.preTranslate(c3278b.f41658a, c3278b.f41659b);
            matrix.preScale(c3278b.f41660c, c3278b.f41661d);
        }
        Matrix matrix2 = c3281e.f41705o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C3276g.N n4 : c3281e.f41616i) {
            if ((n4 instanceof C3276g.K) && (g02 = g0((C3276g.K) n4, true)) != null) {
                path.op(g02, Path.Op.UNION);
            }
        }
        if (this.f41751d.f41787a.f41542F != null) {
            if (c3281e.f41627h == null) {
                c3281e.f41627h = m(path);
            }
            Path j4 = j(c3281e, c3281e.f41627h);
            if (j4 != null) {
                path.op(j4, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f41751d = (C0240h) this.f41752e.pop();
        return path;
    }

    private void j0(C3276g.K k4) {
        k0(k4, k4.f41627h);
    }

    private List k(C3276g.C3292q c3292q) {
        C3276g.C3291p c3291p = c3292q.f41714o;
        float e4 = c3291p != null ? c3291p.e(this) : 0.0f;
        C3276g.C3291p c3291p2 = c3292q.f41715p;
        float f4 = c3291p2 != null ? c3291p2.f(this) : 0.0f;
        C3276g.C3291p c3291p3 = c3292q.f41716q;
        float e5 = c3291p3 != null ? c3291p3.e(this) : 0.0f;
        C3276g.C3291p c3291p4 = c3292q.f41717r;
        float f5 = c3291p4 != null ? c3291p4.f(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f6 = e5 - e4;
        float f7 = f5 - f4;
        arrayList.add(new c(e4, f4, f6, f7));
        arrayList.add(new c(e5, f5, f6, f7));
        return arrayList;
    }

    private void k0(C3276g.K k4, C3276g.C3278b c3278b) {
        if (this.f41751d.f41787a.f41544H != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f41748a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f41748a.saveLayer(null, paint2, 31);
            C3276g.C3294s c3294s = (C3276g.C3294s) this.f41750c.r(this.f41751d.f41787a.f41544H);
            J0(c3294s, k4, c3278b);
            this.f41748a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f41748a.saveLayer(null, paint3, 31);
            J0(c3294s, k4, c3278b);
            this.f41748a.restore();
            this.f41748a.restore();
        }
        R0();
    }

    private List l(C3276g.C3301z c3301z) {
        int length = c3301z.f41746o.length;
        int i4 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c3301z.f41746o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (i4 < length) {
            float[] fArr2 = c3301z.f41746o;
            float f6 = fArr2[i4];
            float f7 = fArr2[i4 + 1];
            cVar.a(f6, f7);
            arrayList.add(cVar);
            i4 += 2;
            cVar = new c(f6, f7, f6 - cVar.f41768a, f7 - cVar.f41769b);
            f4 = f6;
            f5 = f7;
        }
        if (!(c3301z instanceof C3276g.A)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = c3301z.f41746o;
        float f8 = fArr3[0];
        if (f4 != f8) {
            float f9 = fArr3[1];
            if (f5 != f9) {
                cVar.a(f8, f9);
                arrayList.add(cVar);
                c cVar2 = new c(f8, f9, f8 - cVar.f41768a, f9 - cVar.f41769b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    private void l0(C3276g.N n4, j jVar) {
        float f4;
        float f5;
        float f6;
        C3276g.E.f O3;
        if (jVar.a((C3276g.Y) n4)) {
            if (n4 instanceof C3276g.Z) {
                S0();
                L0((C3276g.Z) n4);
                R0();
                return;
            }
            if (!(n4 instanceof C3276g.V)) {
                if (n4 instanceof C3276g.U) {
                    S0();
                    C3276g.U u4 = (C3276g.U) n4;
                    W0(this.f41751d, u4);
                    if (A()) {
                        r((C3276g.K) u4.e());
                        C3276g.N r4 = n4.f41637a.r(u4.f41646o);
                        if (r4 == null || !(r4 instanceof C3276g.Y)) {
                            F("Tref reference '%s' not found", u4.f41646o);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            G((C3276g.Y) r4, sb);
                            if (sb.length() > 0) {
                                jVar.b(sb.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            C3276g.V v4 = (C3276g.V) n4;
            W0(this.f41751d, v4);
            if (A()) {
                List list = v4.f41654o;
                boolean z4 = list != null && list.size() > 0;
                boolean z5 = jVar instanceof f;
                float f7 = 0.0f;
                if (z5) {
                    float e4 = !z4 ? ((f) jVar).f41780b : ((C3276g.C3291p) v4.f41654o.get(0)).e(this);
                    List list2 = v4.f41655p;
                    f5 = (list2 == null || list2.size() == 0) ? ((f) jVar).f41781c : ((C3276g.C3291p) v4.f41655p.get(0)).f(this);
                    List list3 = v4.f41656q;
                    f6 = (list3 == null || list3.size() == 0) ? 0.0f : ((C3276g.C3291p) v4.f41656q.get(0)).e(this);
                    List list4 = v4.f41657r;
                    if (list4 != null && list4.size() != 0) {
                        f7 = ((C3276g.C3291p) v4.f41657r.get(0)).f(this);
                    }
                    f4 = f7;
                    f7 = e4;
                } else {
                    f4 = 0.0f;
                    f5 = 0.0f;
                    f6 = 0.0f;
                }
                if (z4 && (O3 = O()) != C3276g.E.f.Start) {
                    float n5 = n(v4);
                    if (O3 == C3276g.E.f.Middle) {
                        n5 /= 2.0f;
                    }
                    f7 -= n5;
                }
                r((C3276g.K) v4.e());
                if (z5) {
                    f fVar = (f) jVar;
                    fVar.f41780b = f7 + f6;
                    fVar.f41781c = f5 + f4;
                }
                boolean m02 = m0();
                E(v4, jVar);
                if (m02) {
                    j0(v4);
                }
            }
            R0();
        }
    }

    private C3276g.C3278b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C3276g.C3278b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        C3276g.N r4;
        if (!M0()) {
            return false;
        }
        this.f41748a.saveLayerAlpha(null, w(this.f41751d.f41787a.f41563n.floatValue()), 31);
        this.f41752e.push(this.f41751d);
        C0240h c0240h = new C0240h(this.f41751d);
        this.f41751d = c0240h;
        String str = c0240h.f41787a.f41544H;
        if (str != null && ((r4 = this.f41750c.r(str)) == null || !(r4 instanceof C3276g.C3294s))) {
            F("Mask reference '%s' not found", this.f41751d.f41787a.f41544H);
            this.f41751d.f41787a.f41544H = null;
        }
        return true;
    }

    private float n(C3276g.Y y4) {
        k kVar = new k(this, null);
        E(y4, kVar);
        return kVar.f41801b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float D4 = D(cVar2.f41770c, cVar2.f41771d, cVar2.f41768a - cVar.f41768a, cVar2.f41769b - cVar.f41769b);
        if (D4 == 0.0f) {
            D4 = D(cVar2.f41770c, cVar2.f41771d, cVar3.f41768a - cVar2.f41768a, cVar3.f41769b - cVar2.f41769b);
        }
        if (D4 > 0.0f || (D4 == 0.0f && (cVar2.f41770c > 0.0f || cVar2.f41771d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f41770c = -cVar2.f41770c;
        cVar2.f41771d = -cVar2.f41771d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Matrix o(C3276g.C3278b c3278b, C3276g.C3278b c3278b2, C3274e c3274e) {
        float f4;
        float f5;
        Matrix matrix = new Matrix();
        if (c3274e != null && c3274e.a() != null) {
            float f6 = c3278b.f41660c / c3278b2.f41660c;
            float f7 = c3278b.f41661d / c3278b2.f41661d;
            float f8 = -c3278b2.f41658a;
            float f9 = -c3278b2.f41659b;
            if (c3274e.equals(C3274e.f41493d)) {
                matrix.preTranslate(c3278b.f41658a, c3278b.f41659b);
                matrix.preScale(f6, f7);
                matrix.preTranslate(f8, f9);
                return matrix;
            }
            float max = c3274e.b() == C3274e.b.slice ? Math.max(f6, f7) : Math.min(f6, f7);
            float f10 = c3278b.f41660c / max;
            float f11 = c3278b.f41661d / max;
            int[] iArr = a.f41756a;
            switch (iArr[c3274e.a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f5 = (c3278b2.f41660c - f10) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f5 = c3278b2.f41660c - f10;
                    break;
            }
            f8 -= f5;
            int i4 = iArr[c3274e.a().ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 6) {
                            if (i4 != 7) {
                            }
                        }
                    }
                }
                f4 = c3278b2.f41661d - f11;
                f9 -= f4;
                matrix.preTranslate(c3278b.f41658a, c3278b.f41659b);
                matrix.preScale(max, max);
                matrix.preTranslate(f8, f9);
            }
            f4 = (c3278b2.f41661d - f11) / 2.0f;
            f9 -= f4;
            matrix.preTranslate(c3278b.f41658a, c3278b.f41659b);
            matrix.preScale(max, max);
            matrix.preTranslate(f8, f9);
        }
        return matrix;
    }

    private void o0(C3276g.C3280d c3280d) {
        y("Circle render", new Object[0]);
        C3276g.C3291p c3291p = c3280d.f41670q;
        if (c3291p == null || c3291p.i()) {
            return;
        }
        W0(this.f41751d, c3280d);
        if (A() && Y0()) {
            Matrix matrix = c3280d.f41704n;
            if (matrix != null) {
                this.f41748a.concat(matrix);
            }
            Path Y3 = Y(c3280d);
            U0(c3280d);
            r(c3280d);
            p(c3280d);
            boolean m02 = m0();
            if (this.f41751d.f41788b) {
                B(c3280d, Y3);
            }
            if (this.f41751d.f41789c) {
                C(Y3);
            }
            if (m02) {
                j0(c3280d);
            }
        }
    }

    private void p(C3276g.K k4) {
        q(k4, k4.f41627h);
    }

    private void p0(C3276g.C3284i c3284i) {
        y("Ellipse render", new Object[0]);
        C3276g.C3291p c3291p = c3284i.f41693q;
        if (c3291p == null || c3284i.f41694r == null || c3291p.i() || c3284i.f41694r.i()) {
            return;
        }
        W0(this.f41751d, c3284i);
        if (A() && Y0()) {
            Matrix matrix = c3284i.f41704n;
            if (matrix != null) {
                this.f41748a.concat(matrix);
            }
            Path Z3 = Z(c3284i);
            U0(c3284i);
            r(c3284i);
            p(c3284i);
            boolean m02 = m0();
            if (this.f41751d.f41788b) {
                B(c3284i, Z3);
            }
            if (this.f41751d.f41789c) {
                C(Z3);
            }
            if (m02) {
                j0(c3284i);
            }
        }
    }

    private void q(C3276g.K k4, C3276g.C3278b c3278b) {
        Path j4;
        if (this.f41751d.f41787a.f41542F == null || (j4 = j(k4, c3278b)) == null) {
            return;
        }
        this.f41748a.clipPath(j4);
    }

    private void q0(C3276g.C3288m c3288m) {
        y("Group render", new Object[0]);
        W0(this.f41751d, c3288m);
        if (A()) {
            Matrix matrix = c3288m.f41705o;
            if (matrix != null) {
                this.f41748a.concat(matrix);
            }
            p(c3288m);
            boolean m02 = m0();
            F0(c3288m, true);
            if (m02) {
                j0(c3288m);
            }
            U0(c3288m);
        }
    }

    private void r(C3276g.K k4) {
        C3276g.O o4 = this.f41751d.f41787a.f41552c;
        if (o4 instanceof C3276g.C3296u) {
            z(true, k4.f41627h, (C3276g.C3296u) o4);
        }
        C3276g.O o5 = this.f41751d.f41787a.f41555f;
        if (o5 instanceof C3276g.C3296u) {
            z(false, k4.f41627h, (C3276g.C3296u) o5);
        }
    }

    private void r0(C3276g.C3290o c3290o) {
        C3276g.C3291p c3291p;
        String str;
        y("Image render", new Object[0]);
        C3276g.C3291p c3291p2 = c3290o.f41709s;
        if (c3291p2 == null || c3291p2.i() || (c3291p = c3290o.f41710t) == null || c3291p.i() || (str = c3290o.f41706p) == null) {
            return;
        }
        C3274e c3274e = c3290o.f41639o;
        if (c3274e == null) {
            c3274e = C3274e.f41494e;
        }
        Bitmap s4 = s(str);
        if (s4 == null) {
            C3276g.k();
            return;
        }
        C3276g.C3278b c3278b = new C3276g.C3278b(0.0f, 0.0f, s4.getWidth(), s4.getHeight());
        W0(this.f41751d, c3290o);
        if (A() && Y0()) {
            Matrix matrix = c3290o.f41711u;
            if (matrix != null) {
                this.f41748a.concat(matrix);
            }
            C3276g.C3291p c3291p3 = c3290o.f41707q;
            float e4 = c3291p3 != null ? c3291p3.e(this) : 0.0f;
            C3276g.C3291p c3291p4 = c3290o.f41708r;
            this.f41751d.f41792f = new C3276g.C3278b(e4, c3291p4 != null ? c3291p4.f(this) : 0.0f, c3290o.f41709s.e(this), c3290o.f41710t.e(this));
            if (!this.f41751d.f41787a.f41572w.booleanValue()) {
                C3276g.C3278b c3278b2 = this.f41751d.f41792f;
                O0(c3278b2.f41658a, c3278b2.f41659b, c3278b2.f41660c, c3278b2.f41661d);
            }
            c3290o.f41627h = this.f41751d.f41792f;
            U0(c3290o);
            p(c3290o);
            boolean m02 = m0();
            X0();
            this.f41748a.save();
            this.f41748a.concat(o(this.f41751d.f41792f, c3278b, c3274e));
            this.f41748a.drawBitmap(s4, 0.0f, 0.0f, new Paint(this.f41751d.f41787a.f41550N != C3276g.E.e.optimizeSpeed ? 2 : 0));
            this.f41748a.restore();
            if (m02) {
                j0(c3290o);
            }
        }
    }

    private Bitmap s(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e4) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e4);
            return null;
        }
    }

    private void s0(C3276g.C3292q c3292q) {
        y("Line render", new Object[0]);
        W0(this.f41751d, c3292q);
        if (A() && Y0() && this.f41751d.f41789c) {
            Matrix matrix = c3292q.f41704n;
            if (matrix != null) {
                this.f41748a.concat(matrix);
            }
            Path a02 = a0(c3292q);
            U0(c3292q);
            r(c3292q);
            p(c3292q);
            boolean m02 = m0();
            C(a02);
            I0(c3292q);
            if (m02) {
                j0(c3292q);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r6.equals("fantasy") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Typeface t(String str, Integer num, C3276g.E.b bVar) {
        char c4 = 2;
        boolean z4 = bVar == C3276g.E.b.Italic;
        int i4 = num.intValue() > 500 ? z4 ? 3 : 1 : z4 ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1081737434:
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                return Typeface.create(Typeface.SANS_SERIF, i4);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i4);
            case 2:
                return Typeface.create(Typeface.SANS_SERIF, i4);
            case 3:
                return Typeface.create(Typeface.SERIF, i4);
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i4);
            default:
                return null;
        }
    }

    private void t0(C3276g.C3297v c3297v) {
        y("Path render", new Object[0]);
        if (c3297v.f41732o == null) {
            return;
        }
        W0(this.f41751d, c3297v);
        if (A() && Y0()) {
            C0240h c0240h = this.f41751d;
            if (c0240h.f41789c || c0240h.f41788b) {
                Matrix matrix = c3297v.f41704n;
                if (matrix != null) {
                    this.f41748a.concat(matrix);
                }
                Path f4 = new d(c3297v.f41732o).f();
                if (c3297v.f41627h == null) {
                    c3297v.f41627h = m(f4);
                }
                U0(c3297v);
                r(c3297v);
                p(c3297v);
                boolean m02 = m0();
                if (this.f41751d.f41788b) {
                    f4.setFillType(U());
                    B(c3297v, f4);
                }
                if (this.f41751d.f41789c) {
                    C(f4);
                }
                I0(c3297v);
                if (m02) {
                    j0(c3297v);
                }
            }
        }
    }

    private void u(C3276g.N n4) {
        Boolean bool;
        if ((n4 instanceof C3276g.L) && (bool = ((C3276g.L) n4).f41629d) != null) {
            this.f41751d.f41794h = bool.booleanValue();
        }
    }

    private void u0(C3276g.C3301z c3301z) {
        y("PolyLine render", new Object[0]);
        W0(this.f41751d, c3301z);
        if (A() && Y0()) {
            C0240h c0240h = this.f41751d;
            if (c0240h.f41789c || c0240h.f41788b) {
                Matrix matrix = c3301z.f41704n;
                if (matrix != null) {
                    this.f41748a.concat(matrix);
                }
                if (c3301z.f41746o.length < 2) {
                    return;
                }
                Path b02 = b0(c3301z);
                U0(c3301z);
                b02.setFillType(U());
                r(c3301z);
                p(c3301z);
                boolean m02 = m0();
                if (this.f41751d.f41788b) {
                    B(c3301z, b02);
                }
                if (this.f41751d.f41789c) {
                    C(b02);
                }
                I0(c3301z);
                if (m02) {
                    j0(c3301z);
                }
            }
        }
    }

    private static double v(double d4) {
        if (d4 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d4 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d4);
    }

    private void v0(C3276g.A a4) {
        y("Polygon render", new Object[0]);
        W0(this.f41751d, a4);
        if (A() && Y0()) {
            C0240h c0240h = this.f41751d;
            if (c0240h.f41789c || c0240h.f41788b) {
                Matrix matrix = a4.f41704n;
                if (matrix != null) {
                    this.f41748a.concat(matrix);
                }
                if (a4.f41746o.length < 2) {
                    return;
                }
                Path b02 = b0(a4);
                U0(a4);
                r(a4);
                p(a4);
                boolean m02 = m0();
                if (this.f41751d.f41788b) {
                    B(a4, b02);
                }
                if (this.f41751d.f41789c) {
                    C(b02);
                }
                I0(a4);
                if (m02) {
                    j0(a4);
                }
            }
        }
    }

    private static int w(float f4) {
        int i4 = (int) (f4 * 256.0f);
        if (i4 < 0) {
            return 0;
        }
        return i4 > 255 ? KotlinVersion.MAX_COMPONENT_VALUE : i4;
    }

    private void w0(C3276g.B b4) {
        y("Rect render", new Object[0]);
        C3276g.C3291p c3291p = b4.f41532q;
        if (c3291p == null || b4.f41533r == null || c3291p.i() || b4.f41533r.i()) {
            return;
        }
        W0(this.f41751d, b4);
        if (A() && Y0()) {
            Matrix matrix = b4.f41704n;
            if (matrix != null) {
                this.f41748a.concat(matrix);
            }
            Path c02 = c0(b4);
            U0(b4);
            r(b4);
            p(b4);
            boolean m02 = m0();
            if (this.f41751d.f41788b) {
                B(b4, c02);
            }
            if (this.f41751d.f41789c) {
                C(c02);
            }
            if (m02) {
                j0(b4);
            }
        }
    }

    private static int x(int i4, float f4) {
        int i5 = KotlinVersion.MAX_COMPONENT_VALUE;
        int round = Math.round(((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) * f4);
        if (round < 0) {
            i5 = 0;
        } else if (round <= 255) {
            i5 = round;
        }
        return (i4 & 16777215) | (i5 << 24);
    }

    private void x0(C3276g.F f4) {
        z0(f4, f0(f4.f41611q, f4.f41612r, f4.f41613s, f4.f41614t), f4.f41645p, f4.f41639o);
    }

    private void y0(C3276g.F f4, C3276g.C3278b c3278b) {
        z0(f4, c3278b, f4.f41645p, f4.f41639o);
    }

    private void z(boolean z4, C3276g.C3278b c3278b, C3276g.C3296u c3296u) {
        C3276g.N r4 = this.f41750c.r(c3296u.f41730b);
        if (r4 == null) {
            F("%s reference '%s' not found", z4 ? "Fill" : "Stroke", c3296u.f41730b);
            C3276g.O o4 = c3296u.f41731c;
            if (o4 != null) {
                P0(this.f41751d, z4, o4);
                return;
            } else if (z4) {
                this.f41751d.f41788b = false;
                return;
            } else {
                this.f41751d.f41789c = false;
                return;
            }
        }
        if (r4 instanceof C3276g.M) {
            X(z4, c3278b, (C3276g.M) r4);
        } else if (r4 instanceof C3276g.Q) {
            e0(z4, c3278b, (C3276g.Q) r4);
        } else if (r4 instanceof C3276g.C) {
            Q0(z4, (C3276g.C) r4);
        }
    }

    private void z0(C3276g.F f4, C3276g.C3278b c3278b, C3276g.C3278b c3278b2, C3274e c3274e) {
        y("Svg render", new Object[0]);
        if (c3278b.f41660c == 0.0f || c3278b.f41661d == 0.0f) {
            return;
        }
        if (c3274e == null && (c3274e = f4.f41639o) == null) {
            c3274e = C3274e.f41494e;
        }
        W0(this.f41751d, f4);
        if (A()) {
            C0240h c0240h = this.f41751d;
            c0240h.f41792f = c3278b;
            if (!c0240h.f41787a.f41572w.booleanValue()) {
                C3276g.C3278b c3278b3 = this.f41751d.f41792f;
                O0(c3278b3.f41658a, c3278b3.f41659b, c3278b3.f41660c, c3278b3.f41661d);
            }
            q(f4, this.f41751d.f41792f);
            if (c3278b2 != null) {
                this.f41748a.concat(o(this.f41751d.f41792f, c3278b2, c3274e));
                this.f41751d.f41793g = f4.f41645p;
            } else {
                Canvas canvas = this.f41748a;
                C3276g.C3278b c3278b4 = this.f41751d.f41792f;
                canvas.translate(c3278b4.f41658a, c3278b4.f41659b);
            }
            boolean m02 = m0();
            X0();
            F0(f4, true);
            if (m02) {
                j0(f4);
            }
            U0(f4);
        }
    }

    void G0(C3276g c3276g, C3275f c3275f) {
        C3276g.C3278b c3278b;
        C3274e c3274e;
        if (c3275f == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f41750c = c3276g;
        C3276g.F m4 = c3276g.m();
        if (m4 == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (c3275f.d()) {
            C3276g.L i4 = this.f41750c.i(c3275f.f41521e);
            if (i4 == null || !(i4 instanceof C3276g.f0)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", c3275f.f41521e));
                return;
            }
            C3276g.f0 f0Var = (C3276g.f0) i4;
            c3278b = f0Var.f41645p;
            if (c3278b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", c3275f.f41521e));
                return;
            }
            c3274e = f0Var.f41639o;
        } else {
            c3278b = c3275f.e() ? c3275f.f41520d : m4.f41645p;
            c3274e = c3275f.b() ? c3275f.f41518b : m4.f41639o;
        }
        if (c3275f.a()) {
            c3276g.a(c3275f.f41517a);
        }
        if (c3275f.c()) {
            C3271b.q qVar = new C3271b.q();
            this.f41755h = qVar;
            qVar.f41476a = c3276g.i(c3275f.f41519c);
        }
        N0();
        u(m4);
        S0();
        C3276g.C3278b c3278b2 = new C3276g.C3278b(c3275f.f41522f);
        C3276g.C3291p c3291p = m4.f41613s;
        if (c3291p != null) {
            c3278b2.f41660c = c3291p.d(this, c3278b2.f41660c);
        }
        C3276g.C3291p c3291p2 = m4.f41614t;
        if (c3291p2 != null) {
            c3278b2.f41661d = c3291p2.d(this, c3278b2.f41661d);
        }
        z0(m4, c3278b2, c3278b, c3274e);
        R0();
        if (c3275f.a()) {
            c3276g.b();
        }
    }

    float Q() {
        return this.f41751d.f41790d.getTextSize();
    }

    float R() {
        return this.f41751d.f41790d.getTextSize() / 2.0f;
    }

    C3276g.C3278b S() {
        C0240h c0240h = this.f41751d;
        C3276g.C3278b c3278b = c0240h.f41793g;
        return c3278b != null ? c3278b : c0240h.f41792f;
    }

    float T() {
        return this.f41749b;
    }

    /* renamed from: o0.h$k */
    private class k extends j {

        /* renamed from: b, reason: collision with root package name */
        float f41801b;

        private k() {
            super(C3302h.this, null);
            this.f41801b = 0.0f;
        }

        @Override // o0.C3302h.j
        public void b(String str) {
            this.f41801b += C3302h.this.f41751d.f41790d.measureText(str);
        }

        /* synthetic */ k(C3302h c3302h, a aVar) {
            this();
        }
    }

    /* renamed from: o0.h$h, reason: collision with other inner class name */
    private class C0240h {

        /* renamed from: a, reason: collision with root package name */
        C3276g.E f41787a;

        /* renamed from: b, reason: collision with root package name */
        boolean f41788b;

        /* renamed from: c, reason: collision with root package name */
        boolean f41789c;

        /* renamed from: d, reason: collision with root package name */
        Paint f41790d;

        /* renamed from: e, reason: collision with root package name */
        Paint f41791e;

        /* renamed from: f, reason: collision with root package name */
        C3276g.C3278b f41792f;

        /* renamed from: g, reason: collision with root package name */
        C3276g.C3278b f41793g;

        /* renamed from: h, reason: collision with root package name */
        boolean f41794h;

        C0240h() {
            Paint paint = new Paint();
            this.f41790d = paint;
            paint.setFlags(193);
            this.f41790d.setHinting(0);
            this.f41790d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f41790d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f41791e = paint3;
            paint3.setFlags(193);
            this.f41791e.setHinting(0);
            this.f41791e.setStyle(Paint.Style.STROKE);
            this.f41791e.setTypeface(typeface);
            this.f41787a = C3276g.E.a();
        }

        C0240h(C0240h c0240h) {
            this.f41788b = c0240h.f41788b;
            this.f41789c = c0240h.f41789c;
            this.f41790d = new Paint(c0240h.f41790d);
            this.f41791e = new Paint(c0240h.f41791e);
            C3276g.C3278b c3278b = c0240h.f41792f;
            if (c3278b != null) {
                this.f41792f = new C3276g.C3278b(c3278b);
            }
            C3276g.C3278b c3278b2 = c0240h.f41793g;
            if (c3278b2 != null) {
                this.f41793g = new C3276g.C3278b(c3278b2);
            }
            this.f41794h = c0240h.f41794h;
            try {
                this.f41787a = (C3276g.E) c0240h.f41787a.clone();
            } catch (CloneNotSupportedException e4) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e4);
                this.f41787a = C3276g.E.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }
}
