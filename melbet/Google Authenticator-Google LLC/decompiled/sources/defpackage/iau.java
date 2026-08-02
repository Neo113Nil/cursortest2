package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iau implements icd {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public iau(Collection collection) {
        this.a.addAll(collection);
    }

    static iau b(Collection collection) {
        return new iau((Set) collection);
    }

    private final synchronized void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((icd) it.next()).a());
        }
        this.a = null;
    }

    @Override // defpackage.icd
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }

    public final synchronized void c(icd icdVar) {
        if (this.b == null) {
            this.a.add(icdVar);
        } else {
            this.b.add(icdVar.a());
        }
    }
}
