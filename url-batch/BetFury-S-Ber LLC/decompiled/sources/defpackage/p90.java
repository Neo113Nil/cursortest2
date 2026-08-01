package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.trembin.nirefon.betfury.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class p90 {
    public static p90 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public z4 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final o90 h = new o90(6);

    public static synchronized p90 b() {
        p90 p90Var;
        synchronized (p90.class) {
            try {
                if (g == null) {
                    g = new p90();
                }
                p90Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p90Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (p90.class) {
            o90 o90Var = h;
            o90Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) o90Var.f(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        LayerDrawable layerDrawable;
        Drawable newDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            ez ezVar = (ez) this.b.get(context);
            layerDrawable = null;
            if (ezVar != null) {
                WeakReference weakReference = (WeakReference) ezVar.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int d = gk0.d(ezVar.g, ezVar.i, j);
                        if (d >= 0) {
                            Object[] objArr = ezVar.h;
                            Object obj = objArr[d];
                            Object obj2 = bi.i;
                            if (obj != obj2) {
                                objArr[d] = obj2;
                                ezVar.f = true;
                            }
                        }
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165242)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = z4.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = z4.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = z4.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 == null) {
                    return layerDrawable;
                }
                ez ezVar2 = (ez) this.b.get(context);
                if (ezVar2 == null) {
                    ezVar2 = new ez();
                    this.b.put(context, ezVar2);
                }
                ezVar2.d(j, new WeakReference(constantState2));
                return layerDrawable;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable a;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c = c(context, R.drawable.abc_vector_test);
                if (c == null || (!(c instanceof jl0) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a = a(context, i);
            if (a == null) {
                a = context.getDrawable(i);
            }
            if (a != null) {
                a = g(context, i, z, a);
            }
            if (a != null) {
                rk.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        ne0 ne0Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (ne0Var = (ne0) weakHashMap.get(context)) == null) ? null : (ColorStateList) ne0Var.b(i);
        if (colorStateList == null) {
            z4 z4Var = this.e;
            if (z4Var != null) {
                colorStateList2 = z4Var.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                ne0 ne0Var2 = (ne0) this.a.get(context);
                if (ne0Var2 == null) {
                    ne0Var2 = new ne0();
                    this.a.put(context, ne0Var2);
                }
                ne0Var2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int round;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        z4 z4Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (z4Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = yh0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = a5.b;
                z4.e(findDrawableByLayerId, c, mode2);
                z4.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), yh0.c(context, R.attr.colorControlNormal), mode2);
                z4.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), yh0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = yh0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = a5.b;
                z4.e(findDrawableByLayerId2, b, mode3);
                z4.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), yh0.c(context, R.attr.colorControlActivated), mode3);
                z4.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), yh0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        z4 z4Var2 = this.e;
        boolean z3 = false;
        if (z4Var2 != null) {
            PorterDuff.Mode mode4 = a5.b;
            if (!z4.a((int[]) z4Var2.a, i)) {
                if (z4.a((int[]) z4Var2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean a = z4.a((int[]) z4Var2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (a) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131165262) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(a5.c(yh0.c(context, i2), mode4));
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z3 = true;
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z2 = false;
                        i2 = 0;
                        round = -1;
                        if (z2) {
                        }
                    }
                }
            }
            z2 = true;
            round = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
