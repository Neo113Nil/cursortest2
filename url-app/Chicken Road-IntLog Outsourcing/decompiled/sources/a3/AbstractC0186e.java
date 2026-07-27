package a3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0186e {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f3862a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC0183b f3863b;

    static {
        ArrayList arrayList;
        InterfaceC0183b interfaceC0183b = EnumC0194m.f3880a;
        f3862a = Logger.getLogger(AbstractC0186e.class.getName());
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if (!"default".equals(property)) {
            ClassLoader classLoader = AbstractC0186e.class.getClassLoader();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(InterfaceC0184c.class, classLoader).iterator();
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
                        arrayList2.get(0).getClass();
                        throw new ClassCastException();
                    }
                    atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.contextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                }
            }
        }
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            interfaceC0183b = new C0191j();
        }
        synchronized (AbstractC0185d.f3861b) {
            arrayList = AbstractC0185d.f3860a;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            interfaceC0183b = (InterfaceC0183b) ((Function) it3.next()).apply(interfaceC0183b);
        }
        f3863b = interfaceC0183b;
        synchronized (AbstractC0185d.f3861b) {
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            f3862a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
