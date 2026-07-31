package n;

import I.C0125v0;
import k2.InterfaceC0550w;
import t0.AbstractC0898f;
import v.C1017f;
import v.InterfaceC1012a;

/* renamed from: n.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638I extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0639J f6008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0638I(C0639J c0639j, P1.d dVar) {
        super(2, dVar);
        this.f6008f = c0639j;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0638I(this.f6008f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0638I) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r7 != r0) goto L10;
     */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC1012a interfaceC1012a;
        Object Q2;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6007e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f6007e = 1;
            C0639J c0639j = this.f6008f;
            if (c0639j.f3303d.p) {
                t0.a0 s3 = AbstractC0898f.s(c0639j);
                if (c0639j.f3303d.p) {
                    interfaceC1012a = (InterfaceC1012a) AbstractC0898f.j(c0639j, C1017f.f8569s);
                    if (interfaceC1012a == null) {
                        interfaceC1012a = new v.g(c0639j);
                    }
                } else {
                    interfaceC1012a = null;
                }
                if (interfaceC1012a != null) {
                    Q2 = interfaceC1012a.Q(s3, new C0125v0(null, 13, s3), this);
                }
            }
            Q2 = zVar;
            if (Q2 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return zVar;
    }
}
