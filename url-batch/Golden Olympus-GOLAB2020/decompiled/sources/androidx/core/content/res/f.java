package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.d;
import androidx.core.content.res.f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f11743a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f11744b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f11745c = new Object();

    static class a {
        static Drawable a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getDrawable(i4, theme);
        }

        static Drawable b(Resources resources, int i4, int i5, Resources.Theme theme) {
            return resources.getDrawableForDensity(i4, i5, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getColor(i4, theme);
        }

        static ColorStateList b(Resources resources, int i4, Resources.Theme theme) {
            return resources.getColorStateList(i4, theme);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f11746a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f11747b;

        /* renamed from: c, reason: collision with root package name */
        final int f11748c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f11746a = colorStateList;
            this.f11747b = configuration;
            this.f11748c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Resources f11749a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f11750b;

        d(Resources resources, Resources.Theme theme) {
            this.f11749a = resources;
            this.f11750b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f11749a.equals(dVar.f11749a) && A.c.a(this.f11750b, dVar.f11750b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return A.c.b(this.f11749a, this.f11750b);
        }
    }

    public static abstract class e {
        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(final int i4, Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: androidx.core.content.res.h
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.onFontRetrievalFailed(i4);
                }
            });
        }

        public final void callbackSuccessAsync(final Typeface typeface, Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: androidx.core.content.res.g
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.onFontRetrieved(typeface);
                }
            });
        }

        public abstract void onFontRetrievalFailed(int i4);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.f$f, reason: collision with other inner class name */
    public static final class C0094f {

        /* renamed from: androidx.core.content.res.f$f$a */
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f11751a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f11752b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f11753c;

            static void a(Resources.Theme theme) {
                synchronized (f11751a) {
                    if (!f11753c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f11752b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e4) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e4);
                        }
                        f11753c = true;
                    }
                    Method method = f11752b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException e5) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e5);
                            f11752b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.f$f$b */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i4, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f11745c) {
            try {
                WeakHashMap weakHashMap = f11744b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i4, new c(colorStateList, dVar.f11749a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f11748c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList b(d dVar, int i4) {
        c cVar;
        synchronized (f11745c) {
            try {
                SparseArray sparseArray = (SparseArray) f11744b.get(dVar);
                if (sparseArray != null && sparseArray.size() > 0 && (cVar = (c) sparseArray.get(i4)) != null) {
                    if (cVar.f11747b.equals(dVar.f11749a.getConfiguration())) {
                        Resources.Theme theme = dVar.f11750b;
                        if (theme == null) {
                            if (cVar.f11748c != 0) {
                            }
                            return cVar.f11746a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i4);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface c(Context context, int i4) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i4, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i4, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b4 = b(dVar, i4);
        if (b4 != null) {
            return b4;
        }
        ColorStateList k4 = k(resources, i4, theme);
        if (k4 == null) {
            return b.b(resources, i4, theme);
        }
        a(dVar, i4, k4, theme);
        return k4;
    }

    public static Drawable e(Resources resources, int i4, Resources.Theme theme) {
        return a.a(resources, i4, theme);
    }

    public static Drawable f(Resources resources, int i4, int i5, Resources.Theme theme) {
        return a.b(resources, i4, i5, theme);
    }

    public static Typeface g(Context context, int i4) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i4, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i4, TypedValue typedValue, int i5, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i4, typedValue, i5, eVar, null, true, false);
    }

    public static void i(Context context, int i4, e eVar, Handler handler) {
        A.h.f(eVar);
        if (context.isRestricted()) {
            eVar.callbackFailAsync(-4, handler);
        } else {
            m(context, i4, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal threadLocal = f11743a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i4, Resources.Theme theme) {
        if (l(resources, i4)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i4), theme);
        } catch (Exception e4) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            return null;
        }
    }

    private static boolean l(Resources resources, int i4) {
        TypedValue j4 = j();
        resources.getValue(i4, j4, true);
        int i5 = j4.type;
        return i5 >= 28 && i5 <= 31;
    }

    private static Typeface m(Context context, int i4, TypedValue typedValue, int i5, e eVar, Handler handler, boolean z4, boolean z5) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        Typeface n4 = n(context, resources, typedValue, i4, i5, eVar, handler, z4, z5);
        if (n4 != null || eVar != null || z5) {
            return n4;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface n(Context context, Resources resources, TypedValue typedValue, int i4, int i5, e eVar, Handler handler, boolean z4, boolean z5) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i4) + "\" (" + Integer.toHexString(i4) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            if (eVar != null) {
                eVar.callbackFailAsync(-3, handler);
            }
            return null;
        }
        Typeface f4 = androidx.core.graphics.c.f(resources, i4, charSequence2, typedValue.assetCookie, i5);
        if (f4 != null) {
            if (eVar != null) {
                eVar.callbackSuccessAsync(f4, handler);
            }
            return f4;
        }
        if (z5) {
            return null;
        }
        try {
            if (!charSequence2.toLowerCase().endsWith(".xml")) {
                Typeface d4 = androidx.core.graphics.c.d(context, resources, i4, charSequence2, typedValue.assetCookie, i5);
                if (eVar != null) {
                    if (d4 != null) {
                        eVar.callbackSuccessAsync(d4, handler);
                        return d4;
                    }
                    eVar.callbackFailAsync(-3, handler);
                }
                return d4;
            }
            d.b b4 = androidx.core.content.res.d.b(resources.getXml(i4), resources);
            if (b4 == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (eVar != null) {
                    eVar.callbackFailAsync(-3, handler);
                }
                return null;
            }
            try {
                return androidx.core.graphics.c.c(context, b4, resources, i4, charSequence2, typedValue.assetCookie, i5, eVar, handler, z4);
            } catch (IOException e4) {
                e = e4;
                charSequence2 = charSequence2;
                Log.e("ResourcesCompat", "Failed to read xml resource " + charSequence2, e);
                if (eVar != null) {
                    eVar.callbackFailAsync(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e5) {
                e = e5;
                charSequence2 = charSequence2;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + charSequence2, e);
                if (eVar != null) {
                }
                return null;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (XmlPullParserException e7) {
            e = e7;
        }
    }
}
