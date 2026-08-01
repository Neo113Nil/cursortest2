package s1;

import B.r;
import K.C0011l;
import K.G;
import K.S;
import K.a0;
import T.u;
import X.V;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.visualfortune.eyerest.R;
import f0.I;
import f0.U;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class d implements a0, Q.j {
    public d() {
        new ConcurrentHashMap();
    }

    public static final Class D(Z0.b bVar) {
        Class a2 = bVar.a();
        Z0.d.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class E(e1.a aVar) {
        Z0.d.e(aVar, "<this>");
        Class a2 = ((Z0.a) aVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static int M(int i) {
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

    public static boolean O(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean Q() {
        return e.d;
    }

    public static Typeface S(Configuration configuration, Typeface typeface) {
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
        create = Typeface.create(typeface, i(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static float V(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.c(edgeEffect, f2, f3);
        }
        Q.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static U.b b0(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j2 = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j4 + j2));
                    U.b bVar = new U.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f352a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f353b = i6;
                    bVar.f354c = ((ByteBuffer) bVar.d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void c0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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

    public static void d(Throwable th, Throwable th2) {
        Z0.d.e(th, "<this>");
        Z0.d.e(th2, "exception");
        if (th != th2) {
            Integer num = U0.a.f806a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = T0.a.f805a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void d0(View view, h0.f fVar) {
        Z0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static void e(StringBuilder sb, Object obj, Y0.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static void f(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    public static void g0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = S.f362a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static void h0(View view, I0.g gVar) {
        B0.a aVar = gVar.f268a.f255b;
        if (aVar == null || !aVar.f50a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = S.f362a;
            f2 += G.i((View) parent);
        }
        I0.f fVar = gVar.f268a;
        if (fVar.f262l != f2) {
            fVar.f262l = f2;
            gVar.m();
        }
    }

    public static int i(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void i0(Drawable drawable, int i) {
        D.a.g(drawable, i);
    }

    public static int k0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int l(U u2, T.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(I.H(view) - I.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int m(U u2, T.g gVar, View view, View view2, I i, boolean z2, boolean z3) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (u2.b() - Math.max(I.H(view), I.H(view2))) - 1) : Math.max(0, Math.min(I.H(view), I.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int n(U u2, T.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return u2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1)) * u2.b());
    }

    public static ImageView.ScaleType o(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static l p(int i) {
        if (i != 0 && i == 1) {
            return new I0.d();
        }
        return new I0.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f29c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList u(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B.m mVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        B.n nVar = new B.n(resources, theme);
        synchronized (r.f40c) {
            try {
                SparseArray sparseArray = (SparseArray) r.f39b.get(nVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (mVar = (B.m) sparseArray.get(i)) != null) {
                    if (mVar.f28b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (mVar.f29c != 0) {
                            }
                            colorStateList2 = mVar.f27a;
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
        ThreadLocal threadLocal = r.f38a;
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
        synchronized (r.f40c) {
            try {
                WeakHashMap weakHashMap = r.f39b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(nVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(nVar, sparseArray2);
                }
                sparseArray2.append(i, new B.m(colorStateList, nVar.f30a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList v(Context context, C0011l c0011l, int i) {
        int resourceId;
        ColorStateList u2;
        TypedArray typedArray = (TypedArray) c0011l.f416c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (u2 = u(context, resourceId)) == null) ? c0011l.g(i) : u2;
    }

    public static ColorStateList w(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList u2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (u2 = u(context, resourceId)) == null) ? typedArray.getColorStateList(i) : u2;
    }

    public static ColorStateList x(Drawable drawable) {
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

    public static float y(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable z(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable z2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (z2 = l.z(context, resourceId)) == null) ? typedArray.getDrawable(i) : z2;
    }

    public abstract int A();

    public abstract InputFilter[] B(InputFilter[] inputFilterArr);

    public abstract int C();

    public abstract int F();

    public abstract int G();

    public abstract int H(View view);

    public abstract int I(CoordinatorLayout coordinatorLayout);

    public abstract int J();

    public int K(View view) {
        return 0;
    }

    public int L() {
        return 0;
    }

    public abstract boolean N(float f2);

    public abstract boolean P(View view);

    public abstract boolean R(float f2, float f3);

    public abstract void T(Throwable th);

    public abstract void U(u uVar);

    public void W(View view, int i) {
    }

    public abstract void X(int i);

    public abstract void Y(View view, int i, int i2);

    public abstract void Z(View view, float f2, float f3);

    public abstract Object a0(Intent intent, int i);

    @Override // K.a0
    public void b() {
    }

    @Override // K.a0
    public void c() {
    }

    public abstract void e0(boolean z2);

    public abstract void f0(boolean z2);

    public abstract int g(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float h(int i);

    public abstract int j(View view, int i);

    public abstract boolean j0(View view, float f2);

    public abstract int k(View view, int i);

    public abstract boolean l0(View view, int i);

    public abstract void m0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract Typeface q(Context context, B.g gVar, Resources resources, int i);

    public abstract Typeface r(Context context, H.k[] kVarArr, int i);

    public Typeface s(Context context, Resources resources, int i, String str, int i2) {
        File D2 = l.D(context);
        if (D2 == null) {
            return null;
        }
        try {
            if (l.q(D2, resources, i)) {
                return Typeface.createFromFile(D2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            D2.delete();
        }
    }

    public H.k t(int i, H.k[] kVarArr) {
        new I0.e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        H.k kVar = null;
        int i3 = Integer.MAX_VALUE;
        for (H.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f217c - i2) * 2) + (kVar2.d == z2 ? 0 : 1);
            if (kVar == null || i3 > abs) {
                kVar = kVar2;
                i3 = abs;
            }
        }
        return kVar;
    }
}
