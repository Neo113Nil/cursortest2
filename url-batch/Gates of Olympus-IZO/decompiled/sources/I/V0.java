package I;

import j.C0475A;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class V0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public C0475A f2212e;

    /* renamed from: f, reason: collision with root package name */
    public Y1.c f2213f;

    /* renamed from: g, reason: collision with root package name */
    public m2.i f2214g;

    /* renamed from: h, reason: collision with root package name */
    public D1.h f2215h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2216i;

    /* renamed from: j, reason: collision with root package name */
    public int f2217j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2218k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z1.j f2219l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V0(Y1.a aVar, P1.d dVar) {
        super(2, dVar);
        this.f2219l = (Z1.j) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y1.a, Z1.j] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        V0 v0 = new V0(this.f2219l, dVar);
        v0.f2218k = obj;
        return v0;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((V0) create((InterfaceC0701g) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
        return Q1.a.f3113d;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd A[Catch: all -> 0x002b, TryCatch #4 {all -> 0x002b, blocks: (B:8:0x0021, B:11:0x00c3, B:15:0x00d8, B:17:0x00dd, B:20:0x00e8, B:22:0x00fc, B:24:0x0108, B:26:0x0112, B:31:0x0141, B:34:0x014b, B:39:0x0152, B:45:0x016a, B:47:0x0175, B:61:0x01a2, B:62:0x01a5, B:66:0x0120, B:73:0x012c, B:83:0x0044, B:86:0x0059, B:93:0x0095, B:99:0x00aa, B:109:0x01bf, B:110:0x01c2, B:41:0x015f, B:44:0x0167, B:57:0x019d, B:58:0x01a0, B:43:0x0163, B:95:0x009f, B:98:0x00a7, B:106:0x01ba, B:107:0x01bd), top: B:2:0x000b, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ad A[LOOP:0: B:16:0x00db->B:36:0x01ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0150 A[EDGE_INSN: B:37:0x0150->B:38:0x0150 BREAK  A[LOOP:0: B:16:0x00db->B:36:0x01ad], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #4 {all -> 0x002b, blocks: (B:8:0x0021, B:11:0x00c3, B:15:0x00d8, B:17:0x00dd, B:20:0x00e8, B:22:0x00fc, B:24:0x0108, B:26:0x0112, B:31:0x0141, B:34:0x014b, B:39:0x0152, B:45:0x016a, B:47:0x0175, B:61:0x01a2, B:62:0x01a5, B:66:0x0120, B:73:0x012c, B:83:0x0044, B:86:0x0059, B:93:0x0095, B:99:0x00aa, B:109:0x01bf, B:110:0x01c2, B:41:0x015f, B:44:0x0167, B:57:0x019d, B:58:0x01a0, B:43:0x0163, B:95:0x009f, B:98:0x00a7, B:106:0x01ba, B:107:0x01bd), top: B:2:0x000b, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b  */
    /* JADX WARN: Type inference failed for: r0v13, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v2, types: [Y1.a, Z1.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x018a -> B:10:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ab -> B:10:0x018d). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.V0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
