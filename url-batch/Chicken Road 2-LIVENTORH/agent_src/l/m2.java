package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.oriondriftchasers.arordrft.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: g, reason: collision with root package name */
    public static m2 f2389g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2391a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2392b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2393c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public t f2394e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2388f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final l2 f2390h = new l2(6);

    public static synchronized m2 b() {
        m2 m2Var;
        synchronized (m2.class) {
            try {
                if (f2389g == null) {
                    f2389g = new m2();
                }
                m2Var = f2389g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m2Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (m2.class) {
            l2 l2Var = f2390h;
            l2Var.getClass();
            int i4 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) l2Var.f(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f2393c == null) {
            this.f2393c = new TypedValue();
        }
        TypedValue typedValue = this.f2393c;
        context.getResources().getValue(i, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            q.h hVar = (q.h) this.f2392b.get(context);
            drawable = null;
            if (hVar != null) {
                WeakReference weakReference = (WeakReference) hVar.b(j4);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b4 = r.a.b(hVar.f3030g, hVar.i, j4);
                        if (b4 >= 0) {
                            Object[] objArr = hVar.f3031h;
                            Object obj = objArr[b4];
                            Object obj2 = q.i.f3032a;
                            if (obj != obj2) {
                                objArr[b4] = obj2;
                                hVar.f3029f = true;
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
        if (this.f2394e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165242)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = t.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = t.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = t.c(this, context, R.dimen.abc_star_small);
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
                    q.h hVar2 = (q.h) this.f2392b.get(context);
                    if (hVar2 == null) {
                        hVar2 = new q.h();
                        this.f2392b.put(context, hVar2);
                    }
                    hVar2.d(j4, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z3) {
        Drawable a2;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c4 = c(context, R.drawable.abc_vector_test);
                if (c4 == null || (!(c4 instanceof k1.p) && !"android.graphics.drawable.VectorDrawable".equals(c4.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i);
            if (a2 == null) {
                a2 = context.getDrawable(i);
            }
            if (a2 != null) {
                a2 = g(context, i, z3, a2);
            }
            if (a2 != null) {
                m1.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        q.k kVar;
        WeakHashMap weakHashMap = this.f2391a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (kVar = (q.k) weakHashMap.get(context)) == null) ? null : (ColorStateList) kVar.b(i);
        if (colorStateList == null) {
            t tVar = this.f2394e;
            if (tVar != null) {
                colorStateList2 = tVar.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f2391a == null) {
                    this.f2391a = new WeakHashMap();
                }
                q.k kVar2 = (q.k) this.f2391a.get(context);
                if (kVar2 == null) {
                    kVar2 = new q.k();
                    this.f2391a.put(context, kVar2);
                }
                kVar2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z3, Drawable drawable) {
        int i4;
        boolean z4;
        int round;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f2);
            if (this.f2394e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.f2394e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c4 = r2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = u.f2465b;
                t.e(findDrawableByLayerId, c4, mode2);
                t.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), r2.c(context, R.attr.colorControlNormal), mode2);
                t.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), r2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b4 = r2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = u.f2465b;
                t.e(findDrawableByLayerId2, b4, mode3);
                t.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), r2.c(context, R.attr.colorControlActivated), mode3);
                t.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), r2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        t tVar = this.f2394e;
        boolean z5 = false;
        if (tVar != null) {
            PorterDuff.Mode mode4 = u.f2465b;
            if (t.a((int[]) tVar.f2454a, i)) {
                i4 = R.attr.colorControlNormal;
            } else if (t.a((int[]) tVar.f2456c, i)) {
                i4 = R.attr.colorControlActivated;
            } else {
                if (t.a((int[]) tVar.d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165262) {
                    round = Math.round(40.8f);
                    i4 = 16842800;
                    z4 = true;
                    if (z4) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(u.c(r2.c(context, i4), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z5 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i4 = 0;
                    z4 = false;
                    round = -1;
                    if (z4) {
                    }
                }
                i4 = 16842801;
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
