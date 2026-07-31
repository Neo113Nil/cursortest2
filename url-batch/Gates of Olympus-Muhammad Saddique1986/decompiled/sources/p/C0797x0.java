package p;

import e2.InterfaceC0426e;
import n0.C0700A;

/* renamed from: p.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797x0 extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public long f7801f;

    /* renamed from: g, reason: collision with root package name */
    public int f7802g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7803h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.s f7804i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797x0(n0.s sVar, V1.d dVar) {
        super(2, dVar);
        this.f7804i = sVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0797x0) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0797x0 c0797x0 = new C0797x0(this.f7804i, dVar);
        c0797x0.f7803h = obj;
        return c0797x0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.Object r8) {
        /*
            r7 = this;
            W1.a r0 = W1.a.f4608d
            int r1 = r7.f7802g
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f7801f
            java.lang.Object r1 = r7.f7803h
            n0.A r1 = (n0.C0700A) r1
            R1.a.e(r8)
            goto L40
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            R1.a.e(r8)
            java.lang.Object r8 = r7.f7803h
            n0.A r8 = (n0.C0700A) r8
            n0.s r1 = r7.f7804i
            long r3 = r1.f7309b
            u0.O0 r1 = r8.e()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f7803h = r1
            r7.f7801f = r3
            r7.f7802g = r2
            r8 = 3
            java.lang.Object r8 = p.U0.c(r1, r7, r8)
            if (r8 != r0) goto L40
            return r0
        L40:
            n0.s r8 = (n0.s) r8
            long r5 = r8.f7309b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0797x0.q(java.lang.Object):java.lang.Object");
    }
}
