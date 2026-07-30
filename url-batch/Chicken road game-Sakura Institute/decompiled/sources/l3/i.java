package l3;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5903f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f5904g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5905h;

    public i(l4.j jVar, int i7) {
        this.f5905h = jVar;
        this.f5904g = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5903f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = (ArrayList) this.f5905h;
                int size = arrayList.size();
                int i7 = 0;
                if (this.f5904g == 1) {
                    while (i7 < size) {
                        i2.g gVar = (i2.g) arrayList.get(i7);
                        gVar.f4880a.setValue(Boolean.TRUE);
                        gVar.f4881b.f1394g = new i2.k(true);
                        i7++;
                    }
                    break;
                } else {
                    while (i7 < size) {
                        ((i2.g) arrayList.get(i7)).f4881b.f1394g = i2.j.f4884a;
                        i7++;
                    }
                    break;
                }
            default:
                ((l4.j) this.f5905h).i(this.f5904g);
                break;
        }
    }

    public i(List list, int i7, Throwable th) {
        a.a.m(list, "initCallbacks cannot be null");
        this.f5905h = new ArrayList(list);
        this.f5904g = i7;
    }
}
