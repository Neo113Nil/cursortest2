package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lck {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(Throwable.class, -1);
    private static final lca c;

    static {
        lca lcaVar;
        try {
            lcaVar = lcl.a ? ldj.a : lbu.a;
        } catch (Throwable unused) {
            lcaVar = ldj.a;
        }
        c = lcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object X;
        if (!(th instanceof kvg)) {
            return (Throwable) c.a(th.getClass()).a(th);
        }
        try {
            X = ((kvg) th).a();
        } catch (Throwable th2) {
            X = ixc.X(th2);
        }
        if (true == (X instanceof kom)) {
            X = null;
        }
        return (Throwable) X;
    }

    public static final krt b(Class cls) {
        krt krtVar;
        kol kolVar;
        kol kolVar2;
        ghz ghzVar = new ghz(16);
        Object obj = null;
        try {
            final Method method = cls.getMethod("copyForStackTraceRecovery", null);
            return new krt() { // from class: lcf
                @Override // defpackage.krt
                public final Object a(Object obj2) {
                    Object X;
                    Throwable th = (Throwable) obj2;
                    int i = lck.a;
                    try {
                        X = (Throwable) method.invoke(th, null);
                    } catch (Throwable th2) {
                        X = ixc.X(th2);
                    }
                    return (Throwable) (true != (X instanceof kom) ? X : null);
                }
            };
        } catch (NoClassDefFoundError | NoSuchMethodException | SecurityException unused) {
            if (b == c(cls, 0)) {
                Constructor<?>[] constructors = cls.getConstructors();
                ArrayList arrayList = new ArrayList(constructors.length);
                for (final Constructor<?> constructor : constructors) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    int length = parameterTypes.length;
                    int i = 4;
                    if (length != 0) {
                        if (length == 1) {
                            Class<?> cls2 = parameterTypes[0];
                            if (ksp.b(cls2, String.class)) {
                                kolVar = new kol(new koy(new krt() { // from class: lch
                                    @Override // defpackage.krt
                                    public final Object a(Object obj2) {
                                        Throwable th = (Throwable) obj2;
                                        int i2 = lck.a;
                                        Object newInstance = constructor.newInstance(th.getMessage());
                                        newInstance.getClass();
                                        Throwable th2 = (Throwable) newInstance;
                                        th2.initCause(th);
                                        return th2;
                                    }
                                }, i), 2);
                            } else if (ksp.b(cls2, Throwable.class)) {
                                kolVar = new kol(new koy(new krt() { // from class: lci
                                    @Override // defpackage.krt
                                    public final Object a(Object obj2) {
                                        int i2 = lck.a;
                                        Object newInstance = constructor.newInstance((Throwable) obj2);
                                        newInstance.getClass();
                                        return (Throwable) newInstance;
                                    }
                                }, i), 1);
                            } else {
                                kolVar2 = new kol(null, -1);
                            }
                        } else if (length != 2) {
                            kolVar2 = new kol(null, -1);
                        } else if (ksp.b(parameterTypes[0], String.class) && ksp.b(parameterTypes[1], Throwable.class)) {
                            kolVar = new kol(new koy(new krt() { // from class: lcg
                                @Override // defpackage.krt
                                public final Object a(Object obj2) {
                                    Throwable th = (Throwable) obj2;
                                    int i2 = lck.a;
                                    Object newInstance = constructor.newInstance(th.getMessage(), th);
                                    newInstance.getClass();
                                    return (Throwable) newInstance;
                                }
                            }, i), 3);
                        } else {
                            kolVar2 = new kol(null, -1);
                        }
                        arrayList.add(kolVar2);
                    } else {
                        kolVar = new kol(new koy(new krt() { // from class: lcj
                            @Override // defpackage.krt
                            public final Object a(Object obj2) {
                                int i2 = lck.a;
                                Object newInstance = constructor.newInstance(null);
                                newInstance.getClass();
                                Throwable th = (Throwable) newInstance;
                                th.initCause((Throwable) obj2);
                                return th;
                            }
                        }, i), 0);
                    }
                    kolVar2 = kolVar;
                    arrayList.add(kolVar2);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        int intValue = ((Number) ((kol) obj).b).intValue();
                        while (true) {
                            Object next = it.next();
                            int intValue2 = ((Number) ((kol) next).b).intValue();
                            int i2 = intValue < intValue2 ? intValue2 : intValue;
                            if (intValue < intValue2) {
                                obj = next;
                            }
                            if (!it.hasNext()) {
                                break;
                            }
                            intValue = i2;
                        }
                    }
                }
                kol kolVar3 = (kol) obj;
                if (kolVar3 != null && (krtVar = (krt) kolVar3.a) != null) {
                    return krtVar;
                }
            }
            return ghzVar;
        }
    }

    private static final int c(Class cls, int i) {
        Object X;
        ixf.h(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                X = ixc.X(th);
            }
        } while (cls != null);
        X = Integer.valueOf(i2);
        Object valueOf = Integer.valueOf(i);
        if (true == (X instanceof kom)) {
            X = valueOf;
        }
        return ((Number) X).intValue();
    }
}
