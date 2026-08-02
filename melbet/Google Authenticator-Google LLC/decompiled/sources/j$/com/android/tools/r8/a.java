package j$.com.android.tools.r8;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ Unsafe c;
    public final /* synthetic */ Class a;
    public final /* synthetic */ long b;

    static {
        Field field;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                Field field2 = declaredFields[i];
                if (Modifier.isStatic(field2.getModifiers()) && Unsafe.class.isAssignableFrom(field2.getType())) {
                    field = field2;
                    break;
                }
                i++;
            }
            if (field != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        field.setAccessible(true);
        try {
            c = (Unsafe) field.get(null);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public /* synthetic */ a(Class cls, String str, Class cls2) {
        this.a = cls.getDeclaredField(str).getType();
        if (!cls2.isPrimitive() || cls2 == Integer.TYPE || cls2 == Long.TYPE) {
            this.b = c.objectFieldOffset(cls.getDeclaredField(str));
            return;
        }
        throw new UnsupportedOperationException("Using a VarHandle for a field of type '" + cls2.getName() + "' requires native VarHandle support available from Android 13. VarHandle desugaring only supports primitive types int and long and reference types.");
    }

    public static /* synthetic */ int d(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public static /* synthetic */ long e(Object obj) {
        return obj instanceof Long ? ((Long) obj).longValue() : d(obj);
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2, Object obj3) {
        Class cls = this.a;
        Class cls2 = Integer.TYPE;
        long j = this.b;
        if (cls == cls2) {
            return c.compareAndSwapInt(obj, j, d(obj2), d(obj3));
        }
        if (cls == Long.TYPE) {
            return c.compareAndSwapLong(obj, j, e(obj2), e(obj3));
        }
        while (true) {
            Unsafe unsafe = c;
            Object obj4 = obj2;
            Object obj5 = obj3;
            if (unsafe.compareAndSwapObject(obj, j, obj4, obj5)) {
                return true;
            }
            if (unsafe.getObject(obj, j) != obj4) {
                return false;
            }
            obj2 = obj4;
            obj3 = obj5;
        }
    }

    public final /* synthetic */ void b(Object obj, Object obj2) {
        Class cls = Long.TYPE;
        long j = this.b;
        Class cls2 = this.a;
        Class cls3 = Integer.TYPE;
        if (cls2 == cls3) {
            int d = d(obj2);
            if (cls2 == cls3) {
                c.putInt(obj, j, d);
                return;
            } else if (cls2 != cls) {
                b(obj, Integer.valueOf(d));
                return;
            } else {
                c.putLong(obj, this.b, d);
                return;
            }
        }
        Unsafe unsafe = c;
        if (cls2 != cls) {
            unsafe.putObject(obj, j, obj2);
            return;
        }
        long e = e(obj2);
        if (cls2 == cls) {
            unsafe.putLong(obj, this.b, e);
        } else {
            if (cls2 == cls3) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            unsafe.putObject(obj, j, Long.valueOf(e));
        }
    }

    public final /* synthetic */ void c(Object obj, Object obj2) {
        Class cls = Long.TYPE;
        long j = this.b;
        Class cls2 = this.a;
        Class cls3 = Integer.TYPE;
        if (cls2 == cls3) {
            int d = d(obj2);
            if (cls2 == cls3) {
                c.putOrderedInt(obj, j, d);
                return;
            } else if (cls2 != cls) {
                c(obj, Integer.valueOf(d));
                return;
            } else {
                c.putOrderedLong(obj, this.b, d);
                return;
            }
        }
        Unsafe unsafe = c;
        if (cls2 != cls) {
            unsafe.putOrderedObject(obj, j, obj2);
            return;
        }
        long e = e(obj2);
        if (cls2 == cls) {
            unsafe.putOrderedLong(obj, this.b, e);
        } else {
            if (cls2 == cls3) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            unsafe.putOrderedObject(obj, j, Long.valueOf(e));
        }
    }

    public final /* synthetic */ boolean f(ConcurrentLinkedQueue concurrentLinkedQueue, Object obj, Object obj2) {
        Class cls = this.a;
        Class cls2 = Integer.TYPE;
        long j = this.b;
        if (cls == cls2) {
            return c.compareAndSwapInt(concurrentLinkedQueue, j, d(obj), d(obj2));
        }
        if (cls == Long.TYPE) {
            return c.compareAndSwapLong(concurrentLinkedQueue, j, e(obj), e(obj2));
        }
        while (true) {
            Unsafe unsafe = c;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(concurrentLinkedQueue, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(concurrentLinkedQueue, j) != obj3) {
                return false;
            }
            obj = obj3;
            obj2 = obj4;
        }
    }
}
