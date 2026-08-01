package je;

import d2.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5240d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5241e;

    /* JADX WARN: Multi-variable type inference failed */
    public x(Function2 function2) {
        this.f5241e = (nd.i) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // je.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f fVar, ld.a aVar) {
        a aVar2;
        int i3;
        Throwable th;
        ke.q qVar;
        switch (this.f5240d) {
            case 0:
                if (aVar instanceof a) {
                    aVar2 = (a) aVar;
                    int i10 = aVar2.f5129r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar2.f5129r = i10 - Integer.MIN_VALUE;
                        Object obj = aVar2.f5127e;
                        Object obj2 = md.a.f6622d;
                        i3 = aVar2.f5129r;
                        if (i3 != 0) {
                            cf.c.M(obj);
                            ke.q qVar2 = new ke.q(fVar, aVar2.getContext());
                            try {
                                aVar2.f5126d = qVar2;
                                aVar2.f5129r = 1;
                                Object invoke = ((nd.i) this.f5241e).invoke(qVar2, aVar2);
                                if (invoke != obj2) {
                                    invoke = Unit.f5554a;
                                }
                                if (invoke == obj2) {
                                    return obj2;
                                }
                                qVar = qVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                qVar = qVar2;
                                qVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i3 != 1) {
                                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qVar = aVar2.f5126d;
                            try {
                                cf.c.M(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                qVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        qVar.releaseIntercepted();
                        return Unit.f5554a;
                    }
                }
                aVar2 = new a(this, aVar);
                Object obj3 = aVar2.f5127e;
                Object obj22 = md.a.f6622d;
                i3 = aVar2.f5129r;
                if (i3 != 0) {
                }
                qVar.releaseIntercepted();
                return Unit.f5554a;
            default:
                Object c10 = ((j) this.f5241e).c(new r1(4, fVar), aVar);
                return c10 == md.a.f6622d ? c10 : Unit.f5554a;
        }
    }

    public x(j jVar) {
        this.f5241e = jVar;
    }
}
