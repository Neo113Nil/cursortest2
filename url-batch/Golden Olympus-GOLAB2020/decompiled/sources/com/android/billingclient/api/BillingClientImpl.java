package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.g;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzhu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzio;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjr;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzjy;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private PendingPurchasesParams zzE;
    private boolean zzF;
    private boolean zzG;
    private volatile BillingClientStateListener zzH;
    private ExecutorService zzI;
    private final Long zzJ;
    private com.google.android.gms.internal.play_billing.zzbo zzK;
    private final Object zza;
    private volatile int zzb;
    private final String zzc;
    private final String zzd;
    private final Handler zze;
    private volatile zzab zzf;
    private Context zzg;
    private zzcz zzh;
    private volatile com.google.android.gms.internal.play_billing.zzap zzi;
    private volatile zzbw zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    private BillingClientImpl(Activity activity, PendingPurchasesParams pendingPurchasesParams, String str, BillingClient.Builder builder) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new zzci(), str, null, null, null, null, null, builder);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, zzb zzbVar, String str, zzcz zzczVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zzjp zza = zzjr.zza();
        zza.zzx(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zza.zzy(str2);
        }
        zza.zzq(this.zzg.getPackageName());
        zza.zzd(this.zzJ.longValue());
        zza.zzw(builder.zza);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(846465066L);
        zzbo(zza, context);
        try {
            zza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        if (zzczVar != null) {
            this.zzh = zzczVar;
        } else {
            this.zzh = new zzdl(this.zzg, (zzjr) zza.zzi());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzab(this.zzg, purchasesUpdatedListener, null, zzbVar, null, null, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzG = zzbVar != null;
        this.zzg.getPackageName();
        this.zzF = builder.zza;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j4) {
        startConnection(new zzci(j4));
    }

    public static /* synthetic */ Void zzA(BillingClientImpl billingClientImpl, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        billingClientImpl.zzaL(alternativeBillingOnlyInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void zzB(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        billingClientImpl.zzaK(externalOfferAvailabilityListener);
        return null;
    }

    public static /* synthetic */ Void zzC(BillingClientImpl billingClientImpl, BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i4) {
        billingClientImpl.zzaJ(billingProgramAvailabilityListener, i4);
        return null;
    }

    public static /* synthetic */ Void zzD(BillingClientImpl billingClientImpl, LaunchExternalLinkResponseListener launchExternalLinkResponseListener, LaunchExternalLinkParams launchExternalLinkParams, Activity activity) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!billingClientImpl.zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (billingClientImpl.zzD) {
                synchronized (billingClientImpl.zza) {
                    zzapVar = billingClientImpl.zzi;
                }
                if (zzapVar == null) {
                    billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = billingClientImpl.zzg.getPackageName();
                    String str = billingClientImpl.zzc;
                    String str2 = billingClientImpl.zzd;
                    long longValue = billingClientImpl.zzJ.longValue();
                    int i4 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    zzhu zza = zzhx.zza();
                    zzio zza2 = zziq.zza();
                    zza2.zza(launchExternalLinkParams.getLinkUri().toString());
                    zza.zza("externalOfferUri", (zziq) zza2.zzi());
                    zzio zza3 = zziq.zza();
                    zza3.zza(String.valueOf(launchExternalLinkParams.getLaunchMode()));
                    zza.zza("externalOfferLaunchMode", (zziq) zza3.zzi());
                    zzio zza4 = zziq.zza();
                    zza4.zza(String.valueOf(launchExternalLinkParams.getLinkType()));
                    zza.zza("externalOfferLinkType", (zziq) zza4.zzi());
                    zzio zza5 = zziq.zza();
                    zza5.zza(String.valueOf(launchExternalLinkParams.getBillingProgram()));
                    zza.zza("externalOfferBillingProgram", (zziq) zza5.zzi());
                    bundle.putByteArray("REQUEST_PARAMS", ((zzhx) zza.zzi()).zzQ());
                    zzapVar.zzp(27, packageName, bundle, new zzcc(billingClientImpl, new WeakReference(activity), launchExternalLinkResponseListener, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support launch external link.");
                billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzG, zzjd.LAUNCH_EXTERNAL_LINK_NOT_SUPPORTED, null);
            }
        } catch (RuntimeException e4) {
            billingClientImpl.zzaZ(launchExternalLinkResponseListener, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, e4);
        }
        return null;
    }

    public static /* synthetic */ Void zzE(BillingClientImpl billingClientImpl, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        billingClientImpl.zzaH(externalOfferReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ Void zzF(BillingClientImpl billingClientImpl, ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        billingClientImpl.zzaM(externalOfferInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void zzG(BillingClientImpl billingClientImpl, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        billingClientImpl.zzaF(alternativeBillingOnlyReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ Void zzH(BillingClientImpl billingClientImpl, BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingProgramReportingDetailsParams billingProgramReportingDetailsParams) {
        billingClientImpl.zzaG(billingProgramReportingDetailsListener, billingProgramReportingDetailsParams);
        return null;
    }

    public static /* synthetic */ Void zzI(BillingClientImpl billingClientImpl, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        billingClientImpl.zzaI(alternativeBillingOnlyAvailabilityListener);
        return null;
    }

    static Future zzK(Callable callable, long j4, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaz
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j4 * 0.95d));
            return submit;
        } catch (Exception e4) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Async task throws exception!", e4);
            return null;
        }
    }

    public static /* synthetic */ void zzL(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public static /* synthetic */ void zzM(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbw.zzk());
    }

    public static /* synthetic */ void zzN(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 13, billingResult);
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public static /* synthetic */ void zzR(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 3, billingResult);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public static /* synthetic */ void zzT(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener) {
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbs(zzjdVar, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
    }

    public static /* synthetic */ void zzV(BillingClientImpl billingClientImpl, BillingResult billingResult) {
        if (billingClientImpl.zzf.zzf() != null) {
            billingClientImpl.zzf.zzf().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    private final /* synthetic */ Object zzaA(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            if (!zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
                BillingResult billingResult = zzdc.zzj;
                zzbs(zzjdVar, 3, billingResult);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Please provide a valid purchase token.");
                zzjd zzjdVar2 = zzjd.EMPTY_PURCHASE_TOKEN;
                BillingResult billingResult2 = zzdc.zzg;
                zzbs(zzjdVar2, 3, billingResult2);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            } else if (this.zzp) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar != null) {
                    String packageName = this.zzg.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long longValue = this.zzJ.longValue();
                    int i4 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    Bundle zzd = zzapVar.zzd(9, packageName, purchaseToken, bundle);
                    acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzdc.zza(com.google.android.gms.internal.play_billing.zzc.zzb(zzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzc.zzk(zzd, "BillingClient")));
                    return null;
                }
                zzaP(acknowledgePurchaseResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzjd zzjdVar3 = zzjd.API_VERSION_NOT_V9;
                BillingResult billingResult3 = zzdc.zza;
                zzbs(zzjdVar3, 3, billingResult3);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
            }
            return null;
        } catch (DeadObjectException e4) {
            zzaP(acknowledgePurchaseResponseListener, zzdc.zzj, zzjd.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e4);
            return null;
        } catch (Exception e5) {
            zzaP(acknowledgePurchaseResponseListener, zzdc.zzh, zzjd.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e5);
            return null;
        }
    }

    private final /* synthetic */ Object zzaB(BillingConfigResponseListener billingConfigResponseListener) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Service disconnected.");
                zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
                BillingResult billingResult = zzdc.zzj;
                zzbs(zzjdVar, 13, billingResult);
                billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            } else if (this.zzv) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaY(billingConfigResponseListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = this.zzg.getPackageName();
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long longValue = this.zzJ.longValue();
                    int i4 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    zzapVar.zzo(18, packageName, bundle, new zzca(billingConfigResponseListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support get billing config.");
                zzjd zzjdVar2 = zzjd.GET_BILLING_CONFIG_NOT_SUPPORTED;
                BillingResult billingResult2 = zzdc.zzy;
                zzbs(zzjdVar2, 13, billingResult2);
                billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            }
        } catch (DeadObjectException e4) {
            zzaY(billingConfigResponseListener, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e4);
        } catch (Exception e5) {
            zzaY(billingConfigResponseListener, zzdc.zzh, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e5);
        }
        return null;
    }

    private final /* synthetic */ Object zzaC(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzbb(-1, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzs(12, this.zzg.getPackageName(), bundle, new zzcf(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e4) {
            zzbb(-1, zzjd.SERVICE_CALL_EXCEPTION, e4);
        } catch (Exception e5) {
            zzbb(6, zzjd.SERVICE_CALL_EXCEPTION, e5);
        }
        return null;
    }

    private final String zzaD(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zzg.getPackageName();
        }
        return null;
    }

    private static String zzaE() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private final /* synthetic */ Void zzaF(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzk(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzbx(alternativeBillingOnlyReportingDetailsListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support alternative billing only.");
                zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzC, zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e4) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjd.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e4);
        } catch (Exception e5) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzh, zzjd.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e5);
        }
        return null;
    }

    private final /* synthetic */ Void zzaG(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingProgramReportingDetailsParams billingProgramReportingDetailsParams) {
        BillingProgramReportingDetailsListener billingProgramReportingDetailsListener2;
        BillingProgramReportingDetailsListener billingProgramReportingDetailsListener3;
        RuntimeException runtimeException;
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
        } catch (DeadObjectException e4) {
            e = e4;
            billingProgramReportingDetailsListener3 = billingProgramReportingDetailsListener;
        } catch (RuntimeException e5) {
            e = e5;
            billingProgramReportingDetailsListener2 = billingProgramReportingDetailsListener;
        }
        try {
            if (!zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                zzaU(billingProgramReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzD) {
                synchronized (this.zza) {
                    try {
                        try {
                            zzapVar = this.zzi;
                        } finally {
                            th = th;
                            while (true) {
                                Throwable th = th;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (DeadObjectException e6) {
                        e = e6;
                        zzaU(billingProgramReportingDetailsListener3, zzdc.zzj, zzjd.SERVICE_CALL_EXCEPTION, r12);
                        return null;
                    } catch (RuntimeException e7) {
                        e = e7;
                        runtimeException = e;
                        zzaU(billingProgramReportingDetailsListener2, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, runtimeException);
                        return null;
                    }
                }
                if (zzapVar == null) {
                    zzaU(billingProgramReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String str = this.zzc;
                    com.google.android.gms.internal.play_billing.zzdy zzb = zzdg.zzb(str, 24, this.zzg, zzdf.CREATE_BILLING_PROGRAM_REPORTING_DETAILS_ASYNC.zza());
                    zzhu zza = zzhx.zza();
                    zzio zza2 = zziq.zza();
                    zza2.zza(str);
                    zza.zza("PLAY_BILLING_LIBRARY_VERSION", (zziq) zza2.zzi());
                    zzio zza3 = zziq.zza();
                    zza3.zza(this.zzg.getPackageName());
                    zza.zza("CALLING_PACKAGE", (zziq) zza3.zzi());
                    zzio zza4 = zziq.zza();
                    zza4.zza(String.valueOf(billingProgramReportingDetailsParams.getBillingProgram()));
                    zza.zza("BILLING_PROGRAM", (zziq) zza4.zzi());
                    zzio zza5 = zziq.zza();
                    zza5.zza("RESPONSE_FORMAT_PROTO");
                    zza.zza("RESPONSE_FORMAT", (zziq) zza5.zzi());
                    if (billingProgramReportingDetailsParams.getBillingProgram() == 3) {
                        zzio zza6 = zziq.zza();
                        zza6.zza(String.valueOf(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime));
                        zza.zza("APP_INSTALL_TIME_MILLIS", (zziq) zza6.zzi());
                    }
                    zzapVar.zzm(zzdg.zza(zzb, (zzhx) zza.zzi()), new CreateBillingProgramReportingDetailsDelegateToBackendCallback(billingProgramReportingDetailsListener, billingProgramReportingDetailsParams.getBillingProgram(), this.zzh, this.zzm, zzav(), zzJ()));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support the provided billing program.");
                zzaU(billingProgramReportingDetailsListener, zzdc.zzF, zzjd.BILLING_PROGRAM_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e8) {
            DeadObjectException deadObjectException = e8;
            billingProgramReportingDetailsListener3 = billingProgramReportingDetailsListener;
            zzaU(billingProgramReportingDetailsListener3, zzdc.zzj, zzjd.SERVICE_CALL_EXCEPTION, deadObjectException);
            return null;
        } catch (RuntimeException e9) {
            runtimeException = e9;
            billingProgramReportingDetailsListener2 = billingProgramReportingDetailsListener;
            zzaU(billingProgramReportingDetailsListener2, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, runtimeException);
            return null;
        }
        return null;
    }

    private final /* synthetic */ Void zzaH(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzz) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = this.zzg.getPackageName();
                    long j4 = this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime;
                    String str = this.zzc;
                    String str2 = this.zzd;
                    long longValue = this.zzJ.longValue();
                    int i4 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, longValue);
                    bundle.putLong("appInstallTimeMillis", j4);
                    zzapVar.zzl(22, packageName, bundle, new zzby(externalOfferReportingDetailsListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support external offer.");
                zzaV(externalOfferReportingDetailsListener, zzdc.zzt, zzjd.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e4) {
            zzaV(externalOfferReportingDetailsListener, zzdc.zzj, zzjd.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e4);
        } catch (Exception e5) {
            zzaV(externalOfferReportingDetailsListener, zzdc.zzh, zzjd.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e5);
        }
        return null;
    }

    private final /* synthetic */ Void zzaI(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzq(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzcd(alternativeBillingOnlyAvailabilityListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support alternative billing only.");
                zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzC, zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e4) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjd.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e4);
        } catch (Exception e5) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzh, zzjd.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e5);
        }
        return null;
    }

    private final /* synthetic */ Void zzaJ(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i4) {
        BillingClientImpl billingClientImpl;
        BillingProgramAvailabilityListener billingProgramAvailabilityListener2;
        int i5;
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            try {
                if (!zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                    try {
                    } catch (DeadObjectException e4) {
                        e = e4;
                        billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                        i5 = i4;
                        zzaR(billingProgramAvailabilityListener2, i5, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
                        return null;
                    }
                    try {
                        zzaR(billingProgramAvailabilityListener, i4, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
                        return null;
                    } catch (DeadObjectException e5) {
                        e = e5;
                        billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                        i5 = i4;
                        zzaR(billingProgramAvailabilityListener2, i5, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
                        return null;
                    } catch (Exception e6) {
                        e = e6;
                        billingClientImpl = this;
                        billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                        i5 = i4;
                        billingClientImpl.zzaR(billingProgramAvailabilityListener2, i5, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, e);
                        return null;
                    }
                }
                billingClientImpl = this;
                billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
                i5 = i4;
                try {
                    if (!billingClientImpl.zzD) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support the provided billing program.");
                        billingClientImpl.zzaR(billingProgramAvailabilityListener2, i5, zzdc.zzF, zzjd.BILLING_PROGRAM_NOT_SUPPORTED, null);
                        return null;
                    }
                    synchronized (billingClientImpl.zza) {
                        zzapVar = billingClientImpl.zzi;
                    }
                    if (zzapVar == null) {
                        billingClientImpl.zzaR(billingProgramAvailabilityListener2, i5, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String str = billingClientImpl.zzc;
                    com.google.android.gms.internal.play_billing.zzdy zzb = zzdg.zzb(str, 24, billingClientImpl.zzg, zzdf.IS_BILLING_PROGRAM_AVAILABLE_ASYNC.zza());
                    zzhu zza = zzhx.zza();
                    zzio zza2 = zziq.zza();
                    zza2.zza(str);
                    zza.zza("PLAY_BILLING_LIBRARY_VERSION", (zziq) zza2.zzi());
                    zzio zza3 = zziq.zza();
                    zza3.zza(billingClientImpl.zzg.getPackageName());
                    zza.zza("CALLING_PACKAGE", (zziq) zza3.zzi());
                    zzio zza4 = zziq.zza();
                    zza4.zza(String.valueOf(i5));
                    zza.zza("BILLING_PROGRAM", (zziq) zza4.zzi());
                    try {
                        zzapVar.zzm(zzdg.zza(zzb, (zzhx) zza.zzi()), new IsBillingProgramAvailableDelegateToBackendCallback(billingProgramAvailabilityListener2, i5, billingClientImpl.zzh, billingClientImpl.zzm, zzav(), zzJ()));
                        return null;
                    } catch (DeadObjectException e7) {
                        e = e7;
                        billingProgramAvailabilityListener2 = billingProgramAvailabilityListener2;
                        i5 = i5;
                        zzaR(billingProgramAvailabilityListener2, i5, zzdc.zzj, zzjd.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e);
                        return null;
                    } catch (Exception e8) {
                        e = e8;
                        billingProgramAvailabilityListener2 = billingProgramAvailabilityListener2;
                        i5 = i5;
                        billingClientImpl.zzaR(billingProgramAvailabilityListener2, i5, zzdc.zzh, zzjd.SERVICE_CALL_EXCEPTION, e);
                        return null;
                    }
                } catch (DeadObjectException e9) {
                    e = e9;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (DeadObjectException e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            billingClientImpl = this;
            billingProgramAvailabilityListener2 = billingProgramAvailabilityListener;
            i5 = i4;
        }
    }

    private final /* synthetic */ Void zzaK(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        zzch zzchVar = null;
        try {
            if (!zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
                zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzB) {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzapVar.zzr(24, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzce(externalOfferAvailabilityListener, this.zzh, this.zzm, zzchVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support external offer.");
                zzaW(externalOfferAvailabilityListener, zzdc.zzt, zzjd.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e4) {
            zzaW(externalOfferAvailabilityListener, zzdc.zzj, zzjd.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e4);
        } catch (Exception e5) {
            zzaW(externalOfferAvailabilityListener, zzdc.zzh, zzjd.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e5);
        }
        return null;
    }

    private final /* synthetic */ Void zzaL(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzn(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzbz(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e4) {
            zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzj, zzjd.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e4);
        } catch (Exception e5) {
            zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzh, zzjd.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e5);
        }
        return null;
    }

    private final /* synthetic */ Void zzaM(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            if (zzapVar == null) {
                zzaX(externalOfferInformationDialogListener, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, null);
            } else {
                zzapVar.zzp(22, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzJ.longValue()), new zzcb(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e4) {
            zzaX(externalOfferInformationDialogListener, zzdc.zzj, zzjd.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e4);
        } catch (Exception e5) {
            zzaX(externalOfferInformationDialogListener, zzdc.zzh, zzjd.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e5);
        }
        return null;
    }

    private final Future zzaN(Callable callable, long j4, final Runnable runnable, Handler handler) {
        try {
            final Future submit = zzJ().submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzbi
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    runnable2.run();
                }
            }, 28500L);
            return submit;
        } catch (Exception e4) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Async task throws exception!", e4);
            throw e4;
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void zzaO(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        int zza;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.zza) {
                try {
                    try {
                        zzapVar = this.zzi;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (DeadObjectException e4) {
                    e = e4;
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzj, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e5) {
                    e = e5;
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzh, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (zzapVar == null) {
                try {
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e6) {
                    e = e6;
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzj, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e7) {
                    e = e7;
                    zzaS(consumeResponseListener, purchaseToken, zzdc.zzh, zzjd.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.zzp) {
                String packageName = this.zzg.getPackageName();
                boolean z4 = this.zzp;
                String str2 = this.zzc;
                String str3 = this.zzd;
                long longValue = this.zzJ.longValue();
                Bundle bundle = new Bundle();
                if (z4) {
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str2, str3, longValue);
                }
                Bundle zze = zzapVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zzc.zzk(zze, "BillingClient");
            } else {
                zza = zzapVar.zza(3, this.zzg.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult zza2 = zzdc.zza(zza, str);
            if (zza == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
                return;
            }
            zzaS(consumeResponseListener, purchaseToken, zza2, zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + zza, null);
        } catch (DeadObjectException e8) {
            e = e8;
        } catch (Exception e9) {
            e = e9;
        }
    }

    private final void zzaP(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error in acknowledge purchase!", exc);
        zzbu(zzjdVar, 3, billingResult, zzcy.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaQ(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 14, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaR(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i4, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 33, billingResult, zzcy.zza(exc));
        billingProgramAvailabilityListener.onBillingProgramAvailabilityResponse(billingResult, new BillingProgramAvailabilityDetails(i4));
    }

    private final void zzaS(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, zzjd zzjdVar, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str2, exc);
        zzbu(zzjdVar, 4, billingResult, zzcy.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaT(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 15, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaU(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 35, billingResult, zzcy.zza(exc));
        billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaV(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 24, billingResult, zzcy.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaW(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 23, billingResult, zzcy.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaX(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 25, billingResult, zzcy.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    private final void zzaY(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "getBillingConfig got an exception.", exc);
        zzbu(zzjdVar, 13, billingResult, zzcy.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaZ(LaunchExternalLinkResponseListener launchExternalLinkResponseListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 37, billingResult, zzcy.zza(exc));
        launchExternalLinkResponseListener.onLaunchExternalLinkResponse(billingResult);
    }

    static /* bridge */ /* synthetic */ void zzak(BillingClientImpl billingClientImpl, int i4) {
        billingClientImpl.zzm = i4;
        billingClientImpl.zzD = i4 >= 27;
        billingClientImpl.zzC = i4 >= 26;
        billingClientImpl.zzB = i4 >= 24;
        billingClientImpl.zzA = i4 >= 23;
        billingClientImpl.zzz = i4 >= 22;
        billingClientImpl.zzy = i4 >= 21;
        billingClientImpl.zzx = i4 >= 20;
        billingClientImpl.zzw = i4 >= 19;
        billingClientImpl.zzv = i4 >= 18;
        billingClientImpl.zzu = i4 >= 17;
        billingClientImpl.zzt = i4 >= 16;
        billingClientImpl.zzs = i4 >= 15;
        billingClientImpl.zzr = i4 >= 14;
        billingClientImpl.zzq = i4 >= 12;
        billingClientImpl.zzp = i4 >= 9;
        billingClientImpl.zzo = i4 >= 8;
        billingClientImpl.zzn = i4 >= 6;
    }

    static /* bridge */ /* synthetic */ void zzam(BillingClientImpl billingClientImpl, int i4) {
        if (i4 != 0) {
            billingClientImpl.zzbg(0);
            return;
        }
        synchronized (billingClientImpl.zza) {
            try {
                if (billingClientImpl.zzb == 3) {
                    return;
                }
                billingClientImpl.zzbg(2);
                zzab zzabVar = billingClientImpl.zzf != null ? billingClientImpl.zzf : null;
                if (zzabVar != null) {
                    zzabVar.zzi(billingClientImpl.zzy);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzaq(BillingClientImpl billingClientImpl) {
        boolean z4;
        synchronized (billingClientImpl.zza) {
            z4 = true;
            if (billingClientImpl.zzb != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzat(int i4, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            return zzapVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL) : zzapVar.zzg(i4, this.zzg.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e4) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzj, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e4));
        } catch (Exception e5) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzh, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzau(String str, String str2) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        try {
            synchronized (this.zza) {
                zzapVar = this.zzi;
            }
            return zzapVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL) : zzapVar.zzf(3, this.zzg.getPackageName(), str, str2, null);
        } catch (DeadObjectException e4) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzj, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e4));
        } catch (Exception e5) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzh, zzjd.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzav() {
        return Looper.myLooper() == null ? this.zze : new Handler(Looper.myLooper());
    }

    private final zzcg zzaw(BillingResult billingResult, zzjd zzjdVar, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str, exc);
        zzbu(zzjdVar, 7, billingResult, zzcy.zza(exc));
        return new zzcg(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList(), new ArrayList());
    }

    private final BillingResult zzax(int i4) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
        zziy zza = zzja.zza();
        zza.zze(6);
        zzks zza2 = zzku.zza();
        zza2.zze(true);
        zza2.zza(i4 > 0);
        zza2.zzb(i4);
        zza.zzd(zza2);
        zzbe((zzja) zza.zzi());
        return zzdc.zzi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzay() {
        int[] iArr = {0, 3};
        synchronized (this.zza) {
            for (int i4 = 0; i4 < 2; i4++) {
                if (this.zzb == iArr[i4]) {
                    return zzdc.zzj;
                }
            }
            return zzdc.zzh;
        }
    }

    private final com.google.android.gms.internal.play_billing.zzdc zzaz(final int i4) {
        if (this.zzF && !zzbm()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzad
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    return BillingClientImpl.zzr(BillingClientImpl.this, i4, zzpVar);
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Already connected or not opted into auto reconnection.");
        return com.google.android.gms.internal.play_billing.zzcx.zza(zzdc.zzi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzba(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, zzjd zzjdVar, Exception exc) {
        zzbu(zzjdVar, 16, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    private final void zzbb(int i4, zzjd zzjdVar, Exception exc) {
        zziw zziwVar;
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "showInAppMessages error.", exc);
        zzcz zzczVar = this.zzh;
        String zza = zzcy.zza(exc);
        try {
            zzjb zza2 = zzjf.zza();
            zza2.zzp(i4);
            if (zzjdVar != null) {
                zza2.zze(zzjdVar);
            }
            if (zza != null) {
                zza2.zza(zza);
            }
            zziu zza3 = zziw.zza();
            zza3.zzb(zza2);
            zza3.zzp(30);
            zziwVar = (zziw) zza3.zzi();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", th);
            zziwVar = null;
        }
        zzczVar.zza(zziwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbc(zziw zziwVar) {
        try {
            this.zzh.zzb(zziwVar, this.zzm);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbd(zziw zziwVar, long j4, boolean z4) {
        try {
            this.zzh.zze(zziwVar, this.zzm, j4, z4);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbe(zzja zzjaVar) {
        try {
            this.zzh.zzg(zzjaVar, this.zzm);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbf(zzjd zzjdVar, BillingResult billingResult, int i4) {
        try {
            int i5 = zzcy.zza;
            zziu zziuVar = (zziu) zzcy.zzb(zzjdVar, 6, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED).zzq();
            zzks zza = zzku.zza();
            zza.zza(i4 > 0);
            zza.zzb(i4);
            zziuVar.zze(zza);
            zzbc((zziw) zziuVar.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbg(int i4) {
        synchronized (this.zza) {
            try {
                if (this.zzb == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Setting clientState from " + zzbn(this.zzb) + " to " + zzbn(i4));
                this.zzb = i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzbh() {
        ExecutorService executorService = this.zzI;
        if (executorService != null) {
            executorService.shutdownNow();
            this.zzI = null;
        }
    }

    private final void zzbi(BillingClientStateListener billingClientStateListener, int i4) {
        zzjd zzjdVar;
        BillingResult billingResult;
        BillingResult billingResult2;
        synchronized (this.zza) {
            try {
                if (zzbm()) {
                    billingResult = zzax(i4);
                } else {
                    if (this.zzb == 1) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzjd zzjdVar2 = zzjd.BILLING_CLIENT_CONNECTING;
                        billingResult2 = zzdc.zzd;
                        zzbf(zzjdVar2, billingResult2, i4);
                    } else if (this.zzb == 3) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzjd zzjdVar3 = zzjd.BILLING_CLIENT_CLOSED;
                        billingResult2 = zzdc.zzj;
                        zzbf(zzjdVar3, billingResult2, i4);
                    } else {
                        zzbg(1);
                        if (i4 == 0) {
                            this.zzH = billingClientStateListener;
                            i4 = 0;
                        }
                        zzbj();
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Starting in-app billing setup.");
                        this.zzj = new zzbw(this, billingClientStateListener, i4, null);
                        this.zzj.zzc();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.zzg.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            zzjdVar = zzjd.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzjdVar = zzjd.INVALID_PHONESKY_PACKAGE;
                                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.zzc);
                                    synchronized (this.zza) {
                                        try {
                                            if (this.zzb == 2) {
                                                billingResult = zzax(i4);
                                            } else if (this.zzb != 1) {
                                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzjd zzjdVar4 = zzjd.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                billingResult2 = zzdc.zzj;
                                                zzbf(zzjdVar4, billingResult2, i4);
                                            } else {
                                                zzbw zzbwVar = this.zzj;
                                                if ((i4 <= 0 || Build.VERSION.SDK_INT < 29) ? this.zzg.bindService(intent2, zzbwVar, 1) : this.zzg.bindService(intent2, 1, zzJ(), zzbwVar)) {
                                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service was bonded successfully.");
                                                    billingResult = null;
                                                } else {
                                                    zzjdVar = zzjd.BILLING_SERVICE_BLOCKED;
                                                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                zzjdVar = zzjd.INVALID_PHONESKY_PACKAGE;
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        zzbg(0);
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service unavailable on device.");
                        BillingResult billingResult3 = zzdc.zzb;
                        zzbf(zzjdVar, billingResult3, i4);
                        billingResult = billingResult3;
                    }
                    billingResult = billingResult2;
                }
            } finally {
            }
        }
        if (billingResult != null) {
            billingClientStateListener.onBillingSetupFinished(billingResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzbj() {
        synchronized (this.zza) {
            if (this.zzj != null) {
                try {
                    this.zzg.unbindService(this.zzj);
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while unbinding service!", th);
                        this.zzi = null;
                        this.zzj = null;
                    } finally {
                        this.zzi = null;
                        this.zzj = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzbk(long j4) {
        try {
            BillingResult billingResult = (BillingResult) zzaz(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            }
        } catch (Exception e4) {
            if (e4 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error during reconnection attempt: ", e4);
        }
        return zzbm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzbl(long j4) {
        long max;
        com.google.android.gms.internal.play_billing.zzbl zzb = com.google.android.gms.internal.play_billing.zzbl.zzb(this.zzK);
        long j5 = 30000;
        for (int i4 = 1; i4 <= 3; i4++) {
            try {
                max = Math.max(0L, j5);
            } catch (Exception e4) {
                if (e4 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error during reconnection attempt: ", e4);
            }
            if (max <= 0) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "No time remaining for reconnection attempt.");
                return zzbm();
            }
            BillingResult billingResult = (BillingResult) zzaz(i4).get(max, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                return zzbm();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j5 = UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS - zzb.zza(timeUnit);
            long pow = ((long) Math.pow(2.0d, i4 - 1)) * 1000;
            if (j5 < pow) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed due to timeout limit reached.");
                return zzbm();
            }
            if (i4 < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j5 = UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS - zzb.zza(timeUnit);
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error sleeping during reconnection attempt: ", e5);
                }
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Max retries reached.");
        return zzbm();
    }

    private final boolean zzbm() {
        boolean z4;
        synchronized (this.zza) {
            try {
                z4 = false;
                if (this.zzb == 2 && this.zzi != null && this.zzj != null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    private static final String zzbn(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private static final void zzbo(zzjp zzjpVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                zzjpVar.zzv((int) (memoryInfo.totalMem / 1048576));
                zzjpVar.zzr(Build.BRAND);
                zzjpVar.zzu(Build.MODEL);
                zzjpVar.zzt(Build.MANUFACTURER);
                zzjpVar.zzs(Build.FINGERPRINT);
            }
        } catch (RuntimeException e4) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Runtime error while populating device info.", e4);
        }
    }

    private final zzdz zzbp(int i4, BillingResult billingResult, zzjd zzjdVar, String str, Exception exc) {
        zzbu(zzjdVar, 9, billingResult, zzcy.zza(exc));
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str, exc);
        return new zzdz(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzdz zzbq(String str, boolean z4, int i4) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        int i5;
        int i6;
        Bundle zzi;
        BillingResult build;
        zzjd zzjdVar;
        BillingClientImpl billingClientImpl = this;
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z5 = billingClientImpl.zzp;
        boolean z6 = billingClientImpl.zzw;
        boolean isEnabledForOneTimeProducts = billingClientImpl.zzE.isEnabledForOneTimeProducts();
        boolean isEnabledForPrepaidPlans = billingClientImpl.zzE.isEnabledForPrepaidPlans();
        long longValue = billingClientImpl.zzJ.longValue();
        Bundle bundle = new Bundle();
        com.google.android.gms.internal.play_billing.zzc.zzc(bundle, billingClientImpl.zzc, billingClientImpl.zzd, longValue);
        if (z5 && isEnabledForOneTimeProducts) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z6 && isEnabledForPrepaidPlans) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z4) {
            bundle.putBoolean("includeSuspendedSubscriptions", true);
        }
        String str2 = null;
        do {
            try {
                synchronized (billingClientImpl.zza) {
                    zzapVar = billingClientImpl.zzi;
                }
                if (zzapVar == null) {
                    return billingClientImpl.zzbp(9, zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null", null);
                }
                if (z4 && !billingClientImpl.zzC) {
                    return billingClientImpl.zzbp(9, zzdc.zzw, zzjd.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, "Include suspended subscriptions is not supported", null);
                }
                if (billingClientImpl.zzp) {
                    if (billingClientImpl.zzC) {
                        i6 = 26;
                    } else if (billingClientImpl.zzB) {
                        i6 = 24;
                    } else if (billingClientImpl.zzw) {
                        i6 = 19;
                    } else {
                        i5 = 9;
                        zzi = zzapVar.zzi(i5, billingClientImpl.zzg.getPackageName(), str, str2, bundle);
                    }
                    i5 = i6;
                    zzi = zzapVar.zzi(i5, billingClientImpl.zzg.getPackageName(), str, str2, bundle);
                } else {
                    zzi = zzapVar.zzh(3, billingClientImpl.zzg.getPackageName(), str, str2);
                }
                BillingResult billingResult = zzdc.zzh;
                if (zzi == null) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                    zzjdVar = zzjd.NULL_OWNED_ITEMS_LIST;
                } else {
                    int zzb = com.google.android.gms.internal.play_billing.zzc.zzb(zzi, "BillingClient");
                    String zzk = com.google.android.gms.internal.play_billing.zzc.zzk(zzi, "BillingClient");
                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                    newBuilder.setResponseCode(zzb);
                    newBuilder.setDebugMessage(zzk);
                    build = newBuilder.build();
                    if (zzb != 0) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(zzb)));
                        zzjdVar = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    } else if (zzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && zzi.containsKey("INAPP_PURCHASE_DATA_LIST") && zzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                            zzjdVar = zzjd.NULL_SKUS_LIST;
                        } else if (stringArrayList2 == null) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                            zzjdVar = zzjd.NULL_PURCHASES_LIST;
                        } else if (stringArrayList3 == null) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                            zzjdVar = zzjd.NULL_SIGNATURES_LIST;
                        } else {
                            build = zzdc.zzi;
                            zzjdVar = zzjd.REASON_UNSPECIFIED;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                        zzjdVar = zzjd.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (build == zzdc.zzi) {
                        return billingClientImpl.zzbp(9, build, zzjdVar, "Purchase bundle invalid", null);
                    }
                    ArrayList<String> stringArrayList4 = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    boolean z7 = false;
                    for (int i7 = 0; i7 < stringArrayList5.size(); i7++) {
                        String str3 = stringArrayList5.get(i7);
                        String str4 = stringArrayList6.get(i7);
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i7))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "BUG: empty/null token!");
                                z7 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e4) {
                            return zzbp(9, zzdc.zzh, zzjd.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e4);
                        }
                    }
                    billingClientImpl = this;
                    if (z7) {
                        billingClientImpl.zzbs(zzjd.EMPTY_PURCHASE_TOKEN, 9, billingResult);
                    }
                    str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                }
                build = billingResult;
                if (build == zzdc.zzi) {
                }
            } catch (DeadObjectException e5) {
                return zzbp(9, zzdc.zzj, zzjd.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e5);
            } catch (Exception e6) {
                return billingClientImpl.zzbp(9, zzdc.zzh, zzjd.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e6);
            }
        } while (!TextUtils.isEmpty(str2));
        return new zzdz(zzdc.zzi, arrayList);
    }

    private final void zzbr(BillingResult billingResult, zzjd zzjdVar, int i4) {
        zzja zzjaVar = null;
        zziw zziwVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i5 = zzcy.zza;
            try {
                zziy zza = zzja.zza();
                zza.zze(5);
                zzjv zza2 = zzjy.zza();
                zza2.zza(i4);
                zza.zzb((zzjy) zza2.zzi());
                zzjaVar = (zzja) zza.zzi();
            } catch (Exception e4) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e4);
            }
            zzbe(zzjaVar);
            return;
        }
        int i6 = zzcy.zza;
        try {
            zziu zza3 = zziw.zza();
            zzjb zza4 = zzjf.zza();
            zza4.zzp(billingResult.getResponseCode());
            zza4.zzb(billingResult.getDebugMessage());
            zza4.zze(zzjdVar);
            zza3.zzb(zza4);
            zza3.zzp(5);
            zzjv zza5 = zzjy.zza();
            zza5.zza(i4);
            zza3.zzc((zzjy) zza5.zzi());
            zziwVar = (zziw) zza3.zzi();
        } catch (Exception e5) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e5);
        }
        zzbc(zziwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbs(zzjd zzjdVar, int i4, BillingResult billingResult) {
        try {
            int i5 = zzcy.zza;
            zzbc(zzcy.zzb(zzjdVar, i4, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbt(zzjd zzjdVar, int i4, BillingResult billingResult, long j4) {
        try {
            int i5 = zzcy.zza;
            try {
                this.zzh.zzc(zzcy.zzb(zzjdVar, 2, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.zzm, j4);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbu(zzjd zzjdVar, int i4, BillingResult billingResult, String str) {
        try {
            int i5 = zzcy.zza;
            zzbc(zzcy.zzb(zzjdVar, i4, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbv(zzjd zzjdVar, int i4, BillingResult billingResult, long j4, boolean z4) {
        try {
            int i5 = zzcy.zza;
            zzbd(zzcy.zzb(zzjdVar, 2, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), j4, z4);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbw(zzjd zzjdVar, int i4, BillingResult billingResult, String str, long j4, boolean z4) {
        try {
            int i5 = zzcy.zza;
            zzbd(zzcy.zzb(zzjdVar, 2, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED), j4, z4);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private void zzbx(int i4) {
        try {
            int i5 = zzcy.zza;
            zzbe(zzcy.zzc(i4, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    static /* bridge */ /* synthetic */ ResultReceiver zzg(BillingClientImpl billingClientImpl, LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        return new zzbt(billingClientImpl, billingClientImpl.zze, launchExternalLinkResponseListener);
    }

    static /* bridge */ /* synthetic */ BillingResult zzm(Exception exc) {
        return exc instanceof DeadObjectException ? zzdc.zzj : zzdc.zzh;
    }

    public static /* synthetic */ Object zzr(BillingClientImpl billingClientImpl, int i4, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        billingClientImpl.zzbi(new zzbs(billingClientImpl, zzpVar), i4);
        return "reconnectIfNeeded";
    }

    public static /* synthetic */ Object zzs(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        if (billingClientImpl.zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
            billingClientImpl.zzaO(consumeParams, consumeResponseListener);
            return null;
        }
        zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
        BillingResult billingResult = zzdc.zzj;
        billingClientImpl.zzbs(zzjdVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        return null;
    }

    public static /* synthetic */ Object zzt(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener, QueryProductDetailsParams queryProductDetailsParams) {
        if (!billingClientImpl.zzbl(UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            billingClientImpl.zzbs(zzjdVar, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
            return null;
        }
        if (billingClientImpl.zzu) {
            zzcg zzh = billingClientImpl.zzh(queryProductDetailsParams);
            productDetailsResponseListener.onProductDetailsResponse(zzdc.zza(zzh.zza(), zzh.zzb()), new QueryProductDetailsResult(zzh.zzc(), zzh.zzd()));
            return null;
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Querying product details is not supported.");
        zzjd zzjdVar2 = zzjd.PRODUCT_DETAILS_NOT_SUPPORTED;
        BillingResult billingResult2 = zzdc.zzr;
        billingClientImpl.zzbs(zzjdVar2, 7, billingResult2);
        productDetailsResponseListener.onProductDetailsResponse(billingResult2, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
        return null;
    }

    public static /* synthetic */ Object zzu(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) {
        billingClientImpl.zzaA(acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
        return null;
    }

    public static /* synthetic */ Object zzv(BillingClientImpl billingClientImpl, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        billingClientImpl.zzaC(bundle, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Object zzw(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) {
        billingClientImpl.zzaB(billingConfigResponseListener);
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzu(BillingClientImpl.this, acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzR(BillingClientImpl.this, acknowledgePurchaseResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, zzay);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzay);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzba
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzs(BillingClientImpl.this, consumeResponseListener, consumeParams);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzbb
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzL(BillingClientImpl.this, consumeResponseListener, consumeParams);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, zzay);
            consumeResponseListener.onConsumeResponse(zzay, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzau
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzG(BillingClientImpl.this, alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzav
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaT(alternativeBillingOnlyReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaT(alternativeBillingOnlyReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createBillingProgramReportingDetailsAsync(final BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, final BillingProgramReportingDetailsListener billingProgramReportingDetailsListener) {
        try {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            zzaN(new Callable() { // from class: com.android.billingclient.api.zzao
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.zzH(BillingClientImpl.this, billingProgramReportingDetailsListener, billingProgramReportingDetailsParams);
                    return null;
                }
            }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzap
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzaU(billingProgramReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, zzav());
        } catch (Exception e5) {
            e = e5;
            zzaU(billingProgramReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, e);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzE(BillingClientImpl.this, externalOfferReportingDetailsListener);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaV(externalOfferReportingDetailsListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaV(externalOfferReportingDetailsListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        zzbx(12);
        synchronized (this.zza) {
            try {
                if (this.zzf != null) {
                    this.zzf.zzh();
                }
            } finally {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unbinding from service.");
                zzbj();
                zzbh();
                zzbg(3);
                this.zzH = null;
            }
            try {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unbinding from service.");
                zzbj();
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
            }
            try {
                zzbh();
                zzbg(3);
            } catch (Throwable th2) {
                try {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                    zzbg(3);
                } catch (Throwable th3) {
                    zzbg(3);
                    this.zzH = null;
                    throw th3;
                }
            }
            this.zzH = null;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzw(BillingClientImpl.this, billingConfigResponseListener);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzar
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzN(BillingClientImpl.this, billingConfigResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 13, zzay);
            billingConfigResponseListener.onBillingConfigResponse(zzay, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i4;
        synchronized (this.zza) {
            i4 = this.zzb;
        }
        return i4;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzax
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzI(BillingClientImpl.this, alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzay
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaQ(alternativeBillingOnlyAvailabilityListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaQ(alternativeBillingOnlyAvailabilityListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isBillingProgramAvailableAsync(final int i4, final BillingProgramAvailabilityListener billingProgramAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzC(BillingClientImpl.this, billingProgramAvailabilityListener, i4);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaR(billingProgramAvailabilityListener, i4, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaR(billingProgramAvailabilityListener, i4, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzB(BillingClientImpl.this, externalOfferAvailabilityListener);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaW(externalOfferAvailabilityListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzav(), zzJ()) == null) {
            zzaW(externalOfferAvailabilityListener, zzay(), zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        char c4;
        BillingResult billingResult;
        if (!zzbk(3000L)) {
            billingResult = zzdc.zzj;
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            if (billingResult.getResponseCode() != 0) {
                zzbs(zzjdVar, 5, billingResult);
                return billingResult;
            }
            zzbx(5);
            return billingResult;
        }
        int i4 = zzdc.zzI;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 102279:
                if (str.equals(BillingClient.FeatureType.BILLING_CONFIG)) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 105258:
                if (str.equals(BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 106251:
                if (str.equals(BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case 107244:
                if (str.equals("lll")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 108237:
                if (str.equals("mmm")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case 109230:
                if (str.equals(BillingClient.FeatureType.INCLUDE_SUSPENDED_SUBSCRIPTIONS)) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                BillingResult billingResult2 = this.zzk ? zzdc.zzi : zzdc.zzl;
                zzbr(billingResult2, zzjd.SUBSCRIPTIONS_NOT_SUPPORTED, 2);
                break;
            case 1:
                BillingResult billingResult3 = this.zzl ? zzdc.zzi : zzdc.zzm;
                zzbr(billingResult3, zzjd.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED, 3);
                break;
            case 2:
                BillingResult billingResult4 = this.zzo ? zzdc.zzi : zzdc.zzn;
                zzbr(billingResult4, zzjd.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED, 4);
                break;
            case 3:
                BillingResult billingResult5 = this.zzq ? zzdc.zzi : zzdc.zzs;
                zzbr(billingResult5, zzjd.IN_APP_MESSAGE_NOT_SUPPORTED, 5);
                break;
            case 4:
                BillingResult billingResult6 = this.zzs ? zzdc.zzi : zzdc.zzo;
                zzbr(billingResult6, zzjd.CROSS_APP_NOT_SUPPORTED, 6);
                break;
            case 5:
                BillingResult billingResult7 = this.zzr ? zzdc.zzi : zzdc.zzq;
                zzbr(billingResult7, zzjd.OFFER_ID_TOKEN_NOT_SUPPORTED, 7);
                break;
            case 6:
                BillingResult billingResult8 = this.zzt ? zzdc.zzi : zzdc.zzp;
                zzbr(billingResult8, zzjd.MULTI_ITEM_NOT_SUPPORTED, 8);
                break;
            case 7:
                BillingResult billingResult9 = this.zzt ? zzdc.zzi : zzdc.zzp;
                zzbr(billingResult9, zzjd.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED, 9);
                break;
            case '\b':
                BillingResult billingResult10 = this.zzu ? zzdc.zzi : zzdc.zzr;
                zzbr(billingResult10, zzjd.PRODUCT_DETAILS_NOT_SUPPORTED, 10);
                break;
            case '\t':
                BillingResult billingResult11 = this.zzv ? zzdc.zzi : zzdc.zzy;
                zzbr(billingResult11, zzjd.GET_BILLING_CONFIG_NOT_SUPPORTED, 11);
                break;
            case '\n':
                BillingResult billingResult12 = this.zzv ? zzdc.zzi : zzdc.zzz;
                zzbr(billingResult12, zzjd.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED, 12);
                break;
            case 11:
                BillingResult billingResult13 = this.zzx ? zzdc.zzi : zzdc.zzB;
                zzbr(billingResult13, zzjd.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED, 13);
                break;
            case '\f':
                BillingResult billingResult14 = this.zzy ? zzdc.zzi : zzdc.zzC;
                zzbr(billingResult14, zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, 14);
                break;
            case '\r':
                BillingResult billingResult15 = this.zzB ? zzdc.zzi : zzdc.zzt;
                zzbr(billingResult15, zzjd.EXTERNAL_OFFER_NOT_SUPPORTED, 18);
                break;
            case 14:
                BillingResult billingResult16 = this.zzA ? zzdc.zzi : zzdc.zzu;
                zzbr(billingResult16, zzjd.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED, 19);
                break;
            case 15:
                BillingResult billingResult17 = this.zzB ? zzdc.zzi : zzdc.zzv;
                zzbr(billingResult17, zzjd.AUTO_PAY_NOT_SUPPORTED, 20);
                break;
            case 16:
                BillingResult billingResult18 = this.zzC ? zzdc.zzi : zzdc.zzw;
                zzbr(billingResult18, zzjd.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, 21);
                break;
            default:
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unsupported feature: ".concat(str));
                BillingResult billingResult19 = zzdc.zzx;
                zzbr(billingResult19, zzjd.UNKNOWN_FEATURE, 1);
                break;
        }
        return billingResult;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        if (this.zzF) {
            return true;
        }
        return zzbm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038b  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        boolean zzd;
        String productId;
        String productType;
        Activity activity2;
        long j4;
        String str;
        Future zzK;
        long j5;
        long j6;
        long j7;
        zzjd zzjdVar;
        int i4;
        String str2;
        int i5;
        String str3;
        Intent intent;
        String str4;
        long nextLong = new Random().nextLong();
        if (this.zzf == null || this.zzf.zzf() == null) {
            zzjd zzjdVar2 = zzjd.MISSING_LISTENER;
            BillingResult billingResult = zzdc.zzD;
            zzbt(zzjdVar2, 2, billingResult, nextLong);
            return billingResult;
        }
        if (billingFlowParams.getDeveloperBillingOptionParams() != null && this.zzf.zzd() == null) {
            zzjd zzjdVar3 = zzjd.MISSING_DEVELOPER_PROVIDED_BILLING_LISTENER;
            BillingResult billingResult2 = zzdc.zzH;
            zzbt(zzjdVar3, 2, billingResult2, nextLong);
            return billingResult2;
        }
        if (!zzbk(3000L)) {
            zzjd zzjdVar4 = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult3 = zzdc.zzj;
            zzbt(zzjdVar4, 2, billingResult3, nextLong);
            zzn(billingResult3);
            return billingResult3;
        }
        synchronized (this.zza) {
            try {
                zzd = this.zzj != null ? this.zzj.zzd() : false;
            } finally {
            }
        }
        ArrayList zzj = billingFlowParams.zzj();
        List zzk = billingFlowParams.zzk();
        SkuDetails skuDetails = (SkuDetails) com.google.android.gms.internal.play_billing.zzcb.zza(zzj, null);
        BillingFlowParams.ProductDetailsParams productDetailsParams = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzcb.zza(zzk, null);
        if (skuDetails != null) {
            productId = skuDetails.getSku();
            productType = skuDetails.getType();
        } else {
            productId = productDetailsParams.zza().getProductId();
            productType = productDetailsParams.zza().getProductType();
        }
        final String str5 = productId;
        final String str6 = productType;
        if (str6.equals("subs") && !this.zzk) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support subscriptions.");
            zzjd zzjdVar5 = zzjd.SUBSCRIPTIONS_NOT_SUPPORTED;
            BillingResult billingResult4 = zzdc.zzl;
            zzbv(zzjdVar5, 2, billingResult4, nextLong, zzd);
            zzn(billingResult4);
            return billingResult4;
        }
        if (billingFlowParams.zzu() && !this.zzn) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support extra params for buy intent.");
            zzjd zzjdVar6 = zzjd.EXTRA_PARAMS_NOT_SUPPORTED;
            BillingResult billingResult5 = zzdc.zzf;
            zzbv(zzjdVar6, 2, billingResult5, nextLong, zzd);
            zzn(billingResult5);
            return billingResult5;
        }
        if (zzj.size() > 1 && !this.zzt) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support multi-item purchases.");
            zzjd zzjdVar7 = zzjd.MULTI_ITEM_NOT_SUPPORTED;
            BillingResult billingResult6 = zzdc.zzp;
            zzbv(zzjdVar7, 2, billingResult6, nextLong, zzd);
            zzn(billingResult6);
            return billingResult6;
        }
        if (!zzk.isEmpty() && !this.zzu) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzjd zzjdVar8 = zzjd.PRODUCT_DETAILS_NOT_SUPPORTED;
            BillingResult billingResult7 = zzdc.zzr;
            zzbv(zzjdVar8, 2, billingResult7, nextLong, zzd);
            zzn(billingResult7);
            return billingResult7;
        }
        BillingResult zzd2 = billingFlowParams.zzd();
        if (zzd2 != zzdc.zzi) {
            zzbv(zzjd.INVALID_BILLING_FLOW_PARAMS, 2, zzd2, nextLong, zzd);
            zzn(zzd2);
            return zzd2;
        }
        boolean z4 = zzd;
        if (this.zzn) {
            int i6 = 1;
            j4 = nextLong;
            String str7 = null;
            final Bundle zzf = com.google.android.gms.internal.play_billing.zzc.zzf(billingFlowParams, this.zzp, this.zzw, this.zzE.isEnabledForOneTimeProducts(), this.zzE.isEnabledForPrepaidPlans(), this.zzG, this.zzc, this.zzd, this.zzJ.longValue(), this.zzg.getPackageName(), j4);
            if (zzj.isEmpty()) {
                i4 = 1;
                str2 = null;
                ArrayList<String> arrayList = new ArrayList<>(zzk.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(zzk.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i7 = 0; i7 < zzk.size(); i7++) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) zzk.get(i7);
                    ProductDetails zza = productDetailsParams2.zza();
                    if (!zza.zzb().isEmpty()) {
                        arrayList3.add(zza.zzb());
                    }
                    String zzb = productDetailsParams2.zzb();
                    arrayList4.add(zzb);
                    String zzc = zza.zzc(zzb);
                    if (!TextUtils.isEmpty(zzc)) {
                        arrayList5.add(zzc);
                    }
                    if (i7 > 0) {
                        arrayList.add(((BillingFlowParams.ProductDetailsParams) zzk.get(i7)).zza().getProductId());
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) zzk.get(i7)).zza().getProductType());
                    }
                }
                zzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList6.isEmpty()) {
                    zzf.putIntegerArrayList("autoPayBalanceThresholdList", arrayList6);
                }
                if (!arrayList3.isEmpty()) {
                    zzf.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    zzf.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    zzf.putStringArrayList("additionalSkus", arrayList);
                    zzf.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                ArrayList<String> arrayList11 = new ArrayList<>();
                int size = zzj.size();
                int i8 = 0;
                boolean z5 = false;
                boolean z6 = false;
                int i9 = 0;
                boolean z7 = false;
                while (i8 < size) {
                    Object obj = zzj.get(i8);
                    int i10 = i8 + 1;
                    SkuDetails skuDetails2 = (SkuDetails) obj;
                    if (skuDetails2.zzf().isEmpty()) {
                        str4 = str7;
                    } else {
                        str4 = str7;
                        arrayList7.add(skuDetails2.zzf());
                    }
                    String zzc2 = skuDetails2.zzc();
                    int i11 = i6;
                    String zzb2 = skuDetails2.zzb();
                    int zza2 = skuDetails2.zza();
                    String zze = skuDetails2.zze();
                    arrayList8.add(zzc2);
                    z5 |= !TextUtils.isEmpty(zzc2);
                    arrayList9.add(zzb2);
                    z6 |= !TextUtils.isEmpty(zzb2);
                    arrayList10.add(Integer.valueOf(zza2));
                    i9 |= zza2 != 0 ? i11 : 0;
                    z7 |= !TextUtils.isEmpty(zze);
                    arrayList11.add(zze);
                    str7 = str4;
                    i6 = i11;
                    i8 = i10;
                }
                int i12 = i6;
                str2 = str7;
                if (!arrayList7.isEmpty()) {
                    zzf.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (z5) {
                    zzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                }
                if (z6) {
                    zzf.putStringArrayList("SKU_OFFER_ID_LIST", arrayList9);
                }
                if (i9 != 0) {
                    zzf.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList10);
                }
                if (z7) {
                    zzf.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList11);
                }
                i4 = i12;
                if (zzj.size() > i4) {
                    ArrayList<String> arrayList12 = new ArrayList<>(zzj.size() - 1);
                    ArrayList<String> arrayList13 = new ArrayList<>(zzj.size() - 1);
                    for (int i13 = i4; i13 < zzj.size(); i13++) {
                        arrayList12.add(((SkuDetails) zzj.get(i13)).getSku());
                        arrayList13.add(((SkuDetails) zzj.get(i13)).getType());
                    }
                    zzf.putStringArrayList("additionalSkus", arrayList12);
                    zzf.putStringArrayList("additionalSkuTypes", arrayList13);
                }
            }
            if (zzf.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.zzr) {
                zzjd zzjdVar9 = zzjd.OFFER_ID_TOKEN_NOT_SUPPORTED;
                BillingResult billingResult8 = zzdc.zzq;
                zzbv(zzjdVar9, 2, billingResult8, j4, z4);
                zzn(billingResult8);
                return billingResult8;
            }
            if (skuDetails != null && !TextUtils.isEmpty(skuDetails.zzd())) {
                zzf.putString("skuPackageName", skuDetails.zzd());
            } else if (productDetailsParams == null || TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                i5 = 0;
                if (TextUtils.isEmpty(str2)) {
                    str3 = str2;
                    zzf.putString("accountName", str3);
                } else {
                    str3 = str2;
                }
                intent = activity.getIntent();
                if (intent != null) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Activity's intent is null.");
                } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    zzf.putString("proxyPackage", stringExtra);
                    try {
                        zzf.putString("proxyPackageVersion", this.zzg.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzf.putString("proxyPackageVersion", "package not found");
                    }
                }
                final int i14 = (this.zzu || zzk.isEmpty()) ? (this.zzs || i5 == 0) ? !this.zzp ? 9 : 6 : 15 : 17;
                activity2 = activity;
                str = str3;
                final BillingFlowParams billingFlowParams2 = billingFlowParams;
                zzK = zzK(new Callable() { // from class: com.android.billingclient.api.zzaf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle zzat;
                        zzat = BillingClientImpl.this.zzat(i14, str5, str6, billingFlowParams2, zzf);
                        return zzat;
                    }
                }, 5000L, null, this.zze, zzJ());
                j5 = billingFlowParams2;
            } else {
                zzf.putString("skuPackageName", productDetailsParams.zza().zza());
            }
            i5 = i4;
            if (TextUtils.isEmpty(str2)) {
            }
            intent = activity.getIntent();
            if (intent != null) {
            }
            final int i142 = (this.zzu || zzk.isEmpty()) ? (this.zzs || i5 == 0) ? !this.zzp ? 9 : 6 : 15 : 17;
            activity2 = activity;
            str = str3;
            final BillingFlowParams billingFlowParams22 = billingFlowParams;
            zzK = zzK(new Callable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle zzat;
                    zzat = BillingClientImpl.this.zzat(i142, str5, str6, billingFlowParams22, zzf);
                    return zzat;
                }
            }, 5000L, null, this.zze, zzJ());
            j5 = billingFlowParams22;
        } else {
            activity2 = activity;
            j4 = nextLong;
            str = null;
            zzK = zzK(new Callable() { // from class: com.android.billingclient.api.zzag
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle zzau;
                    zzau = BillingClientImpl.this.zzau(str5, str6);
                    return zzau;
                }
            }, 5000L, null, this.zze, zzJ());
            j5 = nextLong;
        }
        try {
            if (zzK == null) {
                try {
                    zzjd zzjdVar10 = zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    BillingResult billingResult9 = zzdc.zzc;
                    zzbv(zzjdVar10, 2, billingResult9, j4, z4);
                    zzn(billingResult9);
                    return billingResult9;
                } catch (CancellationException e4) {
                    e = e4;
                    j7 = j4;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar11 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                    BillingResult billingResult10 = zzdc.zzk;
                    zzbw(zzjdVar11, 2, billingResult10, zzcy.zza(e), j7, z4);
                    zzn(billingResult10);
                    return billingResult10;
                } catch (TimeoutException e5) {
                    e = e5;
                    j7 = j4;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar112 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                    BillingResult billingResult102 = zzdc.zzk;
                    zzbw(zzjdVar112, 2, billingResult102, zzcy.zza(e), j7, z4);
                    zzn(billingResult102);
                    return billingResult102;
                } catch (Exception e6) {
                    e = e6;
                    j6 = j4;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar12 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                    BillingResult billingResult11 = zzdc.zzj;
                    zzbw(zzjdVar12, 2, billingResult11, zzcy.zza(e), j6, z4);
                    zzn(billingResult11);
                    return billingResult11;
                }
            }
            long j8 = j4;
            Bundle bundle = (Bundle) zzK.get(5000L, TimeUnit.MILLISECONDS);
            int zzb3 = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
            String zzk2 = com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient");
            if (zzb3 == 0) {
                Intent intent2 = new Intent(activity2, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j8);
                intent2.putExtra("wasServiceAutoReconnected", z4);
                activity2.startActivity(intent2);
                return zzdc.zzi;
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to buy item, Error response code: " + zzb3);
            BillingResult zza3 = zzdc.zza(zzb3, zzk2);
            try {
                if (bundle == null) {
                    zzjdVar = zzjd.REASON_UNSPECIFIED;
                } else {
                    Object obj2 = bundle.get("LOG_REASON");
                    if (obj2 == null) {
                        zzjdVar = zzjd.REASON_UNSPECIFIED;
                    } else if (obj2 instanceof Integer) {
                        zzjdVar = zzjd.zzb(((Integer) obj2).intValue());
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unexpected type for bundle log reason: " + obj2.getClass().getName());
                        zzjdVar = zzjd.REASON_UNSPECIFIED;
                    }
                }
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                zzjdVar = zzjd.REASON_UNSPECIFIED;
            }
            if (zzjdVar == zzjd.REASON_UNSPECIFIED) {
                zzjdVar = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            zzjd zzjdVar13 = zzjdVar;
            if (bundle != null) {
                try {
                    str = bundle.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
            }
            try {
                zzbw(zzjdVar13, 2, zza3, str, j8, z4);
                zzn(zza3);
                return zza3;
            } catch (CancellationException e7) {
                e = e7;
                j7 = j8;
                z4 = z4;
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzjd zzjdVar1122 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                BillingResult billingResult1022 = zzdc.zzk;
                zzbw(zzjdVar1122, 2, billingResult1022, zzcy.zza(e), j7, z4);
                zzn(billingResult1022);
                return billingResult1022;
            } catch (TimeoutException e8) {
                e = e8;
                j7 = j8;
                z4 = z4;
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzjd zzjdVar11222 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                BillingResult billingResult10222 = zzdc.zzk;
                zzbw(zzjdVar11222, 2, billingResult10222, zzcy.zza(e), j7, z4);
                zzn(billingResult10222);
                return billingResult10222;
            } catch (Exception e9) {
                e = e9;
                j6 = j8;
                z4 = z4;
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                zzjd zzjdVar122 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                BillingResult billingResult112 = zzdc.zzj;
                zzbw(zzjdVar122, 2, billingResult112, zzcy.zza(e), j6, z4);
                zzn(billingResult112);
                return billingResult112;
            }
        } catch (CancellationException e10) {
            e = e10;
        } catch (TimeoutException e11) {
            e = e11;
            j7 = j5;
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void launchExternalLink(final Activity activity, final LaunchExternalLinkParams launchExternalLinkParams, final LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        try {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            zzaN(new Callable() { // from class: com.android.billingclient.api.zzas
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.zzD(BillingClientImpl.this, launchExternalLinkResponseListener, launchExternalLinkParams, activity);
                    return null;
                }
            }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzat
                @Override // java.lang.Runnable
                public final void run() {
                    BillingClientImpl.this.zzaZ(launchExternalLinkResponseListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, zzav());
        } catch (Exception e5) {
            e = e5;
            zzaZ(launchExternalLinkResponseListener, zzay(), zzjd.SERVICE_CALL_EXCEPTION, e);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzt(BillingClientImpl.this, productDetailsResponseListener, queryProductDetailsParams);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzT(BillingClientImpl.this, productDetailsResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, zzay);
            productDetailsResponseListener.onProductDetailsResponse(zzay, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbw.zzk(), com.google.android.gms.internal.play_billing.zzbw.zzk()));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, final PurchasesResponseListener purchasesResponseListener) {
        if (zzK(new zzbm(this, purchasesResponseListener, queryPurchasesParams.zza(), queryPurchasesParams.getIncludeSuspendedSubscriptions()), UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzbj
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzM(BillingClientImpl.this, purchasesResponseListener);
            }
        }, zzav(), zzJ()) == null) {
            BillingResult zzay = zzay();
            zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, zzay);
            purchasesResponseListener.onQueryPurchasesResponse(zzay, com.google.android.gms.internal.play_billing.zzbw.zzk());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzbk(3000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            zzbs(zzjdVar, 16, billingResult);
            return billingResult;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            zzjd zzjdVar2 = zzjd.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED;
            BillingResult billingResult2 = zzdc.zzC;
            zzbs(zzjdVar2, 16, billingResult2);
            return billingResult2;
        }
        Handler handler = this.zze;
        final zzbo zzboVar = new zzbo(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzA(BillingClientImpl.this, alternativeBillingOnlyInformationDialogListener, activity, zzboVar);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzba(alternativeBillingOnlyInformationDialogListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzJ()) != null) {
            return zzdc.zzi;
        }
        BillingResult zzay = zzay();
        zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 16, zzay);
        return zzay;
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzbk(3000L)) {
            zzjd zzjdVar = zzjd.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            zzbs(zzjdVar, 25, billingResult);
            return billingResult;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support external offer.");
            zzjd zzjdVar2 = zzjd.EXTERNAL_OFFER_NOT_SUPPORTED;
            BillingResult billingResult2 = zzdc.zzt;
            zzbs(zzjdVar2, 25, billingResult2);
            return billingResult2;
        }
        Handler handler = this.zze;
        final zzbp zzbpVar = new zzbp(this, handler, externalOfferInformationDialogListener);
        if (zzK(new Callable() { // from class: com.android.billingclient.api.zzbc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzF(BillingClientImpl.this, externalOfferInformationDialogListener, activity, zzbpVar);
                return null;
            }
        }, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzaX(externalOfferInformationDialogListener, zzdc.zzk, zzjd.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzJ()) != null) {
            return zzdc.zzi;
        }
        BillingResult zzay = zzay();
        zzbs(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 25, zzay);
        return zzay;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!zzbk(3000L)) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Service disconnected.");
            return zzdc.zzj;
        }
        if (!this.zzq) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzdc.zzs;
        }
        View findViewById = activity.findViewById(R.id.content);
        IBinder windowToken = findViewById.getWindowToken();
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        g.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzc);
        String str = this.zzd;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        Handler handler = this.zze;
        final zzbn zzbnVar = new zzbn(this, handler, inAppMessageResponseListener);
        zzK(new Callable() { // from class: com.android.billingclient.api.zzbh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzv(BillingClientImpl.this, bundle, activity, zzbnVar);
                return null;
            }
        }, 5000L, null, handler, zzJ());
        return zzdc.zzi;
    }

    final synchronized ExecutorService zzJ() {
        try {
            if (this.zzI == null) {
                this.zzI = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzc.zza, new zzbl(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzI;
    }

    public final void zzao(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.zze.post(runnable);
        }
    }

    final zzcg zzh(QueryProductDetailsParams queryProductDetailsParams) {
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String zzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzbw zza = queryProductDetailsParams.zza();
        int size = zza.size();
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 + 20;
            ArrayList arrayList3 = new ArrayList(zza.subList(i6, i7 > size ? size : i7));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i8 = 0; i8 < size2; i8++) {
                arrayList4.add(((QueryProductDetailsParams.Product) arrayList3.get(i8)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.zzc;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.zza) {
                    zzapVar = this.zzi;
                }
                if (zzapVar == null) {
                    return zzaw(zzdc.zzj, zzjd.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z4 = this.zzw && this.zzE.isEnabledForPrepaidPlans();
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                zzaD(queryProductDetailsParams);
                Bundle zzj = zzapVar.zzj(true != this.zzx ? 17 : 20, this.zzg.getPackageName(), zzb, bundle, com.google.android.gms.internal.play_billing.zzc.zzg(str, this.zzd, arrayList3, null, null, com.google.android.gms.internal.play_billing.zza.zza(z4, true, true, true, false, true), this.zzJ.longValue()));
                if (zzj == null) {
                    return zzaw(zzdc.zzA, zzjd.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!zzj.containsKey("DETAILS_LIST")) {
                    int zzb2 = com.google.android.gms.internal.play_billing.zzc.zzb(zzj, "BillingClient");
                    String zzk = com.google.android.gms.internal.play_billing.zzc.zzk(zzj, "BillingClient");
                    if (zzb2 == 0) {
                        return zzaw(zzdc.zza(6, zzk), zzjd.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return zzaw(zzdc.zza(zzb2, zzk), zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + zzb2, null);
                }
                ArrayList<String> stringArrayList = zzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzaw(zzdc.zzA, zzjd.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    try {
                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i9));
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList5.add(productDetails);
                    } catch (JSONException e4) {
                        return zzaw(zzdc.zza(6, "Error trying to decode SkuDetails."), zzjd.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e4);
                    }
                }
                ArrayList<String> stringArrayList2 = zzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 != null) {
                        int size4 = stringArrayList2.size();
                        int i10 = 0;
                        while (i10 < size4) {
                            String str2 = stringArrayList2.get(i10);
                            i10++;
                            UnfetchedProduct unfetchedProduct = new UnfetchedProduct(str2);
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                            arrayList6.add(unfetchedProduct);
                        }
                    } else {
                        int size5 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size5) {
                            Object obj = arrayList3.get(i11);
                            int i12 = i11 + 1;
                            QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) obj;
                            int size6 = arrayList5.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size6) {
                                    i4 = size5;
                                    i5 = i12;
                                    arrayList6.add(new UnfetchedProduct(new JSONObject().put("productId", product.zza()).put("type", product.zzb()).put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, 0).toString()));
                                    break;
                                }
                                Object obj2 = arrayList5.get(i13);
                                i13++;
                                ProductDetails productDetails2 = (ProductDetails) obj2;
                                i4 = size5;
                                i5 = i12;
                                if (!product.zza().equals(productDetails2.getProductId()) || !product.zzb().equals(productDetails2.getProductType())) {
                                    size5 = i4;
                                    i12 = i5;
                                }
                            }
                            size5 = i4;
                            i11 = i5;
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i6 = i7;
                } catch (JSONException e5) {
                    return zzaw(zzdc.zza(6, "Error trying to decode SkuDetails."), zzjd.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e5);
                }
            } catch (DeadObjectException e6) {
                return zzaw(zzdc.zzj, zzjd.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e6);
            } catch (Exception e7) {
                return zzaw(zzdc.zzh, zzjd.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e7);
            }
        }
        return new zzcg(0, "", arrayList, arrayList2);
    }

    final zzcz zzk() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BillingResult zzn(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zze.post(new Runnable() { // from class: com.android.billingclient.api.zzan
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzV(BillingClientImpl.this, billingResult);
            }
        });
        return billingResult;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        zzbi(billingClientStateListener, 0);
    }

    private BillingClientImpl(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = str;
        this.zzd = zzaE();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, developerProvidedBillingListener, str, null, builder);
    }

    private BillingClientImpl(String str) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = str;
        this.zzd = zzaE();
    }

    BillingClientImpl(String str, Context context, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.zzJ = valueOf;
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        String zzaE = zzaE();
        this.zzd = zzaE;
        this.zzg = context.getApplicationContext();
        zzjp zza = zzjr.zza();
        zza.zzx(BuildConfig.VERSION_NAME);
        if (zzaE != null) {
            zza.zzy(zzaE);
        }
        zza.zzq(this.zzg.getPackageName());
        zza.zzd(valueOf.longValue());
        zza.zzw(builder.zza);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(846465066L);
        zzbo(zza, context);
        try {
            zza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new zzdl(this.zzg, (zzjr) zza.zzi());
        this.zzg.getPackageName();
        this.zzF = builder.zza;
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, String str, zzcz zzczVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zzjp zza = zzjr.zza();
        zza.zzx(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zza.zzy(str2);
        }
        zza.zzq(this.zzg.getPackageName());
        zza.zzd(this.zzJ.longValue());
        zza.zzw(builder.zza);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(846465066L);
        zzbo(zza, context);
        try {
            zza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        if (zzczVar != null) {
            this.zzh = zzczVar;
        } else {
            this.zzh = new zzdl(this.zzg, (zzjr) zza.zzi());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzab(this.zzg, purchasesUpdatedListener, null, null, userChoiceBillingListener, developerProvidedBillingListener, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzG = userChoiceBillingListener != null;
        this.zzF = builder.zza;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzdo zzdoVar, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.zzJ = valueOf;
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        String zzaE = zzaE();
        this.zzd = zzaE;
        this.zzg = context.getApplicationContext();
        zzjp zza = zzjr.zza();
        zza.zzx(BuildConfig.VERSION_NAME);
        if (zzaE != null) {
            zza.zzy(zzaE);
        }
        zza.zzq(this.zzg.getPackageName());
        zza.zzd(valueOf.longValue());
        zza.zzw(builder.zza);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(846465066L);
        zzbo(zza, context);
        try {
            zza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new zzdl(this.zzg, (zzjr) zza.zzi());
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzf = new zzab(this.zzg, null, null, null, null, null, this.zzh);
        this.zzE = pendingPurchasesParams;
        this.zzg.getPackageName();
        this.zzF = builder.zza;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzb zzbVar, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzJ = Long.valueOf(new Random().nextLong());
        this.zzK = com.google.android.gms.internal.play_billing.zzbd.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        this.zzd = zzaE();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, null, BuildConfig.VERSION_NAME, null, builder);
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, BuildConfig.VERSION_NAME, null, userChoiceBillingListener, developerProvidedBillingListener, null, null, builder);
    }
}
