package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040i f945c;

    public /* synthetic */ T(C0040i c0040i, U u2, int i) {
        this.f943a = i;
        this.f945c = c0040i;
        this.f944b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f943a) {
            case 0:
                ArrayList arrayList = this.f945c.f992b;
                U u2 = this.f944b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f948c.f1027E, u2.f946a);
                    break;
                }
                break;
            default:
                C0040i c0040i = this.f945c;
                ArrayList arrayList2 = c0040i.f992b;
                U u3 = this.f944b;
                arrayList2.remove(u3);
                c0040i.f993c.remove(u3);
                break;
        }
    }
}
