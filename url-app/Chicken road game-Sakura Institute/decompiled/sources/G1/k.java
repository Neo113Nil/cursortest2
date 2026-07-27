package G1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3127d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f3128e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3129i;

    public k(l lVar, int i2) {
        this.f3129i = lVar;
        this.f3128e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3127d) {
            case 0:
                ((l) this.f3129i).i(this.f3128e);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f3129i;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f3128e == 1) {
                    while (i2 < size) {
                        I0.g gVar = (I0.g) arrayList.get(i2);
                        gVar.f3369a.setValue(Boolean.TRUE);
                        gVar.f3370b.f11388d = new I0.k(true);
                        i2++;
                    }
                    break;
                } else {
                    while (i2 < size) {
                        ((I0.g) arrayList.get(i2)).f3370b.f11388d = I0.j.f3373a;
                        i2++;
                    }
                    break;
                }
        }
    }

    public k(List list, int i2, Throwable th) {
        M1.a.p(list, "initCallbacks cannot be null");
        this.f3129i = new ArrayList(list);
        this.f3128e = i2;
    }
}
