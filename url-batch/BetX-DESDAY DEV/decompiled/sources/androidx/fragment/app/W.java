package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f1292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0052i f1293c;

    public /* synthetic */ W(C0052i c0052i, X x2, int i) {
        this.f1291a = i;
        this.f1293c = c0052i;
        this.f1292b = x2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1291a) {
            case 0:
                ArrayList arrayList = this.f1293c.f1346b;
                X x2 = this.f1292b;
                if (arrayList.contains(x2)) {
                    X0.e.a(x2.f1296c.f1382E, x2.f1294a);
                    break;
                }
                break;
            default:
                C0052i c0052i = this.f1293c;
                ArrayList arrayList2 = c0052i.f1346b;
                X x3 = this.f1292b;
                arrayList2.remove(x3);
                c0052i.f1347c.remove(x3);
                break;
        }
    }
}
