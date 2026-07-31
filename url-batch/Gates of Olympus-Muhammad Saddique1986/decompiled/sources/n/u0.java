package n;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class u0 extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0 f7210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i3) {
        super(0);
        this.f7209e = i3;
        this.f7210f = v0Var;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f7209e) {
            case 0:
                return Float.valueOf(this.f7210f.f7211q.f7242a.g());
            default:
                return Float.valueOf(this.f7210f.f7211q.f7245d.g());
        }
    }
}
