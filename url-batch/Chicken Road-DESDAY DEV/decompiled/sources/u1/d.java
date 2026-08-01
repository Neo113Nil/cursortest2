package u1;

import B.r;
import K.C0011l;
import K.G;
import K.S;
import K.a0;
import T.s;
import X.V;
import a.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.playgen.securelock.R;
import f0.I;
import f0.U;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import l.N0;

/* loaded from: classes.dex */
public abstract class d implements a0 {
    public d() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f31c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList B(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B.m mVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        B.n nVar = new B.n(resources, theme);
        synchronized (r.f42c) {
            try {
                SparseArray sparseArray = (SparseArray) r.f41b.get(nVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (mVar = (B.m) sparseArray.get(i)) != null) {
                    if (mVar.f30b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (mVar.f31c != 0) {
                            }
                            colorStateList2 = mVar.f29a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = r.f40a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = B.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return B.l.b(resources, i, theme);
        }
        synchronized (r.f42c) {
            try {
                WeakHashMap weakHashMap = r.f41b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(nVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(nVar, sparseArray2);
                }
                sparseArray2.append(i, new B.m(colorStateList, nVar.f32a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList C(Context context, C0011l c0011l, int i) {
        int resourceId;
        ColorStateList B2;
        TypedArray typedArray = (TypedArray) c0011l.f423c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (B2 = B(context, resourceId)) == null) ? c0011l.g(i) : B2;
    }

    public static ColorStateList D(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList B2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (B2 = B(context, resourceId)) == null) ? typedArray.getColorStateList(i) : B2;
    }

    public static ColorStateList E(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !A0.a.r(drawable)) {
            return null;
        }
        colorStateList = A0.a.e(drawable).getColorStateList();
        return colorStateList;
    }

    public static float F(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable G(Context context, int i) {
        return N0.b().c(context, i);
    }

    public static Drawable H(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable G2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (G2 = G(context, resourceId)) == null) ? typedArray.getDrawable(i) : G2;
    }

    public static Set I() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static int T(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(V.d("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static boolean V(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean X() {
        return e.d;
    }

    public static int Z(int i, P0.b bVar) {
        b1.d.e(bVar, "type");
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            if (i < 80) {
                if (i < 50) {
                    return R.string.strength_weak;
                }
                return R.string.strength_medium;
            }
            return R.string.strength_strong;
        }
        if (ordinal == 2) {
            if (i < 90) {
                if (i < 60) {
                    return R.string.strength_weak;
                }
                return R.string.strength_medium;
            }
            return R.string.strength_strong;
        }
        if (ordinal != 4) {
            if (i < 85) {
                if (i < 55) {
                    return R.string.strength_weak;
                }
                return R.string.strength_medium;
            }
            return R.string.strength_strong;
        }
        if (i < 64) {
            if (i < 40) {
                return R.string.strength_weak;
            }
            return R.string.strength_medium;
        }
        return R.string.strength_strong;
    }

    public static List a0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        b1.d.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Typeface b0(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, m(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static float c0(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.c(edgeEffect, f2, f3);
        }
        Q.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static void d(Button button, P0.c cVar, boolean z2) {
        float f2 = button.getResources().getDisplayMetrics().density;
        button.setStateListAnimator(null);
        WeakHashMap weakHashMap = S.f369a;
        G.q(button, null);
        g(button, cVar, z2, f2, false, false);
        button.setOnTouchListener(new R0.a(button, cVar, z2, f2, false));
    }

    public static void e(LinearLayout linearLayout, P0.c cVar) {
        linearLayout.setBackground(i0(-872415232, cVar.f643b, 16.0f, 2, linearLayout.getResources().getDisplayMetrics().density));
    }

    public static void f(Switch r3, P0.c cVar) {
        int[][] iArr = {new int[]{android.R.attr.state_checked}, new int[0]};
        int i = cVar.f643b;
        r3.setThumbTintList(new ColorStateList(iArr, new int[]{i, 1728053247}));
        r3.setTrackTintList(new ColorStateList(iArr, new int[]{i | 1426063360, 872415231}));
    }

    public static void g(Button button, P0.c cVar, boolean z2, float f2, boolean z3, boolean z4) {
        int i;
        int i2 = cVar.f643b;
        if (!z4 || z2) {
            if (z4 && z2) {
                i = (l.n((int) (((255 - r1) * 0.15f) + ((i2 >> 16) & 255)), 0, 255) << 16) | (-16777216) | (l.n((int) (((255 - r3) * 0.15f) + ((i2 >> 8) & 255)), 0, 255) << 8) | l.n((int) (((255 - r4) * 0.15f) + (i2 & 255)), 0, 255);
            } else if (!z2) {
                i = cVar.f645e;
            }
            button.setBackground(i0(i, i2, 12.0f, (z3 || !(z2 || z4)) ? 2 : 3, f2));
            if (!z2 || z4) {
                i2 = cVar.f642a;
            }
            button.setTextColor(i2);
        }
        i = i2;
        button.setBackground(i0(i, i2, 12.0f, (z3 || !(z2 || z4)) ? 2 : 3, f2));
        if (!z2) {
        }
        i2 = cVar.f642a;
        button.setTextColor(i2);
    }

    public static void h(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                D.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                D.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                D.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void h0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        D.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static GradientDrawable i0(int i, int i2, float f2, int i3, float f3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f2 * f3);
        gradientDrawable.setColor(i);
        int i4 = (int) (i3 * f3);
        if (i4 < 1) {
            i4 = 1;
        }
        gradientDrawable.setStroke(i4, i2);
        return gradientDrawable;
    }

    public static int j0(String str) {
        HashSet hashSet = new HashSet();
        int length = str.length();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            hashSet.add(Character.valueOf(charAt));
            if (Character.isUpperCase(charAt)) {
                z2 = true;
            } else if (Character.isLowerCase(charAt)) {
                z3 = true;
            } else if (Character.isDigit(charAt)) {
                z4 = true;
            } else {
                z5 = true;
            }
        }
        int i2 = z2 ? 10 : 0;
        if (z3) {
            i2 += 10;
        }
        if (z4) {
            i2 += 10;
        }
        if (z5) {
            i2 += 10;
        }
        int size = hashSet.size() * 2;
        if (size > 20) {
            size = 20;
        }
        return (str.length() * 3) + i2 + size;
    }

    public static void k(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new f1.c(2, 36, 1));
        }
    }

    public static final void k0(View view, y yVar) {
        b1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static void l(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    public static int m(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void n0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = S.f369a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static void o0(View view, I0.g gVar) {
        B0.a aVar = gVar.f275a.f262b;
        if (aVar == null || !aVar.f52a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = S.f369a;
            f2 += G.i((View) parent);
        }
        I0.f fVar = gVar.f275a;
        if (fVar.f269l != f2) {
            fVar.f269l = f2;
            gVar.m();
        }
    }

    public static final void p(z1.h hVar, Throwable th) {
        if (hVar != null) {
            if (th == null) {
                hVar.close();
                return;
            }
            try {
                hVar.close();
            } catch (Throwable th2) {
                l.e(th, th2);
            }
        }
    }

    public static void p0(Drawable drawable, int i) {
        D.a.g(drawable, i);
    }

    public static int q(U u2, T.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(I.H(view) - I.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int r(U u2, T.g gVar, View view, View view2, I i, boolean z2, boolean z3) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (u2.b() - Math.max(I.H(view), I.H(view2))) - 1) : Math.max(0, Math.min(I.H(view), I.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int r0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int s(U u2, T.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return u2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1)) * u2.b());
    }

    public static ImageView.ScaleType t(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s u(Context context) {
        ProviderInfo providerInfo;
        H.e eVar;
        ApplicationInfo applicationInfo;
        I0.e cVar = Build.VERSION.SDK_INT >= 28 ? new T.c(5) : new I0.e(5);
        PackageManager packageManager = context.getPackageManager();
        l.k(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] j2 = cVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j2) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new H.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (eVar != null) {
                return null;
            }
            return new s(new T.r(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static l v(int i) {
        if (i != 0 && i == 1) {
            return new I0.d();
        }
        return new I0.i();
    }

    public static final boolean z(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public H.k A(int i, H.k[] kVarArr) {
        new I0.e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        H.k kVar = null;
        int i3 = Integer.MAX_VALUE;
        for (H.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f224c - i2) * 2) + (kVar2.d == z2 ? 0 : 1);
            if (kVar == null || i3 > abs) {
                kVar = kVar2;
                i3 = abs;
            }
        }
        return kVar;
    }

    public abstract int J();

    public abstract InputFilter[] K(InputFilter[] inputFilterArr);

    public abstract int L();

    public abstract int M();

    public abstract int N();

    public abstract int O(View view);

    public abstract int P(CoordinatorLayout coordinatorLayout);

    public abstract int Q();

    public int R(View view) {
        return 0;
    }

    public int S() {
        return 0;
    }

    public abstract boolean U(float f2);

    public abstract boolean W(View view);

    public abstract boolean Y(float f2, float f3);

    @Override // K.a0
    public void b() {
    }

    @Override // K.a0
    public void c() {
    }

    public void d0(View view, int i) {
    }

    public abstract void e0(int i);

    public abstract void f0(View view, int i, int i2);

    public abstract void g0(View view, float f2, float f3);

    public abstract int i(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float j(int i);

    public abstract void l0(boolean z2);

    public abstract void m0(boolean z2);

    public abstract int n(View view, int i);

    public abstract int o(View view, int i);

    public abstract boolean q0(View view, float f2);

    public abstract boolean s0(View view, int i);

    public abstract void t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract Typeface w(Context context, B.g gVar, Resources resources, int i);

    public abstract Typeface x(Context context, H.k[] kVarArr, int i);

    public Typeface y(Context context, Resources resources, int i, String str, int i2) {
        File B2 = l.B(context);
        if (B2 == null) {
            return null;
        }
        try {
            if (l.p(B2, resources, i)) {
                return Typeface.createFromFile(B2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            B2.delete();
        }
    }
}
