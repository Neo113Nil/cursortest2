package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0041i f876c;

    public /* synthetic */ T(C0041i c0041i, U u2, int i) {
        this.f874a = i;
        this.f876c = c0041i;
        this.f875b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f874a) {
            case 0:
                ArrayList arrayList = this.f876c.f923b;
                U u2 = this.f875b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f879c.f958E, u2.f877a);
                    break;
                }
                break;
            default:
                C0041i c0041i = this.f876c;
                ArrayList arrayList2 = c0041i.f923b;
                U u3 = this.f875b;
                arrayList2.remove(u3);
                c0041i.f924c.remove(u3);
                break;
        }
    }
}
