package n;

import e2.InterfaceC0426e;
import n0.C0700A;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685k extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int f7157f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0687m f7159h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0685k(C0687m c0687m, V1.d dVar) {
        super(2, dVar);
        this.f7159h = c0687m;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0685k) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0685k c0685k = new C0685k(this.f7159h, dVar);
        c0685k.f7158g = obj;
        return c0685k;
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
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.Object r13) {
        /*
            r12 = this;
            W1.a r0 = W1.a.f4608d
            int r1 = r12.f7157f
            r2 = 2
            r3 = 1
            n.m r4 = r12.f7159h
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r12.f7158g
            n0.A r1 = (n0.C0700A) r1
            R1.a.e(r13)
            goto L5a
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            java.lang.Object r1 = r12.f7158g
            n0.A r1 = (n0.C0700A) r1
            R1.a.e(r13)
            goto L39
        L26:
            R1.a.e(r13)
            java.lang.Object r13 = r12.f7158g
            r1 = r13
            n0.A r1 = (n0.C0700A) r1
            r12.f7158g = r1
            r12.f7157f = r3
            java.lang.Object r13 = p.U0.c(r1, r12, r2)
            if (r13 != r0) goto L39
            return r0
        L39:
            n0.s r13 = (n0.s) r13
            long r5 = r13.f7308a
            n0.r r3 = new n0.r
            r3.<init>(r5)
            r4.f7170j = r3
            a0.c r3 = new a0.c
            long r5 = r13.f7310c
            r3.<init>(r5)
            r4.f7164d = r3
        L4d:
            r12.f7158g = r1
            r12.f7157f = r2
            n0.j r13 = n0.EnumC0712j.f7296e
            java.lang.Object r13 = r1.b(r13, r12)
            if (r13 != r0) goto L5a
            return r0
        L5a:
            n0.i r13 = (n0.C0711i) r13
            java.lang.Object r13 = r13.f7292a
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
            n0.s r9 = (n0.s) r9
            boolean r9 = r9.f7311d
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
            n0.s r8 = (n0.s) r8
            long r8 = r8.f7308a
            n0.r r10 = r4.f7170j
            if (r10 != 0) goto L95
            goto L9b
        L95:
            long r10 = r10.f7307a
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L9f
        L9b:
            int r6 = r6 + 1
            goto L84
        L9e:
            r7 = r5
        L9f:
            n0.s r7 = (n0.s) r7
            if (r7 != 0) goto Laa
            java.lang.Object r13 = S1.l.L0(r3)
            r7 = r13
            n0.s r7 = (n0.s) r7
        Laa:
            if (r7 == 0) goto Lbe
            n0.r r13 = new n0.r
            long r8 = r7.f7308a
            r13.<init>(r8)
            r4.f7170j = r13
            a0.c r13 = new a0.c
            long r6 = r7.f7310c
            r13.<init>(r6)
            r4.f7164d = r13
        Lbe:
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L4d
            r4.f7170j = r5
            R1.y r13 = R1.y.f4171a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0685k.q(java.lang.Object):java.lang.Object");
    }
}
