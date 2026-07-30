package q6;

import P.C0152q;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.B;
import r6.z;
import y4.K;
import y4.L;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7389d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7390e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7391i;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7392l;

    public l(B b7, e eVar, C0152q c0152q) {
        this.f7390e = b7;
        this.f7391i = eVar;
        this.f7392l = c0152q;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, V5.b bVar) {
        k kVar;
        int i2;
        l lVar;
        y4.q qVar;
        int i5;
        switch (this.f7389d) {
            case 0:
                if (bVar instanceof k) {
                    kVar = (k) bVar;
                    int i7 = kVar.f7388m;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        kVar.f7388m = i7 - Integer.MIN_VALUE;
                        Object obj2 = kVar.f7386i;
                        W5.a aVar = W5.a.f2787d;
                        i2 = kVar.f7388m;
                        if (i2 != 0) {
                            V6.b.P(obj2);
                            if (((B) this.f7390e).f6150d) {
                                e eVar = (e) this.f7391i;
                                kVar.f7388m = 1;
                                if (eVar.a(obj, kVar) == aVar) {
                                    return aVar;
                                }
                                return Unit.f6114a;
                            }
                            C0152q c0152q = (C0152q) this.f7392l;
                            kVar.f7384d = this;
                            kVar.f7385e = obj;
                            kVar.f7388m = 2;
                            obj2 = c0152q.invoke(obj, kVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            lVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return Unit.f6114a;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                obj = kVar.f7385e;
                                lVar = kVar.f7384d;
                                V6.b.P(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((B) lVar.f7390e).f6150d = true;
                                    e eVar2 = (e) lVar.f7391i;
                                    kVar.f7384d = null;
                                    kVar.f7385e = null;
                                    kVar.f7388m = 3;
                                    if (eVar2.a(obj, kVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return Unit.f6114a;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        V6.b.P(obj2);
                        return Unit.f6114a;
                    }
                }
                kVar = new k(this, bVar);
                Object obj22 = kVar.f7386i;
                W5.a aVar2 = W5.a.f2787d;
                i2 = kVar.f7388m;
                if (i2 != 0) {
                }
            case 1:
                Object b7 = r6.s.b((CoroutineContext) this.f7390e, obj, this.f7391i, (z) this.f7392l, bVar);
                return b7 == W5.a.f2787d ? b7 : Unit.f6114a;
            default:
                if (bVar instanceof y4.q) {
                    qVar = (y4.q) bVar;
                    int i8 = qVar.f8616e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        qVar.f8616e = i8 - Integer.MIN_VALUE;
                        Object obj3 = qVar.f8615d;
                        W5.a aVar3 = W5.a.f2787d;
                        i5 = qVar.f8616e;
                        if (i5 != 0) {
                            V6.b.P(obj3);
                            e eVar3 = (e) this.f7391i;
                            Double d7 = (Double) L.c(((T.b) obj).c((T.d) this.f7390e), ((K) this.f7392l).f8568i);
                            qVar.f8616e = 1;
                            if (eVar3.a(d7, qVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj3);
                        }
                        return Unit.f6114a;
                    }
                }
                qVar = new y4.q(this, bVar);
                Object obj32 = qVar.f8615d;
                W5.a aVar32 = W5.a.f2787d;
                i5 = qVar.f8616e;
                if (i5 != 0) {
                }
                return Unit.f6114a;
        }
    }

    public l(e eVar, T.d dVar, K k7) {
        this.f7391i = eVar;
        this.f7390e = dVar;
        this.f7392l = k7;
    }

    public l(e eVar, CoroutineContext coroutineContext) {
        this.f7390e = coroutineContext;
        this.f7391i = s6.u.b(coroutineContext);
        this.f7392l = new z(eVar, null);
    }
}
