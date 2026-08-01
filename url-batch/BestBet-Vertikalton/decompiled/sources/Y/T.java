package Y;

import G1.AbstractC0001b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0042i f1364c;

    public /* synthetic */ T(C0042i c0042i, U u2, int i) {
        this.f1362a = i;
        this.f1364c = c0042i;
        this.f1363b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1362a) {
            case 0:
                ArrayList arrayList = this.f1364c.f1411b;
                U u2 = this.f1363b;
                if (arrayList.contains(u2)) {
                    AbstractC0001b.a(u2.f1367c.f1446E, u2.f1365a);
                    break;
                }
                break;
            default:
                C0042i c0042i = this.f1364c;
                ArrayList arrayList2 = c0042i.f1411b;
                U u3 = this.f1363b;
                arrayList2.remove(u3);
                c0042i.f1412c.remove(u3);
                break;
        }
    }
}
