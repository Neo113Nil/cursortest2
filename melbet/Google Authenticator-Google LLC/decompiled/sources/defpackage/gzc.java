package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gzc implements gzb {
    final Method a;

    public gzc(Method method) {
        this.a = method;
    }

    @Override // defpackage.gzb
    public final void a(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        this.a.invoke(null, cls, referenceQueue, phantomReference);
    }
}
