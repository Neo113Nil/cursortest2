package x4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements o, n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8364e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P0.e f8365i;

    public /* synthetic */ h(ArrayList arrayList, P0.e eVar, int i2) {
        this.f8363d = i2;
        this.f8364e = arrayList;
        this.f8365i = eVar;
    }

    @Override // x4.o
    public final void a(Exception exc) {
        switch (this.f8363d) {
            case 0:
                this.f8365i.g(d4.c.N(exc));
                break;
            default:
                this.f8365i.g(d4.c.N(exc));
                break;
        }
    }

    @Override // x4.o
    public void c() {
        ArrayList arrayList = this.f8364e;
        arrayList.add(0, null);
        this.f8365i.g(arrayList);
    }

    @Override // x4.n
    public void success(Object obj) {
        ArrayList arrayList = this.f8364e;
        arrayList.add(0, (List) obj);
        this.f8365i.g(arrayList);
    }
}
