package Y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0043i f1005c;

    public /* synthetic */ T(C0043i c0043i, U u2, int i) {
        this.f1003a = i;
        this.f1005c = c0043i;
        this.f1004b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1003a) {
            case 0:
                ArrayList arrayList = this.f1005c.f1052b;
                U u2 = this.f1004b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f1008c.f1087E, u2.f1006a);
                    break;
                }
                break;
            default:
                C0043i c0043i = this.f1005c;
                ArrayList arrayList2 = c0043i.f1052b;
                U u3 = this.f1004b;
                arrayList2.remove(u3);
                c0043i.f1053c.remove(u3);
                break;
        }
    }
}
