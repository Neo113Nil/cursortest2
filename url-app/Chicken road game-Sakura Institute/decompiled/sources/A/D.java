package A;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.C0800A;

/* loaded from: classes.dex */
public final class D extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int f11i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f12j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f13k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Function1 function1, C2.a aVar) {
        super(2, aVar);
        this.f13k = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((D) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        D d4 = new D(this.f13k, aVar);
        d4.f12j = obj;
        return d4;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object r5) {
        /*
            r4 = this;
            D2.a r0 = D2.a.f2163d
            int r1 = r4.f11i
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f12j
            l0.A r1 = (l0.C0800A) r1
            y2.AbstractC1343r.b(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            y2.AbstractC1343r.b(r5)
            java.lang.Object r5 = r4.f12j
            l0.A r5 = (l0.C0800A) r5
            r1 = r5
        L21:
            l0.j r5 = l0.EnumC0812j.f7910d
            r4.f12j = r1
            r4.f11i = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            l0.i r5 = (l0.C0811i) r5
            boolean r5 = u3.d.K(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            kotlin.jvm.functions.Function1 r3 = r4.f13k
            r3.invoke(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: A.D.l(java.lang.Object):java.lang.Object");
    }
}
