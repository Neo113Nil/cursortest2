package Y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0043i f1032c;

    public /* synthetic */ T(C0043i c0043i, U u2, int i) {
        this.f1030a = i;
        this.f1032c = c0043i;
        this.f1031b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1030a) {
            case 0:
                ArrayList arrayList = this.f1032c.f1079b;
                U u2 = this.f1031b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f1035c.f1114E, u2.f1033a);
                    break;
                }
                break;
            default:
                C0043i c0043i = this.f1032c;
                ArrayList arrayList2 = c0043i.f1079b;
                U u3 = this.f1031b;
                arrayList2.remove(u3);
                c0043i.f1080c.remove(u3);
                break;
        }
    }
}
