package G1;

import android.database.Cursor;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import n.t0;
import w1.C1174A;

/* loaded from: classes.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1174A f2113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2114c;

    public /* synthetic */ l(m mVar, C1174A c1174a, int i3) {
        this.f2112a = i3;
        this.f2114c = mVar;
        this.f2113b = c1174a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor k3;
        switch (this.f2112a) {
            case 0:
                k3 = ((AppDatabase_Impl) this.f2114c.f2116b).k(this.f2113b, null);
                try {
                    int k4 = t0.k(k3, "id");
                    int k5 = t0.k(k3, "clientId");
                    int k6 = t0.k(k3, "clientName");
                    int k7 = t0.k(k3, "service");
                    int k8 = t0.k(k3, "price");
                    int k9 = t0.k(k3, "note");
                    int k10 = t0.k(k3, "timestamp");
                    ArrayList arrayList = new ArrayList(k3.getCount());
                    while (k3.moveToNext()) {
                        arrayList.add(new n(k3.getLong(k4), k3.isNull(k5) ? null : Long.valueOf(k3.getLong(k5)), k3.getString(k6), k3.getString(k7), k3.getDouble(k8), k3.getString(k9), k3.getLong(k10)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                k3 = ((AppDatabase_Impl) this.f2114c.f2116b).k(this.f2113b, null);
                try {
                    int k11 = t0.k(k3, "id");
                    int k12 = t0.k(k3, "clientId");
                    int k13 = t0.k(k3, "clientName");
                    int k14 = t0.k(k3, "service");
                    int k15 = t0.k(k3, "price");
                    int k16 = t0.k(k3, "note");
                    int k17 = t0.k(k3, "timestamp");
                    ArrayList arrayList2 = new ArrayList(k3.getCount());
                    while (k3.moveToNext()) {
                        arrayList2.add(new n(k3.getLong(k11), k3.isNull(k12) ? null : Long.valueOf(k3.getLong(k12)), k3.getString(k13), k3.getString(k14), k3.getDouble(k15), k3.getString(k16), k3.getLong(k17)));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }

    public final void finalize() {
        switch (this.f2112a) {
            case 0:
                this.f2113b.e();
                break;
            default:
                this.f2113b.e();
                break;
        }
    }
}
