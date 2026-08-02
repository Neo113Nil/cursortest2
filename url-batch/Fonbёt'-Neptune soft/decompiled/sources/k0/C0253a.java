package k0;

import G0.c;
import I.C0079n;
import P.O;
import Q0.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import s0.InterfaceC0304a;
import v0.i;
import w0.InterfaceC0320f;
import w0.l;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253a implements l, InterfaceC0304a {

    /* renamed from: e, reason: collision with root package name */
    public Context f3106e;

    /* renamed from: f, reason: collision with root package name */
    public C0079n f3107f;

    public static String b(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        h.d(digest, "hashText");
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i2 = 0; i2 < length; i2++) {
            byte b2 = digest[i2];
            int i3 = i2 * 2;
            cArr2[i3] = cArr[(b2 & 255) >>> 4];
            cArr2[i3 + 1] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f3106e;
                h.b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    h.d(apkContentsSigners, "signingInfo.apkContentsSigners");
                    byte[] byteArray = ((Signature) c.T(apkContentsSigners)).toByteArray();
                    h.d(byteArray, "signingInfo.apkContentsS…ers.first().toByteArray()");
                    str = b(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    h.d(signingCertificateHistory, "signingInfo.signingCertificateHistory");
                    byte[] byteArray2 = ((Signature) c.T(signingCertificateHistory)).toByteArray();
                    h.d(byteArray2, "signingInfo.signingCerti…ory.first().toByteArray()");
                    str = b(byteArray2);
                }
            } else {
                Context context2 = this.f3106e;
                h.b(context2);
                Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && c.T(signatureArr) != null) {
                    byte[] byteArray3 = ((Signature) c.T(signatureArr)).toByteArray();
                    h.d(byteArray3, "signatures.first().toByteArray()");
                    str = b(byteArray3);
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[Catch: NameNotFoundException -> 0x006f, TryCatch #0 {NameNotFoundException -> 0x006f, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0044, B:8:0x0051, B:11:0x0062, B:13:0x0068, B:16:0x0072, B:19:0x008b, B:21:0x0094, B:22:0x009c, B:24:0x00a5, B:26:0x00ac, B:27:0x00b1, B:30:0x0099, B:33:0x004d, B:34:0x00c7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5 A[Catch: NameNotFoundException -> 0x006f, TryCatch #0 {NameNotFoundException -> 0x006f, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0044, B:8:0x0051, B:11:0x0062, B:13:0x0068, B:16:0x0072, B:19:0x008b, B:21:0x0094, B:22:0x009c, B:24:0x00a5, B:26:0x00ac, B:27:0x00b1, B:30:0x0099, B:33:0x004d, B:34:0x00c7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[Catch: NameNotFoundException -> 0x006f, TryCatch #0 {NameNotFoundException -> 0x006f, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0044, B:8:0x0051, B:11:0x0062, B:13:0x0068, B:16:0x0072, B:19:0x008b, B:21:0x0094, B:22:0x009c, B:24:0x00a5, B:26:0x00ac, B:27:0x00b1, B:30:0x0099, B:33:0x004d, B:34:0x00c7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: NameNotFoundException -> 0x006f, TryCatch #0 {NameNotFoundException -> 0x006f, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0044, B:8:0x0051, B:11:0x0062, B:13:0x0068, B:16:0x0072, B:19:0x008b, B:21:0x0094, B:22:0x009c, B:24:0x00a5, B:26:0x00ac, B:27:0x00b1, B:30:0x0099, B:33:0x004d, B:34:0x00c7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    @Override // w0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(O o2, i iVar) {
        String installerPackageName;
        String str;
        String str2;
        InstallSourceInfo installSourceInfo;
        h.e(o2, "call");
        try {
            if (!h.a((String) o2.f875f, "getAll")) {
                iVar.b();
                return;
            }
            Context context = this.f3106e;
            h.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f3106e;
            h.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String a2 = a(packageManager);
            Context context3 = this.f3106e;
            h.b(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.f3106e;
            h.b(context4);
            String packageName = context4.getPackageName();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                installSourceInfo = packageManager2.getInstallSourceInfo(packageName);
                installerPackageName = installSourceInfo.getInitiatingPackageName();
            } else {
                installerPackageName = packageManager2.getInstallerPackageName(packageName);
            }
            long j2 = packageInfo.firstInstallTime;
            long j3 = packageInfo.lastUpdateTime;
            HashMap hashMap = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str3 = "";
            if (applicationInfo != null) {
                CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                if (loadLabel != null) {
                    str = loadLabel.toString();
                    if (str == null) {
                    }
                    hashMap.put("appName", str);
                    Context context5 = this.f3106e;
                    h.b(context5);
                    hashMap.put("packageName", context5.getPackageName());
                    str2 = packageInfo.versionName;
                    if (str2 == null) {
                        str3 = str2;
                    }
                    hashMap.put("version", str3);
                    hashMap.put("buildNumber", String.valueOf(i2 < 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
                    if (a2 != null) {
                        hashMap.put("buildSignature", a2);
                    }
                    if (installerPackageName != null) {
                        hashMap.put("installerStore", installerPackageName);
                    }
                    hashMap.put("installTime", String.valueOf(j2));
                    hashMap.put("updateTime", String.valueOf(j3));
                    iVar.c(hashMap);
                }
            }
            str = "";
            hashMap.put("appName", str);
            Context context52 = this.f3106e;
            h.b(context52);
            hashMap.put("packageName", context52.getPackageName());
            str2 = packageInfo.versionName;
            if (str2 == null) {
            }
            hashMap.put("version", str3);
            hashMap.put("buildNumber", String.valueOf(i2 < 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (a2 != null) {
            }
            if (installerPackageName != null) {
            }
            hashMap.put("installTime", String.valueOf(j2));
            hashMap.put("updateTime", String.valueOf(j3));
            iVar.c(hashMap);
        } catch (PackageManager.NameNotFoundException e2) {
            iVar.a("Name not found", e2.getMessage(), null);
        }
    }

    @Override // s0.InterfaceC0304a
    public final void j(C0079n c0079n) {
        h.e(c0079n, "binding");
        this.f3106e = (Context) c0079n.f689e;
        C0079n c0079n2 = new C0079n((InterfaceC0320f) c0079n.f690f, "dev.fluttercommunity.plus/package_info");
        this.f3107f = c0079n2;
        c0079n2.j(this);
    }

    @Override // s0.InterfaceC0304a
    public final void k(C0079n c0079n) {
        h.e(c0079n, "binding");
        this.f3106e = null;
        C0079n c0079n2 = this.f3107f;
        h.b(c0079n2);
        c0079n2.j(null);
        this.f3107f = null;
    }
}
