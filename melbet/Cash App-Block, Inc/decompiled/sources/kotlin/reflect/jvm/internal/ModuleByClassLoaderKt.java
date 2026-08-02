package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes9.dex */
public abstract class ModuleByClassLoaderKt {
    public static final ConcurrentHashMap moduleByClassLoader = new ConcurrentHashMap();

    public static final RuntimeModuleData getOrCreateModule(Class cls) {
        cls.getClass();
        ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(cls);
        WeakClassLoaderBox weakClassLoaderBox = new WeakClassLoaderBox(safeClassLoader);
        ConcurrentHashMap concurrentHashMap = moduleByClassLoader;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(weakClassLoaderBox);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = (RuntimeModuleData) weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentHashMap.remove(weakClassLoaderBox, weakReference);
        }
        RuntimeModuleData create = RuntimeModuleData.Companion.create(safeClassLoader);
        while (true) {
            WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(weakClassLoaderBox, new WeakReference(create));
            if (weakReference2 == null) {
                return create;
            }
            RuntimeModuleData runtimeModuleData2 = (RuntimeModuleData) weakReference2.get();
            if (runtimeModuleData2 != null) {
                return runtimeModuleData2;
            }
            concurrentHashMap.remove(weakClassLoaderBox, weakReference2);
        }
    }
}
