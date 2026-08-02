package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikl extends PhantomReference {
    public final Set a;
    public final Runnable b;

    public ikl(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable) {
        super(obj, referenceQueue);
        this.a = set;
        this.b = runnable;
    }
}
