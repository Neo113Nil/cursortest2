package com.huawei.hms.ads.identifier;

import B0.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    private static final String SETTINGS_AD_ID = "pps_oaid";
    private static final String SETTINGS_TRACK_LIMIT = "pps_track_limit";
    private static final String TAG = "AdvertisingIdClient";

    public static final class Info {
        private final String advertisingId;
        private final boolean limitAdTrackingEnabled;

        public Info(String str, boolean z4) {
            this.advertisingId = str;
            this.limitAdTrackingEnabled = z4;
        }

        public String getId() {
            return this.advertisingId;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13875b;

        a(Context context) {
            this.f13875b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdvertisingIdClient.requestAdvertisingIdInfo(this.f13875b);
            } catch (Throwable th) {
                Log.w("AdIdClient", "update Id err: " + th.getClass().getSimpleName());
            }
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        try {
        } catch (Throwable th) {
            Log.w("AdIdClient", "get Id err: " + th.getClass().getSimpleName());
        }
        if (!TextUtils.isEmpty(Settings.Global.getString(context.getContentResolver(), "pps_oaid_c"))) {
            Info a4 = b.a(context);
            return a4 != null ? a4 : requestAdvertisingIdInfo(context);
        }
        String string = Settings.Global.getString(context.getContentResolver(), SETTINGS_AD_ID);
        String string2 = Settings.Global.getString(context.getContentResolver(), SETTINGS_TRACK_LIMIT);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            updateAdvertisingIdInfo(context);
            return new Info(string, Boolean.valueOf(string2).booleanValue());
        }
        return requestAdvertisingIdInfo(context);
    }

    private static Info getIdInfoViaAIDL(Context context) {
        try {
            context.getPackageManager().getPackageInfo(c.a(context), UserVerificationMethods.USER_VERIFY_PATTERN);
            com.huawei.hms.ads.identifier.a aVar = new com.huawei.hms.ads.identifier.a();
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(c.a(context));
            try {
                if (!context.bindService(intent, aVar, 1)) {
                    throw new IOException("bind failed");
                }
                try {
                    try {
                        B0.a a4 = a.AbstractC0002a.a(aVar.a());
                        Info info = new Info(a4.getOaid(), a4.e());
                        try {
                            return info;
                        } catch (Throwable th) {
                            return info;
                        }
                    } catch (RemoteException unused) {
                        throw new IOException("bind hms service RemoteException");
                    }
                } catch (InterruptedException unused2) {
                    throw new IOException("bind hms service InterruptedException");
                }
            } finally {
                try {
                    context.unbindService(aVar);
                } catch (Throwable th2) {
                    Log.w("AdIdClient", "unbind " + th2.getClass().getSimpleName());
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            throw new IOException("Service not found");
        } catch (Exception unused4) {
            throw new IOException("Service not found: Exception");
        }
    }

    public static boolean isAdvertisingIdAvailable(Context context) {
        try {
            context.getPackageManager().getPackageInfo(c.a(context), UserVerificationMethods.USER_VERIFY_PATTERN);
            new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage(c.a(context));
            return !r1.queryIntentServices(r2, 0).isEmpty();
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Info requestAdvertisingIdInfo(Context context) {
        if (b.d(context)) {
            Log.i(TAG, "requestAdvertisingIdInfo via provider");
            return b.c(context);
        }
        Log.i(TAG, "requestAdvertisingIdInfo via aidl");
        return getIdInfoViaAIDL(context);
    }

    private static void updateAdvertisingIdInfo(Context context) {
        f.f13902a.execute(new a(context));
    }

    public static boolean verifyAdId(Context context, String str, boolean z4) {
        Info requestAdvertisingIdInfo = requestAdvertisingIdInfo(context);
        if (requestAdvertisingIdInfo != null) {
            return TextUtils.equals(str, requestAdvertisingIdInfo.getId()) && z4 == requestAdvertisingIdInfo.isLimitAdTrackingEnabled();
        }
        Log.w("AdIdClient", "info is null");
        return false;
    }
}
