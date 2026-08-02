package papa;

import android.app.Application;
import android.content.Context;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.blockers.treehouse.TreehouseFlows$$ExternalSyntheticLambda0;
import com.squareup.cash.clientrouting.LiteClientRouteRouter;
import com.squareup.cash.clientrouting.routers.banking.BankingRouter;
import com.squareup.cash.clientrouting.routers.banking.BankingRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.bitcoin.BitcoinRouter;
import com.squareup.cash.clientrouting.routers.bitcoin.BitcoinRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.core.DeprecatedRouter;
import com.squareup.cash.clientrouting.routers.core.DeprecatedRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.core.ExternalMapRouter;
import com.squareup.cash.clientrouting.routers.core.ExternalMapRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.work.SquareStaffSwitchAccountRouter;
import com.squareup.cash.clientrouting.routers.work.SquareStaffSwitchAccountRouter$Factory$Impl;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.initialscreenloader.backend.RealSquareStaffSwitchAccountContextStore;
import com.squareup.cash.initialscreenloader.backend.util.AndroidAppProcessInfo$activityLifecycleEvents$1$callback$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyProvider;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyRegistry;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.profile.views.ProfilePhotoUrlProvider;
import com.squareup.cash.profile.views.ProfilePhotoUrlRegistry;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import com.squareup.cash.treehouse.network.RealHttpClient;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.PreferenceFlow;
import com.squareup.preferences.PreferenceFlow$flow$1$$ExternalSyntheticLambda0;
import com.squareup.preferences.SharedPreferencesKeyValue;
import dev.zacsweers.metro.Provider;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$0;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda1;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.internal.Tags;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okio.Path;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes3.dex */
public final /* synthetic */ class InteractionRuleClient$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ InteractionRuleClient$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long initialWindowSize;
        Http2Stream[] http2StreamArr = null;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                InteractionRuleClient interactionRuleClient = (InteractionRuleClient) this.f$0;
                SentEvent sentEvent = (SentEvent) this.f$1;
                Iterator it = interactionRuleClient.interactionEngines.iterator();
                while (it.hasNext()) {
                    InteractionEngine interactionEngine = (InteractionEngine) it.next();
                    interactionEngine.getClass();
                    InteractionEngine$sendEvent$realEventScope$1 interactionEngine$sendEvent$realEventScope$1 = new InteractionEngine$sendEvent$realEventScope$1(interactionEngine, sentEvent);
                    interactionEngine.eventInScope = sentEvent;
                    Iterator it2 = ((Iterable) MapsKt__MapsKt.getValue(interactionEngine.onEventCallbacks, sentEvent.event.getClass())).iterator();
                    while (it2.hasNext()) {
                        ((Function1) it2.next()).invoke(interactionEngine$sendEvent$realEventScope$1);
                    }
                    interactionEngine.eventInScope = null;
                }
                return Unit.INSTANCE;
            case 1:
                SquareStaffSwitchAccountRouter$Factory$Impl squareStaffSwitchAccountRouter$Factory$Impl = (SquareStaffSwitchAccountRouter$Factory$Impl) this.f$0;
                Navigator navigator = (Navigator) this.f$1;
                navigator.getClass();
                LoadTimeClock.MetroFactory metroFactory = squareStaffSwitchAccountRouter$Factory$Impl.delegateFactory;
                RealSquareStaffSwitchAccountContextStore realSquareStaffSwitchAccountContextStore = (RealSquareStaffSwitchAccountContextStore) metroFactory.clock.invoke();
                SignedInStateManager signedInStateManager = (SignedInStateManager) metroFactory.observabilityManager.invoke();
                realSquareStaffSwitchAccountContextStore.getClass();
                signedInStateManager.getClass();
                return new SquareStaffSwitchAccountRouter(navigator, realSquareStaffSwitchAccountContextStore, signedInStateManager);
            case 2:
                BankingRouter$Factory$Impl bankingRouter$Factory$Impl = (BankingRouter$Factory$Impl) this.f$0;
                Navigator navigator2 = (Navigator) this.f$1;
                navigator2.getClass();
                LiteClientRouteRouter.MetroFactory metroFactory2 = bankingRouter$Factory$Impl.delegateFactory;
                FlowStarter flowStarter = (FlowStarter) metroFactory2.allowlistProvider.invoke();
                RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) metroFactory2.errorReporter.invoke();
                RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl = (RealTransfersInboundNavigator$Factory$Impl) metroFactory2.wrappedFactory.value;
                KeyValue keyValue = (KeyValue) metroFactory2.stringManager.invoke();
                flowStarter.getClass();
                realMoneyNavigatorHelper.getClass();
                realTransfersInboundNavigator$Factory$Impl.getClass();
                keyValue.getClass();
                return new BankingRouter(flowStarter, realMoneyNavigatorHelper, realTransfersInboundNavigator$Factory$Impl, keyValue, navigator2);
            case 3:
                BitcoinRouter$Factory$Impl bitcoinRouter$Factory$Impl = (BitcoinRouter$Factory$Impl) this.f$0;
                Navigator navigator3 = (Navigator) this.f$1;
                navigator3.getClass();
                LiteClientRouteRouter.MetroFactory metroFactory3 = bitcoinRouter$Factory$Impl.delegateFactory;
                RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) metroFactory3.wrappedFactory.value;
                Analytics analytics = (Analytics) metroFactory3.allowlistProvider.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory3.errorReporter.invoke();
                CoroutineContext coroutineContext = (CoroutineContext) metroFactory3.stringManager.invoke();
                realBitcoinInboundNavigator$Factory$Impl.getClass();
                analytics.getClass();
                factory.getClass();
                coroutineContext.getClass();
                return new BitcoinRouter(realBitcoinInboundNavigator$Factory$Impl, analytics, factory, coroutineContext, navigator3);
            case 4:
                DeprecatedRouter$Factory$Impl deprecatedRouter$Factory$Impl = (DeprecatedRouter$Factory$Impl) this.f$0;
                Navigator navigator4 = (Navigator) this.f$1;
                navigator4.getClass();
                ErrorReporter errorReporter = (ErrorReporter) deprecatedRouter$Factory$Impl.delegateFactory.staticImageLoader.invoke();
                errorReporter.getClass();
                return new DeprecatedRouter(errorReporter, navigator4);
            case 5:
                ExternalMapRouter$Factory$Impl externalMapRouter$Factory$Impl = (ExternalMapRouter$Factory$Impl) this.f$0;
                Navigator navigator5 = (Navigator) this.f$1;
                navigator5.getClass();
                IntentLauncher intentLauncher = (IntentLauncher) externalMapRouter$Factory$Impl.delegateFactory.sandboxer.invoke();
                intentLauncher.getClass();
                return new ExternalMapRouter(intentLauncher, navigator5);
            case 6:
                RealTreehouseConfigurationStore realTreehouseConfigurationStore = (RealTreehouseConfigurationStore) this.f$0;
                return ((TreehouseModule$provideCashTreehouseAppFactory$1) this.f$1).create(realTreehouseConfigurationStore.manifestUrlFlow("activity"), "activity", new TreehouseFlows$$ExternalSyntheticLambda0(realTreehouseConfigurationStore, 2));
            case 7:
                ((Application) ((ConnectionPool) this.f$0).delegate).unregisterActivityLifecycleCallbacks((AndroidAppProcessInfo$activityLifecycleEvents$1$callback$1) this.f$1);
                return Unit.INSTANCE;
            case 8:
                ((NotificationPhotoLookupKeyRegistry) this.f$0).activeProviders.remove((NotificationPhotoLookupKeyProvider) this.f$1);
                return Unit.INSTANCE;
            case 9:
                ((ProfilePhotoUrlRegistry) this.f$0).activeProviders.remove((ProfilePhotoUrlProvider) this.f$1);
                return Unit.INSTANCE;
            case 10:
                Function1 function1 = (Function1) this.f$0;
                Context context = (Context) this.f$1;
                String str = Path.DIRECTORY_SEPARATOR;
                return Path.Companion.get((File) function1.invoke(context), true);
            case 11:
                return new RealHttpClient((Call.Factory) ((Provider) this.f$0).invoke(), (String) this.f$1);
            case 12:
                ((PreferenceFlow) this.f$0).preferences.unregisterOnSharedPreferenceChangeListener((PreferenceFlow$flow$1$$ExternalSyntheticLambda0) this.f$1);
                return Unit.INSTANCE;
            case 13:
                ((SharedPreferencesKeyValue) this.f$0).preferences.unregisterOnSharedPreferenceChangeListener((PreferenceFlow$flow$1$$ExternalSyntheticLambda0) this.f$1);
                return Unit.INSTANCE;
            case 14:
                return Tags.buildSerialDescriptor((String) this.f$0, PolymorphicKind.OPEN.INSTANCE$1, new SerialDescriptor[0], new SealedClassSerializer$$ExternalSyntheticLambda1((SealedClassSerializer) this.f$1, i));
            case 15:
                EnumSerializer enumSerializer = (EnumSerializer) this.f$0;
                String str2 = (String) this.f$1;
                EnumDescriptor enumDescriptor = (EnumDescriptor) enumSerializer.overriddenDescriptor;
                if (enumDescriptor == null) {
                    Enum[] enumArr = (Enum[]) enumSerializer.values;
                    enumDescriptor = new EnumDescriptor(str2, enumArr.length);
                    for (Enum r0 : enumArr) {
                        enumDescriptor.addElement(r0.name(), false);
                    }
                }
                return enumDescriptor;
            case 16:
                return Tags.buildSerialDescriptor((String) this.f$0, StructureKind.CLASS.INSTANCE$1, new SerialDescriptor[0], new Perfs$$ExternalSyntheticLambda2((EnumSerializer) this.f$1, 6));
            case 17:
                Http2Connection http2Connection = (Http2Connection) this.f$0;
                Http2Stream http2Stream = (Http2Stream) this.f$1;
                try {
                    http2Connection.listener.onStream(http2Stream);
                } catch (IOException e) {
                    Android10Platform android10Platform = Platform.platform;
                    Platform.platform.log(4, "Http2Connection.Listener failure for " + http2Connection.connectionName, e);
                    try {
                        http2Stream.close(ErrorCode.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return Unit.INSTANCE;
            case 18:
                KClassImpl$Data$$Lambda$0 kClassImpl$Data$$Lambda$0 = (KClassImpl$Data$$Lambda$0) this.f$0;
                Settings settings = (Settings) this.f$1;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Http2Connection http2Connection2 = (Http2Connection) kClassImpl$Data$$Lambda$0.arg$1;
                synchronized (http2Connection2.writer) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.peerSettings;
                            Settings settings3 = new Settings();
                            settings2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & settings2.set) != 0) {
                                    settings3.set(i2, settings2.values[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & settings.set) != 0) {
                                    settings3.set(i3, settings.values[i3]);
                                }
                            }
                            ref$ObjectRef.element = settings3;
                            initialWindowSize = settings3.getInitialWindowSize() - settings2.getInitialWindowSize();
                            if (initialWindowSize != 0 && !http2Connection2.streams.isEmpty()) {
                                http2StreamArr = (Http2Stream[]) http2Connection2.streams.values().toArray(new Http2Stream[0]);
                            }
                            Settings settings4 = (Settings) ref$ObjectRef.element;
                            settings4.getClass();
                            http2Connection2.peerSettings = settings4;
                            TaskQueue.execute$default(http2Connection2.settingsListenerQueue, http2Connection2.connectionName + " onSettings", 0L, new InteractionRuleClient$$ExternalSyntheticLambda0(19, http2Connection2, ref$ObjectRef), 6);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        http2Connection2.writer.applyAndAckSettings((Settings) ref$ObjectRef.element);
                    } catch (IOException e2) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection2.close$okhttp(errorCode, errorCode, e2);
                    }
                }
                if (http2StreamArr != null) {
                    int length = http2StreamArr.length;
                    while (i < length) {
                        Http2Stream http2Stream2 = http2StreamArr[i];
                        synchronized (http2Stream2) {
                            http2Stream2.writeBytesMaximum += initialWindowSize;
                            if (initialWindowSize > 0) {
                                http2Stream2.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return Unit.INSTANCE;
            default:
                Http2Connection http2Connection3 = (Http2Connection) this.f$0;
                http2Connection3.listener.onSettings(http2Connection3, (Settings) ((Ref$ObjectRef) this.f$1).element);
                return Unit.INSTANCE;
        }
    }
}
