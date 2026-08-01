package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.winfour.winrandom.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n0.C0279p;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: g, reason: collision with root package name */
    public static Q0 f2982g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2984a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2985b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2986c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public C0239t f2987e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2981f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final P0 f2983h = new P0(6);

    public static synchronized Q0 b() {
        Q0 q02;
        synchronized (Q0.class) {
            try {
                if (f2982g == null) {
                    f2982g = new Q0();
                }
                q02 = f2982g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (Q0.class) {
            P0 p0 = f2983h;
            p0.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) p0.a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f2986c == null) {
            this.f2986c = new TypedValue();
        }
        TypedValue typedValue = this.f2986c;
        context.getResources().getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            p.e eVar = (p.e) this.f2985b.get(context);
            drawable = null;
            if (eVar != null) {
                WeakReference weakReference = (WeakReference) eVar.c(j2, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = p.d.b(eVar.f3452b, eVar.d, j2);
                        if (b2 >= 0) {
                            Object[] objArr = eVar.f3453c;
                            Object obj = objArr[b2];
                            Object obj2 = p.e.f3450e;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                eVar.f3451a = true;
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
        if (this.f2987e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165241)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0239t.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0239t.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0239t.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        p.e eVar2 = (p.e) this.f2985b.get(context);
                        if (eVar2 == null) {
                            eVar2 = new p.e();
                            this.f2985b.put(context, eVar2);
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
                if (c2 == null || (!(c2 instanceof C0279p) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i);
            if (a2 == null) {
                a2 = B.a.b(context, i);
            }
            if (a2 != null) {
                a2 = g(context, i, z2, a2);
            }
            if (a2 != null) {
                AbstractC0234q0.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        p.l lVar;
        WeakHashMap weakHashMap = this.f2984a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (p.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i, null);
        if (colorStateList == null) {
            C0239t c0239t = this.f2987e;
            if (c0239t != null) {
                colorStateList2 = c0239t.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f2984a == null) {
                    this.f2984a = new WeakHashMap();
                }
                p.l lVar2 = (p.l) this.f2984a.get(context);
                if (lVar2 == null) {
                    lVar2 = new p.l();
                    this.f2984a.put(context, lVar2);
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
            E.a.h(mutate, f2);
            if (this.f2987e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return mutate;
            }
            E.a.i(mutate, mode);
            return mutate;
        }
        if (this.f2987e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c2 = X0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0241u.f3186b;
                C0239t.e(findDrawableByLayerId, c2, mode2);
                C0239t.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), X0.c(context, R.attr.colorControlNormal), mode2);
                C0239t.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), X0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = X0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0241u.f3186b;
                C0239t.e(findDrawableByLayerId2, b2, mode3);
                C0239t.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), X0.c(context, R.attr.colorControlActivated), mode3);
                C0239t.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), X0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0239t c0239t = this.f2987e;
        boolean z4 = false;
        if (c0239t != null) {
            PorterDuff.Mode mode4 = C0241u.f3186b;
            if (C0239t.a((int[]) c0239t.f3181a, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C0239t.a((int[]) c0239t.f3183c, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C0239t.a((int[]) c0239t.d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165261) {
                    z3 = true;
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    if (z3) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C0241u.c(X0.c(context, i2), mode4));
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
