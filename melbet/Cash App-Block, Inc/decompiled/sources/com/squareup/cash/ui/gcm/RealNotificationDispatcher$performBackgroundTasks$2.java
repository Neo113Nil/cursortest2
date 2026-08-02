package com.squareup.cash.ui.gcm;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.boost.backend.RealBoostSyncer;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.routers.core.BackgroundRouter;
import com.squareup.cash.clientrouting.routers.core.BackgroundRouter$route$1;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.data.push.CashPushNotification;
import com.squareup.cash.deviceintegrity.DeviceIntegrity$EntryPoint;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$RemotelyClearAppDataV_1;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.notifications.CashNotification;
import com.squareup.cash.notifications.CashNotification$ClearAppDataNotification$ClearAll;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.storage.ClearAppUserDataOnNextLaunch;
import com.squareup.cash.storage.RealAppDataWiper;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.protos.franklin.api.Instrument;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealNotificationDispatcher$performBackgroundTasks$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CashNotification $notification;
    public RealNotificationDispatcher L$0;
    public int label;
    public final /* synthetic */ RealNotificationDispatcher this$0;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashPushNotification.TriggerEntitySync.SyncType.values().length];
            try {
                CashPushNotification.TriggerEntitySync.SyncType[] syncTypeArr = CashPushNotification.TriggerEntitySync.SyncType.$VALUES;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CashPushNotification.TriggerEntitySync.SyncType[] syncTypeArr2 = CashPushNotification.TriggerEntitySync.SyncType.$VALUES;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CashPushNotification.TriggerEntitySync.SyncType[] syncTypeArr3 = CashPushNotification.TriggerEntitySync.SyncType.$VALUES;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNotificationDispatcher$performBackgroundTasks$2(CashNotification cashNotification, RealNotificationDispatcher realNotificationDispatcher, Continuation continuation) {
        super(2, continuation);
        this.$notification = cashNotification;
        this.this$0 = realNotificationDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealNotificationDispatcher$performBackgroundTasks$2(this.$notification, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealNotificationDispatcher$performBackgroundTasks$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x022c, code lost:
    
        if (r4 == r3) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02e7, code lost:
    
        if (r0 == r3) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0302, code lost:
    
        if (r0 == r3) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0245, code lost:
    
        if (r4.refresh(true, r17) == r3) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0077, code lost:
    
        if (r4 == r3) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0085, code lost:
    
        if (com.squareup.cash.ui.gcm.RealNotificationDispatcher.access$doOpGetProfile(r1, r17) == r3) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0234  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object attestClassicRequest;
        CashPushNotification.TriggerEntitySync triggerEntitySync;
        CashPushNotification.TriggerEntitySync.SyncType syncType;
        RealNotificationDispatcher realNotificationDispatcher;
        CashPushNotification.Customer customer;
        Object image;
        Object image2;
        RealNotificationDispatcher realNotificationDispatcher2 = this.this$0;
        RealClientSyncer realClientSyncer = realNotificationDispatcher2.clientSyncer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        SyncScope.Global global = SyncScope.Global.INSTANCE;
        boolean z = true;
        char c = 1;
        CashNotification cashNotification = this.$notification;
        Continuation continuation = null;
        switch (i) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                if (!cashNotification.getHasBackgroundTasks()) {
                    a$$ExternalSyntheticBUOutline0.m$3("No background tasks.");
                    return null;
                }
                if (!(cashNotification instanceof CashNotification.PlayIntegrityDeviceChallengeNotification)) {
                    if (!(cashNotification instanceof CashNotification.GetProfileNotification)) {
                        if (cashNotification instanceof CashNotification.GetRewardsNotification) {
                            RealBoostSyncer realBoostSyncer = (RealBoostSyncer) realNotificationDispatcher2.boostSyncer;
                            JobKt.launch$default(realBoostSyncer.scope, null, null, new RealBoostSyncer$refresh$1(realBoostSyncer, z, continuation, i2), 3);
                        } else if (cashNotification instanceof CashNotification.PasscodeChangedNotification) {
                            Instrument instrument = ((CashNotification.PasscodeChangedNotification) cashNotification).instrument;
                            if ((instrument != null ? instrument.token : null) == null) {
                                Timber.Forest.e(new IllegalArgumentException("passcode-changed OP received with a null instrument or instrument token."));
                            } else {
                                Timber.Forest.d("Removing passcode token for %s", instrument.token);
                                AndroidSecureStore androidSecureStore = realNotificationDispatcher2.instrumentsPasscodeSecureStore;
                                String str = instrument.token;
                                str.getClass();
                                androidSecureStore.getClass();
                                SharedPreferences sharedPreferences = (SharedPreferences) androidSecureStore.storage.delegate;
                                Set set = CollectionsKt.toSet(sharedPreferences.getAll().keySet());
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : set) {
                                    String str2 = (String) obj3;
                                    str2.getClass();
                                    if (str2.equals(str)) {
                                        arrayList.add(obj3);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    sharedPreferences.edit().remove(str3).apply();
                                }
                            }
                        } else if (cashNotification instanceof CashNotification.ClientRouteNotification.BackgroundClientRouteNotification) {
                            ClientRoute clientRoute = ((CashNotification.ClientRouteNotification.BackgroundClientRouteNotification) cashNotification).clientRoute;
                            BackgroundRouter backgroundRouter = realNotificationDispatcher2.backgroundRouter;
                            CoroutineContext coroutineContext = backgroundRouter.ioContext;
                            CoroutineScope coroutineScope = backgroundRouter.scope;
                            clientRoute.getClass();
                            if (clientRoute instanceof ClientRoute.RequestReviewPrompt) {
                                backgroundRouter.requestReviewFlagWrapper.shouldRequestReviewPrompt.set(true);
                            } else if (clientRoute instanceof ClientRoute.RefreshAllAppMessagesInBackground) {
                                JobKt.launch$default(coroutineScope, coroutineContext, null, new BackgroundRouter$route$1(backgroundRouter, continuation, i2), 2);
                            } else if (clientRoute instanceof ClientRoute.RemoveAppMessageInBackground) {
                                JobKt.launch$default(coroutineScope, coroutineContext, null, new EntitySyncerKt$hasSyncedFlow$1(backgroundRouter, (ClientRoute.RemoveAppMessageInBackground) clientRoute, continuation, 8), 2);
                            } else if (clientRoute instanceof ClientRoute.RemoveAllAppMessagesInBackground) {
                                JobKt.launch$default(coroutineScope, coroutineContext, null, new BackgroundRouter$route$1(backgroundRouter, continuation, c == true ? 1 : 0), 2);
                            } else if (clientRoute instanceof ClientRoute.RemoveAppMessageByTokenInBackground) {
                                JobKt.launch$default(coroutineScope, coroutineContext, null, new EntitySyncerKt$hasSyncedFlow$1(backgroundRouter, (ClientRoute.RemoveAppMessageByTokenInBackground) clientRoute, continuation, 9), 2);
                            } else if (clientRoute instanceof ClientRoute.CollectGpsLocationData) {
                                JobKt.launch$default(coroutineScope, coroutineContext, null, new EntitySyncerKt$hasSyncedFlow$1((ClientRoute.CollectGpsLocationData) clientRoute, backgroundRouter, continuation, 11), 2);
                            } else if (clientRoute instanceof ClientRoute.UpdateAfterpayApplet) {
                                JobKt.launch$default(coroutineScope, coroutineContext, null, new EntitySyncerKt$hasSyncedFlow$1((ClientRoute.UpdateAfterpayApplet) clientRoute, backgroundRouter, continuation, 10), 2);
                            } else if (clientRoute instanceof ClientRoute.RefreshBitcoinInvoice) {
                                backgroundRouter.refreshInvoiceManager.refreshInvoiceIdPref.set(((ClientRoute.RefreshBitcoinInvoice) clientRoute).invoiceId);
                            }
                        } else if (cashNotification instanceof CashNotification.ClientRouteNotification.SupportChatMessageNotification) {
                            realNotificationDispatcher2.conversationService.loadNewMessages();
                        } else if (cashNotification instanceof CashNotification.SupportPhoneStatusNotification) {
                            RealSupportPhoneService realSupportPhoneService = realNotificationDispatcher2.supportPhoneService;
                            JobKt.launch$default(realSupportPhoneService.coroutineScope, null, null, new ShoppingWebBridge.AnonymousClass1(realSupportPhoneService, continuation, 21), 3);
                        } else if (cashNotification instanceof CashNotification$ClearAppDataNotification$ClearAll) {
                            CashNotification$ClearAppDataNotification$ClearAll cashNotification$ClearAppDataNotification$ClearAll = (CashNotification$ClearAppDataNotification$ClearAll) cashNotification;
                            this.label = 3;
                            if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) realNotificationDispatcher2.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$RemotelyClearAppDataV_1.INSTANCE)).enabled()) {
                                if (cashNotification$ClearAppDataNotification$ClearAll.shouldClearOnNextLaunch) {
                                    obj2 = realNotificationDispatcher2.clearAppUserDataOnNextLaunch.set(new ClearAppUserDataOnNextLaunch(true), this);
                                    if (obj2 != coroutineSingletons) {
                                        obj2 = Unit.INSTANCE;
                                        break;
                                    }
                                } else {
                                    RealAppDataWiper realAppDataWiper = realNotificationDispatcher2.appDataWiper;
                                    Context context = realNotificationDispatcher2.context;
                                    realAppDataWiper.getClass();
                                    context.getClass();
                                    Object systemService = context.getSystemService("activity");
                                    systemService.getClass();
                                    ((ActivityManager) systemService).clearApplicationUserData();
                                    obj2 = Unit.INSTANCE;
                                    break;
                                }
                            } else {
                                obj2 = Unit.INSTANCE;
                                break;
                            }
                        }
                        if (cashNotification instanceof CashNotification.PaymentNotification) {
                            SyncTrigger syncTrigger = SyncTrigger.PUSH_NOTIFICATION;
                            realClientSyncer.getClass();
                            realClientSyncer.sync(syncTrigger, global);
                            RealReferralManager realReferralManager = realNotificationDispatcher2.referralManager;
                            this.label = 4;
                            break;
                        }
                        triggerEntitySync = cashNotification.triggerEntitySync;
                        if (triggerEntitySync != null) {
                            String str4 = triggerEntitySync.syncType;
                            try {
                                syncType = CashPushNotification.TriggerEntitySync.SyncType.valueOf(str4);
                            } catch (IllegalArgumentException unused) {
                                syncType = null;
                            }
                            int i3 = syncType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[syncType.ordinal()];
                            if (i3 == -1) {
                                Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Unexpected TriggerEntitySync type: ", str4), new Object[0]);
                            } else {
                                if (i3 != 1) {
                                    if (i3 != 2 && i3 != 3) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    CompletableDeferredImpl reset = realClientSyncer.reset(ResetTrigger.ImmediateForceResync);
                                    this.L$0 = realNotificationDispatcher2;
                                    this.label = 5;
                                    Object awaitInternal = reset.awaitInternal(this);
                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    if (awaitInternal != coroutineSingletons) {
                                        realNotificationDispatcher = realNotificationDispatcher2;
                                        RealClientSyncer realClientSyncer2 = realNotificationDispatcher.clientSyncer;
                                        SyncTrigger syncTrigger2 = SyncTrigger.PUSH_NOTIFICATION;
                                        realClientSyncer2.getClass();
                                        realClientSyncer2.sync(syncTrigger2, global);
                                    }
                                    return coroutineSingletons;
                                }
                                SyncTrigger syncTrigger3 = SyncTrigger.PUSH_NOTIFICATION;
                                realClientSyncer.getClass();
                                realClientSyncer.sync(syncTrigger3, global);
                            }
                        }
                        customer = cashNotification.otherCustomer;
                        if (customer != null) {
                            String str5 = cashNotification.imageUrl;
                            if (str5 == null) {
                                return null;
                            }
                            this.L$0 = null;
                            this.label = 7;
                            image = realNotificationDispatcher2.getImage(str5, new TaxWebAppBridge$$ExternalSyntheticLambda1(28), this);
                            break;
                        } else {
                            String str6 = customer.id;
                            String str7 = customer.photoUrl;
                            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("notification").appendQueryParameter("customerId", str6);
                            if (str7 != null) {
                                appendQueryParameter.appendQueryParameter("photoUrl", str7);
                            }
                            Uri build = appendQueryParameter.build();
                            build.getClass();
                            AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3 = new AlertBannerKt$$ExternalSyntheticLambda3(realNotificationDispatcher2, 5);
                            this.L$0 = null;
                            this.label = 6;
                            image2 = realNotificationDispatcher2.getImage(build, alertBannerKt$$ExternalSyntheticLambda3, this);
                            break;
                        }
                        return coroutineSingletons;
                    }
                    this.label = 2;
                    break;
                } else {
                    this.label = 1;
                    String str8 = ((CashNotification.PlayIntegrityDeviceChallengeNotification) cashNotification).challengeToken;
                    if (str8 == null) {
                        Timber.Forest.e(new IllegalArgumentException("Device challenge push received with no challenge token"));
                    }
                    if (str8 == null) {
                        attestClassicRequest = Unit.INSTANCE;
                        break;
                    } else {
                        attestClassicRequest = realNotificationDispatcher2.deviceIntegrityAttester.attestClassicRequest(str8, DeviceIntegrity$EntryPoint.PUSH_NOTIFICATION, this);
                        if (attestClassicRequest != coroutineSingletons) {
                            attestClassicRequest = Unit.INSTANCE;
                            break;
                        }
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
                SafeTrace.throwOnFailure(obj);
                if (cashNotification instanceof CashNotification.PaymentNotification) {
                }
                triggerEntitySync = cashNotification.triggerEntitySync;
                if (triggerEntitySync != null) {
                }
                customer = cashNotification.otherCustomer;
                if (customer != null) {
                }
                return coroutineSingletons;
            case 4:
                SafeTrace.throwOnFailure(obj);
                realNotificationDispatcher2.activityUpdatesNotifier.notifyItemUpdated(((CashNotification.PaymentNotification) cashNotification).paymentToken);
                triggerEntitySync = cashNotification.triggerEntitySync;
                if (triggerEntitySync != null) {
                }
                customer = cashNotification.otherCustomer;
                if (customer != null) {
                }
                return coroutineSingletons;
            case 5:
                realNotificationDispatcher = this.L$0;
                SafeTrace.throwOnFailure(obj);
                RealClientSyncer realClientSyncer22 = realNotificationDispatcher.clientSyncer;
                SyncTrigger syncTrigger22 = SyncTrigger.PUSH_NOTIFICATION;
                realClientSyncer22.getClass();
                realClientSyncer22.sync(syncTrigger22, global);
                customer = cashNotification.otherCustomer;
                if (customer != null) {
                }
                return coroutineSingletons;
            case 6:
                SafeTrace.throwOnFailure(obj);
                image2 = obj;
                return (Bitmap) image2;
            case 7:
                SafeTrace.throwOnFailure(obj);
                image = obj;
                return (Bitmap) image;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
