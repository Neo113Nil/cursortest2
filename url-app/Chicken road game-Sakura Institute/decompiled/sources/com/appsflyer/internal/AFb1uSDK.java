package com.appsflyer.internal;

import B0.AbstractC0087a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class AFb1uSDK {
    public static boolean AFInAppEventParameterName(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(checkPermission);
        AFLogger.afRDLog(sb.toString());
        return checkPermission == 0;
    }

    public static String AFInAppEventType(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4);
            return "";
        }
    }

    public static boolean AFKeystoreWrapper(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return AbstractC0087a.c(context.getApplicationContext().getSystemService(AbstractC0087a.l())) != null;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1aSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : "", th, false, false);
            }
        }
        return false;
    }

    public static boolean values(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public static long values(Context context, String str) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT < 28) {
                return packageInfo.versionCode;
            }
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4);
            return 0L;
        }
    }

    public static boolean AFInAppEventParameterName() {
        return Build.BRAND.equals("OPPO");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r2.equals("c") != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> AFInAppEventParameterName(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            char c4 = 0;
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (!map.containsKey(next)) {
                    int hashCode = next.hashCode();
                    if (hashCode == -1420799080) {
                        if (next.equals("af_prt")) {
                            c4 = 2;
                            if (c4 != 0) {
                            }
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                    } else if (hashCode != 99) {
                        if (hashCode == 110987 && next.equals("pid")) {
                            c4 = 1;
                            if (c4 != 0) {
                                str = "campaign";
                            } else if (c4 != 1) {
                                if (c4 == 2) {
                                    str = "agency";
                                }
                            }
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                    }
                    map.put(str, queryParameter);
                }
                str = next;
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e4) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e4);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j4)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    public static String AFInAppEventParameterName(PackageManager packageManager, String str) {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static Application AFInAppEventParameterName(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }
}
