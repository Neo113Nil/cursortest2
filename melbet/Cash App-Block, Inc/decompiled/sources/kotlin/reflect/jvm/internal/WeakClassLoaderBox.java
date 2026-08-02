package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class WeakClassLoaderBox {
    public final int identityHashCode;
    public final WeakReference ref;

    public WeakClassLoaderBox(ClassLoader classLoader) {
        classLoader.getClass();
        this.ref = new WeakReference(classLoader);
        this.identityHashCode = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WeakClassLoaderBox) && this.ref.get() == ((WeakClassLoaderBox) obj).ref.get();
    }

    public final int hashCode() {
        return this.identityHashCode;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.ref.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
