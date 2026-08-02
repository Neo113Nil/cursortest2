package com.squareup.cash.ui.gcm;

import android.app.Application;
import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import app.cash.api.ApiResult;
import app.cash.cdp.api.FlushStrategy;
import app.cash.cdp.backend.jvm.FlushStrategyCoordinator;
import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import app.cash.cdp.persistence.api.Event;
import app.cash.cdp.persistence.repository.PersistedEventRepository;
import app.cash.molecule.GatedFrameClock;
import app.cash.sqldelight.BaseTransacterImpl$$ExternalSyntheticLambda1;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.bugsnag.android.Client;
import com.google.android.gms.measurement.internal.zzky;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.persistence.FlaggedSyncEntityStore;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.data.ClearAppUserDataApplicationWorker;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.ClientRoutingConfig;
import com.squareup.cash.db2.profile.ProfileToken;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.featureflags.RealLoginFeatureFlagsHandler;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.localization.LanguageManagerKt;
import com.squareup.cash.localization.RealLanguageManager;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore$1$1;
import com.squareup.cash.support.screenshot.OverlayState;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotState;
import com.squareup.cash.ui.ScreenshotReportingManager;
import com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource;
import com.squareup.cash.util.cache.Cache;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.android.CashBackupAgent;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.UnitSetupTeardown;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutorKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import papa.SafeTrace;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealGcmRegistrar$unregister$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ Object this$0;

    /* renamed from: com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ RealGcmRegistrar this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(RealGcmRegistrar realGcmRegistrar, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = realGcmRegistrar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            RealGcmRegistrar realGcmRegistrar = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(realGcmRegistrar, continuation, 0);
                default:
                    return new AnonymousClass1(realGcmRegistrar, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            RealGcmRegistrar realGcmRegistrar = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyValue keyValue = realGcmRegistrar.osPushSettingEnabled;
                        this.label = 1;
                        if (keyValue.delete(this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ByteString.Companion companion = realGcmRegistrar.firebaseGcm;
                        this.label = 1;
                        if (companion.unInstallFirebase(this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGcmRegistrar$unregister$2(SharedPreferencesKeyValue sharedPreferencesKeyValue, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 28;
        this.this$0 = sharedPreferencesKeyValue;
        this.L$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$2 = new RealGcmRegistrar$unregister$2((RealGcmRegistrar) obj2, continuation, 0);
                realGcmRegistrar$unregister$2.L$0 = obj;
                return realGcmRegistrar$unregister$2;
            case 1:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$22 = new RealGcmRegistrar$unregister$2((CursorAnimationState) obj2, continuation, 1);
                realGcmRegistrar$unregister$22.L$0 = obj;
                return realGcmRegistrar$unregister$22;
            case 2:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$23 = new RealGcmRegistrar$unregister$2((TextFieldSelectionState) obj2, continuation, 2);
                realGcmRegistrar$unregister$23.L$0 = obj;
                return realGcmRegistrar$unregister$23;
            case 3:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$24 = new RealGcmRegistrar$unregister$2((Set) obj2, continuation, 3);
                realGcmRegistrar$unregister$24.L$0 = obj;
                return realGcmRegistrar$unregister$24;
            case 4:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$25 = new RealGcmRegistrar$unregister$2((Function2) obj2, continuation, 4);
                realGcmRegistrar$unregister$25.L$0 = obj;
                return realGcmRegistrar$unregister$25;
            case 5:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$26 = new RealGcmRegistrar$unregister$2(continuation, (FlushStrategyCoordinator) obj2, 5);
                realGcmRegistrar$unregister$26.L$0 = obj;
                return realGcmRegistrar$unregister$26;
            case 6:
                return new RealGcmRegistrar$unregister$2((PersistedEventRepository) this.L$0, (Event) obj2, continuation, 6);
            case 7:
                return new RealGcmRegistrar$unregister$2((PersistedEventRepository) this.L$0, (LinkedHashSet) obj2, continuation, 7);
            case 8:
                return new RealGcmRegistrar$unregister$2((VariantSandboxedComponent.Impl) this.L$0, (Application) obj2, continuation, 8);
            case 9:
                return new RealGcmRegistrar$unregister$2((ResponseContext) this.L$0, (RealServiceContextManager) obj2, continuation, 9);
            case 10:
                return new RealGcmRegistrar$unregister$2((RealServiceContextManager) this.L$0, (RequestContext) obj2, continuation, 10);
            case 11:
                return new RealGcmRegistrar$unregister$2((RealInAppNotificationPresenter) this.L$0, (MutableState) obj2, continuation, 11);
            case 12:
                return new RealGcmRegistrar$unregister$2((RealTooltipAppMessagePresenter) this.L$0, (MutableState) obj2, continuation, 12);
            case 13:
                return new RealGcmRegistrar$unregister$2((RegisterAliasViewModel) this.L$0, (TextFieldState) obj2, continuation, 13);
            case 14:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$27 = new RealGcmRegistrar$unregister$2((MutableState) obj2, continuation, 14);
                realGcmRegistrar$unregister$27.L$0 = obj;
                return realGcmRegistrar$unregister$27;
            case 15:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$28 = new RealGcmRegistrar$unregister$2((RealSelectiveUnrecognizedURLNavigator) obj2, continuation, 15);
                realGcmRegistrar$unregister$28.L$0 = obj;
                return realGcmRegistrar$unregister$28;
            case 16:
                return new RealGcmRegistrar$unregister$2((FlaggedSyncEntityStore) this.L$0, (SyncEntityType) obj2, continuation, 16);
            case 17:
                return new RealGcmRegistrar$unregister$2((AcceptableScrim) this.L$0, (ScrimScreen) obj2, continuation, 17);
            case 18:
                return new RealGcmRegistrar$unregister$2((RealLoginFeatureFlagsHandler) this.L$0, (List) obj2, continuation, 18);
            case 19:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$29 = new RealGcmRegistrar$unregister$2((RealEntityPriceRefresher) obj2, continuation, 19);
                realGcmRegistrar$unregister$29.L$0 = obj;
                return realGcmRegistrar$unregister$29;
            case 20:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$210 = new RealGcmRegistrar$unregister$2((RealInvestingSyncer) obj2, continuation, 20);
                realGcmRegistrar$unregister$210.L$0 = obj;
                return realGcmRegistrar$unregister$210;
            case 21:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$211 = new RealGcmRegistrar$unregister$2(continuation, (CdpConfigUpdateSetupTeardown) obj2, 21);
                realGcmRegistrar$unregister$211.L$0 = obj;
                return realGcmRegistrar$unregister$211;
            case 22:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$212 = new RealGcmRegistrar$unregister$2((RealRegionProvider) obj2, continuation, 22);
                realGcmRegistrar$unregister$212.L$0 = obj;
                return realGcmRegistrar$unregister$212;
            case 23:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$213 = new RealGcmRegistrar$unregister$2((RealMarketCapabilitiesManager) obj2, continuation, 23);
                realGcmRegistrar$unregister$213.L$0 = obj;
                return realGcmRegistrar$unregister$213;
            case 24:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$214 = new RealGcmRegistrar$unregister$2((RealRecordedMessagesStore) obj2, continuation, 24);
                realGcmRegistrar$unregister$214.L$0 = obj;
                return realGcmRegistrar$unregister$214;
            case 25:
                return new RealGcmRegistrar$unregister$2((MutableState) this.L$0, (MutableState) obj2, continuation, 25);
            case 26:
                RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$215 = new RealGcmRegistrar$unregister$2((ClearAppUserDataApplicationWorker) obj2, continuation, 26);
                realGcmRegistrar$unregister$215.L$0 = obj;
                return realGcmRegistrar$unregister$215;
            case 27:
                return new RealGcmRegistrar$unregister$2((DiskUserJourneyDataSource) this.L$0, (Set) obj2, continuation, 27);
            case 28:
                return new RealGcmRegistrar$unregister$2((SharedPreferencesKeyValue) obj2, this.L$0, continuation);
            default:
                return new RealGcmRegistrar$unregister$2((String) this.L$0, (RealBackupService) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealGcmRegistrar$unregister$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object carryForwardTimeOrCreate;
        int i = 10;
        int i2 = 8;
        int i3 = 4;
        int i4 = 12;
        int i5 = 2;
        boolean z = true;
        r7 = true;
        boolean z2 = true;
        r7 = true;
        boolean z3 = true;
        int i6 = 3;
        int i7 = 0;
        FileOutputStream fileOutputStream = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealGcmRegistrar realGcmRegistrar = (RealGcmRegistrar) this.this$0;
                realGcmRegistrar.gcmToken.delete();
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(realGcmRegistrar, r10, i7), 3);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CursorAnimationState cursorAnimationState = (CursorAnimationState) this.this$0;
                AtomicReference atomicReference = cursorAnimationState.animationJob;
                StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope2, null, null, new GatedFrameClock.AnonymousClass1((Job) atomicReference.getAndSet(null), cursorAnimationState, r10, i3), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, launch$default)) {
                        if (atomicReference.get() != null) {
                            z = false;
                        }
                    }
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.this$0;
                JobKt.launch$default(coroutineScope3, null, null, new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(textFieldSelectionState, r10, true ? 1 : 0), 3);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set keySet = ((Preferences) this.L$0).asMap().keySet();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Preferences.Key) it.next()).name);
                }
                Set set = (Set) this.this$0;
                if (set != SharedPreferencesMigrationKt.MIGRATE_ALL_KEYS) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                    }
                    z3 = false;
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(ContinuationInterceptor.Key);
                element.getClass();
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) element;
                CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
                JobKt.launch(GlobalScope.INSTANCE, continuationInterceptor, CoroutineStart.UNDISPATCHED, new DataStoreImpl$data$1(completableDeferredImpl, (Function2) this.this$0, r10, i));
                while (!completableDeferredImpl.isCompleted()) {
                    try {
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                break;
            case 5:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FlushStrategyCoordinator flushStrategyCoordinator = (FlushStrategyCoordinator) this.this$0;
                Iterator it3 = flushStrategyCoordinator.flushStrategies.iterator();
                while (it3.hasNext()) {
                    JobKt.launch$default(coroutineScope4, null, CoroutineStart.UNDISPATCHED, new GatedFrameClock.AnonymousClass1(flushStrategyCoordinator, (FlushStrategy) it3.next(), r10, 18), 1);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    SessionQueries sessionQueries = ((PersistedEventRepository) this.L$0).queries;
                    Event event = (Event) this.this$0;
                    final String str = event.id;
                    final long j = event.recordedAt;
                    final byte[] bArr = event.payload;
                    sessionQueries.getClass();
                    str.getClass();
                    bArr.getClass();
                    QueryResult execute = sessionQueries.driver.execute(-1531899830, "INSERT INTO analytics_message (message_uuid, recorded_at, payload)\nVALUES (?, ?, ?)", new Function1() { // from class: app.cash.cdp.persistence.db2.AnalyticsMessageQueries$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            AndroidStatement androidStatement = (AndroidStatement) obj2;
                            androidStatement.getClass();
                            androidStatement.bindString(0, str);
                            androidStatement.bindLong(1, Long.valueOf(j));
                            androidStatement.bindBytes(2, bArr);
                            return Unit.INSTANCE;
                        }
                    });
                    sessionQueries.notifyQueries(-1531899830, new TransactorKt$$ExternalSyntheticLambda0(28));
                    break;
                } catch (Exception e) {
                    Timber.Forest.e("Unable to persist given event", new Object[0], e);
                    return Unit.INSTANCE;
                }
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PersistedEventRepository persistedEventRepository = (PersistedEventRepository) this.L$0;
                SessionQueries sessionQueries2 = persistedEventRepository.oldQueries;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.this$0;
                sessionQueries2.getClass();
                String createArguments = TransacterImpl.createArguments(linkedHashSet.size());
                SqlDriver sqlDriver = sessionQueries2.driver;
                String trimMargin$default = StringsKt__IndentKt.trimMargin$default("\n        |DELETE FROM analytics_message\n        |WHERE message_uuid IN " + createArguments + "\n        ");
                linkedHashSet.size();
                sqlDriver.execute(null, trimMargin$default, new BaseTransacterImpl$$ExternalSyntheticLambda1(linkedHashSet, 1));
                sessionQueries2.notifyQueries(-1956705732, new TransactorKt$$ExternalSyntheticLambda0(27));
                SessionQueries sessionQueries3 = persistedEventRepository.queries;
                sessionQueries3.getClass();
                String createArguments2 = TransacterImpl.createArguments(linkedHashSet.size());
                SqlDriver sqlDriver2 = sessionQueries3.driver;
                String trimMargin$default2 = StringsKt__IndentKt.trimMargin$default("\n        |DELETE FROM analytics_message\n        |WHERE message_uuid IN " + createArguments2 + "\n        ");
                linkedHashSet.size();
                QueryResult execute2 = sqlDriver2.execute(null, trimMargin$default2, new BaseTransacterImpl$$ExternalSyntheticLambda1(linkedHashSet, 2));
                sessionQueries3.notifyQueries(1342729466, new TransactorKt$$ExternalSyntheticLambda0(29));
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ScreenshotReportingManager screenshotReportingManager = (ScreenshotReportingManager) ((VariantSandboxedComponent.Impl) this.L$0).screenshotReportingManagerProvider.getValue();
                Application application = (Application) this.this$0;
                screenshotReportingManager.getClass();
                application.getClass();
                zzky zzkyVar = new zzky(screenshotReportingManager, i5);
                application.registerActivityLifecycleCallbacks(zzkyVar);
                screenshotReportingManager.activityTracker = zzkyVar;
                CoroutineScope coroutineScope5 = screenshotReportingManager.scope;
                Job job = (Job) coroutineScope5.getCoroutineContext().get(Job.Key.$$INSTANCE);
                if (job != null) {
                    job.invokeOnCompletion(new ViewTreeObservers$$ExternalSyntheticLambda3(11, screenshotReportingManager, application));
                }
                JobKt.launch$default(coroutineScope5, null, null, new Cache.AnonymousClass1(screenshotReportingManager, r10, i2), 3);
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Country country = ((ResponseContext) this.L$0).country_code;
                if (country != null) {
                    ((RealServiceContextManager) this.this$0).regionProvider.country.blockingSet(country);
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealServiceContextManager realServiceContextManager = (RealServiceContextManager) this.L$0;
                PaymentManager paymentManager = (PaymentManager) realServiceContextManager.paymentManager.getValue();
                Set set3 = CollectionsKt.toSet(((RequestContext) this.this$0).payment_tokens);
                RealPaymentManager realPaymentManager = (RealPaymentManager) paymentManager;
                realPaymentManager.getClass();
                set3.getClass();
                realPaymentManager.pendingPaymentTokens.addAll(set3);
                RequestContext requestContext = (RequestContext) this.this$0;
                ProfileToken profileToken = (ProfileToken) realServiceContextManager.profileQueries.profileToken().executeAsOneOrNull();
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InAppNotificationModel inAppNotificationModel = (InAppNotificationModel) ((MutableState) this.this$0).getValue();
                if (inAppNotificationModel instanceof InAppNotificationModel.Ready) {
                    ((RealInAppNotificationPresenter) this.L$0).appMessageManager.reportMessageDelivery(((InAppNotificationModel.Ready) inAppNotificationModel).token);
                }
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TooltipAppMessageViewModel tooltipAppMessageViewModel = (TooltipAppMessageViewModel) ((MutableState) this.this$0).getValue();
                if (tooltipAppMessageViewModel instanceof TooltipAppMessageViewModel.Ready) {
                    TooltipAppMessageViewModel.Ready ready = (TooltipAppMessageViewModel.Ready) tooltipAppMessageViewModel;
                    if (!ready.isLocalTooltip) {
                        ((RealTooltipAppMessagePresenter) this.L$0).appMessageManager.reportMessageDelivery(ready.messageToken);
                    }
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RegisterAliasViewModel) this.L$0).getClass();
                break;
            case 14:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) produceStateScope.getValue()).booleanValue() && !((Boolean) ((MutableState) this.this$0).getValue()).booleanValue()) {
                    z2 = false;
                }
                produceStateScope.setValue(Boolean.valueOf(z2));
                break;
            case 15:
                ClientRoutingConfig clientRoutingConfig = (ClientRoutingConfig) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealSelectiveUnrecognizedURLNavigator) this.this$0).clientRoutingConfig = clientRoutingConfig;
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AcceptableScrim) this.L$0).settledScrimState.setValue((ScrimScreen) this.this$0);
                break;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                r1.cashDatabase.transactionWithWrapper(new ViewTreeObservers$$ExternalSyntheticLambda3(i2, (List) this.this$0, (RealLoginFeatureFlagsHandler) this.L$0));
                break;
            case 19:
                ApiResult apiResult = (ApiResult) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealEntityPriceRefresher realEntityPriceRefresher = (RealEntityPriceRefresher) this.this$0;
                StateFlowImpl stateFlowImpl = realEntityPriceRefresher.networkStatus;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        carryForwardTimeOrCreate = KTypeSubstitutorKt.carryForwardTimeOrCreate((NetworkStatus) stateFlowImpl.getValue(), new RealGooglePayer$$ExternalSyntheticLambda0(realEntityPriceRefresher, i4));
                    }
                } else {
                    carryForwardTimeOrCreate = NetworkStatus.Available.INSTANCE;
                }
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, carryForwardTimeOrCreate);
                break;
            case 20:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope6, null, null, new CashApp$onCreate$4$1$1((RealInvestingSyncer) this.this$0, r10, 26), 3);
                break;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown = (CdpConfigUpdateSetupTeardown) this.this$0;
                LanguageManagerKt.updateLocaleConfig((RealLanguageManager) cdpConfigUpdateSetupTeardown.cdpConfigurationProvider, (Context) cdpConfigUpdateSetupTeardown.featureFlagManager);
                break;
            case 22:
                SelectRegion selectRegion = (SelectRegion) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealRegionProvider) this.this$0).profileRegion = selectRegion.region;
                break;
            case 23:
                List list = (List) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealMarketCapabilitiesManager) this.this$0).currentCapabilities = list;
                break;
            case 24:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealRecordedMessagesStore realRecordedMessagesStore = (RealRecordedMessagesStore) this.this$0;
                JobKt.launch$default(coroutineScope7, null, null, new RealRecordedMessagesStore$1$1(realRecordedMessagesStore, r10, i7), 3);
                JobKt.launch$default(coroutineScope7, null, null, new RealRecordedMessagesStore$1$1(realRecordedMessagesStore, r10, i6), 3);
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) this.L$0;
                ((MutableState) this.this$0).setValue(((ScreenshotManager$ScreenshotState) mutableState.getValue()).lastScreenshotResult != null ? OverlayState.SHOW_SCREENSHOT_RESULT : ((ScreenshotManager$ScreenshotState) mutableState.getValue()).screenshotControlsVisible ? OverlayState.SCREENSHOT_CONTROLS_DISPLAYED : OverlayState.OVERLAY_HIDDEN);
                break;
            case 26:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ClearAppUserDataApplicationWorker clearAppUserDataApplicationWorker = (ClearAppUserDataApplicationWorker) this.this$0;
                Countries.onEachSandboxComponentExt(clearAppUserDataApplicationWorker.context, coroutineScope8, new Client.AnonymousClass1(new ComposerKt$$ExternalSyntheticLambda0(clearAppUserDataApplicationWorker, i4), i3));
                break;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DiskUserJourneyDataSource diskUserJourneyDataSource = (DiskUserJourneyDataSource) this.L$0;
                GrpcMethod grpcMethod = diskUserJourneyDataSource.journeysFile;
                String serialize = diskUserJourneyDataSource.serialize((Set) this.this$0);
                try {
                    fileOutputStream = grpcMethod.startWrite();
                    byte[] bytes = serialize.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    fileOutputStream.write(bytes);
                    grpcMethod.finishWrite(fileOutputStream);
                } catch (IOException e2) {
                    if (fileOutputStream != null) {
                        grpcMethod.failWrite(fileOutputStream);
                    }
                    Timber.Forest.e("Error writing journey file", new Object[0], e2);
                }
                diskUserJourneyDataSource.onPersistenceChanged(serialize);
                break;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((SharedPreferencesKeyValue) this.this$0).blockingSet(this.L$0);
                break;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Timber.Forest forest = Timber.Forest;
                String str2 = (String) this.L$0;
                forest.i(Recorder$$ExternalSyntheticOutline2.m("Writing backup tag ", str2), new Object[0]);
                Object obj2 = CashBackupAgent.lock;
                RealBackupService realBackupService = (RealBackupService) this.this$0;
                DimensionKt.withBackupFile(realBackupService.context, new ImageKt$$ExternalSyntheticLambda0(str2, 17));
                realBackupService.backupManager.dataChanged();
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealGcmRegistrar$unregister$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealGcmRegistrar$unregister$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealGcmRegistrar$unregister$2(Continuation continuation, UnitSetupTeardown unitSetupTeardown, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = unitSetupTeardown;
    }
}
