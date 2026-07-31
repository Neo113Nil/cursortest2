package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.strategylink.Row.Five.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q.AbstractC0584d;
import q.C0585e;
import q.C0592l;
import u.AbstractC0666a;
import x.AbstractC0723a;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: g, reason: collision with root package name */
    public static T f4963g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f4965a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f4966b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4967c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4968d;

    /* renamed from: e, reason: collision with root package name */
    public D0.h f4969e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f4962f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final S f4964h = new S(6);

    public static synchronized T b() {
        T t6;
        synchronized (T.class) {
            try {
                if (f4963g == null) {
                    f4963g = new T();
                }
                t6 = f4963g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t6;
    }

    public static synchronized PorterDuffColorFilter e(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (T.class) {
            S s6 = f4964h;
            s6.getClass();
            int i8 = (31 + i7) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) s6.a(Integer.valueOf(mode.hashCode() + i8));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i7) {
        Drawable drawable;
        Object obj;
        int i8;
        if (this.f4967c == null) {
            this.f4967c = new TypedValue();
        }
        TypedValue typedValue = this.f4967c;
        context.getResources().getValue(i7, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C0585e c0585e = (C0585e) this.f4966b.get(context);
            drawable = null;
            if (c0585e != null) {
                int b7 = AbstractC0584d.b(c0585e.f5718g, c0585e.f5720i, j4);
                if (b7 < 0 || (obj = c0585e.f5719h[b7]) == C0585e.f5716j) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b8 = AbstractC0584d.b(c0585e.f5718g, c0585e.f5720i, j4);
                        if (b8 >= 0) {
                            Object[] objArr = c0585e.f5719h;
                            Object obj2 = objArr[b8];
                            Object obj3 = C0585e.f5716j;
                            if (obj2 != obj3) {
                                objArr[b8] = obj3;
                                c0585e.f5717f = true;
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
        if (this.f4969e != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawable = D0.h.f(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = D0.h.f(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = D0.h.f(this, context, R.dimen.abc_star_small);
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
                    C0585e c0585e2 = (C0585e) this.f4966b.get(context);
                    if (c0585e2 == null) {
                        c0585e2 = new C0585e();
                        c0585e2.f5717f = false;
                        int i9 = 4;
                        while (true) {
                            i8 = 80;
                            if (i9 >= 32) {
                                break;
                            }
                            int i10 = (1 << i9) - 12;
                            if (80 <= i10) {
                                i8 = i10;
                                break;
                            }
                            i9++;
                        }
                        int i11 = i8 / 8;
                        c0585e2.f5718g = new long[i11];
                        c0585e2.f5719h = new Object[i11];
                        this.f4966b.put(context, c0585e2);
                    }
                    c0585e2.b(j4, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i7) {
        return d(context, i7);
    }

    public final synchronized Drawable d(Context context, int i7) {
        Drawable a7;
        try {
            if (!this.f4968d) {
                this.f4968d = true;
                Drawable c7 = c(context, R.drawable.abc_vector_test);
                if (c7 == null || (!(c7 instanceof Z.a) && !"android.graphics.drawable.VectorDrawable".equals(c7.getClass().getName()))) {
                    this.f4968d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a7 = a(context, i7);
            if (a7 == null) {
                a7 = AbstractC0666a.b(context, i7);
            }
            if (a7 != null) {
                a7 = g(context, i7, a7);
            }
            if (a7 != null) {
                int i8 = AbstractC0441C.f4894a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a7;
    }

    public final synchronized ColorStateList f(Context context, int i7) {
        ColorStateList colorStateList;
        int i8;
        C0592l c0592l;
        Object obj;
        WeakHashMap weakHashMap = this.f4965a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (c0592l = (C0592l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a7 = AbstractC0584d.a(c0592l.f5748h, i7, c0592l.f5746f);
            if (a7 < 0 || (obj = c0592l.f5747g[a7]) == C0592l.f5745i) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            D0.h hVar = this.f4969e;
            if (hVar != null) {
                colorStateList2 = hVar.g(context, i7);
            }
            if (colorStateList2 != null) {
                if (this.f4965a == null) {
                    this.f4965a = new WeakHashMap();
                }
                C0592l c0592l2 = (C0592l) this.f4965a.get(context);
                if (c0592l2 == null) {
                    c0592l2 = new C0592l();
                    int i9 = 4;
                    while (true) {
                        i8 = 40;
                        if (i9 >= 32) {
                            break;
                        }
                        int i10 = (1 << i9) - 12;
                        if (40 <= i10) {
                            i8 = i10;
                            break;
                        }
                        i9++;
                    }
                    int i11 = i8 / 4;
                    c0592l2.f5746f = new int[i11];
                    c0592l2.f5747g = new Object[i11];
                    this.f4965a.put(context, c0592l2);
                }
                c0592l2.a(i7, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i7, Drawable drawable) {
        int i8;
        int round;
        PorterDuffColorFilter e4;
        ColorStateList f7 = f(context, i7);
        if (f7 != null) {
            if (AbstractC0441C.a(drawable)) {
                drawable = drawable.mutate();
            }
            AbstractC0723a.h(drawable, f7);
            PorterDuff.Mode mode = null;
            if (this.f4969e != null && i7 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC0723a.i(drawable, mode);
            }
            return drawable;
        }
        if (this.f4969e != null) {
            if (i7 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c7 = k0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0456o.f5070b;
                D0.h.m(findDrawableByLayerId, c7, mode2);
                D0.h.m(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), k0.c(context, R.attr.colorControlNormal), mode2);
                D0.h.m(layerDrawable.findDrawableByLayerId(android.R.id.progress), k0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i7 == R.drawable.abc_ratingbar_material || i7 == R.drawable.abc_ratingbar_indicator_material || i7 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b7 = k0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0456o.f5070b;
                D0.h.m(findDrawableByLayerId2, b7, mode3);
                D0.h.m(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), k0.c(context, R.attr.colorControlActivated), mode3);
                D0.h.m(layerDrawable2.findDrawableByLayerId(android.R.id.progress), k0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        D0.h hVar = this.f4969e;
        if (hVar != null) {
            PorterDuff.Mode mode4 = C0456o.f5070b;
            boolean z5 = true;
            if (D0.h.b((int[]) hVar.f330b, i7)) {
                i8 = R.attr.colorControlNormal;
            } else if (D0.h.b((int[]) hVar.f332d, i7)) {
                i8 = R.attr.colorControlActivated;
            } else {
                if (D0.h.b((int[]) hVar.f333e, i7)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i7 == 2131165221) {
                    round = Math.round(40.8f);
                    i8 = 16842800;
                    if (z5) {
                        Drawable mutate = AbstractC0441C.a(drawable) ? drawable.mutate() : drawable;
                        int c8 = k0.c(context, i8);
                        synchronized (C0456o.class) {
                            e4 = e(c8, mode4);
                        }
                        mutate.setColorFilter(e4);
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                    }
                } else if (i7 != R.drawable.abc_dialog_material_background) {
                    z5 = false;
                    i8 = 0;
                }
                i8 = 16842801;
            }
            round = -1;
            if (z5) {
            }
        }
        return drawable;
    }
}
