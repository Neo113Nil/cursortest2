package expo.modules.updates;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import coil3.disk.DiskLruCache;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.easclient.EASClientID;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.updates.IUpdatesController;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.DatabaseHolder;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.events.NoOpUpdatesEventManager;
import expo.modules.updates.launcher.DatabaseLauncher;
import expo.modules.updates.launcher.Launcher;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.RemoteLoader;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.reloadscreen.ReloadScreenManager;
import expo.modules.updates.selectionpolicy.LauncherSelectionPolicyDevelopmentClient;
import expo.modules.updates.selectionpolicy.LauncherSelectionPolicySingleUpdate;
import expo.modules.updates.selectionpolicy.LoaderSelectionPolicyDevelopmentClient;
import expo.modules.updates.selectionpolicy.ReaperSelectionPolicyDevelopmentClient;
import expo.modules.updates.selectionpolicy.ReaperSelectionPolicyFilterAware;
import expo.modules.updates.selectionpolicy.SelectionPolicy;
import expo.modules.updates.statemachine.UpdatesStateContext;
import expo.modules.updatesinterface.UpdatesInterface;
import expo.modules.updatesinterface.UpdatesInterfaceCallbacks;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONObject;

/* compiled from: UpdatesDevLauncherController.kt */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0002}~B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010+\u001a\u00020,2\b\u0010(\u001a\u0004\u0018\u00010&H\u0002J\b\u0010-\u001a\u00020,H\u0002J\u0010\u0010.\u001a\u00020,2\u0006\u0010(\u001a\u00020&H\u0002J\b\u00109\u001a\u00020,H\u0016J\u0010\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020\nH\u0016J\b\u0010E\u001a\u00020,H\u0016J\b\u0010P\u001a\u00020,H\u0016J4\u0010W\u001a\u00020,2\"\u0010X\u001a\u001e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020Z0Yj\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020Z`[2\u0006\u0010\\\u001a\u00020]H\u0016J,\u0010^\u001a\u00020C2\"\u0010X\u001a\u001e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020Z0Yj\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020Z`[H\u0016J,\u0010_\u001a\u00020\u00062\"\u0010X\u001a\u001e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020Z0Yj\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020Z`[H\u0002J\b\u0010`\u001a\u00020,H\u0002J.\u0010a\u001a\u00020,2\u0006\u0010b\u001a\u00020G2\u0006\u0010X\u001a\u00020\u00062\u0006\u0010c\u001a\u00020d2\u0006\u0010\\\u001a\u00020]H\u0082@¢\u0006\u0002\u0010eJ\b\u0010f\u001a\u00020gH\u0002J\b\u0010h\u001a\u00020,H\u0002J\b\u0010i\u001a\u00020jH\u0016J\u000e\u0010k\u001a\u00020,H\u0096@¢\u0006\u0002\u0010lJ\u000e\u0010m\u001a\u00020nH\u0096@¢\u0006\u0002\u0010lJ\u000e\u0010o\u001a\u00020pH\u0096@¢\u0006\u0002\u0010lJ\u000e\u0010q\u001a\u00020rH\u0096@¢\u0006\u0002\u0010lJ \u0010s\u001a\u00020,2\u0006\u0010t\u001a\u0002002\b\u0010u\u001a\u0004\u0018\u000100H\u0096@¢\u0006\u0002\u0010vJ\u0012\u0010w\u001a\u00020,2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016J\u001e\u0010z\u001a\u00020,2\u0014\u0010{\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000200\u0018\u00010KH\u0016J\b\u0010|\u001a\u00020,H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u00105\u001a\u000206X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010B\u001a\u00020CX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bB\u0010DR\u0013\u0010F\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\"\u0010J\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u000200\u0018\u00010K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010DR\u0016\u0010Q\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u00102R\u0016\u0010S\u001a\u0004\u0018\u00010T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006\u007f"}, d2 = {"Lexpo/modules/updates/UpdatesDevLauncherController;", "Lexpo/modules/updates/IUpdatesController;", "Lexpo/modules/updatesinterface/UpdatesInterface;", "context", "Landroid/content/Context;", "initialUpdatesConfiguration", "Lexpo/modules/updates/UpdatesConfiguration;", "updatesDirectory", "Ljava/io/File;", "updatesDirectoryException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Ljava/io/File;Ljava/lang/Exception;)V", "getUpdatesDirectory", "()Ljava/io/File;", "eventManager", "Lexpo/modules/updates/events/NoOpUpdatesEventManager;", "getEventManager", "()Lexpo/modules/updates/events/NoOpUpdatesEventManager;", "updatesInterfaceCallbacks", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/updatesinterface/UpdatesInterfaceCallbacks;", "getUpdatesInterfaceCallbacks", "()Ljava/lang/ref/WeakReference;", "setUpdatesInterfaceCallbacks", "(Ljava/lang/ref/WeakReference;)V", "launcher", "Lexpo/modules/updates/launcher/Launcher;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "previousUpdatesConfiguration", "updatesConfiguration", "databaseHolder", "Lexpo/modules/updates/db/DatabaseHolder;", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "mSelectionPolicy", "Lexpo/modules/updates/selectionpolicy/SelectionPolicy;", "defaultSelectionPolicy", "selectionPolicy", "getSelectionPolicy", "()Lexpo/modules/updates/selectionpolicy/SelectionPolicy;", "setNextSelectionPolicy", "", "resetSelectionPolicyToDefault", "setDefaultSelectionPolicy", "launchAssetFile", "", "getLaunchAssetFile", "()Ljava/lang/String;", "bundleAssetName", "getBundleAssetName", "reloadScreenManager", "Lexpo/modules/updates/reloadscreen/ReloadScreenManager;", "getReloadScreenManager", "()Lexpo/modules/updates/reloadscreen/ReloadScreenManager;", "onEventListenerStartObserving", "onDidCreateDevSupportManager", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "onDidCreateReactInstance", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "onReactInstanceException", "exception", "isActiveController", "", "()Z", ViewProps.START, "launchedUpdate", "Lexpo/modules/updates/db/entity/UpdateEntity;", "getLaunchedUpdate", "()Lexpo/modules/updates/db/entity/UpdateEntity;", "localAssetFiles", "", "Lexpo/modules/updates/db/entity/AssetEntity;", "getLocalAssetFiles", "()Ljava/util/Map;", "isUsingEmbeddedAssets", "reset", UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY, "getRuntimeVersion", UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY, "Landroid/net/Uri;", "getUpdateUrl", "()Landroid/net/Uri;", "fetchUpdateWithConfiguration", "configuration", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "callback", "Lexpo/modules/updatesinterface/UpdatesInterface$UpdateCallback;", "isValidUpdatesConfiguration", "createUpdatesConfiguration", "setDevelopmentSelectionPolicy", "launchUpdate", "update", "fileDownloader", "Lexpo/modules/updates/loader/FileDownloader;", "(Lexpo/modules/updates/db/entity/UpdateEntity;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/loader/FileDownloader;Lexpo/modules/updatesinterface/UpdatesInterface$UpdateCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDatabase", "Lexpo/modules/updates/db/UpdatesDatabase;", "runReaper", "getConstantsForModule", "Lexpo/modules/updates/IUpdatesController$UpdatesModuleConstants;", "relaunchReactApplicationForModule", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkForUpdate", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "fetchUpdate", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "getExtraParams", "Landroid/os/Bundle;", "setExtraParam", "key", "value", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUpdateURLAndRequestHeadersOverride", "configOverride", "Lexpo/modules/updates/UpdatesConfigurationOverride;", "setUpdateRequestHeadersOverride", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "shutdown", "NotAvailableInDevClientException", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatesDevLauncherController implements IUpdatesController, UpdatesInterface {
    private static final String TAG = "UpdatesDevLauncherController";
    private final Context context;
    private final CoroutineScope controllerScope;
    private final DatabaseHolder databaseHolder;
    private SelectionPolicy defaultSelectionPolicy;
    private final NoOpUpdatesEventManager eventManager;
    private final boolean isActiveController;
    private Launcher launcher;
    private final UpdatesLogger logger;
    private SelectionPolicy mSelectionPolicy;
    private UpdatesConfiguration previousUpdatesConfiguration;
    private final ReloadScreenManager reloadScreenManager;
    private UpdatesConfiguration updatesConfiguration;
    private final File updatesDirectory;
    private final Exception updatesDirectoryException;
    private WeakReference<UpdatesInterfaceCallbacks> updatesInterfaceCallbacks;

    /* compiled from: UpdatesDevLauncherController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdatesConfigurationValidationResult.values().length];
            try {
                iArr[UpdatesConfigurationValidationResult.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdatesConfigurationValidationResult.INVALID_NOT_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpdatesConfigurationValidationResult.INVALID_MISSING_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UpdatesConfigurationValidationResult.INVALID_MISSING_RUNTIME_VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // expo.modules.updates.IUpdatesController
    public void onDidCreateDevSupportManager(DevSupportManager devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
    }

    @Override // expo.modules.updates.IUpdatesController
    public void onDidCreateReactInstance(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // expo.modules.updates.IUpdatesController
    public void onEventListenerStartObserving() {
    }

    @Override // expo.modules.updates.IUpdatesController
    public void onReactInstanceException(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
    }

    @Override // expo.modules.updates.IUpdatesController
    public void shutdown() {
    }

    @Override // expo.modules.updates.IUpdatesController
    public void start() {
    }

    public UpdatesDevLauncherController(Context context, UpdatesConfiguration updatesConfiguration, File file, Exception exc) {
        String runtimeVersion;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.updatesDirectory = file;
        this.updatesDirectoryException = exc;
        this.eventManager = new NoOpUpdatesEventManager();
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        this.logger = new UpdatesLogger(filesDir);
        this.updatesConfiguration = updatesConfiguration;
        this.databaseHolder = new DatabaseHolder(UpdatesDatabase.INSTANCE.getInstance(context, Dispatchers.getIO()));
        this.controllerScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.defaultSelectionPolicy = new SelectionPolicy(new LauncherSelectionPolicyDevelopmentClient((updatesConfiguration == null || (runtimeVersion = updatesConfiguration.getRuntimeVersion()) == null) ? DiskLruCache.VERSION : runtimeVersion, updatesConfiguration), new LoaderSelectionPolicyDevelopmentClient(updatesConfiguration), new ReaperSelectionPolicyFilterAware());
        this.reloadScreenManager = new ReloadScreenManager();
    }

    @Override // expo.modules.updates.IUpdatesController
    public File getUpdatesDirectory() {
        return this.updatesDirectory;
    }

    @Override // expo.modules.updates.IUpdatesController
    public NoOpUpdatesEventManager getEventManager() {
        return this.eventManager;
    }

    @Override // expo.modules.updatesinterface.UpdatesInterface
    public WeakReference<UpdatesInterfaceCallbacks> getUpdatesInterfaceCallbacks() {
        return this.updatesInterfaceCallbacks;
    }

    @Override // expo.modules.updatesinterface.UpdatesInterface
    public void setUpdatesInterfaceCallbacks(WeakReference<UpdatesInterfaceCallbacks> weakReference) {
        this.updatesInterfaceCallbacks = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectionPolicy getSelectionPolicy() {
        SelectionPolicy selectionPolicy = this.mSelectionPolicy;
        return selectionPolicy == null ? this.defaultSelectionPolicy : selectionPolicy;
    }

    private final void setNextSelectionPolicy(SelectionPolicy selectionPolicy) {
        this.mSelectionPolicy = selectionPolicy;
    }

    private final void resetSelectionPolicyToDefault() {
        this.mSelectionPolicy = null;
    }

    private final void setDefaultSelectionPolicy(SelectionPolicy selectionPolicy) {
        this.defaultSelectionPolicy = selectionPolicy;
    }

    @Override // expo.modules.updates.IUpdatesController
    public synchronized String getLaunchAssetFile() {
        UpdatesLogger.warn$default(this.logger, "launchAssetFile should not be called from expo-dev-client build, except for Detox testing", null, 2, null);
        return null;
    }

    @Override // expo.modules.updates.IUpdatesController
    public String getBundleAssetName() {
        throw new Exception("IUpdatesController.bundleAssetName should not be called in dev client");
    }

    @Override // expo.modules.updates.IUpdatesController
    public ReloadScreenManager getReloadScreenManager() {
        return this.reloadScreenManager;
    }

    @Override // expo.modules.updates.IUpdatesController
    /* renamed from: isActiveController, reason: from getter */
    public boolean getIsActiveController() {
        return this.isActiveController;
    }

    public final UpdateEntity getLaunchedUpdate() {
        Launcher launcher = this.launcher;
        if (launcher != null) {
            return launcher.getLaunchedUpdate();
        }
        return null;
    }

    private final Map<AssetEntity, String> getLocalAssetFiles() {
        Launcher launcher = this.launcher;
        if (launcher != null) {
            return launcher.mo768getLocalAssetFiles();
        }
        return null;
    }

    private final boolean isUsingEmbeddedAssets() {
        Launcher launcher = this.launcher;
        if (launcher != null) {
            return launcher.getIsUsingEmbeddedAssets();
        }
        return false;
    }

    @Override // expo.modules.updatesinterface.UpdatesInterface
    public void reset() {
        this.launcher = null;
    }

    @Override // expo.modules.updatesinterface.UpdatesInterface
    public String getRuntimeVersion() {
        UpdatesConfiguration updatesConfiguration = this.updatesConfiguration;
        if (updatesConfiguration != null) {
            return updatesConfiguration.getRuntimeVersion();
        }
        return null;
    }

    @Override // expo.modules.updatesinterface.UpdatesInterface
    public Uri getUpdateUrl() {
        UpdatesConfiguration updatesConfiguration = this.updatesConfiguration;
        if (updatesConfiguration != null) {
            return updatesConfiguration.getUpdateUrl();
        }
        return null;
    }

    @Override // expo.modules.updatesinterface.UpdatesInterface
    public void fetchUpdateWithConfiguration(HashMap<String, Object> configuration, UpdatesInterface.UpdateCallback callback) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            UpdatesConfiguration createUpdatesConfiguration = createUpdatesConfiguration(configuration);
            if (getUpdatesDirectory() == null) {
                throw new IllegalStateException("Check failed.");
            }
            this.previousUpdatesConfiguration = this.updatesConfiguration;
            this.updatesConfiguration = createUpdatesConfiguration;
            setDevelopmentSelectionPolicy();
            File filesDir = this.context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
            String uuid = new EASClientID(this.context).getUuid().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            UpdatesConfiguration updatesConfiguration = this.updatesConfiguration;
            Intrinsics.checkNotNull(updatesConfiguration);
            FileDownloader fileDownloader = new FileDownloader(filesDir, uuid, updatesConfiguration, this.logger);
            Context context = this.context;
            UpdatesConfiguration updatesConfiguration2 = this.updatesConfiguration;
            Intrinsics.checkNotNull(updatesConfiguration2);
            BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new UpdatesDevLauncherController$fetchUpdateWithConfiguration$1(new RemoteLoader(context, updatesConfiguration2, this.logger, this.databaseHolder.getDatabase(), fileDownloader, getUpdatesDirectory(), null), callback, this, fileDownloader, null), 3, null);
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    @Override // expo.modules.updatesinterface.UpdatesInterface
    public boolean isValidUpdatesConfiguration(HashMap<String, Object> configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        try {
            createUpdatesConfiguration(configuration);
            return true;
        } catch (Exception e) {
            this.logger.error("Invalid updates configuration", e, UpdatesErrorCode.InitializationError);
            return false;
        }
    }

    private final UpdatesConfiguration createUpdatesConfiguration(HashMap<String, Object> configuration) throws Exception {
        if (getUpdatesDirectory() == null) {
            Exception exc = this.updatesDirectoryException;
            Intrinsics.checkNotNull(exc);
            throw exc;
        }
        HashMap<String, Object> hashMap = configuration;
        int i = WhenMappings.$EnumSwitchMapping$0[UpdatesConfiguration.INSTANCE.getUpdatesConfigurationValidationResult(this.context, hashMap).ordinal()];
        if (i == 1) {
            return new UpdatesConfiguration(this.context, hashMap);
        }
        if (i == 2) {
            throw new Exception("Failed to load update: UpdatesConfiguration object is not enabled");
        }
        if (i == 3) {
            throw new Exception("Failed to load update: UpdatesConfiguration object must include a valid update URL");
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new Exception("Failed to load update: UpdatesConfiguration object must include a valid runtime version");
    }

    private final void setDevelopmentSelectionPolicy() {
        resetSelectionPolicyToDefault();
        SelectionPolicy selectionPolicy = getSelectionPolicy();
        setDefaultSelectionPolicy(new SelectionPolicy(selectionPolicy.getLauncherSelectionPolicy(), selectionPolicy.getLoaderSelectionPolicy(), new ReaperSelectionPolicyDevelopmentClient(0, 1, null)));
        resetSelectionPolicyToDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchUpdate(UpdateEntity updateEntity, UpdatesConfiguration updatesConfiguration, FileDownloader fileDownloader, UpdatesInterface.UpdateCallback updateCallback, Continuation<? super Unit> continuation) {
        UpdatesDevLauncherController$launchUpdate$1 updatesDevLauncherController$launchUpdate$1;
        int i;
        UpdatesInterface.UpdateCallback updateCallback2;
        UpdatesInterface.UpdateCallback updateCallback3;
        UpdatesDatabase database;
        final DatabaseLauncher databaseLauncher;
        if (continuation instanceof UpdatesDevLauncherController$launchUpdate$1) {
            updatesDevLauncherController$launchUpdate$1 = (UpdatesDevLauncherController$launchUpdate$1) continuation;
            if ((updatesDevLauncherController$launchUpdate$1.label & Integer.MIN_VALUE) != 0) {
                updatesDevLauncherController$launchUpdate$1.label -= Integer.MIN_VALUE;
                Object obj = updatesDevLauncherController$launchUpdate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updatesDevLauncherController$launchUpdate$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SelectionPolicy selectionPolicy = getSelectionPolicy();
                    setNextSelectionPolicy(new SelectionPolicy(new LauncherSelectionPolicySingleUpdate(updateEntity.getId()), selectionPolicy.getLoaderSelectionPolicy(), selectionPolicy.getReaperSelectionPolicy()));
                    Context context = this.context;
                    File updatesDirectory = getUpdatesDirectory();
                    Intrinsics.checkNotNull(updatesDirectory);
                    DatabaseLauncher databaseLauncher2 = new DatabaseLauncher(context, updatesConfiguration, updatesDirectory, fileDownloader, getSelectionPolicy(), this.logger, this.controllerScope, false, 128, null);
                    try {
                        database = this.databaseHolder.getDatabase();
                        updateCallback2 = updateCallback;
                    } catch (Exception e) {
                        e = e;
                        updateCallback2 = updateCallback;
                    }
                    try {
                        updatesDevLauncherController$launchUpdate$1.L$0 = updateCallback2;
                        updatesDevLauncherController$launchUpdate$1.L$1 = databaseLauncher2;
                        updatesDevLauncherController$launchUpdate$1.label = 1;
                        if (databaseLauncher2.launch(database, updatesDevLauncherController$launchUpdate$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        updateCallback3 = updateCallback2;
                        databaseLauncher = databaseLauncher2;
                    } catch (Exception e2) {
                        e = e2;
                        updateCallback3 = updateCallback2;
                        this.updatesConfiguration = this.previousUpdatesConfiguration;
                        updateCallback3.onFailure(e);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    databaseLauncher = (DatabaseLauncher) updatesDevLauncherController$launchUpdate$1.L$1;
                    updateCallback3 = (UpdatesInterface.UpdateCallback) updatesDevLauncherController$launchUpdate$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        this.updatesConfiguration = this.previousUpdatesConfiguration;
                        updateCallback3.onFailure(e);
                        return Unit.INSTANCE;
                    }
                }
                this.launcher = databaseLauncher;
                updateCallback3.onSuccess(new UpdatesInterface.Update() { // from class: expo.modules.updates.UpdatesDevLauncherController$launchUpdate$2
                    @Override // expo.modules.updatesinterface.UpdatesInterface.Update
                    public JSONObject getManifest() {
                        UpdateEntity launchedUpdate = DatabaseLauncher.this.getLaunchedUpdate();
                        Intrinsics.checkNotNull(launchedUpdate);
                        return launchedUpdate.getManifest();
                    }

                    @Override // expo.modules.updatesinterface.UpdatesInterface.Update
                    public String getLaunchAssetPath() {
                        String launchAssetFile = DatabaseLauncher.this.getLaunchAssetFile();
                        Intrinsics.checkNotNull(launchAssetFile);
                        return launchAssetFile;
                    }
                });
                runReaper();
                return Unit.INSTANCE;
            }
        }
        updatesDevLauncherController$launchUpdate$1 = new UpdatesDevLauncherController$launchUpdate$1(this, continuation);
        Object obj2 = updatesDevLauncherController$launchUpdate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatesDevLauncherController$launchUpdate$1.label;
        if (i != 0) {
        }
        this.launcher = databaseLauncher;
        updateCallback3.onSuccess(new UpdatesInterface.Update() { // from class: expo.modules.updates.UpdatesDevLauncherController$launchUpdate$2
            @Override // expo.modules.updatesinterface.UpdatesInterface.Update
            public JSONObject getManifest() {
                UpdateEntity launchedUpdate = DatabaseLauncher.this.getLaunchedUpdate();
                Intrinsics.checkNotNull(launchedUpdate);
                return launchedUpdate.getManifest();
            }

            @Override // expo.modules.updatesinterface.UpdatesInterface.Update
            public String getLaunchAssetPath() {
                String launchAssetFile = DatabaseLauncher.this.getLaunchAssetFile();
                Intrinsics.checkNotNull(launchAssetFile);
                return launchAssetFile;
            }
        });
        runReaper();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdatesDatabase getDatabase() {
        return this.databaseHolder.getDatabase();
    }

    private final void runReaper() {
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new UpdatesDevLauncherController$runReaper$1(this, null), 3, null);
    }

    /* compiled from: UpdatesDevLauncherController.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/updates/UpdatesDevLauncherController$NotAvailableInDevClientException;", "Lexpo/modules/kotlin/exception/CodedException;", "message", "", "<init>", "(Ljava/lang/String;)V", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotAvailableInDevClientException extends CodedException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotAvailableInDevClientException(String message) {
            super(message, null, 2, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Override // expo.modules.updates.IUpdatesController
    public IUpdatesController.UpdatesModuleConstants getConstantsForModule() {
        String str;
        UpdatesConfiguration.CheckAutomaticallyConfiguration checkAutomaticallyConfiguration;
        Map<String, String> emptyMap;
        UpdateEntity launchedUpdate = getLaunchedUpdate();
        Exception exc = this.updatesDirectoryException;
        boolean isUsingEmbeddedAssets = isUsingEmbeddedAssets();
        UpdatesConfiguration updatesConfiguration = this.updatesConfiguration;
        if (updatesConfiguration == null || (str = updatesConfiguration.getRuntimeVersionRaw()) == null) {
            str = DiskLruCache.VERSION;
        }
        String str2 = str;
        UpdatesConfiguration updatesConfiguration2 = this.updatesConfiguration;
        if (updatesConfiguration2 == null || (checkAutomaticallyConfiguration = updatesConfiguration2.getCheckOnLaunch()) == null) {
            checkAutomaticallyConfiguration = UpdatesConfiguration.CheckAutomaticallyConfiguration.ALWAYS;
        }
        UpdatesConfiguration.CheckAutomaticallyConfiguration checkAutomaticallyConfiguration2 = checkAutomaticallyConfiguration;
        UpdatesConfiguration updatesConfiguration3 = this.updatesConfiguration;
        if (updatesConfiguration3 == null || (emptyMap = updatesConfiguration3.getRequestHeaders()) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        return new IUpdatesController.UpdatesModuleConstants(launchedUpdate, null, null, exc, true, isUsingEmbeddedAssets, str2, checkAutomaticallyConfiguration2, emptyMap, getLocalAssetFiles(), true, new UpdatesStateContext(false, false, false, false, false, false, 0, null, null, null, null, null, 0.0d, null, 16383, null), null);
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object checkForUpdate(Continuation<? super IUpdatesController.CheckForUpdateResult> continuation) {
        throw new NotAvailableInDevClientException("Updates.checkForUpdateAsync() is not supported in development builds.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object fetchUpdate(Continuation<? super IUpdatesController.FetchUpdateResult> continuation) {
        throw new NotAvailableInDevClientException("Updates.fetchUpdateAsync() is not supported in development builds.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object getExtraParams(Continuation<? super Bundle> continuation) {
        throw new NotAvailableInDevClientException("Updates.getExtraParamsAsync() is not supported in development builds.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object setExtraParam(String str, String str2, Continuation<? super Unit> continuation) {
        throw new NotAvailableInDevClientException("Updates.setExtraParamAsync() is not supported in development builds.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public void setUpdateURLAndRequestHeadersOverride(UpdatesConfigurationOverride configOverride) {
        throw new NotAvailableInDevClientException("Updates.setUpdateURLAndRequestHeadersOverride() is not supported in development builds.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public void setUpdateRequestHeadersOverride(Map<String, String> requestHeaders) {
        throw new NotAvailableInDevClientException("Updates.setUpdateRequestHeadersOverride() is not supported in development builds.");
    }

    @Override // expo.modules.updates.IUpdatesController
    public Object relaunchReactApplicationForModule(Continuation<? super Unit> continuation) {
        UpdatesInterfaceCallbacks updatesInterfaceCallbacks;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        WeakReference<UpdatesInterfaceCallbacks> updatesInterfaceCallbacks2 = getUpdatesInterfaceCallbacks();
        if (updatesInterfaceCallbacks2 != null && (updatesInterfaceCallbacks = updatesInterfaceCallbacks2.get()) != null) {
            updatesInterfaceCallbacks.onRequestRelaunch();
        }
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuationImpl2.resumeWith(Result.m788constructorimpl(Unit.INSTANCE));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
