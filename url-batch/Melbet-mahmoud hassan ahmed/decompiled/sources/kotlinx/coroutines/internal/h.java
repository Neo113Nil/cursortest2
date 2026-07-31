package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v5.k;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int f18342a = d(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f18343b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, f6.l<Throwable, Throwable>> f18344c = new WeakHashMap<>();

    public static final class a extends kotlin.jvm.internal.j implements f6.l<Throwable, Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Constructor f18345f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f18345f = constructor;
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a7;
            Object newInstance;
            try {
                k.a aVar = v5.k.f22832f;
                newInstance = this.f18345f.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                k.a aVar2 = v5.k.f22832f;
                a7 = v5.k.a(v5.l.a(th2));
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            a7 = v5.k.a((Throwable) newInstance);
            if (v5.k.c(a7)) {
                a7 = null;
            }
            return (Throwable) a7;
        }
    }

    public static final class b extends kotlin.jvm.internal.j implements f6.l<Throwable, Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Constructor f18346f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f18346f = constructor;
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a7;
            Object newInstance;
            try {
                k.a aVar = v5.k.f22832f;
                newInstance = this.f18346f.newInstance(th);
            } catch (Throwable th2) {
                k.a aVar2 = v5.k.f22832f;
                a7 = v5.k.a(v5.l.a(th2));
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            a7 = v5.k.a((Throwable) newInstance);
            if (v5.k.c(a7)) {
                a7 = null;
            }
            return (Throwable) a7;
        }
    }

    public static final class c extends kotlin.jvm.internal.j implements f6.l<Throwable, Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Constructor f18347f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f18347f = constructor;
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a7;
            Object newInstance;
            try {
                k.a aVar = v5.k.f22832f;
                newInstance = this.f18347f.newInstance(th.getMessage());
            } catch (Throwable th2) {
                k.a aVar2 = v5.k.f22832f;
                a7 = v5.k.a(v5.l.a(th2));
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) newInstance;
            th3.initCause(th);
            a7 = v5.k.a(th3);
            if (v5.k.c(a7)) {
                a7 = null;
            }
            return (Throwable) a7;
        }
    }

    public static final class d extends kotlin.jvm.internal.j implements f6.l<Throwable, Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Constructor f18348f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f18348f = constructor;
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a7;
            Object newInstance;
            try {
                k.a aVar = v5.k.f22832f;
                newInstance = this.f18348f.newInstance(new Object[0]);
            } catch (Throwable th2) {
                k.a aVar2 = v5.k.f22832f;
                a7 = v5.k.a(v5.l.a(th2));
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) newInstance;
            th3.initCause(th);
            a7 = v5.k.a(th3);
            if (v5.k.c(a7)) {
                a7 = null;
            }
            return (Throwable) a7;
        }
    }

    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            int a7;
            a7 = x5.b.a(Integer.valueOf(((Constructor) t7).getParameterTypes().length), Integer.valueOf(((Constructor) t6).getParameterTypes().length));
            return a7;
        }
    }

    static final class f extends kotlin.jvm.internal.j implements f6.l {

        /* renamed from: f, reason: collision with root package name */
        public static final f f18349f = new f();

        f() {
            super(1);
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    static final class g extends kotlin.jvm.internal.j implements f6.l {

        /* renamed from: f, reason: collision with root package name */
        public static final g f18350f = new g();

        g() {
            super(1);
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    private static final f6.l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length != 1) {
            if (length == 2 && kotlin.jvm.internal.i.a(parameterTypes[0], String.class) && kotlin.jvm.internal.i.a(parameterTypes[1], Throwable.class)) {
                return new a(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (kotlin.jvm.internal.i.a(cls, Throwable.class)) {
            return new b(constructor);
        }
        if (kotlin.jvm.internal.i.a(cls, String.class)) {
            return new c(constructor);
        }
        return null;
    }

    private static final int b(Class<?> cls, int i7) {
        do {
            int length = cls.getDeclaredFields().length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (!Modifier.isStatic(r0[i9].getModifiers())) {
                    i8++;
                }
            }
            i7 += i8;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i7;
    }

    static /* synthetic */ int c(Class cls, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        return b(cls, i7);
    }

    private static final int d(Class<?> cls, int i7) {
        Object a7;
        e6.a.b(cls);
        try {
            k.a aVar = v5.k.f22832f;
            a7 = v5.k.a(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th) {
            k.a aVar2 = v5.k.f22832f;
            a7 = v5.k.a(v5.l.a(th));
        }
        Integer valueOf = Integer.valueOf(i7);
        if (v5.k.c(a7)) {
            a7 = valueOf;
        }
        return ((Number) a7).intValue();
    }

    public static final <E extends Throwable> E e(E e7) {
        Object a7;
        List j7;
        ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (e7 instanceof m6.d0) {
            try {
                k.a aVar = v5.k.f22832f;
                a7 = v5.k.a(((m6.d0) e7).a());
            } catch (Throwable th) {
                k.a aVar2 = v5.k.f22832f;
                a7 = v5.k.a(v5.l.a(th));
            }
            return (E) (v5.k.c(a7) ? null : a7);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f18343b;
        ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
        readLock2.lock();
        try {
            f6.l<Throwable, Throwable> lVar = f18344c.get(e7.getClass());
            if (lVar != null) {
                return (E) lVar.invoke(e7);
            }
            int i7 = 0;
            if (f18342a != d(e7.getClass(), 0)) {
                readLock = reentrantReadWriteLock.readLock();
                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i8 = 0; i8 < readHoldCount; i8++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f18344c.put(e7.getClass(), f.f18349f);
                    v5.q qVar = v5.q.f22838a;
                    return null;
                } finally {
                    while (i7 < readHoldCount) {
                        readLock.lock();
                        i7++;
                    }
                    writeLock.unlock();
                }
            }
            j7 = w5.e.j(e7.getClass().getConstructors(), new e());
            Iterator it = j7.iterator();
            f6.l<Throwable, Throwable> lVar2 = null;
            while (it.hasNext() && (lVar2 = a((Constructor) it.next())) == null) {
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f18343b;
            readLock = reentrantReadWriteLock2.readLock();
            readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i9 = 0; i9 < readHoldCount; i9++) {
                readLock.unlock();
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                f18344c.put(e7.getClass(), lVar2 == null ? g.f18350f : lVar2);
                v5.q qVar2 = v5.q.f22838a;
                while (i7 < readHoldCount) {
                    readLock.lock();
                    i7++;
                }
                writeLock.unlock();
                if (lVar2 == null) {
                    return null;
                }
                return (E) lVar2.invoke(e7);
            } finally {
                while (i7 < readHoldCount) {
                    readLock.lock();
                    i7++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock2.unlock();
        }
    }
}
