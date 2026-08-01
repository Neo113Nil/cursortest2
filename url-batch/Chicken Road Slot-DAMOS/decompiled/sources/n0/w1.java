package n0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w1 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6832d = 1;

    /* renamed from: e, reason: collision with root package name */
    public Object f6833e;

    /* renamed from: i, reason: collision with root package name */
    public int f6834i;

    /* renamed from: r, reason: collision with root package name */
    public Object f6835r;

    /* renamed from: s, reason: collision with root package name */
    public Object f6836s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f6837t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6838u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(o4.i iVar, z0 z0Var, f1 f1Var, z0 z0Var2, ld.a aVar) {
        super(2, aVar);
        this.f6835r = iVar;
        this.f6836s = z0Var;
        this.f6837t = f1Var;
        this.f6838u = z0Var2;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f6832d) {
            case 0:
                w1 w1Var = new w1((z1) this.f6836s, (y1) this.f6837t, (s0) this.f6838u, aVar);
                w1Var.f6833e = obj;
                return w1Var;
            case 1:
                w1 w1Var2 = new w1((a2.a0) this.f6838u, aVar);
                w1Var2.f6837t = obj;
                return w1Var2;
            case 2:
                w1 w1Var3 = new w1((o4.i) this.f6835r, (z0) this.f6836s, (f1) this.f6837t, (z0) this.f6838u, aVar);
                w1Var3.f6833e = obj;
                return w1Var3;
            default:
                return new w1((v.h0) this.f6837t, this.f6833e, (v.z0) this.f6838u, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6832d) {
            case 0:
                return ((w1) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 1:
                ((w1) create((je.f) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
                return md.a.f6622d;
            case 2:
                return ((w1) create((je.e) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((w1) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02db A[Catch: all -> 0x026f, TRY_LEAVE, TryCatch #9 {all -> 0x026f, blocks: (B:125:0x0288, B:126:0x02d1, B:128:0x02c0, B:133:0x02db, B:138:0x026b), top: B:117:0x0255 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v21, types: [c1.b] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, l.d] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [ie.g] */
    /* JADX WARN: Type inference failed for: r6v20, types: [ie.c, ie.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [ie.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [ie.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24, types: [ie.g] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.d] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, l.d] */
    /* JADX WARN: Type inference failed for: r7v9, types: [l.d] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x02d9 -> B:122:0x02c0). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(z1 z1Var, y1 y1Var, s0 s0Var, ld.a aVar) {
        super(2, aVar);
        this.f6836s = z1Var;
        this.f6837t = y1Var;
        this.f6838u = s0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(a2.a0 a0Var, ld.a aVar) {
        super(2, aVar);
        this.f6838u = a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(v.h0 h0Var, Object obj, v.z0 z0Var, ld.a aVar) {
        super(2, aVar);
        this.f6837t = h0Var;
        this.f6833e = obj;
        this.f6838u = z0Var;
    }
}
