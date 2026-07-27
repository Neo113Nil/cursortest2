package com.onesignal.inAppMessages.internal;

import K1.b;
import L4.d;
import L4.e;
import android.app.AlertDialog;
import android.content.DialogInterface;
import b2.AbstractC0279e;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.IInAppMessageClickListener;
import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.inAppMessages.InAppMessageActionUrlType;
import com.onesignal.inAppMessages.R;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.common.InAppHelper;
import com.onesignal.inAppMessages.internal.common.OneSignalChromeTab;
import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.inAppMessages.internal.triggers.ITriggerController;
import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import com.onesignal.inAppMessages.internal.triggers.TriggerModel;
import com.onesignal.inAppMessages.internal.triggers.TriggerModelStore;
import com.onesignal.session.internal.influence.IInfluenceManager;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.IUserManager;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.IJwtUpdateListener;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.subscriptions.IPushSubscription;
import com.onesignal.user.subscriptions.ISubscription;
import e5.g;
import f4.C0435l;
import f4.v;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.InterfaceC1430a;
import u4.InterfaceC1481a;
import u4.InterfaceC1483c;

/* loaded from: classes.dex */
public final class InAppMessagesManager implements IInAppMessagesManager, IStartableService, ISubscriptionChangedHandler, ISingletonModelStoreChangeHandler<ConfigModel>, IInAppLifecycleEventHandler, ITriggerHandler, ISessionLifecycleHandler, IApplicationLifecycleHandler, IJwtUpdateListener {
    private final IApplicationService _applicationService;
    private final IInAppBackendService _backend;
    private final ConfigModelStore _configModelStore;
    private final IConsistencyManager _consistencyManager;
    private final IInAppDisplayer _displayer;
    private final IdentityModelStore _identityModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final IInfluenceManager _influenceManager;
    private final JwtTokenStore _jwtTokenStore;
    private final ILanguageContext _languageContext;
    private final IInAppLifecycleService _lifecycle;
    private final IOutcomeEventsController _outcomeEventsController;
    private final IInAppPreferencesController _prefs;
    private final IInAppRepository _repository;
    private final ISessionService _sessionService;
    private final InAppStateService _state;
    private final ISubscriptionManager _subscriptionManager;
    private final ITime _time;
    private final ITriggerController _triggerController;
    private final TriggerModelStore _triggerModelStore;
    private final IUserManager _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final Set<String> earlySessionTriggers;
    private final L4.a fetchIAMMutex;
    private boolean hasCompletedFirstFetch;
    private final InAppMessagesManager$identityModelChangeHandler$1 identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private volatile Long lastTimeFetchedIAMs;
    private final EventProducer<IInAppMessageLifecycleListener> lifecycleCallback;
    private final EventProducer<IInAppMessageClickListener> messageClickCallback;
    private final List<InAppMessage> messageDisplayQueue;
    private final L4.a messageDisplayQueueMutex;
    private List<InAppMessage> messages;
    private volatile String pendingJwtRetryExternalId;
    private volatile RywData pendingJwtRetryRywData;
    private final List<InAppMessage> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    /* JADX WARN: Type inference failed for: r1v18, types: [com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1] */
    public InAppMessagesManager(IApplicationService _applicationService, ISessionService _sessionService, IInfluenceManager _influenceManager, ConfigModelStore _configModelStore, IUserManager _userManager, IdentityModelStore _identityModelStore, ISubscriptionManager _subscriptionManager, IOutcomeEventsController _outcomeEventsController, InAppStateService _state, IInAppPreferencesController _prefs, IInAppRepository _repository, IInAppBackendService _backend, ITriggerController _triggerController, TriggerModelStore _triggerModelStore, IInAppDisplayer _displayer, IInAppLifecycleService _lifecycle, ILanguageContext _languageContext, ITime _time, IConsistencyManager _consistencyManager, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        i.e(_applicationService, "_applicationService");
        i.e(_sessionService, "_sessionService");
        i.e(_influenceManager, "_influenceManager");
        i.e(_configModelStore, "_configModelStore");
        i.e(_userManager, "_userManager");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_subscriptionManager, "_subscriptionManager");
        i.e(_outcomeEventsController, "_outcomeEventsController");
        i.e(_state, "_state");
        i.e(_prefs, "_prefs");
        i.e(_repository, "_repository");
        i.e(_backend, "_backend");
        i.e(_triggerController, "_triggerController");
        i.e(_triggerModelStore, "_triggerModelStore");
        i.e(_displayer, "_displayer");
        i.e(_lifecycle, "_lifecycle");
        i.e(_languageContext, "_languageContext");
        i.e(_time, "_time");
        i.e(_consistencyManager, "_consistencyManager");
        i.e(_jwtTokenStore, "_jwtTokenStore");
        i.e(_identityVerificationService, "_identityVerificationService");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._influenceManager = _influenceManager;
        this._configModelStore = _configModelStore;
        this._userManager = _userManager;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._outcomeEventsController = _outcomeEventsController;
        this._state = _state;
        this._prefs = _prefs;
        this._repository = _repository;
        this._backend = _backend;
        this._triggerController = _triggerController;
        this._triggerModelStore = _triggerModelStore;
        this._displayer = _displayer;
        this._lifecycle = _lifecycle;
        this._languageContext = _languageContext;
        this._time = _time;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this.lifecycleCallback = new EventProducer<>();
        this.messageClickCallback = new EventProducer<>();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = e.a();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = e.a();
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        i.d(synchronizedSet, "synchronizedSet(...)");
        this.earlySessionTriggers = synchronizedSet;
        this.identityModelChangeHandler = new ISingletonModelStoreChangeHandler<IdentityModel>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1
            @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
            public void onModelUpdated(ModelChangedArgs args, String tag) {
                i.e(args, "args");
                i.e(tag, "tag");
                if (i.a(args.getProperty(), IdentityConstants.ONESIGNAL_ID)) {
                    Object oldValue = args.getOldValue();
                    i.c(oldValue, "null cannot be cast to non-null type kotlin.String");
                    Object newValue = args.getNewValue();
                    i.c(newValue, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) newValue;
                    IDManager iDManager = IDManager.INSTANCE;
                    if (!iDManager.isLocalId((String) oldValue) || iDManager.isLocalId(str)) {
                        return;
                    }
                    ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1(InAppMessagesManager.this, str, null));
                }
            }

            @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
            public void onModelReplaced(IdentityModel model, String tag) {
                i.e(model, "model");
                i.e(tag, "tag");
                InAppMessagesManager.this.pendingJwtRetryExternalId = null;
                InAppMessagesManager.this.pendingJwtRetryRywData = null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:42:0x00c5, B:44:0x00cd, B:45:0x00d3, B:47:0x00db, B:48:0x00e1), top: B:32:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00a5, B:35:0x00bc, B:42:0x00c5, B:44:0x00cd, B:45:0x00d3, B:47:0x00db, B:48:0x00e1), top: B:32:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r3v8, types: [L4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$attemptToShowInAppMessage$1 inAppMessagesManager$attemptToShowInAppMessage$1;
        Object obj;
        int i2;
        InAppMessagesManager inAppMessagesManager;
        s sVar;
        d dVar;
        Object obj2;
        s sVar2;
        Boolean bool;
        if (interfaceC1218d instanceof InAppMessagesManager$attemptToShowInAppMessage$1) {
            inAppMessagesManager$attemptToShowInAppMessage$1 = (InAppMessagesManager$attemptToShowInAppMessage$1) interfaceC1218d;
            int i3 = inAppMessagesManager$attemptToShowInAppMessage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$attemptToShowInAppMessage$1.label = i3 - Integer.MIN_VALUE;
                obj = inAppMessagesManager$attemptToShowInAppMessage$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$attemptToShowInAppMessage$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    IApplicationService iApplicationService = this._applicationService;
                    inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = this;
                    inAppMessagesManager$attemptToShowInAppMessage$1.label = 1;
                    obj = iApplicationService.waitUntilSystemConditionsAvailable(inAppMessagesManager$attemptToShowInAppMessage$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppMessagesManager = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    g.y(obj);
                                }
                                if (i2 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                g.y(obj);
                                return vVar;
                            }
                            sVar2 = (s) inAppMessagesManager$attemptToShowInAppMessage$1.L$1;
                            inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$attemptToShowInAppMessage$1.L$0;
                            g.y(obj);
                            bool = (Boolean) obj;
                            if (bool != null) {
                                inAppMessagesManager._state.setInAppMessageIdShowing(null);
                                Object obj3 = sVar2.f10741a;
                                i.b(obj3);
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = null;
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$1 = null;
                                inAppMessagesManager$attemptToShowInAppMessage$1.label = 4;
                                return inAppMessagesManager.queueMessageForDisplay((InAppMessage) obj3, inAppMessagesManager$attemptToShowInAppMessage$1) == enumC1260a ? enumC1260a : vVar;
                            }
                            if (bool.equals(Boolean.FALSE)) {
                                inAppMessagesManager._state.setInAppMessageIdShowing(null);
                                List<InAppMessage> list = inAppMessagesManager.messages;
                                Object obj4 = sVar2.f10741a;
                                kotlin.jvm.internal.v.a(list);
                                list.remove(obj4);
                                Object obj5 = sVar2.f10741a;
                                i.b(obj5);
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = null;
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$1 = null;
                                inAppMessagesManager$attemptToShowInAppMessage$1.label = 5;
                                if (inAppMessagesManager.messageWasDismissed((InAppMessage) obj5, true, inAppMessagesManager$attemptToShowInAppMessage$1) == enumC1260a) {
                                    return enumC1260a;
                                }
                            }
                            return vVar;
                        }
                        ?? r32 = (L4.a) inAppMessagesManager$attemptToShowInAppMessage$1.L$2;
                        s sVar3 = (s) inAppMessagesManager$attemptToShowInAppMessage$1.L$1;
                        InAppMessagesManager inAppMessagesManager2 = (InAppMessagesManager) inAppMessagesManager$attemptToShowInAppMessage$1.L$0;
                        g.y(obj);
                        sVar = sVar3;
                        dVar = r32;
                        inAppMessagesManager = inAppMessagesManager2;
                        try {
                            Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + inAppMessagesManager.messageDisplayQueue, null, 2, null);
                            if (!inAppMessagesManager.getPaused()) {
                                Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                            } else if (inAppMessagesManager.messageDisplayQueue.isEmpty()) {
                                Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                            } else if (inAppMessagesManager._state.getInAppMessageIdShowing() != null) {
                                Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                            } else {
                                Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                                InAppMessage remove = inAppMessagesManager.messageDisplayQueue.remove(0);
                                sVar.f10741a = remove;
                                InAppStateService inAppStateService = inAppMessagesManager._state;
                                i.b(remove);
                                inAppStateService.setInAppMessageIdShowing(remove.getMessageId());
                            }
                            dVar.e(null);
                            obj2 = sVar.f10741a;
                            if (obj2 != null) {
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = inAppMessagesManager;
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$1 = sVar;
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$2 = null;
                                inAppMessagesManager$attemptToShowInAppMessage$1.label = 3;
                                Object displayMessage = inAppMessagesManager._displayer.displayMessage((InAppMessage) obj2, inAppMessagesManager$attemptToShowInAppMessage$1);
                                if (displayMessage == enumC1260a) {
                                    return enumC1260a;
                                }
                                sVar2 = sVar;
                                obj = displayMessage;
                                bool = (Boolean) obj;
                                if (bool != null) {
                                }
                            }
                            return vVar;
                        } catch (Throwable th) {
                            dVar.e(null);
                            throw th;
                        }
                    }
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$attemptToShowInAppMessage$1.L$0;
                    g.y(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Logging.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
                    return vVar;
                }
                sVar = new s();
                L4.a aVar = inAppMessagesManager.messageDisplayQueueMutex;
                inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = inAppMessagesManager;
                inAppMessagesManager$attemptToShowInAppMessage$1.L$1 = sVar;
                inAppMessagesManager$attemptToShowInAppMessage$1.L$2 = aVar;
                inAppMessagesManager$attemptToShowInAppMessage$1.label = 2;
                dVar = (d) aVar;
                if (dVar.c(inAppMessagesManager$attemptToShowInAppMessage$1) == enumC1260a) {
                    return enumC1260a;
                }
                Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + inAppMessagesManager.messageDisplayQueue, null, 2, null);
                if (!inAppMessagesManager.getPaused()) {
                }
                dVar.e(null);
                obj2 = sVar.f10741a;
                if (obj2 != null) {
                }
                return vVar;
            }
        }
        inAppMessagesManager$attemptToShowInAppMessage$1 = new InAppMessagesManager$attemptToShowInAppMessage$1(this, interfaceC1218d);
        obj = inAppMessagesManager$attemptToShowInAppMessage$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$attemptToShowInAppMessage$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(InAppMessage inAppMessage, List<? extends InAppMessagePrompt> list, InterfaceC1218d interfaceC1218d) {
        boolean isEmpty = list.isEmpty();
        v vVar = v.f5689a;
        if (!isEmpty) {
            Logging.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + inAppMessage, null, 2, null);
            this._displayer.dismissCurrentInAppMessage();
            Object showMultiplePrompts = showMultiplePrompts(inAppMessage, list, interfaceC1218d);
            if (showMultiplePrompts == EnumC1260a.f11058a) {
                return showMultiplePrompts;
            }
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateInAppMessages(InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$evaluateInAppMessages$1 inAppMessagesManager$evaluateInAppMessages$1;
        int i2;
        InAppMessagesManager inAppMessagesManager;
        Iterator it;
        if (interfaceC1218d instanceof InAppMessagesManager$evaluateInAppMessages$1) {
            inAppMessagesManager$evaluateInAppMessages$1 = (InAppMessagesManager$evaluateInAppMessages$1) interfaceC1218d;
            int i3 = inAppMessagesManager$evaluateInAppMessages$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$evaluateInAppMessages$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessagesManager$evaluateInAppMessages$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$evaluateInAppMessages$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    Logging.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
                    ArrayList arrayList = new ArrayList();
                    synchronized (this.messages) {
                        for (InAppMessage inAppMessage : this.messages) {
                            if (this._triggerController.evaluateMessageTriggers(inAppMessage)) {
                                setDataForRedisplay(inAppMessage);
                                if (!this.dismissedMessages.contains(inAppMessage.getMessageId()) && !inAppMessage.isFinished()) {
                                    arrayList.add(inAppMessage);
                                }
                            }
                        }
                    }
                    inAppMessagesManager = this;
                    it = arrayList.iterator();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) inAppMessagesManager$evaluateInAppMessages$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$evaluateInAppMessages$1.L$0;
                    g.y(obj);
                }
                while (it.hasNext()) {
                    InAppMessage inAppMessage2 = (InAppMessage) it.next();
                    inAppMessagesManager$evaluateInAppMessages$1.L$0 = inAppMessagesManager;
                    inAppMessagesManager$evaluateInAppMessages$1.L$1 = it;
                    inAppMessagesManager$evaluateInAppMessages$1.label = 1;
                    if (inAppMessagesManager.queueMessageForDisplay(inAppMessage2, inAppMessagesManager$evaluateInAppMessages$1) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                return v.f5689a;
            }
        }
        inAppMessagesManager$evaluateInAppMessages$1 = new InAppMessagesManager$evaluateInAppMessages$1(this, interfaceC1218d);
        Object obj2 = inAppMessagesManager$evaluateInAppMessages$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$evaluateInAppMessages$1.label;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIvOrSaveRetry(String str, String str2, RywData rywData, InterfaceC1430a interfaceC1430a, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$fetchIvOrSaveRetry$1 inAppMessagesManager$fetchIvOrSaveRetry$1;
        int i2;
        InAppMessagesManager inAppMessagesManager;
        boolean z;
        String str3;
        if (interfaceC1218d instanceof InAppMessagesManager$fetchIvOrSaveRetry$1) {
            inAppMessagesManager$fetchIvOrSaveRetry$1 = (InAppMessagesManager$fetchIvOrSaveRetry$1) interfaceC1218d;
            int i3 = inAppMessagesManager$fetchIvOrSaveRetry$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$fetchIvOrSaveRetry$1.label = i3 - Integer.MIN_VALUE;
                InAppMessagesManager$fetchIvOrSaveRetry$1 inAppMessagesManager$fetchIvOrSaveRetry$12 = inAppMessagesManager$fetchIvOrSaveRetry$1;
                Object obj = inAppMessagesManager$fetchIvOrSaveRetry$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$fetchIvOrSaveRetry$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
                    String externalId = this._identityModelStore.getModel().getExternalId();
                    C0435l c0435l = (!ivBehaviorActive || externalId == null) ? new C0435l(IdentityConstants.ONESIGNAL_ID, this._identityModelStore.getModel().getOnesignalId(), null) : new C0435l(IdentityConstants.EXTERNAL_ID, externalId, this._jwtTokenStore.getJwt(externalId));
                    String str4 = c0435l.f5677a;
                    String str5 = c0435l.f5678b;
                    String str6 = c0435l.f5679c;
                    if (ivBehaviorActive && externalId != null) {
                        this.pendingJwtRetryExternalId = externalId;
                        this.pendingJwtRetryRywData = rywData;
                    }
                    try {
                        IInAppBackendService iInAppBackendService = this._backend;
                        inAppMessagesManager$fetchIvOrSaveRetry$12.L$0 = this;
                        inAppMessagesManager$fetchIvOrSaveRetry$12.L$1 = externalId;
                        inAppMessagesManager$fetchIvOrSaveRetry$12.Z$0 = ivBehaviorActive;
                        inAppMessagesManager$fetchIvOrSaveRetry$12.label = 1;
                        obj = iInAppBackendService.listInAppMessagesIv(str, str4, str5, str2, rywData, interfaceC1430a, str6, inAppMessagesManager$fetchIvOrSaveRetry$12);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        inAppMessagesManager = this;
                        z = ivBehaviorActive;
                        str3 = externalId;
                    } catch (BackendException e3) {
                        e = e3;
                        inAppMessagesManager = this;
                        z = ivBehaviorActive;
                        str3 = externalId;
                        if (z || str3 == null) {
                            Logging.warn$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ": " + e.getResponse(), null, 2, null);
                            return null;
                        }
                        Logging.info$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ", awaiting JWT refresh for " + str3, null, 2, null);
                        inAppMessagesManager.lastTimeFetchedIAMs = null;
                        return null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = inAppMessagesManager$fetchIvOrSaveRetry$12.Z$0;
                    str3 = (String) inAppMessagesManager$fetchIvOrSaveRetry$12.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fetchIvOrSaveRetry$12.L$0;
                    try {
                        g.y(obj);
                    } catch (BackendException e6) {
                        e = e6;
                        if (z) {
                        }
                        Logging.warn$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ": " + e.getResponse(), null, 2, null);
                        return null;
                    }
                }
                List list = (List) obj;
                inAppMessagesManager.pendingJwtRetryExternalId = null;
                inAppMessagesManager.pendingJwtRetryRywData = null;
                return list;
            }
        }
        inAppMessagesManager$fetchIvOrSaveRetry$1 = new InAppMessagesManager$fetchIvOrSaveRetry$1(this, interfaceC1218d);
        InAppMessagesManager$fetchIvOrSaveRetry$1 inAppMessagesManager$fetchIvOrSaveRetry$122 = inAppMessagesManager$fetchIvOrSaveRetry$1;
        Object obj2 = inAppMessagesManager$fetchIvOrSaveRetry$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$fetchIvOrSaveRetry$122.label;
        if (i2 != 0) {
        }
        List list2 = (List) obj2;
        inAppMessagesManager.pendingJwtRetryExternalId = null;
        inAppMessagesManager.pendingJwtRetryRywData = null;
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6 A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:62:0x00cc, B:64:0x00d6, B:66:0x00f1, B:69:0x00fc), top: B:61:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(RywData rywData, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$fetchMessages$1 inAppMessagesManager$fetchMessages$1;
        int i2;
        RywData rywData2;
        String str;
        InAppMessagesManager inAppMessagesManager;
        String str2;
        L4.a aVar;
        InAppMessagesManager inAppMessagesManager2;
        List<InAppMessage> list;
        try {
            if (interfaceC1218d instanceof InAppMessagesManager$fetchMessages$1) {
                inAppMessagesManager$fetchMessages$1 = (InAppMessagesManager$fetchMessages$1) interfaceC1218d;
                int i3 = inAppMessagesManager$fetchMessages$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    inAppMessagesManager$fetchMessages$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = inAppMessagesManager$fetchMessages$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = inAppMessagesManager$fetchMessages$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        if (!this._applicationService.isInForeground()) {
                            return v.f5689a;
                        }
                        String appId = this._configModelStore.getModel().getAppId();
                        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        if (id.length() == 0 || IDManager.INSTANCE.isLocalId(id) || appId.length() == 0) {
                            return v.f5689a;
                        }
                        L4.a aVar2 = this.fetchIAMMutex;
                        inAppMessagesManager$fetchMessages$1.L$0 = this;
                        inAppMessagesManager$fetchMessages$1.L$1 = rywData;
                        inAppMessagesManager$fetchMessages$1.L$2 = appId;
                        inAppMessagesManager$fetchMessages$1.L$3 = id;
                        inAppMessagesManager$fetchMessages$1.L$4 = aVar2;
                        inAppMessagesManager$fetchMessages$1.label = 1;
                        d dVar = (d) aVar2;
                        if (dVar.c(inAppMessagesManager$fetchMessages$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        rywData2 = rywData;
                        str = appId;
                        inAppMessagesManager = this;
                        str2 = id;
                        aVar = dVar;
                    } else if (i2 == 1) {
                        aVar = (L4.a) inAppMessagesManager$fetchMessages$1.L$4;
                        str2 = (String) inAppMessagesManager$fetchMessages$1.L$3;
                        str = (String) inAppMessagesManager$fetchMessages$1.L$2;
                        rywData2 = (RywData) inAppMessagesManager$fetchMessages$1.L$1;
                        InAppMessagesManager inAppMessagesManager3 = (InAppMessagesManager) inAppMessagesManager$fetchMessages$1.L$0;
                        g.y(obj);
                        inAppMessagesManager = inAppMessagesManager3;
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                g.y(obj);
                                return v.f5689a;
                            }
                            inAppMessagesManager2 = (InAppMessagesManager) inAppMessagesManager$fetchMessages$1.L$0;
                            g.y(obj);
                            list = (List) obj;
                            if (list != null) {
                                return v.f5689a;
                            }
                            if ((list instanceof InterfaceC1481a) && !(list instanceof InterfaceC1483c)) {
                                kotlin.jvm.internal.v.d(list, "kotlin.collections.MutableList");
                                throw null;
                            }
                            inAppMessagesManager2.messages = list;
                            synchronized (inAppMessagesManager2.earlySessionTriggers) {
                                try {
                                    if (!inAppMessagesManager2.earlySessionTriggers.isEmpty()) {
                                        Logging.verbose$default("InAppMessagesManager: Processing triggers added early on cold start: " + inAppMessagesManager2.earlySessionTriggers, null, 2, null);
                                        for (InAppMessage inAppMessage : inAppMessagesManager2.messages) {
                                            boolean contains = inAppMessagesManager2.redisplayedInAppMessages.contains(inAppMessage);
                                            boolean isTriggerOnMessage = inAppMessagesManager2._triggerController.isTriggerOnMessage(inAppMessage, inAppMessagesManager2.earlySessionTriggers);
                                            if (contains && isTriggerOnMessage) {
                                                Logging.verbose$default("InAppMessagesManager: Setting isTriggerChanged=true for message " + inAppMessage.getMessageId(), null, 2, null);
                                                inAppMessage.setTriggerChanged(true);
                                            }
                                        }
                                        inAppMessagesManager2.earlySessionTriggers.clear();
                                    }
                                    inAppMessagesManager2.hasCompletedFirstFetch = true;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            inAppMessagesManager$fetchMessages$1.L$0 = null;
                            inAppMessagesManager$fetchMessages$1.label = 4;
                            if (inAppMessagesManager2.evaluateInAppMessages(inAppMessagesManager$fetchMessages$1) == enumC1260a) {
                                return enumC1260a;
                            }
                            return v.f5689a;
                        }
                        inAppMessagesManager2 = (InAppMessagesManager) inAppMessagesManager$fetchMessages$1.L$0;
                        g.y(obj);
                        list = (List) obj;
                        if (list != null) {
                        }
                    }
                    long currentTimeMillis = inAppMessagesManager._time.getCurrentTimeMillis();
                    if (inAppMessagesManager.lastTimeFetchedIAMs != null) {
                        Long l2 = inAppMessagesManager.lastTimeFetchedIAMs;
                        i.b(l2);
                        if (currentTimeMillis - l2.longValue() < inAppMessagesManager._configModelStore.getModel().getFetchIAMMinInterval()) {
                            return v.f5689a;
                        }
                    }
                    inAppMessagesManager.lastTimeFetchedIAMs = new Long(currentTimeMillis);
                    ((d) aVar).e(null);
                    InAppMessagesManager$fetchMessages$sessionDurationProvider$1 inAppMessagesManager$fetchMessages$sessionDurationProvider$1 = new InAppMessagesManager$fetchMessages$sessionDurationProvider$1(inAppMessagesManager);
                    if (inAppMessagesManager._identityVerificationService.getNewCodePathsRun()) {
                        IInAppBackendService iInAppBackendService = inAppMessagesManager._backend;
                        inAppMessagesManager$fetchMessages$1.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fetchMessages$1.L$1 = null;
                        inAppMessagesManager$fetchMessages$1.L$2 = null;
                        inAppMessagesManager$fetchMessages$1.L$3 = null;
                        inAppMessagesManager$fetchMessages$1.L$4 = null;
                        inAppMessagesManager$fetchMessages$1.label = 3;
                        Object listInAppMessages = iInAppBackendService.listInAppMessages(str, str2, rywData2, inAppMessagesManager$fetchMessages$sessionDurationProvider$1, inAppMessagesManager$fetchMessages$1);
                        if (listInAppMessages == enumC1260a) {
                            return enumC1260a;
                        }
                        inAppMessagesManager2 = inAppMessagesManager;
                        obj = listInAppMessages;
                        list = (List) obj;
                        if (list != null) {
                        }
                    } else {
                        inAppMessagesManager$fetchMessages$1.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fetchMessages$1.L$1 = null;
                        inAppMessagesManager$fetchMessages$1.L$2 = null;
                        inAppMessagesManager$fetchMessages$1.L$3 = null;
                        inAppMessagesManager$fetchMessages$1.L$4 = null;
                        inAppMessagesManager$fetchMessages$1.label = 2;
                        Object fetchIvOrSaveRetry = inAppMessagesManager.fetchIvOrSaveRetry(str, str2, rywData2, inAppMessagesManager$fetchMessages$sessionDurationProvider$1, inAppMessagesManager$fetchMessages$1);
                        if (fetchIvOrSaveRetry == enumC1260a) {
                            return enumC1260a;
                        }
                        inAppMessagesManager2 = inAppMessagesManager;
                        obj = fetchIvOrSaveRetry;
                        list = (List) obj;
                        if (list != null) {
                        }
                    }
                }
            }
            long currentTimeMillis2 = inAppMessagesManager._time.getCurrentTimeMillis();
            if (inAppMessagesManager.lastTimeFetchedIAMs != null) {
            }
            inAppMessagesManager.lastTimeFetchedIAMs = new Long(currentTimeMillis2);
            ((d) aVar).e(null);
            InAppMessagesManager$fetchMessages$sessionDurationProvider$1 inAppMessagesManager$fetchMessages$sessionDurationProvider$12 = new InAppMessagesManager$fetchMessages$sessionDurationProvider$1(inAppMessagesManager);
            if (inAppMessagesManager._identityVerificationService.getNewCodePathsRun()) {
            }
        } finally {
            ((d) aVar).e(null);
        }
        inAppMessagesManager$fetchMessages$1 = new InAppMessagesManager$fetchMessages$1(this, interfaceC1218d);
        Object obj2 = inAppMessagesManager$fetchMessages$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$fetchMessages$1.label;
        if (i2 != 0) {
        }
    }

    private final void fetchMessagesWhenConditionIsMet() {
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$fetchMessagesWhenConditionIsMet$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(InAppMessageClickResult inAppMessageClickResult) {
        if (inAppMessageClickResult.getUrl() == null || inAppMessageClickResult.getUrl().length() <= 0) {
            return;
        }
        if (inAppMessageClickResult.getUrlTarget() == InAppMessageActionUrlType.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), inAppMessageClickResult.getUrl());
        } else if (inAppMessageClickResult.getUrlTarget() == InAppMessageActionUrlType.IN_APP_WEBVIEW) {
            OneSignalChromeTab.INSTANCE.open$com_onesignal_inAppMessages(inAppMessageClickResult.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireOutcomesForClick(String str, List<InAppMessageOutcome> list, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$fireOutcomesForClick$1 inAppMessagesManager$fireOutcomesForClick$1;
        int i2;
        Iterator<InAppMessageOutcome> it;
        InAppMessagesManager inAppMessagesManager;
        if (interfaceC1218d instanceof InAppMessagesManager$fireOutcomesForClick$1) {
            inAppMessagesManager$fireOutcomesForClick$1 = (InAppMessagesManager$fireOutcomesForClick$1) interfaceC1218d;
            int i3 = inAppMessagesManager$fireOutcomesForClick$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$fireOutcomesForClick$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessagesManager$fireOutcomesForClick$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$fireOutcomesForClick$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    this._influenceManager.onDirectInfluenceFromIAM(str);
                    it = list.iterator();
                    inAppMessagesManager = this;
                } else {
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) inAppMessagesManager$fireOutcomesForClick$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fireOutcomesForClick$1.L$0;
                    g.y(obj);
                }
                while (it.hasNext()) {
                    InAppMessageOutcome next = it.next();
                    String name = next.getName();
                    if (next.isUnique()) {
                        IOutcomeEventsController iOutcomeEventsController = inAppMessagesManager._outcomeEventsController;
                        inAppMessagesManager$fireOutcomesForClick$1.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fireOutcomesForClick$1.L$1 = it;
                        inAppMessagesManager$fireOutcomesForClick$1.label = 1;
                        if (iOutcomeEventsController.sendUniqueOutcomeEvent(name, inAppMessagesManager$fireOutcomesForClick$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else if (next.getWeight() > 0.0f) {
                        IOutcomeEventsController iOutcomeEventsController2 = inAppMessagesManager._outcomeEventsController;
                        float weight = next.getWeight();
                        inAppMessagesManager$fireOutcomesForClick$1.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fireOutcomesForClick$1.L$1 = it;
                        inAppMessagesManager$fireOutcomesForClick$1.label = 2;
                        if (iOutcomeEventsController2.sendOutcomeEventWithValue(name, weight, inAppMessagesManager$fireOutcomesForClick$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        IOutcomeEventsController iOutcomeEventsController3 = inAppMessagesManager._outcomeEventsController;
                        inAppMessagesManager$fireOutcomesForClick$1.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fireOutcomesForClick$1.L$1 = it;
                        inAppMessagesManager$fireOutcomesForClick$1.label = 3;
                        if (iOutcomeEventsController3.sendOutcomeEvent(name, inAppMessagesManager$fireOutcomesForClick$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    }
                }
                return v.f5689a;
            }
        }
        inAppMessagesManager$fireOutcomesForClick$1 = new InAppMessagesManager$fireOutcomesForClick$1(this, interfaceC1218d);
        Object obj2 = inAppMessagesManager$fireOutcomesForClick$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$fireOutcomesForClick$1.label;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult, InterfaceC1218d interfaceC1218d) {
        boolean hasSubscribers = this.messageClickCallback.getHasSubscribers();
        v vVar = v.f5689a;
        if (!hasSubscribers) {
            return vVar;
        }
        this._influenceManager.onDirectInfluenceFromIAM(inAppMessage.getMessageId());
        Object suspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new InAppMessagesManager$firePublicClickHandler$2(new InAppMessageClickEvent(inAppMessage, inAppMessageClickResult), null), interfaceC1218d);
        return suspendingFireOnMain == EnumC1260a.f11058a ? suspendingFireOnMain : vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(4:10|11|12|13)(2:26|27))(2:28|(1:30)(6:31|(2:45|(1:47))|(1:37)|38|39|(1:41)(1:42)))|14|15|16))|48|6|7|(0)(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        r12.removeClickId(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForClick(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$fireRESTCallForClick$1 inAppMessagesManager$fireRESTCallForClick$1;
        int i2;
        String clickId;
        InAppMessagesManager inAppMessagesManager;
        InAppMessage inAppMessage2;
        String str;
        if (interfaceC1218d instanceof InAppMessagesManager$fireRESTCallForClick$1) {
            inAppMessagesManager$fireRESTCallForClick$1 = (InAppMessagesManager$fireRESTCallForClick$1) interfaceC1218d;
            int i3 = inAppMessagesManager$fireRESTCallForClick$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$fireRESTCallForClick$1.label = i3 - Integer.MIN_VALUE;
                InAppMessagesManager$fireRESTCallForClick$1 inAppMessagesManager$fireRESTCallForClick$12 = inAppMessagesManager$fireRESTCallForClick$1;
                Object obj = inAppMessagesManager$fireRESTCallForClick$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$fireRESTCallForClick$12.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    String variantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
                    if (variantIdForMessage == null) {
                        return vVar;
                    }
                    clickId = inAppMessageClickResult.getClickId();
                    if (!inAppMessage.getRedisplayStats().isRedisplayEnabled() || clickId == null || !inAppMessage.isClickAvailable(clickId)) {
                        Set<String> set = this.clickedClickIds;
                        i.e(set, "<this>");
                        if (set.contains(clickId)) {
                            return vVar;
                        }
                    }
                    if (clickId != null) {
                        this.clickedClickIds.add(clickId);
                        inAppMessage.addClickId(clickId);
                    }
                    try {
                        IInAppBackendService iInAppBackendService = this._backend;
                        String appId = this._configModelStore.getModel().getAppId();
                        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = inAppMessage.getMessageId();
                        boolean isFirstClick = inAppMessageClickResult.isFirstClick();
                        inAppMessagesManager$fireRESTCallForClick$12.L$0 = this;
                        inAppMessagesManager$fireRESTCallForClick$12.L$1 = inAppMessage;
                        inAppMessagesManager$fireRESTCallForClick$12.L$2 = clickId;
                        inAppMessagesManager$fireRESTCallForClick$12.label = 1;
                        if (iInAppBackendService.sendIAMClick(appId, id, variantIdForMessage, messageId, clickId, isFirstClick, inAppMessagesManager$fireRESTCallForClick$12) == enumC1260a) {
                            return enumC1260a;
                        }
                        inAppMessagesManager = this;
                    } catch (BackendException unused) {
                        inAppMessagesManager = this;
                        inAppMessage2 = inAppMessage;
                        str = clickId;
                        Set<String> set2 = inAppMessagesManager.clickedClickIds;
                        kotlin.jvm.internal.v.a(set2);
                        set2.remove(str);
                        if (str != null) {
                        }
                        return vVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) inAppMessagesManager$fireRESTCallForClick$12.L$2;
                    inAppMessage2 = (InAppMessage) inAppMessagesManager$fireRESTCallForClick$12.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fireRESTCallForClick$12.L$0;
                    try {
                        g.y(obj);
                        clickId = str;
                        inAppMessage = inAppMessage2;
                    } catch (BackendException unused2) {
                        Set<String> set22 = inAppMessagesManager.clickedClickIds;
                        kotlin.jvm.internal.v.a(set22);
                        set22.remove(str);
                        if (str != null) {
                        }
                        return vVar;
                    }
                }
                inAppMessagesManager._prefs.setClickedMessagesId(inAppMessagesManager.clickedClickIds);
                return vVar;
            }
        }
        inAppMessagesManager$fireRESTCallForClick$1 = new InAppMessagesManager$fireRESTCallForClick$1(this, interfaceC1218d);
        InAppMessagesManager$fireRESTCallForClick$1 inAppMessagesManager$fireRESTCallForClick$122 = inAppMessagesManager$fireRESTCallForClick$1;
        Object obj2 = inAppMessagesManager$fireRESTCallForClick$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$fireRESTCallForClick$122.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        inAppMessagesManager._prefs.setClickedMessagesId(inAppMessagesManager.clickedClickIds);
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForPageChange(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$fireRESTCallForPageChange$1 inAppMessagesManager$fireRESTCallForPageChange$1;
        int i2;
        String str;
        InAppMessagesManager inAppMessagesManager;
        if (interfaceC1218d instanceof InAppMessagesManager$fireRESTCallForPageChange$1) {
            inAppMessagesManager$fireRESTCallForPageChange$1 = (InAppMessagesManager$fireRESTCallForPageChange$1) interfaceC1218d;
            int i3 = inAppMessagesManager$fireRESTCallForPageChange$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$fireRESTCallForPageChange$1.label = i3 - Integer.MIN_VALUE;
                InAppMessagesManager$fireRESTCallForPageChange$1 inAppMessagesManager$fireRESTCallForPageChange$12 = inAppMessagesManager$fireRESTCallForPageChange$1;
                Object obj = inAppMessagesManager$fireRESTCallForPageChange$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$fireRESTCallForPageChange$12.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    String variantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
                    if (variantIdForMessage == null) {
                        return vVar;
                    }
                    String pageId = inAppMessagePage.getPageId();
                    String str2 = inAppMessage.getMessageId() + pageId;
                    if (this.viewedPageIds.contains(str2)) {
                        Logging.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                        return vVar;
                    }
                    this.viewedPageIds.add(str2);
                    try {
                        IInAppBackendService iInAppBackendService = this._backend;
                        String appId = this._configModelStore.getModel().getAppId();
                        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = inAppMessage.getMessageId();
                        inAppMessagesManager$fireRESTCallForPageChange$12.L$0 = this;
                        inAppMessagesManager$fireRESTCallForPageChange$12.L$1 = str2;
                        inAppMessagesManager$fireRESTCallForPageChange$12.label = 1;
                        if (iInAppBackendService.sendIAMPageImpression(appId, id, variantIdForMessage, messageId, pageId, inAppMessagesManager$fireRESTCallForPageChange$12) == enumC1260a) {
                            return enumC1260a;
                        }
                        str = str2;
                        inAppMessagesManager = this;
                    } catch (BackendException unused) {
                        str = str2;
                        inAppMessagesManager = this;
                        inAppMessagesManager.viewedPageIds.remove(str);
                        return vVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) inAppMessagesManager$fireRESTCallForPageChange$12.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fireRESTCallForPageChange$12.L$0;
                    try {
                        g.y(obj);
                    } catch (BackendException unused2) {
                        inAppMessagesManager.viewedPageIds.remove(str);
                        return vVar;
                    }
                }
                inAppMessagesManager._prefs.setViewPageImpressionedIds(inAppMessagesManager.viewedPageIds);
                return vVar;
            }
        }
        inAppMessagesManager$fireRESTCallForPageChange$1 = new InAppMessagesManager$fireRESTCallForPageChange$1(this, interfaceC1218d);
        InAppMessagesManager$fireRESTCallForPageChange$1 inAppMessagesManager$fireRESTCallForPageChange$122 = inAppMessagesManager$fireRESTCallForPageChange$1;
        Object obj2 = inAppMessagesManager$fireRESTCallForPageChange$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$fireRESTCallForPageChange$122.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        inAppMessagesManager._prefs.setViewPageImpressionedIds(inAppMessagesManager.viewedPageIds);
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(InAppMessageClickResult inAppMessageClickResult) {
        if (inAppMessageClickResult.getTags() != null) {
            InAppMessageTag tags = inAppMessageClickResult.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                JSONUtils jSONUtils = JSONUtils.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                i.b(tagsToAdd);
                this._userManager.addTags(jSONUtils.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                JSONUtils jSONUtils2 = JSONUtils.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                i.b(tagsToRemove);
                this._userManager.removeTags(jSONUtils2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(InAppMessage inAppMessage) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(inAppMessage)) {
            return !inAppMessage.isDisplayedInSession();
        }
        return inAppMessage.isTriggerChanged() || (!inAppMessage.isDisplayedInSession() && inAppMessage.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(InAppMessageClickResult inAppMessageClickResult) {
        if (inAppMessageClickResult.getTags() != null) {
            Logging.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + inAppMessageClickResult.getTags(), null, 2, null);
        }
        if (inAppMessageClickResult.getOutcomes().size() > 0) {
            Logging.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + inAppMessageClickResult.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z) {
        synchronized (this.messages) {
            for (InAppMessage inAppMessage : this.messages) {
                boolean contains = this.redisplayedInAppMessages.contains(inAppMessage);
                boolean isTriggerOnMessage = this._triggerController.isTriggerOnMessage(inAppMessage, collection);
                boolean messageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(inAppMessage);
                if (!inAppMessage.isTriggerChanged() && contains && (isTriggerOnMessage || (z && messageHasOnlyDynamicTriggers))) {
                    Logging.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + inAppMessage, null, 2, null);
                    inAppMessage.setTriggerChanged(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(InAppMessage inAppMessage, boolean z, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$messageWasDismissed$1 inAppMessagesManager$messageWasDismissed$1;
        int i2;
        InAppMessagesManager inAppMessagesManager;
        if (interfaceC1218d instanceof InAppMessagesManager$messageWasDismissed$1) {
            inAppMessagesManager$messageWasDismissed$1 = (InAppMessagesManager$messageWasDismissed$1) interfaceC1218d;
            int i3 = inAppMessagesManager$messageWasDismissed$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$messageWasDismissed$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessagesManager$messageWasDismissed$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$messageWasDismissed$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    if (inAppMessage.isPreview()) {
                        inAppMessagesManager = this;
                        inAppMessagesManager._influenceManager.onInAppMessageDismissed();
                        if (inAppMessagesManager._state.getCurrentPrompt() != null) {
                            Logging.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                            return vVar;
                        }
                        if (inAppMessagesManager.lifecycleCallback.getHasSubscribers()) {
                            inAppMessagesManager.lifecycleCallback.fireOnMain(new InAppMessagesManager$messageWasDismissed$2(inAppMessage));
                        }
                        inAppMessagesManager._state.setInAppMessageIdShowing(null);
                        if (inAppMessagesManager.messageDisplayQueue.isEmpty()) {
                            Logging.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
                            inAppMessagesManager$messageWasDismissed$1.L$0 = null;
                            inAppMessagesManager$messageWasDismissed$1.L$1 = null;
                            inAppMessagesManager$messageWasDismissed$1.label = 3;
                            return inAppMessagesManager.evaluateInAppMessages(inAppMessagesManager$messageWasDismissed$1) == enumC1260a ? enumC1260a : vVar;
                        }
                        Logging.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                        inAppMessagesManager$messageWasDismissed$1.L$0 = null;
                        inAppMessagesManager$messageWasDismissed$1.L$1 = null;
                        inAppMessagesManager$messageWasDismissed$1.label = 2;
                        return inAppMessagesManager.attemptToShowInAppMessage(inAppMessagesManager$messageWasDismissed$1) == enumC1260a ? enumC1260a : vVar;
                    }
                    this.dismissedMessages.add(inAppMessage.getMessageId());
                    if (!z) {
                        this._prefs.setDismissedMessagesId(this.dismissedMessages);
                        this._state.setLastTimeInAppDismissed(new Long(this._time.getCurrentTimeMillis()));
                        inAppMessagesManager$messageWasDismissed$1.L$0 = this;
                        inAppMessagesManager$messageWasDismissed$1.L$1 = inAppMessage;
                        inAppMessagesManager$messageWasDismissed$1.label = 1;
                        if (persistInAppMessage(inAppMessage, inAppMessagesManager$messageWasDismissed$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    }
                    inAppMessagesManager = this;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            g.y(obj);
                        }
                        if (i2 == 3) {
                            g.y(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppMessage = (InAppMessage) inAppMessagesManager$messageWasDismissed$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$messageWasDismissed$1.L$0;
                    g.y(obj);
                }
                Logging.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + inAppMessagesManager.dismissedMessages, null, 2, null);
                inAppMessagesManager._influenceManager.onInAppMessageDismissed();
                if (inAppMessagesManager._state.getCurrentPrompt() != null) {
                }
            }
        }
        inAppMessagesManager$messageWasDismissed$1 = new InAppMessagesManager$messageWasDismissed$1(this, interfaceC1218d);
        Object obj2 = inAppMessagesManager$messageWasDismissed$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$messageWasDismissed$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        Logging.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + inAppMessagesManager.dismissedMessages, null, 2, null);
        inAppMessagesManager._influenceManager.onInAppMessageDismissed();
        if (inAppMessagesManager._state.getCurrentPrompt() != null) {
        }
    }

    public static /* synthetic */ Object messageWasDismissed$default(InAppMessagesManager inAppMessagesManager, InAppMessage inAppMessage, boolean z, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return inAppMessagesManager.messageWasDismissed(inAppMessage, z, interfaceC1218d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistInAppMessage(InAppMessage inAppMessage, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$persistInAppMessage$1 inAppMessagesManager$persistInAppMessage$1;
        int i2;
        InAppMessagesManager inAppMessagesManager;
        int indexOf;
        if (interfaceC1218d instanceof InAppMessagesManager$persistInAppMessage$1) {
            inAppMessagesManager$persistInAppMessage$1 = (InAppMessagesManager$persistInAppMessage$1) interfaceC1218d;
            int i3 = inAppMessagesManager$persistInAppMessage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$persistInAppMessage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessagesManager$persistInAppMessage$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$persistInAppMessage$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    inAppMessage.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    inAppMessage.getRedisplayStats().incrementDisplayQuantity();
                    inAppMessage.setTriggerChanged(false);
                    inAppMessage.setDisplayedInSession(true);
                    IInAppRepository iInAppRepository = this._repository;
                    inAppMessagesManager$persistInAppMessage$1.L$0 = this;
                    inAppMessagesManager$persistInAppMessage$1.L$1 = inAppMessage;
                    inAppMessagesManager$persistInAppMessage$1.label = 1;
                    if (iInAppRepository.saveInAppMessage(inAppMessage, inAppMessagesManager$persistInAppMessage$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppMessagesManager = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppMessage = (InAppMessage) inAppMessagesManager$persistInAppMessage$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$persistInAppMessage$1.L$0;
                    g.y(obj);
                }
                inAppMessagesManager._prefs.setLastTimeInAppDismissed(inAppMessagesManager._state.getLastTimeInAppDismissed());
                indexOf = inAppMessagesManager.redisplayedInAppMessages.indexOf(inAppMessage);
                if (indexOf == -1) {
                    inAppMessagesManager.redisplayedInAppMessages.set(indexOf, inAppMessage);
                } else {
                    inAppMessagesManager.redisplayedInAppMessages.add(inAppMessage);
                }
                Logging.debug$default("InAppMessagesManager.persistInAppMessage: " + inAppMessage + " with msg array data: " + inAppMessagesManager.redisplayedInAppMessages, null, 2, null);
                return v.f5689a;
            }
        }
        inAppMessagesManager$persistInAppMessage$1 = new InAppMessagesManager$persistInAppMessage$1(this, interfaceC1218d);
        Object obj2 = inAppMessagesManager$persistInAppMessage$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$persistInAppMessage$1.label;
        if (i2 != 0) {
        }
        inAppMessagesManager._prefs.setLastTimeInAppDismissed(inAppMessagesManager._state.getLastTimeInAppDismissed());
        indexOf = inAppMessagesManager.redisplayedInAppMessages.indexOf(inAppMessage);
        if (indexOf == -1) {
        }
        Logging.debug$default("InAppMessagesManager.persistInAppMessage: " + inAppMessage + " with msg array data: " + inAppMessagesManager.redisplayedInAppMessages, null, 2, null);
        return v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v9, types: [L4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(InAppMessage inAppMessage, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$queueMessageForDisplay$1 inAppMessagesManager$queueMessageForDisplay$1;
        EnumC1260a enumC1260a;
        int i2;
        d dVar;
        InAppMessagesManager inAppMessagesManager;
        try {
            if (interfaceC1218d instanceof InAppMessagesManager$queueMessageForDisplay$1) {
                inAppMessagesManager$queueMessageForDisplay$1 = (InAppMessagesManager$queueMessageForDisplay$1) interfaceC1218d;
                int i3 = inAppMessagesManager$queueMessageForDisplay$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    inAppMessagesManager$queueMessageForDisplay$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = inAppMessagesManager$queueMessageForDisplay$1.result;
                    enumC1260a = EnumC1260a.f11058a;
                    i2 = inAppMessagesManager$queueMessageForDisplay$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        L4.a aVar = this.messageDisplayQueueMutex;
                        inAppMessagesManager$queueMessageForDisplay$1.L$0 = this;
                        inAppMessagesManager$queueMessageForDisplay$1.L$1 = inAppMessage;
                        inAppMessagesManager$queueMessageForDisplay$1.L$2 = aVar;
                        inAppMessagesManager$queueMessageForDisplay$1.label = 1;
                        dVar = (d) aVar;
                        if (dVar.c(inAppMessagesManager$queueMessageForDisplay$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        inAppMessagesManager = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            g.y(obj);
                            return v.f5689a;
                        }
                        ?? r9 = (L4.a) inAppMessagesManager$queueMessageForDisplay$1.L$2;
                        InAppMessage inAppMessage2 = (InAppMessage) inAppMessagesManager$queueMessageForDisplay$1.L$1;
                        inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$queueMessageForDisplay$1.L$0;
                        g.y(obj);
                        dVar = r9;
                        inAppMessage = inAppMessage2;
                    }
                    if (!inAppMessagesManager.messageDisplayQueue.contains(inAppMessage) && !i.a(inAppMessagesManager._state.getInAppMessageIdShowing(), inAppMessage.getMessageId())) {
                        inAppMessagesManager.messageDisplayQueue.add(inAppMessage);
                        Logging.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + inAppMessage.getMessageId() + ", added to the queue", null, 2, null);
                    }
                    dVar.e(null);
                    inAppMessagesManager$queueMessageForDisplay$1.L$0 = null;
                    inAppMessagesManager$queueMessageForDisplay$1.L$1 = null;
                    inAppMessagesManager$queueMessageForDisplay$1.L$2 = null;
                    inAppMessagesManager$queueMessageForDisplay$1.label = 2;
                    if (inAppMessagesManager.attemptToShowInAppMessage(inAppMessagesManager$queueMessageForDisplay$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    return v.f5689a;
                }
            }
            if (!inAppMessagesManager.messageDisplayQueue.contains(inAppMessage)) {
                inAppMessagesManager.messageDisplayQueue.add(inAppMessage);
                Logging.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + inAppMessage.getMessageId() + ", added to the queue", null, 2, null);
            }
            dVar.e(null);
            inAppMessagesManager$queueMessageForDisplay$1.L$0 = null;
            inAppMessagesManager$queueMessageForDisplay$1.L$1 = null;
            inAppMessagesManager$queueMessageForDisplay$1.L$2 = null;
            inAppMessagesManager$queueMessageForDisplay$1.label = 2;
            if (inAppMessagesManager.attemptToShowInAppMessage(inAppMessagesManager$queueMessageForDisplay$1) == enumC1260a) {
            }
            return v.f5689a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        inAppMessagesManager$queueMessageForDisplay$1 = new InAppMessagesManager$queueMessageForDisplay$1(this, interfaceC1218d);
        Object obj2 = inAppMessagesManager$queueMessageForDisplay$1.result;
        enumC1260a = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$queueMessageForDisplay$1.label;
        if (i2 != 0) {
        }
    }

    private final void setDataForRedisplay(InAppMessage inAppMessage) {
        boolean contains = this.dismissedMessages.contains(inAppMessage.getMessageId());
        int indexOf = this.redisplayedInAppMessages.indexOf(inAppMessage);
        if (!contains || indexOf == -1) {
            return;
        }
        InAppMessage inAppMessage2 = this.redisplayedInAppMessages.get(indexOf);
        inAppMessage.getRedisplayStats().setDisplayStats(inAppMessage2.getRedisplayStats());
        inAppMessage.setDisplayedInSession(inAppMessage2.isDisplayedInSession());
        boolean hasMessageTriggerChanged = hasMessageTriggerChanged(inAppMessage);
        Logging.debug$default("InAppMessagesManager.setDataForRedisplay: " + inAppMessage + " triggerHasChanged: " + hasMessageTriggerChanged, null, 2, null);
        if (hasMessageTriggerChanged && inAppMessage.getRedisplayStats().isDelayTimeSatisfied() && inAppMessage.getRedisplayStats().shouldDisplayAgain()) {
            Logging.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + inAppMessage.getMessageId(), null, 2, null);
            this.dismissedMessages.remove(inAppMessage.getMessageId());
            this.impressionedMessages.remove(inAppMessage.getMessageId());
            this.viewedPageIds.clear();
            this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
            inAppMessage.clearClickIds();
        }
    }

    private final void showAlertDialogMessage(final InAppMessage inAppMessage, final List<? extends InAppMessagePrompt> list) {
        String string = this._applicationService.getAppContext().getString(R.string.location_permission_missing_title);
        i.d(string, "getString(...)");
        String string2 = this._applicationService.getAppContext().getString(R.string.location_permission_missing_message);
        i.d(string2, "getString(...)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onesignal.inAppMessages.internal.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InAppMessagesManager.showAlertDialogMessage$lambda$11(InAppMessagesManager.this, inAppMessage, list, dialogInterface, i2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialogMessage$lambda$11(InAppMessagesManager this$0, InAppMessage inAppMessage, List prompts, DialogInterface dialogInterface, int i2) {
        i.e(this$0, "this$0");
        i.e(inAppMessage, "$inAppMessage");
        i.e(prompts, "$prompts");
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$showAlertDialogMessage$1$1(this$0, inAppMessage, prompts, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b8 -> B:16:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMultiplePrompts(InAppMessage inAppMessage, List<? extends InAppMessagePrompt> list, InterfaceC1218d interfaceC1218d) {
        InAppMessagesManager$showMultiplePrompts$1 inAppMessagesManager$showMultiplePrompts$1;
        InAppMessagesManager inAppMessagesManager;
        int i2;
        Iterator<? extends InAppMessagePrompt> it;
        InAppMessagesManager$showMultiplePrompts$1 inAppMessagesManager$showMultiplePrompts$12;
        InAppMessagesManager inAppMessagesManager2;
        InAppMessage inAppMessage2;
        List<? extends InAppMessagePrompt> list2;
        InAppMessage inAppMessage3;
        InAppMessagesManager inAppMessagesManager3;
        if (interfaceC1218d instanceof InAppMessagesManager$showMultiplePrompts$1) {
            inAppMessagesManager$showMultiplePrompts$1 = (InAppMessagesManager$showMultiplePrompts$1) interfaceC1218d;
            int i3 = inAppMessagesManager$showMultiplePrompts$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$showMultiplePrompts$1.label = i3 - Integer.MIN_VALUE;
                inAppMessagesManager = this;
                Object obj = inAppMessagesManager$showMultiplePrompts$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagesManager$showMultiplePrompts$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    it = list.iterator();
                    inAppMessagesManager$showMultiplePrompts$12 = inAppMessagesManager$showMultiplePrompts$1;
                    inAppMessagesManager2 = inAppMessagesManager;
                    inAppMessage2 = inAppMessage;
                    list2 = list;
                    while (it.hasNext()) {
                    }
                    inAppMessage3 = inAppMessage2;
                    inAppMessagesManager3 = inAppMessagesManager2;
                    if (inAppMessagesManager3._state.getCurrentPrompt() == null) {
                    }
                    return vVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                    return vVar;
                }
                Iterator<? extends InAppMessagePrompt> it2 = (Iterator) inAppMessagesManager$showMultiplePrompts$1.L$3;
                List<? extends InAppMessagePrompt> list3 = (List) inAppMessagesManager$showMultiplePrompts$1.L$2;
                InAppMessage inAppMessage4 = (InAppMessage) inAppMessagesManager$showMultiplePrompts$1.L$1;
                inAppMessagesManager2 = (InAppMessagesManager) inAppMessagesManager$showMultiplePrompts$1.L$0;
                g.y(obj);
                inAppMessagesManager$showMultiplePrompts$12 = inAppMessagesManager$showMultiplePrompts$1;
                list2 = list3;
                it = it2;
                InAppMessagePrompt.PromptActionResult promptActionResult = (InAppMessagePrompt.PromptActionResult) obj;
                inAppMessagesManager2._state.setCurrentPrompt(null);
                Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + promptActionResult, null, 2, null);
                if (!inAppMessage4.isPreview() && promptActionResult == InAppMessagePrompt.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                    inAppMessagesManager2.showAlertDialogMessage(inAppMessage4, list2);
                    inAppMessage3 = inAppMessage4;
                    inAppMessagesManager3 = inAppMessagesManager2;
                    if (inAppMessagesManager3._state.getCurrentPrompt() == null) {
                    }
                    return vVar;
                }
                inAppMessage2 = inAppMessage4;
                while (it.hasNext()) {
                    InAppMessagePrompt next = it.next();
                    if (!next.hasPrompted()) {
                        inAppMessagesManager2._state.setCurrentPrompt(next);
                        Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + inAppMessagesManager2._state.getCurrentPrompt(), null, 2, null);
                        InAppMessagePrompt currentPrompt = inAppMessagesManager2._state.getCurrentPrompt();
                        i.b(currentPrompt);
                        currentPrompt.setPrompted(true);
                        InAppMessagePrompt currentPrompt2 = inAppMessagesManager2._state.getCurrentPrompt();
                        i.b(currentPrompt2);
                        inAppMessagesManager$showMultiplePrompts$12.L$0 = inAppMessagesManager2;
                        inAppMessagesManager$showMultiplePrompts$12.L$1 = inAppMessage2;
                        inAppMessagesManager$showMultiplePrompts$12.L$2 = list2;
                        inAppMessagesManager$showMultiplePrompts$12.L$3 = it;
                        inAppMessagesManager$showMultiplePrompts$12.label = 1;
                        Object handlePrompt = currentPrompt2.handlePrompt(inAppMessagesManager$showMultiplePrompts$12);
                        if (handlePrompt == enumC1260a) {
                            return enumC1260a;
                        }
                        inAppMessage4 = inAppMessage2;
                        obj = handlePrompt;
                        InAppMessagePrompt.PromptActionResult promptActionResult2 = (InAppMessagePrompt.PromptActionResult) obj;
                        inAppMessagesManager2._state.setCurrentPrompt(null);
                        Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + promptActionResult2, null, 2, null);
                        if (!inAppMessage4.isPreview()) {
                        }
                        inAppMessage2 = inAppMessage4;
                        while (it.hasNext()) {
                        }
                    }
                }
                inAppMessage3 = inAppMessage2;
                inAppMessagesManager3 = inAppMessagesManager2;
                if (inAppMessagesManager3._state.getCurrentPrompt() == null) {
                    Logging.debug$default("InAppMessagesManager.showMultiplePrompts: No IAM prompt to handle, dismiss message: " + inAppMessage3.getMessageId(), null, 2, null);
                    inAppMessagesManager$showMultiplePrompts$12.L$0 = null;
                    inAppMessagesManager$showMultiplePrompts$12.L$1 = null;
                    inAppMessagesManager$showMultiplePrompts$12.L$2 = null;
                    inAppMessagesManager$showMultiplePrompts$12.L$3 = null;
                    inAppMessagesManager$showMultiplePrompts$12.label = 2;
                    if (messageWasDismissed$default(inAppMessagesManager3, inAppMessage3, false, inAppMessagesManager$showMultiplePrompts$12, 2, null) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                return vVar;
            }
        }
        inAppMessagesManager = this;
        inAppMessagesManager$showMultiplePrompts$1 = new InAppMessagesManager$showMultiplePrompts$1(inAppMessagesManager, interfaceC1218d);
        Object obj2 = inAppMessagesManager$showMultiplePrompts$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagesManager$showMultiplePrompts$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addClickListener */
    public void mo10addClickListener(IInAppMessageClickListener listener) {
        i.e(listener, "listener");
        Logging.debug$default("InAppMessagesManager.addClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.subscribe(listener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addLifecycleListener */
    public void mo11addLifecycleListener(IInAppMessageLifecycleListener listener) {
        i.e(listener, "listener");
        Logging.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.subscribe(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTrigger */
    public void mo12addTrigger(String key, String value) {
        i.e(key, "key");
        i.e(value, "value");
        Logging.debug$default("InAppMessagesManager.addTrigger(key: " + key + ", value: " + value + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                Logging.verbose$default("InAppMessagesManager: Tracking trigger added early on cold start: ".concat(key), null, 2, null);
                this.earlySessionTriggers.add(key);
            }
        }
        TriggerModel triggerModel = (TriggerModel) this._triggerModelStore.get(key);
        if (triggerModel != null) {
            triggerModel.setValue(value);
            return;
        }
        TriggerModel triggerModel2 = new TriggerModel();
        triggerModel2.setId(key);
        triggerModel2.setKey(key);
        triggerModel2.setValue(value);
        IModelStore.DefaultImpls.add$default(this._triggerModelStore, triggerModel2, null, 2, null);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTriggers */
    public void mo13addTriggers(Map<String, String> triggers) {
        i.e(triggers, "triggers");
        Logging.debug$default("InAppMessagesManager.addTriggers(triggers: " + triggers + ')', null, 2, null);
        for (Map.Entry<String, String> entry : triggers.entrySet()) {
            mo12addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: clearTriggers */
    public void mo14clearTriggers() {
        Logging.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.clear();
            }
        }
        IModelStore.DefaultImpls.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
    }

    @Override // com.onesignal.user.internal.jwt.IJwtUpdateListener
    public void onJwtUpdated(String externalId) {
        i.e(externalId, "externalId");
        String str = this.pendingJwtRetryExternalId;
        RywData rywData = this.pendingJwtRetryRywData;
        if (str == null || !str.equals(externalId) || rywData == null) {
            return;
        }
        this.pendingJwtRetryExternalId = null;
        this.pendingJwtRetryRywData = null;
        Logging.info$default(AbstractC0279e.f("InAppMessagesManager: JWT refreshed for ", externalId, ", retrying IAM fetch"), null, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onJwtUpdated$1(this, rywData, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageActionOccurredOnMessage(InAppMessage message, InAppMessageClickResult action) {
        i.e(message, "message");
        i.e(action, "action");
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessageActionOccurredOnMessage$1(action, message, this, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageActionOccurredOnPreview(InAppMessage message, InAppMessageClickResult action) {
        i.e(message, "message");
        i.e(action, "action");
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessageActionOccurredOnPreview$1(action, message, this, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessagePageChanged(InAppMessage message, InAppMessagePage page) {
        i.e(message, "message");
        i.e(page, "page");
        if (message.isPreview()) {
            return;
        }
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessagePageChanged$1(this, message, page, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWasDismissed(InAppMessage message) {
        i.e(message, "message");
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessageWasDismissed$1(this, message, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWasDisplayed(InAppMessage message) {
        i.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new InAppMessagesManager$onMessageWasDisplayed$1(message));
        } else {
            Logging.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (message.isPreview() || this.impressionedMessages.contains(message.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(message.getMessageId());
        String variantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(message, this._languageContext);
        if (variantIdForMessage == null) {
            return;
        }
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessageWasDisplayed$2(this, variantIdForMessage, message, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWillDismiss(InAppMessage message) {
        i.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new InAppMessagesManager$onMessageWillDismiss$1(message));
        } else {
            Logging.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWillDisplay(InAppMessage message) {
        i.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new InAppMessagesManager$onMessageWillDisplay$1(message));
        } else {
            Logging.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (i.a(args.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j2) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        Iterator<InAppMessage> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionAdded(ISubscription subscription) {
        i.e(subscription, "subscription");
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionChanged(ISubscription subscription, ModelChangedArgs args) {
        i.e(subscription, "subscription");
        i.e(args, "args");
        if ((subscription instanceof IPushSubscription) && i.a(args.getPath(), OutcomeConstants.OUTCOME_ID)) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionRemoved(ISubscription subscription) {
        i.e(subscription, "subscription");
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerChanged(String newTriggerKey) {
        i.e(newTriggerKey, "newTriggerKey");
        Logging.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + newTriggerKey + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(b.W(newTriggerKey), true);
        ThreadUtilsKt.suspendifyOnDefault(new InAppMessagesManager$onTriggerChanged$1(this, null));
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerCompleted(String triggerId) {
        i.e(triggerId, "triggerId");
        Logging.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: ".concat(triggerId), null, 2, null);
        new HashSet().add(triggerId);
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerConditionChanged(String triggerId) {
        i.e(triggerId, "triggerId");
        Logging.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(b.W(triggerId), false);
        ThreadUtilsKt.suspendifyOnDefault(new InAppMessagesManager$onTriggerConditionChanged$1(this, null));
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeClickListener */
    public void mo15removeClickListener(IInAppMessageClickListener listener) {
        i.e(listener, "listener");
        Logging.debug$default("InAppMessagesManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(listener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeLifecycleListener */
    public void mo16removeLifecycleListener(IInAppMessageLifecycleListener listener) {
        i.e(listener, "listener");
        Logging.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(listener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTrigger */
    public void mo17removeTrigger(String key) {
        i.e(key, "key");
        Logging.debug$default("InAppMessagesManager.removeTrigger(key: " + key + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.remove(key);
            }
        }
        IModelStore.DefaultImpls.remove$default(this._triggerModelStore, key, null, 2, null);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTriggers */
    public void mo18removeTriggers(Collection<String> keys) {
        i.e(keys, "keys");
        Logging.debug$default("InAppMessagesManager.removeTriggers(keys: " + keys + ')', null, 2, null);
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            mo17removeTrigger((String) it.next());
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public void setPaused(boolean z) {
        Logging.debug$default("InAppMessagesManager.setPaused(value: " + z + ')', null, 2, null);
        this._state.setPaused(z);
        if (z && this._state.getInAppMessageIdShowing() != null) {
            ThreadUtilsKt.suspendifyOnMain(new InAppMessagesManager$paused$1(this, null));
        }
        if (z) {
            return;
        }
        ThreadUtilsKt.suspendifyOnDefault(new InAppMessagesManager$paused$2(this, null));
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        Set<String> dismissedMessagesId = this._prefs.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Long lastTimeInAppDismissed = this._prefs.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed != null) {
            this._state.setLastTimeInAppDismissed(lastTimeInAppDismissed);
        }
        this._subscriptionManager.subscribe(this);
        this._configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
        this._lifecycle.subscribe(this);
        this._triggerController.subscribe(this);
        this._sessionService.subscribe(this);
        this._applicationService.addApplicationLifecycleHandler(this);
        this._identityModelStore.subscribe((ISingletonModelStoreChangeHandler) this.identityModelChangeHandler);
        this._jwtTokenStore.addInternalUpdateListener(this);
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$start$1(this, null));
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        fetchMessagesWhenConditionIsMet();
    }
}
