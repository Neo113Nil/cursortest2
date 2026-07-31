package G1;

import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;

/* loaded from: classes.dex */
public final class d extends w1.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AppDatabase_Impl appDatabase_Impl, int i3) {
        super(appDatabase_Impl);
        this.f2085d = i3;
    }

    @Override // w1.j
    public final void a(A1.k kVar, Object obj) {
        switch (this.f2085d) {
            case 0:
                kVar.A(((h) obj).f2097a, 1);
                break;
            case 1:
                h hVar = (h) obj;
                kVar.A(hVar.f2097a, 1);
                kVar.m(hVar.f2098b, 2);
                kVar.m(hVar.f2099c, 3);
                kVar.m(hVar.f2100d, 4);
                kVar.A(hVar.f2101e, 5);
                kVar.A(hVar.f2097a, 6);
                break;
            default:
                kVar.A(((n) obj).f2119a, 1);
                break;
        }
    }

    @Override // w1.j
    public final String c() {
        switch (this.f2085d) {
            case 0:
                return "DELETE FROM `clients` WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `clients` SET `id` = ?,`name` = ?,`phone` = ?,`note` = ?,`createdAt` = ? WHERE `id` = ?";
            default:
                return "DELETE FROM `haircuts` WHERE `id` = ?";
        }
    }
}
