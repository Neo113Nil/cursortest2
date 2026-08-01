package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.moontiko.really.admiralcasino.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class h30 {
    public static h30 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public o1 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final g30 h = new g30(6);

    public static synchronized h30 b() {
        h30 h30Var;
        synchronized (h30.class) {
            try {
                if (g == null) {
                    g = new h30();
                }
                h30Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h30Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (h30.class) {
            g30 g30Var = h;
            g30Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) g30Var.f(Integer.valueOf(mode.hashCode() + i2));
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
            eu euVar = (eu) this.b.get(context);
            layerDrawable = null;
            if (euVar != null) {
                WeakReference weakReference = (WeakReference) euVar.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int g2 = xf.g(euVar.g, euVar.i, j);
                        if (g2 >= 0) {
                            Object[] objArr = euVar.h;
                            Object obj = objArr[g2];
                            Object obj2 = mz.d;
                            if (obj != obj2) {
                                objArr[g2] = obj2;
                                euVar.f = true;
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
                layerDrawable = o1.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = o1.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = o1.c(this, context, R.dimen.abc_star_small);
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
                eu euVar2 = (eu) this.b.get(context);
                if (euVar2 == null) {
                    euVar2 = new eu();
                    this.b.put(context, euVar2);
                }
                euVar2.d(j, new WeakReference(constantState2));
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
                if (c == null || (!(c instanceof mb0) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
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
                gi.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        k60 k60Var;
        Object obj;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (k60Var = (k60) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int f2 = xf.f(k60Var.h, i, k60Var.f);
            if (f2 < 0 || (obj = k60Var.g[f2]) == mz.f) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            o1 o1Var = this.e;
            if (o1Var != null) {
                colorStateList2 = o1Var.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                k60 k60Var2 = (k60) this.a.get(context);
                if (k60Var2 == null) {
                    k60Var2 = new k60();
                    this.a.put(context, k60Var2);
                }
                k60Var2.a(i, colorStateList2);
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
        o1 o1Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (o1Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = z80.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = r4.b;
                o1.e(findDrawableByLayerId, c, mode2);
                o1.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), z80.c(context, R.attr.colorControlNormal), mode2);
                o1.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), z80.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = z80.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = r4.b;
                o1.e(findDrawableByLayerId2, b, mode3);
                o1.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), z80.c(context, R.attr.colorControlActivated), mode3);
                o1.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), z80.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        o1 o1Var2 = this.e;
        boolean z3 = false;
        if (o1Var2 != null) {
            PorterDuff.Mode mode4 = r4.b;
            if (!o1.a((int[]) o1Var2.a, i)) {
                if (o1.a((int[]) o1Var2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean a = o1.a((int[]) o1Var2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (a) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131165262) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(r4.c(z80.c(context, i2), mode4));
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
