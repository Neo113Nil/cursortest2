package G1;

import android.database.Cursor;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import n.t0;
import w1.C1174A;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1174A f2090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f2091c;

    public /* synthetic */ f(g gVar, C1174A c1174a, int i3) {
        this.f2089a = i3;
        this.f2091c = gVar;
        this.f2090b = c1174a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor k3;
        switch (this.f2089a) {
            case 0:
                k3 = ((AppDatabase_Impl) this.f2091c.f2093e).k(this.f2090b, null);
                try {
                    int k4 = t0.k(k3, "id");
                    int k5 = t0.k(k3, "name");
                    int k6 = t0.k(k3, "phone");
                    int k7 = t0.k(k3, "note");
                    int k8 = t0.k(k3, "createdAt");
                    ArrayList arrayList = new ArrayList(k3.getCount());
                    while (k3.moveToNext()) {
                        arrayList.add(new h(k3.getLong(k4), k3.getString(k5), k3.getString(k6), k3.getString(k7), k3.getLong(k8)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                k3 = ((AppDatabase_Impl) this.f2091c.f2093e).k(this.f2090b, null);
                try {
                    ArrayList arrayList2 = new ArrayList(k3.getCount());
                    while (k3.moveToNext()) {
                        arrayList2.add(new i(k3.getLong(0), k3.getString(1), k3.getString(2), k3.getString(3), k3.getLong(4), k3.getInt(5), k3.getDouble(6)));
                    }
                    return arrayList2;
                } finally {
                }
            default:
                AppDatabase_Impl appDatabase_Impl = (AppDatabase_Impl) this.f2091c.f2093e;
                C1174A c1174a = this.f2090b;
                Cursor k9 = appDatabase_Impl.k(c1174a, null);
                try {
                    return k9.moveToFirst() ? new h(k9.getLong(t0.k(k9, "id")), k9.getString(t0.k(k9, "name")), k9.getString(t0.k(k9, "phone")), k9.getString(t0.k(k9, "note")), k9.getLong(t0.k(k9, "createdAt"))) : null;
                } finally {
                    k9.close();
                    c1174a.e();
                }
        }
    }

    public void finalize() {
        switch (this.f2089a) {
            case 0:
                this.f2090b.e();
                break;
            case 1:
                this.f2090b.e();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
