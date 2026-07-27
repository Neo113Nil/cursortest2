package M;

import D4.InterfaceC0022w;
import k4.InterfaceC1218d;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class f0 extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1445p f1682a;

    /* renamed from: b, reason: collision with root package name */
    public int f1683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.i f1684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(B0.i iVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1684c = iVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new f0(this.f1684c, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
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
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            l4.a r0 = l4.EnumC1260a.f11058a
            int r1 = r6.f1683b
            r2 = 2
            r3 = 1
            B0.i r4 = r6.f1684c
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            e5.g.y(r7)
            goto L5c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            t4.p r1 = r6.f1682a
            e5.g.y(r7)
            goto L50
        L20:
            e5.g.y(r7)
            java.lang.Object r7 = r4.f156e
            h2.c r7 = (h2.C0482c) r7
            java.lang.Object r7 = r7.f5783b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6d
        L31:
            java.lang.Object r7 = r4.f153b
            D4.w r7 = (D4.InterfaceC0022w) r7
            k4.i r7 = r7.g()
            D4.AbstractC0024y.e(r7)
            java.lang.Object r7 = r4.f154c
            r1 = r7
            M.M r1 = (M.M) r1
            r6.f1682a = r1
            r6.f1683b = r3
            java.lang.Object r7 = r4.f155d
            F4.b r7 = (F4.b) r7
            java.lang.Object r7 = r7.e(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = 0
            r6.f1682a = r5
            r6.f1683b = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L5c
            return r0
        L5c:
            java.lang.Object r7 = r4.f156e
            h2.c r7 = (h2.C0482c) r7
            java.lang.Object r7 = r7.f5783b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L31
            f4.v r7 = f4.v.f5689a
            return r7
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: M.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
