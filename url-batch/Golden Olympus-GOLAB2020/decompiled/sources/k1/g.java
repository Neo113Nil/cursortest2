package k1;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g {
    public static final ApplicationInfo a(PackageManager packageManager, String packageName, long j4) {
        PackageManager.ApplicationInfoFlags of;
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT < 33) {
            ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(packageName, (int) j4);
            Intrinsics.checkNotNullExpressionValue(applicationInfo2, "{\n        this.getApplic…ame, flags.toInt())\n    }");
            return applicationInfo2;
        }
        of = PackageManager.ApplicationInfoFlags.of(j4);
        applicationInfo = packageManager.getApplicationInfo(packageName, of);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "{\n        this.getApplic…nfoFlags.of(flags))\n    }");
        return applicationInfo;
    }

    public static final List b(PackageManager packageManager, String packageName) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int i4 = 0;
        if (Build.VERSION.SDK_INT < 28) {
            Signature[] sig = d(packageManager, packageName, 64L).signatures;
            Intrinsics.checkNotNullExpressionValue(sig, "sig");
            ArrayList arrayList = new ArrayList(sig.length);
            int length = sig.length;
            while (i4 < length) {
                Signature signature = sig[i4];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                arrayList.add(messageDigest.digest());
                i4++;
            }
            return arrayList;
        }
        signingInfo = d(packageManager, packageName, 134217728L).signingInfo;
        hasMultipleSigners = signingInfo.hasMultipleSigners();
        if (hasMultipleSigners) {
            apkContentsSigners = signingInfo.getApkContentsSigners();
            Intrinsics.checkNotNullExpressionValue(apkContentsSigners, "sig.apkContentsSigners");
            ArrayList arrayList2 = new ArrayList(apkContentsSigners.length);
            int length2 = apkContentsSigners.length;
            while (i4 < length2) {
                Signature signature2 = apkContentsSigners[i4];
                MessageDigest messageDigest2 = MessageDigest.getInstance("SHA");
                messageDigest2.update(signature2.toByteArray());
                arrayList2.add(messageDigest2.digest());
                i4++;
            }
            return arrayList2;
        }
        signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        Intrinsics.checkNotNullExpressionValue(signingCertificateHistory, "sig.signingCertificateHistory");
        ArrayList arrayList3 = new ArrayList(signingCertificateHistory.length);
        int length3 = signingCertificateHistory.length;
        while (i4 < length3) {
            Signature signature3 = signingCertificateHistory[i4];
            MessageDigest messageDigest3 = MessageDigest.getInstance("SHA");
            messageDigest3.update(signature3.toByteArray());
            arrayList3.add(messageDigest3.digest());
            i4++;
        }
        return arrayList3;
    }

    public static final List c(PackageManager packageManager, long j4) {
        PackageManager.ApplicationInfoFlags of;
        List installedApplications;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        if (Build.VERSION.SDK_INT < 33) {
            List<ApplicationInfo> installedApplications2 = packageManager.getInstalledApplications((int) j4);
            Intrinsics.checkNotNullExpressionValue(installedApplications2, "{\n        this.getInstal…ions(flags.toInt())\n    }");
            return installedApplications2;
        }
        of = PackageManager.ApplicationInfoFlags.of(j4);
        installedApplications = packageManager.getInstalledApplications(of);
        Intrinsics.checkNotNullExpressionValue(installedApplications, "{\n        this.getInstal…nfoFlags.of(flags))\n    }");
        return installedApplications;
    }

    public static final PackageInfo d(PackageManager packageManager, String packageName, long j4) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, (int) j4);
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "{\n        this.getPackag…ame, flags.toInt())\n    }");
            return packageInfo2;
        }
        of = PackageManager.PackageInfoFlags.of(j4);
        packageInfo = packageManager.getPackageInfo(packageName, of);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n        this.getPackag…nfoFlags.of(flags))\n    }");
        return packageInfo;
    }

    public static final Object e(Intent intent, String str, Class clazz) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Build.VERSION.SDK_INT < 33) {
            return intent.getParcelableExtra(str);
        }
        parcelableExtra = intent.getParcelableExtra(str, clazz);
        return parcelableExtra;
    }

    public static final Serializable f(Intent intent, String str, Class clazz) {
        Serializable serializableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra(str, clazz);
            return serializableExtra;
        }
        Serializable serializableExtra2 = intent.getSerializableExtra(str);
        if (serializableExtra2 instanceof Serializable) {
            return serializableExtra2;
        }
        return null;
    }

    public static final List g(PackageManager packageManager, Intent intent, long j4) {
        PackageManager.ResolveInfoFlags of;
        List queryIntentActivities;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Build.VERSION.SDK_INT < 33) {
            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, (int) j4);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities2, "{\n        this.queryInte…ent, flags.toInt())\n    }");
            return queryIntentActivities2;
        }
        of = PackageManager.ResolveInfoFlags.of(j4);
        queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "{\n        this.queryInte…nfoFlags.of(flags))\n    }");
        return queryIntentActivities;
    }

    public static /* synthetic */ List h(PackageManager packageManager, Intent intent, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        return g(packageManager, intent, j4);
    }

    public static final ResolveInfo i(PackageManager packageManager, Intent intent, long j4) {
        PackageManager.ResolveInfoFlags of;
        ResolveInfo resolveService;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Build.VERSION.SDK_INT < 33) {
            return packageManager.resolveService(intent, (int) j4);
        }
        of = PackageManager.ResolveInfoFlags.of(j4);
        resolveService = packageManager.resolveService(intent, of);
        return resolveService;
    }

    public static /* synthetic */ ResolveInfo j(PackageManager packageManager, Intent intent, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        return i(packageManager, intent, j4);
    }
}
