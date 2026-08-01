package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.gglhk.bofio.fortunetiger.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j2 {
    public static j2 g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2563a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2564b = new WeakHashMap(0);
    public TypedValue c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2565d;

    /* renamed from: e, reason: collision with root package name */
    public j3.g f2566e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2562f = PorterDuff.Mode.SRC_IN;
    public static final i2 h = new i2(6);

    public static synchronized j2 b() {
        j2 j2Var;
        synchronized (j2.class) {
            try {
                if (g == null) {
                    g = new j2();
                }
                j2Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (j2.class) {
            i2 i2Var = h;
            i2Var.getClass();
            int i5 = (31 + i4) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) i2Var.f(Integer.valueOf(mode.hashCode() + i5));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i4) {
        Drawable drawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i4, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            n.h hVar = (n.h) this.f2564b.get(context);
            drawable = null;
            if (hVar != null) {
                WeakReference weakReference = (WeakReference) hVar.b(j4);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = o.a.b(hVar.g, hVar.f2932i, j4);
                        if (b2 >= 0) {
                            Object[] objArr = hVar.h;
                            Object obj = objArr[b2];
                            Object obj2 = n.i.f2933a;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                hVar.f2931f = true;
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
        if (this.f2566e != null) {
            if (i4 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165242)});
            } else if (i4 == R.drawable.abc_ratingbar_material) {
                layerDrawable = j3.g.c(this, context, R.dimen.abc_star_big);
            } else if (i4 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = j3.g.c(this, context, R.dimen.abc_star_medium);
            } else if (i4 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = j3.g.c(this, context, R.dimen.abc_star_small);
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
                    n.h hVar2 = (n.h) this.f2564b.get(context);
                    if (hVar2 == null) {
                        hVar2 = new n.h();
                        this.f2564b.put(context, hVar2);
                    }
                    hVar2.d(j4, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i4) {
        return d(context, i4, false);
    }

    public final synchronized Drawable d(Context context, int i4, boolean z3) {
        Drawable a4;
        try {
            if (!this.f2565d) {
                this.f2565d = true;
                Drawable c = c(context, R.drawable.abc_vector_test);
                if (c == null || (!(c instanceof g1.p) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.f2565d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a4 = a(context, i4);
            if (a4 == null) {
                a4 = context.getDrawable(i4);
            }
            if (a4 != null) {
                a4 = g(context, i4, z3, a4);
            }
            if (a4 != null) {
                j1.a(a4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a4;
    }

    public final synchronized ColorStateList f(Context context, int i4) {
        ColorStateList colorStateList;
        n.k kVar;
        WeakHashMap weakHashMap = this.f2563a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (kVar = (n.k) weakHashMap.get(context)) == null) ? null : (ColorStateList) kVar.b(i4);
        if (colorStateList == null) {
            j3.g gVar = this.f2566e;
            if (gVar != null) {
                colorStateList2 = gVar.d(context, i4);
            }
            if (colorStateList2 != null) {
                if (this.f2563a == null) {
                    this.f2563a = new WeakHashMap();
                }
                n.k kVar2 = (n.k) this.f2563a.get(context);
                if (kVar2 == null) {
                    kVar2 = new n.k();
                    this.f2563a.put(context, kVar2);
                }
                kVar2.a(i4, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i4, boolean z3, Drawable drawable) {
        int i5;
        boolean z4;
        int round;
        ColorStateList f4 = f(context, i4);
        PorterDuff.Mode mode = null;
        if (f4 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f4);
            if (this.f2566e != null && i4 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.f2566e != null) {
            if (i4 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = o2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = s.f2640b;
                j3.g.e(findDrawableByLayerId, c, mode2);
                j3.g.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), o2.c(context, R.attr.colorControlNormal), mode2);
                j3.g.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), o2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i4 == R.drawable.abc_ratingbar_material || i4 == R.drawable.abc_ratingbar_indicator_material || i4 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = o2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = s.f2640b;
                j3.g.e(findDrawableByLayerId2, b2, mode3);
                j3.g.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), o2.c(context, R.attr.colorControlActivated), mode3);
                j3.g.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), o2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        j3.g gVar = this.f2566e;
        boolean z5 = false;
        if (gVar != null) {
            PorterDuff.Mode mode4 = s.f2640b;
            if (j3.g.a((int[]) gVar.f2425a, i4)) {
                i5 = R.attr.colorControlNormal;
            } else if (j3.g.a((int[]) gVar.c, i4)) {
                i5 = R.attr.colorControlActivated;
            } else {
                if (j3.g.a((int[]) gVar.f2427d, i4)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i4 == 2131165262) {
                    round = Math.round(40.8f);
                    i5 = 16842800;
                    z4 = true;
                    if (z4) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(s.c(o2.c(context, i5), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z5 = true;
                    }
                } else if (i4 != R.drawable.abc_dialog_material_background) {
                    i5 = 0;
                    z4 = false;
                    round = -1;
                    if (z4) {
                    }
                }
                i5 = 16842801;
            }
            z4 = true;
            round = -1;
            if (z4) {
            }
        }
        if (z5 || !z3) {
            return drawable;
        }
        return null;
    }
}
