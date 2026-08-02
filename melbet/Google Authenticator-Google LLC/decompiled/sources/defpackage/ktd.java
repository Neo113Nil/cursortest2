package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktd extends kte implements Serializable {
    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return ktc.a;
    }
}
