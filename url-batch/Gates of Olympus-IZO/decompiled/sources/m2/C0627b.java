package m2;

import L1.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0627b implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5935f;

    public /* synthetic */ C0627b(Object obj, int i3, Object obj2) {
        this.f5933d = i3;
        this.f5934e = obj;
        this.f5935f = obj2;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.f5933d) {
            case 0:
                p2.a.a((Y1.c) this.f5934e, this.f5935f, (P1.i) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s2.c.f7553g;
                s2.b bVar = (s2.b) this.f5935f;
                Object obj4 = bVar.f7551e;
                s2.c cVar = (s2.c) this.f5934e;
                atomicReferenceFieldUpdater.set(cVar, obj4);
                cVar.e(bVar.f7551e);
                break;
        }
        return z.f2729a;
    }
}
