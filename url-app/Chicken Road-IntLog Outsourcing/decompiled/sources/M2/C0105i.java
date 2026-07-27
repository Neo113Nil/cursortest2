package M2;

import java.util.ArrayList;

/* renamed from: M2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.t f1876c;

    public /* synthetic */ C0105i(ArrayList arrayList, B0.t tVar, int i2) {
        this.f1874a = i2;
        this.f1875b = arrayList;
        this.f1876c = tVar;
    }

    public final void a(Object obj) {
        switch (this.f1874a) {
            case 0:
                ArrayList arrayList = this.f1875b;
                arrayList.add(0, (r) obj);
                this.f1876c.b(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f1875b;
                arrayList2.add(0, (r) obj);
                this.f1876c.b(arrayList2);
                break;
        }
    }
}
