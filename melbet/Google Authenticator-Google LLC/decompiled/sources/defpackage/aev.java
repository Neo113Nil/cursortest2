package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aev {
    public static final aev a = new aev();
    private static final Map c = new HashMap();
    public static final Map b = new HashMap();

    public static final aeg b(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            newInstance.getClass();
            return (aeg) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static final boolean c(Class cls) {
        return cls != null && aeq.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r6.booleanValue() != false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Class cls) {
        Constructor constructor;
        Integer num = (Integer) c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            int i2 = 0;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                    canonicalName.getClass();
                }
                canonicalName.getClass();
                String concat = ksp.r(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = a.ag(concat, name, ".");
                }
                Class<?> cls2 = Class.forName(concat);
                cls2.getClass();
                constructor = cls2.getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                b.put(cls, ixc.b(constructor));
            } else {
                aeb aebVar = aeb.a;
                Map map = aebVar.b;
                Boolean bool = (Boolean) map.get(cls);
                if (bool == null) {
                    Method[] a2 = aebVar.a(cls);
                    for (Method method : a2) {
                        if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                            aebVar.b(cls, a2);
                            break;
                        }
                    }
                    map.put(cls, false);
                    Class superclass = cls.getSuperclass();
                    if (c(superclass)) {
                        superclass.getClass();
                        if (a(superclass) != 1) {
                            Object obj = b.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    interfaces.getClass();
                    while (true) {
                        if (i2 < interfaces.length) {
                            Class<?> cls3 = interfaces[i2];
                            if (c(cls3)) {
                                cls3.getClass();
                                if (a(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = b.get(cls3);
                                obj2.getClass();
                                arrayList.addAll((Collection) obj2);
                            }
                            i2++;
                        } else if (arrayList != null) {
                            b.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        c.put(cls, Integer.valueOf(i));
        return i;
    }
}
