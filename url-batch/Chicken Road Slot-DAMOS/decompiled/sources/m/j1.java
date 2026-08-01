package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.ra;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j1 {
    public static j1 g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f6112a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f6113b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f6114c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6115d;

    /* renamed from: e, reason: collision with root package name */
    public ra f6116e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f6110f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final i1 f6111h = new i1(6);

    public static synchronized j1 c() {
        j1 j1Var;
        synchronized (j1.class) {
            try {
                if (g == null) {
                    g = new j1();
                }
                j1Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j1Var;
    }

    public static synchronized PorterDuffColorFilter f(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (j1.class) {
            i1 i1Var = f6111h;
            i1Var.getClass();
            int i10 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) i1Var.c(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i3, ColorStateList colorStateList) {
        if (this.f6112a == null) {
            this.f6112a = new WeakHashMap();
        }
        s.s0 s0Var = (s.s0) this.f6112a.get(context);
        if (s0Var == null) {
            s0Var = new s.s0(0);
            this.f6112a.put(context, s0Var);
        }
        int i10 = s0Var.f8376r;
        if (i10 != 0 && i3 <= s0Var.f8374e[i10 - 1]) {
            s0Var.e(i3, colorStateList);
            return;
        }
        if (s0Var.f8373d && i10 >= s0Var.f8374e.length) {
            s.q.a(s0Var);
        }
        int i11 = s0Var.f8376r;
        if (i11 >= s0Var.f8374e.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            s0Var.f8374e = Arrays.copyOf(s0Var.f8374e, i15);
            s0Var.f8375i = Arrays.copyOf(s0Var.f8375i, i15);
        }
        s0Var.f8374e[i11] = i3;
        s0Var.f8375i[i11] = colorStateList;
        s0Var.f8376r = i11 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable b(Context context, int i3) {
        Object obj;
        Drawable newDrawable;
        LayerDrawable e2;
        if (this.f6114c == null) {
            this.f6114c = new TypedValue();
        }
        TypedValue typedValue = this.f6114c;
        context.getResources().getValue(i3, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            s.p pVar = (s.p) this.f6113b.get(context);
            obj = null;
            if (pVar != null) {
                WeakReference weakReference = (WeakReference) pVar.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        pVar.e(j);
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.f6116e != null) {
            if (i3 == R.drawable.abc_cab_background_top_material) {
                e2 = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, 2131165202)});
            } else if (i3 == R.drawable.abc_ratingbar_material) {
                e2 = ra.e(this, context, R.dimen.abc_star_big);
            } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                e2 = ra.e(this, context, R.dimen.abc_star_medium);
            } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                e2 = ra.e(this, context, R.dimen.abc_star_small);
            }
            if (e2 != null) {
                return e2;
            }
            e2.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = e2.getConstantState();
                    if (constantState2 == null) {
                        return e2;
                    }
                    s.p pVar2 = (s.p) this.f6113b.get(context);
                    if (pVar2 == null) {
                        pVar2 = new s.p(obj);
                        this.f6113b.put(context, pVar2);
                    }
                    pVar2.d(j, new WeakReference(constantState2));
                    return e2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e2 = null;
        if (e2 != null) {
        }
    }

    public final synchronized Drawable d(Context context, int i3) {
        return e(context, i3);
    }

    public final synchronized Drawable e(Context context, int i3) {
        Drawable b10;
        try {
            if (!this.f6115d) {
                this.f6115d = true;
                Drawable d10 = d(context, R.drawable.abc_vector_test);
                if (d10 == null || !"android.graphics.drawable.VectorDrawable".equals(d10.getClass().getName())) {
                    this.f6115d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            b10 = b(context, i3);
            if (b10 == null) {
                b10 = context.getDrawable(i3);
            }
            if (b10 != null) {
                b10 = h(context, i3, b10);
            }
            if (b10 != null) {
                k0.a(b10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b10;
    }

    public final synchronized ColorStateList g(Context context, int i3) {
        ColorStateList colorStateList;
        s.s0 s0Var;
        WeakHashMap weakHashMap = this.f6112a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (s0Var = (s.s0) weakHashMap.get(context)) == null) ? null : (ColorStateList) s0Var.c(i3);
        if (colorStateList == null) {
            ra raVar = this.f6116e;
            if (raVar != null) {
                colorStateList2 = raVar.f(context, i3);
            }
            if (colorStateList2 != null) {
                a(context, i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable h(Context context, int i3, Drawable drawable) {
        int round;
        PorterDuffColorFilter f3;
        ColorStateList g2 = g(context, i3);
        if (g2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(g2);
            PorterDuff.Mode mode = null;
            if (this.f6116e != null && i3 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        ra raVar = this.f6116e;
        int i10 = R.attr.colorControlNormal;
        if (raVar != null) {
            if (i3 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c10 = o1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = o.f6141b;
                ra.h(findDrawableByLayerId, c10, mode2);
                ra.h(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), o1.c(context, R.attr.colorControlNormal), mode2);
                ra.h(layerDrawable.findDrawableByLayerId(android.R.id.progress), o1.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b10 = o1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = o.f6141b;
                ra.h(findDrawableByLayerId2, b10, mode3);
                ra.h(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), o1.c(context, R.attr.colorControlActivated), mode3);
                ra.h(layerDrawable2.findDrawableByLayerId(android.R.id.progress), o1.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        ra raVar2 = this.f6116e;
        if (raVar2 != null) {
            PorterDuff.Mode mode4 = o.f6141b;
            boolean z10 = true;
            if (!ra.b((int[]) raVar2.f2737a, i3)) {
                if (ra.b((int[]) raVar2.f2739c, i3)) {
                    i10 = R.attr.colorControlActivated;
                } else {
                    boolean b11 = ra.b((int[]) raVar2.f2740d, i3);
                    i10 = android.R.attr.colorBackground;
                    if (b11) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i3 == 2131165222) {
                        round = Math.round(40.8f);
                        i10 = android.R.attr.colorForeground;
                        if (z10) {
                            Drawable mutate2 = drawable.mutate();
                            int c11 = o1.c(context, i10);
                            synchronized (o.class) {
                                f3 = f(c11, mode4);
                            }
                            mutate2.setColorFilter(f3);
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                        }
                    } else if (i3 != R.drawable.abc_dialog_material_background) {
                        i10 = 0;
                        z10 = false;
                    }
                }
            }
            round = -1;
            if (z10) {
            }
        }
        return drawable;
    }
}
