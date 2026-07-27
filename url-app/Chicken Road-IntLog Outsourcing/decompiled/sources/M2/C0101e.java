package M2;

import java.util.ArrayList;

/* renamed from: M2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.t f1864c;

    public /* synthetic */ C0101e(ArrayList arrayList, B0.t tVar, int i2) {
        this.f1862a = i2;
        this.f1863b = arrayList;
        this.f1864c = tVar;
    }

    public final void a(Object obj) {
        switch (this.f1862a) {
            case 0:
                ArrayList arrayList = this.f1863b;
                arrayList.add(0, (C0108l) obj);
                this.f1864c.b(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f1863b;
                arrayList2.add(0, (E) obj);
                this.f1864c.b(arrayList2);
                break;
        }
    }
}
