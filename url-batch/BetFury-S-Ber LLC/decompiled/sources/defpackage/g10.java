package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class g10 extends Drawable implements rd0 {
    public static final Paint K;
    public static final f10[] L;
    public int A;
    public final RectF B;
    public boolean C;
    public boolean D;
    public gd0 E;
    public ue0 F;
    public final te0[] G;
    public float[] H;
    public float[] I;
    public cv J;
    public final d10 f;
    public e10 g;
    public final pd0[] h;
    public final pd0[] i;
    public final BitSet j;
    public boolean k;
    public boolean l;
    public final Matrix m;
    public final Path n;
    public final Path o;
    public final RectF p;
    public final RectF q;
    public final Region r;
    public final Region s;
    public final Paint t;
    public final Paint u;
    public final dd0 v;
    public final d10 w;
    public final id0 x;
    public PorterDuffColorFilter y;
    public PorterDuffColorFilter z;

    static {
        Paint paint = new Paint(1);
        K = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        L = new f10[4];
        int i = 0;
        while (true) {
            f10[] f10VarArr = L;
            if (i >= f10VarArr.length) {
                return;
            }
            f10VarArr[i] = new f10(i);
            i++;
        }
    }

    public g10(e10 e10Var) {
        this.f = new d10(this);
        this.h = new pd0[4];
        this.i = new pd0[4];
        this.j = new BitSet(8);
        this.m = new Matrix();
        this.n = new Path();
        this.o = new Path();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new Region();
        this.s = new Region();
        Paint paint = new Paint(1);
        this.t = paint;
        Paint paint2 = new Paint(1);
        this.u = paint2;
        this.v = new dd0();
        this.x = id0.b();
        this.B = new RectF();
        this.C = true;
        this.D = true;
        this.G = new te0[4];
        this.g = e10Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        x();
        v(getState());
        this.w = new d10(this);
    }

    public final void a(RectF rectF, Path path) {
        this.x.a(this.g.a.d(), this.H, this.g.i, rectF, this.w, path);
        if (this.g.h != 1.0f) {
            Matrix matrix = this.m;
            matrix.reset();
            float f = this.g.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.B, true);
    }

    public final float b(RectF rectF, gd0 gd0Var, float[] fArr) {
        if (fArr == null) {
            if (gd0Var.j(rectF)) {
                return gd0Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.D) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int c(int i) {
        int i2;
        e10 e10Var = this.g;
        float f = e10Var.m + 0.0f + e10Var.l;
        tl tlVar = e10Var.b;
        if (tlVar == null || !tlVar.a || fd.d(i, 255) != tlVar.d) {
            return i;
        }
        float min = (tlVar.e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int J = bi.J(fd.d(i, 255), tlVar.b, min);
        if (min > 0.0f && (i2 = tlVar.c) != 0) {
            J = fd.b(fd.d(i2, tl.f), J);
        }
        return fd.d(J, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.j.cardinality() > 0) {
            Log.w("g10", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.g.o;
        Path path = this.n;
        dd0 dd0Var = this.v;
        if (i != 0) {
            canvas.drawPath(path, dd0Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            pd0 pd0Var = this.h[i2];
            int i3 = this.g.n;
            Matrix matrix = pd0.b;
            pd0Var.a(matrix, dd0Var, i3, canvas);
            this.i[i2].a(matrix, dd0Var, this.g.n, canvas);
        }
        if (this.C) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.g.o);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.g.o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, K);
            canvas.translate(sin, cos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        Paint paint2 = this.t;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.g.k;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        Paint paint3 = this.u;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.g.j);
        int alpha2 = paint3.getAlpha();
        int i2 = this.g.k;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = l() || !o();
        Paint.Style style = this.g.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.k;
            paint = paint2;
            Path path = this.n;
            if (z2) {
                if (z) {
                    a(g(), path);
                }
                this.k = false;
            }
            if (l()) {
                canvas.save();
                canvas.translate((int) (this.g.o * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * this.g.o));
                if (this.C) {
                    Rect bounds = getBounds();
                    RectF rectF = this.B;
                    int width = (int) (rectF.width() - bounds.width());
                    int height = (int) (rectF.height() - bounds.height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + width + " extra height: " + height + " path bounds: " + rectF);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.g.n * 2) + ((int) rectF.width()) + width, (this.g.n * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    int i3 = bounds.left;
                    int i4 = this.g.n;
                    float f = (i3 - i4) - width;
                    float f2 = (bounds.top - i4) - height;
                    canvas2.translate(-f, -f2);
                    d(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
            e(canvas, paint, path, this.g.a.d(), this.H, g());
        } else {
            paint = paint2;
        }
        if (m()) {
            if (this.l) {
                gd0 i5 = i();
                fd0 k = i5.k();
                ng ngVar = i5.e;
                d10 d10Var = this.f;
                k.e = d10Var.a(ngVar);
                k.f = d10Var.a(i5.f);
                k.h = d10Var.a(i5.h);
                k.g = d10Var.a(i5.g);
                this.E = k.a();
                float[] fArr = this.H;
                if (fArr != null) {
                    if (this.I == null) {
                        this.I = new float[fArr.length];
                    }
                    float j = j();
                    int i6 = 0;
                    while (true) {
                        float[] fArr2 = this.H;
                        if (i6 >= fArr2.length) {
                            break;
                        }
                        this.I[i6] = Math.max(0.0f, fArr2[i6] - j);
                        i6++;
                    }
                } else {
                    this.I = null;
                }
                if (z) {
                    gd0 gd0Var = this.E;
                    float[] fArr3 = this.I;
                    float f3 = this.g.i;
                    RectF g = g();
                    RectF rectF2 = this.q;
                    rectF2.set(g);
                    float j2 = j();
                    rectF2.inset(j2, j2);
                    this.x.a(gd0Var, fArr3, f3, rectF2, null, this.o);
                }
                this.l = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, gd0 gd0Var, float[] fArr, RectF rectF) {
        float b = b(rectF, gd0Var, fArr);
        if (b < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = b * this.g.i;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void f(Canvas canvas) {
        gd0 gd0Var = this.E;
        float[] fArr = this.I;
        RectF g = g();
        RectF rectF = this.q;
        rectF.set(g);
        float j = j();
        rectF.inset(j, j);
        e(canvas, this.u, this.o, gd0Var, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.p;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.g.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.g.getClass();
        RectF g = g();
        if (g.isEmpty()) {
            return;
        }
        float b = b(g, this.g.a.d(), this.H);
        if (b >= 0.0f) {
            outline.setRoundRect(getBounds(), b * this.g.i);
            return;
        }
        boolean z = this.k;
        Path path = this.n;
        if (z) {
            a(g, path);
            this.k = false;
        }
        bi.X(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.g.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.r;
        region.set(bounds);
        RectF g = g();
        Path path = this.n;
        a(g, path);
        Region region2 = this.s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.H;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g = g();
        gd0 i = i();
        id0 id0Var = this.x;
        id0Var.getClass();
        float a = i.e.a(g);
        gd0 i2 = i();
        id0Var.getClass();
        float a2 = i2.h.a(g) + a;
        gd0 i3 = i();
        id0Var.getClass();
        float a3 = a2 - i3.g.a(g);
        gd0 i4 = i();
        id0Var.getClass();
        return (a3 - i4.f.a(g)) / 2.0f;
    }

    public final gd0 i() {
        return this.g.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.k = true;
        this.l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.g.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.g.getClass();
        ColorStateList colorStateList2 = this.g.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.g.c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.g.a.f();
    }

    public final float j() {
        if (m()) {
            return this.u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.H;
        return fArr != null ? fArr[3] : this.g.a.d().e.a(g());
    }

    public final boolean l() {
        e10 e10Var = this.g;
        e10Var.getClass();
        return e10Var.n > 0 && !o() && !this.n.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final boolean m() {
        Paint.Style style = this.g.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.u.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.g = new e10(this.g);
        return this;
    }

    public final void n(Context context) {
        this.g.b = new tl(context);
        y();
    }

    public final boolean o() {
        if (this.g.a.b(getState()).j(g())) {
            return this.H == null || this.D;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.k = true;
        this.l = true;
        super.onBoundsChange(rect);
        if (!this.g.a.f() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        te0[] te0VarArr = this.G;
        int length = te0VarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                te0 te0Var = te0VarArr[i];
                if (te0Var != null && te0Var.e) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        w(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.g.a.f()) {
            w(iArr, false);
        }
        boolean z = v(iArr) || x();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(ue0 ue0Var) {
        if (this.F == ue0Var) {
            return;
        }
        this.F = ue0Var;
        int i = 0;
        while (true) {
            te0[] te0VarArr = this.G;
            if (i >= te0VarArr.length) {
                w(getState(), true);
                invalidateSelf();
                return;
            }
            if (te0VarArr[i] == null) {
                te0VarArr[i] = new te0(this, L[i]);
            }
            te0 te0Var = te0VarArr[i];
            ue0 ue0Var2 = new ue0();
            float f = (float) ue0Var.b;
            if (f < 0.0f) {
                s9.k("Damping ratio must be non-negative");
                return;
            }
            ue0Var2.b = f;
            ue0Var2.c = false;
            double d = ue0Var.a;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                s9.k("Spring stiffness constant must be positive.");
                return;
            }
            ue0Var2.a = Math.sqrt(f2);
            ue0Var2.c = false;
            te0Var.j = ue0Var2;
            i++;
        }
    }

    public final void q(float f) {
        e10 e10Var = this.g;
        if (e10Var.m != f) {
            e10Var.m = f;
            y();
        }
    }

    public final void r(ColorStateList colorStateList) {
        e10 e10Var = this.g;
        if (e10Var.c != colorStateList) {
            e10Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(float f) {
        e10 e10Var = this.g;
        if (e10Var.i != f) {
            e10Var.i = f;
            this.k = true;
            this.l = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        e10 e10Var = this.g;
        if (e10Var.k != i) {
            e10Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.g.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.rd0
    public final void setShapeAppearanceModel(gd0 gd0Var) {
        this.g.a = gd0Var;
        this.H = null;
        this.I = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.g.e = colorStateList;
        x();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        e10 e10Var = this.g;
        if (e10Var.f != mode) {
            e10Var.f = mode;
            x();
            super.invalidateSelf();
        }
    }

    public final void t() {
        this.v.a(-12303292);
        this.g.getClass();
        super.invalidateSelf();
    }

    public final void u(ed0 ed0Var) {
        if (ed0Var instanceof gd0) {
            setShapeAppearanceModel((gd0) ed0Var);
            return;
        }
        gf0 gf0Var = (gf0) ed0Var;
        e10 e10Var = this.g;
        if (e10Var.a != gf0Var) {
            e10Var.a = gf0Var;
            w(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean v(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.g.c == null || color2 == (colorForState2 = this.g.c.getColorForState(iArr, (color2 = (paint2 = this.t).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.g.d == null || color == (colorForState = this.g.d.getColorForState(iArr, (color = (paint = this.u).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(int[] iArr, boolean z) {
        boolean z2;
        RectF g = g();
        if (!this.g.a.f() || g.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.F == null);
        if (this.H == null) {
            this.H = new float[4];
        }
        gd0 b = this.g.a.b(iArr);
        float[] fArr = this.H;
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] != f) {
                    break;
                }
            }
        }
        if (b.j(g())) {
            z2 = true;
            this.D = z2;
            if (!z2) {
                this.k = true;
                this.l = true;
            }
            while (i < 4) {
                this.x.getClass();
                float a = (i != 1 ? i != 2 ? i != 3 ? b.f : b.e : b.h : b.g).a(g);
                if (z3) {
                    this.H[i] = a;
                }
                te0[] te0VarArr = this.G;
                te0 te0Var = te0VarArr[i];
                if (te0Var != null) {
                    te0Var.a(a);
                    if (z3) {
                        te0VarArr[i].d();
                    }
                }
                i++;
            }
            if (z3) {
                return;
            }
            invalidateSelf();
            return;
        }
        z2 = false;
        this.D = z2;
        if (!z2) {
        }
        while (i < 4) {
        }
        if (z3) {
        }
    }

    public final boolean x() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        PorterDuffColorFilter porterDuffColorFilter3 = this.z;
        e10 e10Var = this.g;
        ColorStateList colorStateList = e10Var.e;
        PorterDuff.Mode mode = e10Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.t.getColor();
            int c = c(color);
            this.A = c;
            porterDuffColorFilter = c != color ? new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int c2 = c(colorStateList.getColorForState(getState(), 0));
            this.A = c2;
            porterDuffColorFilter = new PorterDuffColorFilter(c2, mode);
        }
        this.y = porterDuffColorFilter;
        this.g.getClass();
        this.z = null;
        this.g.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.y) && Objects.equals(porterDuffColorFilter3, this.z)) ? false : true;
    }

    public final void y() {
        e10 e10Var = this.g;
        float f = e10Var.m + 0.0f;
        e10Var.n = (int) Math.ceil(0.75f * f);
        this.g.o = (int) Math.ceil(f * 0.25f);
        x();
        if (l() || !o()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public g10(Context context, AttributeSet attributeSet, int i, int i2) {
        this(gd0.g(context, attributeSet, i, i2).a());
    }

    public g10(gd0 gd0Var) {
        this(new e10(gd0Var));
    }

    public g10(ed0 ed0Var) {
        this(new e10(ed0Var));
    }

    public g10() {
        this(new gd0());
    }
}
