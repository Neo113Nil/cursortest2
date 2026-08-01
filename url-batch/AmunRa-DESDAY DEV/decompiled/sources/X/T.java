package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040i f916c;

    public /* synthetic */ T(C0040i c0040i, U u2, int i) {
        this.f914a = i;
        this.f916c = c0040i;
        this.f915b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f914a) {
            case 0:
                ArrayList arrayList = this.f916c.f963b;
                U u2 = this.f915b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f919c.f995E, u2.f917a);
                    break;
                }
                break;
            default:
                C0040i c0040i = this.f916c;
                ArrayList arrayList2 = c0040i.f963b;
                U u3 = this.f915b;
                arrayList2.remove(u3);
                c0040i.f964c.remove(u3);
                break;
        }
    }
}
