package t1;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class t extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f8929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(r rVar, int i3) {
        super(1);
        this.f8928e = i3;
        this.f8929f = rVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f8928e) {
            case 0:
                f2.j.f((String) obj, "key");
                return Boolean.valueOf(!this.f8929f.c().contains(r2));
            default:
                f2.j.f((String) obj, "key");
                return Boolean.valueOf(!this.f8929f.c().contains(r2));
        }
    }
}
