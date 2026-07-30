package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n.AbstractC0208a;
import q.AbstractC0218a;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: g, reason: collision with root package name */
    public static O f2131g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2133a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2134b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2135c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2136d;

    /* renamed from: e, reason: collision with root package name */
    public d0.d f2137e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2130f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final N f2132h = new N(6);

    public static synchronized O b() {
        O o2;
        synchronized (O.class) {
            try {
                if (f2131g == null) {
                    f2131g = new O();
                }
                o2 = f2131g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o2;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (O.class) {
            N n2 = f2132h;
            n2.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) n2.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i2) {
        Drawable drawable;
        Object obj;
        if (this.f2135c == null) {
            this.f2135c = new TypedValue();
        }
        TypedValue typedValue = this.f2135c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            k.c cVar = (k.c) this.f2134b.get(context);
            drawable = null;
            if (cVar != null) {
                int b2 = k.b.b(cVar.f2650f, cVar.f2652h, j2);
                if (b2 < 0 || (obj = cVar.f2651g[b2]) == k.c.f2648i) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b3 = k.b.b(cVar.f2650f, cVar.f2652h, j2);
                        if (b3 >= 0) {
                            Object[] objArr = cVar.f2651g;
                            Object obj2 = objArr[b3];
                            Object obj3 = k.c.f2648i;
                            if (obj2 != obj3) {
                                objArr[b3] = obj3;
                                cVar.f2649e = true;
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
        if (this.f2137e != null && i2 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        k.c cVar2 = (k.c) this.f2134b.get(context);
                        if (cVar2 == null) {
                            cVar2 = new k.c();
                            this.f2134b.put(context, cVar2);
                        }
                        cVar2.b(j2, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2);
    }

    public final synchronized Drawable d(Context context, int i2) {
        Drawable a2;
        try {
            if (!this.f2136d) {
                this.f2136d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof O.a) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.f2136d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i2);
            if (a2 == null) {
                a2 = AbstractC0208a.b(context, i2);
            }
            if (a2 != null) {
                a2 = g(context, i2, a2);
            }
            if (a2 != null) {
                Rect rect = AbstractC0171y.f2323a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        int i3;
        k.j jVar;
        Object obj;
        WeakHashMap weakHashMap = this.f2133a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (jVar = (k.j) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a2 = k.b.a(jVar.f2680g, i2, jVar.f2678e);
            if (a2 < 0 || (obj = jVar.f2679f[a2]) == k.j.f2677h) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            d0.d dVar = this.f2137e;
            if (dVar != null) {
                colorStateList2 = dVar.c(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f2133a == null) {
                    this.f2133a = new WeakHashMap();
                }
                k.j jVar2 = (k.j) this.f2133a.get(context);
                if (jVar2 == null) {
                    jVar2 = new k.j();
                    int i4 = 4;
                    while (true) {
                        i3 = 40;
                        if (i4 >= 32) {
                            break;
                        }
                        int i5 = (1 << i4) - 12;
                        if (40 <= i5) {
                            i3 = i5;
                            break;
                        }
                        i4++;
                    }
                    int i6 = i3 / 4;
                    jVar2.f2678e = new int[i6];
                    jVar2.f2679f = new Object[i6];
                    this.f2133a.put(context, jVar2);
                }
                jVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i2, Drawable drawable) {
        int round;
        PorterDuffColorFilter e2;
        int i3 = R.attr.colorControlNormal;
        int i4 = R.attr.colorControlActivated;
        ColorStateList f2 = f(context, i2);
        if (f2 != null) {
            if (AbstractC0171y.a(drawable)) {
                drawable = drawable.mutate();
            }
            AbstractC0218a.h(drawable, f2);
            PorterDuff.Mode mode = null;
            if (this.f2137e != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC0218a.i(drawable, mode);
            }
        } else {
            if (this.f2137e != null) {
                if (i2 == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int b2 = h0.b(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode2 = C0162o.f2247b;
                    d0.d.e(findDrawableByLayerId, b2);
                    d0.d.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlNormal));
                    d0.d.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated));
                } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                    int a2 = h0.a(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode3 = C0162o.f2247b;
                    d0.d.e(findDrawableByLayerId2, a2);
                    d0.d.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlActivated));
                    d0.d.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated));
                }
            }
            d0.d dVar = this.f2137e;
            boolean z2 = false;
            if (dVar != null) {
                PorterDuff.Mode mode4 = C0162o.f2247b;
                if (!d0.d.a((int[]) dVar.f1811a, i2)) {
                    if (!d0.d.a((int[]) dVar.f1813c, i2)) {
                        boolean a3 = d0.d.a((int[]) dVar.f1814d, i2);
                        i4 = android.R.attr.colorBackground;
                        if (a3) {
                            mode4 = PorterDuff.Mode.MULTIPLY;
                        } else if (i2 == 2131165227) {
                            round = Math.round(40.8f);
                            i3 = android.R.attr.colorForeground;
                            z2 = true;
                            if (z2) {
                                Drawable mutate = AbstractC0171y.a(drawable) ? drawable.mutate() : drawable;
                                int b3 = h0.b(context, i3);
                                synchronized (C0162o.class) {
                                    e2 = e(b3, mode4);
                                }
                                mutate.setColorFilter(e2);
                                if (round != -1) {
                                    mutate.setAlpha(round);
                                }
                            }
                        } else if (i2 != R.drawable.abc_dialog_material_background) {
                            i3 = 0;
                            round = -1;
                            if (z2) {
                            }
                        }
                    }
                    i3 = i4;
                }
                z2 = true;
                round = -1;
                if (z2) {
                }
            }
        }
        return drawable;
    }
}
