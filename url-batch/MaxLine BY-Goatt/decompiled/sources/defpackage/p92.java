package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.majelw.libystne.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p92 {
    public static p92 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public sf e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final o92 h = new o92(6);

    public static synchronized p92 b() {
        p92 p92Var;
        synchronized (p92.class) {
            try {
                if (g == null) {
                    g = new p92();
                }
                p92Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p92Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (p92.class) {
            o92 o92Var = h;
            o92Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) o92Var.c(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        LayerDrawable layerDrawable;
        Object obj;
        Drawable newDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            mg1 mg1Var = (mg1) this.b.get(context);
            layerDrawable = null;
            if (mg1Var != null) {
                int p = yk3.p(mg1Var.n, mg1Var.p, j);
                if (p < 0 || (obj = mg1Var.o[p]) == o70.e) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        mg1Var.d(j);
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
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230738)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = sf.g(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = sf.g(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = sf.g(this, context, R.dimen.abc_star_small);
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
                mg1 mg1Var2 = (mg1) this.b.get(context);
                if (mg1Var2 == null) {
                    mg1Var2 = new mg1();
                    this.b.put(context, mg1Var2);
                }
                mg1Var2.c(j, new WeakReference(constantState2));
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
                if (c == null || !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName())) {
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
                he0.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        yn2 yn2Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (yn2Var = (yn2) weakHashMap.get(context)) == null) ? null : (ColorStateList) yn2Var.c(i);
        if (colorStateList == null) {
            sf sfVar = this.e;
            if (sfVar != null) {
                colorStateList2 = sfVar.h(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                yn2 yn2Var2 = (yn2) this.a.get(context);
                if (yn2Var2 == null) {
                    yn2Var2 = new yn2(0);
                    this.a.put(context, yn2Var2);
                }
                yn2Var2.a(i, colorStateList2);
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
        PorterDuffColorFilter e;
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
        sf sfVar = this.e;
        int i2 = R.attr.colorControlNormal;
        if (sfVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = xw2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = tf.b;
                sf.i(findDrawableByLayerId, c, mode2);
                sf.i(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), xw2.c(context, R.attr.colorControlNormal), mode2);
                sf.i(layerDrawable.findDrawableByLayerId(android.R.id.progress), xw2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = xw2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = tf.b;
                sf.i(findDrawableByLayerId2, b, mode3);
                sf.i(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), xw2.c(context, R.attr.colorControlActivated), mode3);
                sf.i(layerDrawable2.findDrawableByLayerId(android.R.id.progress), xw2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        sf sfVar2 = this.e;
        boolean z3 = false;
        if (sfVar2 != null) {
            PorterDuff.Mode mode4 = tf.b;
            if (!sf.d((int[]) sfVar2.a, i)) {
                if (sf.d((int[]) sfVar2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean d = sf.d((int[]) sfVar2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (d) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230758) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            int c2 = xw2.c(context, i2);
                            synchronized (tf.class) {
                                e = e(c2, mode4);
                            }
                            mutate2.setColorFilter(e);
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
