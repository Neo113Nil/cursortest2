package Z;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0042i f1080c;

    public /* synthetic */ T(C0042i c0042i, U u2, int i) {
        this.f1078a = i;
        this.f1080c = c0042i;
        this.f1079b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1078a) {
            case 0:
                ArrayList arrayList = this.f1080c.f1130b;
                U u2 = this.f1079b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f1083c.f1166E, u2.f1081a);
                    break;
                }
                break;
            default:
                C0042i c0042i = this.f1080c;
                ArrayList arrayList2 = c0042i.f1130b;
                U u3 = this.f1079b;
                arrayList2.remove(u3);
                c0042i.f1131c.remove(u3);
                break;
        }
    }
}
