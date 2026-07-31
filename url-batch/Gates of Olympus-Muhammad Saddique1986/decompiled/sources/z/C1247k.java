package z;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import q2.X;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247k extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f10454i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1249m f10455j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247k(X x3, C1249m c1249m, V1.d dVar) {
        super(2, dVar);
        this.f10454i = x3;
        this.f10455j = c1249m;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((C1247k) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1247k(this.f10454i, this.f10455j, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:8:0x003a). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.Object r10) {
        /*
            r9 = this;
            W1.a r0 = W1.a.f4608d
            int r1 = r9.f10453h
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 3
            r6 = 2
            r7 = 1
            z.m r8 = r9.f10455j
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            R1.a.e(r10)     // Catch: java.lang.Throwable -> L18
            goto L3a
        L18:
            r10 = move-exception
            goto L58
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            R1.a.e(r10)     // Catch: java.lang.Throwable -> L18
            goto L4a
        L26:
            R1.a.e(r10)
            goto L3a
        L2a:
            R1.a.e(r10)
            q2.X r10 = r9.f10454i
            if (r10 == 0) goto L3a
            r9.f10453h = r7
            java.lang.Object r10 = q2.AbstractC0837y.d(r10, r9)
            if (r10 != r0) goto L3a
            return r0
        L3a:
            I.f0 r10 = r8.f10459b     // Catch: java.lang.Throwable -> L18
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.h(r1)     // Catch: java.lang.Throwable -> L18
            r9.f10453h = r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = q2.AbstractC0837y.f(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L4a
            return r0
        L4a:
            I.f0 r10 = r8.f10459b     // Catch: java.lang.Throwable -> L18
            r10.h(r2)     // Catch: java.lang.Throwable -> L18
            r9.f10453h = r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = q2.AbstractC0837y.f(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L3a
            return r0
        L58:
            I.f0 r0 = r8.f10459b
            r0.h(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C1247k.q(java.lang.Object):java.lang.Object");
    }
}
