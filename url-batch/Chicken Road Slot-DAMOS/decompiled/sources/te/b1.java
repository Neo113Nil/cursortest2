package te;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final re.e[] f9338a = new re.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final pe.a[] f9339b = new pe.a[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9340c = new Object();

    public static final e0 a(String str, pe.a aVar) {
        return new e0(str, new f0(aVar));
    }

    public static final Set b(re.e eVar) {
        eVar.getClass();
        if (eVar instanceof k) {
            return ((k) eVar).f();
        }
        HashSet hashSet = new HashSet(eVar.c());
        int c10 = eVar.c();
        for (int i3 = 0; i3 < c10; i3++) {
            hashSet.add(eVar.d(i3));
        }
        return hashSet;
    }

    public static final re.e[] c(List list) {
        re.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (re.e[]) list.toArray(new re.e[0])) == null) ? f9338a : eVarArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:56|(1:(2:58|(1:111)(1:62))(2:113|114))|(5:106|107|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|68|(1:79)(4:70|(1:78)|76|77))|64|(1:66)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00fb, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b6, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167 A[Catch: NoSuchFieldException -> 0x0196, TryCatch #2 {NoSuchFieldException -> 0x0196, blocks: (B:81:0x015a, B:83:0x0167, B:92:0x0183, B:94:0x0189, B:95:0x018f, B:97:0x0193, B:88:0x017b), top: B:80:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0193 A[Catch: NoSuchFieldException -> 0x0196, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x0196, blocks: (B:81:0x015a, B:83:0x0167, B:92:0x0183, B:94:0x0189, B:95:0x018f, B:97:0x0193, B:88:0x017b), top: B:80:0x015a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pe.a d(ce.b bVar, pe.a... aVarArr) {
        Object obj;
        pe.a aVar;
        Field field;
        Object obj2;
        pe.a aVar2;
        int length;
        int i3;
        Object obj3;
        Field field2;
        pe.a aVar3;
        pe.e eVar;
        bVar.getClass();
        Class D = a.a.D(bVar);
        pe.a[] aVarArr2 = (pe.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        if (D.isEnum() && D.getAnnotation(pe.e.class) == null && D.getAnnotation(pe.c.class) == null) {
            Object[] enumConstants = D.getEnumConstants();
            String canonicalName = D.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new x(canonicalName, (Enum[]) enumConstants);
        }
        pe.a[] aVarArr3 = (pe.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length);
        pe.d dVar = null;
        try {
            Field declaredField = D.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        pe.a f3 = obj == null ? null : f(obj, (pe.a[]) Arrays.copyOf(aVarArr3, aVarArr3.length));
        if (f3 != null) {
            return f3;
        }
        String canonicalName2 = D.getCanonicalName();
        if (canonicalName2 != null && !canonicalName2.startsWith("java.") && !canonicalName2.startsWith("kotlin.")) {
            Field[] declaredFields = D.getDeclaredFields();
            declaredFields.getClass();
            int length2 = declaredFields.length;
            Field field3 = null;
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                if (i10 < length2) {
                    Field field4 = declaredFields[i10];
                    if (Intrinsics.a(field4.getName(), "INSTANCE") && Intrinsics.a(field4.getType(), D) && Modifier.isStatic(field4.getModifiers())) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        field3 = field4;
                    }
                    i10++;
                }
            }
            field3 = null;
            if (field3 != null) {
                Object obj4 = field3.get(null);
                Method[] methods = D.getMethods();
                methods.getClass();
                int length3 = methods.length;
                Method method = null;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    if (i11 < length3) {
                        Method method2 = methods[i11];
                        if (Intrinsics.a(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && Intrinsics.a(method2.getReturnType(), pe.a.class)) {
                                if (z11) {
                                    break;
                                }
                                z11 = true;
                                method = method2;
                            }
                        }
                        i11++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof pe.a) {
                        aVar = (pe.a) invoke;
                        if (aVar == null) {
                            return aVar;
                        }
                        pe.a[] aVarArr4 = (pe.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length);
                        Field[] declaredFields2 = D.getDeclaredFields();
                        declaredFields2.getClass();
                        int length4 = declaredFields2.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length4) {
                                field = null;
                                break;
                            }
                            field = declaredFields2[i12];
                            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(t0.class) != null) {
                                break;
                            }
                            i12++;
                        }
                        if (field != null) {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (aVar2 = f(obj2, (pe.a[]) Arrays.copyOf(aVarArr4, aVarArr4.length))) == null) {
                                Class<?>[] declaredClasses = D.getDeclaredClasses();
                                declaredClasses.getClass();
                                length = declaredClasses.length;
                                Class<?> cls = null;
                                i3 = 0;
                                boolean z12 = false;
                                while (true) {
                                    if (i3 >= length) {
                                        Class<?> cls2 = declaredClasses[i3];
                                        if (cls2.getSimpleName().equals("$serializer")) {
                                            if (z12) {
                                                break;
                                            }
                                            z12 = true;
                                            cls = cls2;
                                        }
                                        i3++;
                                    } else if (!z12) {
                                    }
                                }
                                cls = null;
                                obj3 = (cls != null || (field2 = cls.getField("INSTANCE")) == null) ? null : field2.get(null);
                                if (obj3 instanceof pe.a) {
                                    aVar2 = (pe.a) obj3;
                                }
                                aVar2 = null;
                            }
                            aVar3 = aVar2;
                            if (aVar3 == null) {
                                return aVar3;
                            }
                            if (D.getAnnotation(pe.c.class) != null || ((eVar = (pe.e) D.getAnnotation(pe.e.class)) != null && wd.c0.a(eVar.with()).equals(wd.c0.a(pe.d.class)))) {
                                dVar = new pe.d(wd.c0.a(D));
                            }
                            return dVar;
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses2 = D.getDeclaredClasses();
                        declaredClasses2.getClass();
                        length = declaredClasses2.length;
                        Class<?> cls3 = null;
                        i3 = 0;
                        boolean z122 = false;
                        while (true) {
                            if (i3 >= length) {
                            }
                            i3++;
                        }
                        cls3 = null;
                        if (cls3 != null) {
                        }
                        if (obj3 instanceof pe.a) {
                        }
                        aVar2 = null;
                        aVar3 = aVar2;
                        if (aVar3 == null) {
                        }
                    }
                }
            }
        }
        aVar = null;
        if (aVar == null) {
        }
    }

    public static final int e(re.e eVar, re.e[] eVarArr) {
        eVarArr.getClass();
        int hashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(eVarArr);
        int c10 = eVar.c();
        int i3 = 1;
        while (true) {
            int i10 = 0;
            if (!(c10 > 0)) {
                break;
            }
            int i11 = c10 - 1;
            int i12 = i3 * 31;
            String a9 = eVar.h(eVar.c() - c10).a();
            if (a9 != null) {
                i10 = a9.hashCode();
            }
            i3 = i12 + i10;
            c10 = i11;
        }
        int c11 = eVar.c();
        int i13 = 1;
        while (true) {
            if (!(c11 > 0)) {
                return (((hashCode * 31) + i3) * 31) + i13;
            }
            int i14 = c11 - 1;
            int i15 = i13 * 31;
            i7.a b10 = eVar.h(eVar.c() - c11).b();
            i13 = i15 + (b10 != null ? b10.hashCode() : 0);
            c11 = i14;
        }
    }

    public static final pe.a f(Object obj, pe.a... aVarArr) {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i3 = 0; i3 < length; i3++) {
                    clsArr2[i3] = pe.a.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (invoke instanceof pe.a) {
                return (pe.a) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final ce.b g(k0 k0Var) {
        ce.b b10 = k0Var.f9395a.f9395a.b();
        if (b10 instanceof ce.b) {
            return b10;
        }
        a1.d(b10, "Only KClass supported as classifier, got ");
        return null;
    }

    public static final void h(ce.b bVar) {
        bVar.getClass();
        String c10 = ((wd.h) bVar).c();
        if (c10 == null) {
            c10 = "<local class name not available>";
        }
        throw new ee.h(n0.l.g("Serializer for class '", c10, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void i(String str, ce.b bVar) {
        String sb2;
        bVar.getClass();
        StringBuilder sb3 = new StringBuilder("in the polymorphic scope of '");
        wd.h hVar = (wd.h) bVar;
        sb3.append(hVar.c());
        sb3.append('\'');
        String sb4 = sb3.toString();
        if (str == null) {
            sb2 = "Class discriminator was missing and no default serializers were registered " + sb4 + '.';
        } else {
            StringBuilder sb5 = new StringBuilder("Serializer for subclass '");
            sb5.append(str);
            sb5.append("' is not found ");
            sb5.append(sb4);
            sb5.append(".\nCheck if class with serial name '");
            n0.l.l(sb5, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sb5.append(hVar.c());
            sb5.append("' has to be sealed and '@Serializable'.");
            sb2 = sb5.toString();
        }
        throw new ee.h(sb2);
    }

    public static final String j(re.e eVar) {
        return CollectionsKt.B(be.f.f(0, eVar.c()), ", ", eVar.a() + '(', ")", new a1.d(16, eVar), 24);
    }
}
