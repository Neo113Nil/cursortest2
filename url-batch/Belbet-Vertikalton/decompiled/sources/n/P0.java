package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.winpower.neonfit.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q0.C0347p;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: g, reason: collision with root package name */
    public static P0 f3504g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f3506a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3507b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f3508c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3509d;
    public G1.h e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f3503f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final O0 f3505h = new O0(6);

    public static synchronized P0 b() {
        P0 p02;
        synchronized (P0.class) {
            try {
                if (f3504g == null) {
                    f3504g = new P0();
                }
                p02 = f3504g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (P0.class) {
            O0 o0 = f3505h;
            o0.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) o0.a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f3508c == null) {
            this.f3508c = new TypedValue();
        }
        TypedValue typedValue = this.f3508c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            q.e eVar = (q.e) this.f3507b.get(context);
            drawable = null;
            if (eVar != null) {
                WeakReference weakReference = (WeakReference) eVar.c(j, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = q.d.b(eVar.f3902b, eVar.f3904d, j);
                        if (b2 >= 0) {
                            Object[] objArr = eVar.f3903c;
                            Object obj = objArr[b2];
                            Object obj2 = q.e.e;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                eVar.f3901a = true;
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
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165242)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = G1.h.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = G1.h.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = G1.h.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        q.e eVar2 = (q.e) this.f3507b.get(context);
                        if (eVar2 == null) {
                            eVar2 = new q.e();
                            this.f3507b.put(context, eVar2);
                        }
                        eVar2.d(j, new WeakReference(constantState2));
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
            if (!this.f3509d) {
                this.f3509d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof C0347p) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.f3509d = false;
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
                AbstractC0293p0.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        q.l lVar;
        WeakHashMap weakHashMap = this.f3506a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (q.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i, null);
        if (colorStateList == null) {
            G1.h hVar = this.e;
            if (hVar != null) {
                colorStateList2 = hVar.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f3506a == null) {
                    this.f3506a = new WeakHashMap();
                }
                q.l lVar2 = (q.l) this.f3506a.get(context);
                if (lVar2 == null) {
                    lVar2 = new q.l();
                    this.f3506a.put(context, lVar2);
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
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return mutate;
            }
            F.a.i(mutate, mode);
            return mutate;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c2 = W0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0302u.f3715b;
                G1.h.e(findDrawableByLayerId, c2, mode2);
                G1.h.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), W0.c(context, R.attr.colorControlNormal), mode2);
                G1.h.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), W0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = W0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0302u.f3715b;
                G1.h.e(findDrawableByLayerId2, b2, mode3);
                G1.h.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), W0.c(context, R.attr.colorControlActivated), mode3);
                G1.h.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), W0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        G1.h hVar = this.e;
        boolean z4 = false;
        if (hVar != null) {
            PorterDuff.Mode mode4 = C0302u.f3715b;
            if (G1.h.a((int[]) hVar.f374a, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (G1.h.a((int[]) hVar.f376c, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (G1.h.a((int[]) hVar.f377d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165262) {
                    z3 = true;
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    if (z3) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C0302u.c(W0.c(context, i2), mode4));
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
