package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kch extends kck {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ String b;
    final /* synthetic */ hel c;

    public kch(PackageManager packageManager, String str, hel helVar) {
        this.a = packageManager;
        this.b = str;
        this.c = helVar;
    }

    @Override // defpackage.kck
    public final kbq a(int i) {
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        boolean hasMultipleSigners;
        SigningInfo signingInfo3;
        Signature[] signingCertificateHistory;
        SigningInfo signingInfo4;
        int i2 = kcj.a;
        PackageManager packageManager = this.a;
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null) {
            return kbq.g.e("Rejected by (SHA-256 hash signature check) security policy");
        }
        boolean z = false;
        for (String str : packagesForUid) {
            if (this.b.equals(str)) {
                bqg bqgVar = new bqg(this.c, 12);
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        signingInfo2 = packageInfo.signingInfo;
                        hasMultipleSigners = signingInfo2.hasMultipleSigners();
                        if (hasMultipleSigners) {
                            signingInfo4 = packageInfo.signingInfo;
                            signingCertificateHistory = signingInfo4.getApkContentsSigners();
                        } else {
                            signingInfo3 = packageInfo.signingInfo;
                            signingCertificateHistory = signingInfo3.getSigningCertificateHistory();
                        }
                        for (Signature signature : signingCertificateHistory) {
                            if (bqgVar.a(signature)) {
                                return kbq.b;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                z = true;
            }
        }
        return kbq.f.e("Rejected by (SHA-256 hash signature check) security policy. Package name matched: " + z);
    }
}
