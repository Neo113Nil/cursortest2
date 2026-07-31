package t0;

import s0.InterfaceC0886c;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894b extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0895c f7889f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0894b(C0895c c0895c, int i3) {
        super(0);
        this.f7888e = i3;
        this.f7889f = c0895c;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f7888e) {
            case 0:
                this.f7889f.x0();
                break;
            default:
                C0895c c0895c = this.f7889f;
                U.j jVar = c0895c.f7891q;
                Z1.i.d(jVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC0886c) jVar).f(c0895c);
                break;
        }
        return L1.z.f2729a;
    }
}
