package Z;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0039i f1094c;

    public /* synthetic */ T(C0039i c0039i, U u2, int i) {
        this.f1092a = i;
        this.f1094c = c0039i;
        this.f1093b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1092a) {
            case 0:
                ArrayList arrayList = this.f1094c.f1141b;
                U u2 = this.f1093b;
                if (arrayList.contains(u2)) {
                    X0.a.a(u2.f1097c.f1176E, u2.f1095a);
                    break;
                }
                break;
            default:
                C0039i c0039i = this.f1094c;
                ArrayList arrayList2 = c0039i.f1141b;
                U u3 = this.f1093b;
                arrayList2.remove(u3);
                c0039i.f1142c.remove(u3);
                break;
        }
    }
}
