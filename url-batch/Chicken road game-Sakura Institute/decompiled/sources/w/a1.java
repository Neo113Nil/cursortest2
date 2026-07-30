package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public q5.g f9187a;

    /* renamed from: b, reason: collision with root package name */
    public q5.g f9188b;

    /* renamed from: c, reason: collision with root package name */
    public int f9189c;

    /* renamed from: d, reason: collision with root package name */
    public Long f9190d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9191e;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[LOOP:0: B:23:0x0060->B:28:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[EDGE_INSN: B:29:0x0075->B:30:0x0075 BREAK  A[LOOP:0: B:23:0x0060->B:28:0x0070], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(g2.w wVar) {
        q5.g gVar;
        a2.g gVar2 = wVar.f4065a;
        this.f9191e = false;
        q5.g gVar3 = this.f9187a;
        if (wVar.equals(gVar3 != null ? (g2.w) gVar3.f7528h : null)) {
            return;
        }
        String str = gVar2.f373f;
        q5.g gVar4 = this.f9187a;
        if (r6.k.a(str, gVar4 != null ? ((g2.w) gVar4.f7528h).f4065a.f373f : null)) {
            q5.g gVar5 = this.f9187a;
            if (gVar5 == null) {
                return;
            }
            gVar5.f7528h = wVar;
            return;
        }
        this.f9187a = new q5.g(this.f9187a, 14, wVar);
        this.f9188b = null;
        int length = gVar2.f373f.length() + this.f9189c;
        this.f9189c = length;
        if (length > 100000) {
            q5.g gVar6 = this.f9187a;
            if ((gVar6 != null ? (q5.g) gVar6.f7527g : null) == null) {
                return;
            }
            while (true) {
                if (gVar6 != null) {
                    q5.g gVar7 = (q5.g) gVar6.f7527g;
                    if (gVar7 != null) {
                        gVar = (q5.g) gVar7.f7527g;
                        if (gVar != null) {
                            break;
                        } else {
                            gVar6 = (q5.g) gVar6.f7527g;
                        }
                    }
                }
                gVar = null;
                if (gVar != null) {
                }
            }
            if (gVar6 == null) {
                return;
            }
            gVar6.f7527g = null;
        }
    }
}
