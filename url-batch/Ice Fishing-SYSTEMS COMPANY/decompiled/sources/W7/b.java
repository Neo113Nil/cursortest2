package W7;

import E7.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.v;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.i implements l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3498n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f3499u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f3500v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i) {
        super(1);
        this.f3498n = i;
        this.f3499u = dVar;
        this.f3500v = cVar;
    }

    @Override // E7.l
    public final Object invoke(Object obj) {
        switch (this.f3498n) {
            case 0:
                this.f3500v.getClass();
                this.f3499u.d(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f3503g;
                this.f3500v.getClass();
                d dVar = this.f3499u;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.d(null);
                break;
        }
        return v.f40183a;
    }
}
