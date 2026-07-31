package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import h.AbstractC2431a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: i, reason: collision with root package name */
    private static O f10713i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f10715a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.g f10716b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.collection.h f10717c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f10718d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f10719e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10720f;

    /* renamed from: g, reason: collision with root package name */
    private c f10721g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f10712h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final a f10714j = new a(6);

    private static class a extends androidx.collection.e {
        public a(int i4) {
            super(i4);
        }

        private static int b(int i4, PorterDuff.Mode mode) {
            return ((i4 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter c(int i4, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i4, mode)));
        }

        PorterDuffColorFilter d(int i4, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i4, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i4, Drawable drawable);

        PorterDuff.Mode b(int i4);

        Drawable c(O o4, Context context, int i4);

        ColorStateList d(Context context, int i4);

        boolean e(Context context, int i4, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j4, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            androidx.collection.d dVar = (androidx.collection.d) this.f10718d.get(context);
            if (dVar == null) {
                dVar = new androidx.collection.d();
                this.f10718d.put(context, dVar);
            }
            dVar.m(j4, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i4, ColorStateList colorStateList) {
        if (this.f10715a == null) {
            this.f10715a = new WeakHashMap();
        }
        androidx.collection.h hVar = (androidx.collection.h) this.f10715a.get(context);
        if (hVar == null) {
            hVar = new androidx.collection.h();
            this.f10715a.put(context, hVar);
        }
        hVar.a(i4, colorStateList);
    }

    private void c(Context context) {
        if (this.f10720f) {
            return;
        }
        this.f10720f = true;
        Drawable i4 = i(context, AbstractC2431a.f36683a);
        if (i4 == null || !p(i4)) {
            this.f10720f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable e(Context context, int i4) {
        if (this.f10719e == null) {
            this.f10719e = new TypedValue();
        }
        TypedValue typedValue = this.f10719e;
        context.getResources().getValue(i4, typedValue, true);
        long d4 = d(typedValue);
        Drawable h4 = h(context, d4);
        if (h4 != null) {
            return h4;
        }
        c cVar = this.f10721g;
        Drawable c4 = cVar == null ? null : cVar.c(this, context, i4);
        if (c4 != null) {
            c4.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d4, c4);
        }
        return c4;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized O g() {
        O o4;
        synchronized (O.class) {
            try {
                if (f10713i == null) {
                    O o5 = new O();
                    f10713i = o5;
                    o(o5);
                }
                o4 = f10713i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o4;
    }

    private synchronized Drawable h(Context context, long j4) {
        androidx.collection.d dVar = (androidx.collection.d) this.f10718d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) dVar.i(j4);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.n(j4);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter c4;
        synchronized (O.class) {
            a aVar = f10714j;
            c4 = aVar.c(i4, mode);
            if (c4 == null) {
                c4 = new PorterDuffColorFilter(i4, mode);
                aVar.d(i4, mode, c4);
            }
        }
        return c4;
    }

    private ColorStateList m(Context context, int i4) {
        androidx.collection.h hVar;
        WeakHashMap weakHashMap = this.f10715a;
        if (weakHashMap == null || (hVar = (androidx.collection.h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.j(i4);
    }

    private static void o(O o4) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof l0.c) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i4) {
        int next;
        androidx.collection.g gVar = this.f10716b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        androidx.collection.h hVar = this.f10717c;
        if (hVar != null) {
            String str = (String) hVar.j(i4);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f10716b.get(str) == null)) {
                return null;
            }
        } else {
            this.f10717c = new androidx.collection.h();
        }
        if (this.f10719e == null) {
            this.f10719e = new TypedValue();
        }
        TypedValue typedValue = this.f10719e;
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        long d4 = d(typedValue);
        Drawable h4 = h(context, d4);
        if (h4 != null) {
            return h4;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i4);
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
                this.f10717c.a(i4, name);
                b bVar = (b) this.f10716b.get(name);
                if (bVar != null) {
                    h4 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h4 != null) {
                    h4.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d4, h4);
                }
            } catch (Exception e4) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e4);
            }
        }
        if (h4 == null) {
            this.f10717c.a(i4, "appcompat_skip_skip");
        }
        return h4;
    }

    private Drawable u(Context context, int i4, boolean z4, Drawable drawable) {
        ColorStateList l4 = l(context, i4);
        if (l4 != null) {
            Drawable l5 = androidx.core.graphics.drawable.a.l(drawable.mutate());
            androidx.core.graphics.drawable.a.i(l5, l4);
            PorterDuff.Mode n4 = n(i4);
            if (n4 != null) {
                androidx.core.graphics.drawable.a.j(l5, n4);
            }
            return l5;
        }
        c cVar = this.f10721g;
        if ((cVar == null || !cVar.e(context, i4, drawable)) && !w(context, i4, drawable) && z4) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, X x4, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = x4.f10856d;
        if (z4 || x4.f10855c) {
            drawable.setColorFilter(f(z4 ? x4.f10853a : null, x4.f10855c ? x4.f10854b : f10712h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i4) {
        return j(context, i4, false);
    }

    synchronized Drawable j(Context context, int i4, boolean z4) {
        Drawable q4;
        try {
            c(context);
            q4 = q(context, i4);
            if (q4 == null) {
                q4 = e(context, i4);
            }
            if (q4 == null) {
                q4 = androidx.core.content.a.g(context, i4);
            }
            if (q4 != null) {
                q4 = u(context, i4, z4, q4);
            }
            if (q4 != null) {
                F.b(q4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q4;
    }

    synchronized ColorStateList l(Context context, int i4) {
        ColorStateList m4;
        m4 = m(context, i4);
        if (m4 == null) {
            c cVar = this.f10721g;
            m4 = cVar == null ? null : cVar.d(context, i4);
            if (m4 != null) {
                b(context, i4, m4);
            }
        }
        return m4;
    }

    PorterDuff.Mode n(int i4) {
        c cVar = this.f10721g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i4);
    }

    public synchronized void r(Context context) {
        androidx.collection.d dVar = (androidx.collection.d) this.f10718d.get(context);
        if (dVar != null) {
            dVar.a();
        }
    }

    synchronized Drawable s(Context context, j0 j0Var, int i4) {
        try {
            Drawable q4 = q(context, i4);
            if (q4 == null) {
                q4 = j0Var.a(i4);
            }
            if (q4 == null) {
                return null;
            }
            return u(context, i4, false, q4);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f10721g = cVar;
    }

    boolean w(Context context, int i4, Drawable drawable) {
        c cVar = this.f10721g;
        return cVar != null && cVar.a(context, i4, drawable);
    }
}
