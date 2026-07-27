package M2;

import java.util.ArrayList;

/* renamed from: M2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.t f1870c;

    public /* synthetic */ C0103g(ArrayList arrayList, B0.t tVar, int i2) {
        this.f1868a = i2;
        this.f1869b = arrayList;
        this.f1870c = tVar;
    }

    public final void a(Object obj) {
        switch (this.f1868a) {
            case 0:
                ArrayList arrayList = this.f1869b;
                arrayList.add(0, (o) obj);
                this.f1870c.b(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f1869b;
                arrayList2.add(0, (y) obj);
                this.f1870c.b(arrayList2);
                break;
        }
    }
}
