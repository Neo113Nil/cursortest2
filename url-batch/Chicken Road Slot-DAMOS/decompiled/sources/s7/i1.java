package s7;

import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.qb;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k1 f8733e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8734i;

    public /* synthetic */ i1(k1 k1Var, String str, int i3) {
        this.f8732d = i3;
        this.f8733e = k1Var;
        this.f8734i = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8732d) {
            case 0:
                return new ca(new i1(this.f8733e, this.f8734i, 1));
            case 1:
                k1 k1Var = this.f8733e;
                m mVar = k1Var.f9150e.f8762i;
                j4.T(mVar);
                String str = this.f8734i;
                a1 w02 = mVar.w0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((q1) k1Var.f1478d).f8935r.y();
                hashMap.put("gmp_version", 161000L);
                if (w02 != null) {
                    String O = w02.O();
                    if (O != null) {
                        hashMap.put("app_version", O);
                    }
                    hashMap.put("app_version_int", Long.valueOf(w02.Q()));
                    hashMap.put("dynamite_version", Long.valueOf(w02.b()));
                }
                return hashMap;
            default:
                c6.c cVar = new c6.c(this.f8733e, this.f8734i);
                qb qbVar = new qb("internal.remoteConfig", 0);
                qbVar.f2254e.put("getValue", new ca(qbVar, cVar));
                return qbVar;
        }
    }
}
