package com.anythink.expressad.atsignalcommon.c;

import com.anythink.expressad.atsignalcommon.c.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static a f18113a;

    public interface a {
        boolean a();
    }

    public static abstract class b {

        public static class a extends Throwable {

            /* renamed from: d, reason: collision with root package name */
            private static final long f18114d = 1;

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f18115a;

            /* renamed from: b, reason: collision with root package name */
            private String f18116b;

            /* renamed from: c, reason: collision with root package name */
            private String f18117c;

            public a(String str) {
                super(str);
            }

            public final Class<?> a() {
                return this.f18115a;
            }

            public final String b() {
                return this.f18117c;
            }

            public final String c() {
                return this.f18116b;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return a.class.getName() + ": " + getCause();
            }

            public a(Exception exc) {
                super(exc);
            }

            public final void a(Class<?> cls) {
                this.f18115a = cls;
            }

            public final void b(String str) {
                this.f18116b = str;
            }

            public final void a(String str) {
                this.f18117c = str;
            }
        }
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.c.c$c, reason: collision with other inner class name */
    public static class C0112c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f18118a;

        public C0112c(Class<C> cls) {
            this.f18118a = cls;
        }

        private e<C, Object> a(String str) {
            return new e<>(this.f18118a, str, 8);
        }

        private e<C, Object> b(String str) {
            return new e<>(this.f18118a, str, 0);
        }

        private f b(String str, Class<?>... clsArr) {
            return new f(this.f18118a, str, clsArr, 8);
        }

        public final f a(String str, Class<?>... clsArr) {
            return new f(this.f18118a, str, clsArr, 0);
        }

        private d a(Class<?>... clsArr) {
            return new d(this.f18118a, clsArr);
        }

        private Class<C> a() {
            return this.f18118a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected Constructor<?> f18119a;

        public d(Class<?> cls, Class<?>[] clsArr) {
            if (cls == null) {
                return;
            }
            try {
                this.f18119a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e6) {
                b.a aVar = new b.a(e6);
                aVar.a(cls);
                c.b(aVar);
            }
        }

        private Object a(Object... objArr) {
            this.f18119a.setAccessible(true);
            try {
                return this.f18119a.newInstance(objArr);
            } catch (Exception e6) {
                e6.printStackTrace();
                return null;
            }
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.a aVar) {
        a aVar2 = f18113a;
        if (aVar2 == null) {
            throw aVar;
        }
        if (!aVar2.a()) {
            throw aVar;
        }
    }

    public static class e<C, T> {

        /* renamed from: a, reason: collision with root package name */
        private Object f18120a;

        /* renamed from: b, reason: collision with root package name */
        private final Field f18121b;

        public e(Class<C> cls, String str, int i) {
            Field field = null;
            if (cls == null) {
                this.f18121b = null;
                return;
            }
            try {
                try {
                    this.f18120a = null;
                    field = cls.getDeclaredField(str);
                    if (i > 0 && (field.getModifiers() & i) != i) {
                        c.b(new b.a(field + " does not match modifiers: " + i));
                    }
                    field.setAccessible(true);
                    this.f18121b = field;
                } catch (NoSuchFieldException e6) {
                    b.a aVar = new b.a(e6);
                    aVar.a((Class<?>) cls);
                    aVar.b(str);
                    c.b(aVar);
                    this.f18121b = field;
                }
            } catch (Throwable th) {
                this.f18121b = field;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) {
            Field field = this.f18121b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.f18121b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) {
            Field field = this.f18121b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.f18121b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.f18121b;
                if (field == null || cls.isAssignableFrom(field.getType())) {
                    return this;
                }
                c.b(new b.a(new ClassCastException(this.f18121b + " is not of type " + cls)));
                return this;
            } catch (ClassNotFoundException e6) {
                c.b(new b.a(e6));
                return this;
            }
        }

        private e<C, T> b(C c4) {
            this.f18120a = c4;
            return this;
        }

        private Field b() {
            return this.f18121b;
        }

        private T a() {
            try {
                return (T) this.f18121b.get(this.f18120a);
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
                return null;
            }
        }

        private void a(Object obj) {
            try {
                this.f18121b.set(this.f18120a, obj);
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            }
        }

        private void a(b.AbstractC0111b<?> abstractC0111b) {
            T a9 = a();
            if (a9 != null) {
                try {
                    this.f18121b.set(this.f18120a, com.anythink.expressad.atsignalcommon.c.b.a(a9, abstractC0111b, a9.getClass().getInterfaces()));
                    return;
                } catch (IllegalAccessException e6) {
                    e6.printStackTrace();
                    return;
                }
            }
            throw new IllegalStateException("Cannot mapping null");
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f18122a;

        public f(Class<?> cls, String str, Class<?>[] clsArr, int i) {
            Method method = null;
            if (cls == null) {
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    method = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e6) {
                    if (com.anythink.expressad.a.f17776a && cls.getSuperclass() == Object.class) {
                        e6.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e9) {
                    try {
                        if (com.anythink.expressad.a.f17776a && cls.getSuperclass() == Object.class) {
                            e9.printStackTrace();
                        }
                        cls = cls.getSuperclass();
                    } catch (Exception e10) {
                        b.a aVar = new b.a(e10);
                        aVar.a(cls);
                        aVar.a(str);
                        c.b(aVar);
                        return;
                    } finally {
                        this.f18122a = method;
                    }
                }
            }
            if (method != null) {
                if (i > 0 && (method.getModifiers() & i) != i) {
                    c.b(new b.a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            }
        }

        public final Object a(Object obj, Object... objArr) {
            Method method = this.f18122a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }

        public final Method a() {
            return this.f18122a;
        }
    }

    private static <T> C0112c<T> a(Class<T> cls) {
        return new C0112c<>(cls);
    }

    private static <T> C0112c<T> a(String str) {
        try {
            return new C0112c<>(Class.forName(str));
        } catch (ClassNotFoundException e6) {
            b(new b.a(e6));
            return new C0112c<>(null);
        }
    }

    public static <T> C0112c<T> a(ClassLoader classLoader, String str) {
        try {
            return new C0112c<>(classLoader.loadClass(str));
        } catch (Exception e6) {
            b(new b.a(e6));
            return new C0112c<>(null);
        }
    }

    private static void a(a aVar) {
        f18113a = aVar;
    }
}
