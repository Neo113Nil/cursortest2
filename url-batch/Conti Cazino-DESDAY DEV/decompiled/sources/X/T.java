package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040i f873c;

    public /* synthetic */ T(C0040i c0040i, U u2, int i) {
        this.f871a = i;
        this.f873c = c0040i;
        this.f872b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f871a) {
            case 0:
                ArrayList arrayList = this.f873c.f920b;
                U u2 = this.f872b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f876c.f955E, u2.f874a);
                    break;
                }
                break;
            default:
                C0040i c0040i = this.f873c;
                ArrayList arrayList2 = c0040i.f920b;
                U u3 = this.f872b;
                arrayList2.remove(u3);
                c0040i.f921c.remove(u3);
                break;
        }
    }
}
