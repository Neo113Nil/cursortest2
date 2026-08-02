package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class J extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1259a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f1261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1261c = m4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        J j4 = new J(this.f1261c, interfaceC0425c);
        j4.f1260b = obj;
        return j4;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((Y) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1259a;
        if (i4 == 0) {
            O3.l.w(obj);
            Y y4 = (Y) this.f1260b;
            this.f1259a = 1;
            if (M.c(this.f1261c, y4, this) == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
        }
        return C0297i.f5732a;
    }
}
