package com.squareup.cash.ui.gcm;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.size.Scale;
import com.google.android.play.integrity.internal.ax;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.clientrouting.routers.core.BackgroundRouter;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.notifications.intents.RealNotificationIntentsCreator;
import com.squareup.cash.storage.RealAppDataWiper;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.UriPreference;
import com.squareup.util.android.RealIntentFactory;
import dev.zacsweers.metro.Provider;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import okio.internal.DefaultSocket;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealNotificationDispatcher {
    public final RealActivityUpdatesNotifier activityUpdatesNotifier;
    public final Analytics analytics;
    public final RealAppDataWiper appDataWiper;
    public final BackgroundRouter backgroundRouter;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final BoostSyncer boostSyncer;
    public final DefaultSocket channelsInitializer;
    public final KeyValue clearAppUserDataOnNextLaunch;
    public final RealClientSyncer clientSyncer;
    public final Context context;
    public final RealConversationService conversationService;
    public final RealDeviceIntegrityAttester deviceIntegrityAttester;
    public final FeatureFlagManager featureFlagManager;
    public final RealImageLoader imageLoader;
    public final RealInstrumentManager instrumentManager;
    public final AndroidSecureStore instrumentsPasscodeSecureStore;
    public final CoroutineContext ioDispatcher;
    public final RealNotificationIntentsCreator notificationIntentsCreator;
    public final AndroidNotificationManager notificationManager;
    public final RealProfileSyncer profileSyncer;
    public final RealReferralManager referralManager;
    public final CoroutineScope scope;
    public final RealSupportPhoneService supportPhoneService;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationChannelId.values().length];
            try {
                iArr[NotificationChannelId.TaxMarketing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealNotificationDispatcher(Context context, Analytics analytics, RealClientSyncer realClientSyncer, AndroidNotificationManager androidNotificationManager, DefaultSocket defaultSocket, RealImageLoader realImageLoader, RealProfileSyncer realProfileSyncer, RealReferralManager realReferralManager, RealDeviceIntegrityAttester realDeviceIntegrityAttester, AndroidSecureStore androidSecureStore, RealInstrumentManager realInstrumentManager, RealBalanceSnapshotManager realBalanceSnapshotManager, BoostSyncer boostSyncer, RealConversationService realConversationService, RealSupportPhoneService realSupportPhoneService, BackgroundRouter backgroundRouter, WireAdapter wireAdapter, UriPreference uriPreference, UriPreference uriPreference2, UriPreference uriPreference3, KeyValue keyValue, CoroutineScope coroutineScope, CoroutineContext coroutineContext, RealActivityUpdatesNotifier realActivityUpdatesNotifier, RealAppDataWiper realAppDataWiper, FeatureFlagManager featureFlagManager) {
        context.getClass();
        analytics.getClass();
        realClientSyncer.getClass();
        androidNotificationManager.getClass();
        realImageLoader.getClass();
        realProfileSyncer.getClass();
        realReferralManager.getClass();
        realDeviceIntegrityAttester.getClass();
        androidSecureStore.getClass();
        realBalanceSnapshotManager.getClass();
        boostSyncer.getClass();
        realSupportPhoneService.getClass();
        uriPreference.getClass();
        uriPreference2.getClass();
        uriPreference3.getClass();
        keyValue.getClass();
        coroutineContext.getClass();
        realActivityUpdatesNotifier.getClass();
        realAppDataWiper.getClass();
        featureFlagManager.getClass();
        this.context = context;
        this.analytics = analytics;
        this.clientSyncer = realClientSyncer;
        this.notificationManager = androidNotificationManager;
        this.channelsInitializer = defaultSocket;
        this.imageLoader = realImageLoader;
        this.profileSyncer = realProfileSyncer;
        this.referralManager = realReferralManager;
        this.deviceIntegrityAttester = realDeviceIntegrityAttester;
        this.instrumentsPasscodeSecureStore = androidSecureStore;
        this.instrumentManager = realInstrumentManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.boostSyncer = boostSyncer;
        this.conversationService = realConversationService;
        this.supportPhoneService = realSupportPhoneService;
        this.backgroundRouter = backgroundRouter;
        this.clearAppUserDataOnNextLaunch = keyValue;
        this.scope = coroutineScope;
        this.ioDispatcher = coroutineContext;
        this.activityUpdatesNotifier = realActivityUpdatesNotifier;
        this.appDataWiper = realAppDataWiper;
        this.featureFlagManager = featureFlagManager;
        ComponentRegistry.Builder builder = (ComponentRegistry.Builder) wireAdapter.adapter;
        ax axVar = (ax) ((RealMarketAttributesProvider.MetroFactory) builder.interceptors).invoke();
        RealIntentFactory realIntentFactory = (RealIntentFactory) ((Provider) builder.mappers).invoke();
        AndroidClock androidClock = (AndroidClock) ((Provider) builder.keyers).invoke();
        Function1 function1 = (Function1) ((Provider) builder.lazyFetcherFactories).invoke();
        Context context2 = (Context) ((Provider) builder.lazyDecoderFactories).invoke();
        realIntentFactory.getClass();
        androidClock.getClass();
        function1.getClass();
        context2.getClass();
        this.notificationIntentsCreator = new RealNotificationIntentsCreator(axVar, realIntentFactory, androidClock, function1, context2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$doOpGetProfile(RealNotificationDispatcher realNotificationDispatcher, ContinuationImpl continuationImpl) {
        RealNotificationDispatcher$doOpGetProfile$1 realNotificationDispatcher$doOpGetProfile$1;
        int i;
        if (continuationImpl instanceof RealNotificationDispatcher$doOpGetProfile$1) {
            realNotificationDispatcher$doOpGetProfile$1 = (RealNotificationDispatcher$doOpGetProfile$1) continuationImpl;
            int i2 = realNotificationDispatcher$doOpGetProfile$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realNotificationDispatcher$doOpGetProfile$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realNotificationDispatcher$doOpGetProfile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realNotificationDispatcher$doOpGetProfile$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileSyncer realProfileSyncer = realNotificationDispatcher.profileSyncer;
                    realNotificationDispatcher$doOpGetProfile$1.label = 1;
                    if (realProfileSyncer.refresh(true, realNotificationDispatcher$doOpGetProfile$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                RealClientSyncer realClientSyncer = realNotificationDispatcher.clientSyncer;
                SyncTrigger syncTrigger = SyncTrigger.PUSH_NOTIFICATION;
                realClientSyncer.getClass();
                realClientSyncer.sync(syncTrigger, SyncScope.Global.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        realNotificationDispatcher$doOpGetProfile$1 = new RealNotificationDispatcher$doOpGetProfile$1(realNotificationDispatcher, continuationImpl);
        Object obj2 = realNotificationDispatcher$doOpGetProfile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNotificationDispatcher$doOpGetProfile$1.label;
        if (i != 0) {
        }
        RealClientSyncer realClientSyncer2 = realNotificationDispatcher.clientSyncer;
        SyncTrigger syncTrigger2 = SyncTrigger.PUSH_NOTIFICATION;
        realClientSyncer2.getClass();
        realClientSyncer2.sync(syncTrigger2, SyncScope.Global.INSTANCE);
        return Unit.INSTANCE;
    }

    public final NotificationCompat.Builder buildBasicNotification(NotificationChannelId notificationChannelId, String str, String str2) {
        int i = WhenMappings.$EnumSwitchMapping$0[notificationChannelId.ordinal()];
        Context context = this.context;
        int color = i == 1 ? -16777216 : context.getColor(R.color.standard_green_normal);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, notificationChannelId.getId());
        builder.setContentTitle(str);
        builder.setContentText(str2);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.bigText(str2);
        builder.setStyle(bigTextStyle);
        builder.setSmallIcon(R.drawable.notification_icon);
        builder.setColor(color);
        builder.setAutoCancel(true);
        builder.setGroup(notificationChannelId.getGroup().id);
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[Catch: IOException -> 0x0028, TRY_LEAVE, TryCatch #0 {IOException -> 0x0028, blocks: (B:10:0x0024, B:11:0x0057, B:13:0x005f, B:22:0x0036), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getImage(Object obj, Function1 function1, ContinuationImpl continuationImpl) {
        RealNotificationDispatcher$getImage$1 realNotificationDispatcher$getImage$1;
        int i;
        Image image;
        Bitmap bitmap;
        try {
            if (continuationImpl instanceof RealNotificationDispatcher$getImage$1) {
                realNotificationDispatcher$getImage$1 = (RealNotificationDispatcher$getImage$1) continuationImpl;
                int i2 = realNotificationDispatcher$getImage$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realNotificationDispatcher$getImage$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realNotificationDispatcher$getImage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realNotificationDispatcher$getImage$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        if (obj != null) {
                            ImageRequest.Builder builder = new ImageRequest.Builder(this.context);
                            builder.data(obj);
                            builder.scale(Scale.FILL);
                            function1.invoke(builder);
                            RealImageLoader realImageLoader = this.imageLoader;
                            ImageRequest build = builder.build();
                            realNotificationDispatcher$getImage$1.label = 1;
                            obj2 = realImageLoader.execute(build, realNotificationDispatcher$getImage$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    image = ((ImageResult) obj2).getImage();
                    if (image != null) {
                        bitmap = Image_androidKt.toBitmap(image, image.getWidth(), image.getHeight());
                        return bitmap;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            image = ((ImageResult) obj2).getImage();
            if (image != null) {
            }
            return null;
        } catch (IOException e) {
            Timber.Forest.e("Failed to get photo", new Object[0], e);
            return null;
        }
        realNotificationDispatcher$getImage$1 = new RealNotificationDispatcher$getImage$1(this, continuationImpl);
        Object obj22 = realNotificationDispatcher$getImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNotificationDispatcher$getImage$1.label;
    }
}
