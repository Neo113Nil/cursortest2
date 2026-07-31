package B;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import n0.C0700A;

/* loaded from: classes.dex */
public final class C extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int f268f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f270h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC0424c interfaceC0424c, V1.d dVar) {
        super(2, dVar);
        this.f270h = interfaceC0424c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((C) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C c2 = new C(this.f270h, dVar);
        c2.f269g = obj;
        return c2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.Object r5) {
        /*
            r4 = this;
            W1.a r0 = W1.a.f4608d
            int r1 = r4.f268f
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f269g
            n0.A r1 = (n0.C0700A) r1
            R1.a.e(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            R1.a.e(r5)
            java.lang.Object r5 = r4.f269g
            n0.A r5 = (n0.C0700A) r5
            r1 = r5
        L21:
            n0.j r5 = n0.EnumC0712j.f7295d
            r4.f269g = r1
            r4.f268f = r2
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            n0.i r5 = (n0.C0711i) r5
            boolean r5 = O2.l.i0(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            e2.c r3 = r4.f270h
            r3.n(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C.q(java.lang.Object):java.lang.Object");
    }
}
