package G;

import Q.C0273i;
import Z2.InterfaceC0331g;
import i.C0661B;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class U0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public C0661B f2763k;

    /* renamed from: l, reason: collision with root package name */
    public Function1 f2764l;

    /* renamed from: m, reason: collision with root package name */
    public Y2.i f2765m;

    /* renamed from: n, reason: collision with root package name */
    public C0273i f2766n;

    /* renamed from: o, reason: collision with root package name */
    public Object f2767o;

    /* renamed from: p, reason: collision with root package name */
    public int f2768p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f2769q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ M2.p f2770r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U0(Function0 function0, C2.a aVar) {
        super(2, aVar);
        this.f2770r = (M2.p) function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((U0) j((C2.a) obj2, (InterfaceC0331g) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        U0 u02 = new U0(this.f2770r, aVar);
        u02.f2769q = obj;
        return u02;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c5 A[LOOP:0: B:17:0x00da->B:25:0x01c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016a A[EDGE_INSN: B:26:0x016a->B:27:0x016a BREAK  A[LOOP:0: B:17:0x00da->B:25:0x01c5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016c A[Catch: all -> 0x01ae, TRY_LEAVE, TryCatch #6 {all -> 0x01ae, blocks: (B:64:0x00e7, B:66:0x00fa, B:68:0x0106, B:70:0x0110, B:20:0x015b, B:23:0x0165, B:28:0x016c, B:34:0x0184, B:36:0x018d, B:73:0x0129, B:82:0x0140), top: B:63:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v3, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01a5 -> B:10:0x01a6). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G.U0.l(java.lang.Object):java.lang.Object");
    }
}
