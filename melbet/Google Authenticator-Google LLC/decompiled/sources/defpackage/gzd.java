package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gzd implements gza {
    private final /* synthetic */ int a;

    public gzd(int i) {
        this.a = i;
    }

    @Override // defpackage.gza
    public final Class a() {
        if (this.a != 0) {
            if (gze.b()) {
                return null;
            }
            try {
                URL resource = getClass().getClassLoader().getResource("com/google/common/base/internal/Finalizer.class");
                if (resource == null) {
                    throw new FileNotFoundException("com/google/common/base/internal/Finalizer.class");
                }
                String url = resource.toString();
                if (url.endsWith("com/google/common/base/internal/Finalizer.class")) {
                    return new URLClassLoader(new URL[]{new URL(resource, url.substring(0, url.length() - 47))}, null).loadClass("com.google.common.base.internal.Finalizer");
                }
                throw new IOException("Unsupported path style: ".concat(String.valueOf(url)));
            } catch (Exception e) {
                gze.a.logp(Level.WARNING, "com.google.common.base.FinalizableReferenceQueue$DecoupledLoader", "loadFinalizer", "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e);
                return null;
            }
        }
        if (gze.b()) {
            return null;
        }
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (systemClassLoader == null) {
                return null;
            }
            try {
                return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (SecurityException unused2) {
            gze.a.logp(Level.INFO, "com.google.common.base.FinalizableReferenceQueue$SystemLoader", "loadFinalizer", "Not allowed to access system class loader.");
        }
    }
}
