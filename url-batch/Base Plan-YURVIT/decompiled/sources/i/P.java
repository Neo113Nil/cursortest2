package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.crane.slab.beam.R;
import e0.C0125d;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p.AbstractC0215a;
import s.AbstractC0226a;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: g, reason: collision with root package name */
    public static P f2162g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2164a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2165b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2166c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2167d;

    /* renamed from: e, reason: collision with root package name */
    public C0125d f2168e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2161f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final O f2163h = new O(6);

    public static synchronized P b() {
        P p2;
        synchronized (P.class) {
            try {
                if (f2162g == null) {
                    f2162g = new P();
                }
                p2 = f2162g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p2;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (P.class) {
            O o2 = f2163h;
            o2.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) o2.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i2) {
        Drawable drawable;
        Object obj;
        if (this.f2166c == null) {
            this.f2166c = new TypedValue();
        }
        TypedValue typedValue = this.f2166c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            m.c cVar = (m.c) this.f2165b.get(context);
            drawable = null;
            if (cVar != null) {
                int b2 = m.b.b(cVar.f2823f, cVar.f2825h, j2);
                if (b2 < 0 || (obj = cVar.f2824g[b2]) == m.c.f2821i) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b3 = m.b.b(cVar.f2823f, cVar.f2825h, j2);
                        if (b3 >= 0) {
                            Object[] objArr = cVar.f2824g;
                            Object obj2 = objArr[b3];
                            Object obj3 = m.c.f2821i;
                            if (obj2 != obj3) {
                                objArr[b3] = obj3;
                                cVar.f2822e = true;
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
        if (this.f2168e != null && i2 == R.drawable.abc_cab_background_top_material) {
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
                    m.c cVar2 = (m.c) this.f2165b.get(context);
                    if (cVar2 == null) {
                        cVar2 = new m.c();
                        this.f2165b.put(context, cVar2);
                    }
                    cVar2.b(j2, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
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
            if (!this.f2167d) {
                this.f2167d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof Q.a) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.f2167d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i2);
            if (a2 == null) {
                a2 = AbstractC0215a.b(context, i2);
            }
            if (a2 != null) {
                a2 = g(context, i2, a2);
            }
            if (a2 != null) {
                Rect rect = AbstractC0178z.f2351a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        int i3;
        m.j jVar;
        Object obj;
        WeakHashMap weakHashMap = this.f2164a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (jVar = (m.j) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a2 = m.b.a(jVar.f2853g, i2, jVar.f2851e);
            if (a2 < 0 || (obj = jVar.f2852f[a2]) == m.j.f2850h) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            C0125d c0125d = this.f2168e;
            if (c0125d != null) {
                colorStateList2 = c0125d.d(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f2164a == null) {
                    this.f2164a = new WeakHashMap();
                }
                m.j jVar2 = (m.j) this.f2164a.get(context);
                if (jVar2 == null) {
                    jVar2 = new m.j();
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
                    jVar2.f2851e = new int[i6];
                    jVar2.f2852f = new Object[i6];
                    this.f2164a.put(context, jVar2);
                }
                jVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i2, Drawable drawable) {
        int i3;
        int round;
        PorterDuffColorFilter e2;
        ColorStateList f2 = f(context, i2);
        if (f2 != null) {
            if (AbstractC0178z.a(drawable)) {
                drawable = drawable.mutate();
            }
            AbstractC0226a.h(drawable, f2);
            PorterDuff.Mode mode = null;
            if (this.f2168e != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC0226a.i(drawable, mode);
            }
            return drawable;
        }
        if (this.f2168e != null) {
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int b2 = h0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0168o.f2275b;
                C0125d.i(findDrawableByLayerId, b2, mode2);
                C0125d.i(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlNormal), mode2);
                C0125d.i(layerDrawable.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int a2 = h0.a(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0168o.f2275b;
                C0125d.i(findDrawableByLayerId2, a2, mode3);
                C0125d.i(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlActivated), mode3);
                C0125d.i(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0125d c0125d = this.f2168e;
        if (c0125d != null) {
            PorterDuff.Mode mode4 = C0168o.f2275b;
            boolean z2 = true;
            if (C0125d.a((int[]) c0125d.f1858b, i2)) {
                i3 = R.attr.colorControlNormal;
            } else if (C0125d.a((int[]) c0125d.f1860d, i2)) {
                i3 = R.attr.colorControlActivated;
            } else {
                if (C0125d.a((int[]) c0125d.f1861e, i2)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i2 == 2131165227) {
                    round = Math.round(40.8f);
                    i3 = 16842800;
                    if (z2) {
                        Drawable mutate = AbstractC0178z.a(drawable) ? drawable.mutate() : drawable;
                        int b3 = h0.b(context, i3);
                        synchronized (C0168o.class) {
                            e2 = e(b3, mode4);
                        }
                        mutate.setColorFilter(e2);
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                    }
                } else if (i2 != R.drawable.abc_dialog_material_background) {
                    z2 = false;
                    i3 = 0;
                }
                i3 = 16842801;
            }
            round = -1;
            if (z2) {
            }
        }
        return drawable;
    }
}
