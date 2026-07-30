package M4;

import C4.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f1746a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1747b;

    static {
        ArrayList arrayList;
        b bVar = n.f1765d;
        f1746a = Logger.getLogger(e.class.getName());
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        int i2 = 0;
        if (!"default".equals(property)) {
            ClassLoader classLoader = e.class.getClassLoader();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(c.class, classLoader).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (!arrayList2.isEmpty()) {
                if (!property.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                    atomicReference.set(new IllegalStateException("io.opentelemetry.context.contextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList2));
                } else {
                    if (arrayList2.size() == 1) {
                        throw p.f(arrayList2, 0);
                    }
                    atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.contextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                }
            }
        }
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            bVar = new k();
        }
        synchronized (d.f1745b) {
            arrayList = d.f1744a;
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bVar = (b) ((Function) obj).apply(bVar);
        }
        f1747b = bVar;
        synchronized (d.f1745b) {
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            f1746a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
