package v0;

import androidx.work.impl.WorkDatabase;
import t0.InterfaceC0649a;
import u0.C0687q;
import x0.InterfaceC0725a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0725a f6093a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0649a f6094b;

    /* renamed from: c, reason: collision with root package name */
    public final C0687q f6095c;

    static {
        l0.q.f("WMFgUpdater");
    }

    public q(WorkDatabase workDatabase, m0.f fVar, B0.c cVar) {
        this.f6094b = fVar;
        this.f6093a = cVar;
        this.f6095c = workDatabase.t();
    }
}
