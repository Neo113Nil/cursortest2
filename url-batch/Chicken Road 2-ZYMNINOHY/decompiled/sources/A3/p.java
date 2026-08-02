package A3;

import K.C0066o;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0066o f121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f122b;

    public p(C0066o c0066o, e eVar) {
        this.f121a = c0066o;
        this.f122b = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // A3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
        o oVar;
        int i4;
        boolean z;
        Object obj2;
        Object obj3;
        p pVar;
        if (interfaceC0425c instanceof o) {
            oVar = (o) interfaceC0425c;
            int i5 = oVar.f118c;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oVar.f118c = i5 - Integer.MIN_VALUE;
                Object obj4 = oVar.f117b;
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                i4 = oVar.f118c;
                z = true;
                if (i4 != 0) {
                    O3.l.w(obj4);
                    oVar.f116a = this;
                    oVar.f120e = obj;
                    oVar.f118c = 1;
                    Object invoke = this.f121a.invoke(obj, oVar);
                    if (invoke != enumC0441a) {
                        obj2 = invoke;
                        obj3 = obj;
                        pVar = this;
                    }
                    return enumC0441a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = oVar.f116a;
                    O3.l.w(obj4);
                    if (z) {
                        return C0297i.f5732a;
                    }
                    throw new B3.a(pVar);
                }
                Object obj5 = oVar.f120e;
                p pVar2 = oVar.f116a;
                O3.l.w(obj4);
                obj3 = obj5;
                pVar = pVar2;
                obj2 = obj4;
                if (((Boolean) obj2).booleanValue()) {
                    z = false;
                } else {
                    e eVar = pVar.f122b;
                    oVar.f116a = pVar;
                    oVar.f120e = null;
                    oVar.f118c = 2;
                }
                if (z) {
                }
            }
        }
        oVar = new o(this, (h3.c) interfaceC0425c);
        Object obj42 = oVar.f117b;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = oVar.f118c;
        z = true;
        if (i4 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        if (z) {
        }
    }
}
