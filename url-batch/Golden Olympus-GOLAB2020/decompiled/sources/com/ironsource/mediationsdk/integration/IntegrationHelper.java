package com.ironsource.mediationsdk.integration;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.environment.StringUtils;
import com.ironsource.ge;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.o9;

/* loaded from: classes2.dex */
public class IntegrationHelper {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17620a = "IntegrationHelper";

    /* renamed from: b, reason: collision with root package name */
    private static final String f17621b = "4.1";

    /* renamed from: c, reason: collision with root package name */
    private static final String f17622c = "4.3";

    class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f17623a;

        a(Context context) {
            this.f17623a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(IntegrationHelper.f17620a, "--------------- Google Play Services --------------");
                if (!this.f17623a.getPackageManager().getApplicationInfo(this.f17623a.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(IntegrationHelper.f17620a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(IntegrationHelper.f17620a, "Google Play Services - VERIFIED");
                String b4 = p.m().b(this.f17623a);
                if (TextUtils.isEmpty(b4)) {
                    return;
                }
                Log.i(IntegrationHelper.f17620a, "GAID is: " + b4 + " (use this for test devices)");
            } catch (Exception e4) {
                o9.d().a(e4);
                Log.e(IntegrationHelper.f17620a, "Google Play Services - MISSING");
            }
        }
    }

    private static IntegrationData a(Context context, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Context.class).invoke(null, context);
            Log.i(f17620a, "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException e4) {
            o9.d().a(e4);
            str2 = "Adapter - MISSING";
            Log.e(f17620a, str2);
            return null;
        } catch (Exception e5) {
            o9.d().a(e5);
            str2 = "Adapter version - NOT VERIFIED";
            Log.e(f17620a, str2);
            return null;
        }
    }

    private static void b(Context context) {
        Log.i(f17620a, "*** Permissions ***");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            Log.i(f17620a, "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e(f17620a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            Log.i(f17620a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e(f17620a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void validateIntegration(Context context) {
        boolean z4;
        String str;
        boolean z5;
        Log.i(f17620a, "Verifying Integration:");
        b(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", "Vungle", "Maio", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "Smaato", "SuperAwesome", ge.f16392C1, "Verve", "Yandex"};
        for (int i4 = 0; i4 < 24; i4++) {
            String str2 = strArr[i4];
            if (b(context, str2)) {
                String lowerCase = StringUtils.toLowerCase(str2);
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -805296079:
                        if (lowerCase.equals("vungle")) {
                            z5 = false;
                            break;
                        }
                        z5 = -1;
                        break;
                    case 92668925:
                        if (lowerCase.equals("admob")) {
                            z5 = true;
                            break;
                        }
                        z5 = -1;
                        break;
                    case 497130182:
                        if (lowerCase.equals("facebook")) {
                            z5 = 2;
                            break;
                        }
                        z5 = -1;
                        break;
                    default:
                        z5 = -1;
                        break;
                }
                switch (z5) {
                    case false:
                        str = ">>>> Liftoff Monetization - VERIFIED";
                        break;
                    case true:
                        str = ">>>> Google (AdMob and Ad Manager) - VERIFIED";
                        break;
                    case true:
                        str = ">>>> Meta - VERIFIED";
                        break;
                    default:
                        str = ">>>> " + str2 + " - VERIFIED";
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str2);
                lowerCase2.getClass();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                            z4 = false;
                            break;
                        }
                        z4 = -1;
                        break;
                    case 92668925:
                        if (lowerCase2.equals("admob")) {
                            z4 = true;
                            break;
                        }
                        z4 = -1;
                        break;
                    case 497130182:
                        if (lowerCase2.equals("facebook")) {
                            z4 = 2;
                            break;
                        }
                        z4 = -1;
                        break;
                    default:
                        z4 = -1;
                        break;
                }
                switch (z4) {
                    case false:
                        str = ">>>> Liftoff Monetization - NOT VERIFIED";
                        break;
                    case true:
                        str = ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED";
                        break;
                    case true:
                        str = ">>>> Meta - NOT VERIFIED";
                        break;
                    default:
                        Log.e(f17620a, ">>>> " + str2 + " - NOT VERIFIED");
                        continue;
                }
            }
            Log.i(f17620a, str);
        }
        a(context);
    }

    private static void a(Context context) {
        new a(context).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0003, B:14:0x0045, B:15:0x0064, B:19:0x0090, B:21:0x0098, B:24:0x009f, B:30:0x001d, B:33:0x002a, B:36:0x0034), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean b(Context context, String str) {
        char c4;
        String str2;
        IntegrationData a4;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int hashCode = lowerCase.hashCode();
            if (hashCode == -805296079) {
                if (lowerCase.equals("vungle")) {
                    c4 = 2;
                    if (c4 != 0) {
                    }
                    Log.i(f17620a, str2);
                    String str3 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
                    a4 = a(context, str3);
                    if (a4 != null) {
                    }
                }
                c4 = 65535;
                if (c4 != 0) {
                }
                Log.i(f17620a, str2);
                String str32 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
                a4 = a(context, str32);
                if (a4 != null) {
                }
            } else if (hashCode != 92668925) {
                if (hashCode == 497130182 && lowerCase.equals("facebook")) {
                    c4 = 0;
                    if (c4 != 0) {
                        str2 = "--------------- Meta --------------";
                    } else if (c4 == 1) {
                        str2 = "--------------- Google (AdMob and Ad Manager) --------------";
                    } else if (c4 != 2) {
                        str2 = "--------------- " + str + " --------------";
                    } else {
                        str2 = "--------------- Liftoff Monetization --------------";
                    }
                    Log.i(f17620a, str2);
                    String str322 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
                    a4 = a(context, str322);
                    if (a4 != null) {
                        return false;
                    }
                    if (!str.equalsIgnoreCase("IronSource") && !a(a4)) {
                        return false;
                    }
                    a(str322);
                    return true;
                }
                c4 = 65535;
                if (c4 != 0) {
                }
                Log.i(f17620a, str2);
                String str3222 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
                a4 = a(context, str3222);
                if (a4 != null) {
                }
            } else {
                if (lowerCase.equals("admob")) {
                    c4 = 1;
                    if (c4 != 0) {
                    }
                    Log.i(f17620a, str2);
                    String str32222 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
                    a4 = a(context, str32222);
                    if (a4 != null) {
                    }
                }
                c4 = 65535;
                if (c4 != 0) {
                }
                Log.i(f17620a, str2);
                String str322222 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
                a4 = a(context, str322222);
                if (a4 != null) {
                }
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            Log.e(f17620a, "isAdapterValid " + str, e4);
            return false;
        }
        o9.d().a(e4);
        Log.e(f17620a, "isAdapterValid " + str, e4);
        return false;
    }

    private static void a(String str) {
        try {
            Log.i(f17620a, "SDK Version - " + ((String) Class.forName(str).getMethod("getAdapterSDKVersion", null).invoke(null, null)));
        } catch (Exception e4) {
            o9.d().a(e4);
            Log.w("validateSDKVersion", "Unable to get SDK version");
        }
    }

    private static boolean a(IntegrationData integrationData) {
        if (integrationData.version.startsWith(f17621b) || integrationData.version.startsWith(f17622c)) {
            Log.i(f17620a, "Adapter - VERIFIED");
            return true;
        }
        Log.e(f17620a, integrationData.name + " adapter " + integrationData.version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to version " + f17621b + ".*");
        return false;
    }
}
