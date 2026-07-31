package t1;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class l extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1013A f8900f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(C1013A c1013a, int i3) {
        super(1);
        this.f8899e = i3;
        this.f8900f = c1013a;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f8899e) {
            case 0:
                f2.j.f((u) obj, "destination");
                return Boolean.valueOf(!this.f8900f.f8818m.containsKey(Integer.valueOf(r2.f8936i)));
            default:
                f2.j.f((u) obj, "destination");
                return Boolean.valueOf(!this.f8900f.f8818m.containsKey(Integer.valueOf(r2.f8936i)));
        }
    }
}
