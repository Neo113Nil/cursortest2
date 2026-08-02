package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gto extends PhantomReference {
    public final gtn a;

    public gto(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new gtn(this);
    }
}
