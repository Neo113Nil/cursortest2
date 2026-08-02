package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class czj implements cox {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ czj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.cox
    public final void a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            cyz cyzVar = (cyz) obj;
            ?? r3 = this.a;
            try {
                czb czbVar = (czb) cyzVar.v();
                czl czlVar = new czl((bst) obj2);
                Context context = cyzVar.b;
                cmn B = dih.B();
                Parcel a = czbVar.a();
                bmt.d(a, czlVar);
                bmt.c(a, r3);
                bmt.c(a, B);
                czbVar.c(262101, a);
                return;
            } catch (RemoteException e) {
                ((bst) obj2).d(e);
                return;
            }
        }
        if (i == 1) {
            cyz cyzVar2 = (cyz) obj;
            czb czbVar2 = (czb) cyzVar2.v();
            czf czfVar = new czf((cme) this.a);
            Context context2 = cyzVar2.b;
            cmn A = dih.A();
            Parcel a2 = czbVar2.a();
            bmt.d(a2, czfVar);
            bmt.c(a2, A);
            czbVar2.c(224703, a2);
            return;
        }
        if (i == 2) {
            int i2 = dbw.k;
            dbz dbzVar = new dbz((bst) obj2, 0);
            dca dcaVar = (dca) ((dcb) obj).v();
            Parcel a3 = dcaVar.a();
            bmt.d(a3, dbzVar);
            a3.writeTypedArray((Parcelable[]) this.a, 0);
            dcaVar.c(19, a3);
            return;
        }
        if (i == 3) {
            int i3 = dbw.k;
            ((dca) ((dcb) obj).v()).e(new dbz((bst) obj2, 0), (String) this.a);
        } else {
            if (i != 4) {
                Object obj3 = this.a;
                ((dej) obj).I(((dea) ((cms) obj3).d).b, null, new ddv((ddw) obj3, (bst) obj2));
                return;
            }
            int i4 = dbw.k;
            dbz dbzVar2 = new dbz((bst) obj2, 0);
            dca dcaVar2 = (dca) ((dcb) obj).v();
            byte[] f = ((jja) this.a).f();
            Parcel a4 = dcaVar2.a();
            bmt.d(a4, dbzVar2);
            a4.writeByteArray(f);
            dcaVar2.c(31, a4);
        }
    }
}
