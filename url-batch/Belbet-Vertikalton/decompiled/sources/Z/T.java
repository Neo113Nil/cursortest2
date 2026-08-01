package Z;

import G1.AbstractC0001b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0045i f1511c;

    public /* synthetic */ T(C0045i c0045i, U u2, int i) {
        this.f1509a = i;
        this.f1511c = c0045i;
        this.f1510b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1509a) {
            case 0:
                ArrayList arrayList = this.f1511c.f1560b;
                U u2 = this.f1510b;
                if (arrayList.contains(u2)) {
                    AbstractC0001b.a(u2.f1514c.f1595E, u2.f1512a);
                    break;
                }
                break;
            default:
                C0045i c0045i = this.f1511c;
                ArrayList arrayList2 = c0045i.f1560b;
                U u3 = this.f1510b;
                arrayList2.remove(u3);
                c0045i.f1561c.remove(u3);
                break;
        }
    }
}
