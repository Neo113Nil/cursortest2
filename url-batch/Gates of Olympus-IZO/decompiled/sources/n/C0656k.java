package n;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656k extends R1.h implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6102e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0658m f6104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656k(C0658m c0658m, P1.d dVar) {
        super(2, dVar);
        this.f6104g = c0658m;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0656k c0656k = new C0656k(this.f6104g, dVar);
        c0656k.f6103f = obj;
        return c0656k;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0656k) create((n0.t) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            Q1.a r0 = Q1.a.f3113d
            int r1 = r12.f6102e
            r2 = 2
            r3 = 1
            n.m r4 = r12.f6104g
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r12.f6103f
            n0.t r1 = (n0.t) r1
            I2.l.Q(r13)
            goto L5a
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            java.lang.Object r1 = r12.f6103f
            n0.t r1 = (n0.t) r1
            I2.l.Q(r13)
            goto L39
        L26:
            I2.l.Q(r13)
            java.lang.Object r13 = r12.f6103f
            r1 = r13
            n0.t r1 = (n0.t) r1
            r12.f6103f = r1
            r12.f6102e = r3
            java.lang.Object r13 = o.x0.b(r1, r12, r2)
            if (r13 != r0) goto L39
            return r0
        L39:
            n0.m r13 = (n0.m) r13
            long r5 = r13.f6223a
            n0.l r3 = new n0.l
            r3.<init>(r5)
            r4.f6126j = r3
            a0.c r3 = new a0.c
            long r5 = r13.f6225c
            r3.<init>(r5)
            r4.f6120d = r3
        L4d:
            r12.f6103f = r1
            r12.f6102e = r2
            n0.h r13 = n0.h.f6217e
            java.lang.Object r13 = r1.b(r13, r12)
            if (r13 != r0) goto L5a
            return r0
        L5a:
            n0.g r13 = (n0.g) r13
            java.lang.Object r13 = r13.f6214a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r13.size()
            r3.<init>(r5)
            int r5 = r13.size()
            r6 = 0
            r7 = r6
        L6d:
            if (r7 >= r5) goto L80
            java.lang.Object r8 = r13.get(r7)
            r9 = r8
            n0.m r9 = (n0.m) r9
            boolean r9 = r9.f6226d
            if (r9 == 0) goto L7d
            r3.add(r8)
        L7d:
            int r7 = r7 + 1
            goto L6d
        L80:
            int r13 = r3.size()
        L84:
            r5 = 0
            if (r6 >= r13) goto L9e
            java.lang.Object r7 = r3.get(r6)
            r8 = r7
            n0.m r8 = (n0.m) r8
            long r8 = r8.f6223a
            n0.l r10 = r4.f6126j
            if (r10 != 0) goto L95
            goto L9b
        L95:
            long r10 = r10.f6222a
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L9f
        L9b:
            int r6 = r6 + 1
            goto L84
        L9e:
            r7 = r5
        L9f:
            n0.m r7 = (n0.m) r7
            if (r7 != 0) goto Laa
            java.lang.Object r13 = M1.l.n0(r3)
            r7 = r13
            n0.m r7 = (n0.m) r7
        Laa:
            if (r7 == 0) goto Lbe
            n0.l r13 = new n0.l
            long r8 = r7.f6223a
            r13.<init>(r8)
            r4.f6126j = r13
            a0.c r13 = new a0.c
            long r6 = r7.f6225c
            r13.<init>(r6)
            r4.f6120d = r13
        Lbe:
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L4d
            r4.f6126j = r5
            L1.z r13 = L1.z.f2729a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0656k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
