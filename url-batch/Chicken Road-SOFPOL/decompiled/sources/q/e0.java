package q;

import r.g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f5823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f5824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(m0 m0Var, n0 n0Var, int i) {
        super(1);
        this.f5822e = i;
        this.f5823f = m0Var;
        this.f5824g = n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r3.f5824g.f5880a.f5920a != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r3.f5823f.f5874a.f5920a != null) goto L37;
     */
    @Override // p6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        r.v vVar;
        r.v vVar2;
        switch (this.f5822e) {
            case 0:
                g1 g1Var = (g1) obj;
                c0 c0Var = c0.f5806d;
                c0 c0Var2 = c0.f5807e;
                if (g1Var.a(c0Var, c0Var2)) {
                    o0 o0Var = this.f5823f.f5874a.f5920a;
                    return (o0Var == null || (vVar2 = o0Var.f5885a) == null) ? h0.f5843b : vVar2;
                }
                if (!g1Var.a(c0Var2, c0.f5808f)) {
                    return h0.f5843b;
                }
                o0 o0Var2 = this.f5824g.f5880a.f5920a;
                return (o0Var2 == null || (vVar = o0Var2.f5885a) == null) ? h0.f5843b : vVar;
            case 1:
                int ordinal = ((c0) obj).ordinal();
                float f6 = 0.0f;
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new a5.c();
                        }
                        break;
                    }
                    f6 = 1.0f;
                }
                return Float.valueOf(f6);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                g1 g1Var2 = (g1) obj;
                c0 c0Var3 = c0.f5806d;
                c0 c0Var4 = c0.f5807e;
                if (g1Var2.a(c0Var3, c0Var4)) {
                    return h0.f5843b;
                }
                if (!g1Var2.a(c0Var4, c0.f5808f)) {
                    return h0.f5843b;
                }
                v0 v0Var = this.f5824g.f5880a;
                return h0.f5843b;
            default:
                int ordinal2 = ((c0) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new a5.c();
                    }
                    v0 v0Var2 = this.f5824g.f5880a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
