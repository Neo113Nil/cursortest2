package F3;

import c3.C0297i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i4) {
        super(1);
        this.f791e = i4;
        this.f792f = dVar;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        switch (this.f791e) {
            case 0:
                this.f792f.e(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f795g;
                d dVar = this.f792f;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                break;
        }
        return C0297i.f5732a;
    }
}
