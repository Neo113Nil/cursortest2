package e1;

import O0.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b extends P0.i implements l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f1868g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i2) {
        super(1);
        this.f1867f = i2;
        this.f1868g = dVar;
    }

    @Override // O0.l
    public final Object j(Object obj) {
        switch (this.f1867f) {
            case 0:
                this.f1868g.e(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1871g;
                d dVar = this.f1868g;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                break;
        }
        return D0.h.f206a;
    }
}
