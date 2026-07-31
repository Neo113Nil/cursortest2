package H1;

import L1.z;

/* loaded from: classes.dex */
public final class t implements Y1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y1.c f1904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.gates.olympus.miruv.data.b f1905f;

    public /* synthetic */ t(Y1.c cVar, com.gates.olympus.miruv.data.b bVar, int i3) {
        this.f1903d = i3;
        this.f1904e = cVar;
        this.f1905f = bVar;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f1903d) {
            case 0:
                this.f1904e.j(this.f1905f.getId());
                break;
            default:
                this.f1904e.j(this.f1905f.getId());
                break;
        }
        return z.f2729a;
    }
}
