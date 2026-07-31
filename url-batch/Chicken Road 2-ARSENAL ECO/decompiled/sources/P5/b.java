package P5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k5.v;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f1882g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i7) {
        super(1);
        this.f1881f = i7;
        this.f1882g = dVar;
    }

    @Override // x5.InterfaceC0743l
    public final Object invoke(Object obj) {
        switch (this.f1881f) {
            case 0:
                this.f1882g.d(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1885g;
                d dVar = this.f1882g;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.d(null);
                break;
        }
        return v.f5219a;
    }
}
