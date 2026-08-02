package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class F extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f1246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(M m4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1246b = m4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new F(this.f1246b, interfaceC0425c);
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r0.h(r6) == r2) goto L22;
     */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m4 = this.f1246b;
        t1.h hVar = m4.f1280h;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1245a;
        try {
            if (i4 == 0) {
                O3.l.w(obj);
                if (hVar.j() instanceof X) {
                    return hVar.j();
                }
                this.f1245a = 1;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    O3.l.w(obj);
                    return (h0) obj;
                }
                O3.l.w(obj);
            }
            this.f1245a = 2;
            obj = M.e(m4, false, this);
        } catch (Throwable th) {
            return new Z(th, -1);
        }
    }
}
