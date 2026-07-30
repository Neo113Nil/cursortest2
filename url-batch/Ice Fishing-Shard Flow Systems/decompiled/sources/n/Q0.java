package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC0858a;
import u.AbstractC0937h;
import u.C0936g;
import u.C0940k;
import v.AbstractC0955a;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: g, reason: collision with root package name */
    public static Q0 f6691g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f6693a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f6694b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f6695c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6696d;

    /* renamed from: e, reason: collision with root package name */
    public D6.z f6697e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f6690f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final P0 f6692h = new P0(6);

    public static synchronized Q0 b() {
        Q0 q02;
        synchronized (Q0.class) {
            try {
                if (f6691g == null) {
                    f6691g = new Q0();
                }
                q02 = f6691g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q02;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (Q0.class) {
            P0 p02 = f6692h;
            p02.getClass();
            int i5 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) p02.a(Integer.valueOf(mode.hashCode() + i5));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i2) {
        Drawable drawable;
        Object obj;
        if (this.f6695c == null) {
            this.f6695c = new TypedValue();
        }
        TypedValue typedValue = this.f6695c;
        context.getResources().getValue(i2, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C0936g c0936g = (C0936g) this.f6694b.get(context);
            drawable = null;
            if (c0936g != null) {
                int b7 = AbstractC0955a.b(c0936g.f8032e, c0936g.f8034l, j);
                if (b7 < 0 || (obj = c0936g.f8033i[b7]) == AbstractC0937h.f8035a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b8 = AbstractC0955a.b(c0936g.f8032e, c0936g.f8034l, j);
                        if (b8 >= 0) {
                            Object[] objArr = c0936g.f8033i;
                            Object obj2 = objArr[b8];
                            Object obj3 = AbstractC0937h.f8035a;
                            if (obj2 != obj3) {
                                objArr[b8] = obj3;
                                c0936g.f8031d = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f6697e != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawable = D6.z.k(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = D6.z.k(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = D6.z.k(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    C0936g c0936g2 = (C0936g) this.f6694b.get(context);
                    if (c0936g2 == null) {
                        c0936g2 = new C0936g();
                        this.f6694b.put(context, c0936g2);
                    }
                    c0936g2.a(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2, false);
    }

    public final synchronized Drawable d(Context context, int i2, boolean z7) {
        Drawable a7;
        try {
            if (!this.f6696d) {
                this.f6696d = true;
                Drawable c7 = c(context, R.drawable.abc_vector_test);
                if (c7 == null || (!(c7 instanceof AbstractC0858a) && !"android.graphics.drawable.VectorDrawable".equals(c7.getClass().getName()))) {
                    this.f6696d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a7 = a(context, i2);
            if (a7 == null) {
                a7 = context.getDrawable(i2);
            }
            if (a7 != null) {
                a7 = g(context, i2, z7, a7);
            }
            if (a7 != null) {
                AbstractC0731q0.a(a7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a7;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        C0940k c0940k;
        Object obj;
        WeakHashMap weakHashMap = this.f6693a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (c0940k = (C0940k) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            Intrinsics.checkNotNullParameter(c0940k, "<this>");
            int a7 = AbstractC0955a.a(c0940k.f8048i, i2, c0940k.f8046d);
            if (a7 < 0 || (obj = c0940k.f8047e[a7]) == AbstractC0937h.f8036b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            D6.z zVar = this.f6697e;
            if (zVar != null) {
                colorStateList2 = zVar.l(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f6693a == null) {
                    this.f6693a = new WeakHashMap();
                }
                C0940k c0940k2 = (C0940k) this.f6693a.get(context);
                if (c0940k2 == null) {
                    c0940k2 = new C0940k();
                    this.f6693a.put(context, c0940k2);
                }
                c0940k2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i2, boolean z7, Drawable drawable) {
        boolean z8;
        int round;
        PorterDuffColorFilter e7;
        ColorStateList f7 = f(context, i2);
        PorterDuff.Mode mode = null;
        if (f7 != null) {
            int[] iArr = AbstractC0731q0.f6868a;
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f7);
            if (this.f6697e != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        D6.z zVar = this.f6697e;
        int i5 = R.attr.colorControlNormal;
        if (zVar != null) {
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c7 = i1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0733s.f6879b;
                D6.z.r(findDrawableByLayerId, c7, mode2);
                D6.z.r(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), i1.c(context, R.attr.colorControlNormal), mode2);
                D6.z.r(layerDrawable.findDrawableByLayerId(android.R.id.progress), i1.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b7 = i1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0733s.f6879b;
                D6.z.r(findDrawableByLayerId2, b7, mode3);
                D6.z.r(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), i1.c(context, R.attr.colorControlActivated), mode3);
                D6.z.r(layerDrawable2.findDrawableByLayerId(android.R.id.progress), i1.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        D6.z zVar2 = this.f6697e;
        boolean z9 = false;
        if (zVar2 != null) {
            PorterDuff.Mode mode4 = C0733s.f6879b;
            if (!D6.z.h((int[]) zVar2.f640c, i2)) {
                if (D6.z.h((int[]) zVar2.f641d, i2)) {
                    i5 = R.attr.colorControlActivated;
                } else {
                    boolean h7 = D6.z.h((int[]) zVar2.f642e, i2);
                    i5 = android.R.attr.colorBackground;
                    if (h7) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i2 == 2131165221) {
                        round = Math.round(40.8f);
                        i5 = android.R.attr.colorForeground;
                        z8 = true;
                        if (z8) {
                            int[] iArr2 = AbstractC0731q0.f6868a;
                            Drawable mutate2 = drawable.mutate();
                            int c8 = i1.c(context, i5);
                            synchronized (C0733s.class) {
                                e7 = e(c8, mode4);
                            }
                            mutate2.setColorFilter(e7);
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z9 = true;
                        }
                    } else if (i2 != R.drawable.abc_dialog_material_background) {
                        z8 = false;
                        i5 = 0;
                        round = -1;
                        if (z8) {
                        }
                    }
                }
            }
            z8 = true;
            round = -1;
            if (z8) {
            }
        }
        if (z9 || !z7) {
            return drawable;
        }
        return null;
    }
}
