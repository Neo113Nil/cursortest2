package io.opentelemetry.context;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public abstract class LazyStorage {
    public static final Logger logger;
    public static final ContextStorage storage;

    static {
        ArrayList arrayList;
        ContextStorage contextStorage = ThreadLocalContextStorage.INSTANCE;
        logger = Logger.getLogger(LazyStorage.class.getName());
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if (!"default".equals(property)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(ContextStorageProvider.class).iterator();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it);
            }
            if (!arrayList2.isEmpty()) {
                if (!property.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        throw Recorder$$ExternalSyntheticOutline2.m(it2);
                    }
                    atomicReference.set(new IllegalStateException("io.opentelemetry.context.ContextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList2));
                } else if (arrayList2.size() == 1) {
                    arrayList2.get(0).getClass();
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                } else {
                    atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.ContextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                }
            }
        }
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            contextStorage = new StrictContextStorage();
        }
        synchronized (ContextStorageWrappers.mutex) {
            arrayList = ContextStorageWrappers.wrappers;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            contextStorage = (ContextStorage) ((Function) it3.next()).apply(contextStorage);
        }
        storage = contextStorage;
        synchronized (ContextStorageWrappers.mutex) {
            ContextStorageWrappers.storageInitialized = true;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            logger.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
