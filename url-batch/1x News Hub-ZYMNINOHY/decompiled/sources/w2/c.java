package w2;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class c extends x2.e {

    /* renamed from: d, reason: collision with root package name */
    public final g0.i f10645d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.i f10646e;

    public c(g0.i iVar, d2.h hVar, int i3, v2.a aVar) {
        super(hVar, i3, aVar);
        this.f10645d = iVar;
        this.f10646e = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // x2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v2.p pVar, InterfaceC0300c interfaceC0300c) {
        b bVar;
        int i3;
        if (interfaceC0300c instanceof b) {
            bVar = (b) interfaceC0300c;
            int i4 = bVar.f10644g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.f10644g = i4 - Integer.MIN_VALUE;
                Object obj = bVar.f10643e;
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                i3 = bVar.f10644g;
                C0195i c0195i = C0195i.f2555a;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj);
                    bVar.f10642d = pVar;
                    bVar.f10644g = 1;
                    Object invoke = this.f10645d.invoke(pVar, bVar);
                    if (invoke != enumC0317a) {
                        invoke = c0195i;
                    }
                    if (invoke == enumC0317a) {
                        return enumC0317a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = bVar.f10642d;
                    android.support.v4.media.session.a.T(obj);
                }
                if (((v2.o) pVar).f10614d.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return c0195i;
            }
        }
        bVar = new b(this, (AbstractC0326c) interfaceC0300c);
        Object obj2 = bVar.f10643e;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = bVar.f10644g;
        C0195i c0195i2 = C0195i.f2555a;
        if (i3 != 0) {
        }
        if (((v2.o) pVar).f10614d.s()) {
        }
    }

    @Override // x2.e
    public final x2.e b(d2.h hVar, int i3, v2.a aVar) {
        return new c(this.f10646e, hVar, i3, aVar);
    }

    @Override // x2.e
    public final String toString() {
        return "block[" + this.f10645d + "] -> " + super.toString();
    }
}
