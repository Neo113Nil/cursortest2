package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class HMSPackageManager {

    /* renamed from: o, reason: collision with root package name */
    private static HMSPackageManager f14450o;

    /* renamed from: p, reason: collision with root package name */
    private static final Object f14451p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static final Object f14452q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private static final Object f14453r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final Map<String, String> f14454s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f14455a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageManagerHelper f14456b;

    /* renamed from: c, reason: collision with root package name */
    private String f14457c;

    /* renamed from: d, reason: collision with root package name */
    private String f14458d;

    /* renamed from: e, reason: collision with root package name */
    private int f14459e;

    /* renamed from: f, reason: collision with root package name */
    private String f14460f;

    /* renamed from: g, reason: collision with root package name */
    private String f14461g;

    /* renamed from: h, reason: collision with root package name */
    private String f14462h;

    /* renamed from: i, reason: collision with root package name */
    private String f14463i;

    /* renamed from: j, reason: collision with root package name */
    private int f14464j;

    /* renamed from: k, reason: collision with root package name */
    private int f14465k;

    /* renamed from: l, reason: collision with root package name */
    private long f14466l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14467m;

    /* renamed from: n, reason: collision with root package name */
    private int f14468n;

    public static class PackagePriorityInfo implements Comparable<PackagePriorityInfo> {

        /* renamed from: a, reason: collision with root package name */
        private String f14469a;

        /* renamed from: b, reason: collision with root package name */
        private String f14470b;

        /* renamed from: c, reason: collision with root package name */
        private String f14471c;

        /* renamed from: d, reason: collision with root package name */
        private String f14472d;

        /* renamed from: e, reason: collision with root package name */
        private String f14473e;

        /* renamed from: f, reason: collision with root package name */
        private Long f14474f;

        public PackagePriorityInfo(String str, String str2, String str3, String str4, String str5, long j4) {
            this.f14469a = str;
            this.f14470b = str2;
            this.f14471c = str3;
            this.f14472d = str4;
            this.f14473e = str5;
            this.f14474f = Long.valueOf(j4);
        }

        @Override // java.lang.Comparable
        public int compareTo(PackagePriorityInfo packagePriorityInfo) {
            return TextUtils.equals(this.f14473e, packagePriorityInfo.f14473e) ? this.f14474f.compareTo(packagePriorityInfo.f14474f) : this.f14473e.compareTo(packagePriorityInfo.f14473e);
        }
    }

    class a implements Comparator<ResolveInfo> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            String str2 = resolveInfo2.serviceInfo.applicationInfo.packageName;
            if (HMSPackageManager.f14454s.containsKey(str) && HMSPackageManager.f14454s.containsKey(str2)) {
                return str.compareTo(str2);
            }
            if (HMSPackageManager.f14454s.containsKey(str)) {
                return -1;
            }
            return HMSPackageManager.f14454s.containsKey(str2) ? 1 : 0;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            try {
                List<ResolveInfo> queryIntentServices = HMSPackageManager.this.f14455a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), UserVerificationMethods.USER_VERIFY_PATTERN);
                if (queryIntentServices == null || queryIntentServices.size() == 0) {
                    HMSLog.w("HMSPackageManager", "resolveInfoList is empty.");
                    return;
                }
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (it.hasNext()) {
                    if ("com.huawei.hwid".equals(it.next().serviceInfo.applicationInfo.packageName)) {
                        HMSPackageManager.this.d();
                    }
                }
                HMSLog.i("HMSPackageManager", "quit asyncOnceCheckMDMState");
            } catch (Exception e4) {
                HMSLog.e("HMSPackageManager", "asyncOnceCheckMDMState query hms action failed. " + e4.getMessage());
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f14454s = hashMap;
        hashMap.put("com.huawei.hwid", "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05");
        hashMap.put("com.huawei.hwid.tv", "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C");
    }

    private HMSPackageManager(Context context) {
        this.f14455a = context;
        this.f14456b = new PackageManagerHelper(context);
    }

    private boolean c(String str, String str2) {
        return Objects.equals(str2, this.f14456b.getPackageSigningCertificate(str)) || Objects.equals(str2, this.f14456b.getPackageSignature(str));
    }

    private Pair<String, String> d(String str, String str2) {
        if (!f14454s.containsKey(str) || !PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(str2)) {
            return null;
        }
        this.f14468n = 3;
        return new Pair<>(str, str2);
    }

    private void e(String str) {
        if (SystemUtils.isHuawei() || SystemUtils.isSystemApp(this.f14455a, str) || Build.VERSION.SDK_INT < 28 || b(str)) {
            AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        }
    }

    private void f() {
        synchronized (f14452q) {
            this.f14457c = null;
            this.f14458d = null;
            this.f14459e = 0;
        }
    }

    private String g() {
        String str;
        HMSLog.i("HMSPackageManager", "Enter getAvailableHMSPackageNameForMultiService.");
        String str2 = this.f14460f;
        if (str2 != null) {
            c(str2);
            if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f14456b.getPackageStates(this.f14460f)) && (str = this.f14460f) != null) {
                return str;
            }
        }
        HMSLog.i("HMSPackageManager", " return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f14451p) {
            try {
                if (f14450o == null && context != null) {
                    if (context.getApplicationContext() != null) {
                        f14450o = new HMSPackageManager(context.getApplicationContext());
                    } else {
                        f14450o = new HMSPackageManager(context);
                    }
                    f14450o.l();
                    f14450o.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14450o;
    }

    private Pair<String, String> h() {
        try {
            List<ResolveInfo> queryIntentServices = this.f14455a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), UserVerificationMethods.USER_VERIFY_PATTERN);
            if (queryIntentServices == null || queryIntentServices.size() == 0) {
                HMSLog.e("HMSPackageManager", "query hms action, resolveInfoList is null or empty.");
                return null;
            }
            a(queryIntentServices);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                String packageSigningCertificate = this.f14456b.getPackageSigningCertificate(str);
                String packageSignature = this.f14456b.getPackageSignature(str);
                Pair<String, String> d4 = d(str, packageSigningCertificate);
                if (d4 != null) {
                    HMSLog.i("HMSPackageManager", "signature V3 check success");
                    return d4;
                }
                Pair<String, String> a4 = a(resolveInfo.serviceInfo.metaData, str, packageSigningCertificate, packageSignature);
                if (a4 != null) {
                    HMSLog.i("HMSPackageManager", "DSS signature check success");
                    return a4;
                }
                Pair<String, String> a5 = a(str, packageSignature);
                if (a5 != null) {
                    HMSLog.i("HMSPackageManager", "signature V2 check success");
                    return a5;
                }
            }
            return null;
        } catch (Exception e4) {
            HMSLog.e("HMSPackageManager", "getHmsPackageName query hms action failed. " + e4.getMessage());
            return null;
        }
    }

    private Pair<String, String> i() {
        Pair<String, String> h4 = h();
        if (h4 != null) {
            HMSLog.i("HMSPackageManager", "aidlService pkgName: " + ((String) h4.first));
            this.f14462h = "com.huawei.hms.core.aidlservice";
            this.f14463i = null;
            return h4;
        }
        ArrayList<PackagePriorityInfo> j4 = j();
        if (j4 == null) {
            HMSLog.e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        int size = j4.size();
        int i4 = 0;
        while (i4 < size) {
            PackagePriorityInfo packagePriorityInfo = j4.get(i4);
            i4++;
            PackagePriorityInfo packagePriorityInfo2 = packagePriorityInfo;
            String str = packagePriorityInfo2.f14469a;
            String str2 = packagePriorityInfo2.f14470b;
            String str3 = packagePriorityInfo2.f14471c;
            String str4 = packagePriorityInfo2.f14472d;
            String packageSignature = this.f14456b.getPackageSignature(str);
            if (a(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                HMSLog.i("HMSPackageManager", "result: " + str + ", " + str2 + ", " + packagePriorityInfo2.f14474f);
                this.f14462h = PackageConstants.GENERAL_SERVICES_ACTION;
                d(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    private ArrayList<PackagePriorityInfo> j() {
        try {
            List<ResolveInfo> queryIntentServices = this.f14455a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), UserVerificationMethods.USER_VERIFY_PATTERN);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                HMSLog.e("HMSPackageManager", "query aglite action, resolveInfoList is null or empty");
                return null;
            }
            ArrayList<PackagePriorityInfo> arrayList = new ArrayList<>();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                long packageFirstInstallTime = this.f14456b.getPackageFirstInstallTime(str);
                Bundle bundle = resolveInfo.serviceInfo.metaData;
                if (bundle == null) {
                    HMSLog.e("HMSPackageManager", "package " + str + " get metaData is null");
                } else {
                    String a4 = a(bundle, "hms_app_checker_config");
                    String a5 = a(a4);
                    if (TextUtils.isEmpty(a5)) {
                        HMSLog.i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + a4);
                    } else {
                        String a6 = a(bundle, "hms_app_signer_v2");
                        if (TextUtils.isEmpty(a6)) {
                            HMSLog.i("HMSPackageManager", "get signerV2 fail.");
                        } else {
                            String a7 = a(bundle, "hms_app_cert_chain");
                            if (TextUtils.isEmpty(a7)) {
                                HMSLog.i("HMSPackageManager", "get certChain fail.");
                            } else {
                                HMSLog.i("HMSPackageManager", "add: " + str + ", " + a4 + ", " + packageFirstInstallTime);
                                arrayList.add(new PackagePriorityInfo(str, a4, a6, a7, a5, packageFirstInstallTime));
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (Exception e4) {
            HMSLog.e("HMSPackageManager", "query aglite action failed. " + e4.getMessage());
            return null;
        }
    }

    private void k() {
        synchronized (f14452q) {
            try {
                Pair<String, String> h4 = h();
                if (h4 == null) {
                    HMSLog.e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                    f();
                    return;
                }
                String str = (String) h4.first;
                this.f14457c = str;
                this.f14458d = (String) h4.second;
                this.f14459e = this.f14456b.getPackageVersionCode(str);
                HMSLog.i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.f14457c + " version: " + this.f14459e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (f14452q) {
            try {
                Pair<String, String> i4 = i();
                if (i4 == null) {
                    HMSLog.e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                    e();
                    AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                    return;
                }
                this.f14460f = (String) i4.first;
                this.f14461g = (String) i4.second;
                this.f14464j = this.f14456b.getPackageVersionCode(g());
                e(this.f14460f);
                HMSLog.i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f14460f + " version: " + this.f14464j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean m() {
        Bundle bundle;
        PackageManager packageManager = this.f14455a.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (AndroidException unused) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e4) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e4);
        }
        if (TextUtils.isEmpty(this.f14462h) || (!this.f14462h.equals(PackageConstants.GENERAL_SERVICES_ACTION) && !this.f14462h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
            return true;
        }
        HMSLog.i("HMSPackageManager", "action = " + this.f14462h + " exist");
        return false;
    }

    public String getHMSFingerprint() {
        String str = this.f14458d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.f14457c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f14456b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                k();
            }
            String str2 = this.f14457c;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f14460f;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f14456b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                l();
            }
            String str2 = this.f14460f;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (f14451p) {
            try {
                refresh();
                PackageManagerHelper.PackageStates packageStates = this.f14456b.getPackageStates(this.f14457c);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    f();
                    return packageStates2;
                }
                if ("com.huawei.hwid".equals(this.f14457c) && d() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || c(this.f14457c, this.f14458d)) ? packageStates : packageStates2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (f14451p) {
            try {
                refreshForMultiService();
                PackageManagerHelper.PackageStates packageStates = this.f14456b.getPackageStates(this.f14460f);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    e();
                    return packageStates2;
                }
                if ("com.huawei.hwid".equals(this.f14460f) && d() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || c(this.f14460f, this.f14461g)) ? packageStates : packageStates2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.f14456b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.f14456b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.f14462h) ? this.f14462h : "com.huawei.hms.core.aidlservice";
    }

    public boolean hmsVerHigherThan(int i4) {
        if (this.f14459e >= i4 || !m()) {
            return true;
        }
        int packageVersionCode = this.f14456b.getPackageVersionCode(getHMSPackageName());
        this.f14459e = packageVersionCode;
        return packageVersionCode >= i4;
    }

    public boolean isApkNeedUpdate(int i4) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i4);
        return hmsVersionCode < i4;
    }

    public boolean isApkUpdateNecessary(int i4) {
        if (isUpdateHmsForThirdPartyDevice()) {
            return true;
        }
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i4);
        return m() && hmsVersionCode < i4;
    }

    public boolean isUpdateHmsForThirdPartyDevice() {
        return "com.huawei.hwid".equals(this.f14460f) && AgHmsUpdateState.getInstance().isUpdateHms();
    }

    public boolean isUseOldCertificate() {
        return this.f14467m;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f14457c) || TextUtils.isEmpty(this.f14458d)) {
            k();
        }
        c(this.f14457c);
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f14460f) || TextUtils.isEmpty(this.f14461g)) {
            l();
        }
        c(this.f14460f);
    }

    public void resetMultiServiceState() {
        e();
    }

    public void setUseOldCertificate(boolean z4) {
        this.f14467m = z4;
    }

    private boolean b(String str) {
        return !"com.huawei.hwid".equals(str) || this.f14468n == 3;
    }

    private void a(List<ResolveInfo> list) {
        if (list.size() <= 1) {
            return;
        }
        Collections.sort(list, new a());
    }

    private boolean b(String str, String str2) {
        Map<String, String> map = f14454s;
        return map.containsKey(str) && map.get(str).equalsIgnoreCase(str2);
    }

    private void c(String str) {
        if ("com.huawei.hwid".equals(str) && AgHmsUpdateState.getInstance().isUpdateHms() && this.f14456b.getPackageVersionCode(str) >= AgHmsUpdateState.getInstance().getTargetVersionCode()) {
            AgHmsUpdateState.getInstance().resetUpdateState();
            HMSLog.i("HMSPackageManager", "refresh update state for HMS V3");
        }
    }

    private Pair<String, String> a(Bundle bundle, String str, String str2, String str3) {
        String str4;
        if (bundle == null) {
            HMSLog.e("HMSPackageManager", "DSS check: " + str + " for metadata is null");
            return null;
        }
        this.f14468n = 2;
        if (a(bundle, str, str2)) {
            HMSLog.i("HMSPackageManager", "support DSS V3 check");
            str3 = str2;
            str4 = "hms_app_signer_v3";
        } else {
            str4 = "hms_app_signer";
        }
        if (!bundle.containsKey(str4)) {
            HMSLog.e("HMSPackageManager", "skip package " + str + " for no " + str4);
            return null;
        }
        if (!bundle.containsKey("hms_app_cert_chain")) {
            HMSLog.e("HMSPackageManager", "skip package " + str + " for no cert chain");
            return null;
        }
        if (!a(str + "&" + str3, bundle.getString(str4), bundle.getString("hms_app_cert_chain"))) {
            HMSLog.e("HMSPackageManager", "checkSigner failed");
            return null;
        }
        if (str4.equals("hms_app_signer_v3")) {
            this.f14468n = 3;
        }
        return new Pair<>(str, str3);
    }

    private void b() {
        new Thread(new b(), "Thread-asyncOnceCheckMDMState").start();
    }

    private void d(String str) {
        String a4 = a(str);
        if (TextUtils.isEmpty(a4)) {
            return;
        }
        this.f14463i = a4.substring(9);
    }

    private void e() {
        synchronized (f14452q) {
            this.f14460f = null;
            this.f14461g = null;
            this.f14462h = null;
            this.f14463i = null;
            this.f14464j = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        synchronized (f14453r) {
            try {
                HMSLog.i("HMSPackageManager", "enter checkHmsIsSpoof");
                long packageFirstInstallTime = this.f14456b.getPackageFirstInstallTime("com.huawei.hwid");
                if (this.f14465k != 3 && this.f14466l == packageFirstInstallTime) {
                    HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + a(this.f14465k));
                    return this.f14465k;
                }
                this.f14465k = c() ? 2 : 1;
                this.f14466l = this.f14456b.getPackageFirstInstallTime("com.huawei.hwid");
                HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof state: " + a(this.f14465k));
                return this.f14465k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean c() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f14455a);
        if (hmsPath == null) {
            HMSLog.i("HMSPackageManager", "hmsPath is null!");
            return false;
        }
        if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        }
        if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.i("HMSPackageManager", "checkSignature fail!");
            return false;
        }
        if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        }
        HMSLog.i("HMSPackageManager", "verifyApkHash fail!");
        return false;
    }

    private Pair<String, String> a(String str, String str2) {
        if (b(str, str2)) {
            return new Pair<>(str, str2);
        }
        HMSLog.w("HMSPackageManager", "check sign fail: " + str + BundleUtil.UNDERLINE_TAG + str2);
        return null;
    }

    private boolean a(Bundle bundle, String str, String str2) {
        return bundle.containsKey("hms_app_signer_v3") && !b(str, str2) && Build.VERSION.SDK_INT >= 28;
    }

    private String a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            HMSLog.e("HMSPackageManager", "no " + str + " in metaData");
            return null;
        }
        return bundle.getString(str);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("priority=");
        if (indexOf == -1) {
            HMSLog.e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int indexOf2 = str.indexOf(StringUtils.COMMA, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(indexOf, indexOf2);
    }

    private boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            List<X509Certificate> b4 = com.huawei.hms.device.a.b(str3);
            if (b4.size() == 0) {
                HMSLog.e("HMSPackageManager", "certChain is empty");
                return false;
            }
            if (!com.huawei.hms.device.a.a(com.huawei.hms.device.a.a(this.f14455a), b4)) {
                HMSLog.e("HMSPackageManager", "failed to verify cert chain");
                return false;
            }
            if (!a(b4, Arrays.asList("Huawei CBG Application Integration CA", "Huawei CBG HMS"), Arrays.asList("Huawei CBG", "Huawei CBG Cloud Security Signer"))) {
                HMSLog.i("HMSPackageManager", "failed to verify cert chain.");
                return false;
            }
            if (com.huawei.hms.device.a.a(b4.get(b4.size() - 1), str, str2)) {
                return true;
            }
            HMSLog.e("HMSPackageManager", "signature is invalid: " + str);
            return false;
        }
        HMSLog.e("HMSPackageManager", "args is invalid");
        return false;
    }

    private boolean a(List<X509Certificate> list, List<String> list2, List<String> list3) {
        if (list != null && list2 != null && list3 != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                X509Certificate x509Certificate = list.get(size);
                if (size >= list2.size()) {
                    HMSLog.e("HMSPackageManager", "CN is invalid, Array length mismatch.");
                    return false;
                }
                if (!com.huawei.hms.device.a.a(x509Certificate, list2.get(size))) {
                    HMSLog.e("HMSPackageManager", "CN is invalid");
                    return false;
                }
                if (size >= list3.size()) {
                    HMSLog.e("HMSPackageManager", "OU is invalid, Array length mismatch.");
                    return false;
                }
                if (!com.huawei.hms.device.a.b(x509Certificate, list3.get(size))) {
                    HMSLog.e("HMSPackageManager", "OU is invalid");
                    return false;
                }
            }
            return true;
        }
        HMSLog.e("HMSPackageManager", "checkSubjects, params is null.");
        return false;
    }

    private static String a(int i4) {
        if (i4 == 1) {
            return "SPOOFED";
        }
        if (i4 == 2) {
            return "SUCCESS";
        }
        if (i4 == 3) {
            return "UNCHECKED";
        }
        HMSLog.e("HMSPackageManager", "invalid checkMDM state: " + i4);
        return "";
    }
}
