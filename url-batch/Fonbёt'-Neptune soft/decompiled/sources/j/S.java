package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.neptunesoft.languesbacdz.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n.AbstractC0269b;
import n.C0268a;
import n.C0270c;
import n.C0277j;
import org.xmlpull.v1.XmlPullParserException;
import r.AbstractC0288a;
import u.AbstractC0309a;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: i, reason: collision with root package name */
    public static S f2905i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2907a;

    /* renamed from: b, reason: collision with root package name */
    public C0268a f2908b;

    /* renamed from: c, reason: collision with root package name */
    public C0277j f2909c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f2910d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f2911e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2912f;

    /* renamed from: g, reason: collision with root package name */
    public C0239o f2913g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f2904h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final Q f2906j = new Q(6);

    public static synchronized S d() {
        S s2;
        synchronized (S.class) {
            try {
                if (f2905i == null) {
                    S s3 = new S();
                    f2905i = s3;
                    if (Build.VERSION.SDK_INT < 24) {
                        s3.a("vector", new P(2));
                        s3.a("animated-vector", new P(1));
                        s3.a("animated-selector", new P(0));
                    }
                }
                s2 = f2905i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s2;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (S.class) {
            Q q2 = f2906j;
            q2.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) q2.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final void a(String str, P p2) {
        if (this.f2908b == null) {
            this.f2908b = new C0268a();
        }
        this.f2908b.put(str, p2);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0270c c0270c = (C0270c) this.f2910d.get(context);
                if (c0270c == null) {
                    c0270c = new C0270c();
                    this.f2910d.put(context, c0270c);
                }
                c0270c.e(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) {
        if (this.f2911e == null) {
            this.f2911e = new TypedValue();
        }
        TypedValue typedValue = this.f2911e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        LayerDrawable layerDrawable = null;
        if (this.f2913g != null && i2 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131165201)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        C0270c c0270c = (C0270c) this.f2910d.get(context);
        if (c0270c == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0270c.d(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b2 = AbstractC0269b.b(c0270c.f3231f, c0270c.f3233h, j2);
            if (b2 >= 0) {
                Object[] objArr = c0270c.f3232g;
                Object obj = objArr[b2];
                Object obj2 = C0270c.f3229i;
                if (obj != obj2) {
                    objArr[b2] = obj2;
                    c0270c.f3230e = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2);
    }

    public final synchronized Drawable g(Context context, int i2) {
        Drawable j2;
        try {
            if (!this.f2912f) {
                this.f2912f = true;
                Drawable f2 = f(context, R.drawable.abc_vector_test);
                if (f2 == null || (!(f2 instanceof S.q) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName()))) {
                    this.f2912f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            j2 = j(context, i2);
            if (j2 == null) {
                j2 = c(context, i2);
            }
            if (j2 == null) {
                j2 = AbstractC0288a.b(context, i2);
            }
            if (j2 != null) {
                j2 = l(context, i2, j2);
            }
            if (j2 != null) {
                A.b(j2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j2;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        C0277j c0277j;
        WeakHashMap weakHashMap = this.f2907a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c0277j = (C0277j) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0277j.c(i2, null);
        if (colorStateList == null) {
            C0239o c0239o = this.f2913g;
            if (c0239o != null) {
                colorStateList2 = c0239o.c(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f2907a == null) {
                    this.f2907a = new WeakHashMap();
                }
                C0277j c0277j2 = (C0277j) this.f2907a.get(context);
                if (c0277j2 == null) {
                    c0277j2 = new C0277j();
                    this.f2907a.put(context, c0277j2);
                }
                c0277j2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable j(Context context, int i2) {
        int next;
        C0268a c0268a = this.f2908b;
        if (c0268a == null || c0268a.isEmpty()) {
            return null;
        }
        C0277j c0277j = this.f2909c;
        if (c0277j != null) {
            String str = (String) c0277j.c(i2, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f2908b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f2909c = new C0277j();
        }
        if (this.f2911e == null) {
            this.f2911e = new TypedValue();
        }
        TypedValue typedValue = this.f2911e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f2909c.a(i2, name);
                P p2 = (P) this.f2908b.getOrDefault(name, null);
                if (p2 != null) {
                    e2 = p2.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e2 != null) {
                    e2.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, e2);
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (e2 == null) {
            this.f2909c.a(i2, "appcompat_skip_skip");
        }
        return e2;
    }

    public final synchronized void k(C0239o c0239o) {
        this.f2913g = c0239o;
    }

    public final Drawable l(Context context, int i2, Drawable drawable) {
        int i3;
        int i4;
        PorterDuffColorFilter h2;
        ColorStateList i5 = i(context, i2);
        if (i5 != null) {
            if (A.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = w0.j.c(drawable);
            AbstractC0309a.h(drawable, i5);
            PorterDuff.Mode mode = null;
            if (this.f2913g != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC0309a.i(drawable, mode);
            }
        } else {
            if (this.f2913g != null) {
                if (i2 == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int b2 = j0.b(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode2 = C0240p.f3024b;
                    C0239o.e(findDrawableByLayerId, b2, mode2);
                    C0239o.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), j0.b(context, R.attr.colorControlNormal), mode2);
                    C0239o.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), j0.b(context, R.attr.colorControlActivated), mode2);
                } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                    int a2 = j0.a(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode3 = C0240p.f3024b;
                    C0239o.e(findDrawableByLayerId2, a2, mode3);
                    C0239o.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), j0.b(context, R.attr.colorControlActivated), mode3);
                    C0239o.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), j0.b(context, R.attr.colorControlActivated), mode3);
                }
            }
            C0239o c0239o = this.f2913g;
            boolean z2 = false;
            if (c0239o != null) {
                PorterDuff.Mode mode4 = C0240p.f3024b;
                if (C0239o.a((int[]) c0239o.f3015a, i2)) {
                    i4 = -1;
                    z2 = true;
                    i3 = R.attr.colorControlNormal;
                } else if (C0239o.a((int[]) c0239o.f3017c, i2)) {
                    i4 = -1;
                    z2 = true;
                    i3 = R.attr.colorControlActivated;
                } else {
                    boolean a3 = C0239o.a((int[]) c0239o.f3018d, i2);
                    i3 = android.R.attr.colorBackground;
                    if (a3) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i2 == 2131165227) {
                        i4 = Math.round(40.8f);
                        z2 = true;
                        i3 = android.R.attr.colorForeground;
                    } else if (i2 != R.drawable.abc_dialog_material_background) {
                        i4 = -1;
                        i3 = 0;
                    }
                    i4 = -1;
                    z2 = true;
                }
                if (z2) {
                    Drawable mutate = A.a(drawable) ? drawable.mutate() : drawable;
                    int b3 = j0.b(context, i3);
                    synchronized (C0240p.class) {
                        h2 = h(b3, mode4);
                    }
                    mutate.setColorFilter(h2);
                    if (i4 != -1) {
                        mutate.setAlpha(i4);
                    }
                }
            }
        }
        return drawable;
    }
}
