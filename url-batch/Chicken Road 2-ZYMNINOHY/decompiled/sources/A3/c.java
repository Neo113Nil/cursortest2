package A3;

import c3.C0297i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class c extends B3.e {

    /* renamed from: d, reason: collision with root package name */
    public final y1.j f76d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.j f77e;

    public c(y1.j jVar, InterfaceC0430h interfaceC0430h, int i4, z3.a aVar) {
        super(interfaceC0430h, i4, aVar);
        this.f76d = jVar;
        this.f77e = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // B3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z3.p pVar, InterfaceC0425c interfaceC0425c) {
        b bVar;
        int i4;
        if (interfaceC0425c instanceof b) {
            bVar = (b) interfaceC0425c;
            int i5 = bVar.f75d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f75d = i5 - Integer.MIN_VALUE;
                Object obj = bVar.f73b;
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                i4 = bVar.f75d;
                C0297i c0297i = C0297i.f5732a;
                if (i4 != 0) {
                    O3.l.w(obj);
                    bVar.f72a = pVar;
                    bVar.f75d = 1;
                    Object invoke = this.f76d.invoke(pVar, bVar);
                    if (invoke != enumC0441a) {
                        invoke = c0297i;
                    }
                    if (invoke == enumC0441a) {
                        return enumC0441a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = bVar.f72a;
                    O3.l.w(obj);
                }
                if (((z3.o) pVar).f16336d.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return c0297i;
            }
        }
        bVar = new b(this, (h3.c) interfaceC0425c);
        Object obj2 = bVar.f73b;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = bVar.f75d;
        C0297i c0297i2 = C0297i.f5732a;
        if (i4 != 0) {
        }
        if (((z3.o) pVar).f16336d.s()) {
        }
    }

    @Override // B3.e
    public final String toString() {
        return "block[" + this.f76d + "] -> " + super.toString();
    }
}
