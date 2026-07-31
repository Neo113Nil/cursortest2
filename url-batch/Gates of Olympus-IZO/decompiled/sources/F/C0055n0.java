package F;

import b0.C0261L;

/* renamed from: F.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055n0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.a f1312g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0055n0(boolean z3, Y1.a aVar, int i3) {
        super(1);
        this.f1310e = i3;
        this.f1311f = z3;
        this.f1312g = aVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f1310e) {
            case 0:
                ((C0261L) obj).b(this.f1311f ? 1.0f : ((Number) this.f1312g.b()).floatValue());
                break;
            default:
                C0261L c0261l = (C0261L) obj;
                boolean z3 = !this.f1311f && ((Boolean) this.f1312g.b()).booleanValue();
                if (c0261l.f4233s != z3) {
                    c0261l.f4219d |= 16384;
                    c0261l.f4233s = z3;
                }
                break;
        }
        return L1.z.f2729a;
    }
}
