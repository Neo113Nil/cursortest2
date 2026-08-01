package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040i f985c;

    public /* synthetic */ T(C0040i c0040i, U u2, int i) {
        this.f983a = i;
        this.f985c = c0040i;
        this.f984b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f983a) {
            case 0:
                ArrayList arrayList = this.f985c.f1032b;
                U u2 = this.f984b;
                if (arrayList.contains(u2)) {
                    T0.c.a(u2.f988c.f1067E, u2.f986a);
                    break;
                }
                break;
            default:
                C0040i c0040i = this.f985c;
                ArrayList arrayList2 = c0040i.f1032b;
                U u3 = this.f984b;
                arrayList2.remove(u3);
                c0040i.f1033c.remove(u3);
                break;
        }
    }
}
