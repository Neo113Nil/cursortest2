package com.onesignal.inAppMessages.internal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
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
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InAppMessagesManager.kt */
@Metadata(d1 = {"\u0000Í\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016*\u0001@\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nB\u00ad\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204¢\u0006\u0002\u00105J\u0010\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020JH\u0016J\u0010\u0010^\u001a\u00020\\2\u0006\u0010]\u001a\u00020HH\u0016J\u0018\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u0002082\u0006\u0010P\u001a\u000208H\u0016J\u001c\u0010a\u001a\u00020\\2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002080cH\u0016J\u000e\u0010d\u001a\u00020\\H\u0082@¢\u0006\u0002\u0010eJ$\u0010f\u001a\u00020\\2\u0006\u0010g\u001a\u00020M2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020j0iH\u0082@¢\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020\\H\u0016J\u000e\u0010m\u001a\u00020\\H\u0082@¢\u0006\u0002\u0010eJ<\u0010n\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010i2\u0006\u0010o\u001a\u0002082\u0006\u0010p\u001a\u0002082\u0006\u0010q\u001a\u00020X2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020D0sH\u0082@¢\u0006\u0002\u0010tJ\u0016\u0010u\u001a\u00020\\2\u0006\u0010q\u001a\u00020XH\u0082@¢\u0006\u0002\u0010vJ\b\u0010w\u001a\u00020\\H\u0002J\u0010\u0010x\u001a\u00020\\2\u0006\u0010y\u001a\u00020zH\u0002J$\u0010{\u001a\u00020\\2\u0006\u0010|\u001a\u0002082\f\u0010}\u001a\b\u0012\u0004\u0012\u00020~0iH\u0082@¢\u0006\u0002\u0010\u007fJ \u0010\u0080\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020M2\u0006\u0010y\u001a\u00020zH\u0082@¢\u0006\u0003\u0010\u0081\u0001J \u0010\u0082\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020M2\u0006\u0010y\u001a\u00020zH\u0082@¢\u0006\u0003\u0010\u0081\u0001J\"\u0010\u0083\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020M2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0082@¢\u0006\u0003\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\\2\u0006\u0010y\u001a\u00020zH\u0002J\u0011\u0010\u0088\u0001\u001a\u00020>2\u0006\u0010g\u001a\u00020MH\u0002J\u0011\u0010\u0089\u0001\u001a\u00020\\2\u0006\u0010y\u001a\u00020zH\u0002J\"\u0010\u008a\u0001\u001a\u00020\\2\u000e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u0002080\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020>H\u0002J#\u0010\u008e\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020M2\t\b\u0002\u0010\u008f\u0001\u001a\u00020>H\u0082@¢\u0006\u0003\u0010\u0090\u0001J\u0012\u0010\u0091\u0001\u001a\u00020\\2\u0007\u0010\u0092\u0001\u001a\u00020>H\u0016J\u0012\u0010\u0093\u0001\u001a\u00020\\2\u0007\u0010\u0094\u0001\u001a\u000208H\u0016J\u0019\u0010\u0095\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020M2\u0006\u0010y\u001a\u00020zH\u0016J\u0019\u0010\u0096\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020M2\u0006\u0010y\u001a\u00020zH\u0016J\u001b\u0010\u0097\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020M2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016J\u0011\u0010\u0098\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020MH\u0016J\u0011\u0010\u0099\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020MH\u0016J\u0011\u0010\u009a\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020MH\u0016J\u0011\u0010\u009b\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020MH\u0016J\u001b\u0010\u009c\u0001\u001a\u00020\\2\u0007\u0010\u009d\u0001\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u000208H\u0016J\u001c\u0010\u009f\u0001\u001a\u00020\\2\b\u0010 \u0001\u001a\u00030¡\u00012\u0007\u0010\u009e\u0001\u001a\u000208H\u0016J\t\u0010¢\u0001\u001a\u00020\\H\u0016J\u0012\u0010£\u0001\u001a\u00020\\2\u0007\u0010¤\u0001\u001a\u00020DH\u0016J\t\u0010¥\u0001\u001a\u00020\\H\u0016J\u0013\u0010¦\u0001\u001a\u00020\\2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0016J\u001d\u0010©\u0001\u001a\u00020\\2\b\u0010§\u0001\u001a\u00030¨\u00012\b\u0010 \u0001\u001a\u00030¡\u0001H\u0016J\u0013\u0010ª\u0001\u001a\u00020\\2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0016J\u0012\u0010«\u0001\u001a\u00020\\2\u0007\u0010¬\u0001\u001a\u000208H\u0016J\u0012\u0010\u00ad\u0001\u001a\u00020\\2\u0007\u0010®\u0001\u001a\u000208H\u0016J\u0012\u0010¯\u0001\u001a\u00020\\2\u0007\u0010®\u0001\u001a\u000208H\u0016J\t\u0010°\u0001\u001a\u00020\\H\u0016J\u0018\u0010±\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020MH\u0082@¢\u0006\u0003\u0010²\u0001J\u0018\u0010³\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020MH\u0082@¢\u0006\u0003\u0010²\u0001J\u0011\u0010´\u0001\u001a\u00020\\2\u0006\u0010]\u001a\u00020JH\u0016J\u0011\u0010µ\u0001\u001a\u00020\\2\u0006\u0010]\u001a\u00020HH\u0016J\u0011\u0010¶\u0001\u001a\u00020\\2\u0006\u0010`\u001a\u000208H\u0016J\u0019\u0010·\u0001\u001a\u00020\\2\u000e\u0010¸\u0001\u001a\t\u0012\u0004\u0012\u0002080\u008c\u0001H\u0016J\u0011\u0010¹\u0001\u001a\u00020\\2\u0006\u0010g\u001a\u00020MH\u0002J \u0010º\u0001\u001a\u00020\\2\u0007\u0010»\u0001\u001a\u00020M2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020j0iH\u0002J&\u0010¼\u0001\u001a\u00020\\2\u0007\u0010»\u0001\u001a\u00020M2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020j0iH\u0082@¢\u0006\u0002\u0010kJ\t\u0010½\u0001\u001a\u00020\\H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0004\n\u0002\u0010AR\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0004\n\u0002\u0010ER\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020J0GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010K\u001a\b\u0012\u0004\u0012\u00020M0LX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020M0LX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010Q\u001a\u00020>2\u0006\u0010P\u001a\u00020>8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0010\u0010V\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u0004\u0018\u00010XX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\b\u0012\u0004\u0012\u00020M0LX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¾\u0001"}, d2 = {"Lcom/onesignal/inAppMessages/internal/InAppMessagesManager;", "Lcom/onesignal/inAppMessages/IInAppMessagesManager;", "Lcom/onesignal/core/internal/startup/IStartableService;", "Lcom/onesignal/user/internal/subscriptions/ISubscriptionChangedHandler;", "Lcom/onesignal/common/modeling/ISingletonModelStoreChangeHandler;", "Lcom/onesignal/core/internal/config/ConfigModel;", "Lcom/onesignal/inAppMessages/internal/lifecycle/IInAppLifecycleEventHandler;", "Lcom/onesignal/inAppMessages/internal/triggers/ITriggerHandler;", "Lcom/onesignal/session/internal/session/ISessionLifecycleHandler;", "Lcom/onesignal/core/internal/application/IApplicationLifecycleHandler;", "Lcom/onesignal/user/internal/jwt/IJwtUpdateListener;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_sessionService", "Lcom/onesignal/session/internal/session/ISessionService;", "_influenceManager", "Lcom/onesignal/session/internal/influence/IInfluenceManager;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_userManager", "Lcom/onesignal/user/IUserManager;", "_identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "_subscriptionManager", "Lcom/onesignal/user/internal/subscriptions/ISubscriptionManager;", "_outcomeEventsController", "Lcom/onesignal/session/internal/outcomes/IOutcomeEventsController;", "_state", "Lcom/onesignal/inAppMessages/internal/state/InAppStateService;", "_prefs", "Lcom/onesignal/inAppMessages/internal/preferences/IInAppPreferencesController;", "_repository", "Lcom/onesignal/inAppMessages/internal/repositories/IInAppRepository;", "_backend", "Lcom/onesignal/inAppMessages/internal/backend/IInAppBackendService;", "_triggerController", "Lcom/onesignal/inAppMessages/internal/triggers/ITriggerController;", "_triggerModelStore", "Lcom/onesignal/inAppMessages/internal/triggers/TriggerModelStore;", "_displayer", "Lcom/onesignal/inAppMessages/internal/display/IInAppDisplayer;", "_lifecycle", "Lcom/onesignal/inAppMessages/internal/lifecycle/IInAppLifecycleService;", "_languageContext", "Lcom/onesignal/core/internal/language/ILanguageContext;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "_consistencyManager", "Lcom/onesignal/common/consistency/models/IConsistencyManager;", "_jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "_identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/session/internal/session/ISessionService;Lcom/onesignal/session/internal/influence/IInfluenceManager;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/user/IUserManager;Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/subscriptions/ISubscriptionManager;Lcom/onesignal/session/internal/outcomes/IOutcomeEventsController;Lcom/onesignal/inAppMessages/internal/state/InAppStateService;Lcom/onesignal/inAppMessages/internal/preferences/IInAppPreferencesController;Lcom/onesignal/inAppMessages/internal/repositories/IInAppRepository;Lcom/onesignal/inAppMessages/internal/backend/IInAppBackendService;Lcom/onesignal/inAppMessages/internal/triggers/ITriggerController;Lcom/onesignal/inAppMessages/internal/triggers/TriggerModelStore;Lcom/onesignal/inAppMessages/internal/display/IInAppDisplayer;Lcom/onesignal/inAppMessages/internal/lifecycle/IInAppLifecycleService;Lcom/onesignal/core/internal/language/ILanguageContext;Lcom/onesignal/core/internal/time/ITime;Lcom/onesignal/common/consistency/models/IConsistencyManager;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;)V", "clickedClickIds", "", "", "dismissedMessages", "earlySessionTriggers", "fetchIAMMutex", "Lkotlinx/coroutines/sync/Mutex;", "hasCompletedFirstFetch", "", "identityModelChangeHandler", "com/onesignal/inAppMessages/internal/InAppMessagesManager$identityModelChangeHandler$1", "Lcom/onesignal/inAppMessages/internal/InAppMessagesManager$identityModelChangeHandler$1;", "impressionedMessages", "lastTimeFetchedIAMs", "", "Ljava/lang/Long;", "lifecycleCallback", "Lcom/onesignal/common/events/EventProducer;", "Lcom/onesignal/inAppMessages/IInAppMessageLifecycleListener;", "messageClickCallback", "Lcom/onesignal/inAppMessages/IInAppMessageClickListener;", "messageDisplayQueue", "", "Lcom/onesignal/inAppMessages/internal/InAppMessage;", "messageDisplayQueueMutex", "messages", "value", "paused", "getPaused", "()Z", "setPaused", "(Z)V", "pendingJwtRetryExternalId", "pendingJwtRetryRywData", "Lcom/onesignal/common/consistency/RywData;", "redisplayedInAppMessages", "viewedPageIds", "addClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLifecycleListener", "addTrigger", "key", "addTriggers", "triggers", "", "attemptToShowInAppMessage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beginProcessingPrompts", "message", "prompts", "", "Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt;", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearTriggers", "evaluateInAppMessages", "fetchIvOrSaveRetry", "appId", "subscriptionId", "rywData", "sessionDurationProvider", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/common/consistency/RywData;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMessages", "(Lcom/onesignal/common/consistency/RywData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMessagesWhenConditionIsMet", "fireClickAction", "action", "Lcom/onesignal/inAppMessages/internal/InAppMessageClickResult;", "fireOutcomesForClick", "messageId", "outcomes", "Lcom/onesignal/inAppMessages/internal/InAppMessageOutcome;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firePublicClickHandler", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;Lcom/onesignal/inAppMessages/internal/InAppMessageClickResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fireRESTCallForClick", "fireRESTCallForPageChange", "page", "Lcom/onesignal/inAppMessages/internal/InAppMessagePage;", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;Lcom/onesignal/inAppMessages/internal/InAppMessagePage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fireTagCallForClick", "hasMessageTriggerChanged", "logInAppMessagePreviewActions", "makeRedisplayMessagesAvailableWithTriggers", "newTriggersKeys", "", "isNewTriggerAdded", "messageWasDismissed", "failed", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFocus", "firedOnSubscribe", "onJwtUpdated", "externalId", "onMessageActionOccurredOnMessage", "onMessageActionOccurredOnPreview", "onMessagePageChanged", "onMessageWasDismissed", "onMessageWasDisplayed", "onMessageWillDismiss", "onMessageWillDisplay", "onModelReplaced", CommonUrlParts.MODEL, "tag", "onModelUpdated", "args", "Lcom/onesignal/common/modeling/ModelChangedArgs;", "onSessionActive", "onSessionEnded", "duration", "onSessionStarted", "onSubscriptionAdded", "subscription", "Lcom/onesignal/user/subscriptions/ISubscription;", "onSubscriptionChanged", "onSubscriptionRemoved", "onTriggerChanged", "newTriggerKey", "onTriggerCompleted", "triggerId", "onTriggerConditionChanged", "onUnfocused", "persistInAppMessage", "(Lcom/onesignal/inAppMessages/internal/InAppMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queueMessageForDisplay", "removeClickListener", "removeLifecycleListener", "removeTrigger", "removeTriggers", "keys", "setDataForRedisplay", "showAlertDialogMessage", "inAppMessage", "showMultiplePrompts", ViewProps.START, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
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
    private final Mutex fetchIAMMutex;
    private boolean hasCompletedFirstFetch;
    private final InAppMessagesManager$identityModelChangeHandler$1 identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private volatile Long lastTimeFetchedIAMs;
    private final EventProducer<IInAppMessageLifecycleListener> lifecycleCallback;
    private final EventProducer<IInAppMessageClickListener> messageClickCallback;
    private final List<InAppMessage> messageDisplayQueue;
    private final Mutex messageDisplayQueueMutex;
    private List<InAppMessage> messages;
    private volatile String pendingJwtRetryExternalId;
    private volatile RywData pendingJwtRetryRywData;
    private final List<InAppMessage> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean firedOnSubscribe) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long duration) {
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionAdded(ISubscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionRemoved(ISubscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1] */
    public InAppMessagesManager(IApplicationService _applicationService, ISessionService _sessionService, IInfluenceManager _influenceManager, ConfigModelStore _configModelStore, IUserManager _userManager, IdentityModelStore _identityModelStore, ISubscriptionManager _subscriptionManager, IOutcomeEventsController _outcomeEventsController, InAppStateService _state, IInAppPreferencesController _prefs, IInAppRepository _repository, IInAppBackendService _backend, ITriggerController _triggerController, TriggerModelStore _triggerModelStore, IInAppDisplayer _displayer, IInAppLifecycleService _lifecycle, ILanguageContext _languageContext, ITime _time, IConsistencyManager _consistencyManager, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_userManager, "_userManager");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_outcomeEventsController, "_outcomeEventsController");
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_repository, "_repository");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_triggerController, "_triggerController");
        Intrinsics.checkNotNullParameter(_triggerModelStore, "_triggerModelStore");
        Intrinsics.checkNotNullParameter(_displayer, "_displayer");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
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
        this.messageDisplayQueueMutex = MutexKt.Mutex$default(false, 1, null);
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = MutexKt.Mutex$default(false, 1, null);
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        this.earlySessionTriggers = synchronizedSet;
        this.identityModelChangeHandler = new ISingletonModelStoreChangeHandler<IdentityModel>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1
            @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
            public void onModelReplaced(IdentityModel model, String tag) {
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(tag, "tag");
                InAppMessagesManager.this.pendingJwtRetryExternalId = null;
                InAppMessagesManager.this.pendingJwtRetryRywData = null;
            }

            @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
            public void onModelUpdated(ModelChangedArgs args, String tag) {
                Intrinsics.checkNotNullParameter(args, "args");
                Intrinsics.checkNotNullParameter(tag, "tag");
                if (Intrinsics.areEqual(args.getProperty(), IdentityConstants.ONESIGNAL_ID)) {
                    Object oldValue = args.getOldValue();
                    Intrinsics.checkNotNull(oldValue, "null cannot be cast to non-null type kotlin.String");
                    Object newValue = args.getNewValue();
                    Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) newValue;
                    if (!IDManager.INSTANCE.isLocalId((String) oldValue) || IDManager.INSTANCE.isLocalId(str)) {
                        return;
                    }
                    ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1(InAppMessagesManager.this, str, null));
                }
            }
        };
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public void setPaused(boolean z) {
        Logging.debug$default("InAppMessagesManager.setPaused(value: " + z + ')', null, 2, null);
        boolean paused = this._state.getPaused();
        this._state.setPaused(z);
        if (z && this._state.getInAppMessageIdShowing() != null) {
            ThreadUtilsKt.suspendifyOnMain(new InAppMessagesManager$paused$1(this, null));
        }
        if (!paused || z) {
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

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addLifecycleListener */
    public void mo3813addLifecycleListener(IInAppMessageLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logging.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.subscribe(listener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeLifecycleListener */
    public void mo3818removeLifecycleListener(IInAppMessageLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logging.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(listener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addClickListener */
    public void mo3812addClickListener(IInAppMessageClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logging.debug$default("InAppMessagesManager.addClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.subscribe(listener);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeClickListener */
    public void mo3817removeClickListener(IInAppMessageClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logging.debug$default("InAppMessagesManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(listener);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(args.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        fetchMessagesWhenConditionIsMet();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionChanged(ISubscription subscription, ModelChangedArgs args) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(args, "args");
        if ((subscription instanceof IPushSubscription) && Intrinsics.areEqual(args.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        Iterator<InAppMessage> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    private final void fetchMessagesWhenConditionIsMet() {
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$fetchMessagesWhenConditionIsMet$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c9, code lost:
    
        if (r4.evaluateInAppMessages(r9) == r3) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[Catch: all -> 0x01d5, TryCatch #0 {all -> 0x01d5, blocks: (B:55:0x00d4, B:57:0x00de, B:59:0x00f9, B:62:0x00ff), top: B:54:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(RywData rywData, Continuation<? super Unit> continuation) {
        InAppMessagesManager$fetchMessages$1 inAppMessagesManager$fetchMessages$1;
        int i;
        String id;
        Mutex mutex;
        RywData rywData2;
        int i2;
        String str;
        final InAppMessagesManager inAppMessagesManager;
        InAppMessagesManager inAppMessagesManager2;
        List list;
        try {
            if (continuation instanceof InAppMessagesManager$fetchMessages$1) {
                inAppMessagesManager$fetchMessages$1 = (InAppMessagesManager$fetchMessages$1) continuation;
                if ((inAppMessagesManager$fetchMessages$1.label & Integer.MIN_VALUE) != 0) {
                    inAppMessagesManager$fetchMessages$1.label -= Integer.MIN_VALUE;
                    InAppMessagesManager$fetchMessages$1 inAppMessagesManager$fetchMessages$12 = inAppMessagesManager$fetchMessages$1;
                    Object obj = inAppMessagesManager$fetchMessages$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = inAppMessagesManager$fetchMessages$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!this._applicationService.isInForeground()) {
                            return Unit.INSTANCE;
                        }
                        String appId = this._configModelStore.getModel().getAppId();
                        id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        if (id.length() == 0 || IDManager.INSTANCE.isLocalId(id) || appId.length() == 0) {
                            return Unit.INSTANCE;
                        }
                        mutex = this.fetchIAMMutex;
                        inAppMessagesManager$fetchMessages$12.L$0 = this;
                        inAppMessagesManager$fetchMessages$12.L$1 = rywData;
                        inAppMessagesManager$fetchMessages$12.L$2 = appId;
                        inAppMessagesManager$fetchMessages$12.L$3 = id;
                        inAppMessagesManager$fetchMessages$12.L$4 = mutex;
                        inAppMessagesManager$fetchMessages$12.label = 1;
                        if (mutex.lock(null, inAppMessagesManager$fetchMessages$12) != coroutine_suspended) {
                            rywData2 = rywData;
                            i2 = 3;
                            str = appId;
                            inAppMessagesManager = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        mutex = (Mutex) inAppMessagesManager$fetchMessages$12.L$4;
                        id = (String) inAppMessagesManager$fetchMessages$12.L$3;
                        String str2 = (String) inAppMessagesManager$fetchMessages$12.L$2;
                        RywData rywData3 = (RywData) inAppMessagesManager$fetchMessages$12.L$1;
                        inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fetchMessages$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = 3;
                        str = str2;
                        rywData2 = rywData3;
                    } else if (i == 2) {
                        inAppMessagesManager2 = (InAppMessagesManager) inAppMessagesManager$fetchMessages$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (list == null) {
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        inAppMessagesManager2 = (InAppMessagesManager) inAppMessagesManager$fetchMessages$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (list == null) {
                            inAppMessagesManager2.messages = TypeIntrinsics.asMutableList(list);
                            synchronized (inAppMessagesManager2.earlySessionTriggers) {
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
                                Unit unit = Unit.INSTANCE;
                            }
                            inAppMessagesManager$fetchMessages$12.L$0 = null;
                            inAppMessagesManager$fetchMessages$12.label = 4;
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                    long currentTimeMillis = inAppMessagesManager._time.getCurrentTimeMillis();
                    if (inAppMessagesManager.lastTimeFetchedIAMs != null) {
                        Long l = inAppMessagesManager.lastTimeFetchedIAMs;
                        Intrinsics.checkNotNull(l);
                        if (currentTimeMillis - l.longValue() < inAppMessagesManager._configModelStore.getModel().getFetchIAMMinInterval()) {
                            return Unit.INSTANCE;
                        }
                    }
                    inAppMessagesManager.lastTimeFetchedIAMs = Boxing.boxLong(currentTimeMillis);
                    Unit unit2 = Unit.INSTANCE;
                    mutex.unlock(null);
                    Function0<Long> function0 = new Function0<Long>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$fetchMessages$sessionDurationProvider$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Long invoke() {
                            ITime iTime;
                            ISessionService iSessionService;
                            iTime = InAppMessagesManager.this._time;
                            long currentTimeMillis2 = iTime.getCurrentTimeMillis();
                            iSessionService = InAppMessagesManager.this._sessionService;
                            return Long.valueOf(currentTimeMillis2 - iSessionService.getStartTime());
                        }
                    };
                    if (!inAppMessagesManager._identityVerificationService.getNewCodePathsRun()) {
                        inAppMessagesManager$fetchMessages$12.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fetchMessages$12.L$1 = null;
                        inAppMessagesManager$fetchMessages$12.L$2 = null;
                        inAppMessagesManager$fetchMessages$12.L$3 = null;
                        inAppMessagesManager$fetchMessages$12.L$4 = null;
                        inAppMessagesManager$fetchMessages$12.label = 2;
                        obj = inAppMessagesManager.fetchIvOrSaveRetry(str, id, rywData2, function0, inAppMessagesManager$fetchMessages$12);
                        if (obj != coroutine_suspended) {
                            inAppMessagesManager2 = inAppMessagesManager;
                            list = (List) obj;
                            if (list == null) {
                            }
                        }
                    } else {
                        IInAppBackendService iInAppBackendService = inAppMessagesManager._backend;
                        inAppMessagesManager$fetchMessages$12.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fetchMessages$12.L$1 = null;
                        inAppMessagesManager$fetchMessages$12.L$2 = null;
                        inAppMessagesManager$fetchMessages$12.L$3 = null;
                        inAppMessagesManager$fetchMessages$12.L$4 = null;
                        inAppMessagesManager$fetchMessages$12.label = i2;
                        obj = iInAppBackendService.listInAppMessages(str, id, rywData2, function0, inAppMessagesManager$fetchMessages$12);
                        if (obj != coroutine_suspended) {
                            inAppMessagesManager2 = inAppMessagesManager;
                            list = (List) obj;
                            if (list == null) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
            long currentTimeMillis2 = inAppMessagesManager._time.getCurrentTimeMillis();
            if (inAppMessagesManager.lastTimeFetchedIAMs != null) {
            }
            inAppMessagesManager.lastTimeFetchedIAMs = Boxing.boxLong(currentTimeMillis2);
            Unit unit22 = Unit.INSTANCE;
            mutex.unlock(null);
            Function0<Long> function02 = new Function0<Long>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$fetchMessages$sessionDurationProvider$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Long invoke() {
                    ITime iTime;
                    ISessionService iSessionService;
                    iTime = InAppMessagesManager.this._time;
                    long currentTimeMillis22 = iTime.getCurrentTimeMillis();
                    iSessionService = InAppMessagesManager.this._sessionService;
                    return Long.valueOf(currentTimeMillis22 - iSessionService.getStartTime());
                }
            };
            if (!inAppMessagesManager._identityVerificationService.getNewCodePathsRun()) {
            }
            return coroutine_suspended;
        } finally {
            mutex.unlock(null);
        }
        inAppMessagesManager$fetchMessages$1 = new InAppMessagesManager$fetchMessages$1(this, continuation);
        InAppMessagesManager$fetchMessages$1 inAppMessagesManager$fetchMessages$122 = inAppMessagesManager$fetchMessages$1;
        Object obj2 = inAppMessagesManager$fetchMessages$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$fetchMessages$122.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIvOrSaveRetry(String str, String str2, RywData rywData, Function0<Long> function0, Continuation<? super List<InAppMessage>> continuation) {
        InAppMessagesManager$fetchIvOrSaveRetry$1 inAppMessagesManager$fetchIvOrSaveRetry$1;
        int i;
        Triple triple;
        RywData rywData2;
        InAppMessagesManager inAppMessagesManager;
        boolean z;
        String str3;
        if (continuation instanceof InAppMessagesManager$fetchIvOrSaveRetry$1) {
            inAppMessagesManager$fetchIvOrSaveRetry$1 = (InAppMessagesManager$fetchIvOrSaveRetry$1) continuation;
            if ((inAppMessagesManager$fetchIvOrSaveRetry$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$fetchIvOrSaveRetry$1.label -= Integer.MIN_VALUE;
                InAppMessagesManager$fetchIvOrSaveRetry$1 inAppMessagesManager$fetchIvOrSaveRetry$12 = inAppMessagesManager$fetchIvOrSaveRetry$1;
                Object obj = inAppMessagesManager$fetchIvOrSaveRetry$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$fetchIvOrSaveRetry$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
                    String externalId = this._identityModelStore.getModel().getExternalId();
                    String onesignalId = this._identityModelStore.getModel().getOnesignalId();
                    if (ivBehaviorActive && externalId != null) {
                        triple = new Triple(IdentityConstants.EXTERNAL_ID, externalId, this._jwtTokenStore.getJwt(externalId));
                    } else {
                        triple = new Triple(IdentityConstants.ONESIGNAL_ID, onesignalId, null);
                    }
                    String str4 = (String) triple.component1();
                    String str5 = (String) triple.component2();
                    String str6 = (String) triple.component3();
                    if (!ivBehaviorActive || externalId == null) {
                        rywData2 = rywData;
                    } else {
                        this.pendingJwtRetryExternalId = externalId;
                        rywData2 = rywData;
                        this.pendingJwtRetryRywData = rywData2;
                    }
                    try {
                        IInAppBackendService iInAppBackendService = this._backend;
                        inAppMessagesManager$fetchIvOrSaveRetry$12.L$0 = this;
                        inAppMessagesManager$fetchIvOrSaveRetry$12.L$1 = externalId;
                        inAppMessagesManager$fetchIvOrSaveRetry$12.Z$0 = ivBehaviorActive;
                        inAppMessagesManager$fetchIvOrSaveRetry$12.label = 1;
                        obj = iInAppBackendService.listInAppMessagesIv(str, str4, str5, str2, rywData2, function0, str6, inAppMessagesManager$fetchIvOrSaveRetry$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        inAppMessagesManager = this;
                        z = ivBehaviorActive;
                        str3 = externalId;
                    } catch (BackendException e) {
                        e = e;
                        inAppMessagesManager = this;
                        z = ivBehaviorActive;
                        str3 = externalId;
                        if (!z && str3 != null) {
                            Logging.info$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ", awaiting JWT refresh for " + str3, null, 2, null);
                            inAppMessagesManager.lastTimeFetchedIAMs = null;
                        } else {
                            Logging.warn$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ": " + e.getResponse(), null, 2, null);
                        }
                        return null;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = inAppMessagesManager$fetchIvOrSaveRetry$12.Z$0;
                    str3 = (String) inAppMessagesManager$fetchIvOrSaveRetry$12.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fetchIvOrSaveRetry$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (BackendException e2) {
                        e = e2;
                        if (!z) {
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
        inAppMessagesManager$fetchIvOrSaveRetry$1 = new InAppMessagesManager$fetchIvOrSaveRetry$1(this, continuation);
        InAppMessagesManager$fetchIvOrSaveRetry$1 inAppMessagesManager$fetchIvOrSaveRetry$122 = inAppMessagesManager$fetchIvOrSaveRetry$1;
        Object obj2 = inAppMessagesManager$fetchIvOrSaveRetry$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$fetchIvOrSaveRetry$122.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        inAppMessagesManager.pendingJwtRetryExternalId = null;
        inAppMessagesManager.pendingJwtRetryRywData = null;
        return list2;
    }

    @Override // com.onesignal.user.internal.jwt.IJwtUpdateListener
    public void onJwtUpdated(String externalId) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        String str = this.pendingJwtRetryExternalId;
        RywData rywData = this.pendingJwtRetryRywData;
        if (str == null || !Intrinsics.areEqual(str, externalId) || rywData == null) {
            return;
        }
        this.pendingJwtRetryExternalId = null;
        this.pendingJwtRetryRywData = null;
        Logging.info$default("InAppMessagesManager: JWT refreshed for " + externalId + ", retrying IAM fetch", null, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onJwtUpdated$1(this, rywData, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateInAppMessages(Continuation<? super Unit> continuation) {
        InAppMessagesManager$evaluateInAppMessages$1 inAppMessagesManager$evaluateInAppMessages$1;
        int i;
        InAppMessagesManager inAppMessagesManager;
        Iterator it;
        if (continuation instanceof InAppMessagesManager$evaluateInAppMessages$1) {
            inAppMessagesManager$evaluateInAppMessages$1 = (InAppMessagesManager$evaluateInAppMessages$1) continuation;
            if ((inAppMessagesManager$evaluateInAppMessages$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$evaluateInAppMessages$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessagesManager$evaluateInAppMessages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$evaluateInAppMessages$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
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
                        Unit unit = Unit.INSTANCE;
                    }
                    inAppMessagesManager = this;
                    it = arrayList.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) inAppMessagesManager$evaluateInAppMessages$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$evaluateInAppMessages$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    InAppMessage inAppMessage2 = (InAppMessage) it.next();
                    inAppMessagesManager$evaluateInAppMessages$1.L$0 = inAppMessagesManager;
                    inAppMessagesManager$evaluateInAppMessages$1.L$1 = it;
                    inAppMessagesManager$evaluateInAppMessages$1.label = 1;
                    if (inAppMessagesManager.queueMessageForDisplay(inAppMessage2, inAppMessagesManager$evaluateInAppMessages$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        inAppMessagesManager$evaluateInAppMessages$1 = new InAppMessagesManager$evaluateInAppMessages$1(this, continuation);
        Object obj2 = inAppMessagesManager$evaluateInAppMessages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$evaluateInAppMessages$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    private final void setDataForRedisplay(InAppMessage message) {
        boolean contains = this.dismissedMessages.contains(message.getMessageId());
        int indexOf = this.redisplayedInAppMessages.indexOf(message);
        if (!contains || indexOf == -1) {
            return;
        }
        InAppMessage inAppMessage = this.redisplayedInAppMessages.get(indexOf);
        message.getRedisplayStats().setDisplayStats(inAppMessage.getRedisplayStats());
        message.setDisplayedInSession(inAppMessage.getDisplayedInSession());
        boolean hasMessageTriggerChanged = hasMessageTriggerChanged(message);
        Logging.debug$default("InAppMessagesManager.setDataForRedisplay: " + message + " triggerHasChanged: " + hasMessageTriggerChanged, null, 2, null);
        if (hasMessageTriggerChanged && message.getRedisplayStats().isDelayTimeSatisfied() && message.getRedisplayStats().shouldDisplayAgain()) {
            Logging.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + message.getMessageId(), null, 2, null);
            this.dismissedMessages.remove(message.getMessageId());
            this.impressionedMessages.remove(message.getMessageId());
            this.viewedPageIds.clear();
            this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
            message.clearClickIds();
        }
    }

    private final boolean hasMessageTriggerChanged(InAppMessage message) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(message)) {
            return !message.getDisplayedInSession();
        }
        return message.getTriggerChanged() || (!message.getDisplayedInSession() && message.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (r4.attemptToShowInAppMessage(r1) != r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(InAppMessage inAppMessage, Continuation<? super Unit> continuation) {
        InAppMessagesManager$queueMessageForDisplay$1 inAppMessagesManager$queueMessageForDisplay$1;
        int i;
        Mutex mutex;
        InAppMessagesManager inAppMessagesManager;
        try {
            if (continuation instanceof InAppMessagesManager$queueMessageForDisplay$1) {
                inAppMessagesManager$queueMessageForDisplay$1 = (InAppMessagesManager$queueMessageForDisplay$1) continuation;
                if ((inAppMessagesManager$queueMessageForDisplay$1.label & Integer.MIN_VALUE) != 0) {
                    inAppMessagesManager$queueMessageForDisplay$1.label -= Integer.MIN_VALUE;
                    Object obj = inAppMessagesManager$queueMessageForDisplay$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = inAppMessagesManager$queueMessageForDisplay$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.messageDisplayQueueMutex;
                        inAppMessagesManager$queueMessageForDisplay$1.L$0 = this;
                        inAppMessagesManager$queueMessageForDisplay$1.L$1 = inAppMessage;
                        inAppMessagesManager$queueMessageForDisplay$1.L$2 = mutex;
                        inAppMessagesManager$queueMessageForDisplay$1.label = 1;
                        if (mutex.lock(null, inAppMessagesManager$queueMessageForDisplay$1) != coroutine_suspended) {
                            inAppMessagesManager = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    Mutex mutex2 = (Mutex) inAppMessagesManager$queueMessageForDisplay$1.L$2;
                    InAppMessage inAppMessage2 = (InAppMessage) inAppMessagesManager$queueMessageForDisplay$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$queueMessageForDisplay$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex2;
                    inAppMessage = inAppMessage2;
                    if (!inAppMessagesManager.messageDisplayQueue.contains(inAppMessage) && !Intrinsics.areEqual(inAppMessagesManager._state.getInAppMessageIdShowing(), inAppMessage.getMessageId())) {
                        inAppMessagesManager.messageDisplayQueue.add(inAppMessage);
                        Logging.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + inAppMessage.getMessageId() + ", added to the queue", null, 2, null);
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    inAppMessagesManager$queueMessageForDisplay$1.L$0 = null;
                    inAppMessagesManager$queueMessageForDisplay$1.L$1 = null;
                    inAppMessagesManager$queueMessageForDisplay$1.L$2 = null;
                    inAppMessagesManager$queueMessageForDisplay$1.label = 2;
                }
            }
            if (!inAppMessagesManager.messageDisplayQueue.contains(inAppMessage)) {
                inAppMessagesManager.messageDisplayQueue.add(inAppMessage);
                Logging.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + inAppMessage.getMessageId() + ", added to the queue", null, 2, null);
            }
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            inAppMessagesManager$queueMessageForDisplay$1.L$0 = null;
            inAppMessagesManager$queueMessageForDisplay$1.L$1 = null;
            inAppMessagesManager$queueMessageForDisplay$1.L$2 = null;
            inAppMessagesManager$queueMessageForDisplay$1.label = 2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        inAppMessagesManager$queueMessageForDisplay$1 = new InAppMessagesManager$queueMessageForDisplay$1(this, continuation);
        Object obj2 = inAppMessagesManager$queueMessageForDisplay$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$queueMessageForDisplay$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013e, code lost:
    
        if (r3.queueMessageForDisplay((com.onesignal.inAppMessages.internal.InAppMessage) r15, r1) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0171, code lost:
    
        if (r3.messageWasDismissed((com.onesignal.inAppMessages.internal.InAppMessage) r15, true, r1) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r11.lock(null, r1) == r2) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(Continuation<? super Unit> continuation) {
        InAppMessagesManager$attemptToShowInAppMessage$1 inAppMessagesManager$attemptToShowInAppMessage$1;
        Object obj;
        int i;
        InAppMessagesManager inAppMessagesManager;
        Ref.ObjectRef objectRef;
        Mutex mutex;
        Ref.ObjectRef objectRef2;
        Boolean bool;
        if (continuation instanceof InAppMessagesManager$attemptToShowInAppMessage$1) {
            inAppMessagesManager$attemptToShowInAppMessage$1 = (InAppMessagesManager$attemptToShowInAppMessage$1) continuation;
            if ((inAppMessagesManager$attemptToShowInAppMessage$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$attemptToShowInAppMessage$1.label -= Integer.MIN_VALUE;
                obj = inAppMessagesManager$attemptToShowInAppMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$attemptToShowInAppMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IApplicationService iApplicationService = this._applicationService;
                    inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = this;
                    inAppMessagesManager$attemptToShowInAppMessage$1.label = 1;
                    obj = iApplicationService.waitUntilSystemConditionsAvailable(inAppMessagesManager$attemptToShowInAppMessage$1);
                    if (obj != coroutine_suspended) {
                        inAppMessagesManager = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        objectRef2 = (Ref.ObjectRef) inAppMessagesManager$attemptToShowInAppMessage$1.L$1;
                        inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$attemptToShowInAppMessage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        bool = (Boolean) obj;
                        if (bool != null) {
                            inAppMessagesManager._state.setInAppMessageIdShowing(null);
                            T t = objectRef2.element;
                            Intrinsics.checkNotNull(t);
                            inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = null;
                            inAppMessagesManager$attemptToShowInAppMessage$1.L$1 = null;
                            inAppMessagesManager$attemptToShowInAppMessage$1.label = 4;
                        } else {
                            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                                inAppMessagesManager._state.setInAppMessageIdShowing(null);
                                TypeIntrinsics.asMutableCollection(inAppMessagesManager.messages).remove(objectRef2.element);
                                T t2 = objectRef2.element;
                                Intrinsics.checkNotNull(t2);
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = null;
                                inAppMessagesManager$attemptToShowInAppMessage$1.L$1 = null;
                                inAppMessagesManager$attemptToShowInAppMessage$1.label = 5;
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    Mutex mutex2 = (Mutex) inAppMessagesManager$attemptToShowInAppMessage$1.L$2;
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) inAppMessagesManager$attemptToShowInAppMessage$1.L$1;
                    InAppMessagesManager inAppMessagesManager2 = (InAppMessagesManager) inAppMessagesManager$attemptToShowInAppMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    objectRef = objectRef3;
                    mutex = mutex2;
                    inAppMessagesManager = inAppMessagesManager2;
                    try {
                        Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + inAppMessagesManager.messageDisplayQueue, null, 2, null);
                        if (inAppMessagesManager.getPaused()) {
                            Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                        } else if (inAppMessagesManager.messageDisplayQueue.isEmpty()) {
                            Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                        } else if (inAppMessagesManager._state.getInAppMessageIdShowing() != null) {
                            Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                        } else {
                            Logging.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                            objectRef.element = inAppMessagesManager.messageDisplayQueue.remove(0);
                            InAppStateService inAppStateService = inAppMessagesManager._state;
                            T t3 = objectRef.element;
                            Intrinsics.checkNotNull(t3);
                            inAppStateService.setInAppMessageIdShowing(((InAppMessage) t3).getMessageId());
                        }
                        Unit unit = Unit.INSTANCE;
                        mutex.unlock(null);
                        if (objectRef.element != 0) {
                            IInAppDisplayer iInAppDisplayer = inAppMessagesManager._displayer;
                            T t4 = objectRef.element;
                            Intrinsics.checkNotNull(t4);
                            inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = inAppMessagesManager;
                            inAppMessagesManager$attemptToShowInAppMessage$1.L$1 = objectRef;
                            inAppMessagesManager$attemptToShowInAppMessage$1.L$2 = null;
                            inAppMessagesManager$attemptToShowInAppMessage$1.label = 3;
                            Object displayMessage = iInAppDisplayer.displayMessage((InAppMessage) t4, inAppMessagesManager$attemptToShowInAppMessage$1);
                            if (displayMessage != coroutine_suspended) {
                                objectRef2 = objectRef;
                                obj = displayMessage;
                                bool = (Boolean) obj;
                                if (bool != null) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        mutex.unlock(null);
                        throw th;
                    }
                }
                inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$attemptToShowInAppMessage$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    Logging.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
                    return Unit.INSTANCE;
                }
                objectRef = new Ref.ObjectRef();
                mutex = inAppMessagesManager.messageDisplayQueueMutex;
                inAppMessagesManager$attemptToShowInAppMessage$1.L$0 = inAppMessagesManager;
                inAppMessagesManager$attemptToShowInAppMessage$1.L$1 = objectRef;
                inAppMessagesManager$attemptToShowInAppMessage$1.L$2 = mutex;
                inAppMessagesManager$attemptToShowInAppMessage$1.label = 2;
            }
        }
        inAppMessagesManager$attemptToShowInAppMessage$1 = new InAppMessagesManager$attemptToShowInAppMessage$1(this, continuation);
        obj = inAppMessagesManager$attemptToShowInAppMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$attemptToShowInAppMessage$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        if (r11.attemptToShowInAppMessage(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        if (r11.evaluateInAppMessages(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        if (persistInAppMessage(r10, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(final InAppMessage inAppMessage, boolean z, Continuation<? super Unit> continuation) {
        InAppMessagesManager$messageWasDismissed$1 inAppMessagesManager$messageWasDismissed$1;
        int i;
        InAppMessagesManager inAppMessagesManager;
        if (continuation instanceof InAppMessagesManager$messageWasDismissed$1) {
            inAppMessagesManager$messageWasDismissed$1 = (InAppMessagesManager$messageWasDismissed$1) continuation;
            if ((inAppMessagesManager$messageWasDismissed$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$messageWasDismissed$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessagesManager$messageWasDismissed$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$messageWasDismissed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!inAppMessage.getIsPreview()) {
                        this.dismissedMessages.add(inAppMessage.getMessageId());
                        if (!z) {
                            this._prefs.setDismissedMessagesId(this.dismissedMessages);
                            this._state.setLastTimeInAppDismissed(Boxing.boxLong(this._time.getCurrentTimeMillis()));
                            inAppMessagesManager$messageWasDismissed$1.L$0 = this;
                            inAppMessagesManager$messageWasDismissed$1.L$1 = inAppMessage;
                            inAppMessagesManager$messageWasDismissed$1.label = 1;
                        }
                        inAppMessagesManager = this;
                    } else {
                        inAppMessagesManager = this;
                        inAppMessagesManager._influenceManager.onInAppMessageDismissed();
                        if (inAppMessagesManager._state.getCurrentPrompt() != null) {
                            Logging.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                            return Unit.INSTANCE;
                        }
                        if (inAppMessagesManager.lifecycleCallback.getHasSubscribers()) {
                            inAppMessagesManager.lifecycleCallback.fireOnMain(new Function1<IInAppMessageLifecycleListener, Unit>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$messageWasDismissed$2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
                                    invoke2(iInAppMessageLifecycleListener);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(IInAppMessageLifecycleListener it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    it.onDidDismiss(new InAppMessageLifecycleEvent(InAppMessage.this));
                                }
                            });
                        }
                        inAppMessagesManager._state.setInAppMessageIdShowing(null);
                        if (!inAppMessagesManager.messageDisplayQueue.isEmpty()) {
                            Logging.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                            inAppMessagesManager$messageWasDismissed$1.L$0 = null;
                            inAppMessagesManager$messageWasDismissed$1.L$1 = null;
                            inAppMessagesManager$messageWasDismissed$1.label = 2;
                        } else {
                            Logging.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
                            inAppMessagesManager$messageWasDismissed$1.L$0 = null;
                            inAppMessagesManager$messageWasDismissed$1.L$1 = null;
                            inAppMessagesManager$messageWasDismissed$1.label = 3;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    inAppMessage = (InAppMessage) inAppMessagesManager$messageWasDismissed$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$messageWasDismissed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Logging.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + inAppMessagesManager.dismissedMessages, null, 2, null);
                inAppMessagesManager._influenceManager.onInAppMessageDismissed();
                if (inAppMessagesManager._state.getCurrentPrompt() != null) {
                }
            }
        }
        inAppMessagesManager$messageWasDismissed$1 = new InAppMessagesManager$messageWasDismissed$1(this, continuation);
        Object obj2 = inAppMessagesManager$messageWasDismissed$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$messageWasDismissed$1.label;
        if (i != 0) {
        }
        Logging.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + inAppMessagesManager.dismissedMessages, null, 2, null);
        inAppMessagesManager._influenceManager.onInAppMessageDismissed();
        if (inAppMessagesManager._state.getCurrentPrompt() != null) {
        }
    }

    static /* synthetic */ Object messageWasDismissed$default(InAppMessagesManager inAppMessagesManager, InAppMessage inAppMessage, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return inAppMessagesManager.messageWasDismissed(inAppMessage, z, continuation);
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> newTriggersKeys, boolean isNewTriggerAdded) {
        synchronized (this.messages) {
            for (InAppMessage inAppMessage : this.messages) {
                boolean contains = this.redisplayedInAppMessages.contains(inAppMessage);
                boolean isTriggerOnMessage = this._triggerController.isTriggerOnMessage(inAppMessage, newTriggersKeys);
                boolean messageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(inAppMessage);
                if (!inAppMessage.getTriggerChanged() && contains && (isTriggerOnMessage || (isNewTriggerAdded && messageHasOnlyDynamicTriggers))) {
                    Logging.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + inAppMessage, null, 2, null);
                    inAppMessage.setTriggerChanged(true);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistInAppMessage(InAppMessage inAppMessage, Continuation<? super Unit> continuation) {
        InAppMessagesManager$persistInAppMessage$1 inAppMessagesManager$persistInAppMessage$1;
        int i;
        InAppMessagesManager inAppMessagesManager;
        int indexOf;
        if (continuation instanceof InAppMessagesManager$persistInAppMessage$1) {
            inAppMessagesManager$persistInAppMessage$1 = (InAppMessagesManager$persistInAppMessage$1) continuation;
            if ((inAppMessagesManager$persistInAppMessage$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$persistInAppMessage$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessagesManager$persistInAppMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$persistInAppMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    inAppMessage.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / 1000);
                    inAppMessage.getRedisplayStats().incrementDisplayQuantity();
                    inAppMessage.setTriggerChanged(false);
                    inAppMessage.setDisplayedInSession(true);
                    IInAppRepository iInAppRepository = this._repository;
                    inAppMessagesManager$persistInAppMessage$1.L$0 = this;
                    inAppMessagesManager$persistInAppMessage$1.L$1 = inAppMessage;
                    inAppMessagesManager$persistInAppMessage$1.label = 1;
                    if (iInAppRepository.saveInAppMessage(inAppMessage, inAppMessagesManager$persistInAppMessage$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inAppMessagesManager = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppMessage = (InAppMessage) inAppMessagesManager$persistInAppMessage$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$persistInAppMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                inAppMessagesManager._prefs.setLastTimeInAppDismissed(inAppMessagesManager._state.getLastTimeInAppDismissed());
                indexOf = inAppMessagesManager.redisplayedInAppMessages.indexOf(inAppMessage);
                if (indexOf == -1) {
                    inAppMessagesManager.redisplayedInAppMessages.set(indexOf, inAppMessage);
                } else {
                    inAppMessagesManager.redisplayedInAppMessages.add(inAppMessage);
                }
                Logging.debug$default("InAppMessagesManager.persistInAppMessage: " + inAppMessage + " with msg array data: " + inAppMessagesManager.redisplayedInAppMessages, null, 2, null);
                return Unit.INSTANCE;
            }
        }
        inAppMessagesManager$persistInAppMessage$1 = new InAppMessagesManager$persistInAppMessage$1(this, continuation);
        Object obj2 = inAppMessagesManager$persistInAppMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$persistInAppMessage$1.label;
        if (i != 0) {
        }
        inAppMessagesManager._prefs.setLastTimeInAppDismissed(inAppMessagesManager._state.getLastTimeInAppDismissed());
        indexOf = inAppMessagesManager.redisplayedInAppMessages.indexOf(inAppMessage);
        if (indexOf == -1) {
        }
        Logging.debug$default("InAppMessagesManager.persistInAppMessage: " + inAppMessage + " with msg array data: " + inAppMessagesManager.redisplayedInAppMessages, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTriggers */
    public void mo3815addTriggers(Map<String, String> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        Logging.debug$default("InAppMessagesManager.addTriggers(triggers: " + triggers + ')', null, 2, null);
        for (Map.Entry<String, String> entry : triggers.entrySet()) {
            mo3814addTrigger(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTrigger */
    public void mo3814addTrigger(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Logging.debug$default("InAppMessagesManager.addTrigger(key: " + key + ", value: " + value + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                Logging.verbose$default("InAppMessagesManager: Tracking trigger added early on cold start: " + key, null, 2, null);
                this.earlySessionTriggers.add(key);
            }
            Unit unit = Unit.INSTANCE;
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
    /* renamed from: removeTriggers */
    public void mo3820removeTriggers(Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Logging.debug$default("InAppMessagesManager.removeTriggers(keys: " + keys + ')', null, 2, null);
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            mo3819removeTrigger((String) it.next());
        }
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTrigger */
    public void mo3819removeTrigger(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Logging.debug$default("InAppMessagesManager.removeTrigger(key: " + key + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.remove(key);
            }
            Unit unit = Unit.INSTANCE;
        }
        IModelStore.DefaultImpls.remove$default(this._triggerModelStore, key, null, 2, null);
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: clearTriggers */
    public void mo3816clearTriggers() {
        Logging.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
        IModelStore.DefaultImpls.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWillDisplay(final InAppMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!this.lifecycleCallback.getHasSubscribers()) {
            Logging.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        } else {
            this.lifecycleCallback.fireOnMain(new Function1<IInAppMessageLifecycleListener, Unit>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWillDisplay$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
                    invoke2(iInAppMessageLifecycleListener);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IInAppMessageLifecycleListener it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onWillDisplay(new InAppMessageLifecycleEvent(InAppMessage.this));
                }
            });
        }
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWasDisplayed(final InAppMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new Function1<IInAppMessageLifecycleListener, Unit>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDisplayed$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
                    invoke2(iInAppMessageLifecycleListener);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IInAppMessageLifecycleListener it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onDidDisplay(new InAppMessageLifecycleEvent(InAppMessage.this));
                }
            });
        } else {
            Logging.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (message.getIsPreview() || this.impressionedMessages.contains(message.getMessageId())) {
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
    public void onMessageActionOccurredOnPreview(InAppMessage message, InAppMessageClickResult action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessageActionOccurredOnPreview$1(action, message, this, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageActionOccurredOnMessage(InAppMessage message, InAppMessageClickResult action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessageActionOccurredOnMessage$1(action, message, this, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessagePageChanged(InAppMessage message, InAppMessagePage page) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(page, "page");
        if (message.getIsPreview()) {
            return;
        }
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessagePageChanged$1(this, message, page, null));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWillDismiss(final InAppMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!this.lifecycleCallback.getHasSubscribers()) {
            Logging.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        } else {
            this.lifecycleCallback.fireOnMain(new Function1<IInAppMessageLifecycleListener, Unit>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWillDismiss$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IInAppMessageLifecycleListener iInAppMessageLifecycleListener) {
                    invoke2(iInAppMessageLifecycleListener);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IInAppMessageLifecycleListener it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onWillDismiss(new InAppMessageLifecycleEvent(InAppMessage.this));
                }
            });
        }
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler
    public void onMessageWasDismissed(InAppMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$onMessageWasDismissed$1(this, message, null));
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerCompleted(String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        Logging.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: " + triggerId, null, 2, null);
        new HashSet().add(triggerId);
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerConditionChanged(String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        Logging.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(CollectionsKt.listOf(triggerId), false);
        ThreadUtilsKt.suspendifyOnDefault(new InAppMessagesManager$onTriggerConditionChanged$1(this, null));
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerHandler
    public void onTriggerChanged(String newTriggerKey) {
        Intrinsics.checkNotNullParameter(newTriggerKey, "newTriggerKey");
        Logging.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + newTriggerKey + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(CollectionsKt.listOf(newTriggerKey), true);
        ThreadUtilsKt.suspendifyOnDefault(new InAppMessagesManager$onTriggerChanged$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(InAppMessage inAppMessage, List<? extends InAppMessagePrompt> list, Continuation<? super Unit> continuation) {
        if (!list.isEmpty()) {
            Logging.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + inAppMessage, null, 2, null);
            this._displayer.dismissCurrentInAppMessage();
            Object showMultiplePrompts = showMultiplePrompts(inAppMessage, list, continuation);
            return showMultiplePrompts == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? showMultiplePrompts : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireOutcomesForClick(String str, List<InAppMessageOutcome> list, Continuation<? super Unit> continuation) {
        InAppMessagesManager$fireOutcomesForClick$1 inAppMessagesManager$fireOutcomesForClick$1;
        int i;
        Iterator<InAppMessageOutcome> it;
        InAppMessagesManager inAppMessagesManager;
        if (continuation instanceof InAppMessagesManager$fireOutcomesForClick$1) {
            inAppMessagesManager$fireOutcomesForClick$1 = (InAppMessagesManager$fireOutcomesForClick$1) continuation;
            if ((inAppMessagesManager$fireOutcomesForClick$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$fireOutcomesForClick$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessagesManager$fireOutcomesForClick$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$fireOutcomesForClick$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this._influenceManager.onDirectInfluenceFromIAM(str);
                    it = list.iterator();
                    inAppMessagesManager = this;
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) inAppMessagesManager$fireOutcomesForClick$1.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fireOutcomesForClick$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    InAppMessageOutcome next = it.next();
                    String name = next.getName();
                    if (next.getIsUnique()) {
                        IOutcomeEventsController iOutcomeEventsController = inAppMessagesManager._outcomeEventsController;
                        inAppMessagesManager$fireOutcomesForClick$1.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fireOutcomesForClick$1.L$1 = it;
                        inAppMessagesManager$fireOutcomesForClick$1.label = 1;
                        if (iOutcomeEventsController.sendUniqueOutcomeEvent(name, inAppMessagesManager$fireOutcomesForClick$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (next.getWeight() > 0.0f) {
                        IOutcomeEventsController iOutcomeEventsController2 = inAppMessagesManager._outcomeEventsController;
                        float weight = next.getWeight();
                        inAppMessagesManager$fireOutcomesForClick$1.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fireOutcomesForClick$1.L$1 = it;
                        inAppMessagesManager$fireOutcomesForClick$1.label = 2;
                        if (iOutcomeEventsController2.sendOutcomeEventWithValue(name, weight, inAppMessagesManager$fireOutcomesForClick$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        IOutcomeEventsController iOutcomeEventsController3 = inAppMessagesManager._outcomeEventsController;
                        inAppMessagesManager$fireOutcomesForClick$1.L$0 = inAppMessagesManager;
                        inAppMessagesManager$fireOutcomesForClick$1.L$1 = it;
                        inAppMessagesManager$fireOutcomesForClick$1.label = 3;
                        if (iOutcomeEventsController3.sendOutcomeEvent(name, inAppMessagesManager$fireOutcomesForClick$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        inAppMessagesManager$fireOutcomesForClick$1 = new InAppMessagesManager$fireOutcomesForClick$1(this, continuation);
        Object obj2 = inAppMessagesManager$fireOutcomesForClick$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$fireOutcomesForClick$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(InAppMessageClickResult action) {
        if (action.getTags() != null) {
            InAppMessageTag tags = action.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                JSONUtils jSONUtils = JSONUtils.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                Intrinsics.checkNotNull(tagsToAdd);
                this._userManager.addTags(jSONUtils.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                JSONUtils jSONUtils2 = JSONUtils.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                Intrinsics.checkNotNull(tagsToRemove);
                this._userManager.removeTags(jSONUtils2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011e, code lost:
    
        if (messageWasDismissed$default(r12, r13, false, r15, 2, null) == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ba -> B:17:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMultiplePrompts(InAppMessage inAppMessage, List<? extends InAppMessagePrompt> list, Continuation<? super Unit> continuation) {
        InAppMessagesManager$showMultiplePrompts$1 inAppMessagesManager$showMultiplePrompts$1;
        InAppMessagesManager inAppMessagesManager;
        int i;
        Iterator<? extends InAppMessagePrompt> it;
        InAppMessagesManager$showMultiplePrompts$1 inAppMessagesManager$showMultiplePrompts$12;
        InAppMessagesManager inAppMessagesManager2;
        InAppMessage inAppMessage2;
        List<? extends InAppMessagePrompt> list2;
        InAppMessage inAppMessage3;
        InAppMessagesManager inAppMessagesManager3;
        if (continuation instanceof InAppMessagesManager$showMultiplePrompts$1) {
            inAppMessagesManager$showMultiplePrompts$1 = (InAppMessagesManager$showMultiplePrompts$1) continuation;
            if ((inAppMessagesManager$showMultiplePrompts$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$showMultiplePrompts$1.label -= Integer.MIN_VALUE;
                inAppMessagesManager = this;
                Object obj = inAppMessagesManager$showMultiplePrompts$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$showMultiplePrompts$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = list.iterator();
                    inAppMessagesManager$showMultiplePrompts$12 = inAppMessagesManager$showMultiplePrompts$1;
                    inAppMessagesManager2 = inAppMessagesManager;
                    inAppMessage2 = inAppMessage;
                    list2 = list;
                    while (it.hasNext()) {
                    }
                    inAppMessage3 = inAppMessage2;
                    InAppMessagesManager$showMultiplePrompts$1 inAppMessagesManager$showMultiplePrompts$13 = inAppMessagesManager$showMultiplePrompts$12;
                    inAppMessagesManager3 = inAppMessagesManager2;
                    if (inAppMessagesManager3._state.getCurrentPrompt() != null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    Iterator<? extends InAppMessagePrompt> it2 = (Iterator) inAppMessagesManager$showMultiplePrompts$1.L$3;
                    List<? extends InAppMessagePrompt> list3 = (List) inAppMessagesManager$showMultiplePrompts$1.L$2;
                    InAppMessage inAppMessage4 = (InAppMessage) inAppMessagesManager$showMultiplePrompts$1.L$1;
                    inAppMessagesManager2 = (InAppMessagesManager) inAppMessagesManager$showMultiplePrompts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    inAppMessagesManager$showMultiplePrompts$12 = inAppMessagesManager$showMultiplePrompts$1;
                    list2 = list3;
                    it = it2;
                    InAppMessagePrompt.PromptActionResult promptActionResult = (InAppMessagePrompt.PromptActionResult) obj;
                    inAppMessagesManager2._state.setCurrentPrompt(null);
                    Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + promptActionResult, null, 2, null);
                    if (!inAppMessage4.getIsPreview() && promptActionResult == InAppMessagePrompt.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                        inAppMessagesManager2.showAlertDialogMessage(inAppMessage4, list2);
                        inAppMessage3 = inAppMessage4;
                        InAppMessagesManager$showMultiplePrompts$1 inAppMessagesManager$showMultiplePrompts$132 = inAppMessagesManager$showMultiplePrompts$12;
                        inAppMessagesManager3 = inAppMessagesManager2;
                        if (inAppMessagesManager3._state.getCurrentPrompt() != null) {
                        }
                    } else {
                        inAppMessage2 = inAppMessage4;
                        while (it.hasNext()) {
                            InAppMessagePrompt next = it.next();
                            if (!next.getPrompted()) {
                                inAppMessagesManager2._state.setCurrentPrompt(next);
                                Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + inAppMessagesManager2._state.getCurrentPrompt(), null, 2, null);
                                InAppMessagePrompt currentPrompt = inAppMessagesManager2._state.getCurrentPrompt();
                                Intrinsics.checkNotNull(currentPrompt);
                                currentPrompt.setPrompted(true);
                                InAppMessagePrompt currentPrompt2 = inAppMessagesManager2._state.getCurrentPrompt();
                                Intrinsics.checkNotNull(currentPrompt2);
                                inAppMessagesManager$showMultiplePrompts$12.L$0 = inAppMessagesManager2;
                                inAppMessagesManager$showMultiplePrompts$12.L$1 = inAppMessage2;
                                inAppMessagesManager$showMultiplePrompts$12.L$2 = list2;
                                inAppMessagesManager$showMultiplePrompts$12.L$3 = it;
                                inAppMessagesManager$showMultiplePrompts$12.label = 1;
                                Object handlePrompt = currentPrompt2.handlePrompt(inAppMessagesManager$showMultiplePrompts$12);
                                if (handlePrompt != coroutine_suspended) {
                                    inAppMessage4 = inAppMessage2;
                                    obj = handlePrompt;
                                    InAppMessagePrompt.PromptActionResult promptActionResult2 = (InAppMessagePrompt.PromptActionResult) obj;
                                    inAppMessagesManager2._state.setCurrentPrompt(null);
                                    Logging.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + promptActionResult2, null, 2, null);
                                    if (!inAppMessage4.getIsPreview()) {
                                    }
                                    inAppMessage2 = inAppMessage4;
                                    while (it.hasNext()) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                        inAppMessage3 = inAppMessage2;
                        InAppMessagesManager$showMultiplePrompts$1 inAppMessagesManager$showMultiplePrompts$1322 = inAppMessagesManager$showMultiplePrompts$12;
                        inAppMessagesManager3 = inAppMessagesManager2;
                        if (inAppMessagesManager3._state.getCurrentPrompt() != null) {
                            return Unit.INSTANCE;
                        }
                        Logging.debug$default("InAppMessagesManager.showMultiplePrompts: No IAM prompt to handle, dismiss message: " + inAppMessage3.getMessageId(), null, 2, null);
                        inAppMessagesManager$showMultiplePrompts$1322.L$0 = null;
                        inAppMessagesManager$showMultiplePrompts$1322.L$1 = null;
                        inAppMessagesManager$showMultiplePrompts$1322.L$2 = null;
                        inAppMessagesManager$showMultiplePrompts$1322.L$3 = null;
                        inAppMessagesManager$showMultiplePrompts$1322.label = 2;
                    }
                }
            }
        }
        inAppMessagesManager = this;
        inAppMessagesManager$showMultiplePrompts$1 = new InAppMessagesManager$showMultiplePrompts$1(inAppMessagesManager, continuation);
        Object obj2 = inAppMessagesManager$showMultiplePrompts$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$showMultiplePrompts$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(InAppMessageClickResult action) {
        if (action.getUrl() == null || action.getUrl().length() <= 0) {
            return;
        }
        if (action.getUrlTarget() == InAppMessageActionUrlType.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), action.getUrl());
        } else if (action.getUrlTarget() == InAppMessageActionUrlType.IN_APP_WEBVIEW) {
            OneSignalChromeTab.INSTANCE.open$com_onesignal_inAppMessages(action.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(InAppMessageClickResult action) {
        if (action.getTags() != null) {
            Logging.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + action.getTags(), null, 2, null);
        }
        if (action.getOutcomes().size() > 0) {
            Logging.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + action.getOutcomes(), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult, Continuation<? super Unit> continuation) {
        if (!this.messageClickCallback.getHasSubscribers()) {
            return Unit.INSTANCE;
        }
        this._influenceManager.onDirectInfluenceFromIAM(inAppMessage.getMessageId());
        Object suspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new InAppMessagesManager$firePublicClickHandler$2(new InAppMessageClickEvent(inAppMessage, inAppMessageClickResult), null), continuation);
        return suspendingFireOnMain == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? suspendingFireOnMain : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForPageChange(InAppMessage inAppMessage, InAppMessagePage inAppMessagePage, Continuation<? super Unit> continuation) {
        InAppMessagesManager$fireRESTCallForPageChange$1 inAppMessagesManager$fireRESTCallForPageChange$1;
        int i;
        String str;
        InAppMessagesManager inAppMessagesManager;
        if (continuation instanceof InAppMessagesManager$fireRESTCallForPageChange$1) {
            inAppMessagesManager$fireRESTCallForPageChange$1 = (InAppMessagesManager$fireRESTCallForPageChange$1) continuation;
            if ((inAppMessagesManager$fireRESTCallForPageChange$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$fireRESTCallForPageChange$1.label -= Integer.MIN_VALUE;
                InAppMessagesManager$fireRESTCallForPageChange$1 inAppMessagesManager$fireRESTCallForPageChange$12 = inAppMessagesManager$fireRESTCallForPageChange$1;
                Object obj = inAppMessagesManager$fireRESTCallForPageChange$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$fireRESTCallForPageChange$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String variantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
                    if (variantIdForMessage == null) {
                        return Unit.INSTANCE;
                    }
                    String pageId = inAppMessagePage.getPageId();
                    String str2 = inAppMessage.getMessageId() + pageId;
                    if (this.viewedPageIds.contains(str2)) {
                        Logging.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                        return Unit.INSTANCE;
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
                        if (iInAppBackendService.sendIAMPageImpression(appId, id, variantIdForMessage, messageId, pageId, inAppMessagesManager$fireRESTCallForPageChange$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = str2;
                        inAppMessagesManager = this;
                    } catch (BackendException unused) {
                        str = str2;
                        inAppMessagesManager = this;
                        inAppMessagesManager.viewedPageIds.remove(str);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) inAppMessagesManager$fireRESTCallForPageChange$12.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fireRESTCallForPageChange$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (BackendException unused2) {
                        inAppMessagesManager.viewedPageIds.remove(str);
                        return Unit.INSTANCE;
                    }
                }
                inAppMessagesManager._prefs.setViewPageImpressionedIds(inAppMessagesManager.viewedPageIds);
                return Unit.INSTANCE;
            }
        }
        inAppMessagesManager$fireRESTCallForPageChange$1 = new InAppMessagesManager$fireRESTCallForPageChange$1(this, continuation);
        InAppMessagesManager$fireRESTCallForPageChange$1 inAppMessagesManager$fireRESTCallForPageChange$122 = inAppMessagesManager$fireRESTCallForPageChange$1;
        Object obj2 = inAppMessagesManager$fireRESTCallForPageChange$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$fireRESTCallForPageChange$122.label;
        if (i != 0) {
        }
        inAppMessagesManager._prefs.setViewPageImpressionedIds(inAppMessagesManager.viewedPageIds);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:26|27))(2:28|(2:30|31)(2:32|(2:48|49)(4:(1:38)|39|40|(1:42)(1:43))))|13|14|15|16))|50|6|(0)(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        r11.removeClickId(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForClick(InAppMessage inAppMessage, InAppMessageClickResult inAppMessageClickResult, Continuation<? super Unit> continuation) {
        InAppMessagesManager$fireRESTCallForClick$1 inAppMessagesManager$fireRESTCallForClick$1;
        int i;
        String clickId;
        InAppMessagesManager inAppMessagesManager;
        InAppMessage inAppMessage2;
        String str;
        if (continuation instanceof InAppMessagesManager$fireRESTCallForClick$1) {
            inAppMessagesManager$fireRESTCallForClick$1 = (InAppMessagesManager$fireRESTCallForClick$1) continuation;
            if ((inAppMessagesManager$fireRESTCallForClick$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagesManager$fireRESTCallForClick$1.label -= Integer.MIN_VALUE;
                InAppMessagesManager$fireRESTCallForClick$1 inAppMessagesManager$fireRESTCallForClick$12 = inAppMessagesManager$fireRESTCallForClick$1;
                Object obj = inAppMessagesManager$fireRESTCallForClick$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagesManager$fireRESTCallForClick$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String variantIdForMessage = InAppHelper.INSTANCE.variantIdForMessage(inAppMessage, this._languageContext);
                    if (variantIdForMessage == null) {
                        return Unit.INSTANCE;
                    }
                    clickId = inAppMessageClickResult.getClickId();
                    if ((!inAppMessage.getRedisplayStats().getIsRedisplayEnabled() || clickId == null || !inAppMessage.isClickAvailable(clickId)) && CollectionsKt.contains(this.clickedClickIds, clickId)) {
                        return Unit.INSTANCE;
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
                        boolean isFirstClick = inAppMessageClickResult.getIsFirstClick();
                        inAppMessagesManager$fireRESTCallForClick$12.L$0 = this;
                        inAppMessagesManager$fireRESTCallForClick$12.L$1 = inAppMessage;
                        inAppMessagesManager$fireRESTCallForClick$12.L$2 = clickId;
                        inAppMessagesManager$fireRESTCallForClick$12.label = 1;
                        if (iInAppBackendService.sendIAMClick(appId, id, variantIdForMessage, messageId, clickId, isFirstClick, inAppMessagesManager$fireRESTCallForClick$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        inAppMessagesManager = this;
                    } catch (BackendException unused) {
                        inAppMessagesManager = this;
                        inAppMessage2 = inAppMessage;
                        str = clickId;
                        TypeIntrinsics.asMutableCollection(inAppMessagesManager.clickedClickIds).remove(str);
                        if (str != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) inAppMessagesManager$fireRESTCallForClick$12.L$2;
                    inAppMessage2 = (InAppMessage) inAppMessagesManager$fireRESTCallForClick$12.L$1;
                    inAppMessagesManager = (InAppMessagesManager) inAppMessagesManager$fireRESTCallForClick$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        clickId = str;
                        inAppMessage = inAppMessage2;
                    } catch (BackendException unused2) {
                        TypeIntrinsics.asMutableCollection(inAppMessagesManager.clickedClickIds).remove(str);
                        if (str != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                inAppMessagesManager._prefs.setClickedMessagesId(inAppMessagesManager.clickedClickIds);
                return Unit.INSTANCE;
            }
        }
        inAppMessagesManager$fireRESTCallForClick$1 = new InAppMessagesManager$fireRESTCallForClick$1(this, continuation);
        InAppMessagesManager$fireRESTCallForClick$1 inAppMessagesManager$fireRESTCallForClick$122 = inAppMessagesManager$fireRESTCallForClick$1;
        Object obj2 = inAppMessagesManager$fireRESTCallForClick$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagesManager$fireRESTCallForClick$122.label;
        if (i != 0) {
        }
        inAppMessagesManager._prefs.setClickedMessagesId(inAppMessagesManager.clickedClickIds);
        return Unit.INSTANCE;
    }

    private final void showAlertDialogMessage(final InAppMessage inAppMessage, final List<? extends InAppMessagePrompt> prompts) {
        String string = this._applicationService.getAppContext().getString(R.string.location_permission_missing_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this._applicationService.getAppContext().getString(R.string.location_permission_missing_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        new AlertDialog.Builder(this._applicationService.get_current()).setTitle(string).setMessage(string2).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                InAppMessagesManager.showAlertDialogMessage$lambda$11(InAppMessagesManager.this, inAppMessage, prompts, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialogMessage$lambda$11(InAppMessagesManager this$0, InAppMessage inAppMessage, List prompts, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(inAppMessage, "$inAppMessage");
        Intrinsics.checkNotNullParameter(prompts, "$prompts");
        ThreadUtilsKt.suspendifyOnIO(new InAppMessagesManager$showAlertDialogMessage$1$1(this$0, inAppMessage, prompts, null));
    }
}
