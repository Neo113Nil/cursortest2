package defpackage;

import android.os.Parcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdb extends kde {
    public kdb(kcq kcqVar, jwt jwtVar, int i) {
        super(kcqVar, jwtVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kmb, kmp] */
    @Override // defpackage.kde
    protected final void a(kbq kbqVar) {
        this.f.a(kbqVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kmb, kmp] */
    @Override // defpackage.kde
    protected final void b() {
        this.f.b();
    }

    @Override // defpackage.kde
    public final void c(int i, Parcel parcel) {
        kmm kmmVar;
        kcs kcsVar = this.a;
        kcq kcqVar = (kcq) kcsVar;
        List list = kcqVar.a;
        jwt jwtVar = this.b;
        String readString = parcel.readString();
        kaa a = kdk.a(parcel, jwtVar);
        kmm kmmVar2 = kmm.a;
        if (list.isEmpty()) {
            kmmVar = kmm.a;
        } else {
            int size = list.size();
            ixj[] ixjVarArr = new ixj[size];
            for (int i2 = 0; i2 < size; i2++) {
                ixjVarArr[i2] = ((kbk) list.get(i2)).a();
            }
            kmmVar = new kmm(ixjVarArr);
        }
        kdp kdpVar = new kdp(kcsVar, this.c, kmmVar);
        kbq a2 = kcqVar.a((i & 16) != 0 ? new kdx(this, kdpVar, jwtVar) : new kdl(this, kdpVar, jwtVar), readString, a);
        if (!a2.g()) {
            super.f(a2, a2, false);
            return;
        }
        this.f.getClass();
        if (kcsVar.l()) {
            this.f.e();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kmb, kmp] */
    final void d() {
        if (l()) {
            return;
        }
        k(kdc.f);
        this.e.c();
        this.f.a(kbq.b);
    }
}
