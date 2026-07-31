package b;

import e2.InterfaceC0422a;

/* renamed from: b.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329y extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0301E f5343f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0329y(C0301E c0301e, int i3) {
        super(0);
        this.f5342e = i3;
        this.f5343f = c0301e;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f5342e) {
            case 0:
                this.f5343f.c();
                break;
            case 1:
                this.f5343f.b();
                break;
            default:
                this.f5343f.c();
                break;
        }
        return R1.y.f4171a;
    }
}
