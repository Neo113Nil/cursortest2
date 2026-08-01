package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f1010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040i f1011c;

    public /* synthetic */ T(C0040i c0040i, U u2, int i) {
        this.f1009a = i;
        this.f1011c = c0040i;
        this.f1010b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1009a) {
            case 0:
                ArrayList arrayList = this.f1011c.f1058b;
                U u2 = this.f1010b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f1014c.f1093E, u2.f1012a);
                    break;
                }
                break;
            default:
                C0040i c0040i = this.f1011c;
                ArrayList arrayList2 = c0040i.f1058b;
                U u3 = this.f1010b;
                arrayList2.remove(u3);
                c0040i.f1059c.remove(u3);
                break;
        }
    }
}
