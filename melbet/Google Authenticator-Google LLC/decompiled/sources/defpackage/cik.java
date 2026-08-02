package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cik implements cox {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cik(String str, int i) {
        this.c = i;
        this.b = str;
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.cox
    public final void a(Object obj, Object obj2) {
        ArrayList arrayList;
        switch (this.c) {
            case 0:
                cim cimVar = new cim((bst) obj2);
                cij cijVar = (cij) ((cih) obj).v();
                Parcel a = cijVar.a();
                bmt.d(a, cimVar);
                bmt.c(a, this.b);
                cijVar.c(1, a);
                return;
            case 1:
                cio cioVar = new cio((bst) obj2);
                cij cijVar2 = (cij) ((cih) obj).v();
                Parcel a2 = cijVar2.a();
                bmt.d(a2, cioVar);
                bmt.c(a2, this.b);
                cijVar2.c(4, a2);
                return;
            case 2:
                cip cipVar = new cip((bst) obj2);
                cij cijVar3 = (cij) ((cih) obj).v();
                Parcel a3 = cijVar3.a();
                bmt.d(a3, cipVar);
                bmt.c(a3, this.b);
                cijVar3.c(5, a3);
                return;
            case 3:
                ?? r7 = this.b;
                cin cinVar = new cin((cib) r7, (bst) obj2);
                cij cijVar4 = (cij) ((cih) obj).v();
                Parcel a4 = cijVar4.a();
                bmt.d(a4, cinVar);
                bmt.c(a4, r7);
                cijVar4.c(2, a4);
                return;
            case 4:
                cuv cuvVar = (cuv) obj;
                cut cutVar = cuvVar.v;
                WeakReference weakReference = new WeakReference(((cuu) this.a).k);
                Object obj3 = this.b;
                GoogleHelp googleHelp = (GoogleHelp) ((Intent) obj3).getParcelableExtra("EXTRA_GOOGLE_HELP");
                int i = googleHelp.M;
                if (i == 0 || i == 1) {
                    hcw hcwVar = cuz.a;
                    synchronized (hcwVar) {
                        arrayList = new ArrayList(hcwVar);
                    }
                    if (!arrayList.isEmpty()) {
                        googleHelp.N = arrayList;
                    }
                }
                kee keeVar = googleHelp.R;
                try {
                    cux cuxVar = (cux) cuvVar.v();
                    cuq cuqVar = new cuq((Intent) obj3, weakReference, keeVar);
                    Parcel a5 = cuxVar.a();
                    bmt.c(a5, googleHelp);
                    bmt.c(a5, null);
                    bmt.d(a5, cuqVar);
                    cuxVar.c(2, a5);
                    return;
                } catch (RemoteException e) {
                    Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
                    return;
                }
            case 5:
                cwp cwpVar = (cwp) obj;
                cvs cvsVar = cvw.a;
                cvt cvtVar = new cvt((bst) obj2);
                cwl cwlVar = (cwl) cwpVar.v();
                Context context = cwpVar.b;
                byte[] f = ((jja) this.b).f();
                cmn A = dih.A();
                Parcel a6 = cwlVar.a();
                bmt.d(a6, cvtVar);
                a6.writeString((String) this.a);
                a6.writeByteArray(f);
                bmt.c(a6, A);
                cwlVar.c(13, a6);
                return;
            case 6:
                cwp cwpVar2 = (cwp) obj;
                cvs cvsVar2 = cvw.a;
                cvt cvtVar2 = new cvt((bst) obj2);
                cwl cwlVar2 = (cwl) cwpVar2.v();
                Context context2 = cwpVar2.b;
                String packageName = ((cms) this.a).a.getPackageName();
                cmn A2 = dih.A();
                Parcel a7 = cwlVar2.a();
                bmt.d(a7, cvtVar2);
                a7.writeString(packageName);
                bmt.d(a7, this.b);
                bmt.c(a7, A2);
                cwlVar2.c(11, a7);
                return;
            case 7:
                cwp cwpVar3 = (cwp) obj;
                cwd cwdVar = cwe.a;
                cwc cwcVar = new cwc((bst) obj2);
                cwl cwlVar3 = (cwl) cwpVar3.v();
                Context context3 = cwpVar3.b;
                String packageName2 = ((cms) this.a).a.getPackageName();
                cmn A3 = dih.A();
                Parcel a8 = cwlVar3.a();
                bmt.d(a8, cwcVar);
                a8.writeString(packageName2);
                bmt.d(a8, this.b);
                bmt.c(a8, A3);
                cwlVar3.c(1, a8);
                return;
            case 8:
                cwp cwpVar4 = (cwp) obj;
                cwd cwdVar2 = cwe.a;
                cwc cwcVar2 = new cwc((bst) obj2);
                cwl cwlVar4 = (cwl) cwpVar4.v();
                Context context4 = cwpVar4.b;
                cmn A4 = dih.A();
                Parcel a9 = cwlVar4.a();
                bmt.d(a9, cwcVar2);
                a9.writeString((String) this.b);
                a9.writeString((String) this.a);
                bmt.c(a9, A4);
                cwlVar4.c(4, a9);
                return;
            case 9:
                cwp cwpVar5 = (cwp) obj;
                cwh cwhVar = cwi.a;
                cwg cwgVar = new cwg((bst) obj2);
                cwl cwlVar5 = (cwl) cwpVar5.v();
                Context context5 = cwpVar5.b;
                String packageName3 = ((cms) this.a).a.getPackageName();
                cmn A5 = dih.A();
                Parcel a10 = cwlVar5.a();
                bmt.d(a10, cwgVar);
                a10.writeString(packageName3);
                bmt.d(a10, this.b);
                bmt.c(a10, A5);
                cwlVar5.c(7, a10);
                return;
            case 10:
                cwp cwpVar6 = (cwp) obj;
                cwv cwvVar = new cwv((bst) obj2);
                cwl cwlVar6 = (cwl) cwpVar6.v();
                Context context6 = cwpVar6.b;
                String packageName4 = ((cms) this.a).a.getPackageName();
                cmn A6 = dih.A();
                Parcel a11 = cwlVar6.a();
                bmt.d(a11, cwvVar);
                a11.writeString(packageName4);
                bmt.d(a11, this.b);
                bmt.c(a11, A6);
                cwlVar6.c(15, a11);
                return;
            case 11:
                cxm cxmVar = (cxm) obj;
                cwo cwoVar = new cwo((bst) obj2, 3, (byte[]) null);
                cxj cxjVar = (cxj) cxmVar.v();
                Context context7 = cxmVar.b;
                cmn B = dih.B();
                Parcel a12 = cxjVar.a();
                bmt.d(a12, cwoVar);
                bmt.c(a12, this.a);
                bmt.c(a12, this.b);
                bmt.c(a12, B);
                cxjVar.c(1, a12);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int i2 = dbw.k;
                dbz dbzVar = new dbz((bst) obj2, 0);
                dca dcaVar = (dca) ((dcb) obj).v();
                Parcel a13 = dcaVar.a();
                bmt.d(a13, dbzVar);
                a13.writeString((String) this.b);
                a13.writeString((String) this.a);
                a13.writeString(null);
                dcaVar.c(11, a13);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i3 = dbw.k;
                dbz dbzVar2 = new dbz((bst) obj2, 0);
                dca dcaVar2 = (dca) ((dcb) obj).v();
                Parcel a14 = dcaVar2.a();
                bmt.d(a14, dbzVar2);
                a14.writeString((String) this.b);
                a14.writeByteArray((byte[]) this.a);
                dcaVar2.c(20, a14);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i4 = dbw.k;
                dca dcaVar3 = (dca) ((dcb) obj).v();
                cwo cwoVar2 = new cwo((cme) this.b, 4, (char[]) null);
                Parcel a15 = dcaVar3.a();
                a15.writeString((String) this.a);
                bmt.d(a15, cwoVar2);
                dcaVar3.c(28, a15);
                return;
            case 15:
                int i5 = dbw.k;
                dbz dbzVar3 = new dbz((bst) obj2, 0);
                ((dca) ((dcb) obj).v()).e(dbzVar3, "CURRENT:" + ((String) this.a) + ":" + ((String) this.b));
                return;
            default:
                int i6 = dbw.k;
                dbv dbvVar = new dbv((bst) obj2);
                dca dcaVar4 = (dca) ((dcb) obj).v();
                byte[] f2 = ((jja) this.b).f();
                Parcel a16 = dcaVar4.a();
                bmt.d(a16, dbvVar);
                a16.writeString((String) this.a);
                a16.writeByteArray(f2);
                dcaVar4.c(25, a16);
                return;
        }
    }

    public /* synthetic */ cik(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ cik(String str, Object obj, int i) {
        this.c = i;
        this.b = str;
        this.a = obj;
    }
}
