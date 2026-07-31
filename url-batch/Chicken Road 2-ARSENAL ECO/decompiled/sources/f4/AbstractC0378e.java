package f4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0378e {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f4226a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC0375b f4227b;

    static {
        ArrayList arrayList;
        InterfaceC0375b interfaceC0375b = EnumC0386m.f4244f;
        f4226a = Logger.getLogger(AbstractC0378e.class.getName());
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        int i7 = 0;
        if (!"default".equals(property)) {
            ClassLoader classLoader = AbstractC0378e.class.getClassLoader();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(InterfaceC0376c.class, classLoader).iterator();
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
            interfaceC0375b = new C0383j();
        }
        synchronized (AbstractC0377d.f4225b) {
            arrayList = AbstractC0377d.f4224a;
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            interfaceC0375b = (InterfaceC0375b) ((Function) obj).apply(interfaceC0375b);
        }
        f4227b = interfaceC0375b;
        synchronized (AbstractC0377d.f4225b) {
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            f4226a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
