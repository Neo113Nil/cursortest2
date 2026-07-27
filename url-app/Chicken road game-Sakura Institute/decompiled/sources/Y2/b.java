package Y2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4403e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4404i;

    public /* synthetic */ b(Object obj, int i2, Object obj2) {
        this.f4402d = i2;
        this.f4403e = obj;
        this.f4404i = obj2;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f4402d) {
            case 0:
                b3.a.a((Function1) this.f4403e, this.f4404i, (CoroutineContext) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e3.c.f6259g;
                e3.b bVar = (e3.b) this.f4404i;
                Object obj4 = bVar.f6257e;
                e3.c cVar = (e3.c) this.f4403e;
                atomicReferenceFieldUpdater.set(cVar, obj4);
                cVar.e(bVar.f6257e);
                break;
        }
        return Unit.f7487a;
    }
}
