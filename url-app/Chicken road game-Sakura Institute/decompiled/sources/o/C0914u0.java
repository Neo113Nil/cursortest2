package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0800A;

/* renamed from: o.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914u0 extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public long f8883i;

    /* renamed from: j, reason: collision with root package name */
    public int f8884j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8885k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.s f8886l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0914u0(l0.s sVar, C2.a aVar) {
        super(2, aVar);
        this.f8886l = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0914u0) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0914u0 c0914u0 = new C0914u0(this.f8886l, aVar);
        c0914u0.f8885k = obj;
        return c0914u0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object r8) {
        /*
            r7 = this;
            D2.a r0 = D2.a.f2163d
            int r1 = r7.f8884j
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f8883i
            java.lang.Object r1 = r7.f8885k
            l0.A r1 = (l0.C0800A) r1
            y2.AbstractC1343r.b(r8)
            goto L40
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            y2.AbstractC1343r.b(r8)
            java.lang.Object r8 = r7.f8885k
            l0.A r8 = (l0.C0800A) r8
            l0.s r1 = r7.f8886l
            long r3 = r1.f7924b
            s0.P0 r1 = r8.d()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f8885k = r1
            r7.f8883i = r3
            r7.f8884j = r2
            r8 = 3
            java.lang.Object r8 = o.R0.c(r1, r7, r8)
            if (r8 != r0) goto L40
            return r0
        L40:
            l0.s r8 = (l0.s) r8
            long r5 = r8.f7924b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0914u0.l(java.lang.Object):java.lang.Object");
    }
}
