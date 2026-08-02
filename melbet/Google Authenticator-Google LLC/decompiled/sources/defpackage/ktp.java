package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktp implements ktu {
    private final AtomicReference a;

    public ktp(ktu ktuVar) {
        this.a = new AtomicReference(ktuVar);
    }

    @Override // defpackage.ktu
    public final Iterator a() {
        ktu ktuVar = (ktu) this.a.getAndSet(null);
        if (ktuVar != null) {
            return ktuVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
