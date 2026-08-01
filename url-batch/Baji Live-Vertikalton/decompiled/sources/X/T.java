package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040i f867c;

    public /* synthetic */ T(C0040i c0040i, U u2, int i) {
        this.f865a = i;
        this.f867c = c0040i;
        this.f866b = u2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f865a) {
            case 0:
                ArrayList arrayList = this.f867c.f914b;
                U u2 = this.f866b;
                if (arrayList.contains(u2)) {
                    V.a(u2.f870c.f949E, u2.f868a);
                    break;
                }
                break;
            default:
                C0040i c0040i = this.f867c;
                ArrayList arrayList2 = c0040i.f914b;
                U u3 = this.f866b;
                arrayList2.remove(u3);
                c0040i.f915c.remove(u3);
                break;
        }
    }
}
