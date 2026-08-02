package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kox implements Serializable, koi {
    private kri a;
    private Object b = kot.a;

    public kox(kri kriVar) {
        this.a = kriVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new kog(a());
    }

    @Override // defpackage.koi
    public final Object a() {
        if (this.b == kot.a) {
            kri kriVar = this.a;
            kriVar.getClass();
            this.b = kriVar.a();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.koi
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.b != kot.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
