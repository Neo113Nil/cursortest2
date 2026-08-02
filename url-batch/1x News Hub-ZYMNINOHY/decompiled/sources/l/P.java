package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.fc.barca.football.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p.AbstractC1172h;
import p.C1171g;
import p.C1175k;
import q.AbstractC1178a;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: g, reason: collision with root package name */
    public static P f9756g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f9758a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f9759b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f9760c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9761d;

    /* renamed from: e, reason: collision with root package name */
    public F1.c f9762e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final O f9757h = new O(6);

    public static synchronized P b() {
        P p3;
        synchronized (P.class) {
            try {
                if (f9756g == null) {
                    f9756g = new P();
                }
                p3 = f9756g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p3;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (P.class) {
            O o = f9757h;
            o.getClass();
            int i4 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) o.a(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i3) {
        Drawable drawable;
        Object obj;
        if (this.f9760c == null) {
            this.f9760c = new TypedValue();
        }
        TypedValue typedValue = this.f9760c;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1171g c1171g = (C1171g) this.f9759b.get(context);
            drawable = null;
            if (c1171g != null) {
                int b3 = AbstractC1178a.b(c1171g.f10194b, c1171g.f10196d, j3);
                if (b3 < 0 || (obj = c1171g.f10195c[b3]) == AbstractC1172h.f10197a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b4 = AbstractC1178a.b(c1171g.f10194b, c1171g.f10196d, j3);
                        if (b4 >= 0) {
                            Object[] objArr = c1171g.f10195c;
                            Object obj2 = objArr[b4];
                            Object obj3 = AbstractC1172h.f10197a;
                            if (obj2 != obj3) {
                                objArr[b4] = obj3;
                                c1171g.f10193a = true;
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
        if (this.f9762e != null && i3 == R.drawable.abc_cab_background_top_material) {
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
                    C1171g c1171g2 = (C1171g) this.f9759b.get(context);
                    if (c1171g2 == null) {
                        c1171g2 = new C1171g();
                        this.f9759b.put(context, c1171g2);
                    }
                    c1171g2.a(j3, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i3) {
        return d(context, i3);
    }

    public final synchronized Drawable d(Context context, int i3) {
        Drawable a3;
        try {
            if (!this.f9761d) {
                this.f9761d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof Y.a) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.f9761d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a3 = a(context, i3);
            if (a3 == null) {
                a3 = context.getDrawable(i3);
            }
            if (a3 != null) {
                a3 = g(context, i3, a3);
            }
            if (a3 != null) {
                Rect rect = AbstractC1103z.f9932a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a3;
    }

    public final synchronized ColorStateList f(Context context, int i3) {
        ColorStateList colorStateList;
        int i4;
        C1175k c1175k;
        Object obj;
        WeakHashMap weakHashMap = this.f9758a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (c1175k = (C1175k) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a3 = AbstractC1178a.a(c1175k.f10209c, i3, c1175k.f10207a);
            if (a3 < 0 || (obj = c1175k.f10208b[a3]) == AbstractC1172h.f10198b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            F1.c cVar = this.f9762e;
            if (cVar != null) {
                colorStateList2 = cVar.e(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f9758a == null) {
                    this.f9758a = new WeakHashMap();
                }
                C1175k c1175k2 = (C1175k) this.f9758a.get(context);
                if (c1175k2 == null) {
                    c1175k2 = new C1175k();
                    int i5 = 4;
                    while (true) {
                        i4 = 40;
                        if (i5 >= 32) {
                            break;
                        }
                        int i6 = (1 << i5) - 12;
                        if (40 <= i6) {
                            i4 = i6;
                            break;
                        }
                        i5++;
                    }
                    int i7 = i4 / 4;
                    c1175k2.f10207a = new int[i7];
                    c1175k2.f10208b = new Object[i7];
                    this.f9758a.put(context, c1175k2);
                }
                c1175k2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i3, Drawable drawable) {
        int i4;
        int round;
        int i5;
        PorterDuffColorFilter e3;
        ColorStateList f3 = f(context, i3);
        if (f3 != null) {
            if (AbstractC1103z.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(f3);
            PorterDuff.Mode mode = null;
            if (this.f9762e != null && i3 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
            return drawable;
        }
        if (this.f9762e != null) {
            if (i3 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int b3 = h0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1093o.f9861b;
                F1.c.f(findDrawableByLayerId, b3, mode2);
                F1.c.f(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlNormal), mode2);
                F1.c.f(layerDrawable.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int a3 = h0.a(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1093o.f9861b;
                F1.c.f(findDrawableByLayerId2, a3, mode3);
                F1.c.f(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h0.b(context, R.attr.colorControlActivated), mode3);
                F1.c.f(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h0.b(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        F1.c cVar = this.f9762e;
        boolean z = false;
        if (cVar != null) {
            PorterDuff.Mode mode4 = C1093o.f9861b;
            if (F1.c.b((int[]) cVar.f486a, i3)) {
                i5 = R.attr.colorControlNormal;
            } else if (F1.c.b((int[]) cVar.f488c, i3)) {
                i5 = R.attr.colorControlActivated;
            } else {
                boolean b4 = F1.c.b((int[]) cVar.f489d, i3);
                i4 = android.R.attr.colorBackground;
                if (b4) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i3 == 2131165227) {
                    round = Math.round(40.8f);
                    i4 = 16842800;
                    z = true;
                    if (z) {
                        Drawable mutate = AbstractC1103z.a(drawable) ? drawable.mutate() : drawable;
                        int b5 = h0.b(context, i4);
                        synchronized (C1093o.class) {
                            e3 = e(b5, mode4);
                        }
                        mutate.setColorFilter(e3);
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                    }
                } else if (i3 != R.drawable.abc_dialog_material_background) {
                    i4 = 0;
                    round = -1;
                    if (z) {
                    }
                }
                z = true;
                round = -1;
                if (z) {
                }
            }
            i4 = i5;
            z = true;
            round = -1;
            if (z) {
            }
        }
        return drawable;
    }
}
