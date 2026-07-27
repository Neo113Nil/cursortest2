package G4;

import k4.InterfaceC1218d;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B1.g f1068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M.r f1069b;

    public i(B1.g gVar, M.r rVar) {
        this.f1068a = gVar;
        this.f1069b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // G4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(e eVar, InterfaceC1218d interfaceC1218d) {
        h hVar;
        EnumC1260a enumC1260a;
        int i2;
        i iVar;
        z zVar;
        M.r rVar;
        H4.v vVar;
        Throwable th;
        H4.v vVar2;
        M.r rVar2;
        try {
            if (interfaceC1218d instanceof h) {
                hVar = (h) interfaceC1218d;
                int i3 = hVar.f1064b;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.f1064b = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.f1063a;
                    enumC1260a = EnumC1260a.f11058a;
                    i2 = hVar.f1064b;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        try {
                            B1.g gVar = this.f1068a;
                            hVar.f1066d = this;
                            hVar.f1067e = eVar;
                            hVar.f1064b = 1;
                            if (gVar.i(eVar, hVar) == enumC1260a) {
                                return enumC1260a;
                            }
                            iVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            zVar = new z(th);
                            rVar = iVar.f1069b;
                            hVar.f1066d = th;
                            hVar.f1067e = null;
                            hVar.f1064b = 2;
                            if (x.a(zVar, rVar, th, hVar) != enumC1260a) {
                                return enumC1260a;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                Throwable th3 = (Throwable) hVar.f1066d;
                                e5.g.y(obj);
                                throw th3;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            vVar2 = (H4.v) hVar.f1066d;
                            try {
                                e5.g.y(obj);
                                vVar2.releaseIntercepted();
                                return f4.v.f5689a;
                            } catch (Throwable th4) {
                                th = th4;
                                vVar2.releaseIntercepted();
                                throw th;
                            }
                        }
                        eVar = hVar.f1067e;
                        iVar = (i) hVar.f1066d;
                        try {
                            e5.g.y(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            zVar = new z(th);
                            rVar = iVar.f1069b;
                            hVar.f1066d = th;
                            hVar.f1067e = null;
                            hVar.f1064b = 2;
                            if (x.a(zVar, rVar, th, hVar) != enumC1260a) {
                            }
                        }
                    }
                    vVar = new H4.v(eVar, hVar.getContext());
                    rVar2 = iVar.f1069b;
                    hVar.f1066d = vVar;
                    hVar.f1067e = null;
                    hVar.f1064b = 3;
                    if (rVar2.invoke(vVar, null, hVar) != enumC1260a) {
                        return enumC1260a;
                    }
                    vVar2 = vVar;
                    vVar2.releaseIntercepted();
                    return f4.v.f5689a;
                }
            }
            rVar2 = iVar.f1069b;
            hVar.f1066d = vVar;
            hVar.f1067e = null;
            hVar.f1064b = 3;
            if (rVar2.invoke(vVar, null, hVar) != enumC1260a) {
            }
        } catch (Throwable th6) {
            th = th6;
            vVar2 = vVar;
            vVar2.releaseIntercepted();
            throw th;
        }
        hVar = new h(this, interfaceC1218d);
        Object obj2 = hVar.f1063a;
        enumC1260a = EnumC1260a.f11058a;
        i2 = hVar.f1064b;
        if (i2 != 0) {
        }
        vVar = new H4.v(eVar, hVar.getContext());
    }
}
