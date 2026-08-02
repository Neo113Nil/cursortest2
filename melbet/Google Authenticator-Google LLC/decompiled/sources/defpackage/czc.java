package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class czc implements cox {
    private final /* synthetic */ int a;

    public /* synthetic */ czc(int i) {
        this.a = i;
    }

    @Override // defpackage.cox
    public final void a(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            cyz cyzVar = (cyz) obj;
            czb czbVar = (czb) cyzVar.v();
            czg czgVar = new czg((bst) obj2);
            Context context = cyzVar.b;
            cmn A = dih.A();
            Parcel a = czbVar.a();
            bmt.d(a, czgVar);
            bmt.c(a, A);
            czbVar.c(224704, a);
            return;
        }
        if (i == 1) {
            cwp cwpVar = (cwp) obj;
            cwd cwdVar = cwe.a;
            cwc cwcVar = new cwc((bst) obj2);
            cwl cwlVar = (cwl) cwpVar.v();
            Context context2 = cwpVar.b;
            cmn A2 = dih.A();
            Parcel a2 = cwlVar.a();
            bmt.d(a2, cwcVar);
            bmt.c(a2, A2);
            cwlVar.c(3, a2);
            return;
        }
        if (i == 2) {
            cyz cyzVar2 = (cyz) obj;
            try {
                czb czbVar2 = (czb) cyzVar2.v();
                cze czeVar = new cze((bst) obj2);
                Context context3 = cyzVar2.b;
                cmn A3 = dih.A();
                Parcel a3 = czbVar2.a();
                bmt.d(a3, czeVar);
                bmt.c(a3, A3);
                czbVar2.c(224702, a3);
                return;
            } catch (RemoteException e) {
                ((bst) obj2).d(e);
                return;
            }
        }
        if (i == 3) {
            int i2 = dbw.k;
            dca dcaVar = (dca) ((dcb) obj).v();
            cwo cwoVar = new cwo((bst) obj2, 5, (char[]) null);
            Parcel a4 = dcaVar.a();
            bmt.d(a4, cwoVar);
            dcaVar.c(27, a4);
            return;
        }
        if (i == 4) {
            int i3 = dbw.k;
            return;
        }
        if (i != 5) {
            ddt ddtVar = new ddt((bst) obj2);
            def defVar = (def) ((dej) obj).v();
            Parcel a5 = defVar.a();
            bmt.d(a5, ddtVar);
            defVar.c(2, a5);
            return;
        }
        dcl dclVar = (dcl) obj;
        dck dckVar = (dck) dclVar.v();
        dcg dcgVar = new dcg((bst) obj2);
        Context context4 = dclVar.b;
        cmn A4 = dih.A();
        Parcel a6 = dckVar.a();
        bmt.d(a6, dcgVar);
        bmt.c(a6, A4);
        dckVar.d(1, a6);
    }
}
