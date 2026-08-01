package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f1291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0052i f1292c;

    public /* synthetic */ W(C0052i c0052i, X x2, int i) {
        this.f1290a = i;
        this.f1292c = c0052i;
        this.f1291b = x2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1290a) {
            case 0:
                ArrayList arrayList = this.f1292c.f1345b;
                X x2 = this.f1291b;
                if (arrayList.contains(x2)) {
                    X0.e.a(x2.f1295c.f1381E, x2.f1293a);
                    break;
                }
                break;
            default:
                C0052i c0052i = this.f1292c;
                ArrayList arrayList2 = c0052i.f1345b;
                X x3 = this.f1291b;
                arrayList2.remove(x3);
                c0052i.f1346c.remove(x3);
                break;
        }
    }
}
