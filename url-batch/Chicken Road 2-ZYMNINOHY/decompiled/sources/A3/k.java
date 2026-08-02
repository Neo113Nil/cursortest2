package A3;

import K.C0065n;
import K.C0066o;
import K.C0067p;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102c;

    public /* synthetic */ k(Object obj, int i4, Object obj2) {
        this.f100a = i4;
        this.f101b = obj;
        this.f102c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    @Override // A3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(e eVar, InterfaceC0425c interfaceC0425c) {
        j jVar;
        EnumC0441a enumC0441a;
        int i4;
        Throwable th;
        B3.m mVar;
        k kVar;
        e eVar2;
        d dVar;
        n nVar;
        int i5;
        p pVar;
        switch (this.f100a) {
            case 0:
                if (interfaceC0425c instanceof j) {
                    jVar = (j) interfaceC0425c;
                    int i6 = jVar.f95b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        jVar.f95b = i6 - Integer.MIN_VALUE;
                        Object obj = jVar.f94a;
                        enumC0441a = EnumC0441a.f9038a;
                        i4 = jVar.f95b;
                        if (i4 != 0) {
                            O3.l.w(obj);
                            B3.m mVar2 = new B3.m(eVar, jVar.getContext());
                            try {
                                C0065n c0065n = (C0065n) this.f101b;
                                jVar.f97d = this;
                                jVar.f98e = eVar;
                                jVar.f99f = mVar2;
                                jVar.f95b = 1;
                                if (c0065n.invoke(mVar2, jVar) == enumC0441a) {
                                    return enumC0441a;
                                }
                                kVar = this;
                                eVar2 = eVar;
                                mVar = mVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                mVar = mVar2;
                                mVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                O3.l.w(obj);
                                return C0297i.f5732a;
                            }
                            mVar = jVar.f99f;
                            eVar2 = jVar.f98e;
                            kVar = jVar.f97d;
                            try {
                                O3.l.w(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                mVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        mVar.releaseIntercepted();
                        dVar = (d) kVar.f102c;
                        jVar.f97d = null;
                        jVar.f98e = null;
                        jVar.f99f = null;
                        jVar.f95b = 2;
                        if (dVar.collect(eVar2, jVar) == enumC0441a) {
                            return enumC0441a;
                        }
                        return C0297i.f5732a;
                    }
                }
                jVar = new j(this, interfaceC0425c);
                Object obj2 = jVar.f94a;
                enumC0441a = EnumC0441a.f9038a;
                i4 = jVar.f95b;
                if (i4 != 0) {
                }
                mVar.releaseIntercepted();
                dVar = (d) kVar.f102c;
                jVar.f97d = null;
                jVar.f98e = null;
                jVar.f99f = null;
                jVar.f95b = 2;
                if (dVar.collect(eVar2, jVar) == enumC0441a) {
                }
                return C0297i.f5732a;
            case 1:
                Object collect = ((k) this.f101b).collect(new m(new kotlin.jvm.internal.n(), eVar, (C0067p) this.f102c), interfaceC0425c);
                return collect == EnumC0441a.f9038a ? collect : C0297i.f5732a;
            default:
                if (interfaceC0425c instanceof n) {
                    nVar = (n) interfaceC0425c;
                    int i7 = nVar.f113b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        nVar.f113b = i7 - Integer.MIN_VALUE;
                        Object obj3 = nVar.f112a;
                        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
                        i5 = nVar.f113b;
                        if (i5 != 0) {
                            O3.l.w(obj3);
                            k kVar2 = (k) this.f101b;
                            p pVar2 = new p((C0066o) this.f102c, eVar);
                            try {
                                nVar.f115d = pVar2;
                                nVar.f113b = 1;
                                if (kVar2.collect(pVar2, nVar) == enumC0441a2) {
                                    return enumC0441a2;
                                }
                            } catch (B3.a e4) {
                                e = e4;
                                pVar = pVar2;
                                if (e.f218a != pVar) {
                                }
                                return C0297i.f5732a;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pVar = nVar.f115d;
                            try {
                                O3.l.w(obj3);
                            } catch (B3.a e5) {
                                e = e5;
                                if (e.f218a != pVar) {
                                    throw e;
                                }
                                return C0297i.f5732a;
                            }
                        }
                        return C0297i.f5732a;
                    }
                }
                nVar = new n(this, interfaceC0425c);
                Object obj32 = nVar.f112a;
                EnumC0441a enumC0441a22 = EnumC0441a.f9038a;
                i5 = nVar.f113b;
                if (i5 != 0) {
                }
                return C0297i.f5732a;
        }
    }
}
