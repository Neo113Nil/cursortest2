package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.snovikpovik.vuevnxsj.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: g, reason: collision with root package name */
    public static q1 f4386g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f4388a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f4389b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4390c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4391d;

    /* renamed from: e, reason: collision with root package name */
    public r f4392e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f4385f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final p1 f4387h = new p1(6);

    public static synchronized q1 b() {
        q1 q1Var;
        synchronized (q1.class) {
            try {
                if (f4386g == null) {
                    f4386g = new q1();
                }
                q1Var = f4386g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (q1.class) {
            p1 p1Var = f4387h;
            p1Var.getClass();
            int i8 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) p1Var.c(Integer.valueOf(mode.hashCode() + i8));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f4390c == null) {
            this.f4390c = new TypedValue();
        }
        TypedValue typedValue = this.f4390c;
        context.getResources().getValue(i, typedValue, true);
        long j7 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            o.q qVar = (o.q) this.f4389b.get(context);
            drawable = null;
            if (qVar != null) {
                WeakReference weakReference = (WeakReference) qVar.b(j7);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        qVar.f(j7);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f4392e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165242)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = r.h(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = r.h(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = r.h(this, context, R.dimen.abc_star_small);
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
                    o.q qVar2 = (o.q) this.f4389b.get(context);
                    if (qVar2 == null) {
                        qVar2 = new o.q((Object) null);
                        this.f4389b.put(context, qVar2);
                    }
                    qVar2.e(j7, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i);
    }

    public final synchronized Drawable d(Context context, int i) {
        Drawable a8;
        try {
            if (!this.f4391d) {
                this.f4391d = true;
                Drawable c8 = c(context, R.drawable.abc_vector_test);
                if (c8 == null || (!(c8 instanceof d5.a) && !"android.graphics.drawable.VectorDrawable".equals(c8.getClass().getName()))) {
                    this.f4391d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a8 = a(context, i);
            if (a8 == null) {
                a8 = context.getDrawable(i);
            }
            if (a8 != null) {
                a8 = g(context, i, a8);
            }
            if (a8 != null) {
                r0.a(a8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a8;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        o.u0 u0Var;
        WeakHashMap weakHashMap = this.f4388a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (u0Var = (o.u0) weakHashMap.get(context)) == null) ? null : (ColorStateList) u0Var.c(i);
        if (colorStateList == null) {
            r rVar = this.f4392e;
            if (rVar != null) {
                colorStateList2 = rVar.i(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f4388a == null) {
                    this.f4388a = new WeakHashMap();
                }
                o.u0 u0Var2 = (o.u0) this.f4388a.get(context);
                if (u0Var2 == null) {
                    u0Var2 = new o.u0(0);
                    this.f4388a.put(context, u0Var2);
                }
                u0Var2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, Drawable drawable) {
        int i8;
        int round;
        ColorStateList f6 = f(context, i);
        if (f6 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f6);
            PorterDuff.Mode mode = null;
            if (this.f4392e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.f4392e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c8 = v1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = s.f4401b;
                r.j(findDrawableByLayerId, c8, mode2);
                r.j(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), v1.c(context, R.attr.colorControlNormal), mode2);
                r.j(layerDrawable.findDrawableByLayerId(android.R.id.progress), v1.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b8 = v1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = s.f4401b;
                r.j(findDrawableByLayerId2, b8, mode3);
                r.j(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), v1.c(context, R.attr.colorControlActivated), mode3);
                r.j(layerDrawable2.findDrawableByLayerId(android.R.id.progress), v1.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        r rVar = this.f4392e;
        if (rVar != null) {
            PorterDuff.Mode mode4 = s.f4401b;
            boolean z3 = true;
            if (r.f((int[]) rVar.f4393a, i)) {
                i8 = R.attr.colorControlNormal;
            } else if (r.f((int[]) rVar.f4395c, i)) {
                i8 = R.attr.colorControlActivated;
            } else {
                if (r.f((int[]) rVar.f4396d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165262) {
                    round = Math.round(40.8f);
                    i8 = 16842800;
                    if (z3) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(s.b(v1.c(context, i8), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    z3 = false;
                    i8 = 0;
                }
                i8 = 16842801;
            }
            round = -1;
            if (z3) {
            }
        }
        return drawable;
    }
}
