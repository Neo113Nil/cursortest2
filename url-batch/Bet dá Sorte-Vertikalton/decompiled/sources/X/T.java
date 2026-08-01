package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0039i f959c;

    public /* synthetic */ T(C0039i c0039i, U u2, int i) {
        this.f957a = i;
        this.f959c = c0039i;
        this.f958b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f957a) {
            case 0:
                ArrayList arrayList = this.f959c.f1006b;
                U u2 = this.f958b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f962c.f1041E, u2.f960a);
                    break;
                }
                break;
            default:
                C0039i c0039i = this.f959c;
                ArrayList arrayList2 = c0039i.f1006b;
                U u3 = this.f958b;
                arrayList2.remove(u3);
                c0039i.f1007c.remove(u3);
                break;
        }
    }
}
