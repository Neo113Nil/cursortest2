package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFc1pSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.ah0;
import defpackage.oi;
import defpackage.qj2;
import defpackage.rv;
import defpackage.sl0;
import defpackage.ul0;
import defpackage.wi0;
import defpackage.zv;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFa1cSDK implements AFc1ySDK {
    private final AFb1bSDK AFInAppEventType;

    public AFa1cSDK(AFb1bSDK aFb1bSDK) {
        aFb1bSDK.getClass();
        this.AFInAppEventType = aFb1bSDK;
    }

    public static String AFInAppEventType(PackageManager packageManager, String str) {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    private File afErrorLog() {
        File AFInAppEventParameterName = AFInAppEventParameterName();
        if (AFInAppEventParameterName == null) {
            return null;
        }
        File file = new File(AFInAppEventParameterName, "6.12.1");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static long valueOf(Context context, String str) {
        try {
            return Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode() : r1.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r2.equals("af_prt") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> values(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            char c = 0;
            String str = "media_source";
            if (!it.hasNext()) {
                try {
                    if (!map.containsKey("install_time")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                        map.put("install_time", simpleDateFormat.format(new Date(j)));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e);
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
            String next = it.next();
            String queryParameter = uri.getQueryParameter(next);
            if (!map.containsKey(next)) {
                next.getClass();
                switch (next.hashCode()) {
                    case -1420799080:
                        break;
                    case 99:
                        if (next.equals("c")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110987:
                        if (next.equals("pid")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        str = "agency";
                        break;
                    case 1:
                        str = "campaign";
                        break;
                }
                map.put(str, queryParameter);
            }
            str = next;
            map.put(str, queryParameter);
        }
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final boolean AFInAppEventParameterName(String... strArr) {
        boolean z;
        strArr.getClass();
        synchronized (this) {
            try {
                File AFInAppEventParameterName = AFInAppEventParameterName();
                z = true;
                if (AFInAppEventParameterName != null) {
                    if (strArr.length == 0) {
                        AFLogger.afRDLog("[Exception Manager]: ".concat("delete all exceptions"));
                        z = ul0.d(AFInAppEventParameterName);
                    } else {
                        AFLogger.afRDLog("[Exception Manager]: ".concat("delete all exceptions except for: ".concat(oi.v(62, strArr))));
                        File[] listFiles = AFInAppEventParameterName.listFiles();
                        if (listFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!oi.o(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(rv.l(arrayList, 10));
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                File file2 = (File) obj;
                                file2.getClass();
                                arrayList2.add(Boolean.valueOf(ul0.d(file2)));
                            }
                            Set Q = zv.Q(arrayList2);
                            if (Q.isEmpty()) {
                                Q = qj2.b(Boolean.TRUE);
                            }
                            Set set = Q;
                            if (set.size() != 1 || !((Boolean) zv.t(set)).booleanValue()) {
                                z = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final String AFKeystoreWrapper(Throwable th, String str) {
        String str2;
        AFb1aSDK AFKeystoreWrapper;
        th.getClass();
        str.getClass();
        synchronized (this) {
            try {
                File afErrorLog = afErrorLog();
                str2 = null;
                if (afErrorLog != null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getClass().getName());
                        sb.append(": ");
                        sb.append(str);
                        String obj = sb.toString();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(th);
                        sb2.append('\n');
                        sb2.append(zv.A(AFc1pSDK.valueOf(th), "\n", null, null, AFc1pSDK.AnonymousClass1.AFKeystoreWrapper, 30));
                        AFb1aSDK aFb1aSDK = new AFb1aSDK(obj, AFc1uSDK.AFa1wSDK.values(sb2.toString()), wi0.b(th), 0, 8, null);
                        String str3 = aFb1aSDK.AFInAppEventType;
                        File file = new File(afErrorLog, str3);
                        if (file.exists() && (AFKeystoreWrapper = AFb1aSDK.AFa1xSDK.AFKeystoreWrapper(sl0.a(file))) != null) {
                            AFKeystoreWrapper.AFKeystoreWrapper++;
                            aFb1aSDK = AFKeystoreWrapper;
                        }
                        StringBuilder sb3 = new StringBuilder("label=");
                        sb3.append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.values));
                        sb3.append("\nhashName=");
                        sb3.append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.AFInAppEventType));
                        sb3.append("\nstackTrace=");
                        sb3.append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.AFInAppEventParameterName));
                        sb3.append("\nc=");
                        sb3.append(aFb1aSDK.AFKeystoreWrapper);
                        sl0.b(file, sb3.toString());
                        str2 = str3;
                    } catch (Exception e) {
                        StringBuilder sb4 = new StringBuilder(" ");
                        sb4.append(e.getMessage());
                        AFLogger.afRDLog("Could not cache exception\n".concat("[Exception Manager]: ".concat(sb4.toString())));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public AFa1cSDK() {
    }

    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }

    public static boolean AFInAppEventType(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(checkPermission);
        AFLogger.afRDLog(sb.toString());
        return checkPermission == 0;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final int AFInAppEventType() {
        Iterator<T> it = values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFb1aSDK) it.next()).AFKeystoreWrapper;
        }
        return i;
    }

    public static String AFInAppEventParameterName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return BuildConfig.FLAVOR;
        }
    }

    private File AFInAppEventParameterName() {
        Context context = this.AFInAppEventType.AFInAppEventParameterName;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean AFInAppEventParameterName(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final List<AFb1aSDK> values() {
        List<AFb1aSDK> list;
        synchronized (this) {
            try {
                File afErrorLog = afErrorLog();
                list = null;
                if (afErrorLog != null) {
                    try {
                        File[] listFiles = afErrorLog.listFiles();
                        if (listFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                AFb1aSDK.AFa1xSDK aFa1xSDK = AFb1aSDK.AFa1xSDK;
                                file.getClass();
                                AFb1aSDK AFKeystoreWrapper = AFb1aSDK.AFa1xSDK.AFKeystoreWrapper(sl0.a(file));
                                if (AFKeystoreWrapper != null) {
                                    arrayList.add(AFKeystoreWrapper);
                                }
                            }
                            list = arrayList;
                        }
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("Could not get stored exceptions\n ");
                        sb.append(th.getMessage());
                        AFLogger.afRDLog("[Exception Manager]: ".concat(sb.toString()));
                    }
                }
                if (list == null) {
                    list = ah0.m;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final boolean AFKeystoreWrapper() {
        return AFInAppEventParameterName(new String[0]);
    }
}
