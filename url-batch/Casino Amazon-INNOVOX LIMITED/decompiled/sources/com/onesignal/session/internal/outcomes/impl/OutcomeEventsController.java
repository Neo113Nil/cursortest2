package com.onesignal.session.internal.outcomes.impl;

import androidx.core.app.NotificationCompat;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.IInfluenceManager;
import com.onesignal.session.internal.influence.Influence;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OutcomeEventsController.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J,\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082@¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020#H\u0016J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0016\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020#H\u0002J\u0010\u0010/\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0002J6\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020&2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082@¢\u0006\u0002\u00105J\u0018\u00106\u001a\u0004\u0018\u0001012\u0006\u0010\u001f\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u00107J \u00108\u001a\u0004\u0018\u0001012\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u000e\u0010<\u001a\u00020#H\u0082@¢\u0006\u0002\u0010=J\u0018\u0010>\u001a\u0004\u0018\u0001012\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010?J\u0018\u0010@\u001a\u0004\u0018\u0001012\u0006\u0010\u001f\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u00107J&\u0010@\u001a\u0004\u0018\u0001012\u0006\u0010\u001f\u001a\u00020\u001b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082@¢\u0006\u0002\u0010!J\u0018\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020CH\u0002J\b\u0010F\u001a\u00020#H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/onesignal/session/internal/outcomes/impl/OutcomeEventsController;", "Lcom/onesignal/session/internal/outcomes/IOutcomeEventsController;", "Lcom/onesignal/core/internal/startup/IStartableService;", "Lcom/onesignal/session/internal/session/ISessionLifecycleHandler;", "_session", "Lcom/onesignal/session/internal/session/ISessionService;", "_influenceManager", "Lcom/onesignal/session/internal/influence/IInfluenceManager;", "_outcomeEventsCache", "Lcom/onesignal/session/internal/outcomes/impl/IOutcomeEventsRepository;", "_outcomeEventsPreferences", "Lcom/onesignal/session/internal/outcomes/impl/IOutcomeEventsPreferences;", "_outcomeEventsBackend", "Lcom/onesignal/session/internal/outcomes/impl/IOutcomeEventsBackendService;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "_subscriptionManager", "Lcom/onesignal/user/internal/subscriptions/ISubscriptionManager;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "(Lcom/onesignal/session/internal/session/ISessionService;Lcom/onesignal/session/internal/influence/IInfluenceManager;Lcom/onesignal/session/internal/outcomes/impl/IOutcomeEventsRepository;Lcom/onesignal/session/internal/outcomes/impl/IOutcomeEventsPreferences;Lcom/onesignal/session/internal/outcomes/impl/IOutcomeEventsBackendService;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/subscriptions/ISubscriptionManager;Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/core/internal/time/ITime;)V", "unattributedUniqueOutcomeEventsSentOnSession", "", "", "getUniqueIds", "", "Lcom/onesignal/session/internal/influence/Influence;", "name", "influences", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSessionActive", "", "onSessionEnded", "duration", "", "onSessionStarted", "removeDisabledInfluences", "requestMeasureOutcomeEvent", "eventParams", "Lcom/onesignal/session/internal/outcomes/impl/OutcomeEventParams;", "(Lcom/onesignal/session/internal/outcomes/impl/OutcomeEventParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAttributedUniqueOutcomeNotifications", "saveUnattributedUniqueOutcomeEvents", "saveUniqueOutcome", "sendAndCreateOutcomeEvent", "Lcom/onesignal/session/internal/outcomes/impl/OutcomeEvent;", "weight", "", "sessionTime", "(Ljava/lang/String;FJLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOutcomeEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOutcomeEventWithValue", "(Ljava/lang/String;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSavedOutcomeEvent", NotificationCompat.CATEGORY_EVENT, "sendSavedOutcomes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSessionEndOutcomeEvent", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUniqueOutcomeEvent", "sessionInfluences", "setSourceChannelIds", "Lcom/onesignal/session/internal/outcomes/impl/OutcomeSourceBody;", "influence", "sourceBody", ViewProps.START, BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OutcomeEventsController implements IOutcomeEventsController, IStartableService, ISessionLifecycleHandler {
    private final ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final IdentityModelStore _identityModelStore;
    private final IInfluenceManager _influenceManager;
    private final IOutcomeEventsBackendService _outcomeEventsBackend;
    private final IOutcomeEventsRepository _outcomeEventsCache;
    private final IOutcomeEventsPreferences _outcomeEventsPreferences;
    private final ISessionService _session;
    private final ISubscriptionManager _subscriptionManager;
    private final ITime _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    /* compiled from: OutcomeEventsController.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfluenceType.values().length];
            try {
                iArr[InfluenceType.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfluenceType.INDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfluenceType.UNATTRIBUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfluenceType.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfluenceChannel.values().length];
            try {
                iArr2[InfluenceChannel.IAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InfluenceChannel.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long duration) {
    }

    public OutcomeEventsController(ISessionService _session, IInfluenceManager _influenceManager, IOutcomeEventsRepository _outcomeEventsCache, IOutcomeEventsPreferences _outcomeEventsPreferences, IOutcomeEventsBackendService _outcomeEventsBackend, ConfigModelStore _configModelStore, IdentityModelStore _identityModelStore, ISubscriptionManager _subscriptionManager, IDeviceService _deviceService, ITime _time) {
        LinkedHashSet mutableSet;
        Intrinsics.checkNotNullParameter(_session, "_session");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_outcomeEventsCache, "_outcomeEventsCache");
        Intrinsics.checkNotNullParameter(_outcomeEventsPreferences, "_outcomeEventsPreferences");
        Intrinsics.checkNotNullParameter(_outcomeEventsBackend, "_outcomeEventsBackend");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._session = _session;
        this._influenceManager = _influenceManager;
        this._outcomeEventsCache = _outcomeEventsCache;
        this._outcomeEventsPreferences = _outcomeEventsPreferences;
        this._outcomeEventsBackend = _outcomeEventsBackend;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._time = _time;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = _outcomeEventsPreferences.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = (unattributedUniqueOutcomeEventsSentByChannel == null || (mutableSet = CollectionsKt.toMutableSet(unattributedUniqueOutcomeEventsSentByChannel)) == null) ? new LinkedHashSet() : mutableSet;
        _session.subscribe(this);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        ThreadUtilsKt.suspendifyOnIO(new OutcomeEventsController$start$1(this, null));
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        Logging.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomes(Continuation<? super Unit> continuation) {
        OutcomeEventsController$sendSavedOutcomes$1 outcomeEventsController$sendSavedOutcomes$1;
        int i;
        OutcomeEventsController outcomeEventsController;
        OutcomeEventsController outcomeEventsController2;
        Iterator it;
        if (continuation instanceof OutcomeEventsController$sendSavedOutcomes$1) {
            outcomeEventsController$sendSavedOutcomes$1 = (OutcomeEventsController$sendSavedOutcomes$1) continuation;
            if ((outcomeEventsController$sendSavedOutcomes$1.label & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$sendSavedOutcomes$1.label -= Integer.MIN_VALUE;
                Object obj = outcomeEventsController$sendSavedOutcomes$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = outcomeEventsController$sendSavedOutcomes$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IOutcomeEventsRepository iOutcomeEventsRepository = this._outcomeEventsCache;
                    outcomeEventsController$sendSavedOutcomes$1.L$0 = this;
                    outcomeEventsController$sendSavedOutcomes$1.label = 1;
                    obj = iOutcomeEventsRepository.getAllEventsToSend(outcomeEventsController$sendSavedOutcomes$1);
                    if (obj != coroutine_suspended) {
                        outcomeEventsController = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) outcomeEventsController$sendSavedOutcomes$1.L$1;
                    outcomeEventsController2 = (OutcomeEventsController) outcomeEventsController$sendSavedOutcomes$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        OutcomeEventParams outcomeEventParams = (OutcomeEventParams) it.next();
                        outcomeEventsController$sendSavedOutcomes$1.L$0 = outcomeEventsController2;
                        outcomeEventsController$sendSavedOutcomes$1.L$1 = it;
                        outcomeEventsController$sendSavedOutcomes$1.label = 2;
                        if (outcomeEventsController2.sendSavedOutcomeEvent(outcomeEventParams, outcomeEventsController$sendSavedOutcomes$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                outcomeEventsController = (OutcomeEventsController) outcomeEventsController$sendSavedOutcomes$1.L$0;
                ResultKt.throwOnFailure(obj);
                outcomeEventsController2 = outcomeEventsController;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        outcomeEventsController$sendSavedOutcomes$1 = new OutcomeEventsController$sendSavedOutcomes$1(this, continuation);
        Object obj2 = outcomeEventsController$sendSavedOutcomes$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = outcomeEventsController$sendSavedOutcomes$1.label;
        if (i != 0) {
        }
        outcomeEventsController2 = outcomeEventsController;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(2:20|21))(5:25|26|27|(1:29)|24)|22))|39|6|7|(0)(0)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0052, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomeEvent(OutcomeEventParams outcomeEventParams, Continuation<? super Unit> continuation) {
        OutcomeEventsController$sendSavedOutcomeEvent$1 outcomeEventsController$sendSavedOutcomeEvent$1;
        OutcomeEventsController outcomeEventsController;
        OutcomeEventsController outcomeEventsController2;
        if (continuation instanceof OutcomeEventsController$sendSavedOutcomeEvent$1) {
            outcomeEventsController$sendSavedOutcomeEvent$1 = (OutcomeEventsController$sendSavedOutcomeEvent$1) continuation;
            if ((outcomeEventsController$sendSavedOutcomeEvent$1.label & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$sendSavedOutcomeEvent$1.label -= Integer.MIN_VALUE;
                Object obj = outcomeEventsController$sendSavedOutcomeEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                outcomeEventsController = outcomeEventsController$sendSavedOutcomeEvent$1.label;
                if (outcomeEventsController != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        outcomeEventsController$sendSavedOutcomeEvent$1.L$0 = this;
                        outcomeEventsController$sendSavedOutcomeEvent$1.L$1 = outcomeEventParams;
                        outcomeEventsController$sendSavedOutcomeEvent$1.label = 1;
                        if (requestMeasureOutcomeEvent(outcomeEventParams, outcomeEventsController$sendSavedOutcomeEvent$1) != coroutine_suspended) {
                            outcomeEventsController2 = this;
                        }
                    } catch (BackendException e) {
                        e = e;
                        outcomeEventsController = this;
                        NetworkUtils.ResponseStatusType responseStatusType = NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode());
                        String str = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: " + outcomeEventParams.getOutcomeId() + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                        if (responseStatusType == NetworkUtils.ResponseStatusType.RETRYABLE) {
                            Logging.info$default(str + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                        } else {
                            Logging.warn$default(str + " Outcome event will be omitted!", null, 2, null);
                            IOutcomeEventsRepository iOutcomeEventsRepository = outcomeEventsController._outcomeEventsCache;
                            outcomeEventsController$sendSavedOutcomeEvent$1.L$0 = null;
                            outcomeEventsController$sendSavedOutcomeEvent$1.L$1 = null;
                            outcomeEventsController$sendSavedOutcomeEvent$1.label = 3;
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (outcomeEventsController != 1) {
                    if (outcomeEventsController == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (outcomeEventsController != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                outcomeEventParams = (OutcomeEventParams) outcomeEventsController$sendSavedOutcomeEvent$1.L$1;
                outcomeEventsController2 = (OutcomeEventsController) outcomeEventsController$sendSavedOutcomeEvent$1.L$0;
                ResultKt.throwOnFailure(obj);
                IOutcomeEventsRepository iOutcomeEventsRepository2 = outcomeEventsController2._outcomeEventsCache;
                outcomeEventsController$sendSavedOutcomeEvent$1.L$0 = outcomeEventsController2;
                outcomeEventsController$sendSavedOutcomeEvent$1.L$1 = outcomeEventParams;
                outcomeEventsController$sendSavedOutcomeEvent$1.label = 2;
            }
        }
        outcomeEventsController$sendSavedOutcomeEvent$1 = new OutcomeEventsController$sendSavedOutcomeEvent$1(this, continuation);
        Object obj2 = outcomeEventsController$sendSavedOutcomeEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        outcomeEventsController = outcomeEventsController$sendSavedOutcomeEvent$1.label;
        if (outcomeEventsController != 0) {
        }
        IOutcomeEventsRepository iOutcomeEventsRepository22 = outcomeEventsController2._outcomeEventsCache;
        outcomeEventsController$sendSavedOutcomeEvent$1.L$0 = outcomeEventsController2;
        outcomeEventsController$sendSavedOutcomeEvent$1.L$1 = outcomeEventParams;
        outcomeEventsController$sendSavedOutcomeEvent$1.label = 2;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendSessionEndOutcomeEvent(long j, Continuation<? super OutcomeEvent> continuation) {
        return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j, this._influenceManager.getInfluences(), continuation);
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendUniqueOutcomeEvent(String str, Continuation<? super OutcomeEvent> continuation) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), continuation);
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendOutcomeEvent(String str, Continuation<? super OutcomeEvent> continuation) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), continuation);
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendOutcomeEventWithValue(String str, float f, Continuation<? super OutcomeEvent> continuation) {
        return sendAndCreateOutcomeEvent(str, f, 0L, this._influenceManager.getInfluences(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendUniqueOutcomeEvent(String str, List<Influence> list, Continuation<? super OutcomeEvent> continuation) {
        OutcomeEventsController$sendUniqueOutcomeEvent$2 outcomeEventsController$sendUniqueOutcomeEvent$2;
        int i;
        List<Influence> removeDisabledInfluences;
        OutcomeEventsController outcomeEventsController;
        List<Influence> list2;
        if (continuation instanceof OutcomeEventsController$sendUniqueOutcomeEvent$2) {
            outcomeEventsController$sendUniqueOutcomeEvent$2 = (OutcomeEventsController$sendUniqueOutcomeEvent$2) continuation;
            if ((outcomeEventsController$sendUniqueOutcomeEvent$2.label & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$sendUniqueOutcomeEvent$2.label -= Integer.MIN_VALUE;
                OutcomeEventsController$sendUniqueOutcomeEvent$2 outcomeEventsController$sendUniqueOutcomeEvent$22 = outcomeEventsController$sendUniqueOutcomeEvent$2;
                Object obj = outcomeEventsController$sendUniqueOutcomeEvent$22.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = outcomeEventsController$sendUniqueOutcomeEvent$22.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    removeDisabledInfluences = removeDisabledInfluences(list);
                    if (removeDisabledInfluences.isEmpty()) {
                        Logging.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                        return null;
                    }
                    Iterator<Influence> it = removeDisabledInfluences.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getInfluenceType().isAttributed()) {
                                outcomeEventsController$sendUniqueOutcomeEvent$22.L$0 = this;
                                outcomeEventsController$sendUniqueOutcomeEvent$22.L$1 = str;
                                outcomeEventsController$sendUniqueOutcomeEvent$22.L$2 = removeDisabledInfluences;
                                outcomeEventsController$sendUniqueOutcomeEvent$22.label = 1;
                                obj = getUniqueIds(str, removeDisabledInfluences, outcomeEventsController$sendUniqueOutcomeEvent$22);
                                if (obj != coroutine_suspended) {
                                    outcomeEventsController = this;
                                }
                            }
                        } else {
                            if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                                Logging.debug$default(StringsKt.trimIndent("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    Session: " + InfluenceType.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                                return null;
                            }
                            this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                            outcomeEventsController$sendUniqueOutcomeEvent$22.label = 3;
                            Object sendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, removeDisabledInfluences, outcomeEventsController$sendUniqueOutcomeEvent$22);
                            if (sendAndCreateOutcomeEvent != coroutine_suspended) {
                                return sendAndCreateOutcomeEvent;
                            }
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                List<Influence> list3 = (List) outcomeEventsController$sendUniqueOutcomeEvent$22.L$2;
                String str2 = (String) outcomeEventsController$sendUniqueOutcomeEvent$22.L$1;
                outcomeEventsController = (OutcomeEventsController) outcomeEventsController$sendUniqueOutcomeEvent$22.L$0;
                ResultKt.throwOnFailure(obj);
                removeDisabledInfluences = list3;
                str = str2;
                list2 = (List) obj;
                if (list2 != null) {
                    Logging.debug$default(StringsKt.trimIndent("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    SessionInfluences: " + removeDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                    return null;
                }
                outcomeEventsController$sendUniqueOutcomeEvent$22.L$0 = null;
                outcomeEventsController$sendUniqueOutcomeEvent$22.L$1 = null;
                outcomeEventsController$sendUniqueOutcomeEvent$22.L$2 = null;
                outcomeEventsController$sendUniqueOutcomeEvent$22.label = 2;
                Object sendAndCreateOutcomeEvent2 = outcomeEventsController.sendAndCreateOutcomeEvent(str, 0.0f, 0L, list2, outcomeEventsController$sendUniqueOutcomeEvent$22);
                return sendAndCreateOutcomeEvent2 == coroutine_suspended ? coroutine_suspended : sendAndCreateOutcomeEvent2;
            }
        }
        outcomeEventsController$sendUniqueOutcomeEvent$2 = new OutcomeEventsController$sendUniqueOutcomeEvent$2(this, continuation);
        OutcomeEventsController$sendUniqueOutcomeEvent$2 outcomeEventsController$sendUniqueOutcomeEvent$222 = outcomeEventsController$sendUniqueOutcomeEvent$2;
        Object obj2 = outcomeEventsController$sendUniqueOutcomeEvent$222.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = outcomeEventsController$sendUniqueOutcomeEvent$222.label;
        if (i != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAndCreateOutcomeEvent(String str, float f, long j, List<Influence> list, Continuation<? super OutcomeEvent> continuation) {
        OutcomeEventsController$sendAndCreateOutcomeEvent$1 outcomeEventsController$sendAndCreateOutcomeEvent$1;
        int i;
        String str2;
        long j2;
        OutcomeEventParams outcomeEventParams;
        OutcomeEventsController outcomeEventsController;
        String str3;
        NetworkUtils.ResponseStatusType responseStatusType;
        if (continuation instanceof OutcomeEventsController$sendAndCreateOutcomeEvent$1) {
            outcomeEventsController$sendAndCreateOutcomeEvent$1 = (OutcomeEventsController$sendAndCreateOutcomeEvent$1) continuation;
            if ((outcomeEventsController$sendAndCreateOutcomeEvent$1.label & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$sendAndCreateOutcomeEvent$1.label -= Integer.MIN_VALUE;
                Object obj = outcomeEventsController$sendAndCreateOutcomeEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = outcomeEventsController$sendAndCreateOutcomeEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
                    boolean z = false;
                    OutcomeSourceBody outcomeSourceBody = null;
                    OutcomeSourceBody outcomeSourceBody2 = null;
                    for (Influence influence : list) {
                        int i2 = WhenMappings.$EnumSwitchMapping$0[influence.getInfluenceType().ordinal()];
                        if (i2 == 1) {
                            if (outcomeSourceBody == null) {
                                outcomeSourceBody = new OutcomeSourceBody(null, null, 3, null);
                            }
                            outcomeSourceBody = setSourceChannelIds(influence, outcomeSourceBody);
                        } else if (i2 == 2) {
                            if (outcomeSourceBody2 == null) {
                                outcomeSourceBody2 = new OutcomeSourceBody(null, null, 3, null);
                            }
                            outcomeSourceBody2 = setSourceChannelIds(influence, outcomeSourceBody2);
                        } else if (i2 == 3) {
                            z = true;
                        } else if (i2 == 4) {
                            Logging.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + influence.getInfluenceChannel(), null, 2, null);
                        }
                    }
                    if (outcomeSourceBody == null && outcomeSourceBody2 == null && !z) {
                        Logging.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                        return null;
                    }
                    OutcomeEventParams outcomeEventParams2 = new OutcomeEventParams(str, new OutcomeSource(outcomeSourceBody, outcomeSourceBody2), f, j, 0L);
                    try {
                        outcomeEventsController$sendAndCreateOutcomeEvent$1.L$0 = this;
                        str2 = str;
                        try {
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$1 = str2;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$2 = outcomeEventParams2;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.J$0 = currentTimeMillis;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.label = 1;
                            if (requestMeasureOutcomeEvent(outcomeEventParams2, outcomeEventsController$sendAndCreateOutcomeEvent$1) != coroutine_suspended) {
                                j2 = currentTimeMillis;
                                outcomeEventParams = outcomeEventParams2;
                                str3 = str2;
                                outcomeEventsController = this;
                            }
                        } catch (BackendException e) {
                            e = e;
                            j2 = currentTimeMillis;
                            outcomeEventParams = outcomeEventParams2;
                            outcomeEventsController = this;
                            responseStatusType = NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode());
                            String str4 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                            if (responseStatusType != NetworkUtils.ResponseStatusType.RETRYABLE) {
                                Logging.info$default(str4 + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                                outcomeEventParams.setTimestamp(j2);
                                IOutcomeEventsRepository iOutcomeEventsRepository = outcomeEventsController._outcomeEventsCache;
                                outcomeEventsController$sendAndCreateOutcomeEvent$1.L$0 = null;
                                outcomeEventsController$sendAndCreateOutcomeEvent$1.L$1 = null;
                                outcomeEventsController$sendAndCreateOutcomeEvent$1.L$2 = null;
                                outcomeEventsController$sendAndCreateOutcomeEvent$1.label = 2;
                                if (iOutcomeEventsRepository.saveOutcomeEvent(outcomeEventParams, outcomeEventsController$sendAndCreateOutcomeEvent$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return null;
                            }
                            Logging.warn$default(str4 + " Outcome event will be omitted!", null, 2, null);
                            IOutcomeEventsRepository iOutcomeEventsRepository2 = outcomeEventsController._outcomeEventsCache;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$0 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$1 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$2 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.label = 3;
                            if (iOutcomeEventsRepository2.deleteOldOutcomeEvent(outcomeEventParams, outcomeEventsController$sendAndCreateOutcomeEvent$1) == coroutine_suspended) {
                            }
                        }
                    } catch (BackendException e2) {
                        e = e2;
                        str2 = str;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return null;
                }
                j2 = outcomeEventsController$sendAndCreateOutcomeEvent$1.J$0;
                outcomeEventParams = (OutcomeEventParams) outcomeEventsController$sendAndCreateOutcomeEvent$1.L$2;
                str3 = (String) outcomeEventsController$sendAndCreateOutcomeEvent$1.L$1;
                outcomeEventsController = (OutcomeEventsController) outcomeEventsController$sendAndCreateOutcomeEvent$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (BackendException e3) {
                    e = e3;
                    str2 = str3;
                    responseStatusType = NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode());
                    String str42 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                    if (responseStatusType != NetworkUtils.ResponseStatusType.RETRYABLE) {
                    }
                }
                outcomeEventsController.saveUniqueOutcome(outcomeEventParams);
                return OutcomeEvent.INSTANCE.fromOutcomeEventParamstoOutcomeEvent(outcomeEventParams);
            }
        }
        outcomeEventsController$sendAndCreateOutcomeEvent$1 = new OutcomeEventsController$sendAndCreateOutcomeEvent$1(this, continuation);
        Object obj2 = outcomeEventsController$sendAndCreateOutcomeEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = outcomeEventsController$sendAndCreateOutcomeEvent$1.label;
        if (i != 0) {
        }
        outcomeEventsController.saveUniqueOutcome(outcomeEventParams);
        return OutcomeEvent.INSTANCE.fromOutcomeEventParamstoOutcomeEvent(outcomeEventParams);
    }

    private final OutcomeSourceBody setSourceChannelIds(Influence influence, OutcomeSourceBody sourceBody) {
        int i = WhenMappings.$EnumSwitchMapping$1[influence.getInfluenceChannel().ordinal()];
        if (i == 1) {
            sourceBody.setInAppMessagesIds(influence.getIds());
            return sourceBody;
        }
        if (i != 2) {
            return sourceBody;
        }
        sourceBody.setNotificationIds(influence.getIds());
        return sourceBody;
    }

    private final List<Influence> removeDisabledInfluences(List<Influence> influences) {
        List<Influence> mutableList = CollectionsKt.toMutableList((Collection) influences);
        for (Influence influence : influences) {
            if (influence.getInfluenceType().isDisabled()) {
                Logging.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + influence.getInfluenceChannel(), null, 2, null);
                mutableList.remove(influence);
            }
        }
        return mutableList;
    }

    private final void saveUniqueOutcome(OutcomeEventParams eventParams) {
        if (eventParams.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(eventParams);
        }
    }

    private final void saveAttributedUniqueOutcomeNotifications(OutcomeEventParams eventParams) {
        ThreadUtilsKt.suspendifyOnIO(new OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1(this, eventParams, null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUniqueIds(String str, List<Influence> list, Continuation<? super List<Influence>> continuation) {
        OutcomeEventsController$getUniqueIds$1 outcomeEventsController$getUniqueIds$1;
        int i;
        List list2;
        if (continuation instanceof OutcomeEventsController$getUniqueIds$1) {
            outcomeEventsController$getUniqueIds$1 = (OutcomeEventsController$getUniqueIds$1) continuation;
            if ((outcomeEventsController$getUniqueIds$1.label & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$getUniqueIds$1.label -= Integer.MIN_VALUE;
                Object obj = outcomeEventsController$getUniqueIds$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = outcomeEventsController$getUniqueIds$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IOutcomeEventsRepository iOutcomeEventsRepository = this._outcomeEventsCache;
                    outcomeEventsController$getUniqueIds$1.label = 1;
                    obj = iOutcomeEventsRepository.getNotCachedUniqueInfluencesForOutcome(str, list, outcomeEventsController$getUniqueIds$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                    return list2;
                }
                return null;
            }
        }
        outcomeEventsController$getUniqueIds$1 = new OutcomeEventsController$getUniqueIds$1(this, continuation);
        Object obj2 = outcomeEventsController$getUniqueIds$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = outcomeEventsController$getUniqueIds$1.label;
        if (i != 0) {
        }
        list2 = (List) obj2;
        if (list2.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(OutcomeEventParams outcomeEventParams, Continuation<? super Unit> continuation) {
        Boolean boxBoolean;
        String appId = this._configModelStore.getModel().getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = SubscriptionObjectType.INSTANCE.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id.length() == 0 || value.length() == 0) {
            throw new BackendException(0, null, null, 6, null);
        }
        OutcomeEvent fromOutcomeEventParamstoOutcomeEvent = OutcomeEvent.INSTANCE.fromOutcomeEventParamstoOutcomeEvent(outcomeEventParams);
        int i = WhenMappings.$EnumSwitchMapping$0[fromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        if (i == 1) {
            boxBoolean = Boxing.boxBoolean(true);
        } else {
            boxBoolean = i != 2 ? null : Boxing.boxBoolean(false);
        }
        Object sendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, this._identityModelStore.getModel().getOnesignalId(), id, value, boxBoolean, fromOutcomeEventParamstoOutcomeEvent, continuation);
        return sendOutcomeEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendOutcomeEvent : Unit.INSTANCE;
    }
}
