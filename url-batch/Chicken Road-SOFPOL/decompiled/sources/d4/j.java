package d4;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2263d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f2264e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2265f;

    public j(b1.b bVar, int i) {
        this.f2265f = bVar;
        this.f2264e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2263d) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f2265f;
                int size = arrayList.size();
                int i = 0;
                if (this.f2264e == 1) {
                    while (i < size) {
                        ((i) arrayList.get(i)).b();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((i) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                }
            default:
                h3.b bVar = (h3.b) ((b1.b) this.f2265f).f1050e;
                if (bVar != null) {
                    bVar.d(this.f2264e);
                    break;
                }
                break;
        }
    }

    public j(List list, int i, Throwable th) {
        h0.a.o(list, "initCallbacks cannot be null");
        this.f2265f = new ArrayList(list);
        this.f2264e = i;
    }
}
