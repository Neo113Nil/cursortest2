package n;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class b0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0 f7089i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, V1.d dVar) {
        super(2, dVar);
        this.f7089i = c0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((b0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new b0(this.f7089i, dVar);
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
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.Object r8) {
        /*
            r7 = this;
            W1.a r0 = W1.a.f4608d
            int r1 = r7.f7088h
            r2 = 2
            r3 = 1
            n.c0 r4 = r7.f7089i
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            R1.a.e(r8)
            goto L4c
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            R1.a.e(r8)
            goto L2e
        L1e:
            R1.a.e(r8)
        L21:
            s2.g r8 = r4.f7100H
            if (r8 == 0) goto L2e
            r7.f7088h = r3
            java.lang.Object r8 = r8.i(r7)
            if (r8 != r0) goto L2e
            return r0
        L2e:
            n.m0 r8 = r4.C
            if (r8 == 0) goto L21
            n.q r8 = n.C0691q.f7189h
            r7.f7088h = r2
            V1.i r1 = r7.f4642e
            f2.j.c(r1)
            I.X r1 = I.C0143d.F(r1)
            I.Y r5 = new I.Y
            r6 = 0
            r5.<init>(r6, r8)
            java.lang.Object r8 = r1.n(r5, r7)
            if (r8 != r0) goto L4c
            return r0
        L4c:
            n.m0 r8 = r4.C
            if (r8 == 0) goto L21
            n.o0 r8 = (n.o0) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b0.q(java.lang.Object):java.lang.Object");
    }
}
