package x4;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements o, n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8367e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P0.e f8368i;

    public /* synthetic */ i(ArrayList arrayList, P0.e eVar, int i2) {
        this.f8366d = i2;
        this.f8367e = arrayList;
        this.f8368i = eVar;
    }

    @Override // x4.o
    public final void a(Exception exc) {
        switch (this.f8366d) {
            case 0:
                this.f8368i.g(d4.c.N(exc));
                break;
            default:
                this.f8368i.g(d4.c.N(exc));
                break;
        }
    }

    @Override // x4.o
    public void c() {
        ArrayList arrayList = this.f8367e;
        arrayList.add(0, null);
        this.f8368i.g(arrayList);
    }

    @Override // x4.n
    public void success(Object obj) {
        ArrayList arrayList = this.f8367e;
        arrayList.add(0, (C1010e) obj);
        this.f8368i.g(arrayList);
    }
}
