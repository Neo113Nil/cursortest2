package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f5856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5857g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(l0 l0Var, long j7, int i) {
        super(1);
        this.f5855e = i;
        this.f5856f = l0Var;
        this.f5857g = j7;
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [p6.c, q6.j] */
    /* JADX WARN: Type inference failed for: r11v24, types: [p6.c, q6.j] */
    /* JADX WARN: Type inference failed for: r11v6, types: [p6.c, q6.j] */
    @Override // p6.c
    public final Object i(Object obj) {
        long j7;
        int ordinal;
        switch (this.f5855e) {
            case 0:
                int ordinal2 = ((c0) obj).ordinal();
                l0 l0Var = this.f5856f;
                long j8 = this.f5857g;
                if (ordinal2 == 0) {
                    a0 a0Var = l0Var.f5864u.f5874a.f5921b;
                    if (a0Var != null) {
                        j8 = ((r2.k) a0Var.f5798b.i(new r2.k(j8))).f6528a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new a5.c();
                    }
                    a0 a0Var2 = l0Var.f5865v.f5880a.f5921b;
                    if (a0Var2 != null) {
                        j8 = ((r2.k) a0Var2.f5798b.i(new r2.k(j8))).f6528a;
                    }
                }
                return new r2.k(j8);
            default:
                c0 c0Var = (c0) obj;
                l0 l0Var2 = this.f5856f;
                if (l0Var2.f5869z != null && l0Var2.r0() != null && !q6.i.a(l0Var2.f5869z, l0Var2.r0()) && (ordinal = c0Var.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        throw new a5.c();
                    }
                    a0 a0Var3 = l0Var2.f5865v.f5880a.f5921b;
                    if (a0Var3 != null) {
                        ?? r11 = a0Var3.f5798b;
                        long j9 = this.f5857g;
                        long j10 = ((r2.k) r11.i(new r2.k(j9))).f6528a;
                        y0.e r02 = l0Var2.r0();
                        q6.i.b(r02);
                        r2.l lVar = r2.l.f6529d;
                        long a8 = r02.a(j9, j10, lVar);
                        y0.e eVar = l0Var2.f5869z;
                        q6.i.b(eVar);
                        j7 = r2.i.b(a8, eVar.a(j9, j10, lVar));
                        return new r2.i(j7);
                    }
                }
                j7 = 0;
                return new r2.i(j7);
        }
    }
}
