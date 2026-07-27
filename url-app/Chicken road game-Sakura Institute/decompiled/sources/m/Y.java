package m;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class Y extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8053k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f8054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z4, C2.a aVar) {
        super(2, aVar);
        this.f8054l = z4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Y) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new Y(this.f8054l, aVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:6:0x004c). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object r8) {
        /*
            r7 = this;
            D2.a r0 = D2.a.f2163d
            int r1 = r7.f8053k
            r2 = 2
            r3 = 1
            m.Z r4 = r7.f8054l
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            y2.AbstractC1343r.b(r8)
            goto L4c
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            y2.AbstractC1343r.b(r8)
            goto L2e
        L1e:
            y2.AbstractC1343r.b(r8)
        L21:
            Y2.e r8 = r4.f8064K
            if (r8 == 0) goto L2e
            r7.f8053k = r3
            java.lang.Object r8 = r8.l(r7)
            if (r8 != r0) goto L2e
            return r0
        L2e:
            m.j0 r8 = r4.f8059F
            if (r8 == 0) goto L21
            m.r r8 = m.r.f8169j
            r7.f8053k = r2
            kotlin.coroutines.CoroutineContext r1 = r7.f2311e
            kotlin.jvm.internal.Intrinsics.c(r1)
            G.X r1 = G.C0192d.F(r1)
            G.Y r5 = new G.Y
            r6 = 0
            r5.<init>(r6, r8)
            java.lang.Object r8 = r1.f(r5, r7)
            if (r8 != r0) goto L4c
            return r0
        L4c:
            m.j0 r8 = r4.f8059F
            if (r8 == 0) goto L21
            m.l0 r8 = (m.l0) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: m.Y.l(java.lang.Object):java.lang.Object");
    }
}
