package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Lifecycling.jvm.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "<init>", "()V", "object", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleEventObserver", "(Ljava/lang/Object;)Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "constructor", "createGeneratedAdapter", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/GeneratedAdapter;", "Ljava/lang/Class;", "klass", "generatedConstructor", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "getObserverConstructorType", "(Ljava/lang/Class;)I", "resolveObserverCallbackType", "", "isLifecycleParent", "(Ljava/lang/Class;)Z", "", "className", "getAdapterName", "(Ljava/lang/String;)Ljava/lang/String;", "", "callbackCache", "Ljava/util/Map;", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final class Lifecycling {
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map callbackCache = new HashMap();
    private static final Map classToAdapters = new HashMap();

    private Lifecycling() {
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof LifecycleEventObserver;
        boolean z2 = object instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) == 2) {
            Object obj = classToAdapters.get(cls);
            Intrinsics.checkNotNull(obj);
            List list = (List) obj;
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter((Constructor) list.get(0), object));
            }
            int size = list.size();
            GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
            for (int i = 0; i < size; i++) {
                generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter((Constructor) list.get(i), object);
            }
            return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor constructor, Object object) {
        try {
            Object newInstance = constructor.newInstance(object);
            Intrinsics.checkNotNull(newInstance);
            return (GeneratedAdapter) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor generatedConstructor(Class klass) {
        try {
            Package r0 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            Intrinsics.checkNotNull(name);
            if (name.length() != 0) {
                Intrinsics.checkNotNull(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
            }
            Intrinsics.checkNotNull(canonicalName);
            String adapterName = getAdapterName(canonicalName);
            if (name.length() != 0) {
                adapterName = name + '.' + adapterName;
            }
            Class<?> cls = Class.forName(adapterName);
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(klass);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private final int getObserverConstructorType(Class klass) {
        Map map = callbackCache;
        Integer num = (Integer) map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(klass);
        map.put(klass, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    private final int resolveObserverCallbackType(Class klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor generatedConstructor = generatedConstructor(klass);
        if (generatedConstructor != null) {
            classToAdapters.put(klass, CollectionsKt.listOf(generatedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(klass)) {
            return 1;
        }
        Class superclass = klass.getSuperclass();
        if (isLifecycleParent(superclass)) {
            Intrinsics.checkNotNull(superclass);
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            Object obj = classToAdapters.get(superclass);
            Intrinsics.checkNotNull(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = klass.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls : interfaces) {
            if (isLifecycleParent(cls)) {
                Intrinsics.checkNotNull(cls);
                if (getObserverConstructorType(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = classToAdapters.get(cls);
                Intrinsics.checkNotNull(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }

    private final boolean isLifecycleParent(Class klass) {
        return klass != null && LifecycleObserver.class.isAssignableFrom(klass);
    }

    public static final String getAdapterName(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.replace$default(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }
}
