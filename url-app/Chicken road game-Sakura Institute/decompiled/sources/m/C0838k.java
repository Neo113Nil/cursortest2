package m;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0800A;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838k extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int f8130i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8131j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0840m f8132k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0838k(C0840m c0840m, C2.a aVar) {
        super(2, aVar);
        this.f8132k = c0840m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0838k) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0838k c0838k = new C0838k(this.f8132k, aVar);
        c0838k.f8131j = obj;
        return c0838k;
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
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object r13) {
        /*
            r12 = this;
            D2.a r0 = D2.a.f2163d
            int r1 = r12.f8130i
            r2 = 2
            r3 = 1
            m.m r4 = r12.f8132k
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r12.f8131j
            l0.A r1 = (l0.C0800A) r1
            y2.AbstractC1343r.b(r13)
            goto L5a
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            java.lang.Object r1 = r12.f8131j
            l0.A r1 = (l0.C0800A) r1
            y2.AbstractC1343r.b(r13)
            goto L39
        L26:
            y2.AbstractC1343r.b(r13)
            java.lang.Object r13 = r12.f8131j
            r1 = r13
            l0.A r1 = (l0.C0800A) r1
            r12.f8131j = r1
            r12.f8130i = r3
            java.lang.Object r13 = o.R0.c(r1, r12, r2)
            if (r13 != r0) goto L39
            return r0
        L39:
            l0.s r13 = (l0.s) r13
            long r5 = r13.f7923a
            l0.r r3 = new l0.r
            r3.<init>(r5)
            r4.f8143m = r3
            Y.c r3 = new Y.c
            long r5 = r13.f7925c
            r3.<init>(r5)
            r4.f8137d = r3
        L4d:
            r12.f8131j = r1
            r12.f8130i = r2
            l0.j r13 = l0.EnumC0812j.f7911e
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L5a
            return r0
        L5a:
            l0.i r13 = (l0.C0811i) r13
            java.lang.Object r13 = r13.f7907a
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
            l0.s r9 = (l0.s) r9
            boolean r9 = r9.f7926d
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
            l0.s r8 = (l0.s) r8
            long r8 = r8.f7923a
            l0.r r10 = r4.f8143m
            if (r10 != 0) goto L95
            goto L9b
        L95:
            long r10 = r10.f7922a
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L9f
        L9b:
            int r6 = r6 + 1
            goto L84
        L9e:
            r7 = r5
        L9f:
            l0.s r7 = (l0.s) r7
            if (r7 != 0) goto Laa
            java.lang.Object r13 = z2.C1403G.r(r3)
            r7 = r13
            l0.s r7 = (l0.s) r7
        Laa:
            if (r7 == 0) goto Lbe
            l0.r r13 = new l0.r
            long r8 = r7.f7923a
            r13.<init>(r8)
            r4.f8143m = r13
            Y.c r13 = new Y.c
            long r6 = r7.f7925c
            r13.<init>(r6)
            r4.f8137d = r13
        Lbe:
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L4d
            r4.f8143m = r5
            kotlin.Unit r13 = kotlin.Unit.f7487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0838k.l(java.lang.Object):java.lang.Object");
    }
}
