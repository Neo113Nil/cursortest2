package A3;

import K.C0068q;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f92a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0068q f93b;

    public i(t tVar, C0068q c0068q) {
        this.f92a = tVar;
        this.f93b = c0068q;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // A3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(e eVar, InterfaceC0425c interfaceC0425c) {
        h hVar;
        EnumC0441a enumC0441a;
        int i4;
        i iVar;
        y yVar;
        C0068q c0068q;
        B3.m mVar;
        Throwable th;
        B3.m mVar2;
        C0068q c0068q2;
        try {
            if (interfaceC0425c instanceof h) {
                hVar = (h) interfaceC0425c;
                int i5 = hVar.f88b;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    hVar.f88b = i5 - Integer.MIN_VALUE;
                    Object obj = hVar.f87a;
                    enumC0441a = EnumC0441a.f9038a;
                    i4 = hVar.f88b;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        try {
                            t tVar = this.f92a;
                            hVar.f90d = this;
                            hVar.f91e = eVar;
                            hVar.f88b = 1;
                            if (tVar.collect(eVar, hVar) != enumC0441a) {
                                iVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            yVar = new y(th);
                            c0068q = iVar.f93b;
                            hVar.f90d = th;
                            hVar.f91e = null;
                            hVar.f88b = 2;
                            if (w.a(yVar, c0068q, th, hVar) != enumC0441a) {
                                return enumC0441a;
                            }
                            throw th;
                        }
                        return enumC0441a;
                    }
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Throwable th3 = (Throwable) hVar.f90d;
                            O3.l.w(obj);
                            throw th3;
                        }
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar2 = (B3.m) hVar.f90d;
                        try {
                            O3.l.w(obj);
                            mVar2.releaseIntercepted();
                            return C0297i.f5732a;
                        } catch (Throwable th4) {
                            th = th4;
                            mVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    eVar = hVar.f91e;
                    iVar = (i) hVar.f90d;
                    try {
                        O3.l.w(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        yVar = new y(th);
                        c0068q = iVar.f93b;
                        hVar.f90d = th;
                        hVar.f91e = null;
                        hVar.f88b = 2;
                        if (w.a(yVar, c0068q, th, hVar) != enumC0441a) {
                        }
                    }
                    mVar = new B3.m(eVar, hVar.getContext());
                    c0068q2 = iVar.f93b;
                    hVar.f90d = mVar;
                    hVar.f91e = null;
                    hVar.f88b = 3;
                    if (c0068q2.a(mVar, null, hVar) != enumC0441a) {
                        mVar2 = mVar;
                        mVar2.releaseIntercepted();
                        return C0297i.f5732a;
                    }
                    return enumC0441a;
                }
            }
            c0068q2 = iVar.f93b;
            hVar.f90d = mVar;
            hVar.f91e = null;
            hVar.f88b = 3;
            if (c0068q2.a(mVar, null, hVar) != enumC0441a) {
            }
            return enumC0441a;
        } catch (Throwable th6) {
            th = th6;
            mVar2 = mVar;
            mVar2.releaseIntercepted();
            throw th;
        }
        hVar = new h(this, interfaceC0425c);
        Object obj2 = hVar.f87a;
        enumC0441a = EnumC0441a.f9038a;
        i4 = hVar.f88b;
        if (i4 != 0) {
        }
        mVar = new B3.m(eVar, hVar.getContext());
    }
}
