package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cho {
    private static final fwm a;
    public static final String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final String c = "androidPackageName";
    public static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        String str = new String[]{"GoogleAuthUtil"}[0];
        if (sb.length() > 1) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("] ");
        a = new fwm(sb.toString());
    }

    public static TokenData a(final Context context, final Account account, final String str, Bundle bundle, long j, Executor executor) {
        bvw bvwVar;
        final Bundle bundle2;
        final long currentTimeMillis = System.currentTimeMillis();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final bvw h = bvw.h(context);
        try {
            oy.ao("Calling this from your main thread can lead to deadlock");
            oy.as(str, "Scope cannot be empty or null.");
            k(account);
            e(context, 8400000);
            Bundle bundle3 = bundle == null ? new Bundle() : new Bundle(bundle);
            f(context, bundle3);
            bundle2 = bundle3;
            bvwVar = h;
        } catch (Exception e) {
            e = e;
            bvwVar = h;
        }
        try {
            return (TokenData) b(context, d, new chn() { // from class: chk
                @Override // defpackage.chn
                public final Object a(IBinder iBinder) {
                    cck cckVar;
                    String str2;
                    String[] strArr = cho.b;
                    TokenData tokenData = null;
                    if (iBinder == null) {
                        cckVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                        cckVar = queryLocalInterface instanceof cck ? (cck) queryLocalInterface : new cck(iBinder);
                    }
                    Bundle bundle4 = bundle2;
                    String str3 = str;
                    Account account2 = account;
                    Parcel a2 = cckVar.a();
                    bmt.c(a2, account2);
                    a2.writeString(str3);
                    bmt.c(a2, bundle4);
                    Parcel b2 = cckVar.b(5, a2);
                    Bundle bundle5 = (Bundle) bmt.a(b2, Bundle.CREATOR);
                    b2.recycle();
                    if (bundle5 == null) {
                        throw new IOException("Service call returned null");
                    }
                    ClassLoader classLoader = TokenData.class.getClassLoader();
                    if (classLoader != null) {
                        bundle5.setClassLoader(classLoader);
                    }
                    Bundle bundle6 = bundle5.getBundle("tokenDetails");
                    if (bundle6 != null) {
                        if (classLoader != null) {
                            bundle6.setClassLoader(classLoader);
                        }
                        tokenData = (TokenData) bundle6.getParcelable("TokenData");
                    }
                    long j2 = elapsedRealtime;
                    long j3 = currentTimeMillis;
                    bvw bvwVar2 = h;
                    if (tokenData != null) {
                        bvwVar2.g(1709, 0, j3, System.currentTimeMillis(), j2);
                        return tokenData;
                    }
                    String string = bundle5.getString("Error");
                    Intent intent = (Intent) bundle5.getParcelable("userRecoveryIntent");
                    PendingIntent pendingIntent = (PendingIntent) bundle5.getParcelable("userRecoveryPendingIntent");
                    int i = 49500;
                    while (true) {
                        if (i < 50000) {
                            if (i != 495243) {
                                switch (i) {
                                    case 49500:
                                        str2 = "AccountNotPresent";
                                        break;
                                    case 49501:
                                        str2 = "AppSuspended";
                                        break;
                                    case 49502:
                                        str2 = "InvalidScope";
                                        break;
                                    case 49503:
                                        str2 = "NeedPermission";
                                        break;
                                    case 49504:
                                        str2 = "NeedRemoteConsent";
                                        break;
                                    case 49505:
                                        str2 = "PermissionDenied";
                                        break;
                                    case 49506:
                                        str2 = "UnknownError";
                                        break;
                                    default:
                                        switch (i) {
                                            case 49508:
                                                str2 = "ServiceUnavailable";
                                                break;
                                            case 49509:
                                                str2 = "InvalidRequest";
                                                break;
                                            case 49510:
                                                str2 = "EmptyConsumerPackageOrSignature";
                                                break;
                                            case 49511:
                                                str2 = "NeedsTwoFactorAuth";
                                                break;
                                            case 49512:
                                                str2 = "NeedsBrowser";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 49514:
                                                        str2 = "UserCancel";
                                                        break;
                                                    case 49515:
                                                        str2 = "RestrictedClient";
                                                        break;
                                                    case 49516:
                                                        str2 = "InvalidAudience";
                                                        break;
                                                    case 49517:
                                                        str2 = "UnregisteredOnApiConsole";
                                                        break;
                                                    case 49518:
                                                        str2 = "ThirdPartyDeviceManagementRequired";
                                                        break;
                                                    case 49519:
                                                        str2 = "DeviceManagementInternalError";
                                                        break;
                                                    case 49520:
                                                        str2 = "DeviceManagementSyncDisabled";
                                                        break;
                                                    case 49521:
                                                        str2 = "DeviceManagementAdminBlocked";
                                                        break;
                                                    case 49522:
                                                        str2 = "DeviceManagementAdminPendingApproval";
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 49524:
                                                                str2 = "DeviceManagementDeactivated";
                                                                break;
                                                            case 49525:
                                                                str2 = "DeviceManagementScreenLockRequired";
                                                                break;
                                                            case 49526:
                                                                str2 = "DeviceManagementRequired";
                                                                break;
                                                            case 49527:
                                                                str2 = "DeviceManagementRequiredOrSyncDisabled";
                                                                break;
                                                            case 49528:
                                                                str2 = "AuthSecurityError";
                                                                break;
                                                            case 49529:
                                                                str2 = "AuthBindingError";
                                                                break;
                                                            case 49530:
                                                                str2 = "BadAuthentication";
                                                                break;
                                                            case 49531:
                                                                str2 = "NetworkError";
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 49754:
                                                                        str2 = "CapabilityResponseYes";
                                                                        break;
                                                                    case 49755:
                                                                        str2 = "CapabilityResponseNo";
                                                                        break;
                                                                    case 49756:
                                                                        str2 = "CapabilityResponseNotPermitted";
                                                                        break;
                                                                    case 49757:
                                                                        str2 = "CapabilityResponseRequestFailed";
                                                                        break;
                                                                    case 49758:
                                                                        str2 = "CapabilityResponseUnknownCapability";
                                                                        break;
                                                                    case 49759:
                                                                        str2 = "CapabilityResponseFailedToSync";
                                                                        break;
                                                                    default:
                                                                        str2 = ox.w(i);
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                            } else {
                                str2 = "DeviceManagementStaleSyncRequired";
                            }
                            if (!str2.equals(string)) {
                                i++;
                            }
                        } else {
                            i = 13;
                        }
                    }
                    Context context2 = context;
                    bvwVar2.g(1709, i, j3, System.currentTimeMillis(), j2);
                    cho.g(context2, "getTokenWithDetails", string, intent, pendingIntent);
                    throw new chh("Invalid state. Shouldn't happen");
                }
            }, j, executor);
        } catch (Exception e2) {
            e = e2;
            bvwVar.g(1709, 13, currentTimeMillis, System.currentTimeMillis(), elapsedRealtime);
            throw e;
        }
    }

    public static Object b(Context context, ComponentName componentName, chn chnVar, long j, Executor executor) {
        Object a2;
        clf clfVar = new clf();
        cqj b2 = cqj.b(context);
        try {
            if (!b2.e(new cqi(componentName), clfVar, executor).c()) {
                throw new IOException("Could not bind to service.");
            }
            try {
                try {
                    if (j > 0) {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        oy.ao("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                        if (clfVar.a) {
                            throw new IllegalStateException("Cannot call get on this connection more than once");
                        }
                        clfVar.a = true;
                        IBinder iBinder = (IBinder) clfVar.b.poll(j, timeUnit);
                        if (iBinder == null) {
                            throw new TimeoutException("Timed out waiting for the service connection");
                        }
                        a2 = chnVar.a(iBinder);
                    } else {
                        oy.ao("BlockingServiceConnection.getService() called on main thread");
                        if (clfVar.a) {
                            throw new IllegalStateException("Cannot call get on this connection more than once");
                        }
                        clfVar.a = true;
                        a2 = chnVar.a((IBinder) clfVar.b.take());
                    }
                    return a2;
                } finally {
                    b2.c(componentName, clfVar);
                }
            } catch (RemoteException | InterruptedException | TimeoutException e) {
                throw new IOException("Error on service connection.", e);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static String c(Context context, String str) {
        oy.as(str, "accountName must be provided");
        oy.ao("Calling this from your main thread can lead to deadlock");
        e(context, 8400000);
        return d(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public static String d(Context context, Account account, String str, Bundle bundle) {
        k(account);
        return a(context, account, str, bundle, 0L, null).b;
    }

    public static void e(Context context, int i) {
        try {
            cmd.c(context.getApplicationContext(), i);
        } catch (cmb | GooglePlayServicesIncorrectManifestValueException e) {
            throw new chh(e.getMessage(), e);
        } catch (cmc e2) {
            throw new chq(e2.getMessage(), e2.a());
        }
    }

    public static void f(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = c;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void g(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) {
        ciz a2 = ciz.a(str2);
        fwm fwmVar = a;
        fwmVar.P(String.format("[GoogleAuthUtil] error status:%s with method:%s", a2, str));
        if (!ciz.BAD_AUTHENTICATION.equals(a2) && !ciz.CAPTCHA.equals(a2) && !ciz.NEED_PERMISSION.equals(a2) && !ciz.NEED_REMOTE_CONSENT.equals(a2) && !ciz.NEEDS_BROWSER.equals(a2) && !ciz.USER_CANCEL.equals(a2) && !ciz.DEVICE_MANAGEMENT_REQUIRED.equals(a2) && !ciz.DM_INTERNAL_ERROR.equals(a2) && !ciz.DM_SYNC_DISABLED.equals(a2) && !ciz.DM_ADMIN_BLOCKED.equals(a2) && !ciz.DM_ADMIN_PENDING_APPROVAL.equals(a2) && !ciz.DM_STALE_SYNC_REQUIRED.equals(a2) && !ciz.DM_DEACTIVATED.equals(a2) && !ciz.DM_REQUIRED.equals(a2) && !ciz.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(a2) && !ciz.DM_SCREENLOCK_REQUIRED.equals(a2)) {
            if (!ciz.NETWORK_ERROR.equals(a2) && !ciz.SERVICE_UNAVAILABLE.equals(a2) && !ciz.INTNERNAL_ERROR.equals(a2) && !ciz.AUTH_SECURITY_ERROR.equals(a2)) {
                throw new chh(str2);
            }
            throw new IOException(str2);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.a(str2, intent);
        }
        cll cllVar = cll.a;
        int a3 = cmd.a(context);
        if (a3 >= 233800000 && pendingIntent == null) {
            fwmVar.O(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(a3), str, 233800000));
        }
        if (intent == null) {
            fwmVar.O(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str));
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    /* JADX WARN: Finally extract failed */
    public static Account[] h(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bvw h = bvw.h(context);
        try {
            oy.ar("com.google");
            try {
                int i = clm.c;
                cmd.c(context, 8400000);
                oy.at(context);
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient("com.google.android.gms.auth.accounts");
                try {
                    if (acquireUnstableContentProviderClient == null) {
                        throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                    }
                    try {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putString("callingActivity", context instanceof Activity ? ((Activity) context).getComponentName().getClassName() : "");
                            Bundle call = acquireUnstableContentProviderClient.call("get_accounts", "com.google", bundle);
                            if (call == null) {
                                throw new RemoteException("Null result from AccountChimeraContentProvider");
                            }
                            Parcelable[] parcelableArray = call.getParcelableArray("accounts");
                            if (parcelableArray == null) {
                                throw new RemoteException("Key_Accounts is Null");
                            }
                            Account[] accountArr = new Account[parcelableArray.length];
                            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                                accountArr[i2] = (Account) parcelableArray[i2];
                            }
                            acquireUnstableContentProviderClient.release();
                            h.g(1708, 0, currentTimeMillis, System.currentTimeMillis(), elapsedRealtime);
                            return accountArr;
                        } catch (RemoteException e) {
                            a.N("RemoteException when fetching accounts", e);
                            throw e;
                        }
                    } catch (Exception e2) {
                        a.N("Exception when getting accounts", e2);
                        throw new RemoteException("Accounts ContentProvider failed: " + e2.getMessage());
                    }
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (GooglePlayServicesIncorrectManifestValueException unused) {
                throw new cmb(18);
            }
        } catch (Exception e3) {
            h.g(1708, 13, currentTimeMillis, System.currentTimeMillis(), elapsedRealtime);
            throw e3;
        }
    }

    public static Account[] i(Context context, final String[] strArr) {
        final String className;
        final long currentTimeMillis = System.currentTimeMillis();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final bvw h = bvw.h(context);
        try {
            oy.at(context);
            oy.ar("com.google");
            e(context, 8400000);
            className = context instanceof Activity ? ((Activity) context).getComponentName().getClassName() : "";
        } catch (Exception e) {
            e = e;
        }
        try {
            chn chnVar = new chn() { // from class: chj
                public final /* synthetic */ String a = "com.google";

                @Override // defpackage.chn
                public final Object a(IBinder iBinder) {
                    cck cckVar;
                    Parcelable[] parcelableArray;
                    String[] strArr2 = cho.b;
                    if (iBinder == null) {
                        cckVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                        cckVar = queryLocalInterface instanceof cck ? (cck) queryLocalInterface : new cck(iBinder);
                    }
                    String str = className;
                    String[] strArr3 = strArr;
                    String str2 = this.a;
                    Bundle bundle = new Bundle();
                    bundle.putString("accountType", str2);
                    bundle.putStringArray("account_features", strArr3);
                    bundle.putString("callingActivity", str);
                    Parcel a2 = cckVar.a();
                    bmt.c(a2, bundle);
                    Parcel b2 = cckVar.b(6, a2);
                    Bundle bundle2 = (Bundle) bmt.a(b2, Bundle.CREATOR);
                    b2.recycle();
                    if (bundle2 == null || (parcelableArray = bundle2.getParcelableArray("accounts")) == null) {
                        throw new IOException("Receive null result from service call.");
                    }
                    Account[] accountArr = new Account[parcelableArray.length];
                    for (int i = 0; i < parcelableArray.length; i++) {
                        accountArr[i] = (Account) parcelableArray[i];
                    }
                    h.g(1708, 0, currentTimeMillis, System.currentTimeMillis(), elapsedRealtime);
                    return accountArr;
                }
            };
            h = h;
            return (Account[]) b(context, d, chnVar, 0L, null);
        } catch (Exception e2) {
            e = e2;
            h = h;
            Exception exc = e;
            h.g(1708, 13, currentTimeMillis, System.currentTimeMillis(), elapsedRealtime);
            throw exc;
        }
    }

    public static void j(Object obj) {
        if (obj != null) {
            return;
        }
        a.P("Service call returned null.");
        throw new IOException("Service unavailable.");
    }

    private static void k(Account account) {
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }
}
