package org.greenrobot.eventbus;

import cn.hutool.core.convert.impl.s;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
class o {
    private static final int BRIDGE = 64;
    private static final int MODIFIERS_IGNORE = 5192;
    private static final int POOL_SIZE = 4;
    private static final int SYNTHETIC = 4096;
    private final boolean ignoreGeneratedIndex;
    private final boolean strictMethodVerification;
    private List<n7.b> subscriberInfoIndexes;
    private static final Map<Class<?>, List<n>> METHOD_CACHE = new ConcurrentHashMap();
    private static final a[] FIND_STATE_POOL = new a[4];

    static class a {
        Class<?> clazz;
        boolean skipSuperClasses;
        Class<?> subscriberClass;
        n7.a subscriberInfo;
        final List<n> subscriberMethods = new ArrayList();
        final Map<Class, Object> anyMethodByEventType = new HashMap();
        final Map<String, Class> subscriberClassByMethodKey = new HashMap();
        final StringBuilder methodKeyBuilder = new StringBuilder(128);

        a() {
        }

        private boolean checkAddWithMethodSignature(Method method, Class<?> cls) {
            this.methodKeyBuilder.setLength(0);
            this.methodKeyBuilder.append(method.getName());
            StringBuilder sb = this.methodKeyBuilder;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.methodKeyBuilder.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.subscriberClassByMethodKey.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.subscriberClassByMethodKey.put(sb2, put);
            return false;
        }

        boolean checkAdd(Method method, Class<?> cls) {
            Object put = this.anyMethodByEventType.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (!checkAddWithMethodSignature((Method) put, cls)) {
                    throw new IllegalStateException();
                }
                this.anyMethodByEventType.put(cls, this);
            }
            return checkAddWithMethodSignature(method, cls);
        }

        void initForSubscriber(Class<?> cls) {
            this.clazz = cls;
            this.subscriberClass = cls;
            this.skipSuperClasses = false;
        }

        void moveToSuperclass() {
            if (this.skipSuperClasses) {
                this.clazz = null;
                return;
            }
            Class<? super Object> superclass = this.clazz.getSuperclass();
            this.clazz = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.clazz = null;
            }
        }

        void recycle() {
            this.subscriberMethods.clear();
            this.anyMethodByEventType.clear();
            this.subscriberClassByMethodKey.clear();
            this.methodKeyBuilder.setLength(0);
            this.subscriberClass = null;
            this.clazz = null;
            this.skipSuperClasses = false;
        }
    }

    o(List<n7.b> list, boolean z7, boolean z8) {
        this.subscriberInfoIndexes = list;
        this.strictMethodVerification = z7;
        this.ignoreGeneratedIndex = z8;
    }

    static void clearCaches() {
        METHOD_CACHE.clear();
    }

    private List<n> findUsingInfo(Class<?> cls) {
        a prepareFindState = prepareFindState();
        prepareFindState.initForSubscriber(cls);
        while (prepareFindState.clazz != null) {
            getSubscriberInfo(prepareFindState);
            findUsingReflectionInSingleClass(prepareFindState);
            prepareFindState.moveToSuperclass();
        }
        return getMethodsAndRelease(prepareFindState);
    }

    private List<n> findUsingReflection(Class<?> cls) {
        a prepareFindState = prepareFindState();
        prepareFindState.initForSubscriber(cls);
        while (prepareFindState.clazz != null) {
            findUsingReflectionInSingleClass(prepareFindState);
            prepareFindState.moveToSuperclass();
        }
        return getMethodsAndRelease(prepareFindState);
    }

    private void findUsingReflectionInSingleClass(a aVar) {
        Method[] methods;
        try {
            try {
                methods = aVar.clazz.getDeclaredMethods();
            } catch (Throwable unused) {
                methods = aVar.clazz.getMethods();
                aVar.skipSuperClasses = true;
            }
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if ((modifiers & 1) != 0 && (modifiers & MODIFIERS_IGNORE) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        l lVar = (l) method.getAnnotation(l.class);
                        if (lVar != null) {
                            Class<?> cls = parameterTypes[0];
                            if (aVar.checkAdd(method, cls)) {
                                aVar.subscriberMethods.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                            }
                        }
                    } else if (this.strictMethodVerification && method.isAnnotationPresent(l.class)) {
                        throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                    }
                } else if (this.strictMethodVerification && method.isAnnotationPresent(l.class)) {
                    throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                }
            }
        } catch (LinkageError e8) {
            String str = "Could not inspect methods of " + aVar.clazz.getName();
            throw new EventBusException(this.ignoreGeneratedIndex ? str + ". Please consider using EventBus annotation processor to avoid reflection." : str + ". Please make this class visible to EventBus annotation processor to avoid reflection.", e8);
        }
    }

    private List<n> getMethodsAndRelease(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.subscriberMethods);
        aVar.recycle();
        synchronized (FIND_STATE_POOL) {
            int i8 = 0;
            while (true) {
                if (i8 >= 4) {
                    break;
                }
                try {
                    a[] aVarArr = FIND_STATE_POOL;
                    if (aVarArr[i8] == null) {
                        aVarArr[i8] = aVar;
                        break;
                    }
                    i8++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    private n7.a getSubscriberInfo(a aVar) {
        aVar.getClass();
        List<n7.b> list = this.subscriberInfoIndexes;
        if (list != null) {
            Iterator<n7.b> it = list.iterator();
            if (it.hasNext()) {
                s.a(it.next());
                throw null;
            }
        }
        return null;
    }

    private a prepareFindState() {
        synchronized (FIND_STATE_POOL) {
            for (int i8 = 0; i8 < 4; i8++) {
                try {
                    a[] aVarArr = FIND_STATE_POOL;
                    a aVar = aVarArr[i8];
                    if (aVar != null) {
                        aVarArr[i8] = null;
                        return aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new a();
        }
    }

    List<n> findSubscriberMethods(Class<?> cls) {
        Map<Class<?>, List<n>> map = METHOD_CACHE;
        List<n> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<n> findUsingReflection = this.ignoreGeneratedIndex ? findUsingReflection(cls) : findUsingInfo(cls);
        if (!findUsingReflection.isEmpty()) {
            map.put(cls, findUsingReflection);
            return findUsingReflection;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
