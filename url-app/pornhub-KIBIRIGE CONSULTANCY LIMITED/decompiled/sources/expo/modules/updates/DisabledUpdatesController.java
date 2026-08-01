package expo.modules.updates;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.updates.IUpdatesController;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.events.IUpdatesEventManager;
import expo.modules.updates.events.UpdatesEventManager;
import expo.modules.updates.launcher.Launcher;
import expo.modules.updates.launcher.NoDatabaseLauncher;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.procedures.RecreateReactContextProcedure;
import expo.modules.updates.reloadscreen.ReloadScreenManager;
import expo.modules.updates.statemachine.UpdatesStateMachine;
import expo.modules.updates.statemachine.UpdatesStateValue;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: DisabledUpdatesController.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 Z2\u00020\u0001:\u0002YZB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u00107\u001a\u00020*H\u0016J\u0010\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020\u0005H\u0016J\b\u0010B\u001a\u00020*H\u0016J\b\u0010C\u001a\u00020DH\u0016J\u000e\u0010E\u001a\u00020*H\u0096@¢\u0006\u0002\u0010FJ\u000e\u0010G\u001a\u00020HH\u0096@¢\u0006\u0002\u0010FJ\u000e\u0010I\u001a\u00020JH\u0096@¢\u0006\u0002\u0010FJ\u000e\u0010K\u001a\u00020LH\u0096@¢\u0006\u0002\u0010FJ \u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020.2\b\u0010O\u001a\u0004\u0018\u00010.H\u0096@¢\u0006\u0002\u0010PJ\u0012\u0010Q\u001a\u00020*2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u001e\u0010T\u001a\u00020*2\u0014\u0010U\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.\u0018\u00010VH\u0016J\b\u0010W\u001a\u00020*H\u0002J\b\u0010X\u001a\u00020*H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0016\u00103\u001a\u0004\u0018\u0001048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010@\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006["}, d2 = {"Lexpo/modules/updates/DisabledUpdatesController;", "Lexpo/modules/updates/IUpdatesController;", "context", "Landroid/content/Context;", "fatalException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Landroid/content/Context;Ljava/lang/Exception;)V", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "eventManager", "Lexpo/modules/updates/events/IUpdatesEventManager;", "getEventManager", "()Lexpo/modules/updates/events/IUpdatesEventManager;", "stateMachine", "Lexpo/modules/updates/statemachine/UpdatesStateMachine;", "isStarted", "", "startupStartTimeMillis", "", "Ljava/lang/Long;", "startupEndTimeMillis", "launchDuration", "Lkotlin/time/Duration;", "getLaunchDuration-FghU774", "()Lkotlin/time/Duration;", "launcher", "Lexpo/modules/updates/launcher/Launcher;", "updatesDirectory", "Ljava/io/File;", "getUpdatesDirectory", "()Ljava/io/File;", "setUpdatesDirectory", "(Ljava/io/File;)V", "loaderTaskFinishedDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "loaderTaskFinishedMutex", "Lkotlinx/coroutines/sync/Mutex;", "launchAssetFile", "", "getLaunchAssetFile", "()Ljava/lang/String;", "bundleAssetName", "getBundleAssetName", "reloadScreenManager", "Lexpo/modules/updates/reloadscreen/ReloadScreenManager;", "getReloadScreenManager", "()Lexpo/modules/updates/reloadscreen/ReloadScreenManager;", "onEventListenerStartObserving", "onDidCreateDevSupportManager", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "onDidCreateReactInstance", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "onReactInstanceException", "exception", "isActiveController", "()Z", ViewProps.START, "getConstantsForModule", "Lexpo/modules/updates/IUpdatesController$UpdatesModuleConstants;", "relaunchReactApplicationForModule", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkForUpdate", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "fetchUpdate", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "getExtraParams", "Landroid/os/Bundle;", "setExtraParam", "key", "value", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUpdateURLAndRequestHeadersOverride", "configOverride", "Lexpo/modules/updates/UpdatesConfigurationOverride;", "setUpdateRequestHeadersOverride", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "notifyController", "shutdown", "UpdatesDisabledException", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DisabledUpdatesController implements IUpdatesController {
    private static final String TAG = "DisabledUpdatesController";
    private final Context context;
    private final CoroutineScope controllerScope;
    private final IUpdatesEventManager eventManager;
    private final Exception fatalException;
    private final boolean isActiveController;
    private boolean isStarted;
    private Launcher launcher;
    private final CompletableDeferred<Unit> loaderTaskFinishedDeferred;
    private final Mutex loaderTaskFinishedMutex;
    private final UpdatesLogger logger;
    private Long startupEndTimeMillis;
    private Long startupStartTimeMillis;
    private final UpdatesStateMachine stateMachine;
    private File updatesDirectory;
    private WeakReference<Activity> weakActivity;

    @Override // expo.modules.updates.IUpdatesController
    public ReloadScreenManager getReloadScreenManager() {
        return null;
    }

    @Override // expo.modules.updates.IUpdatesController
    public void onDidCreateDevSupportManager(DevSupportManager devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
    }

    @Override // expo.modules.updates.IUpdatesController
    public void onReactInstanceException(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
    }

    public DisabledUpdatesController(Context context, Exception exc) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.fatalException = exc;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.controllerScope = CoroutineScope;
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        UpdatesLogger updatesLogger = new UpdatesLogger(filesDir);
        this.logger = updatesLogger;
        this.eventManager = new UpdatesEventManager(updatesLogger);
        this.stateMachine = new UpdatesStateMachine(updatesLogger, getEventManager(), SetsKt.setOf((Object[]) new UpdatesStateValue[]{UpdatesStateValue.Idle, UpdatesStateValue.Restarting}), CoroutineScope);
        this.loaderTaskFinishedDeferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.loaderTaskFinishedMutex = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // expo.modules.updates.IUpdatesController
    public IUpdatesEventManager getEventManager() {
        return this.eventManager;
    }

    /* renamed from: getLaunchDuration-FghU774, reason: not valid java name */
    private final Duration m753getLaunchDurationFghU774() {
        Long l = this.startupStartTimeMillis;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.startupEndTimeMillis;
            if (l2 != null) {
                return Duration.m2148boximpl(DurationKt.toDuration(l2.longValue() - longValue, DurationUnit.MILLISECONDS));
            }
        }
        return null;
    }

    @Override // expo.modules.updates.IUpdatesController
    public File getUpdatesDirectory() {
        return this.updatesDirectory;
    }

    public void setUpdatesDirectory(File file) {
        this.updatesDirectory = file;
    }

    @Override // expo.modules.updates.IUpdatesController
    public String getLaunchAssetFile() {
        BuildersKt__BuildersKt.runBlocking$default(null, new DisabledUpdatesController$launchAssetFile$1(this, null), 1, null);
        Launcher launcher = this.launcher;
        if (launcher != null) {
            return launcher.getLaunchAssetFile();
        }
        return null;
    }

    @Override // expo.modules.updates.IUpdatesController
    public String getBundleAssetName() {
        Launcher launcher = this.launcher;
        if (launcher != null) {
            return launcher.getBundleAssetName();
        }
        return null;
    }

    @Override // expo.modules.updates.IUpdatesController
    public void onEventListenerStartObserving() {
        this.stateMachine.sendContextToJS();
    }

    @Override // expo.modules.updates.IUpdatesController
    public void onDidCreateReactInstance(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.weakActivity = new WeakReference<>(reactContext.getCurrentActivity());
    }

    @Override // expo.modules.updates.IUpdatesController
    /* renamed from: isActiveController, reason: from getter */
    public boolean getIsActiveController() {
        return this.isActiveController;
    }

    @Override // expo.modules.updates.IUpdatesController
    public synchronized void start() {
        if (this.isStarted) {
            return;
        }
        this.isStarted = true;
        this.startupStartTimeMillis = Long.valueOf(System.currentTimeMillis());
        this.launcher = new NoDatabaseLauncher(this.context, this.logger, this.fatalException, this.controllerScope);
        this.startupEndTimeMillis = Long.valueOf(System.currentTimeMillis());
        notifyController();
    }

    /* compiled from: DisabledUpdatesController.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/updates/DisabledUpdatesController$UpdatesDisabledException;", "Lexpo/modules/kotlin/exception/CodedException;", "message", "", "<init>", "(Ljava/lang/String;)V", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdatesDisabledException extends CodedException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatesDisabledException(String message) {
            super(message, null, 2, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Override // expo.modules.updates.IUpdatesController
    public IUpdatesController.UpdatesModuleConstants getConstantsForModule() {
        UpdateEntity updateEntity;
        Map<AssetEntity, String> map;
        Launcher launcher = this.launcher;
        if (launcher != null) {
            updateEntity = launcher.getLaunchedUpdate();
            map = null;
        } else {
            updateEntity = null;
            map = null;
        }
        Duration m753getLaunchDurationFghU774 = m753getLaunchDurationFghU774();
        Exception exc = this.fatalException;
        Launcher launcher2 = this.launcher;
        boolean isUsingEmbeddedAssets = launcher2 != null ? launcher2.getIsUsingEmbeddedAssets() : false;
        UpdatesConfiguration.CheckAutomaticallyConfiguration checkAutomaticallyConfiguration = UpdatesConfiguration.CheckAutomaticallyConfiguration.NEVER;
        Map emptyMap = MapsKt.emptyMap();
        Launcher launcher3 = this.launcher;
        if (launcher3 != null) {
            map = launcher3.mo768getLocalAssetFiles();
        }
        return new IUpdatesController.UpdatesModuleConstants(updateEntity, m753getLaunchDurationFghU774, null, exc, false, isUsingEmbeddedAssets, null, checkAutomaticallyConfiguration, emptyMap, map, false, this.stateMachine.getContext(), null);
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object checkForUpdate(Continuation<? super IUpdatesController.CheckForUpdateResult> continuation) {
        throw new UpdatesDisabledException("Updates.checkForUpdateAsync() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object fetchUpdate(Continuation<? super IUpdatesController.FetchUpdateResult> continuation) {
        throw new UpdatesDisabledException("Updates.fetchUpdateAsync() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object getExtraParams(Continuation<? super Bundle> continuation) {
        throw new UpdatesDisabledException("Updates.getExtraParamsAsync() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object setExtraParam(String str, String str2, Continuation<? super Unit> continuation) {
        throw new UpdatesDisabledException("Updates.setExtraParamAsync() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public void setUpdateURLAndRequestHeadersOverride(UpdatesConfigurationOverride configOverride) {
        throw new UpdatesDisabledException("Updates.setUpdateURLAndRequestHeadersOverride() is not supported when expo-updates is not enabled.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public void setUpdateRequestHeadersOverride(Map<String, String> requestHeaders) {
        throw new UpdatesDisabledException("Updates.setUpdateRequestHeadersOverride() is not supported when expo-updates is not enabled.");
    }

    private final synchronized void notifyController() {
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new DisabledUpdatesController$notifyController$1(this, null), 3, null);
    }

    @Override // expo.modules.updates.IUpdatesController
    public void shutdown() {
        CoroutineScopeKt.cancel$default(this.controllerScope, null, 1, null);
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object relaunchReactApplicationForModule(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        this.stateMachine.queueExecution(new RecreateReactContextProcedure(this.context, this.weakActivity, new Launcher.LauncherCallback() { // from class: expo.modules.updates.DisabledUpdatesController$relaunchReactApplicationForModule$2$procedure$1
            @Override // expo.modules.updates.launcher.Launcher.LauncherCallback
            public void onFailure(Exception e) {
                UnexpectedException unexpectedException;
                Intrinsics.checkNotNullParameter(e, "e");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                Exception exc = e;
                if (exc instanceof CodedException) {
                    unexpectedException = (CodedException) exc;
                } else if (exc instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) exc;
                    String code = codedException.getCode();
                    Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
                    unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(exc);
                }
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m788constructorimpl(ResultKt.createFailure(unexpectedException)));
            }

            @Override // expo.modules.updates.launcher.Launcher.LauncherCallback
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m788constructorimpl(Unit.INSTANCE));
            }
        }, this.controllerScope));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
