package e1;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class T extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public C0348K f4661e;

    /* renamed from: f, reason: collision with root package name */
    public int f4662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A2.k f4663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(A2.k kVar, P1.d dVar) {
        super(2, dVar);
        this.f4663g = kVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new T(this.f4663g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((T) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
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
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Q1.a r0 = Q1.a.f3113d
            int r1 = r6.f4662f
            r2 = 2
            r3 = 1
            A2.k r4 = r6.f4663g
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            I2.l.Q(r7)
            goto L5c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            e1.K r1 = r6.f4661e
            I2.l.Q(r7)
            goto L50
        L20:
            I2.l.Q(r7)
            java.lang.Object r7 = r4.f111e
            A2.g r7 = (A2.g) r7
            java.lang.Object r7 = r7.f83b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6d
        L31:
            java.lang.Object r7 = r4.f108b
            k2.w r7 = (k2.InterfaceC0550w) r7
            P1.i r7 = r7.u()
            k2.AbstractC0552y.f(r7)
            java.lang.Object r7 = r4.f109c
            r1 = r7
            e1.K r1 = (e1.C0348K) r1
            r6.f4661e = r1
            r6.f4662f = r3
            java.lang.Object r7 = r4.f110d
            m2.e r7 = (m2.e) r7
            java.lang.Object r7 = r7.c(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = 0
            r6.f4661e = r5
            r6.f4662f = r2
            java.lang.Object r7 = r1.g(r7, r6)
            if (r7 != r0) goto L5c
            return r0
        L5c:
            java.lang.Object r7 = r4.f111e
            A2.g r7 = (A2.g) r7
            java.lang.Object r7 = r7.f83b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L31
            L1.z r7 = L1.z.f2729a
            return r7
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
