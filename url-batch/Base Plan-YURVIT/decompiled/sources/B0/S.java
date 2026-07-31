package B0;

import a.AbstractC0086a;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;

/* loaded from: classes.dex */
public final class S extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        Set G = AbstractC0086a.G("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || G.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
