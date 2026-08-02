package papa.internal;

import android.app.Activity;
import android.app.Application;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.NodeChain;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.google.android.gms.internal.measurement.zzaag;
import com.google.android.gms.measurement.internal.zzky;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo$$ExternalSyntheticLambda0;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.entities.SyncEntityQueries$SelectAllWithEntityTypeQuery;
import com.squareup.cash.featureflags.RealLoginFeatureFlagsHandler;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.CachedAttestedKeyServiceFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.storage.RealSessionedLink;
import com.squareup.cash.storage.RealSessionedLink$Factory$Impl;
import com.squareup.cash.storage.RealSessionedLinkStore;
import com.squareup.cash.storage.SessionLinkChangeEvent;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import com.squareup.cash.ui.ScreenshotReportingManager;
import com.squareup.cash.userjourneys.data.UserJourney;
import com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.util.cash.Countries;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.android.HandlerContext;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import okio.internal.ResourceFileSystem;

/* loaded from: classes3.dex */
public final /* synthetic */ class ViewTreeObservers$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ViewTreeObservers$$ExternalSyntheticLambda3(CachedAttestedKeyServiceFactory cachedAttestedKeyServiceFactory, String str) {
        this.$r8$classId = 9;
        AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
        this.f$0 = cachedAttestedKeyServiceFactory;
        this.f$1 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v12, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v6, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v21, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                OnPreDrawListenerWrapper onPreDrawListenerWrapper = (OnPreDrawListenerWrapper) obj3;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
                viewTreeObserver.getClass();
                Object obj4 = ((Ref$ObjectRef) obj2).element;
                if (obj4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("listener");
                    throw null;
                }
                switch (onPreDrawListenerWrapper.$r8$classId) {
                    case 0:
                        ViewTreeObserver.OnPreDrawListener onPreDrawListener = (ViewTreeObserver.OnPreDrawListener) obj4;
                        viewTreeObserver.getClass();
                        onPreDrawListener.getClass();
                        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                        break;
                    default:
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) obj4;
                        viewTreeObserver.getClass();
                        onGlobalLayoutListener.getClass();
                        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                        break;
                }
                return Unit.INSTANCE;
            case 1:
                RealCryptoBalanceRepo$$ExternalSyntheticLambda0 realCryptoBalanceRepo$$ExternalSyntheticLambda0 = (RealCryptoBalanceRepo$$ExternalSyntheticLambda0) obj3;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Instrument$Adapter instrument$Adapter = (Instrument$Adapter) ((InstrumentQueries) obj2).instrumentAdapter;
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 1, (EnumColumnAdapter) instrument$Adapter.cash_instrument_typeAdapter);
                String string2 = androidCursor.getString(2);
                InstrumentType instrumentType = string2 != null ? (InstrumentType) ((EnumColumnAdapter) instrument$Adapter.card_brandAdapter).decode(string2) : null;
                String string3 = androidCursor.getString(3);
                String string4 = androidCursor.getString(4);
                String string5 = androidCursor.getString(5);
                String string6 = androidCursor.getString(6);
                CurrencyCode currencyCode = string6 != null ? (CurrencyCode) ((EnumColumnAdapter) instrument$Adapter.balance_currencyAdapter).decode(string6) : null;
                Long l = androidCursor.getLong(7);
                Long l2 = androidCursor.getLong(8);
                l2.getClass();
                return realCryptoBalanceRepo$$ExternalSyntheticLambda0.invoke(m1431m, m, instrumentType, string3, string4, string5, currencyCode, l, l2, androidCursor.getString(9), androidCursor.getString(10), androidCursor.getString(11), androidCursor.getBoolean(12), androidCursor.getString(13), androidCursor.getString(14));
            case 2:
                RealAppConfigManager$$ExternalSyntheticLambda0 realAppConfigManager$$ExternalSyntheticLambda0 = (RealAppConfigManager$$ExternalSyntheticLambda0) obj3;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                Boolean bool = androidCursor2.getBoolean(0);
                ?? bytes = androidCursor2.getBytes(1);
                Money money = bytes != 0 ? (Money) ((WireAdapter) ((Instrument$Adapter) instrumentQueries.instrumentAdapter).cash_instrument_typeAdapter).decode(bytes) : null;
                ?? bytes2 = androidCursor2.getBytes(2);
                Money money2 = bytes2 != 0 ? (Money) ((WireAdapter) ((Instrument$Adapter) instrumentQueries.instrumentAdapter).card_brandAdapter).decode(bytes2) : null;
                String string7 = androidCursor2.getString(3);
                String string8 = androidCursor2.getString(4);
                String string9 = androidCursor2.getString(5);
                Boolean bool2 = androidCursor2.getBoolean(6);
                String string10 = androidCursor2.getString(7);
                String string11 = androidCursor2.getString(8);
                String string12 = androidCursor2.getString(9);
                String string13 = androidCursor2.getString(10);
                String string14 = androidCursor2.getString(11);
                String string15 = androidCursor2.getString(12);
                ?? bytes3 = androidCursor2.getBytes(13);
                List list = bytes3 != 0 ? (List) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries.instrumentAdapter).balance_currencyAdapter).decode(bytes3) : null;
                String string16 = androidCursor2.getString(14);
                String string17 = androidCursor2.getString(15);
                String string18 = androidCursor2.getString(16);
                String string19 = androidCursor2.getString(17);
                AndroidStringManager androidStringManager = realAppConfigManager$$ExternalSyntheticLambda0.f$0.stringManager;
                List list2 = list;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                if (money == null) {
                    money = Moneys.zero(CurrencyCode.USD);
                }
                Money money3 = money;
                if (money2 == null) {
                    money2 = Moneys.zero(CurrencyCode.USD);
                }
                Money money4 = money2;
                if (string7 == null) {
                    string7 = androidStringManager.get(R.string.invitation_config_header);
                }
                String str = string7;
                if (string8 == null) {
                    string8 = androidStringManager.get(R.string.invitation_config_preview_message);
                }
                String str2 = string8;
                if (string9 == null) {
                    string9 = androidStringManager.get(R.string.invitation_config_message_template);
                }
                String str3 = string9;
                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                if (string14 == null) {
                    string14 = androidStringManager.get(R.string.invitation_config_profile_button);
                }
                String str4 = string14;
                if (string15 == null) {
                    string15 = androidStringManager.get(R.string.invitation_config_activity_button);
                }
                String str5 = string15;
                if (list2 == null) {
                    list2 = EmptyList.INSTANCE;
                }
                return new InvitationConfig(booleanValue, money3, money4, str, str2, str3, booleanValue2, string10, string11, string12, string13, str4, str5, list2, string16, string17, string18, string19);
            case 3:
                Function15 function15 = (Function15) obj3;
                ComponentRegistry.Builder builder = ((PaymentQueries) obj2).customerAdapter;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                ?? bytes4 = androidCursor3.getBytes(0);
                Object obj5 = bytes4 != 0 ? (Image) ((WireAdapter) builder.lazyFetcherFactories).decode(bytes4) : null;
                ?? bytes5 = androidCursor3.getBytes(1);
                Object obj6 = bytes5 != 0 ? (Color) ((WireAdapter) builder.lazyDecoderFactories).decode(bytes5) : null;
                Object string20 = androidCursor3.getString(2);
                string20.getClass();
                Object obj7 = androidCursor3.getBoolean(3);
                obj7.getClass();
                Object string21 = androidCursor3.getString(4);
                string21.getClass();
                ?? bytes6 = androidCursor3.getBytes(5);
                Object obj8 = bytes6 != 0 ? (MerchantData) ((WireAdapter) builder.mappers).decode(bytes6) : null;
                Object string22 = androidCursor3.getString(6);
                Object string23 = androidCursor3.getString(7);
                Object string24 = androidCursor3.getString(8);
                Object m2 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 9, (EnumColumnAdapter) builder.interceptors);
                Object obj9 = androidCursor3.getLong(10);
                Boolean bool3 = androidCursor3.getBoolean(11);
                Object m3 = Matcher$$ExternalSyntheticOutline0.m(bool3, androidCursor3, 12);
                Boolean bool4 = androidCursor3.getBoolean(13);
                return function15.invoke(obj5, obj6, string20, obj7, string21, obj8, string22, string23, string24, m2, obj9, bool3, m3, bool4, Matcher$$ExternalSyntheticOutline0.m(bool4, androidCursor3, 14));
            case 4:
                InstrumentQueries.ForCurrencyQuery forCurrencyQuery = (InstrumentQueries.ForCurrencyQuery) obj3;
                PaymentQueries paymentQueries = (PaymentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                CurrencyCode currencyCode2 = forCurrencyQuery.balance_currency;
                androidStatement.bindString(0, currencyCode2 != null ? (String) ((EnumColumnAdapter) paymentQueries.paymentAdapter.outerCoordinator).encode(currencyCode2) : null);
                Role role = (Role) forCurrencyQuery.cash_instrument_type;
                androidStatement.bindString(1, role != null ? (String) ((EnumColumnAdapter) paymentQueries.paymentAdapter.sentinelHead).encode(role) : null);
                return Unit.INSTANCE;
            case 5:
                PaymentQueries paymentQueries2 = (PaymentQueries) obj3;
                PaymentQueries.RecentsQuery recentsQuery = (PaymentQueries.RecentsQuery) obj2;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                ComponentRegistry.Builder builder2 = paymentQueries2.customerAdapter;
                NodeChain nodeChain = paymentQueries2.paymentAdapter;
                androidStatement2.bindString(0, (String) ((EnumColumnAdapter) builder2.interceptors).encode(recentsQuery.filterBlocked));
                PaymentState paymentState = recentsQuery.includePaymentState;
                androidStatement2.bindString(1, paymentState != null ? (String) ((EnumColumnAdapter) nodeChain.innerCoordinator).encode(paymentState) : null);
                androidStatement2.bindString(2, (String) ((EnumColumnAdapter) nodeChain.layoutNode).encode(recentsQuery.requestPaymentOrientation));
                Role role2 = recentsQuery.requestPaymentRole;
                androidStatement2.bindString(3, role2 != null ? (String) ((EnumColumnAdapter) nodeChain.sentinelHead).encode(role2) : null);
                PaymentState paymentState2 = recentsQuery.filterRequestPaymentState;
                androidStatement2.bindString(4, paymentState2 != null ? (String) ((EnumColumnAdapter) nodeChain.innerCoordinator).encode(paymentState2) : null);
                androidStatement2.bindLong(5, Long.valueOf(recentsQuery.limit));
                return Unit.INSTANCE;
            case 6:
                SyncEntityQueries$SelectAllWithEntityTypeQuery syncEntityQueries$SelectAllWithEntityTypeQuery = (SyncEntityQueries$SelectAllWithEntityTypeQuery) obj2;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                ((ResourceFileSystem.Companion) ((InstrumentQueries) obj3).instrumentAdapter).getClass();
                androidStatement3.bindLong(0, Long.valueOf(syncEntityQueries$SelectAllWithEntityTypeQuery.f1123type));
                androidStatement3.bindLong(1, Long.valueOf(syncEntityQueries$SelectAllWithEntityTypeQuery.limit));
                androidStatement3.bindLong(2, Long.valueOf(syncEntityQueries$SelectAllWithEntityTypeQuery.offset));
                return Unit.INSTANCE;
            case 7:
                Query query = (Query) obj3;
                MapBuilder mapBuilder = (MapBuilder) obj2;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                while (((Boolean) androidCursor4.next().value).booleanValue()) {
                    FeatureFlag featureFlag = (FeatureFlag) query.mapper.invoke(androidCursor4);
                    Object obj10 = featureFlag.name;
                    if (obj10 != null) {
                        mapBuilder.put(obj10, featureFlag);
                    }
                }
                QueryResult.Companion.getClass();
                return new QueryResult.Value(QueryResult.Companion.Unit);
            case 8:
                RealLoginFeatureFlagsHandler realLoginFeatureFlagsHandler = (RealLoginFeatureFlagsHandler) obj2;
                for (FeatureFlag featureFlag2 : (List) obj3) {
                    InstrumentQueries instrumentQueries2 = realLoginFeatureFlagsHandler.cashDatabase.featureFlagsQueries;
                    String str6 = featureFlag2.name;
                    str6.getClass();
                    instrumentQueries2.insertRemote(str6, featureFlag2);
                }
                return Unit.INSTANCE;
            case 9:
                AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
                ((String) obj).getClass();
                return new CachedAttestedKeyServiceFactory.CacheItem(((CachedAttestedKeyServiceFactory) obj3).delegateFactory.create((String) obj2));
            case 10:
                RealSessionedLinkStore realSessionedLinkStore = (RealSessionedLinkStore) obj3;
                SessionLinkChangeEvent.ColdStart coldStart = (SessionLinkChangeEvent.ColdStart) obj2;
                ((TransactionWrapper) obj).getClass();
                StorageLink storageLink = (StorageLink) realSessionedLinkStore.persistedStorageLink.blockingGet();
                SessionQueries sessionQueries = realSessionedLinkStore.storageLinkQueries;
                StorageLink rawActiveLink = Countries.getRawActiveLink(sessionQueries);
                if (storageLink != null) {
                    sessionQueries.setActiveLink(storageLink.getId());
                    realSessionedLinkStore.persistedStorageLink.blockingSet(null);
                } else if (rawActiveLink == null) {
                    String str7 = coldStart.associatedAccountToken;
                    StorageLink storageLink2 = str7 != null ? Countries.getStorageLink(sessionQueries, str7) : null;
                    if (str7 == null || !(storageLink2 instanceof StorageLink.Sandboxed)) {
                        StorageLink.Sandboxed orCreateOnboardingLink = Countries.getOrCreateOnboardingLink(sessionQueries);
                        if (str7 != null) {
                            Countries.linkAccountToStorage(sessionQueries, str7, orCreateOnboardingLink);
                        }
                        sessionQueries.setActiveLink(Long.valueOf(orCreateOnboardingLink.id));
                    } else {
                        sessionQueries.setActiveLink(Long.valueOf(((StorageLink.Sandboxed) storageLink2).id));
                    }
                }
                RealSessionedLink$Factory$Impl realSessionedLink$Factory$Impl = realSessionedLinkStore.sessionedLinkFactory;
                AppUpdateDetector$$ExternalSyntheticLambda0 appUpdateDetector$$ExternalSyntheticLambda0 = new AppUpdateDetector$$ExternalSyntheticLambda0(realSessionedLinkStore, i2);
                RealSandboxer realSandboxer = (RealSandboxer) realSessionedLink$Factory$Impl.delegateFactory.sandboxer.invoke();
                realSandboxer.getClass();
                return new RealSessionedLink(realSandboxer, sessionQueries, appUpdateDetector$$ExternalSyntheticLambda0);
            case 11:
                ScreenshotReportingManager screenshotReportingManager = (ScreenshotReportingManager) obj3;
                Application application = (Application) obj2;
                zzky zzkyVar = screenshotReportingManager.activityTracker;
                if (zzkyVar != null) {
                    application.unregisterActivityLifecycleCallbacks(zzkyVar);
                }
                screenshotReportingManager.activityTracker = null;
                screenshotReportingManager.activityLaunchers.clear();
                screenshotReportingManager.activityCallbacks.clear();
                screenshotReportingManager.navigator = null;
                return Unit.INSTANCE;
            case 12:
                UserJourney userJourney = (UserJourney) obj;
                userJourney.getClass();
                ((UserJourney$Name) obj3).getClass();
                return UserJourney.copy$default(userJourney, null, null, 0L, 0L, null, null, null, ((zzaag) obj2).zza, null, false, 895, null);
            case 13:
                ((HandlerContext) obj3).handler.removeCallbacks((MainActivity$$ExternalSyntheticLambda8) obj2);
                return Unit.INSTANCE;
            default:
                PerfsActivityLifecycleCallbacks perfsActivityLifecycleCallbacks = (PerfsActivityLifecycleCallbacks) obj3;
                Activity activity = (Activity) obj2;
                MotionEvent motionEvent = (MotionEvent) obj;
                motionEvent.getClass();
                if (!perfsActivityLifecycleCallbacks.firstTouchEvent) {
                    perfsActivityLifecycleCallbacks.firstTouchEvent = true;
                    perfsActivityLifecycleCallbacks.appStartUpdateCallback.invoke(new ForwardingFileSystem$$ExternalSyntheticLambda0(motionEvent, activity.getClass().getName()));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ViewTreeObservers$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ ViewTreeObservers$$ExternalSyntheticLambda3(RealUserJourneySignalProcessor realUserJourneySignalProcessor, UserJourney$Name userJourney$Name, zzaag zzaagVar) {
        this.$r8$classId = 12;
        this.f$0 = userJourney$Name;
        this.f$1 = zzaagVar;
    }
}
