package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fcb implements hut {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ hab c;
    final /* synthetic */ fce d;
    final /* synthetic */ Integer e;
    final /* synthetic */ fcf f;

    public fcb(fcf fcfVar, AtomicBoolean atomicBoolean, Set set, hab habVar, fce fceVar, Integer num) {
        this.a = atomicBoolean;
        this.b = set;
        this.c = habVar;
        this.d = fceVar;
        this.e = num;
        this.f = fcfVar;
    }

    @Override // defpackage.hut
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean z = this.a.get();
        Set set = this.b;
        if (z) {
            set.size();
            this.c.a(fcf.a);
            return;
        }
        set.size();
        fce fceVar = this.d;
        synchronized (fceVar.c) {
            hfm.n(fceVar.b);
        }
        fcf.a.convert(this.e.intValue(), this.f.g);
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
    }
}
