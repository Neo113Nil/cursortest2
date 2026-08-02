package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.rockchicken.pump.up.road.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q.AbstractC1350a;
import q1.AbstractC1384a;

/* renamed from: k.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190N {

    /* renamed from: g, reason: collision with root package name */
    public static C1190N f13946g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f13948a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f13949b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f13950c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13951d;

    /* renamed from: e, reason: collision with root package name */
    public L1.h f13952e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f13945f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final C1189M f13947h = new C1189M(6);

    public static synchronized C1190N b() {
        C1190N c1190n;
        synchronized (C1190N.class) {
            try {
                if (f13946g == null) {
                    f13946g = new C1190N();
                }
                c1190n = f13946g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1190n;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1190N.class) {
            C1189M c1189m = f13947h;
            c1189m.getClass();
            int i5 = (31 + i4) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c1189m.a(Integer.valueOf(mode.hashCode() + i5));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i4) {
        Drawable drawable;
        if (this.f13950c == null) {
            this.f13950c = new TypedValue();
        }
        TypedValue typedValue = this.f13950c;
        context.getResources().getValue(i4, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            p.g gVar = (p.g) this.f13949b.get(context);
            drawable = null;
            if (gVar != null) {
                WeakReference weakReference = (WeakReference) gVar.b(j4);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b4 = AbstractC1350a.b(gVar.f14654b, gVar.f14656d, j4);
                        if (b4 >= 0) {
                            Object[] objArr = gVar.f14655c;
                            Object obj = objArr[b4];
                            Object obj2 = p.h.f14657a;
                            if (obj != obj2) {
                                objArr[b4] = obj2;
                                gVar.f14653a = true;
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
        if (this.f13952e != null && i4 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    p.g gVar2 = (p.g) this.f13949b.get(context);
                    if (gVar2 == null) {
                        gVar2 = new p.g();
                        this.f13949b.put(context, gVar2);
                    }
                    gVar2.d(j4, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i4) {
        return d(context, i4);
    }

    public final synchronized Drawable d(Context context, int i4) {
        Drawable a3;
        try {
            if (!this.f13951d) {
                this.f13951d = true;
                Drawable c4 = c(context, R.drawable.abc_vector_test);
                if (c4 == null || (!(c4 instanceof AbstractC1384a) && !"android.graphics.drawable.VectorDrawable".equals(c4.getClass().getName()))) {
                    this.f13951d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a3 = a(context, i4);
            if (a3 == null) {
                a3 = context.getDrawable(i4);
            }
            if (a3 != null) {
                a3 = g(context, i4, a3);
            }
            if (a3 != null) {
                Rect rect = AbstractC1237x.f14120a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a3;
    }

    public final synchronized ColorStateList f(Context context, int i4) {
        ColorStateList colorStateList;
        p.k kVar;
        Object obj;
        WeakHashMap weakHashMap = this.f13948a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (kVar = (p.k) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a3 = AbstractC1350a.a(kVar.f14670c, i4, kVar.f14668a);
            if (a3 < 0 || (obj = kVar.f14669b[a3]) == p.h.f14658b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            L1.h hVar = this.f13952e;
            if (hVar != null) {
                colorStateList2 = hVar.g(context, i4);
            }
            if (colorStateList2 != null) {
                if (this.f13948a == null) {
                    this.f13948a = new WeakHashMap();
                }
                p.k kVar2 = (p.k) this.f13948a.get(context);
                if (kVar2 == null) {
                    kVar2 = new p.k();
                    this.f13948a.put(context, kVar2);
                }
                kVar2.a(i4, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i4, Drawable drawable) {
        int i5;
        int round;
        PorterDuffColorFilter e4;
        ColorStateList f4 = f(context, i4);
        if (f4 != null) {
            if (AbstractC1237x.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(f4);
            PorterDuff.Mode mode = null;
            if (this.f13952e != null && i4 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
            return drawable;
        }
        if (this.f13952e != null) {
            if (i4 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int b4 = AbstractC1213f0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1227n.f14049b;
                L1.h.i(findDrawableByLayerId, b4, mode2);
                L1.h.i(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1213f0.b(context, R.attr.colorControlNormal), mode2);
                L1.h.i(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC1213f0.b(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i4 == R.drawable.abc_ratingbar_material || i4 == R.drawable.abc_ratingbar_indicator_material || i4 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int a3 = AbstractC1213f0.a(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1227n.f14049b;
                L1.h.i(findDrawableByLayerId2, a3, mode3);
                L1.h.i(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1213f0.b(context, R.attr.colorControlActivated), mode3);
                L1.h.i(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC1213f0.b(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        L1.h hVar = this.f13952e;
        if (hVar != null) {
            PorterDuff.Mode mode4 = C1227n.f14049b;
            boolean z = true;
            if (L1.h.c((int[]) hVar.f1633a, i4)) {
                i5 = R.attr.colorControlNormal;
            } else if (L1.h.c((int[]) hVar.f1635c, i4)) {
                i5 = R.attr.colorControlActivated;
            } else {
                if (L1.h.c((int[]) hVar.f1636d, i4)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i4 == 2131165227) {
                    round = Math.round(40.8f);
                    i5 = 16842800;
                    if (z) {
                        Drawable mutate = AbstractC1237x.a(drawable) ? drawable.mutate() : drawable;
                        int b5 = AbstractC1213f0.b(context, i5);
                        synchronized (C1227n.class) {
                            e4 = e(b5, mode4);
                        }
                        mutate.setColorFilter(e4);
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                    }
                } else if (i4 != R.drawable.abc_dialog_material_background) {
                    z = false;
                    i5 = 0;
                }
                i5 = 16842801;
            }
            round = -1;
            if (z) {
            }
        }
        return drawable;
    }
}
