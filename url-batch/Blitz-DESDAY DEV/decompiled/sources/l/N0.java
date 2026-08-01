package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.winfour.neondrop.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: g, reason: collision with root package name */
    public static N0 f2910g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2911a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2912b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2913c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public C0212t f2914e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2909f = PorterDuff.Mode.SRC_IN;
    public static final M0 h = new M0(6);

    public static synchronized N0 b() {
        N0 n02;
        synchronized (N0.class) {
            try {
                if (f2910g == null) {
                    f2910g = new N0();
                }
                n02 = f2910g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (N0.class) {
            M0 m02 = h;
            m02.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) m02.a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f2913c == null) {
            this.f2913c = new TypedValue();
        }
        TypedValue typedValue = this.f2913c;
        context.getResources().getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            q.e eVar = (q.e) this.f2912b.get(context);
            drawable = null;
            if (eVar != null) {
                WeakReference weakReference = (WeakReference) eVar.c(j2, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = q.d.b(eVar.f3351b, eVar.d, j2);
                        if (b2 >= 0) {
                            Object[] objArr = eVar.f3352c;
                            Object obj = objArr[b2];
                            Object obj2 = q.e.f3349e;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                eVar.f3350a = true;
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
        if (this.f2914e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165241)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0212t.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0212t.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0212t.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        q.e eVar2 = (q.e) this.f2912b.get(context);
                        if (eVar2 == null) {
                            eVar2 = new q.e();
                            this.f2912b.put(context, eVar2);
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
            if (!this.d) {
                this.d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof n0.p) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i);
            if (a2 == null) {
                a2 = C.a.b(context, i);
            }
            if (a2 != null) {
                a2 = g(context, i, z2, a2);
            }
            if (a2 != null) {
                AbstractC0202n0.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        q.l lVar;
        WeakHashMap weakHashMap = this.f2911a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (q.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i, null);
        if (colorStateList == null) {
            C0212t c0212t = this.f2914e;
            if (c0212t != null) {
                colorStateList2 = c0212t.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f2911a == null) {
                    this.f2911a = new WeakHashMap();
                }
                q.l lVar2 = (q.l) this.f2911a.get(context);
                if (lVar2 == null) {
                    lVar2 = new q.l();
                    this.f2911a.put(context, lVar2);
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
            F.a.h(mutate, f2);
            if (this.f2914e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return mutate;
            }
            F.a.i(mutate, mode);
            return mutate;
        }
        if (this.f2914e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c2 = S0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0214u.f3077b;
                C0212t.e(findDrawableByLayerId, c2, mode2);
                C0212t.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), S0.c(context, R.attr.colorControlNormal), mode2);
                C0212t.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), S0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = S0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0214u.f3077b;
                C0212t.e(findDrawableByLayerId2, b2, mode3);
                C0212t.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), S0.c(context, R.attr.colorControlActivated), mode3);
                C0212t.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), S0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0212t c0212t = this.f2914e;
        boolean z4 = false;
        if (c0212t != null) {
            PorterDuff.Mode mode4 = C0214u.f3077b;
            if (C0212t.a((int[]) c0212t.f3063a, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C0212t.a((int[]) c0212t.f3065c, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C0212t.a((int[]) c0212t.d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165261) {
                    z3 = true;
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    if (z3) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C0214u.c(S0.c(context, i2), mode4));
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
