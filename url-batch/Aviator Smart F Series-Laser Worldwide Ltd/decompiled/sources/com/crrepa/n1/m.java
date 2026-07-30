package com.crrepa.n1;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes3.dex */
public abstract class m {

    class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f13459a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f13460b;

        a(Method method, Object obj) {
            this.f13459a = method;
            this.f13460b = obj;
        }

        @Override // com.crrepa.n1.m
        public <T> T b(Class<T> cls) {
            m.a(cls);
            return (T) this.f13459a.invoke(this.f13460b, cls);
        }
    }

    class b extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f13461a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13462b;

        b(Method method, int i8) {
            this.f13461a = method;
            this.f13462b = i8;
        }

        @Override // com.crrepa.n1.m
        public <T> T b(Class<T> cls) {
            m.a(cls);
            return (T) this.f13461a.invoke(null, cls, Integer.valueOf(this.f13462b));
        }
    }

    class c extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f13463a;

        c(Method method) {
            this.f13463a = method;
        }

        @Override // com.crrepa.n1.m
        public <T> T b(Class<T> cls) {
            m.a(cls);
            return (T) this.f13463a.invoke(null, cls, Object.class);
        }
    }

    class d extends m {
        d() {
        }

        @Override // com.crrepa.n1.m
        public <T> T b(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static m a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T b(Class<T> cls);

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }
}
