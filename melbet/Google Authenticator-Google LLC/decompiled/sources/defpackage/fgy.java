package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgy extends fob implements Drawable.Callback, fjt {
    private ColorStateList D;
    private ColorStateList E;
    private float F;
    private ColorStateList G;
    private float H;
    private boolean I;
    private Drawable J;
    private ColorStateList K;
    private float L;
    private boolean M;
    private Drawable N;
    private ColorStateList O;
    private float P;
    private boolean Q;
    private Drawable R;
    private ColorStateList S;
    private float T;
    private float U;
    private float V;
    private float W;
    private final Context X;
    private final Paint Y;
    private final Paint.FontMetrics Z;
    private final RectF aa;
    private final PointF ab;
    private final Path ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private boolean ai;
    private int aj;
    private int ak;
    private ColorFilter al;
    private PorterDuffColorFilter am;
    private ColorStateList an;
    private PorterDuff.Mode ao;
    private int[] ap;
    private WeakReference aq;
    private boolean ar;
    public float b;
    public ColorStateList c;
    public CharSequence d;
    public boolean e;
    public Drawable f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final fju l;
    public TextUtils.TruncateAt m;
    public boolean n;
    public int o;
    public static final int[] a = {R.attr.state_enabled};
    private static final ShapeDrawable C = new ShapeDrawable(new OvalShape());

    private fgy(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.F = -1.0f;
        this.Y = new Paint(1);
        this.Z = new Paint.FontMetrics();
        this.aa = new RectF();
        this.ab = new PointF();
        this.ac = new Path();
        this.ak = 255;
        this.ao = PorterDuff.Mode.SRC_IN;
        this.aq = new WeakReference(null);
        J(context);
        this.X = context;
        fju fjuVar = new fju(this);
        this.l = fjuVar;
        this.d = "";
        fjuVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = a;
        setState(iArr);
        r(iArr);
        this.n = true;
        C.setTint(-1);
    }

    private final float Y() {
        Drawable drawable = this.ai ? this.R : this.J;
        float f = this.L;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private final ColorFilter Z() {
        ColorFilter colorFilter = this.al;
        return colorFilter != null ? colorFilter : this.am;
    }

    private final void aa(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f) {
            drawable.setTintList(this.O);
            if (drawable.isStateful()) {
                drawable.setState(this.ap);
                return;
            }
            return;
        }
        Drawable drawable2 = this.J;
        if (drawable == drawable2 && this.M) {
            drawable2.setTintList(this.K);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private final void ab(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ag() || af()) {
            float f = this.h + this.T;
            float Y = Y();
            if (getLayoutDirection() == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + Y;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - Y;
            }
            Drawable drawable = this.ai ? this.R : this.J;
            float f2 = this.L;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) Math.ceil(fik.c(this.X, 24));
                if (drawable.getIntrinsicHeight() <= f2) {
                    f2 = drawable.getIntrinsicHeight();
                }
            }
            rectF.top = rect.exactCenterY() - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    private final boolean ac() {
        return this.Q && this.R != null && this.g;
    }

    private static boolean ad(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private final boolean ae(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.D;
        int z3 = z(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.ad) : 0);
        boolean z4 = true;
        if (this.ad != z3) {
            this.ad = z3;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.E;
        int z5 = z(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.ae) : 0);
        if (this.ae != z5) {
            this.ae = z5;
            onStateChange = true;
        }
        int b = va.b(z5, z3);
        if ((this.af != b) | (C() == null)) {
            this.af = b;
            M(ColorStateList.valueOf(b));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.G;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.ag) : 0;
        if (this.ag != colorForState) {
            this.ag = colorForState;
            onStateChange = true;
        }
        fmo fmoVar = this.l.e;
        int colorForState2 = (fmoVar == null || (colorStateList = fmoVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.ah);
        if (this.ah != colorForState2) {
            this.ah = colorForState2;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int i = 0;
            while (true) {
                if (i >= state.length) {
                    break;
                }
                if (state[i] != 16842912) {
                    i++;
                } else if (this.g) {
                    z = true;
                }
            }
        }
        z = false;
        if (this.ai == z || this.R == null) {
            z2 = false;
        } else {
            float a2 = a();
            this.ai = z;
            if (a2 != a()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.an;
        int colorForState3 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.aj) : 0;
        if (this.aj != colorForState3) {
            this.aj = colorForState3;
            this.am = fhr.c(this, this.an, this.ao);
        } else {
            z4 = onStateChange;
        }
        if (q(this.J)) {
            z4 |= this.J.setState(iArr);
        }
        if (q(this.R)) {
            z4 |= this.R.setState(iArr);
        }
        if (q(this.f)) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArr3 = new int[length + length2];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            System.arraycopy(iArr2, 0, iArr3, length, length2);
            z4 |= this.f.setState(iArr3);
        }
        if (q(this.N)) {
            z4 |= this.N.setState(iArr2);
        }
        if (z4) {
            invalidateSelf();
        }
        if (z2) {
            h();
        }
        return z4;
    }

    private final boolean af() {
        return this.Q && this.R != null && this.ai;
    }

    private final boolean ag() {
        return this.I && this.J != null;
    }

    private final boolean ah() {
        return this.e && this.f != null;
    }

    private static final void ai(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fgy f(Context context, AttributeSet attributeSet, int i, int i2) {
        TextUtils.TruncateAt truncateAt;
        Drawable f;
        Drawable k;
        float dimension;
        Drawable f2;
        Drawable e;
        ColorStateList e2;
        float dimension2;
        boolean z;
        Drawable f3;
        float dimension3;
        float dimension4;
        float dimension5;
        float dimension6;
        float dimension7;
        float dimension8;
        float dimension9;
        float dimension10;
        ColorStateList e3;
        int resourceId;
        fgy fgyVar = new fgy(context, attributeSet, i, i2);
        Context context2 = fgyVar.X;
        TypedArray a2 = fjw.a(context2, attributeSet, fha.a, i, i2, new int[0]);
        fgyVar.ar = a2.hasValue(39);
        ColorStateList e4 = fny.e(context2, a2, 25);
        if (fgyVar.D != e4) {
            fgyVar.D = e4;
            fgyVar.onStateChange(fgyVar.getState());
        }
        ColorStateList e5 = fny.e(context2, a2, 12);
        if (fgyVar.E != e5) {
            fgyVar.E = e5;
            fgyVar.onStateChange(fgyVar.getState());
        }
        float dimension11 = a2.getDimension(20, 0.0f);
        if (fgyVar.b != dimension11) {
            fgyVar.b = dimension11;
            fgyVar.invalidateSelf();
            fgyVar.h();
        }
        if (a2.hasValue(13)) {
            float dimension12 = a2.getDimension(13, 0.0f);
            if (fgyVar.F != dimension12) {
                fgyVar.F = dimension12;
                fgyVar.bz(fgyVar.F().c(dimension12));
            }
        }
        ColorStateList e6 = fny.e(context2, a2, 23);
        if (fgyVar.G != e6) {
            fgyVar.G = e6;
            if (fgyVar.ar) {
                fgyVar.T(e6);
            }
            fgyVar.onStateChange(fgyVar.getState());
        }
        float dimension13 = a2.getDimension(24, 0.0f);
        if (fgyVar.H != dimension13) {
            fgyVar.H = dimension13;
            fgyVar.Y.setStrokeWidth(dimension13);
            if (fgyVar.ar) {
                super.U(dimension13);
            }
            fgyVar.invalidateSelf();
        }
        ColorStateList e7 = fny.e(context2, a2, 38);
        if (fgyVar.c != e7) {
            fgyVar.c = e7;
            fgyVar.onStateChange(fgyVar.getState());
        }
        fgyVar.n(a2.getText(5));
        fmo fmoVar = (!a2.hasValue(0) || (resourceId = a2.getResourceId(0, 0)) == 0) ? null : new fmo(context2, resourceId);
        fmoVar.l = a2.getDimension(1, fmoVar.l);
        int d = fny.d(a2, 34, 7);
        if (a2.hasValue(d)) {
            fmoVar.c = a2.getString(d);
        }
        fgyVar.o(fmoVar);
        int i3 = a2.getInt(3, 0);
        if (i3 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    truncateAt = TextUtils.TruncateAt.END;
                }
                fgyVar.k(a2.getBoolean(19, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                    fgyVar.k(a2.getBoolean(16, false));
                }
                f = fny.f(context2, a2, 15);
                Drawable drawable = fgyVar.J;
                k = drawable == null ? pj.k(drawable) : null;
                if (k != f) {
                    float a3 = fgyVar.a();
                    fgyVar.J = f != null ? f.mutate() : null;
                    float a4 = fgyVar.a();
                    ai(k);
                    if (fgyVar.ag()) {
                        fgyVar.aa(fgyVar.J);
                    }
                    fgyVar.invalidateSelf();
                    if (a3 != a4) {
                        fgyVar.h();
                    }
                }
                if (a2.hasValue(18)) {
                    ColorStateList e8 = fny.e(context2, a2, 18);
                    fgyVar.M = true;
                    if (fgyVar.K != e8) {
                        fgyVar.K = e8;
                        if (fgyVar.ag()) {
                            fgyVar.J.setTintList(e8);
                        }
                        fgyVar.onStateChange(fgyVar.getState());
                    }
                }
                dimension = a2.getDimension(17, -1.0f);
                if (fgyVar.L != dimension) {
                    float a5 = fgyVar.a();
                    fgyVar.L = dimension;
                    float a6 = fgyVar.a();
                    fgyVar.invalidateSelf();
                    if (a5 != a6) {
                        fgyVar.h();
                    }
                }
                fgyVar.l(a2.getBoolean(32, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                    fgyVar.l(a2.getBoolean(27, false));
                }
                f2 = fny.f(context2, a2, 26);
                e = fgyVar.e();
                if (e != f2) {
                    float b = fgyVar.b();
                    fgyVar.f = f2 != null ? f2.mutate() : null;
                    RippleDrawable rippleDrawable = new RippleDrawable(fmq.b(fgyVar.c), fgyVar.f, C);
                    FocusRingDrawable.a(context2, rippleDrawable, null);
                    fgyVar.N = rippleDrawable;
                    float b2 = fgyVar.b();
                    ai(e);
                    if (fgyVar.ah()) {
                        fgyVar.aa(fgyVar.f);
                    }
                    fgyVar.invalidateSelf();
                    if (b != b2) {
                        fgyVar.h();
                    }
                }
                e2 = fny.e(context2, a2, 31);
                if (fgyVar.O != e2) {
                    fgyVar.O = e2;
                    if (fgyVar.ah()) {
                        fgyVar.f.setTintList(e2);
                    }
                    fgyVar.onStateChange(fgyVar.getState());
                }
                dimension2 = a2.getDimension(29, 0.0f);
                if (fgyVar.P != dimension2) {
                    fgyVar.P = dimension2;
                    fgyVar.invalidateSelf();
                    if (fgyVar.ah()) {
                        fgyVar.h();
                    }
                }
                z = a2.getBoolean(6, false);
                if (fgyVar.g != z) {
                    fgyVar.g = z;
                    float a7 = fgyVar.a();
                    if (!z && fgyVar.ai) {
                        fgyVar.ai = false;
                    }
                    float a8 = fgyVar.a();
                    fgyVar.invalidateSelf();
                    if (a7 != a8) {
                        fgyVar.h();
                    }
                }
                fgyVar.j(a2.getBoolean(11, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                    fgyVar.j(a2.getBoolean(9, false));
                }
                f3 = fny.f(context2, a2, 8);
                if (fgyVar.R != f3) {
                    float a9 = fgyVar.a();
                    fgyVar.R = f3;
                    float a10 = fgyVar.a();
                    ai(fgyVar.R);
                    fgyVar.aa(fgyVar.R);
                    fgyVar.invalidateSelf();
                    if (a9 != a10) {
                        fgyVar.h();
                    }
                }
                if (a2.hasValue(10) && fgyVar.S != (e3 = fny.e(context2, a2, 10))) {
                    fgyVar.S = e3;
                    if (fgyVar.ac()) {
                        fgyVar.R.setTintList(e3);
                    }
                    fgyVar.onStateChange(fgyVar.getState());
                }
                few.a(context2, a2, 41);
                few.a(context2, a2, 35);
                dimension3 = a2.getDimension(22, 0.0f);
                if (fgyVar.h != dimension3) {
                    fgyVar.h = dimension3;
                    fgyVar.invalidateSelf();
                    fgyVar.h();
                }
                dimension4 = a2.getDimension(37, 0.0f);
                if (fgyVar.T != dimension4) {
                    float a11 = fgyVar.a();
                    fgyVar.T = dimension4;
                    float a12 = fgyVar.a();
                    fgyVar.invalidateSelf();
                    if (a11 != a12) {
                        fgyVar.h();
                    }
                }
                dimension5 = a2.getDimension(36, 0.0f);
                if (fgyVar.U != dimension5) {
                    float a13 = fgyVar.a();
                    fgyVar.U = dimension5;
                    float a14 = fgyVar.a();
                    fgyVar.invalidateSelf();
                    if (a13 != a14) {
                        fgyVar.h();
                    }
                }
                dimension6 = a2.getDimension(43, 0.0f);
                if (fgyVar.i != dimension6) {
                    fgyVar.i = dimension6;
                    fgyVar.invalidateSelf();
                    fgyVar.h();
                }
                dimension7 = a2.getDimension(42, 0.0f);
                if (fgyVar.j != dimension7) {
                    fgyVar.j = dimension7;
                    fgyVar.invalidateSelf();
                    fgyVar.h();
                }
                dimension8 = a2.getDimension(30, 0.0f);
                if (fgyVar.V != dimension8) {
                    fgyVar.V = dimension8;
                    fgyVar.invalidateSelf();
                    if (fgyVar.ah()) {
                        fgyVar.h();
                    }
                }
                dimension9 = a2.getDimension(28, 0.0f);
                if (fgyVar.W != dimension9) {
                    fgyVar.W = dimension9;
                    fgyVar.invalidateSelf();
                    if (fgyVar.ah()) {
                        fgyVar.h();
                    }
                }
                dimension10 = a2.getDimension(14, 0.0f);
                if (fgyVar.k != dimension10) {
                    fgyVar.k = dimension10;
                    fgyVar.invalidateSelf();
                    fgyVar.h();
                }
                fgyVar.o = a2.getDimensionPixelSize(4, Integer.MAX_VALUE);
                a2.recycle();
                return fgyVar;
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        fgyVar.m = truncateAt;
        fgyVar.k(a2.getBoolean(19, false));
        if (attributeSet != null) {
            fgyVar.k(a2.getBoolean(16, false));
        }
        f = fny.f(context2, a2, 15);
        Drawable drawable2 = fgyVar.J;
        if (drawable2 == null) {
        }
        if (k != f) {
        }
        if (a2.hasValue(18)) {
        }
        dimension = a2.getDimension(17, -1.0f);
        if (fgyVar.L != dimension) {
        }
        fgyVar.l(a2.getBoolean(32, false));
        if (attributeSet != null) {
            fgyVar.l(a2.getBoolean(27, false));
        }
        f2 = fny.f(context2, a2, 26);
        e = fgyVar.e();
        if (e != f2) {
        }
        e2 = fny.e(context2, a2, 31);
        if (fgyVar.O != e2) {
        }
        dimension2 = a2.getDimension(29, 0.0f);
        if (fgyVar.P != dimension2) {
        }
        z = a2.getBoolean(6, false);
        if (fgyVar.g != z) {
        }
        fgyVar.j(a2.getBoolean(11, false));
        if (attributeSet != null) {
            fgyVar.j(a2.getBoolean(9, false));
        }
        f3 = fny.f(context2, a2, 8);
        if (fgyVar.R != f3) {
        }
        if (a2.hasValue(10)) {
            fgyVar.S = e3;
            if (fgyVar.ac()) {
            }
            fgyVar.onStateChange(fgyVar.getState());
        }
        few.a(context2, a2, 41);
        few.a(context2, a2, 35);
        dimension3 = a2.getDimension(22, 0.0f);
        if (fgyVar.h != dimension3) {
        }
        dimension4 = a2.getDimension(37, 0.0f);
        if (fgyVar.T != dimension4) {
        }
        dimension5 = a2.getDimension(36, 0.0f);
        if (fgyVar.U != dimension5) {
        }
        dimension6 = a2.getDimension(43, 0.0f);
        if (fgyVar.i != dimension6) {
        }
        dimension7 = a2.getDimension(42, 0.0f);
        if (fgyVar.j != dimension7) {
        }
        dimension8 = a2.getDimension(30, 0.0f);
        if (fgyVar.V != dimension8) {
        }
        dimension9 = a2.getDimension(28, 0.0f);
        if (fgyVar.W != dimension9) {
        }
        dimension10 = a2.getDimension(14, 0.0f);
        if (fgyVar.k != dimension10) {
        }
        fgyVar.o = a2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        a2.recycle();
        return fgyVar;
    }

    public static boolean q(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final float a() {
        if (ag() || af()) {
            return this.T + Y() + this.U;
        }
        return 0.0f;
    }

    public final float b() {
        if (ah()) {
            return this.V + this.P + this.W;
        }
        return 0.0f;
    }

    public final float c() {
        return this.ar ? w() : this.F;
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.ak) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.ak);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        if (!this.ar) {
            Paint paint = this.Y;
            paint.setColor(this.ad);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = this.aa;
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, c(), c(), paint);
        }
        if (!this.ar) {
            Paint paint2 = this.Y;
            paint2.setColor(this.ae);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColorFilter(Z());
            RectF rectF2 = this.aa;
            rectF2.set(bounds);
            canvas2.drawRoundRect(rectF2, c(), c(), paint2);
        }
        if (this.ar) {
            super.draw(canvas);
        }
        if (this.H <= 0.0f || this.ar) {
            f = 2.0f;
        } else {
            Paint paint3 = this.Y;
            paint3.setColor(this.ag);
            paint3.setStyle(Paint.Style.STROKE);
            if (!this.ar) {
                paint3.setColorFilter(Z());
            }
            RectF rectF3 = this.aa;
            f = 2.0f;
            rectF3.set(bounds.left + (this.H / 2.0f), bounds.top + (this.H / 2.0f), bounds.right - (this.H / 2.0f), bounds.bottom - (this.H / 2.0f));
            float f2 = this.F - (this.H / 2.0f);
            canvas2.drawRoundRect(rectF3, f2, f2, paint3);
        }
        Paint paint4 = this.Y;
        paint4.setColor(0);
        paint4.setStyle(Paint.Style.FILL);
        RectF rectF4 = this.aa;
        rectF4.set(bounds);
        if (this.ar) {
            RectF rectF5 = new RectF(bounds);
            Path path = this.ac;
            G(rectF5, path);
            super.H(canvas2, paint4, path, this.p.a.a(), this.z, D());
        } else {
            canvas2.drawRoundRect(rectF4, c(), c(), paint4);
        }
        if (ag()) {
            ab(bounds, rectF4);
            float f3 = rectF4.left;
            float f4 = rectF4.top;
            canvas2.translate(f3, f4);
            this.J.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.J.draw(canvas2);
            canvas2.translate(-f3, -f4);
        }
        if (af()) {
            ab(bounds, rectF4);
            float f5 = rectF4.left;
            float f6 = rectF4.top;
            canvas2.translate(f5, f6);
            this.R.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.R.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (this.n && this.d != null) {
            PointF pointF = this.ab;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.d != null) {
                float a2 = this.h + a() + this.i;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + a2;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - a2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                fju fjuVar = this.l;
                Paint.FontMetrics fontMetrics = this.Z;
                fjuVar.a.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF4.setEmpty();
            if (this.d != null) {
                float a3 = this.h + a() + this.i;
                float b = this.k + b() + this.j;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + a3;
                    rectF4.right = bounds.right - b;
                } else {
                    rectF4.left = bounds.left + b;
                    rectF4.right = bounds.right - a3;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            fju fjuVar2 = this.l;
            if (fjuVar2.e != null) {
                TextPaint textPaint = fjuVar2.a;
                textPaint.drawableState = getState();
                fjuVar2.e.c(this.X, textPaint, fjuVar2.b);
            }
            TextPaint textPaint2 = fjuVar2.a;
            textPaint2.setTextAlign(align);
            boolean z = Math.round(fjuVar2.a(this.d.toString())) > Math.round(rectF4.width());
            if (z) {
                int save = canvas2.save();
                canvas2.clipRect(rectF4);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence = this.d;
            if (z && this.m != null) {
                charSequence = TextUtils.ellipsize(charSequence, textPaint2, rectF4.width(), this.m);
            }
            canvas.drawText(charSequence, 0, charSequence.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z) {
                canvas2.restoreToCount(i3);
            }
        }
        if (ah()) {
            rectF4.setEmpty();
            if (ah()) {
                float f7 = this.k + this.W;
                if (getLayoutDirection() == 0) {
                    rectF4.right = bounds.right - f7;
                    rectF4.left = rectF4.right - this.P;
                } else {
                    rectF4.left = bounds.left + f7;
                    rectF4.right = rectF4.left + this.P;
                }
                rectF4.top = bounds.exactCenterY() - (this.P / f);
                rectF4.bottom = rectF4.top + this.P;
            }
            float f8 = rectF4.left;
            float f9 = rectF4.top;
            canvas2.translate(f8, f9);
            this.f.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.N.setBounds(this.f.getBounds());
            this.N.jumpToCurrentState();
            this.N.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.ak < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final Drawable e() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return pj.k(drawable);
        }
        return null;
    }

    public final fmo g() {
        return this.l.e;
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.ak;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.al;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.h + a() + this.i + this.l.a(this.d.toString()) + this.j + b() + this.k), this.o);
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.ar) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.F);
        } else {
            outline.setRoundRect(bounds, this.F);
            outline2 = outline;
        }
        outline2.setAlpha(this.ak / 255.0f);
    }

    protected final void h() {
        fgx fgxVar = (fgx) this.aq.get();
        if (fgxVar != null) {
            fgxVar.c();
        }
    }

    @Override // defpackage.fjt
    public final void i() {
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (ad(this.D) || ad(this.E) || ad(this.G)) {
            return true;
        }
        fmo fmoVar = this.l.e;
        return !(fmoVar == null || (colorStateList = fmoVar.k) == null || !colorStateList.isStateful()) || ac() || q(this.J) || q(this.R) || ad(this.an);
    }

    public final void j(boolean z) {
        if (this.Q != z) {
            boolean af = af();
            this.Q = z;
            boolean af2 = af();
            if (af != af2) {
                Drawable drawable = this.R;
                if (af2) {
                    aa(drawable);
                } else {
                    ai(drawable);
                }
                invalidateSelf();
                h();
            }
        }
    }

    public final void k(boolean z) {
        if (this.I != z) {
            boolean ag = ag();
            this.I = z;
            boolean ag2 = ag();
            if (ag != ag2) {
                Drawable drawable = this.J;
                if (ag2) {
                    aa(drawable);
                } else {
                    ai(drawable);
                }
                invalidateSelf();
                h();
            }
        }
    }

    public final void l(boolean z) {
        if (this.e != z) {
            boolean ah = ah();
            this.e = z;
            boolean ah2 = ah();
            if (ah != ah2) {
                Drawable drawable = this.f;
                if (ah2) {
                    aa(drawable);
                } else {
                    ai(drawable);
                }
                invalidateSelf();
                h();
            }
        }
    }

    public final void m(fgx fgxVar) {
        this.aq = new WeakReference(fgxVar);
    }

    public final void n(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.d, charSequence)) {
            return;
        }
        this.d = charSequence;
        this.l.c = true;
        invalidateSelf();
        h();
    }

    public final void o(fmo fmoVar) {
        fju fjuVar = this.l;
        if (fjuVar.e != fmoVar) {
            fjuVar.e = fmoVar;
            if (fmoVar != null) {
                Context context = this.X;
                TextPaint textPaint = fjuVar.a;
                fmp fmpVar = fjuVar.b;
                fmoVar.d(context, textPaint, fmpVar);
                fjt fjtVar = (fjt) fjuVar.d.get();
                if (fjtVar != null) {
                    textPaint.drawableState = fjtVar.getState();
                }
                fmoVar.c(context, textPaint, fmpVar);
                fjuVar.c = true;
            }
            fjt fjtVar2 = (fjt) fjuVar.d.get();
            if (fjtVar2 != null) {
                fjtVar2.i();
                fjtVar2.onStateChange(fjtVar2.getState());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (ag()) {
            onLayoutDirectionChanged |= this.J.setLayoutDirection(i);
        }
        if (af()) {
            onLayoutDirectionChanged |= this.R.setLayoutDirection(i);
        }
        if (ah()) {
            onLayoutDirectionChanged |= this.f.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (ag()) {
            onLevelChange |= this.J.setLevel(i);
        }
        if (af()) {
            onLevelChange |= this.R.setLevel(i);
        }
        if (ah()) {
            onLevelChange |= this.f.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable, defpackage.fjt
    public final boolean onStateChange(int[] iArr) {
        if (this.ar) {
            super.onStateChange(iArr);
        }
        return ae(iArr, this.ap);
    }

    public final void p(int i) {
        o(new fmo(this.X, i));
    }

    public final boolean r(int[] iArr) {
        if (Arrays.equals(this.ap, iArr)) {
            return false;
        }
        this.ap = iArr;
        if (ah()) {
            return ae(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.ak != i) {
            this.ak = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.al != colorFilter) {
            this.al = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.an != colorStateList) {
            this.an = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.fob, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.ao != mode) {
            this.ao = mode;
            this.am = fhr.c(this, this.an, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (ag()) {
            visible |= this.J.setVisible(z, z2);
        }
        if (af()) {
            visible |= this.R.setVisible(z, z2);
        }
        if (ah()) {
            visible |= this.f.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
