package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fob extends Drawable implements Cfor {
    public static final /* synthetic */ int B = 0;
    private static final String a = "fob";
    private static final Paint b;
    private static final foa[] c;
    public kee A;
    private boolean C;
    private fog D;
    private acu E;
    private float[] F;
    private final kee G;
    private final kee H;
    private final Matrix d;
    private final Path e;
    private final RectF f;
    private final RectF g;
    private final Region h;
    private final Region i;
    private final Paint j;
    private final Paint k;
    private final fns l;
    private final foi m;
    private PorterDuffColorFilter n;
    private final RectF o;
    public fnz p;
    public final fop[] q;
    public final fop[] r;
    public final BitSet s;
    public boolean t;
    public boolean u;
    public final Path v;
    public int w;
    public boolean x;
    act[] y;
    public float[] z;

    static {
        gbw gbwVar = new gbw((byte[]) null);
        int i = 0;
        fny z = fhq.z(0);
        gbwVar.n(z);
        gbwVar.o(z);
        gbwVar.m(z);
        gbwVar.l(z);
        gbwVar.k(0.0f);
        Paint paint = new Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        c = new foa[4];
        while (true) {
            foa[] foaVarArr = c;
            int length = foaVarArr.length;
            if (i >= 4) {
                return;
            }
            foaVarArr[i] = new foa(i);
            i++;
        }
    }

    protected fob(fnz fnzVar) {
        this.H = new kee(this);
        this.q = new fop[4];
        this.r = new fop[4];
        this.s = new BitSet(8);
        this.d = new Matrix();
        this.v = new Path();
        this.e = new Path();
        this.f = new RectF();
        this.g = new RectF();
        this.h = new Region();
        this.i = new Region();
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        this.l = new fns();
        this.m = foi.a();
        this.o = new RectF();
        this.x = true;
        this.C = true;
        this.y = new act[4];
        this.p = fnzVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k();
        j(getState());
        this.G = new kee(this);
    }

    public static fob E(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(fhq.g(context, a));
        }
        fob fobVar = new fob();
        fobVar.J(context);
        fobVar.M(colorStateList);
        fobVar.L(f);
        return fobVar;
    }

    private final RectF a() {
        RectF rectF = this.g;
        rectF.set(D());
        float v = v();
        rectF.inset(v, v);
        return rectF;
    }

    private final void b(RectF rectF, Path path) {
        G(rectF, path);
        if (this.p.j != 1.0f) {
            Matrix matrix = this.d;
            matrix.reset();
            float f = this.p.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.o, true);
    }

    private final void c(Canvas canvas) {
        if (this.s.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.p.s != 0) {
            canvas.drawPath(this.v, this.l.e);
        }
        for (int i = 0; i < 4; i++) {
            fop[] fopVarArr = this.q;
            fns fnsVar = this.l;
            fopVarArr[i].c(fnsVar, this.p.r, canvas);
            this.r[i].c(fnsVar, this.p.r, canvas);
        }
        if (this.x) {
            int A = A();
            int B2 = B();
            canvas.translate(-A, -B2);
            canvas.drawPath(this.v, b);
            canvas.translate(A, B2);
        }
    }

    private final void e(int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        RectF D = D();
        if (!this.p.a.d() || D.isEmpty()) {
            return;
        }
        boolean z4 = z | (this.E == null);
        if (this.z == null) {
            this.z = new float[4];
        }
        fog b2 = this.p.a.b(iArr);
        float[] fArr = this.z;
        int length = fArr.length;
        float f = fArr[0];
        int i = 1;
        while (true) {
            int length2 = fArr.length;
            if (i < 4) {
                if (fArr[i] != f) {
                    break;
                } else {
                    i++;
                }
            } else if (b2.g(D())) {
                z2 = true;
            }
        }
        z2 = false;
        this.C = z2;
        if (!z2) {
            this.t = true;
            this.u = true;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            float a2 = foi.b(i2, b2).a(D);
            if (z4) {
                this.z[i2] = a2;
                z3 = true;
            } else {
                z3 = false;
            }
            act actVar = this.y[i2];
            if (actVar != null) {
                actVar.j(a2);
                if (z3) {
                    this.y[i2].k();
                }
            }
        }
        if (z4) {
            invalidateSelf();
        }
    }

    private final void f() {
        float y = y();
        this.p.r = (int) Math.ceil(0.75f * y);
        this.p.s = (int) Math.ceil(y * 0.25f);
        k();
        if (i()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    private final boolean g() {
        fnz fnzVar = this.p;
        int i = fnzVar.q;
        if (i == 1 || fnzVar.r <= 0) {
            return false;
        }
        if (i != 2) {
            return (V() || this.v.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
        }
        return true;
    }

    private final boolean h() {
        return (this.p.v == Paint.Style.FILL_AND_STROKE || this.p.v == Paint.Style.STROKE) && this.k.getStrokeWidth() > 0.0f;
    }

    private final boolean i() {
        return g() || !V();
    }

    private final boolean j(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.p.d != null && color2 != (colorForState2 = this.p.d.getColorForState(iArr, (color2 = (paint2 = this.j).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.p.e == null || color == (colorForState = this.p.e.getColorForState(iArr, (color = (paint = this.k).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean k() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.n;
        fnz fnzVar = this.p;
        ColorStateList colorStateList = fnzVar.g;
        PorterDuff.Mode mode = fnzVar.h;
        if (colorStateList == null || mode == null) {
            int color = this.j.getColor();
            int z = z(color);
            this.w = z;
            porterDuffColorFilter = z != color ? new PorterDuffColorFilter(z, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int z2 = z(colorStateList.getColorForState(getState(), 0));
            this.w = z2;
            porterDuffColorFilter = new PorterDuffColorFilter(z2, mode);
        }
        this.n = porterDuffColorFilter;
        fnz fnzVar2 = this.p;
        ColorStateList colorStateList2 = fnzVar2.f;
        PorterDuff.Mode mode2 = fnzVar2.h;
        boolean z3 = fnzVar2.u;
        return (Objects.equals(porterDuffColorFilter2, this.n) && Objects.equals(null, null)) ? false : true;
    }

    public final int A() {
        fnz fnzVar = this.p;
        return (int) (fnzVar.s * Math.sin(Math.toRadians(fnzVar.t)));
    }

    public final int B() {
        fnz fnzVar = this.p;
        return (int) (fnzVar.s * Math.cos(Math.toRadians(fnzVar.t)));
    }

    public final ColorStateList C() {
        return this.p.d;
    }

    public final RectF D() {
        RectF rectF = this.f;
        rectF.set(getBounds());
        return rectF;
    }

    public final fog F() {
        return this.p.a.a();
    }

    protected final void G(RectF rectF, Path path) {
        this.m.c(this.p.a.a(), this.z, this.p.k, rectF, this.G, path);
    }

    public final void H(Canvas canvas, Paint paint, Path path, fog fogVar, float[] fArr, RectF rectF) {
        float s = s(rectF, fogVar, fArr);
        if (s < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = s * this.p.k;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    protected void I(Canvas canvas) {
        H(canvas, this.k, this.e, this.D, this.F, a());
    }

    public final void J(Context context) {
        this.p.b = new fhs(context);
        f();
    }

    public final void K(acu acuVar) {
        if (this.E == acuVar) {
            return;
        }
        this.E = acuVar;
        int i = 0;
        while (true) {
            act[] actVarArr = this.y;
            int length = actVarArr.length;
            if (i >= 4) {
                e(getState(), true);
                invalidateSelf();
                return;
            }
            if (actVarArr[i] == null) {
                actVarArr[i] = new act(this, c[i]);
            }
            act actVar = this.y[i];
            acu acuVar2 = new acu();
            acuVar2.c((float) acuVar.b);
            double d = acuVar.a;
            acuVar2.e((float) (d * d));
            actVar.t = acuVar2;
            i++;
        }
    }

    public final void L(float f) {
        fnz fnzVar = this.p;
        if (fnzVar.o != f) {
            fnzVar.o = f;
            f();
        }
    }

    public final void M(ColorStateList colorStateList) {
        fnz fnzVar = this.p;
        if (fnzVar.d != colorStateList) {
            fnzVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void N(float f) {
        fnz fnzVar = this.p;
        if (fnzVar.k != f) {
            fnzVar.k = f;
            this.t = true;
            this.u = true;
            invalidateSelf();
        }
    }

    public final void O(float f) {
        fnz fnzVar = this.p;
        if (fnzVar.n != f) {
            fnzVar.n = f;
            f();
        }
    }

    public final void P(int i) {
        this.l.a(i);
        this.p.u = false;
        super.invalidateSelf();
    }

    public final void Q(fof fofVar) {
        if (fofVar instanceof fog) {
            bz((fog) fofVar);
            return;
        }
        foy foyVar = (foy) fofVar;
        fnz fnzVar = this.p;
        if (fnzVar.a != foyVar) {
            fnzVar.a = foyVar;
            e(getState(), true);
            invalidateSelf();
        }
    }

    public final void R(float f, int i) {
        U(f);
        T(ColorStateList.valueOf(i));
    }

    public final void S(float f, ColorStateList colorStateList) {
        U(f);
        T(colorStateList);
    }

    public final void T(ColorStateList colorStateList) {
        fnz fnzVar = this.p;
        if (fnzVar.e != colorStateList) {
            fnzVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void U(float f) {
        this.p.l = f;
        invalidateSelf();
    }

    public final boolean V() {
        if (this.p.a.b(getState()).g(D())) {
            return this.z == null || this.C;
        }
        return false;
    }

    public final void W() {
        fnz fnzVar = this.p;
        if (fnzVar.t != 180) {
            fnzVar.t = 180;
            super.invalidateSelf();
        }
    }

    public final void X() {
        fnz fnzVar = this.p;
        if (fnzVar.q != 2) {
            fnzVar.q = 2;
            super.invalidateSelf();
        }
    }

    @Override // defpackage.Cfor
    public final void bz(fog fogVar) {
        this.p.a = fogVar;
        this.z = null;
        this.F = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.j;
        paint.setColorFilter(this.n);
        int alpha = paint.getAlpha();
        int i = this.p.m;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.k;
        paint2.setColorFilter(null);
        paint2.setStrokeWidth(this.p.l);
        int alpha2 = paint2.getAlpha();
        int i2 = this.p.m;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean i3 = i();
        if (this.p.v == Paint.Style.FILL_AND_STROKE || this.p.v == Paint.Style.FILL) {
            if (this.t) {
                if (i3) {
                    b(D(), this.v);
                }
                this.t = false;
            }
            if (g()) {
                canvas.save();
                canvas.translate(A(), B());
                if (this.x) {
                    Rect bounds = getBounds();
                    RectF rectF = this.o;
                    float width = rectF.width() - bounds.width();
                    int height = (int) (rectF.height() - bounds.height());
                    int i4 = (int) width;
                    if (i4 < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + i4 + " extra height: " + height + " path bounds: " + String.valueOf(rectF));
                    }
                    int width2 = (int) rectF.width();
                    int i5 = this.p.r;
                    int i6 = width2 + i5 + i5 + i4;
                    int height2 = (int) rectF.height();
                    int i7 = this.p.r;
                    Bitmap createBitmap = Bitmap.createBitmap(i6, height2 + i7 + i7 + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f = (bounds.left - this.p.r) - i4;
                    float f2 = (bounds.top - this.p.r) - height;
                    canvas2.translate(-f, -f2);
                    c(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
            H(canvas, paint, this.v, this.p.a.a(), this.z, D());
        }
        if (h()) {
            if (this.u) {
                fog F = F();
                kee keeVar = this.H;
                gbw gbwVar = new gbw(F);
                gbwVar.d = keeVar.i(F.b);
                gbwVar.k = keeVar.i(F.c);
                gbwVar.b = keeVar.i(F.e);
                gbwVar.f = keeVar.i(F.d);
                this.D = new fog(gbwVar);
                if (this.z != null) {
                    if (this.F == null) {
                        this.F = new float[4];
                    }
                    float v = v();
                    int i8 = 0;
                    while (true) {
                        float[] fArr = this.z;
                        int length = fArr.length;
                        if (i8 >= 4) {
                            break;
                        }
                        this.F[i8] = Math.max(0.0f, fArr[i8] - v);
                        i8++;
                    }
                } else {
                    this.F = null;
                }
                if (i3) {
                    this.m.c(this.D, this.F, this.p.k, a(), null, this.e);
                }
                this.u = false;
            }
            I(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.p.q == 2) {
            return;
        }
        RectF D = D();
        if (D.isEmpty()) {
            return;
        }
        float s = s(D, this.p.a.a(), this.z);
        if (s >= 0.0f) {
            outline.setRoundRect(getBounds(), s * this.p.k);
            return;
        }
        if (this.t) {
            b(D, this.v);
            this.t = false;
        }
        fhr.d(outline, this.v);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.p.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Region region = this.h;
        region.set(getBounds());
        RectF D = D();
        Path path = this.v;
        b(D, path);
        Region region2 = this.i;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.t = true;
        this.u = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.p.g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        fnz fnzVar = this.p;
        ColorStateList colorStateList2 = fnzVar.f;
        ColorStateList colorStateList3 = fnzVar.e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.p.d;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.p.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.p = new fnz(this.p);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.t = true;
        this.u = true;
        super.onBoundsChange(rect);
        if (!this.p.a.d() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        act[] actVarArr = this.y;
        int length = actVarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < 4) {
                act actVar = actVarArr[i];
                if (actVar != null && actVar.n) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        e(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.fjt
    protected boolean onStateChange(int[] iArr) {
        if (this.p.a.d()) {
            e(iArr, false);
        }
        boolean z = j(iArr) || k();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final float s(RectF rectF, fog fogVar, float[] fArr) {
        if (fArr == null) {
            if (fogVar.g(rectF)) {
                return fogVar.b.a(rectF);
            }
            return -1.0f;
        }
        if (this.C) {
            return fArr[0];
        }
        return -1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        fnz fnzVar = this.p;
        if (fnzVar.m != i) {
            fnzVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.p.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.p.g = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        fnz fnzVar = this.p;
        if (fnzVar.h != mode) {
            fnzVar.h = mode;
            k();
            super.invalidateSelf();
        }
    }

    public final float t() {
        float[] fArr = this.z;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF D = D();
        return (((F().b.a(D) + F().e.a(D)) - F().d.a(D)) - foi.b(0, F()).a(D)) / 2.0f;
    }

    public final float u() {
        return this.p.o;
    }

    public final float v() {
        if (h()) {
            return this.k.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float w() {
        float[] fArr = this.z;
        return fArr != null ? fArr[3] : this.p.a.a().b.a(D());
    }

    public final float x() {
        float[] fArr = this.z;
        return fArr != null ? fArr[0] : this.p.a.a().c.a(D());
    }

    public final float y() {
        float u = u();
        float f = this.p.p;
        return u + 0.0f;
    }

    protected final int z(int i) {
        float y = y();
        fnz fnzVar = this.p;
        float f = y + fnzVar.n;
        fhs fhsVar = fnzVar.b;
        return fhsVar != null ? fhsVar.b(i, f) : i;
    }

    public fob(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new fog(fog.k(context, attributeSet, i, i2)));
    }

    public fob() {
        this(new fog());
    }

    public fob(fof fofVar) {
        this(new fnz(fofVar));
    }

    public fob(fog fogVar) {
        this(new fnz(fogVar));
    }
}
