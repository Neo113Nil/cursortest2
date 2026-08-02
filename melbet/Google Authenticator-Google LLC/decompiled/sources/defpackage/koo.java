package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class koo implements Serializable, koi {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(koo.class, Object.class, "c");
    private volatile kri b;
    private volatile Object c = kot.a;

    public koo(kri kriVar) {
        this.b = kriVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new kog(a());
    }

    @Override // defpackage.koi
    public final Object a() {
        Object obj = this.c;
        kot kotVar = kot.a;
        if (obj != kotVar) {
            return obj;
        }
        kri kriVar = this.b;
        if (kriVar != null) {
            Object a2 = kriVar.a();
            if (a.b(a, this, kotVar, a2)) {
                this.b = null;
                return a2;
            }
        }
        return this.c;
    }

    @Override // defpackage.koi
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.c != kot.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
