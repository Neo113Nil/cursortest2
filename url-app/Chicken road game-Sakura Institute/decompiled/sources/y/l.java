package y;

import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11483k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0280c0 f11484l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f11485m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC0280c0 interfaceC0280c0, n nVar, C2.a aVar) {
        super(2, aVar);
        this.f11484l = interfaceC0280c0;
        this.f11485m = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((l) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new l(this.f11484l, this.f11485m, aVar);
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
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object r10) {
        /*
            r9 = this;
            D2.a r0 = D2.a.f2163d
            int r1 = r9.f11483k
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 3
            r6 = 2
            r7 = 1
            y.n r8 = r9.f11485m
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            y2.AbstractC1343r.b(r10)     // Catch: java.lang.Throwable -> L18
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
            y2.AbstractC1343r.b(r10)     // Catch: java.lang.Throwable -> L18
            goto L4a
        L26:
            y2.AbstractC1343r.b(r10)
            goto L3a
        L2a:
            y2.AbstractC1343r.b(r10)
            W2.c0 r10 = r9.f11484l
            if (r10 == 0) goto L3a
            r9.f11483k = r7
            java.lang.Object r10 = W2.B.c(r10, r9)
            if (r10 != r0) goto L3a
            return r0
        L3a:
            G.f0 r10 = r8.f11489b     // Catch: java.lang.Throwable -> L18
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.f(r1)     // Catch: java.lang.Throwable -> L18
            r9.f11483k = r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = W2.F.a(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L4a
            return r0
        L4a:
            G.f0 r10 = r8.f11489b     // Catch: java.lang.Throwable -> L18
            r10.f(r2)     // Catch: java.lang.Throwable -> L18
            r9.f11483k = r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = W2.F.a(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L3a
            return r0
        L58:
            G.f0 r0 = r8.f11489b
            r0.f(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y.l.l(java.lang.Object):java.lang.Object");
    }
}
