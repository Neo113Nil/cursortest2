package com.onesignal.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.IOneSignal;
import com.onesignal.IUserJwtInvalidatedListener;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.IServiceProvider;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.common.services.ServiceProvider;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.CoreModule;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.application.impl.ApplicationService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceStoreFix;
import com.onesignal.core.internal.startup.StartupService;
import com.onesignal.debug.IDebugManager;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.DebugManager;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.session.SessionModule;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import com.onesignal.user.IUserManager;
import com.onesignal.user.UserModule;
import com.onesignal.user.internal.AppIdResolution;
import com.onesignal.user.internal.AppIdResolutionKt;
import com.onesignal.user.internal.LoginHelper;
import com.onesignal.user.internal.LogoutHelper;
import com.onesignal.user.internal.UserSwitcher;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: OneSignalImp.kt */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0081\u0001\u001a\u00020w2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016J*\u0010\u0084\u0001\u001a\u00020w2\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020w0v2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010BH\u0082@¢\u0006\u0003\u0010\u0087\u0001J(\u0010\u0088\u0001\u001a\u0003H\u0089\u0001\"\u0005\b\u0000\u0010\u0089\u00012\u000f\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0089\u00010\u008b\u0001H\u0002¢\u0006\u0003\u0010\u008c\u0001J\n\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0002J\u0012\u0010\u008f\u0001\u001a\u00020w2\u0007\u0010\u0090\u0001\u001a\u000205H\u0002J\u0013\u0010\u0091\u0001\u001a\u00020w2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J(\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u0003H\u0089\u00010A\"\u0005\b\u0000\u0010\u0089\u00012\u000f\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0089\u00010\u0096\u0001H\u0016J\u000f\u0010\u0014\u001a\u00020\u0005H\u0096@¢\u0006\u0003\u0010\u0097\u0001J\u000f\u0010\u0019\u001a\u00020\u0005H\u0096@¢\u0006\u0003\u0010\u0097\u0001J\u000f\u0010 \u001a\u00020\u0005H\u0096@¢\u0006\u0003\u0010\u0097\u0001J\u000f\u0010.\u001a\u00020-H\u0096@¢\u0006\u0003\u0010\u0097\u0001J\u000f\u0010E\u001a\u00020DH\u0096@¢\u0006\u0003\u0010\u0097\u0001J\u000f\u0010T\u001a\u00020SH\u0096@¢\u0006\u0003\u0010\u0097\u0001J(\u0010\u0098\u0001\u001a\u0003H\u0089\u0001\"\u0005\b\u0000\u0010\u0089\u00012\u000f\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0089\u00010\u0096\u0001H\u0016¢\u0006\u0003\u0010\u0099\u0001J*\u0010\u009a\u0001\u001a\u0005\u0018\u0001H\u0089\u0001\"\u0005\b\u0000\u0010\u0089\u00012\u000f\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0089\u00010\u0096\u0001H\u0016¢\u0006\u0003\u0010\u0099\u0001J\u000f\u0010n\u001a\u00020mH\u0096@¢\u0006\u0003\u0010\u0097\u0001J\u000f\u0010z\u001a\u00020yH\u0096@¢\u0006\u0003\u0010\u0097\u0001J!\u0010\u009b\u0001\u001a\u00020\u0005\"\u0005\b\u0000\u0010\u0089\u00012\u000f\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0089\u00010\u0096\u0001H\u0016J\u0013\u0010\u009c\u0001\u001a\u00020w2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\u001a\u0010\u009d\u0001\u001a\u00020\u00052\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0096@¢\u0006\u0003\u0010\u009e\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\u00052\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u009f\u0001\u001a\u00020BH\u0016J%\u0010 \u0001\u001a\u00020\u00052\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010BH\u0096@¢\u0006\u0003\u0010¡\u0001J\u001e\u0010¢\u0001\u001a\u00020\u00052\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010BH\u0002J\u001d\u0010£\u0001\u001a\u00020w2\u0007\u0010¤\u0001\u001a\u00020B2\t\u0010¥\u0001\u001a\u0004\u0018\u00010BH\u0016J$\u0010¦\u0001\u001a\u00020w2\u0007\u0010¤\u0001\u001a\u00020B2\t\u0010¥\u0001\u001a\u0004\u0018\u00010BH\u0096@¢\u0006\u0003\u0010§\u0001J\t\u0010¨\u0001\u001a\u00020wH\u0016J\u0010\u0010©\u0001\u001a\u00020wH\u0096@¢\u0006\u0003\u0010\u0097\u0001J\u0014\u0010ª\u0001\u001a\u00020B2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010BH\u0002J\u0013\u0010«\u0001\u001a\u00020w2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016J\u0017\u0010\u0016\u001a\u00020w2\u0006\u0010\u0012\u001a\u00020\u0005H\u0096@¢\u0006\u0003\u0010¬\u0001J\u0018\u0010\u001a\u001a\u00020w2\u0007\u0010\u00ad\u0001\u001a\u00020\u0005H\u0096@¢\u0006\u0003\u0010¬\u0001J\u0017\u0010!\u001a\u00020w2\u0006\u0010\u0012\u001a\u00020\u0005H\u0096@¢\u0006\u0003\u0010¬\u0001J)\u0010®\u0001\u001a\u0003H\u0089\u0001\"\u0005\b\u0000\u0010\u0089\u00012\u000f\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0089\u00010\u008b\u0001H\u0082@¢\u0006\u0003\u0010¯\u0001J\u001d\u0010°\u0001\u001a\u00020w2\u000b\b\u0002\u0010\u0086\u0001\u001a\u0004\u0018\u00010BH\u0082@¢\u0006\u0003\u0010±\u0001J\t\u0010²\u0001\u001a\u00020wH\u0002J\u001b\u0010³\u0001\u001a\u00020w2\u0007\u0010¤\u0001\u001a\u00020B2\u0007\u0010´\u0001\u001a\u00020BH\u0016J\"\u0010µ\u0001\u001a\u00020w2\u0007\u0010¤\u0001\u001a\u00020B2\u0007\u0010´\u0001\u001a\u00020BH\u0096@¢\u0006\u0003\u0010§\u0001J(\u0010¶\u0001\u001a\u0003H\u0089\u0001\"\u0005\b\u0000\u0010\u0089\u00012\u000f\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0089\u00010\u008b\u0001H\u0002¢\u0006\u0003\u0010\u008c\u0001J\u0016\u0010·\u0001\u001a\u00020w2\u000b\b\u0002\u0010\u0086\u0001\u001a\u0004\u0018\u00010BH\u0002J\u001d\u0010¸\u0001\u001a\u00020w2\u000b\b\u0002\u0010\u0086\u0001\u001a\u0004\u0018\u00010BH\u0082@¢\u0006\u0003\u0010±\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\n\u0018\u000101j\u0004\u0018\u0001`2X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0015R\u001b\u0010;\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0011\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001b\u0010G\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u0011\u001a\u0004\bI\u0010JR\u000e\u0010L\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010M\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010\u0011\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001b\u0010V\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010\u0011\u001a\u0004\bX\u0010YR\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010]\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010\u0011\u001a\u0004\b_\u0010`R\u001b\u0010b\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010\u0011\u001a\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020BX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u000e\u0010j\u001a\u00020kX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010l\u001a\u00020m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001b\u0010p\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010\u0011\u001a\u0004\br\u0010sR\u0014\u0010u\u001a\b\u0012\u0004\u0012\u00020w0vX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010x\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u001c\u0010|\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0080\u0001\u0010\u0011\u001a\u0004\b~\u0010\u007f¨\u0006¹\u0001"}, d2 = {"Lcom/onesignal/internal/OneSignalImp;", "Lcom/onesignal/IOneSignal;", "Lcom/onesignal/common/services/IServiceProvider;", "()V", "_consentGiven", "", "Ljava/lang/Boolean;", "_consentRequired", "_disableGMSMissingPrompt", "applicationServiceLock", "", "applicationServiceStarted", "configModel", "Lcom/onesignal/core/internal/config/ConfigModel;", "getConfigModel", "()Lcom/onesignal/core/internal/config/ConfigModel;", "configModel$delegate", "Lkotlin/Lazy;", "value", "consentGiven", "getConsentGiven", "()Z", "setConsentGiven", "(Z)V", "consentRequired", "getConsentRequired", "setConsentRequired", "debug", "Lcom/onesignal/debug/IDebugManager;", "getDebug", "()Lcom/onesignal/debug/IDebugManager;", "disableGMSMissingPrompt", "getDisableGMSMissingPrompt", "setDisableGMSMissingPrompt", "identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "getIdentityModelStore", "()Lcom/onesignal/user/internal/identity/IdentityModelStore;", "identityModelStore$delegate", "identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "getIdentityVerificationService", "()Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "identityVerificationService$delegate", "inAppMessages", "Lcom/onesignal/inAppMessages/IInAppMessagesManager;", "getInAppMessages", "()Lcom/onesignal/inAppMessages/IInAppMessagesManager;", "initFailureException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initLock", "initState", "Lcom/onesignal/internal/InitState;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "isInitialized", "jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "getJwtTokenStore", "()Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "jwtTokenStore$delegate", "listOfModules", "", "", InAppMessagePromptTypes.LOCATION_PROMPT_KEY, "Lcom/onesignal/location/ILocationManager;", "getLocation", "()Lcom/onesignal/location/ILocationManager;", "loginHelper", "Lcom/onesignal/user/internal/LoginHelper;", "getLoginHelper", "()Lcom/onesignal/user/internal/LoginHelper;", "loginHelper$delegate", "loginLogoutLock", "logoutHelper", "Lcom/onesignal/user/internal/LogoutHelper;", "getLogoutHelper", "()Lcom/onesignal/user/internal/LogoutHelper;", "logoutHelper$delegate", "notifications", "Lcom/onesignal/notifications/INotificationsManager;", "getNotifications", "()Lcom/onesignal/notifications/INotificationsManager;", "operationRepo", "Lcom/onesignal/core/internal/operations/IOperationRepo;", "getOperationRepo", "()Lcom/onesignal/core/internal/operations/IOperationRepo;", "operationRepo$delegate", "otelManager", "Lcom/onesignal/internal/OtelLifecycleManager;", "preferencesService", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "getPreferencesService", "()Lcom/onesignal/core/internal/preferences/IPreferencesService;", "preferencesService$delegate", "propertiesModelStore", "Lcom/onesignal/user/internal/properties/PropertiesModelStore;", "getPropertiesModelStore", "()Lcom/onesignal/user/internal/properties/PropertiesModelStore;", "propertiesModelStore$delegate", "sdkVersion", "getSdkVersion", "()Ljava/lang/String;", "services", "Lcom/onesignal/common/services/ServiceProvider;", OutcomeEventsTable.COLUMN_NAME_SESSION, "Lcom/onesignal/session/ISessionManager;", "getSession", "()Lcom/onesignal/session/ISessionManager;", "subscriptionModelStore", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "getSubscriptionModelStore", "()Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "subscriptionModelStore$delegate", "suspendCompletion", "Lkotlinx/coroutines/CompletableDeferred;", "", "user", "Lcom/onesignal/user/IUserManager;", "getUser", "()Lcom/onesignal/user/IUserManager;", "userSwitcher", "Lcom/onesignal/user/internal/UserSwitcher;", "getUserSwitcher", "()Lcom/onesignal/user/internal/UserSwitcher;", "userSwitcher$delegate", "addUserJwtInvalidatedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/onesignal/IUserJwtInvalidatedListener;", "awaitInitCompletion", "completionToAwait", "operationName", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blockingGet", "T", "getter", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "bootstrapServices", "Lcom/onesignal/core/internal/startup/StartupService;", "completeInit", "terminalState", "ensureApplicationServiceStarted", "context", "Landroid/content/Context;", "getAllServices", "c", "Ljava/lang/Class;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", "getServiceOrNull", "hasService", "initEssentials", "initWithContext", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appId", "initWithContextSuspend", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internalInit", "login", "externalId", "jwtBearerToken", "loginSuspend", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "logoutSuspend", "notInitializedMessage", "removeUserJwtInvalidatedListener", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "required", "suspendAndReturn", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendUntilInit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateConfig", "updateUserJwt", "token", "updateUserJwtSuspend", "waitAndReturn", "waitForInit", "waitUntilInitInternal", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OneSignalImp implements IOneSignal, IServiceProvider {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private final Object applicationServiceLock;
    private volatile boolean applicationServiceStarted;

    /* renamed from: configModel$delegate, reason: from kotlin metadata */
    private final Lazy configModel;
    private Exception initFailureException;
    private final Object initLock;
    private final List<String> listOfModules;

    /* renamed from: loginHelper$delegate, reason: from kotlin metadata */
    private final Lazy loginHelper;
    private final Object loginLogoutLock;

    /* renamed from: logoutHelper$delegate, reason: from kotlin metadata */
    private final Lazy logoutHelper;
    private OtelLifecycleManager otelManager;
    private final ServiceProvider services;

    /* renamed from: userSwitcher$delegate, reason: from kotlin metadata */
    private final Lazy userSwitcher;
    private volatile CompletableDeferred<Unit> suspendCompletion = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    private volatile InitState initState = InitState.NOT_STARTED;
    private final String sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
    private final IDebugManager debug = new DebugManager();

    /* renamed from: operationRepo$delegate, reason: from kotlin metadata */
    private final Lazy operationRepo = LazyKt.lazy(new Function0<IOperationRepo>() { // from class: com.onesignal.internal.OneSignalImp$operationRepo$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final IOperationRepo invoke() {
            ServiceProvider serviceProvider;
            serviceProvider = OneSignalImp.this.services;
            return (IOperationRepo) serviceProvider.getService(IOperationRepo.class);
        }
    });

    /* renamed from: identityModelStore$delegate, reason: from kotlin metadata */
    private final Lazy identityModelStore = LazyKt.lazy(new Function0<IdentityModelStore>() { // from class: com.onesignal.internal.OneSignalImp$identityModelStore$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final IdentityModelStore invoke() {
            ServiceProvider serviceProvider;
            serviceProvider = OneSignalImp.this.services;
            return (IdentityModelStore) serviceProvider.getService(IdentityModelStore.class);
        }
    });

    /* renamed from: propertiesModelStore$delegate, reason: from kotlin metadata */
    private final Lazy propertiesModelStore = LazyKt.lazy(new Function0<PropertiesModelStore>() { // from class: com.onesignal.internal.OneSignalImp$propertiesModelStore$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PropertiesModelStore invoke() {
            ServiceProvider serviceProvider;
            serviceProvider = OneSignalImp.this.services;
            return (PropertiesModelStore) serviceProvider.getService(PropertiesModelStore.class);
        }
    });

    /* renamed from: subscriptionModelStore$delegate, reason: from kotlin metadata */
    private final Lazy subscriptionModelStore = LazyKt.lazy(new Function0<SubscriptionModelStore>() { // from class: com.onesignal.internal.OneSignalImp$subscriptionModelStore$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SubscriptionModelStore invoke() {
            ServiceProvider serviceProvider;
            serviceProvider = OneSignalImp.this.services;
            return (SubscriptionModelStore) serviceProvider.getService(SubscriptionModelStore.class);
        }
    });

    /* renamed from: preferencesService$delegate, reason: from kotlin metadata */
    private final Lazy preferencesService = LazyKt.lazy(new Function0<IPreferencesService>() { // from class: com.onesignal.internal.OneSignalImp$preferencesService$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final IPreferencesService invoke() {
            ServiceProvider serviceProvider;
            serviceProvider = OneSignalImp.this.services;
            return (IPreferencesService) serviceProvider.getService(IPreferencesService.class);
        }
    });

    /* renamed from: jwtTokenStore$delegate, reason: from kotlin metadata */
    private final Lazy jwtTokenStore = LazyKt.lazy(new Function0<JwtTokenStore>() { // from class: com.onesignal.internal.OneSignalImp$jwtTokenStore$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final JwtTokenStore invoke() {
            ServiceProvider serviceProvider;
            serviceProvider = OneSignalImp.this.services;
            return (JwtTokenStore) serviceProvider.getService(JwtTokenStore.class);
        }
    });

    /* renamed from: identityVerificationService$delegate, reason: from kotlin metadata */
    private final Lazy identityVerificationService = LazyKt.lazy(new Function0<IdentityVerificationService>() { // from class: com.onesignal.internal.OneSignalImp$identityVerificationService$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final IdentityVerificationService invoke() {
            ServiceProvider serviceProvider;
            serviceProvider = OneSignalImp.this.services;
            return (IdentityVerificationService) serviceProvider.getService(IdentityVerificationService.class);
        }
    });

    /* compiled from: OneSignalImp.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitState.values().length];
            try {
                iArr[InitState.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitState.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OneSignalImp() {
        List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{"com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule"});
        this.listOfModules = listOf;
        ServiceBuilder serviceBuilder = new ServiceBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = listOf.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((IModule) newInstance);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((IModule) it2.next()).register(serviceBuilder);
        }
        this.services = serviceBuilder.build();
        this.configModel = LazyKt.lazy(new Function0<ConfigModel>() { // from class: com.onesignal.internal.OneSignalImp$configModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ConfigModel invoke() {
                ServiceProvider serviceProvider;
                serviceProvider = OneSignalImp.this.services;
                return ((ConfigModelStore) serviceProvider.getService(ConfigModelStore.class)).getModel();
            }
        });
        this.initLock = new Object();
        this.loginLogoutLock = new Object();
        this.applicationServiceLock = new Object();
        this.userSwitcher = LazyKt.lazy(new Function0<UserSwitcher>() { // from class: com.onesignal.internal.OneSignalImp$userSwitcher$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final UserSwitcher invoke() {
                ServiceProvider serviceProvider;
                IdentityModelStore identityModelStore;
                PropertiesModelStore propertiesModelStore;
                SubscriptionModelStore subscriptionModelStore;
                ConfigModel configModel;
                IPreferencesService preferencesService;
                IOperationRepo operationRepo;
                ServiceProvider serviceProvider2;
                serviceProvider = OneSignalImp.this.services;
                final Context appContext = ((IApplicationService) serviceProvider.getService(IApplicationService.class)).getAppContext();
                identityModelStore = OneSignalImp.this.getIdentityModelStore();
                propertiesModelStore = OneSignalImp.this.getPropertiesModelStore();
                subscriptionModelStore = OneSignalImp.this.getSubscriptionModelStore();
                configModel = OneSignalImp.this.getConfigModel();
                String carrierName = DeviceUtils.INSTANCE.getCarrierName(appContext);
                String str = Build.VERSION.RELEASE;
                preferencesService = OneSignalImp.this.getPreferencesService();
                operationRepo = OneSignalImp.this.getOperationRepo();
                serviceProvider2 = OneSignalImp.this.services;
                return new UserSwitcher(preferencesService, operationRepo, serviceProvider2, null, identityModelStore, propertiesModelStore, subscriptionModelStore, configModel, null, carrierName, str, null, new Function0<Context>() { // from class: com.onesignal.internal.OneSignalImp$userSwitcher$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Context invoke() {
                        return appContext;
                    }
                }, 2312, null);
            }
        });
        this.loginHelper = LazyKt.lazy(new Function0<LoginHelper>() { // from class: com.onesignal.internal.OneSignalImp$loginHelper$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LoginHelper invoke() {
                IdentityModelStore identityModelStore;
                UserSwitcher userSwitcher;
                IOperationRepo operationRepo;
                ConfigModel configModel;
                JwtTokenStore jwtTokenStore;
                Object obj;
                identityModelStore = OneSignalImp.this.getIdentityModelStore();
                userSwitcher = OneSignalImp.this.getUserSwitcher();
                operationRepo = OneSignalImp.this.getOperationRepo();
                configModel = OneSignalImp.this.getConfigModel();
                jwtTokenStore = OneSignalImp.this.getJwtTokenStore();
                obj = OneSignalImp.this.loginLogoutLock;
                return new LoginHelper(identityModelStore, userSwitcher, operationRepo, configModel, jwtTokenStore, obj);
            }
        });
        this.logoutHelper = LazyKt.lazy(new Function0<LogoutHelper>() { // from class: com.onesignal.internal.OneSignalImp$logoutHelper$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LogoutHelper invoke() {
                IdentityModelStore identityModelStore;
                UserSwitcher userSwitcher;
                IOperationRepo operationRepo;
                ConfigModel configModel;
                SubscriptionModelStore subscriptionModelStore;
                IdentityVerificationService identityVerificationService;
                Object obj;
                identityModelStore = OneSignalImp.this.getIdentityModelStore();
                userSwitcher = OneSignalImp.this.getUserSwitcher();
                operationRepo = OneSignalImp.this.getOperationRepo();
                configModel = OneSignalImp.this.getConfigModel();
                subscriptionModelStore = OneSignalImp.this.getSubscriptionModelStore();
                identityVerificationService = OneSignalImp.this.getIdentityVerificationService();
                obj = OneSignalImp.this.loginLogoutLock;
                return new LogoutHelper(identityModelStore, userSwitcher, operationRepo, configModel, subscriptionModelStore, identityVerificationService, obj);
            }
        });
    }

    @Override // com.onesignal.IOneSignal
    public void login(String str) {
        IOneSignal.DefaultImpls.login(this, str);
    }

    @Override // com.onesignal.IOneSignal
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.onesignal.IOneSignal
    public boolean isInitialized() {
        return this.initState == InitState.SUCCESS;
    }

    @Override // com.onesignal.IOneSignal
    public boolean getConsentRequired() {
        if (isInitialized()) {
            return ((Boolean) blockingGet(new Function0<Boolean>() { // from class: com.onesignal.internal.OneSignalImp$consentRequired$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    ConfigModel configModel;
                    Boolean bool;
                    boolean areEqual;
                    configModel = OneSignalImp.this.getConfigModel();
                    Boolean consentRequired = configModel.getConsentRequired();
                    if (consentRequired != null) {
                        areEqual = consentRequired.booleanValue();
                    } else {
                        bool = OneSignalImp.this._consentRequired;
                        areEqual = Intrinsics.areEqual((Object) bool, (Object) true);
                    }
                    return Boolean.valueOf(areEqual);
                }
            })).booleanValue();
        }
        return Intrinsics.areEqual((Object) this._consentRequired, (Object) true);
    }

    @Override // com.onesignal.IOneSignal
    public void setConsentRequired(boolean z) {
        this._consentRequired = Boolean.valueOf(z);
        if (isInitialized()) {
            getConfigModel().setConsentRequired(Boolean.valueOf(z));
        }
    }

    @Override // com.onesignal.IOneSignal
    public boolean getConsentGiven() {
        if (isInitialized()) {
            return ((Boolean) blockingGet(new Function0<Boolean>() { // from class: com.onesignal.internal.OneSignalImp$consentGiven$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    ConfigModel configModel;
                    Boolean bool;
                    boolean areEqual;
                    configModel = OneSignalImp.this.getConfigModel();
                    Boolean consentGiven = configModel.getConsentGiven();
                    if (consentGiven != null) {
                        areEqual = consentGiven.booleanValue();
                    } else {
                        bool = OneSignalImp.this._consentGiven;
                        areEqual = Intrinsics.areEqual((Object) bool, (Object) true);
                    }
                    return Boolean.valueOf(areEqual);
                }
            })).booleanValue();
        }
        return Intrinsics.areEqual((Object) this._consentGiven, (Object) true);
    }

    @Override // com.onesignal.IOneSignal
    public void setConsentGiven(boolean z) {
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z);
        if (isInitialized()) {
            getConfigModel().setConsentGiven(Boolean.valueOf(z));
            if (Intrinsics.areEqual(bool, Boolean.valueOf(z)) || !z) {
                return;
            }
            getOperationRepo().forceExecuteOperations();
        }
    }

    @Override // com.onesignal.IOneSignal
    public boolean getDisableGMSMissingPrompt() {
        if (isInitialized()) {
            return ((Boolean) blockingGet(new Function0<Boolean>() { // from class: com.onesignal.internal.OneSignalImp$disableGMSMissingPrompt$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    ConfigModel configModel;
                    configModel = OneSignalImp.this.getConfigModel();
                    return Boolean.valueOf(configModel.getDisableGMSMissingPrompt());
                }
            })).booleanValue();
        }
        return Intrinsics.areEqual((Object) this._disableGMSMissingPrompt, (Object) true);
    }

    @Override // com.onesignal.IOneSignal
    public void setDisableGMSMissingPrompt(boolean z) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z);
        if (isInitialized()) {
            getConfigModel().setDisableGMSMissingPrompt(z);
        }
    }

    @Override // com.onesignal.IOneSignal
    public IDebugManager getDebug() {
        return this.debug;
    }

    @Override // com.onesignal.IOneSignal
    public ISessionManager getSession() {
        return (ISessionManager) waitAndReturn(new Function0<ISessionManager>() { // from class: com.onesignal.internal.OneSignalImp$session$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ISessionManager invoke() {
                ServiceProvider serviceProvider;
                serviceProvider = OneSignalImp.this.services;
                return (ISessionManager) serviceProvider.getService(ISessionManager.class);
            }
        });
    }

    @Override // com.onesignal.IOneSignal
    public INotificationsManager getNotifications() {
        return (INotificationsManager) waitAndReturn(new Function0<INotificationsManager>() { // from class: com.onesignal.internal.OneSignalImp$notifications$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final INotificationsManager invoke() {
                ServiceProvider serviceProvider;
                serviceProvider = OneSignalImp.this.services;
                return (INotificationsManager) serviceProvider.getService(INotificationsManager.class);
            }
        });
    }

    @Override // com.onesignal.IOneSignal
    public ILocationManager getLocation() {
        return (ILocationManager) waitAndReturn(new Function0<ILocationManager>() { // from class: com.onesignal.internal.OneSignalImp$location$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ILocationManager invoke() {
                ServiceProvider serviceProvider;
                serviceProvider = OneSignalImp.this.services;
                return (ILocationManager) serviceProvider.getService(ILocationManager.class);
            }
        });
    }

    @Override // com.onesignal.IOneSignal
    public IInAppMessagesManager getInAppMessages() {
        return (IInAppMessagesManager) waitAndReturn(new Function0<IInAppMessagesManager>() { // from class: com.onesignal.internal.OneSignalImp$inAppMessages$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final IInAppMessagesManager invoke() {
                ServiceProvider serviceProvider;
                serviceProvider = OneSignalImp.this.services;
                return (IInAppMessagesManager) serviceProvider.getService(IInAppMessagesManager.class);
            }
        });
    }

    @Override // com.onesignal.IOneSignal
    public IUserManager getUser() {
        return (IUserManager) waitAndReturn(new Function0<IUserManager>() { // from class: com.onesignal.internal.OneSignalImp$user$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final IUserManager invoke() {
                ServiceProvider serviceProvider;
                serviceProvider = OneSignalImp.this.services;
                return (IUserManager) serviceProvider.getService(IUserManager.class);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IOperationRepo getOperationRepo() {
        return (IOperationRepo) this.operationRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityModelStore getIdentityModelStore() {
        return (IdentityModelStore) this.identityModelStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PropertiesModelStore getPropertiesModelStore() {
        return (PropertiesModelStore) this.propertiesModelStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubscriptionModelStore getSubscriptionModelStore() {
        return (SubscriptionModelStore) this.subscriptionModelStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPreferencesService getPreferencesService() {
        return (IPreferencesService) this.preferencesService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JwtTokenStore getJwtTokenStore() {
        return (JwtTokenStore) this.jwtTokenStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityVerificationService getIdentityVerificationService() {
        return (IdentityVerificationService) this.identityVerificationService.getValue();
    }

    private final CoroutineDispatcher getIoDispatcher() {
        return OneSignalDispatchers.INSTANCE.getIO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfigModel getConfigModel() {
        return (ConfigModel) this.configModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserSwitcher getUserSwitcher() {
        return (UserSwitcher) this.userSwitcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginHelper getLoginHelper() {
        return (LoginHelper) this.loginHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogoutHelper getLogoutHelper() {
        return (LogoutHelper) this.logoutHelper.getValue();
    }

    private final void initEssentials(Context context) {
        OtelLifecycleManager otelLifecycleManager = new OtelLifecycleManager(context, new Function0<IFeatureManager>() { // from class: com.onesignal.internal.OneSignalImp$initEssentials$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final IFeatureManager invoke() {
                ServiceProvider serviceProvider;
                serviceProvider = OneSignalImp.this.services;
                return (IFeatureManager) serviceProvider.getService(IFeatureManager.class);
            }
        }, null, null, null, null, null, 124, null);
        otelLifecycleManager.initializeFromCachedConfig();
        this.otelManager = otelLifecycleManager;
        PreferenceStoreFix.INSTANCE.ensureNoObfuscatedPrefStore(context);
        ensureApplicationServiceStarted(context);
    }

    private final void ensureApplicationServiceStarted(Context context) {
        if (this.applicationServiceStarted) {
            return;
        }
        synchronized (this.applicationServiceLock) {
            if (this.applicationServiceStarted) {
                return;
            }
            IApplicationService iApplicationService = (IApplicationService) this.services.getService(IApplicationService.class);
            Intrinsics.checkNotNull(iApplicationService, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((ApplicationService) iApplicationService).start(context);
            Logging.INSTANCE.setApplicationService(iApplicationService);
            this.applicationServiceStarted = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void updateConfig() {
        if (this._consentRequired != null) {
            ConfigModel configModel = getConfigModel();
            Boolean bool = this._consentRequired;
            Intrinsics.checkNotNull(bool);
            configModel.setConsentRequired(bool);
        }
        if (this._consentGiven != null) {
            ConfigModel configModel2 = getConfigModel();
            Boolean bool2 = this._consentGiven;
            Intrinsics.checkNotNull(bool2);
            configModel2.setConsentGiven(bool2);
        }
        if (this._disableGMSMissingPrompt != null) {
            ConfigModel configModel3 = getConfigModel();
            Boolean bool3 = this._disableGMSMissingPrompt;
            Intrinsics.checkNotNull(bool3);
            configModel3.setDisableGMSMissingPrompt(bool3.booleanValue());
        }
    }

    private final StartupService bootstrapServices() {
        StartupService startupService = new StartupService(this.services);
        startupService.bootstrap();
        return startupService;
    }

    @Override // com.onesignal.IOneSignal
    public boolean initWithContext(Context context, String appId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Logging.log(LogLevel.DEBUG, "Calling deprecated initWithContext(context: " + context + ", appId: " + appId + ')');
        OneSignalDispatchers.INSTANCE.prewarm();
        synchronized (this.initLock) {
            if (this.initState.isSDKAccessible()) {
                Logging.log(LogLevel.DEBUG, "initWithContext: SDK already initialized or in progress");
                return true;
            }
            this.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
            this.initState = InitState.IN_PROGRESS;
            this.suspendCompletion = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            Unit unit = Unit.INSTANCE;
            try {
                ensureApplicationServiceStarted(context);
                ThreadUtilsKt.suspendifyOnIO(new OneSignalImp$initWithContext$2(this, context, appId, null));
                return true;
            } catch (Exception e) {
                Exception exc = this.initFailureException;
                if (exc != null) {
                    ExceptionsKt.addSuppressed(exc, e);
                }
                completeInit(InitState.FAILED);
                throw e;
            }
        }
    }

    @Override // com.onesignal.IOneSignal
    public Object initWithContext(Context context, Continuation<? super Boolean> continuation) {
        Logging.log(LogLevel.DEBUG, "initWithContext(context: " + context + ')');
        return initWithContextSuspend(context, null, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalInit(Context context, String appId) {
        try {
            if (!AndroidUtils.INSTANCE.isAndroidUserUnlocked(context)) {
                Logging.warn$default("initWithContext called when device storage is locked, no user data is accessible!", null, 2, null);
                completeInit(InitState.FAILED);
                return false;
            }
            initEssentials(context);
            StartupService bootstrapServices = bootstrapServices();
            OtelLifecycleManager otelLifecycleManager = this.otelManager;
            if (otelLifecycleManager != null) {
                otelLifecycleManager.subscribeToConfigStore((ConfigModelStore) this.services.getService(ConfigModelStore.class));
            }
            AppIdResolution resolveAppId = AppIdResolutionKt.resolveAppId(appId, getConfigModel(), getPreferencesService());
            if (resolveAppId.getFailed()) {
                IllegalStateException illegalStateException = new IllegalStateException("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().");
                Exception exc = this.initFailureException;
                if (exc != null) {
                    ExceptionsKt.addSuppressed(exc, illegalStateException);
                }
                Logging.warn$default("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().", null, 2, null);
                completeInit(InitState.FAILED);
                return false;
            }
            ConfigModel configModel = getConfigModel();
            String appId2 = resolveAppId.getAppId();
            Intrinsics.checkNotNull(appId2);
            configModel.setAppId(appId2);
            boolean forceCreateUser = resolveAppId.getForceCreateUser();
            updateConfig();
            getUserSwitcher().initUser(forceCreateUser);
            bootstrapServices.scheduleStart();
            completeInit(InitState.SUCCESS);
            return true;
        } catch (Exception e) {
            Exception exc2 = e;
            Logging.error("OneSignal: internalInit threw unexpectedly; marking init FAILED", exc2);
            Exception exc3 = this.initFailureException;
            if (exc3 != null) {
                ExceptionsKt.addSuppressed(exc3, exc2);
            }
            completeInit(InitState.FAILED);
            return false;
        }
    }

    @Override // com.onesignal.IOneSignal
    public void login(String externalId, String jwtBearerToken) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Logging.log(LogLevel.DEBUG, "Calling deprecated login(externalId: " + externalId + ", jwtBearerToken: ..." + (jwtBearerToken != null ? StringsKt.takeLast(jwtBearerToken, 8) : null) + ')');
        waitForInit("login");
        LoginHelper.LoginEnqueueContext switchUser$com_onesignal_core = getLoginHelper().switchUser$com_onesignal_core(externalId, jwtBearerToken);
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        ThreadUtilsKt.suspendifyOnIO(new OneSignalImp$login$1(this, switchUser$com_onesignal_core, null));
    }

    @Override // com.onesignal.IOneSignal
    public void logout() {
        Logging.log(LogLevel.DEBUG, "Calling deprecated logout()");
        waitForInit("logout");
        LogoutHelper.LogoutEnqueueContext switchUser$com_onesignal_core = getLogoutHelper().switchUser$com_onesignal_core();
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        ThreadUtilsKt.suspendifyOnIO(new OneSignalImp$logout$1(this, switchUser$com_onesignal_core, null));
    }

    @Override // com.onesignal.IOneSignal
    public void updateUserJwt(String externalId, String token) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(token, "token");
        Logging.log(LogLevel.DEBUG, "updateUserJwt(externalId: " + externalId + ", token: ..." + StringsKt.takeLast(token, 8) + ')');
        waitForInit("updateUserJwt");
        getJwtTokenStore().putJwt(externalId, token);
        getOperationRepo().forceExecuteOperations();
    }

    @Override // com.onesignal.IOneSignal
    public void addUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        waitForInit("addUserJwtInvalidatedListener");
        getJwtTokenStore().addUserJwtInvalidatedListener(listener);
    }

    @Override // com.onesignal.IOneSignal
    public void removeUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        waitForInit("removeUserJwtInvalidatedListener");
        getJwtTokenStore().removeUserJwtInvalidatedListener(listener);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> boolean hasService(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return this.services.hasService(c);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getService(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) this.services.getService(c);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getServiceOrNull(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) this.services.getServiceOrNull(c);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> List<T> getAllServices(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return this.services.getAllServices(c);
    }

    static /* synthetic */ void waitForInit$default(OneSignalImp oneSignalImp, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        oneSignalImp.waitForInit(str);
    }

    private final void waitForInit(String operationName) {
        if (this.initState == InitState.SUCCESS) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new OneSignalImp$waitForInit$1(this, operationName, null), 1, null);
    }

    private final void completeInit(InitState terminalState) {
        if (terminalState != InitState.SUCCESS && terminalState != InitState.FAILED) {
            throw new IllegalArgumentException(("completeInit requires a terminal state, got " + terminalState).toString());
        }
        synchronized (this.initLock) {
            this.initState = terminalState;
            this.suspendCompletion.complete(Unit.INSTANCE);
        }
    }

    static /* synthetic */ Object suspendUntilInit$default(OneSignalImp oneSignalImp, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return oneSignalImp.suspendUntilInit(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object suspendUntilInit(String str, Continuation<? super Unit> continuation) {
        Object waitUntilInitInternal = waitUntilInitInternal(str, continuation);
        return waitUntilInitInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? waitUntilInitInternal : Unit.INSTANCE;
    }

    static /* synthetic */ Object waitUntilInitInternal$default(OneSignalImp oneSignalImp, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return oneSignalImp.waitUntilInitInternal(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object waitUntilInitInternal(String str, Continuation<? super Unit> continuation) {
        InitState initState;
        CompletableDeferred<Unit> completableDeferred;
        synchronized (this.initLock) {
            initState = this.initState;
            completableDeferred = initState == InitState.IN_PROGRESS ? this.suspendCompletion : null;
            Unit unit = Unit.INSTANCE;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[initState.ordinal()];
        if (i == 1) {
            throw new IllegalStateException(notInitializedMessage(str));
        }
        if (i == 2) {
            Intrinsics.checkNotNull(completableDeferred);
            Object awaitInitCompletion = awaitInitCompletion(completableDeferred, str, continuation);
            return awaitInitCompletion == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitInitCompletion : Unit.INSTANCE;
        }
        if (i == 3) {
            Throwable th = this.initFailureException;
            if (th == null) {
                th = new IllegalStateException("Initialization failed. Cannot proceed.");
            }
            throw th;
        }
        return Unit.INSTANCE;
    }

    private final String notInitializedMessage(String operationName) {
        if (operationName != null) {
            return "Must call 'initWithContext' before '" + operationName + '\'';
        }
        return "Must call 'initWithContext' before use";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitInitCompletion(CompletableDeferred<Unit> completableDeferred, String str, Continuation<? super Unit> continuation) {
        OneSignalImp$awaitInitCompletion$1 oneSignalImp$awaitInitCompletion$1;
        int i;
        OneSignalImp oneSignalImp;
        String str2;
        long j;
        if (continuation instanceof OneSignalImp$awaitInitCompletion$1) {
            oneSignalImp$awaitInitCompletion$1 = (OneSignalImp$awaitInitCompletion$1) continuation;
            if ((oneSignalImp$awaitInitCompletion$1.label & Integer.MIN_VALUE) != 0) {
                oneSignalImp$awaitInitCompletion$1.label -= Integer.MIN_VALUE;
                Object obj = oneSignalImp$awaitInitCompletion$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oneSignalImp$awaitInitCompletion$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logging.debug$default("Waiting for init to complete...", null, 2, null);
                    long currentTimeMillis = System.currentTimeMillis();
                    oneSignalImp$awaitInitCompletion$1.L$0 = this;
                    oneSignalImp$awaitInitCompletion$1.L$1 = str;
                    oneSignalImp$awaitInitCompletion$1.J$0 = currentTimeMillis;
                    oneSignalImp$awaitInitCompletion$1.label = 1;
                    if (completableDeferred.await(oneSignalImp$awaitInitCompletion$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oneSignalImp = this;
                    str2 = str;
                    j = currentTimeMillis;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = oneSignalImp$awaitInitCompletion$1.J$0;
                    str2 = (String) oneSignalImp$awaitInitCompletion$1.L$1;
                    oneSignalImp = (OneSignalImp) oneSignalImp$awaitInitCompletion$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                Logging.debug$default(str2 == null ? "OneSignalImp initialization completed before '" + str2 + "' (took " + currentTimeMillis2 + "ms)" : "OneSignalImp initialization completed (took " + currentTimeMillis2 + "ms)", null, 2, null);
                if (oneSignalImp.initState != InitState.FAILED) {
                    Throwable th = oneSignalImp.initFailureException;
                    if (th == null) {
                        th = new IllegalStateException("Initialization failed. Cannot proceed.");
                    }
                    throw th;
                }
                return Unit.INSTANCE;
            }
        }
        oneSignalImp$awaitInitCompletion$1 = new OneSignalImp$awaitInitCompletion$1(this, continuation);
        Object obj2 = oneSignalImp$awaitInitCompletion$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oneSignalImp$awaitInitCompletion$1.label;
        if (i != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() - j;
        Logging.debug$default(str2 == null ? "OneSignalImp initialization completed before '" + str2 + "' (took " + currentTimeMillis22 + "ms)" : "OneSignalImp initialization completed (took " + currentTimeMillis22 + "ms)", null, 2, null);
        if (oneSignalImp.initState != InitState.FAILED) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object suspendAndReturn(Function0<? extends T> function0, Continuation<? super T> continuation) {
        OneSignalImp$suspendAndReturn$1 oneSignalImp$suspendAndReturn$1;
        int i;
        if (continuation instanceof OneSignalImp$suspendAndReturn$1) {
            oneSignalImp$suspendAndReturn$1 = (OneSignalImp$suspendAndReturn$1) continuation;
            if ((oneSignalImp$suspendAndReturn$1.label & Integer.MIN_VALUE) != 0) {
                oneSignalImp$suspendAndReturn$1.label -= Integer.MIN_VALUE;
                Object obj = oneSignalImp$suspendAndReturn$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oneSignalImp$suspendAndReturn$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    oneSignalImp$suspendAndReturn$1.L$0 = function0;
                    oneSignalImp$suspendAndReturn$1.label = 1;
                    if (suspendUntilInit$default(this, null, oneSignalImp$suspendAndReturn$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function0 = (Function0) oneSignalImp$suspendAndReturn$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return function0.invoke();
            }
        }
        oneSignalImp$suspendAndReturn$1 = new OneSignalImp$suspendAndReturn$1(this, continuation);
        Object obj2 = oneSignalImp$suspendAndReturn$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oneSignalImp$suspendAndReturn$1.label;
        if (i != 0) {
        }
        return function0.invoke();
    }

    private final <T> T waitAndReturn(Function0<? extends T> getter) {
        waitForInit$default(this, null, 1, null);
        return getter.invoke();
    }

    private final <T> T blockingGet(Function0<? extends T> getter) {
        Object runBlocking$default;
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                Logging.debug$default("This is called on main thread. This is not recommended.", null, 2, null);
            }
        } catch (RuntimeException e) {
            Logging.debug$default("Could not check main thread status (likely in test environment): " + e.getMessage(), null, 2, null);
        }
        if (this.initState != InitState.SUCCESS) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new OneSignalImp$blockingGet$1(this, getter, null), 1, null);
            return (T) runBlocking$default;
        }
        return getter.invoke();
    }

    @Override // com.onesignal.IOneSignal
    public Object getSession(Continuation<? super ISessionManager> continuation) {
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$getSession$2(this, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object getNotifications(Continuation<? super INotificationsManager> continuation) {
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$getNotifications$2(this, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object getLocation(Continuation<? super ILocationManager> continuation) {
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$getLocation$2(this, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object getInAppMessages(Continuation<? super IInAppMessagesManager> continuation) {
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$getInAppMessages$2(this, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object getUser(Continuation<? super IUserManager> continuation) {
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$getUser$2(this, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object getConsentRequired(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$getConsentRequired$2(this, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object setConsentRequired(boolean z, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$setConsentRequired$2(this, z, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.IOneSignal
    public Object getConsentGiven(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$getConsentGiven$2(this, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object setConsentGiven(boolean z, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$setConsentGiven$2(this, z, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.IOneSignal
    public Object getDisableGMSMissingPrompt(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$getDisableGMSMissingPrompt$2(this, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object setDisableGMSMissingPrompt(boolean z, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$setDisableGMSMissingPrompt$2(this, z, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.IOneSignal
    public Object initWithContextSuspend(Context context, String str, Continuation<? super Boolean> continuation) {
        Logging.log(LogLevel.DEBUG, "initWithContext(context: " + context + ", appId: " + str + ')');
        OneSignalDispatchers.INSTANCE.prewarm();
        return BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$initWithContextSuspend$2(this, context, str, null), continuation);
    }

    @Override // com.onesignal.IOneSignal
    public Object loginSuspend(String str, String str2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$loginSuspend$2(str, str2, this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.IOneSignal
    public Object updateUserJwtSuspend(String str, String str2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$updateUserJwtSuspend$2(str, str2, this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.IOneSignal
    public Object logoutSuspend(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(getIoDispatcher(), new OneSignalImp$logoutSuspend$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
