package je;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5178d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f5179e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nd.i f5180i;

    /* JADX WARN: Multi-variable type inference failed */
    public j(e eVar, Function2 function2) {
        this.f5179e = eVar;
        this.f5180i = (nd.i) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [nd.i, vd.n] */
    @Override // je.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f fVar, ld.a aVar) {
        i iVar;
        md.a aVar2;
        int i3;
        ?? r32;
        int i10;
        n0 n0Var;
        ke.q qVar;
        ke.q qVar2;
        switch (this.f5178d) {
            case 0:
                try {
                    if (aVar instanceof i) {
                        iVar = (i) aVar;
                        int i11 = iVar.f5173e;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            iVar.f5173e = i11 - Integer.MIN_VALUE;
                            Object obj = iVar.f5172d;
                            aVar2 = md.a.f6622d;
                            i3 = iVar.f5173e;
                            r32 = this.f5180i;
                            if (i3 != 0) {
                                cf.c.M(obj);
                                i10 = 0;
                                try {
                                    e eVar = this.f5179e;
                                    iVar.f5175r = fVar;
                                    iVar.f5177t = 0;
                                    iVar.f5173e = 1;
                                    if (eVar.c(fVar, iVar) == aVar2) {
                                        return aVar2;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    n0Var = new n0(th);
                                    iVar.f5175r = null;
                                    iVar.f5176s = th;
                                    iVar.f5177t = i10;
                                    iVar.f5173e = 2;
                                    if (b0.c(n0Var, r32, th, iVar) != aVar2) {
                                        return aVar2;
                                    }
                                    throw th;
                                }
                            } else {
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        Throwable th2 = (Throwable) iVar.f5176s;
                                        cf.c.M(obj);
                                        throw th2;
                                    }
                                    if (i3 != 3) {
                                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    qVar2 = (ke.q) iVar.f5176s;
                                    try {
                                        cf.c.M(obj);
                                        qVar2.releaseIntercepted();
                                        return Unit.f5554a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        qVar2.releaseIntercepted();
                                        throw th;
                                    }
                                }
                                int i12 = iVar.f5177t;
                                f fVar2 = iVar.f5175r;
                                try {
                                    cf.c.M(obj);
                                    i10 = i12;
                                    fVar = fVar2;
                                } catch (Throwable th4) {
                                    i10 = i12;
                                    th = th4;
                                    n0Var = new n0(th);
                                    iVar.f5175r = null;
                                    iVar.f5176s = th;
                                    iVar.f5177t = i10;
                                    iVar.f5173e = 2;
                                    if (b0.c(n0Var, r32, th, iVar) != aVar2) {
                                    }
                                }
                            }
                            qVar = new ke.q(fVar, iVar.getContext());
                            iVar.f5175r = null;
                            iVar.f5176s = qVar;
                            iVar.f5177t = i10;
                            iVar.f5173e = 3;
                            if (r32.a(qVar, null, iVar) != aVar2) {
                                return aVar2;
                            }
                            qVar2 = qVar;
                            qVar2.releaseIntercepted();
                            return Unit.f5554a;
                        }
                    }
                    iVar.f5175r = null;
                    iVar.f5176s = qVar;
                    iVar.f5177t = i10;
                    iVar.f5173e = 3;
                    if (r32.a(qVar, null, iVar) != aVar2) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    qVar2 = qVar;
                    qVar2.releaseIntercepted();
                    throw th;
                }
                iVar = new i(this, aVar);
                Object obj2 = iVar.f5172d;
                aVar2 = md.a.f6622d;
                i3 = iVar.f5173e;
                r32 = this.f5180i;
                if (i3 != 0) {
                }
                qVar = new ke.q(fVar, iVar.getContext());
            default:
                Object c10 = this.f5179e.c(new n(new wd.z(), fVar, (Function2) this.f5180i), aVar);
                return c10 == md.a.f6622d ? c10 : Unit.f5554a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(e eVar, vd.n nVar) {
        this.f5179e = eVar;
        this.f5180i = (nd.i) nVar;
    }
}
