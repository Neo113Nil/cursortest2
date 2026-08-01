package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.luckyarcade.spinthrow.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k0.C0231p;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: g, reason: collision with root package name */
    public static N0 f3275g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f3276a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3277b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f3278c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3279d;

    /* renamed from: e, reason: collision with root package name */
    public C0290u f3280e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f3274f = PorterDuff.Mode.SRC_IN;
    public static final M0 h = new M0(6);

    public static synchronized N0 b() {
        N0 n02;
        synchronized (N0.class) {
            try {
                if (f3275g == null) {
                    f3275g = new N0();
                }
                n02 = f3275g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (N0.class) {
            M0 m0 = h;
            m0.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) m0.a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f3278c == null) {
            this.f3278c = new TypedValue();
        }
        TypedValue typedValue = this.f3278c;
        context.getResources().getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            o.e eVar = (o.e) this.f3277b.get(context);
            drawable = null;
            if (eVar != null) {
                WeakReference weakReference = (WeakReference) eVar.c(j2, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = o.d.b(eVar.f3685b, eVar.f3687d, j2);
                        if (b2 >= 0) {
                            Object[] objArr = eVar.f3686c;
                            Object obj = objArr[b2];
                            Object obj2 = o.e.f3683e;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                eVar.f3684a = true;
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
        if (this.f3280e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165241)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0290u.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0290u.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0290u.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        o.e eVar2 = (o.e) this.f3277b.get(context);
                        if (eVar2 == null) {
                            eVar2 = new o.e();
                            this.f3277b.put(context, eVar2);
                        }
                        eVar2.d(j2, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z2) {
        Drawable a2;
        try {
            if (!this.f3279d) {
                this.f3279d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof C0231p) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.f3279d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i);
            if (a2 == null) {
                a2 = A.a.b(context, i);
            }
            if (a2 != null) {
                a2 = g(context, i, z2, a2);
            }
            if (a2 != null) {
                AbstractC0277n0.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        o.l lVar;
        WeakHashMap weakHashMap = this.f3276a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (o.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i, null);
        if (colorStateList == null) {
            C0290u c0290u = this.f3280e;
            if (c0290u != null) {
                colorStateList2 = c0290u.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f3276a == null) {
                    this.f3276a = new WeakHashMap();
                }
                o.l lVar2 = (o.l) this.f3276a.get(context);
                if (lVar2 == null) {
                    lVar2 = new o.l();
                    this.f3276a.put(context, lVar2);
                }
                lVar2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z2, Drawable drawable) {
        int i2;
        boolean z3;
        int round;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            D.a.h(mutate, f2);
            if (this.f3280e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return mutate;
            }
            D.a.i(mutate, mode);
            return mutate;
        }
        if (this.f3280e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c2 = S0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0292v.f3468b;
                C0290u.e(findDrawableByLayerId, c2, mode2);
                C0290u.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), S0.c(context, R.attr.colorControlNormal), mode2);
                C0290u.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), S0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = S0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0292v.f3468b;
                C0290u.e(findDrawableByLayerId2, b2, mode3);
                C0290u.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), S0.c(context, R.attr.colorControlActivated), mode3);
                C0290u.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), S0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0290u c0290u = this.f3280e;
        boolean z4 = false;
        if (c0290u != null) {
            PorterDuff.Mode mode4 = C0292v.f3468b;
            if (C0290u.a((int[]) c0290u.f3462a, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C0290u.a((int[]) c0290u.f3464c, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C0290u.a((int[]) c0290u.f3465d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165261) {
                    z3 = true;
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    if (z3) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C0292v.c(S0.c(context, i2), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z4 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    z3 = false;
                    round = -1;
                    if (z3) {
                    }
                }
                i2 = 16842801;
            }
            z3 = true;
            round = -1;
            if (z3) {
            }
        }
        if (z4 || !z2) {
            return drawable;
        }
        return null;
    }
}
