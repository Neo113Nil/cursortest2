package C2;

import g2.AbstractC2429a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import y2.C3530e;
import y2.InterfaceC3527b;
import y2.InterfaceC3529d;
import y2.InterfaceC3533h;

/* renamed from: C2.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0337u0 {
    private static final Object a(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final InterfaceC3527b b(m2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return d(cVar, new InterfaceC3527b[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC3527b c(Class cls, InterfaceC3527b... args) {
        InterfaceC3527b interfaceC3527b;
        Object obj;
        Field field;
        InterfaceC3527b g4;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && i(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (g4 = g(cls)) != null) {
            return g4;
        }
        InterfaceC3527b h4 = h(cls, (InterfaceC3527b[]) Arrays.copyOf(args, args.length));
        if (h4 != null) {
            return h4;
        }
        InterfaceC3527b f4 = f(cls);
        if (f4 != null) {
            return f4;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "declaredClasses");
            int length = declaredClasses.length;
            int i4 = 0;
            Class<?> cls2 = null;
            boolean z4 = false;
            while (true) {
                if (i4 < length) {
                    Class<?> cls3 = declaredClasses[i4];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z4) {
                            break;
                        }
                        z4 = true;
                        cls2 = cls3;
                    }
                    i4++;
                } else if (!z4) {
                }
            }
            cls2 = null;
            obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
        } catch (NoSuchFieldException unused) {
        }
        if (obj instanceof InterfaceC3527b) {
            interfaceC3527b = (InterfaceC3527b) obj;
            if (interfaceC3527b == null) {
                return interfaceC3527b;
            }
            if (j(cls)) {
                return new C3530e(AbstractC2429a.c(cls));
            }
            return null;
        }
        interfaceC3527b = null;
        if (interfaceC3527b == null) {
        }
    }

    public static final InterfaceC3527b d(m2.c cVar, InterfaceC3527b... args) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return c(AbstractC2429a.a(cVar), (InterfaceC3527b[]) Arrays.copyOf(args, args.length));
    }

    private static final InterfaceC3527b e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "canonicalName");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new G(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        if (r4 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003d, code lost:
    
        if (r5 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InterfaceC3527b f(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
        int length = declaredFields.length;
        int i4 = 0;
        Field field = null;
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 < length) {
                Field field2 = declaredFields[i5];
                if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                    field = field2;
                }
                i5++;
            }
        }
        field = null;
        if (field == null) {
            return null;
        }
        Object obj = field.get(null);
        Method[] methods = cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        int length2 = methods.length;
        Method method = null;
        boolean z5 = false;
        while (true) {
            if (i4 < length2) {
                Method method2 = methods[i4];
                if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), InterfaceC3527b.class)) {
                        if (z5) {
                            break;
                        }
                        method = method2;
                        z5 = true;
                    }
                }
                i4++;
            }
        }
        method = null;
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(obj, null);
        if (invoke instanceof InterfaceC3527b) {
            return (InterfaceC3527b) invoke;
        }
        return null;
    }

    private static final InterfaceC3527b g(Class cls) {
        InterfaceC3533h interfaceC3533h = (InterfaceC3533h) cls.getAnnotation(InterfaceC3533h.class);
        if (interfaceC3533h == null || Intrinsics.areEqual(kotlin.jvm.internal.H.b(interfaceC3533h.with()), kotlin.jvm.internal.H.b(C3530e.class))) {
            return new C3530e(AbstractC2429a.c(cls));
        }
        return null;
    }

    private static final InterfaceC3527b h(Class cls, InterfaceC3527b... interfaceC3527bArr) {
        Class[] clsArr;
        Object a4 = a(cls);
        if (a4 == null) {
            return null;
        }
        try {
            if (interfaceC3527bArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC3527bArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i4 = 0; i4 < length; i4++) {
                    clsArr2[i4] = InterfaceC3527b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = a4.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(a4, Arrays.copyOf(interfaceC3527bArr, interfaceC3527bArr.length));
            if (invoke instanceof InterfaceC3527b) {
                return (InterfaceC3527b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                throw e4;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e4.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final boolean i(Class cls) {
        return cls.getAnnotation(InterfaceC3533h.class) == null && cls.getAnnotation(InterfaceC3529d.class) == null;
    }

    private static final boolean j(Class cls) {
        if (cls.getAnnotation(InterfaceC3529d.class) != null) {
            return true;
        }
        InterfaceC3533h interfaceC3533h = (InterfaceC3533h) cls.getAnnotation(InterfaceC3533h.class);
        return interfaceC3533h != null && Intrinsics.areEqual(kotlin.jvm.internal.H.b(interfaceC3533h.with()), kotlin.jvm.internal.H.b(C3530e.class));
    }

    public static final boolean k(m2.c rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return AbstractC2429a.a(rootClass).isArray();
    }

    public static final Void l(m2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        AbstractC0339v0.f(cVar);
        throw new W1.f();
    }

    public static final Object[] m(ArrayList arrayList, m2.c eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object newInstance = Array.newInstance((Class<?>) AbstractC2429a.a(eClass), arrayList.size());
        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }
}
