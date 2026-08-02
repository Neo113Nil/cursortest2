package io.flutter.plugins.sharedpreferences;

import i2.AbstractC0457a;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class StringListObjectInputStream extends ObjectInputStream {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringListObjectInputStream(InputStream input) {
        super(input);
        i.e(input, "input");
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Set B4 = AbstractC0457a.B("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || B4.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
