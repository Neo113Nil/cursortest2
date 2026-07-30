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
import com.appsflyer.internal.AFc1uSDK;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
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
import java.util.TimeZone;
import kotlin.ExceptionsKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFa1cSDK implements AFc1ySDK {
    private final AFb1bSDK AFInAppEventType;

    public AFa1cSDK() {
    }

    public static boolean AFInAppEventParameterName(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public static boolean AFInAppEventType(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        AFLogger.afRDLog(new StringBuilder("is Permission Available: ").append(str).append("; res: ").append(checkPermission).toString());
        return checkPermission == 0;
    }

    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r2.equals("af_prt") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Map<String, String> values(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            char c = 0;
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (!map.containsKey(next)) {
                    next.hashCode();
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
            } else {
                try {
                    if (!map.containsKey("install_time")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
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
        }
    }

    public static String AFInAppEventType(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static long valueOf(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    public static String AFInAppEventParameterName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }

    public AFa1cSDK(AFb1bSDK aFb1bSDK) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        this.AFInAppEventType = aFb1bSDK;
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

    @Override // com.appsflyer.internal.AFc1ySDK
    public final String AFKeystoreWrapper(Throwable th, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File afErrorLog = afErrorLog();
            str2 = null;
            if (afErrorLog != null) {
                try {
                    Intrinsics.checkNotNullParameter(th, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    StringBuilder sb = new StringBuilder();
                    Intrinsics.checkNotNullParameter(th, "");
                    String name = th.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    String obj = sb.append(name).append(": ").append(str).toString();
                    Intrinsics.checkNotNullParameter(th, "");
                    Intrinsics.checkNotNullParameter(th, "");
                    AFb1aSDK aFb1aSDK = new AFb1aSDK(obj, AFc1uSDK.AFa1wSDK.values(new StringBuilder().append(th).append('\n').append(CollectionsKt.joinToString$default(AFc1pSDK.valueOf(th), "\n", null, null, 0, null, new Function1<StackTraceElement, CharSequence>() { // from class: com.appsflyer.internal.AFc1pSDK.1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
                        public final CharSequence invoke(StackTraceElement stackTraceElement) {
                            Intrinsics.checkNotNullParameter(stackTraceElement, "");
                            return "at ".concat(String.valueOf(stackTraceElement));
                        }
                    }, 30, null)).toString()), ExceptionsKt.stackTraceToString(th), 0, 8, null);
                    String str3 = aFb1aSDK.AFInAppEventType;
                    File file = new File(afErrorLog, str3);
                    if (file.exists()) {
                        AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
                        AFb1aSDK AFKeystoreWrapper = AFb1aSDK.Companion.AFKeystoreWrapper(FilesKt.readText$default(file, null, 1, null));
                        if (AFKeystoreWrapper != null) {
                            AFKeystoreWrapper.AFKeystoreWrapper++;
                            aFb1aSDK = AFKeystoreWrapper;
                        }
                    }
                    FilesKt.writeText$default(file, new StringBuilder("label=").append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.valueOf)).append("\nhashName=").append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.AFInAppEventType)).append("\nstackTrace=").append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.AFInAppEventParameterName)).append("\nc=").append(aFb1aSDK.AFKeystoreWrapper).toString(), null, 2, null);
                    str2 = str3;
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("Could not cache exception\n");
                    String obj2 = new StringBuilder(" ").append(e.getMessage()).toString();
                    Intrinsics.checkNotNullParameter(obj2, "");
                    AFLogger.afRDLog(sb2.append("[Exception Manager]: ".concat(String.valueOf(obj2))).toString());
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final List<AFb1aSDK> values() {
        List<AFb1aSDK> list;
        synchronized (this) {
            File afErrorLog = afErrorLog();
            list = null;
            if (afErrorLog != null) {
                try {
                    File[] listFiles = afErrorLog.listFiles();
                    if (listFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles, "");
                        ArrayList arrayList = new ArrayList();
                        for (File file : listFiles) {
                            AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(file, "");
                            AFb1aSDK AFKeystoreWrapper = AFb1aSDK.Companion.AFKeystoreWrapper(FilesKt.readText$default(file, null, 1, null));
                            if (AFKeystoreWrapper != null) {
                                arrayList.add(AFKeystoreWrapper);
                            }
                        }
                        list = arrayList;
                    }
                } catch (Throwable th) {
                    String obj = new StringBuilder("Could not get stored exceptions\n ").append(th.getMessage()).toString();
                    Intrinsics.checkNotNullParameter(obj, "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(obj)));
                }
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
        }
        return list;
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

    @Override // com.appsflyer.internal.AFc1ySDK
    public final boolean AFKeystoreWrapper() {
        return AFInAppEventParameterName(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final boolean AFInAppEventParameterName(String... strArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            File AFInAppEventParameterName = AFInAppEventParameterName();
            z = true;
            if (AFInAppEventParameterName != null) {
                if (strArr.length == 0) {
                    Intrinsics.checkNotNullParameter("delete all exceptions", "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf("delete all exceptions")));
                    z = FilesKt.deleteRecursively(AFInAppEventParameterName);
                } else {
                    String obj = new StringBuilder("delete all exceptions except for: ").append(ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)).toString();
                    Intrinsics.checkNotNullParameter(obj, "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(obj)));
                    File[] listFiles = AFInAppEventParameterName.listFiles();
                    if (listFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles, "");
                        ArrayList arrayList = new ArrayList();
                        for (File file : listFiles) {
                            if (!ArraysKt.contains(strArr, file.getName())) {
                                arrayList.add(file);
                            }
                        }
                        ArrayList<File> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        for (File file2 : arrayList2) {
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                        }
                        Set set = CollectionsKt.toSet(arrayList3);
                        if (set.isEmpty()) {
                            set = SetsKt.setOf(Boolean.TRUE);
                        }
                        Set set2 = set;
                        if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                            z = false;
                        }
                    }
                }
            }
        }
        return z;
    }
}
