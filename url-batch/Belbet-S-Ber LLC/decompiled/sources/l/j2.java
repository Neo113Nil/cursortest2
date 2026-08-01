package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.gdmhkmf.belbet.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: g, reason: collision with root package name */
    public static j2 f2486g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2487a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2488b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2489c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public a4.h f2490e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2485f = PorterDuff.Mode.SRC_IN;
    public static final i2 h = new i2(6);

    public static synchronized j2 b() {
        j2 j2Var;
        synchronized (j2.class) {
            try {
                if (f2486g == null) {
                    f2486g = new j2();
                }
                j2Var = f2486g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (j2.class) {
            i2 i2Var = h;
            i2Var.getClass();
            int i4 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) i2Var.f(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f2489c == null) {
            this.f2489c = new TypedValue();
        }
        TypedValue typedValue = this.f2489c;
        context.getResources().getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            q.h hVar = (q.h) this.f2488b.get(context);
            drawable = null;
            if (hVar != null) {
                WeakReference weakReference = (WeakReference) hVar.b(j2);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = r.a.b(hVar.f3111g, hVar.i, j2);
                        if (b2 >= 0) {
                            Object[] objArr = hVar.h;
                            Object obj = objArr[b2];
                            Object obj2 = q.i.f3112a;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                hVar.f3110f = true;
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
        if (this.f2490e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165242)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = a4.h.d(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = a4.h.d(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = a4.h.d(this, context, R.dimen.abc_star_small);
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
                    q.h hVar2 = (q.h) this.f2488b.get(context);
                    if (hVar2 == null) {
                        hVar2 = new q.h();
                        this.f2488b.put(context, hVar2);
                    }
                    hVar2.d(j2, new WeakReference(constantState2));
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

    public final synchronized Drawable d(Context context, int i, boolean z4) {
        Drawable a5;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c5 = c(context, R.drawable.abc_vector_test);
                if (c5 == null || (!(c5 instanceof l1.o) && !"android.graphics.drawable.VectorDrawable".equals(c5.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a5 = a(context, i);
            if (a5 == null) {
                a5 = context.getDrawable(i);
            }
            if (a5 != null) {
                a5 = g(context, i, z4, a5);
            }
            if (a5 != null) {
                j1.a(a5);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a5;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        q.k kVar;
        WeakHashMap weakHashMap = this.f2487a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (kVar = (q.k) weakHashMap.get(context)) == null) ? null : (ColorStateList) kVar.b(i);
        if (colorStateList == null) {
            a4.h hVar = this.f2490e;
            if (hVar != null) {
                colorStateList2 = hVar.e(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f2487a == null) {
                    this.f2487a = new WeakHashMap();
                }
                q.k kVar2 = (q.k) this.f2487a.get(context);
                if (kVar2 == null) {
                    kVar2 = new q.k();
                    this.f2487a.put(context, kVar2);
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
    public final Drawable g(Context context, int i, boolean z4, Drawable drawable) {
        int i4;
        boolean z5;
        int round;
        ColorStateList f5 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f5 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f5);
            if (this.f2490e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.f2490e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c5 = o2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = r.f2548b;
                a4.h.f(findDrawableByLayerId, c5, mode2);
                a4.h.f(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), o2.c(context, R.attr.colorControlNormal), mode2);
                a4.h.f(layerDrawable.findDrawableByLayerId(android.R.id.progress), o2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = o2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = r.f2548b;
                a4.h.f(findDrawableByLayerId2, b2, mode3);
                a4.h.f(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), o2.c(context, R.attr.colorControlActivated), mode3);
                a4.h.f(layerDrawable2.findDrawableByLayerId(android.R.id.progress), o2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        a4.h hVar = this.f2490e;
        boolean z6 = false;
        if (hVar != null) {
            PorterDuff.Mode mode4 = r.f2548b;
            if (a4.h.b((int[]) hVar.f175a, i)) {
                i4 = R.attr.colorControlNormal;
            } else if (a4.h.b((int[]) hVar.f177c, i)) {
                i4 = R.attr.colorControlActivated;
            } else {
                if (a4.h.b((int[]) hVar.d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165262) {
                    round = Math.round(40.8f);
                    i4 = 16842800;
                    z5 = true;
                    if (z5) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(r.c(o2.c(context, i4), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z6 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i4 = 0;
                    z5 = false;
                    round = -1;
                    if (z5) {
                    }
                }
                i4 = 16842801;
            }
            z5 = true;
            round = -1;
            if (z5) {
            }
        }
        if (z6 || !z4) {
            return drawable;
        }
        return null;
    }
}
