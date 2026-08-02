package A3;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class t implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f130b;

    public t(k kVar) {
        this.f130b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Type inference failed for: r7v4, types: [h3.g, o3.p] */
    @Override // A3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(e eVar, InterfaceC0425c interfaceC0425c) {
        a aVar;
        int i4;
        Throwable th;
        B3.m mVar;
        switch (this.f129a) {
            case 0:
                if (interfaceC0425c instanceof a) {
                    aVar = (a) interfaceC0425c;
                    int i5 = aVar.f71d;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aVar.f71d = i5 - Integer.MIN_VALUE;
                        Object obj = aVar.f69b;
                        EnumC0441a enumC0441a = EnumC0441a.f9038a;
                        i4 = aVar.f71d;
                        C0297i c0297i = C0297i.f5732a;
                        if (i4 != 0) {
                            O3.l.w(obj);
                            B3.m mVar2 = new B3.m(eVar, aVar.getContext());
                            try {
                                aVar.f68a = mVar2;
                                aVar.f71d = 1;
                                Object invoke = ((h3.g) this.f130b).invoke(mVar2, aVar);
                                if (invoke != enumC0441a) {
                                    invoke = c0297i;
                                }
                                if (invoke == enumC0441a) {
                                    return enumC0441a;
                                }
                                mVar = mVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                mVar = mVar2;
                                mVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mVar = aVar.f68a;
                            try {
                                O3.l.w(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                mVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        mVar.releaseIntercepted();
                        return c0297i;
                    }
                }
                aVar = new a(this, interfaceC0425c);
                Object obj2 = aVar.f69b;
                EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
                i4 = aVar.f71d;
                C0297i c0297i2 = C0297i.f5732a;
                if (i4 != 0) {
                }
                mVar.releaseIntercepted();
                return c0297i2;
            default:
                Object collect = ((k) this.f130b).collect(new q(1, eVar), interfaceC0425c);
                return collect == EnumC0441a.f9038a ? collect : C0297i.f5732a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(o3.p pVar) {
        this.f130b = (h3.g) pVar;
    }
}
