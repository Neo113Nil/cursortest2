package q1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.oriondriftchasers.arordrft.R;
import e2.j;
import e2.k;
import e2.o;
import i2.d;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import l2.m;
import l2.n;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends Drawable implements j {

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f3070f;

    /* renamed from: g, reason: collision with root package name */
    public final l2.j f3071g;

    /* renamed from: h, reason: collision with root package name */
    public final k f3072h;
    public final Rect i;

    /* renamed from: j, reason: collision with root package name */
    public final c f3073j;

    /* renamed from: k, reason: collision with root package name */
    public float f3074k;

    /* renamed from: l, reason: collision with root package name */
    public float f3075l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3076m;

    /* renamed from: n, reason: collision with root package name */
    public float f3077n;

    /* renamed from: o, reason: collision with root package name */
    public float f3078o;

    /* renamed from: p, reason: collision with root package name */
    public float f3079p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f3080q;

    /* renamed from: r, reason: collision with root package name */
    public WeakReference f3081r;

    public a(Context context, b bVar) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f3070f = weakReference;
        o.c(context, o.f1235b, "Theme.MaterialComponents");
        this.i = new Rect();
        k kVar = new k(this);
        this.f3072h = kVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = kVar.f1226a;
        textPaint.setTextAlign(align);
        c cVar = new c(context, bVar);
        this.f3073j = cVar;
        boolean f2 = f();
        b bVar2 = cVar.f3103b;
        l2.j jVar = new l2.j(n.a(context, f2 ? bVar2.f3087l.intValue() : bVar2.f3085j.intValue(), f() ? bVar2.f3088m.intValue() : bVar2.f3086k.intValue()).a());
        this.f3071g = jVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && kVar.f1231g != (dVar = new d(context2, bVar2.i.intValue()))) {
            kVar.b(dVar, context2);
            textPaint.setColor(bVar2.f3084h.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = bVar2.f3092q;
        if (i != -2) {
            this.f3076m = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.f3076m = bVar2.f3093r;
        }
        kVar.f1229e = true;
        j();
        invalidateSelf();
        kVar.f1229e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar2.f3083g.intValue());
        if (jVar.f2598g.d != valueOf) {
            jVar.q(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f3084h.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f3080q;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f3080q.get();
            WeakReference weakReference3 = this.f3081r;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(bVar2.f3100y.booleanValue(), false);
    }

    @Override // e2.j
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float f2;
        float f4;
        View view3;
        boolean z3;
        FrameLayout d = d();
        if (d == null) {
            float y3 = view.getY();
            f4 = view.getX();
            view3 = view.getParent();
            f2 = y3;
        } else {
            f2 = 0.0f;
            f4 = 0.0f;
            view3 = d;
        }
        while (true) {
            z3 = view3 instanceof View;
            if (!z3 || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f2 += view4.getY();
            f4 += view4.getX();
            view3 = view3.getParent();
        }
        if (z3) {
            float f5 = (this.f3075l - this.f3079p) + f2;
            float f6 = (this.f3074k - this.f3078o) + f4;
            View view5 = view3;
            float height = ((this.f3075l + this.f3079p) - view5.getHeight()) + f2;
            float width = ((this.f3074k + this.f3078o) - view5.getWidth()) + f4;
            if (f5 < 0.0f) {
                this.f3075l = Math.abs(f5) + this.f3075l;
            }
            if (f6 < 0.0f) {
                this.f3074k = Math.abs(f6) + this.f3074k;
            }
            if (height > 0.0f) {
                this.f3075l -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f3074k -= Math.abs(width);
            }
        }
    }

    public final String c() {
        c cVar = this.f3073j;
        b bVar = cVar.f3103b;
        b bVar2 = cVar.f3103b;
        String str = bVar.f3090o;
        WeakReference weakReference = this.f3070f;
        if (str == null) {
            if (!g()) {
                return null;
            }
            if (this.f3076m == -2 || e() <= this.f3076m) {
                return NumberFormat.getInstance(bVar2.f3094s).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(bVar2.f3094s, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f3076m), "+");
        }
        int i = bVar.f3092q;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.f3081r;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String c4;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f3071g.draw(canvas);
        if (!f() || (c4 = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        k kVar = this.f3072h;
        kVar.f1226a.getTextBounds(c4, 0, c4.length(), rect);
        float exactCenterY = this.f3075l - rect.exactCenterY();
        canvas.drawText(c4, this.f3074k, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), kVar.f1226a);
    }

    public final int e() {
        int i = this.f3073j.f3103b.f3091p;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.f3073j.f3103b.f3090o != null || g();
    }

    public final boolean g() {
        b bVar = this.f3073j.f3103b;
        return bVar.f3090o == null && bVar.f3091p != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3073j.f3103b.f3089n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.f3070f.get();
        if (context == null) {
            return;
        }
        boolean f2 = f();
        c cVar = this.f3073j;
        this.f3071g.setShapeAppearanceModel(n.a(context, f2 ? cVar.f3103b.f3087l.intValue() : cVar.f3103b.f3085j.intValue(), f() ? cVar.f3103b.f3088m.intValue() : cVar.f3103b.f3086k.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f3080q = new WeakReference(view);
        this.f3081r = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        float f2;
        int intValue;
        int intValue2;
        int intValue3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        WeakReference weakReference = this.f3070f;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f3080q;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.i;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f3081r;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean f13 = f();
        c cVar = this.f3073j;
        float f14 = f13 ? cVar.d : cVar.f3104c;
        this.f3077n = f14;
        if (f14 != -1.0f) {
            this.f3078o = f14;
            this.f3079p = f14;
        } else {
            this.f3078o = Math.round((f() ? cVar.f3107g : cVar.f3105e) / 2.0f);
            this.f3079p = Math.round((f() ? cVar.f3108h : cVar.f3106f) / 2.0f);
        }
        if (f()) {
            String c4 = c();
            float f15 = this.f3078o;
            k kVar = this.f3072h;
            if (kVar.f1229e) {
                kVar.a(c4);
                f11 = kVar.f1228c;
            } else {
                f11 = kVar.f1228c;
            }
            this.f3078o = Math.max(f15, (f11 / 2.0f) + cVar.f3103b.f3101z.intValue());
            float f16 = this.f3079p;
            if (kVar.f1229e) {
                kVar.a(c4);
                f12 = kVar.d;
            } else {
                f12 = kVar.d;
            }
            float max = Math.max(f16, (f12 / 2.0f) + cVar.f3103b.A.intValue());
            this.f3079p = max;
            this.f3078o = Math.max(this.f3078o, max);
        }
        b bVar = cVar.f3103b;
        b bVar2 = cVar.f3103b;
        int i = cVar.f3110k;
        int intValue4 = bVar.C.intValue();
        if (f()) {
            intValue4 = bVar.E.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                f2 = -1.0f;
                intValue4 = o1.a.c(intValue4, intValue4 - bVar.H.intValue(), o1.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
                if (i == 0) {
                    intValue4 -= Math.round(this.f3079p);
                }
                intValue = bVar.G.intValue() + intValue4;
                intValue2 = bVar2.f3099x.intValue();
                if (intValue2 != 8388691 || intValue2 == 8388693) {
                    this.f3075l = rect3.bottom - intValue;
                } else {
                    this.f3075l = rect3.top + intValue;
                }
                int intValue5 = !f() ? bVar.D.intValue() : bVar2.B.intValue();
                if (i == 1) {
                    intValue5 += f() ? cVar.f3109j : cVar.i;
                }
                int intValue6 = bVar.F.intValue() + intValue5;
                intValue3 = bVar2.f3099x.intValue();
                if (intValue3 != 8388659 || intValue3 == 8388691) {
                    if (cVar.f3111l != 0) {
                        if (view.getLayoutDirection() == 0) {
                            f4 = rect3.left + this.f3078o;
                            f5 = (this.f3079p * 2.0f) - intValue6;
                            f6 = f4 - f5;
                            this.f3074k = f6;
                        } else {
                            f6 = (rect3.right - this.f3078o) + ((this.f3079p * 2.0f) - intValue6);
                            this.f3074k = f6;
                        }
                    } else if (view.getLayoutDirection() == 0) {
                        f6 = (rect3.left - this.f3078o) + intValue6;
                        this.f3074k = f6;
                    } else {
                        f4 = rect3.right + this.f3078o;
                        f5 = intValue6;
                        f6 = f4 - f5;
                        this.f3074k = f6;
                    }
                } else if (cVar.f3111l == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f8 = rect3.right + this.f3078o;
                        f9 = intValue6;
                        f10 = f8 - f9;
                        this.f3074k = f10;
                    } else {
                        f10 = (rect3.left - this.f3078o) + intValue6;
                        this.f3074k = f10;
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f10 = (rect3.right - this.f3078o) + ((this.f3079p * 2.0f) - intValue6);
                    this.f3074k = f10;
                } else {
                    f8 = rect3.left + this.f3078o;
                    f9 = (this.f3079p * 2.0f) - intValue6;
                    f10 = f8 - f9;
                    this.f3074k = f10;
                }
                if (bVar.I.booleanValue()) {
                    b(view, null);
                } else {
                    ViewParent d = d();
                    if (d == null) {
                        d = view.getParent();
                    }
                    if ((d instanceof View) && (d.getParent() instanceof View)) {
                        b(view, (View) d.getParent());
                    }
                }
                float f17 = this.f3074k;
                float f18 = this.f3075l;
                float f19 = this.f3078o;
                float f20 = this.f3079p;
                rect2.set((int) (f17 - f19), (int) (f18 - f20), (int) (f17 + f19), (int) (f18 + f20));
                f7 = this.f3077n;
                l2.j jVar = this.f3071g;
                if (f7 != f2) {
                    m g4 = jVar.f2598g.f2581a.g();
                    g4.f2621e = new l2.a(f7);
                    g4.f2622f = new l2.a(f7);
                    g4.f2623g = new l2.a(f7);
                    g4.f2624h = new l2.a(f7);
                    jVar.setShapeAppearanceModel(g4.a());
                }
                if (rect.equals(rect2)) {
                    jVar.setBounds(rect2);
                    return;
                }
                return;
            }
        }
        f2 = -1.0f;
        if (i == 0) {
        }
        intValue = bVar.G.intValue() + intValue4;
        intValue2 = bVar2.f3099x.intValue();
        if (intValue2 != 8388691) {
        }
        this.f3075l = rect3.bottom - intValue;
        if (!f()) {
        }
        if (i == 1) {
        }
        int intValue62 = bVar.F.intValue() + intValue5;
        intValue3 = bVar2.f3099x.intValue();
        if (intValue3 != 8388659) {
        }
        if (cVar.f3111l != 0) {
        }
        if (bVar.I.booleanValue()) {
        }
        float f172 = this.f3074k;
        float f182 = this.f3075l;
        float f192 = this.f3078o;
        float f202 = this.f3079p;
        rect2.set((int) (f172 - f192), (int) (f182 - f202), (int) (f172 + f192), (int) (f182 + f202));
        f7 = this.f3077n;
        l2.j jVar2 = this.f3071g;
        if (f7 != f2) {
        }
        if (rect.equals(rect2)) {
        }
    }

    @Override // android.graphics.drawable.Drawable, e2.j
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c cVar = this.f3073j;
        cVar.f3102a.f3089n = i;
        cVar.f3103b.f3089n = i;
        this.f3072h.f1226a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
