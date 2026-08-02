package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ciu implements cox {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ciu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.cox
    public final void a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                cwo cwoVar = new cwo((bst) obj2, 1);
                cit citVar = (cit) ((cix) obj).v();
                Parcel a = citVar.a();
                bmt.d(a, cwoVar);
                a.writeString((String) this.a);
                citVar.c(14, a);
                return;
            case 1:
                che cheVar = (che) obj;
                cha chaVar = new cha((bst) obj2);
                chf chfVar = (chf) cheVar.v();
                Context context = cheVar.b;
                cmn A = dih.A();
                Parcel a2 = chfVar.a();
                bmt.c(a2, this.a);
                bmt.d(a2, chaVar);
                bmt.c(a2, A);
                chfVar.c(1, a2);
                return;
            case 2:
                cki ckiVar = (cki) obj;
                ckf ckfVar = new ckf((bst) obj2);
                ?? r5 = this.a;
                try {
                    ckl cklVar = (ckl) ckiVar.v();
                    Parcel a3 = cklVar.a();
                    bmt.d(a3, ckfVar);
                    bmt.c(a3, r5);
                    cklVar.d(8, a3);
                    return;
                } catch (RemoteException | RuntimeException e) {
                    Log.e("ClearcutLoggerApiImpl", "Failed to call logError", e);
                    throw e;
                }
            case 3:
                clb clbVar = (clb) ((cla) obj).v();
                dbz dbzVar = new dbz((bst) obj2, 1, null);
                Parcel a4 = clbVar.a();
                bmt.c(a4, this.a);
                bmt.d(a4, dbzVar);
                clbVar.d(2, a4);
                return;
            case 4:
                crn crnVar = (crn) ((crl) obj).v();
                Parcel a5 = crnVar.a();
                bmt.c(a5, this.a);
                crnVar.d(1, a5);
                ((bst) obj2).c(null);
                return;
            case 5:
                crp crpVar = (crp) ((crm) obj).v();
                Parcel a6 = crpVar.a();
                bmt.c(a6, this.a);
                crpVar.d(1, a6);
                ((bst) obj2).c(null);
                return;
            case 6:
                cro croVar = (cro) ((crw) obj).v();
                Parcel a7 = croVar.a();
                bmt.c(a7, this.a);
                croVar.d(1, a7);
                ((bst) obj2).c(null);
                return;
            case 7:
                cse cseVar = new cse((bst) obj2);
                csc cscVar = (csc) ((csh) obj).v();
                Parcel a8 = cscVar.a();
                bmt.d(a8, cseVar);
                bmt.c(a8, this.a);
                cscVar.c(1, a8);
                return;
            case 8:
                csf csfVar = new csf((bst) obj2);
                csc cscVar2 = (csc) ((csh) obj).v();
                Parcel a9 = cscVar2.a();
                bmt.d(a9, csfVar);
                bmt.c(a9, this.a);
                bmt.d(a9, null);
                cscVar2.c(2, a9);
                return;
            case 9:
                cwp cwpVar = (cwp) obj;
                cvs cvsVar = cvw.a;
                cvv cvvVar = new cvv((bst) obj2);
                cwl cwlVar = (cwl) cwpVar.v();
                Context context2 = cwpVar.b;
                String packageName = ((cms) this.a).a.getPackageName();
                cmn A2 = dih.A();
                Parcel a10 = cwlVar.a();
                bmt.d(a10, cvvVar);
                a10.writeString(packageName);
                bmt.c(a10, A2);
                cwlVar.c(12, a10);
                return;
            case 10:
                cwp cwpVar2 = (cwp) obj;
                cwd cwdVar = cwe.a;
                cwb cwbVar = new cwb((bst) obj2);
                cwl cwlVar2 = (cwl) cwpVar2.v();
                Context context3 = cwpVar2.b;
                String packageName2 = ((cms) this.a).a.getPackageName();
                cmn A3 = dih.A();
                Parcel a11 = cwlVar2.a();
                bmt.d(a11, cwbVar);
                a11.writeString(packageName2);
                bmt.c(a11, A3);
                cwlVar2.c(2, a11);
                return;
            case 11:
                cwp cwpVar3 = (cwp) obj;
                cwd cwdVar2 = cwe.a;
                cwc cwcVar = new cwc((bst) obj2);
                cwl cwlVar3 = (cwl) cwpVar3.v();
                Context context4 = cwpVar3.b;
                cmn A4 = dih.A();
                Parcel a12 = cwlVar3.a();
                bmt.d(a12, cwcVar);
                a12.writeString((String) this.a);
                bmt.c(a12, A4);
                cwlVar3.c(6, a12);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                cwp cwpVar4 = (cwp) obj;
                cwh cwhVar = cwi.a;
                cwg cwgVar = new cwg((bst) obj2);
                cwl cwlVar4 = (cwl) cwpVar4.v();
                Context context5 = cwpVar4.b;
                byte[] f = ((jja) this.a).f();
                cmn A5 = dih.A();
                Parcel a13 = cwlVar4.a();
                bmt.d(a13, cwgVar);
                a13.writeByteArray(f);
                bmt.c(a13, A5);
                cwlVar4.c(10, a13);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                cwp cwpVar5 = (cwp) obj;
                cwh cwhVar2 = cwi.a;
                cwf cwfVar = new cwf((bst) obj2);
                cwl cwlVar5 = (cwl) cwpVar5.v();
                Context context6 = cwpVar5.b;
                String packageName3 = ((cms) this.a).a.getPackageName();
                cmn A6 = dih.A();
                Parcel a14 = cwlVar5.a();
                bmt.d(a14, cwfVar);
                a14.writeString(packageName3);
                bmt.c(a14, A6);
                cwlVar5.c(8, a14);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                cwp cwpVar6 = (cwp) obj;
                cwt cwtVar = new cwt((bst) obj2);
                cwl cwlVar6 = (cwl) cwpVar6.v();
                Context context7 = cwpVar6.b;
                String packageName4 = ((cms) this.a).a.getPackageName();
                cmn A7 = dih.A();
                Parcel a15 = cwlVar6.a();
                bmt.d(a15, cwtVar);
                a15.writeString(packageName4);
                bmt.c(a15, A7);
                cwlVar6.c(16, a15);
                return;
            case 15:
                cyd cydVar = (cyd) obj;
                bst bstVar = (bst) obj2;
                cxz cxzVar = new cxz(bstVar);
                ?? r52 = this.a;
                try {
                    cxu cxuVar = (cxu) cydVar.v();
                    Context context8 = cydVar.b;
                    cmn A8 = dih.A();
                    Parcel a16 = cxuVar.a();
                    bmt.d(a16, cxzVar);
                    bmt.c(a16, r52);
                    bmt.c(a16, A8);
                    cxuVar.c(3, a16);
                    return;
                } catch (RemoteException unused) {
                    ox.r(Status.c, null, bstVar);
                    return;
                }
            case 16:
                cyd cydVar2 = (cyd) obj;
                bst bstVar2 = (bst) obj2;
                cxy cxyVar = new cxy(bstVar2);
                ?? r53 = this.a;
                try {
                    cxu cxuVar2 = (cxu) cydVar2.v();
                    Context context9 = cydVar2.b;
                    cmn A9 = dih.A();
                    Parcel a17 = cxuVar2.a();
                    bmt.d(a17, cxyVar);
                    bmt.c(a17, r53);
                    bmt.c(a17, A9);
                    cxuVar2.c(2, a17);
                    return;
                } catch (RemoteException unused2) {
                    ox.r(Status.c, null, bstVar2);
                    return;
                }
            case 17:
                cyd cydVar3 = (cyd) obj;
                bst bstVar3 = (bst) obj2;
                cxx cxxVar = new cxx(bstVar3);
                ?? r54 = this.a;
                try {
                    cxu cxuVar3 = (cxu) cydVar3.v();
                    Context context10 = cydVar3.b;
                    cmn A10 = dih.A();
                    Parcel a18 = cxuVar3.a();
                    bmt.d(a18, cxxVar);
                    bmt.c(a18, r54);
                    bmt.c(a18, A10);
                    cxuVar3.c(1, a18);
                    return;
                } catch (RemoteException unused3) {
                    ox.r(Status.c, null, bstVar3);
                    return;
                }
            case 18:
                dan danVar = (dan) obj;
                daf dafVar = (daf) danVar.v();
                Context context11 = danVar.b;
                dafVar.e((dae) this.a, true, 1, dih.A());
                ((bst) obj2).c(null);
                return;
            case 19:
                dan danVar2 = (dan) obj;
                daf dafVar2 = (daf) danVar2.v();
                Context context12 = danVar2.b;
                dafVar2.e((dae) this.a, false, 0, dih.A());
                ((bst) obj2).c(true);
                return;
            default:
                cyz cyzVar = (cyz) obj;
                Object obj3 = this.a;
                try {
                    czb czbVar = (czb) cyzVar.v();
                    czh czhVar = new czh((Context) obj3, (bst) obj2);
                    Context context13 = cyzVar.b;
                    cmn A11 = dih.A();
                    Parcel a19 = czbVar.a();
                    bmt.d(a19, czhVar);
                    bmt.c(a19, A11);
                    czbVar.c(224705, a19);
                    return;
                } catch (RemoteException e2) {
                    ((bst) obj2).d(e2);
                    return;
                }
        }
    }
}
