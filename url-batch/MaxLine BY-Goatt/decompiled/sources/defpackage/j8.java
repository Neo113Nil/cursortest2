package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.InputEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class j8 {
    public static boolean A;
    public static Field B;
    public static boolean C;
    public static final my b;
    public static final ng0 e;
    public static final ng0 f;
    public static final ng0 g;
    public static final ng0 h;
    public static final ng0 i;
    public static final ng0 j;
    public static final ng0 k;
    public static final dq2 u;
    public static Field v;
    public static boolean w;
    public static Class x;
    public static boolean y;
    public static Field z;
    public static final Type[] a = new Type[0];
    public static final my c = new my(353158646, new ww(2), false);
    public static final my d = new my(-1342864713, new ww(3), false);
    public static final vg0 l = new vg0(false);
    public static final vg0 m = new vg0(true);
    public static final byte[] n = {48, 49, 53, 0};
    public static final byte[] o = {48, 49, 48, 0};
    public static final byte[] p = {48, 48, 57, 0};
    public static final byte[] q = {48, 48, 53, 0};
    public static final byte[] r = {48, 48, 49, 0};
    public static final byte[] s = {48, 48, 49, 0};
    public static final byte[] t = {48, 48, 50, 0};

    static {
        int i2 = 0;
        b = new my(349584988, new py(i2), false);
        int i3 = 1;
        e = new ng0("UNDEFINED", i3);
        f = new ng0("REUSABLE_CLAIMED", i3);
        g = new ng0("COMPLETING_ALREADY", i3);
        h = new ng0("COMPLETING_WAITING_CHILDREN", i3);
        i = new ng0("COMPLETING_RETRY", i3);
        j = new ng0("TOO_LATE_TO_CANCEL", i3);
        k = new ng0("SEALED", i3);
        u = new dq2(i2);
    }

    public static final yo0 A(yo0 yo0Var) {
        yo0 yo0Var2 = ((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).h;
        if (yo0Var2 == null || !yo0Var2.z) {
            return null;
        }
        return yo0Var2;
    }

    public static final w72 B(yo0 yo0Var) {
        ks1 ks1Var = yo0Var.t;
        return ks1Var != null ? yk3.D(ks1Var).M(ks1Var, false) : w72.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yo0 C(yo0 yo0Var) {
        boolean z2 = yo0Var.m.z;
        if (z2) {
            if (!z2) {
                h21.b("visitChildren called on an unattached node");
            }
            eo1 eo1Var = new eo1(new ul1[16]);
            ul1 ul1Var = yo0Var.m;
            ul1 ul1Var2 = ul1Var.r;
            if (ul1Var2 == null) {
                s03.b(eo1Var, ul1Var);
            } else {
                eo1Var.b(ul1Var2);
            }
            loop0: while (true) {
                int i2 = eo1Var.o;
                if (i2 == 0) {
                    break;
                }
                ul1 ul1Var3 = (ul1) eo1Var.l(i2 - 1);
                if ((ul1Var3.p & 1024) == 0) {
                    s03.b(eo1Var, ul1Var3);
                } else {
                    while (true) {
                        if (ul1Var3 == null) {
                            break;
                        }
                        if ((ul1Var3.o & 1024) != 0) {
                            eo1 eo1Var2 = null;
                            while (ul1Var3 != null) {
                                if (ul1Var3 instanceof yo0) {
                                    yo0 yo0Var2 = (yo0) ul1Var3;
                                    if (yo0Var2.m.z) {
                                        int ordinal = yo0Var2.I0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            a.b();
                                            return null;
                                        }
                                    }
                                } else if ((ul1Var3.o & 1024) != 0 && (ul1Var3 instanceof p90)) {
                                    int i3 = 0;
                                    for (ul1 ul1Var4 = ((p90) ul1Var3).B; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
                                        if ((ul1Var4.o & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                ul1Var3 = ul1Var4;
                                            } else {
                                                if (eo1Var2 == null) {
                                                    eo1Var2 = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var3 != null) {
                                                    eo1Var2.b(ul1Var3);
                                                    ul1Var3 = null;
                                                }
                                                eo1Var2.b(ul1Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                ul1Var3 = s03.c(eo1Var2);
                            }
                        } else {
                            ul1Var3 = ul1Var3.r;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList D(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        r92 r92Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        s92 s92Var = new s92(resources, theme);
        synchronized (t92.c) {
            try {
                SparseArray sparseArray = (SparseArray) t92.b.get(s92Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (r92Var = (r92) sparseArray.get(i2)) != null) {
                    if (r92Var.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (r92Var.c != 0) {
                            }
                            colorStateList2 = r92Var.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = t92.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = lw.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (t92.c) {
            try {
                WeakHashMap weakHashMap = t92.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(s92Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(s92Var, sparseArray2);
                }
                sparseArray2.append(i2, new r92(colorStateList, s92Var.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static final float E(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static Drawable F(Context context, int i2) {
        return p92.b().c(context, i2);
    }

    public static Type G(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return G(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return G(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class I(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            yk3.s(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) I(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return I(((WildcardType) type).getUpperBounds()[0]);
        }
        a.d("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static final boolean J(a50 a50Var) {
        g61 g61Var = (g61) a50Var.n().m(qb2.U);
        if (g61Var != null) {
            return g61Var.b();
        }
        return true;
    }

    public static final boolean K(yo0 yo0Var) {
        i91 i91Var;
        ks1 ks1Var;
        i91 i91Var2;
        ks1 ks1Var2 = yo0Var.t;
        return (ks1Var2 == null || (i91Var = ks1Var2.A) == null || !i91Var.J() || (ks1Var = yo0Var.t) == null || (i91Var2 = ks1Var.A) == null || !i91Var2.I()) ? false : true;
    }

    public static final boolean L(long j2) {
        return (j2 & 2) != 0;
    }

    public static final boolean M(long j2) {
        return (j2 & 1) != 0;
    }

    public static final boolean N(i91 i91Var) {
        if (i91Var.s == null) {
            return false;
        }
        i91 u2 = i91Var.u();
        return (u2 != null ? u2.s : null) == null || i91Var.Q.b;
    }

    public static final boolean O(ry1 ry1Var) {
        ry1Var.l().getClass();
        w(ry1Var);
        return w(ry1Var) <= 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void P(ul1 ul1Var, Function0 function0) {
        yt1 yt1Var = ul1Var.s;
        if (yt1Var == null) {
            yt1Var = new yt1((xt1) ul1Var);
            ul1Var.s = yt1Var;
        }
        ((t7) s03.K(ul1Var)).getSnapshotObserver().a(yt1Var, gs1.o, function0);
    }

    public static final void Q(float[] fArr, float[] fArr2) {
        float v2 = v(fArr2, 0, fArr, 0);
        float v3 = v(fArr2, 0, fArr, 1);
        float v4 = v(fArr2, 0, fArr, 2);
        float v5 = v(fArr2, 0, fArr, 3);
        float v6 = v(fArr2, 1, fArr, 0);
        float v7 = v(fArr2, 1, fArr, 1);
        float v8 = v(fArr2, 1, fArr, 2);
        float v9 = v(fArr2, 1, fArr, 3);
        float v10 = v(fArr2, 2, fArr, 0);
        float v11 = v(fArr2, 2, fArr, 1);
        float v12 = v(fArr2, 2, fArr, 2);
        float v13 = v(fArr2, 2, fArr, 3);
        float v14 = v(fArr2, 3, fArr, 0);
        float v15 = v(fArr2, 3, fArr, 1);
        float v16 = v(fArr2, 3, fArr, 2);
        float v17 = v(fArr2, 3, fArr, 3);
        fArr[0] = v2;
        fArr[1] = v3;
        fArr[2] = v4;
        fArr[3] = v5;
        fArr[4] = v6;
        fArr[5] = v7;
        fArr[6] = v8;
        fArr[7] = v9;
        fArr[8] = v10;
        fArr[9] = v11;
        fArr[10] = v12;
        fArr[11] = v13;
        fArr[12] = v14;
        fArr[13] = v15;
        fArr[14] = v16;
        fArr[15] = v17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013a, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013c, code lost:
    
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013f, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a A[EDGE_INSN: B:24:0x013a->B:25:0x013a BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [d] */
    /* JADX WARN: Type inference failed for: r11v4, types: [d] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type T(Type type, Class cls, Type type2, HashMap hashMap) {
        Type T;
        Type cVar;
        TypeVariable typeVariable = null;
        while (true) {
            int i2 = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                hashMap.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 != null) {
                    Type G = G(type, cls, cls3);
                    if (G instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i2 < length) {
                            if (typeVariable2.equals(typeParameters[i2])) {
                                type2 = ((ParameterizedType) G).getActualTypeArguments()[i2];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            } else {
                                i2++;
                            }
                        }
                        b71.f();
                        return null;
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls4 = type2;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type T2 = T(type, cls, componentType, hashMap);
                        if (y(componentType, T2)) {
                            type2 = cls4;
                        } else {
                            cVar = new b(T2);
                            type2 = cVar;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type T3 = T(type, cls, genericComponentType, hashMap);
                    if (!y(genericComponentType, T3)) {
                        cVar = new b(T3);
                        type2 = cVar;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type T4 = T(type, cls, ownerType, hashMap);
                    boolean z2 = !y(T4, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i2 < length2) {
                        Type T5 = T(type, cls, actualTypeArguments[i2], hashMap);
                        if (!y(T5, actualTypeArguments[i2])) {
                            if (!z2) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z2 = true;
                            }
                            actualTypeArguments[i2] = T5;
                        }
                        i2++;
                    }
                    if (z2) {
                        cVar = new c(T4, type2.getRawType(), actualTypeArguments);
                        type2 = cVar;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type T6 = T(type, cls, lowerBounds[0], hashMap);
                        if (T6 != lowerBounds[0]) {
                            type2 = new d(new Type[]{Object.class}, T6 instanceof WildcardType ? ((WildcardType) T6).getLowerBounds() : new Type[]{T6});
                        }
                    } else if (upperBounds.length == 1 && (T = T(type, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        type2 = new d(T instanceof WildcardType ? ((WildcardType) T).getUpperBounds() : new Type[]{T}, a);
                    }
                }
            }
        }
    }

    public static final void U(o30 o30Var, Object obj) {
        if (!(o30Var instanceof pb0)) {
            o30Var.resumeWith(obj);
            return;
        }
        pb0 pb0Var = (pb0) o30Var;
        t40 t40Var = pb0Var.p;
        r30 r30Var = pb0Var.q;
        Throwable a2 = aa2.a(obj);
        Object gxVar = a2 == null ? obj : new gx(a2, false);
        if (t40Var.P(r30Var.getContext())) {
            pb0Var.r = gxVar;
            pb0Var.o = 1;
            t40Var.N(r30Var.getContext(), pb0Var);
            return;
        }
        pi0 a3 = bx2.a();
        if (a3.o >= 4294967296L) {
            pb0Var.r = gxVar;
            pb0Var.o = 1;
            a3.S(pb0Var);
            return;
        }
        a3.T(true);
        try {
            g61 g61Var = (g61) r30Var.getContext().m(qb2.U);
            if (g61Var == null || g61Var.b()) {
                Object obj2 = pb0Var.s;
                CoroutineContext context = r30Var.getContext();
                Object c2 = zw2.c(context, obj2);
                x13 c3 = c2 != zw2.a ? r40.c(r30Var, context, c2) : null;
                try {
                    r30Var.resumeWith(obj);
                    Unit unit = Unit.a;
                } finally {
                    if (c3 == null || c3.o0()) {
                        zw2.a(context, c2);
                    }
                }
            } else {
                pb0Var.resumeWith(ca2.a(g61Var.v()));
            }
            while (a3.V()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b((defpackage.cb1) r4.i(r0), (defpackage.cb1) r9.i(r0)) != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(yo0 yo0Var, int i2, Function1 function1) {
        int i3;
        Object obj;
        ul1 ul1Var;
        db1 db1Var;
        fs1 fs1Var;
        if (!yo0Var.m.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var2 = yo0Var.m.q;
        i91 J = s03.J(yo0Var);
        loop0: while (true) {
            i3 = 1;
            obj = null;
            if (J == null) {
                ul1Var = null;
                break;
            }
            if ((J.P.f.p & 1024) != 0) {
                while (ul1Var2 != null) {
                    if ((ul1Var2.o & 1024) != 0) {
                        ul1Var = ul1Var2;
                        eo1 eo1Var = null;
                        while (ul1Var != null) {
                            if (ul1Var instanceof yo0) {
                                break loop0;
                            }
                            if ((ul1Var.o & 1024) != 0 && (ul1Var instanceof p90)) {
                                int i4 = 0;
                                for (ul1 ul1Var3 = ((p90) ul1Var).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                    if ((ul1Var3.o & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            ul1Var = ul1Var3;
                                        } else {
                                            if (eo1Var == null) {
                                                eo1Var = new eo1(new ul1[16]);
                                            }
                                            if (ul1Var != null) {
                                                eo1Var.b(ul1Var);
                                                ul1Var = null;
                                            }
                                            eo1Var.b(ul1Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            ul1Var = s03.c(eo1Var);
                        }
                    }
                    ul1Var2 = ul1Var2.q;
                }
            }
            J = J.u();
            ul1Var2 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
        }
        yo0 yo0Var2 = (yo0) ul1Var;
        if (yo0Var2 != null) {
            u52 u52Var = wn.a;
        }
        cb1 cb1Var = (cb1) yo0Var.i(wn.a);
        if (cb1Var != null) {
            int i5 = 5;
            if (i2 != 5) {
                i5 = 6;
                if (i2 != 6) {
                    i5 = 3;
                    if (i2 != 3) {
                        i5 = 4;
                        if (i2 != 4) {
                            i5 = 2;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    lh.g("Unsupported direction for beyond bounds layout");
                                }
                                mp mpVar = cb1Var.b;
                                db1Var = cb1Var.a;
                                if (db1Var.b() > 0 || !db1Var.d()) {
                                    return function1.invoke(cb1.e);
                                }
                                int c2 = cb1Var.m(i3) ? db1Var.c() : db1Var.f();
                                c82 c82Var = new c82();
                                mpVar.getClass();
                                eo1 eo1Var2 = mpVar.a;
                                za1 za1Var = new za1(c2, c2);
                                eo1Var2.b(za1Var);
                                c82Var.m = za1Var;
                                while (obj == null && cb1Var.i((za1) c82Var.m, i3)) {
                                    za1 za1Var2 = (za1) c82Var.m;
                                    int i6 = za1Var2.a;
                                    int i7 = za1Var2.b;
                                    if (cb1Var.m(i3)) {
                                        i7++;
                                    } else {
                                        i6--;
                                    }
                                    za1 za1Var3 = new za1(i6, i7);
                                    eo1Var2.b(za1Var3);
                                    eo1Var2.k((za1) c82Var.m);
                                    c82Var.m = za1Var3;
                                    db1Var.e();
                                    obj = function1.invoke(new bb1(cb1Var, c82Var, i3));
                                }
                                eo1Var2.k((za1) c82Var.m);
                                db1Var.e();
                                return obj;
                            }
                        }
                    }
                }
            }
            i3 = i5;
            mp mpVar2 = cb1Var.b;
            db1Var = cb1Var.a;
            if (db1Var.b() > 0) {
            }
            return function1.invoke(cb1.e);
        }
        return null;
    }

    public static final void W(g2 g2Var, ai2 ai2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g2Var.a;
        Object g2 = ai2Var.k().m.g(gi2.f);
        if (g2 == null) {
            g2 = null;
        }
        nv nvVar = (nv) g2;
        if (nvVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(nvVar.a, nvVar.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g3 = ai2Var.k().m.g(gi2.e);
        if ((g3 != null ? g3 : null) != null) {
            List j2 = ai2.j(4, ai2Var);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ai2 ai2Var2 = (ai2) j2.get(i2);
                if (ai2Var2.k().m.c(gi2.H)) {
                    arrayList.add(ai2Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l2 = l(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(l2 ? 1 : arrayList.size(), l2 ? arrayList.size() : 1, false, 0));
    }

    public static String X(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final Object Y(Object obj) {
        v11 v11Var;
        w11 w11Var = obj instanceof w11 ? (w11) obj : null;
        return (w11Var == null || (v11Var = w11Var.a) == null) ? obj : v11Var;
    }

    public static void Z(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void a(int i2, a00 a00Var, vl1 vl1Var, Function1 function1) {
        a00Var.Z(-932836462);
        if ((((a00Var.h(function1) ? 32 : 16) | i2) & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else {
            nk2.a(a00Var, a.a(vl1Var, function1));
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new n8(i2, 4, vl1Var, function1);
        }
    }

    public static final m30 b(CoroutineContext coroutineContext) {
        if (coroutineContext.m(qb2.U) == null) {
            coroutineContext = coroutineContext.p(new i61(null));
        }
        return new m30(coroutineContext);
    }

    public static final void c(Function0 function0, cb0 cb0Var, my myVar, a00 a00Var, int i2) {
        Function0 function02;
        int i3;
        int i4;
        int i5;
        Object obj;
        a00Var.Z(826668973);
        int i6 = 2;
        if ((i2 & 6) == 0) {
            function02 = function0;
            i3 = (a00Var.h(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.f(cb0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var.h(myVar) ? 256 : 128;
        }
        int i7 = i3;
        if (a00Var.P(i7 & 1, (i7 & 147) != 146)) {
            View view = (View) a00Var.j(AndroidCompositionLocals_androidKt.f);
            ca0 ca0Var = (ca0) a00Var.j(p00.h);
            u81 u81Var = (u81) a00Var.j(p00.n);
            xz S = iv1.S(a00Var);
            zn1 k2 = ij2.k(myVar, a00Var);
            Object[] objArr = new Object[0];
            Object M = a00Var.M();
            Object obj2 = sz.a;
            Object obj3 = M;
            if (M == obj2) {
                Object obj4 = k8.s;
                a00Var.i0(obj4);
                obj3 = obj4;
            }
            UUID uuid = (UUID) ll3.R(objArr, (Function0) obj3, a00Var, 48);
            boolean f2 = a00Var.f(view) | a00Var.f(ca0Var);
            Object M2 = a00Var.M();
            if (f2 || M2 == obj2) {
                Function0 function03 = function02;
                i4 = 1;
                eb0 eb0Var = new eb0(function03, cb0Var, view, u81Var, ca0Var, uuid);
                my myVar2 = new my(346960332, new c0(i6, k2), true);
                ya0 ya0Var = eb0Var.t;
                ya0Var.setParentCompositionContext(S);
                ya0Var.v.setValue(myVar2);
                ya0Var.z = true;
                if (ya0Var.p == null && !ya0Var.isAttachedToWindow()) {
                    lh.g("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                    return;
                } else {
                    ya0Var.d();
                    a00Var.i0(eb0Var);
                    M2 = eb0Var;
                }
            } else {
                i4 = 1;
            }
            eb0 eb0Var2 = (eb0) M2;
            Unit unit = Unit.a;
            boolean h2 = a00Var.h(eb0Var2);
            Object M3 = a00Var.M();
            Object obj5 = M3;
            if (h2 || M3 == obj2) {
                Object f9Var = new f9(0, null, eb0Var2);
                a00Var.i0(f9Var);
                obj5 = f9Var;
            }
            l41.h(a00Var, unit, (Function2) obj5);
            boolean h3 = a00Var.h(eb0Var2);
            Object M4 = a00Var.M();
            if (h3 || M4 == obj2) {
                i5 = 0;
                Object g9Var = new g9(eb0Var2, i5);
                a00Var.i0(g9Var);
                obj = g9Var;
            } else {
                i5 = 0;
                obj = M4;
            }
            l41.f(eb0Var2, (Function1) obj, a00Var);
            int i8 = (a00Var.h(eb0Var2) ? 1 : 0) | ((i7 & 14) == 4 ? i4 : i5) | ((i7 & 112) == 32 ? i4 : i5) | (a00Var.d(u81Var.ordinal()) ? 1 : 0);
            Object M5 = a00Var.M();
            if (i8 != 0 || M5 == obj2) {
                Object h9Var = new h9(eb0Var2, function0, cb0Var, u81Var, 0);
                a00Var.i0(h9Var);
                M5 = h9Var;
            }
            l41.m((Function0) M5, a00Var);
        } else {
            a00Var.S();
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new i9(function0, cb0Var, myVar, i2, 0);
        }
    }

    public static final void d(vl1 vl1Var, Function2 function2, my myVar, Function2 function22, Function2 function23, int i2, long j2, long j3, z63 z63Var, my myVar2, a00 a00Var, int i3) {
        int i4;
        my myVar3;
        Function2 function24;
        Function2 function25;
        Function2 function26;
        long j4;
        long b2;
        z63 g2;
        Function2 function27;
        long j5;
        z63 z63Var2;
        int i5;
        long j6;
        Function2 function28;
        Function2 function29;
        a00Var.Z(-1219521777);
        int i6 = 2;
        if ((i3 & 6) == 0) {
            i4 = (a00Var.f(vl1Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i7 = i4 | 48;
        if ((i3 & 384) == 0) {
            myVar3 = myVar;
            i7 |= a00Var.h(myVar3) ? 256 : 128;
        } else {
            myVar3 = myVar;
        }
        int i8 = 224256 | i7;
        if ((1572864 & i3) == 0) {
            i8 = 748544 | i7;
        }
        if ((12582912 & i3) == 0) {
            i8 |= 4194304;
        }
        if ((100663296 & i3) == 0) {
            i8 |= 33554432;
        }
        if ((805306368 & i3) == 0) {
            i8 |= a00Var.h(myVar2) ? 536870912 : 268435456;
        }
        if ((306783379 & i8) == 306783378 && a00Var.B()) {
            a00Var.S();
            function27 = function2;
            function28 = function22;
            function29 = function23;
            i5 = i2;
            j6 = j2;
            j5 = j3;
            z63Var2 = z63Var;
        } else {
            a00Var.U();
            if ((i3 & 1) == 0 || a00Var.z()) {
                function24 = wy.a;
                function25 = wy.b;
                function26 = wy.c;
                j4 = ((gw) a00Var.j(hw.a)).n;
                b2 = hw.b(j4, a00Var);
                g2 = hl2.g(a00Var);
            } else {
                a00Var.S();
                function24 = function2;
                function25 = function22;
                function26 = function23;
                i6 = i2;
                j4 = j2;
                b2 = j3;
                g2 = z63Var;
            }
            a00Var.r();
            boolean f2 = a00Var.f(g2);
            Object M = a00Var.M();
            Function2 function210 = function24;
            Object obj = sz.a;
            if (f2 || M == obj) {
                M = new go1(g2);
                a00Var.i0(M);
            }
            go1 go1Var = (go1) M;
            boolean f3 = a00Var.f(go1Var) | a00Var.f(g2);
            int i9 = i6;
            Object M2 = a00Var.M();
            if (f3 || M2 == obj) {
                M2 = new p8(28, go1Var, g2);
                a00Var.i0(M2);
            }
            u52 u52Var = j83.a;
            Function2 function211 = function25;
            Function2 function212 = function26;
            long j7 = j4;
            long j8 = b2;
            kr2.a(bd3.n(vl1Var, new mc(5, (Function1) M2)), null, j7, j8, yj1.H(-1979205334, new rc(i9, function210, myVar2, function211, function212, go1Var, myVar3), a00Var), a00Var, 12582912, 114);
            function27 = function210;
            j5 = j8;
            z63Var2 = g2;
            i5 = i9;
            j6 = j7;
            function28 = function211;
            function29 = function212;
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new ie2(vl1Var, function27, myVar, function28, function29, i5, j6, j5, z63Var2, myVar2, i3);
        }
    }

    public static final void e(vl1 vl1Var, Function2 function2, a00 a00Var, int i2) {
        a00Var.Z(-1298353104);
        int i3 = i2 | 6 | (a00Var.h(function2) ? 32 : 16);
        if (a00Var.P(i3 & 1, (i3 & 19) != 18)) {
            Object M = a00Var.M();
            if (M == sz.a) {
                M = new gq2(qb2.c0);
                a00Var.i0(M);
            }
            sl1 sl1Var = sl1.a;
            f((gq2) M, sl1Var, function2, a00Var, (i3 << 3) & 1008);
            vl1Var = sl1Var;
        } else {
            a00Var.S();
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new n8(i2, 22, vl1Var, function2);
        }
    }

    public static final void f(gq2 gq2Var, vl1 vl1Var, Function2 function2, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.h(gq2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.f(vl1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var.h(function2) ? 256 : 128;
        }
        int i4 = 1;
        if (a00Var.P(i3 & 1, (i3 & 147) != 146)) {
            int hashCode = Long.hashCode(a00Var.T);
            xz S = iv1.S(a00Var);
            vl1 E = bd3.E(a00Var, vl1Var);
            v02 l2 = a00Var.l();
            o00 o00Var = o00.C;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, gq2Var, gq2Var.c);
            uj2.e(a00Var, S, gq2Var.d);
            uj2.e(a00Var, function2, gq2Var.e);
            pz.b.getClass();
            uj2.e(a00Var, l2, oz.e);
            uj2.e(a00Var, E, oz.d);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(hashCode))) {
                q40.r(hashCode, a00Var, hashCode, scVar);
            }
            a00Var.q(true);
            if (a00Var.B()) {
                a00Var.X(-1259216055);
                a00Var.q(false);
            } else {
                a00Var.X(-1259274676);
                boolean h2 = a00Var.h(gq2Var);
                Object M = a00Var.M();
                if (h2 || M == sz.a) {
                    M = new ng2(i4, gq2Var);
                    a00Var.i0(M);
                }
                l41.m((Function0) M, a00Var);
                a00Var.q(false);
            }
        } else {
            a00Var.S();
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new i9(gq2Var, vl1Var, function2, i2, 5);
        }
    }

    public static final void g(vl1 vl1Var, Function2 function2, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(1090521195);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.f(vl1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.h(function2) ? 32 : 16;
        }
        int i4 = 0;
        if (a00Var.P(i3 & 1, (i3 & 19) != 18)) {
            Object M = a00Var.M();
            if (M == sz.a) {
                M = k9.b;
                a00Var.i0(M);
            }
            oj1 oj1Var = (oj1) M;
            int hashCode = Long.hashCode(a00Var.T);
            v02 l2 = a00Var.l();
            vl1 E = bd3.E(a00Var, vl1Var);
            pz.b.getClass();
            o00 o00Var = oz.b;
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, oj1Var, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(hashCode))) {
                q40.r(hashCode, a00Var, hashCode, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            function2.invoke(a00Var, Integer.valueOf((i5 >> 6) & 14));
            a00Var.q(true);
        } else {
            a00Var.S();
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new l9(i2, i4, vl1Var, function2);
        }
    }

    public static final void h(int i2, Function2 function2, my myVar, Function2 function22, Function2 function23, z63 z63Var, my myVar2, a00 a00Var, int i3) {
        int i4;
        my myVar3;
        z63 z63Var2;
        my myVar4;
        a00Var.Z(-975511942);
        if ((i3 & 6) == 0) {
            i4 = (a00Var.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= a00Var.h(function2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            myVar3 = myVar;
            i4 |= a00Var.h(myVar3) ? 256 : 128;
        } else {
            myVar3 = myVar;
        }
        if ((i3 & 3072) == 0) {
            i4 |= a00Var.h(function22) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= a00Var.h(function23) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i3) == 0) {
            z63Var2 = z63Var;
            i4 |= a00Var.f(z63Var2) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        } else {
            z63Var2 = z63Var;
        }
        if ((1572864 & i3) == 0) {
            myVar4 = myVar2;
            i4 |= a00Var.h(myVar4) ? 1048576 : 524288;
        } else {
            myVar4 = myVar2;
        }
        if ((i4 & 599187) == 599186 && a00Var.B()) {
            a00Var.S();
        } else {
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((458752 & i4) == 131072) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576) | ((i4 & 896) == 256);
            Object M = a00Var.M();
            if (z2 || M == sz.a) {
                rc rcVar = new rc(function2, function22, function23, i2, z63Var2, myVar4, myVar3);
                a00Var.i0(rcVar);
                M = rcVar;
            }
            e(null, (Function2) M, a00Var, 0);
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new ke2(i2, function2, myVar, function22, function23, z63Var, myVar2, i3);
        }
    }

    public static final int i(int i2, eo1 eo1Var) {
        int i3 = eo1Var.o - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = eo1Var.m;
            int i6 = ((g41) objArr[i5]).a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((g41) objArr[i4]).a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    public static final float j(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(ad1 ad1Var, r30 r30Var) {
        h hVar;
        int i2;
        ad1 ad1Var2;
        c82 c82Var;
        Throwable th;
        hd1 hd1Var;
        hd1 hd1Var2;
        if (r30Var instanceof h) {
            hVar = (h) r30Var;
            int i3 = hVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.p = i3 - Integer.MIN_VALUE;
                Object obj = hVar.o;
                b50 b50Var = b50.m;
                i2 = hVar.p;
                if (i2 != 0) {
                    ca2.b(obj);
                    if (ad1Var.b().compareTo(zc1.p) >= 0) {
                        return Unit.a;
                    }
                    c82 c82Var2 = new c82();
                    try {
                        hVar.m = ad1Var;
                        hVar.n = c82Var2;
                        hVar.p = 1;
                        fs fsVar = new fs(1, q41.b(hVar));
                        fsVar.u();
                        i iVar = new i(fsVar);
                        c82Var2.m = iVar;
                        ad1Var.a(iVar);
                        if (fsVar.s() == b50Var) {
                            return b50Var;
                        }
                        ad1Var2 = ad1Var;
                        c82Var = c82Var2;
                    } catch (Throwable th2) {
                        ad1Var2 = ad1Var;
                        c82Var = c82Var2;
                        th = th2;
                        hd1Var = (hd1) c82Var.m;
                        if (hd1Var != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c82Var = hVar.n;
                    ad1Var2 = hVar.m;
                    try {
                        ca2.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        hd1Var = (hd1) c82Var.m;
                        if (hd1Var != null) {
                            ad1Var2.c(hd1Var);
                        }
                        throw th;
                    }
                }
                hd1Var2 = (hd1) c82Var.m;
                if (hd1Var2 != null) {
                    ad1Var2.c(hd1Var2);
                }
                return Unit.a;
            }
        }
        hVar = new h(r30Var);
        Object obj2 = hVar.o;
        b50 b50Var2 = b50.m;
        i2 = hVar.p;
        if (i2 != 0) {
        }
        hd1Var2 = (hd1) c82Var.m;
        if (hd1Var2 != null) {
        }
        return Unit.a;
    }

    public static final boolean l(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = ah0.m;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    ai2 ai2Var = (ai2) obj2;
                    ai2 ai2Var2 = (ai2) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (ai2Var2.g().a() >> 32)) - Float.intBitsToFloat((int) (ai2Var.g().a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (ai2Var2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (ai2Var.g().a() & 4294967295L)));
                    arrayList2.add(new au1((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((au1) zv.u(list)).a;
            } else {
                if (list.isEmpty()) {
                    ze1.b("Empty collection can't be reduced.");
                }
                Object u2 = zv.u(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        u2 = new au1(au1.g(((au1) u2).a, ((au1) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((au1) u2).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void m(a50 a50Var, CancellationException cancellationException) {
        g61 g61Var = (g61) a50Var.n().m(qb2.U);
        if (g61Var != null) {
            g61Var.f(cancellationException);
        } else {
            dm0.i(a50Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static Type n(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new b(n(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new c(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new b(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new d(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ch2.l(str);
    }

    public static void p(Type type) {
        yk3.s(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static final int q(long j2, long j3) {
        boolean M = M(j2);
        if (M != M(j3)) {
            return M ? -1 : 1;
        }
        return (Math.min(E(j2), E(j3)) >= 0.0f && L(j2) != L(j3)) ? L(j2) ? -1 : 1 : (int) Math.signum(E(j2) - E(j3));
    }

    public static void r(sp1 sp1Var, String str, List list, my myVar, int i2) {
        if ((i2 & 2) != 0) {
            list = ah0.m;
        }
        ah0 ah0Var = ah0.m;
        dr1 dr1Var = sp1Var.f;
        dr1Var.getClass();
        fz fzVar = new fz((ez) dr1Var.b(bd3.w(ez.class)), str, myVar);
        for (vo1 vo1Var : list) {
            fzVar.c.put(vo1Var.a, vo1Var.b);
        }
        ah0Var.getClass();
        zg0.m.getClass();
        sp1Var.h.add(fzVar.a());
    }

    public static final boolean s(w72 w72Var, float f2, float f3) {
        float f4 = w72Var.a;
        if (f2 > w72Var.c || f4 > f2) {
            return false;
        }
        return f3 <= w72Var.d && w72Var.b <= f3;
    }

    public static final Object t(Function2 function2, o30 o30Var) {
        we2 we2Var = new we2(o30Var, o30Var.getContext());
        Object p2 = mi2.p(we2Var, we2Var, function2);
        b50 b50Var = b50.m;
        return p2;
    }

    public static Handler u(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return km.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final float v(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final float w(ry1 ry1Var) {
        return ry1Var.l().e == ww1.n ? au1.d(ry1Var.p()) : au1.e(ry1Var.p());
    }

    public static final gi0 x(Enum[] enumArr) {
        enumArr.getClass();
        return new gi0(enumArr);
    }

    public static boolean y(Type type, Type type2) {
        if (type != type2) {
            return type != null && type.equals(type2);
        }
        return true;
    }

    public static boolean z(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return y(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return z(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public abstract Object H(o30 o30Var);

    public abstract Object R(Uri uri, InputEvent inputEvent, o30 o30Var);

    public abstract Object S(Uri uri, o30 o30Var);
}
