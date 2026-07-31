package G1;

import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;

/* loaded from: classes.dex */
public final class c extends w1.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AppDatabase_Impl appDatabase_Impl, int i3) {
        super(appDatabase_Impl);
        this.f2084d = i3;
    }

    @Override // w1.j
    public final void a(A1.k kVar, Object obj) {
        switch (this.f2084d) {
            case 0:
                h hVar = (h) obj;
                kVar.A(hVar.f2097a, 1);
                kVar.m(hVar.f2098b, 2);
                kVar.m(hVar.f2099c, 3);
                kVar.m(hVar.f2100d, 4);
                kVar.A(hVar.f2101e, 5);
                break;
            default:
                n nVar = (n) obj;
                kVar.A(nVar.f2119a, 1);
                Long l3 = nVar.f2120b;
                if (l3 == null) {
                    kVar.k(2);
                } else {
                    kVar.A(l3.longValue(), 2);
                }
                kVar.m(nVar.f2121c, 3);
                kVar.m(nVar.f2122d, 4);
                kVar.i(nVar.f2123e, 5);
                kVar.m(nVar.f2124f, 6);
                kVar.A(nVar.f2125g, 7);
                break;
        }
    }

    @Override // w1.j
    public final String c() {
        switch (this.f2084d) {
            case 0:
                return "INSERT OR REPLACE INTO `clients` (`id`,`name`,`phone`,`note`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `haircuts` (`id`,`clientId`,`clientName`,`service`,`price`,`note`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }
}
