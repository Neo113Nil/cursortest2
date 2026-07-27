package f1;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class T extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public K f6541k;

    /* renamed from: l, reason: collision with root package name */
    public int f6542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y0.b f6543m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Y0.b bVar, C2.a aVar) {
        super(2, aVar);
        this.f6543m = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((T) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new T(this.f6543m, aVar);
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
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object r7) {
        /*
            r6 = this;
            D2.a r0 = D2.a.f2163d
            int r1 = r6.f6542l
            r2 = 2
            r3 = 1
            Y0.b r4 = r6.f6543m
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            y2.AbstractC1343r.b(r7)
            goto L5c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            f1.K r1 = r6.f6541k
            y2.AbstractC1343r.b(r7)
            goto L50
        L20:
            y2.AbstractC1343r.b(r7)
            java.lang.Object r7 = r4.f4389e
            f1.a r7 = (f1.C0607a) r7
            java.lang.Object r7 = r7.f6561e
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6d
        L31:
            java.lang.Object r7 = r4.f4390i
            W2.y r7 = (W2.InterfaceC0302y) r7
            kotlin.coroutines.CoroutineContext r7 = r7.q()
            W2.B.e(r7)
            java.lang.Object r7 = r4.f4391j
            r1 = r7
            f1.K r1 = (f1.K) r1
            r6.f6541k = r1
            r6.f6542l = r3
            java.lang.Object r7 = r4.f4392k
            Y2.e r7 = (Y2.e) r7
            java.lang.Object r7 = r7.l(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = 0
            r6.f6541k = r5
            r6.f6542l = r2
            java.lang.Object r7 = r1.h(r7, r6)
            if (r7 != r0) goto L5c
            return r0
        L5c:
            java.lang.Object r7 = r4.f4389e
            f1.a r7 = (f1.C0607a) r7
            java.lang.Object r7 = r7.f6561e
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L31
            kotlin.Unit r7 = kotlin.Unit.f7487a
            return r7
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.T.l(java.lang.Object):java.lang.Object");
    }
}
