package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040i f868c;

    public /* synthetic */ T(C0040i c0040i, U u2, int i) {
        this.f866a = i;
        this.f868c = c0040i;
        this.f867b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f866a) {
            case 0:
                ArrayList arrayList = this.f868c.f915b;
                U u2 = this.f867b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f871c.f950E, u2.f869a);
                    break;
                }
                break;
            default:
                C0040i c0040i = this.f868c;
                ArrayList arrayList2 = c0040i.f915b;
                U u3 = this.f867b;
                arrayList2.remove(u3);
                c0040i.f916c.remove(u3);
                break;
        }
    }
}
