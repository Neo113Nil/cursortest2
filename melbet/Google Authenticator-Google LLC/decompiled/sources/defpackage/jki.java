package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jki {
    static jkd b(Class cls) {
        ClassLoader classLoader = jki.class.getClassLoader();
        if (cls.equals(jkd.class)) {
            try {
                try {
                    return (jkd) cls.cast(((jki) Class.forName("jjg", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = Collections.singletonList(jmt.class.getDeclaredConstructor(null).newInstance(null)).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((jkd) cls.cast(((jki) it.next()).a()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(jjz.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (jkd) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (jkd) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    protected abstract jkd a();
}
