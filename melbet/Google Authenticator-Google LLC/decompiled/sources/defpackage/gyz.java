package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gyz implements gzb {
    @Override // defpackage.gzb
    public final void a(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        hal.startFinalizer(cls, referenceQueue, phantomReference);
    }
}
