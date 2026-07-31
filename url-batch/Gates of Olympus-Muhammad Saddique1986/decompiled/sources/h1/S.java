package h1;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class S extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public J f6114h;

    /* renamed from: i, reason: collision with root package name */
    public int f6115i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G1.g f6116j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(G1.g gVar, V1.d dVar) {
        super(2, dVar);
        this.f6116j = gVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((S) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new S(this.f6116j, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:6:0x005c). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.Object r7) {
        /*
            r6 = this;
            W1.a r0 = W1.a.f4608d
            int r1 = r6.f6115i
            r2 = 2
            r3 = 1
            G1.g r4 = r6.f6116j
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            R1.a.e(r7)
            goto L5c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            h1.J r1 = r6.f6114h
            R1.a.e(r7)
            goto L50
        L20:
            R1.a.e(r7)
            java.lang.Object r7 = r4.f2096h
            B.Y r7 = (B.Y) r7
            java.lang.Object r7 = r7.f334d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6d
        L31:
            java.lang.Object r7 = r4.f2093e
            q2.w r7 = (q2.InterfaceC0835w) r7
            V1.i r7 = r7.q()
            q2.AbstractC0837y.g(r7)
            java.lang.Object r7 = r4.f2094f
            r1 = r7
            h1.J r1 = (h1.J) r1
            r6.f6114h = r1
            r6.f6115i = r3
            java.lang.Object r7 = r4.f2095g
            s2.g r7 = (s2.g) r7
            java.lang.Object r7 = r7.i(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = 0
            r6.f6114h = r5
            r6.f6115i = r2
            java.lang.Object r7 = r1.h(r7, r6)
            if (r7 != r0) goto L5c
            return r0
        L5c:
            java.lang.Object r7 = r4.f2096h
            B.Y r7 = (B.Y) r7
            java.lang.Object r7 = r7.f334d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L31
            R1.y r7 = R1.y.f4171a
            return r7
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.S.q(java.lang.Object):java.lang.Object");
    }
}
