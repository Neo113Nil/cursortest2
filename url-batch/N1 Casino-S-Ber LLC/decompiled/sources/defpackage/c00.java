package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.derinko.gbini.n1casino.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class c00 {
    public static c00 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public n1 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final b00 h = new b00(6);

    public static synchronized c00 b() {
        c00 c00Var;
        synchronized (c00.class) {
            try {
                if (g == null) {
                    g = new c00();
                }
                c00Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c00Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (c00.class) {
            b00 b00Var = h;
            b00Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) b00Var.h(Integer.valueOf(mode.hashCode() + i2));
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
            hr hrVar = (hr) this.b.get(context);
            layerDrawable = null;
            if (hrVar != null) {
                WeakReference weakReference = (WeakReference) hrVar.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int j2 = jw.j(hrVar.g, hrVar.i, j);
                        if (j2 >= 0) {
                            Object[] objArr = hrVar.h;
                            Object obj = objArr[j2];
                            Object obj2 = jw.i;
                            if (obj != obj2) {
                                objArr[j2] = obj2;
                                hrVar.f = true;
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
                layerDrawable = n1.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = n1.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = n1.c(this, context, R.dimen.abc_star_small);
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
                hr hrVar2 = (hr) this.b.get(context);
                if (hrVar2 == null) {
                    hrVar2 = new hr();
                    this.b.put(context, hrVar2);
                }
                hrVar2.d(j, new WeakReference(constantState2));
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
                if (c == null || (!(c instanceof b80) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
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
                fg.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        i30 i30Var;
        Object obj;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (i30Var = (i30) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int i2 = jw.i(i30Var.h, i, i30Var.f);
            if (i2 < 0 || (obj = i30Var.g[i2]) == e70.h) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            n1 n1Var = this.e;
            if (n1Var != null) {
                colorStateList2 = n1Var.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                i30 i30Var2 = (i30) this.a.get(context);
                if (i30Var2 == null) {
                    i30Var2 = new i30();
                    this.a.put(context, i30Var2);
                }
                i30Var2.a(i, colorStateList2);
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
        n1 n1Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (n1Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = s50.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = h4.b;
                n1.e(findDrawableByLayerId, c, mode2);
                n1.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), s50.c(context, R.attr.colorControlNormal), mode2);
                n1.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), s50.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = s50.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = h4.b;
                n1.e(findDrawableByLayerId2, b, mode3);
                n1.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), s50.c(context, R.attr.colorControlActivated), mode3);
                n1.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), s50.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        n1 n1Var2 = this.e;
        boolean z3 = false;
        if (n1Var2 != null) {
            PorterDuff.Mode mode4 = h4.b;
            if (!n1.a((int[]) n1Var2.a, i)) {
                if (n1.a((int[]) n1Var2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean a = n1.a((int[]) n1Var2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (a) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131165262) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(h4.c(s50.c(context, i2), mode4));
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
