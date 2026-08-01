package expo.modules.updates.loader;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.util.UriUtil;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.UpdatesUtils;
import expo.modules.updates.db.DatabaseHolder;
import expo.modules.updates.db.Reaper;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.launcher.DatabaseLauncher;
import expo.modules.updates.launcher.Launcher;
import expo.modules.updates.loader.Loader;
import expo.modules.updates.loader.RemoteLoader;
import expo.modules.updates.loader.UpdateDirective;
import expo.modules.updates.loader.UpdateResponsePart;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.manifest.EmbeddedManifestUtils;
import expo.modules.updates.manifest.EmbeddedUpdate;
import expo.modules.updates.manifest.ManifestMetadata;
import expo.modules.updates.manifest.ResponseHeaderData;
import expo.modules.updates.manifest.Update;
import expo.modules.updates.selectionpolicy.SelectionPolicy;
import java.io.File;
import java.util.Date;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* compiled from: LoaderTask.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u000512345BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010#\u001a\u00020$H\u0086@¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J\u0018\u0010'\u001a\u00020$2\u000e\u0010(\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002J\u000e\u0010.\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J\u000e\u0010/\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J\b\u00100\u001a\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lexpo/modules/updates/loader/LoaderTask;", "", "context", "Landroid/content/Context;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "databaseHolder", "Lexpo/modules/updates/db/DatabaseHolder;", "directory", "Ljava/io/File;", "fileDownloader", "Lexpo/modules/updates/loader/FileDownloader;", "selectionPolicy", "Lexpo/modules/updates/selectionpolicy/SelectionPolicy;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "callback", "Lexpo/modules/updates/loader/LoaderTask$LoaderTaskCallback;", PermissionsResponse.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/db/DatabaseHolder;Ljava/io/File;Lexpo/modules/updates/loader/FileDownloader;Lexpo/modules/updates/selectionpolicy/SelectionPolicy;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/loader/LoaderTask$LoaderTaskCallback;Lkotlinx/coroutines/CoroutineScope;)V", "value", "", "isRunning", "()Z", "isReadyToLaunch", "timeoutFinished", "hasLaunched", "isUpToDate", "handlerThread", "Landroid/os/HandlerThread;", "candidateLauncher", "Lexpo/modules/updates/launcher/Launcher;", "finalizedLauncher", ViewProps.START, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchRemoteUpdate", "finish", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "maybeFinish", "stopTimer", "timeout", "launchFallbackUpdateFromDisk", "launchRemoteUpdateInBackground", "runReaper", "RemoteUpdateStatus", "RemoteCheckResultNotAvailableReason", "RemoteCheckResult", "LoaderTaskCallback", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoaderTask {
    private static final String TAG = "LoaderTask";
    private final LoaderTaskCallback callback;
    private Launcher candidateLauncher;
    private final UpdatesConfiguration configuration;
    private final Context context;
    private final DatabaseHolder databaseHolder;
    private final File directory;
    private final FileDownloader fileDownloader;
    private Launcher finalizedLauncher;
    private final HandlerThread handlerThread;
    private boolean hasLaunched;
    private boolean isReadyToLaunch;
    private boolean isRunning;
    private boolean isUpToDate;
    private final UpdatesLogger logger;
    private final CoroutineScope scope;
    private final SelectionPolicy selectionPolicy;
    private boolean timeoutFinished;

    /* compiled from: LoaderTask.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J(\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J*\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010!\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&¨\u0006\""}, d2 = {"Lexpo/modules/updates/loader/LoaderTask$LoaderTaskCallback;", "", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "launcher", "Lexpo/modules/updates/launcher/Launcher;", "isUpToDate", "", "onFinishedAllLoading", "onCachedUpdateLoaded", "update", "Lexpo/modules/updates/db/entity/UpdateEntity;", "onRemoteUpdateManifestResponseUpdateLoaded", "Lexpo/modules/updates/manifest/Update;", "onRemoteCheckForUpdateStarted", "onRemoteCheckForUpdateFinished", "result", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult;", "onRemoteUpdateLoadStarted", "onRemoteUpdateAssetLoaded", UriUtil.LOCAL_ASSET_SCHEME, "Lexpo/modules/updates/db/entity/AssetEntity;", "successfulAssetCount", "", "failedAssetCount", "totalAssetCount", "onRemoteUpdateFinished", "status", "Lexpo/modules/updates/loader/LoaderTask$RemoteUpdateStatus;", "exception", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LoaderTaskCallback {

        /* compiled from: LoaderTask.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onRemoteCheckForUpdateFinished(LoaderTaskCallback loaderTaskCallback, RemoteCheckResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
            }

            public static void onRemoteCheckForUpdateStarted(LoaderTaskCallback loaderTaskCallback) {
            }

            public static void onRemoteUpdateAssetLoaded(LoaderTaskCallback loaderTaskCallback, AssetEntity asset, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(asset, "asset");
            }

            public static void onRemoteUpdateLoadStarted(LoaderTaskCallback loaderTaskCallback) {
            }
        }

        boolean onCachedUpdateLoaded(UpdateEntity update);

        void onFailure(Exception e);

        void onFinishedAllLoading();

        void onRemoteCheckForUpdateFinished(RemoteCheckResult result);

        void onRemoteCheckForUpdateStarted();

        void onRemoteUpdateAssetLoaded(AssetEntity asset, int successfulAssetCount, int failedAssetCount, int totalAssetCount);

        void onRemoteUpdateFinished(RemoteUpdateStatus status, UpdateEntity update, Exception exception);

        void onRemoteUpdateLoadStarted();

        void onRemoteUpdateManifestResponseUpdateLoaded(Update update);

        void onSuccess(Launcher launcher, boolean isUpToDate);
    }

    public LoaderTask(Context context, UpdatesConfiguration configuration, DatabaseHolder databaseHolder, File directory, FileDownloader fileDownloader, SelectionPolicy selectionPolicy, UpdatesLogger logger, LoaderTaskCallback callback, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(databaseHolder, "databaseHolder");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(selectionPolicy, "selectionPolicy");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.context = context;
        this.configuration = configuration;
        this.databaseHolder = databaseHolder;
        this.directory = directory;
        this.fileDownloader = fileDownloader;
        this.selectionPolicy = selectionPolicy;
        this.logger = logger;
        this.callback = callback;
        this.scope = scope;
        this.handlerThread = new HandlerThread("expo-updates-timer");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LoaderTask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/updates/loader/LoaderTask$RemoteUpdateStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "NO_UPDATE_AVAILABLE", "UPDATE_AVAILABLE", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteUpdateStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RemoteUpdateStatus[] $VALUES;
        public static final RemoteUpdateStatus ERROR = new RemoteUpdateStatus("ERROR", 0);
        public static final RemoteUpdateStatus NO_UPDATE_AVAILABLE = new RemoteUpdateStatus("NO_UPDATE_AVAILABLE", 1);
        public static final RemoteUpdateStatus UPDATE_AVAILABLE = new RemoteUpdateStatus("UPDATE_AVAILABLE", 2);

        private static final /* synthetic */ RemoteUpdateStatus[] $values() {
            return new RemoteUpdateStatus[]{ERROR, NO_UPDATE_AVAILABLE, UPDATE_AVAILABLE};
        }

        public static EnumEntries<RemoteUpdateStatus> getEntries() {
            return $ENTRIES;
        }

        private RemoteUpdateStatus(String str, int i) {
        }

        static {
            RemoteUpdateStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static RemoteUpdateStatus valueOf(String str) {
            return (RemoteUpdateStatus) Enum.valueOf(RemoteUpdateStatus.class, str);
        }

        public static RemoteUpdateStatus[] values() {
            return (RemoteUpdateStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LoaderTask.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResultNotAvailableReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NO_UPDATE_AVAILABLE_ON_SERVER", "UPDATE_REJECTED_BY_SELECTION_POLICY", "UPDATE_PREVIOUSLY_FAILED", "ROLLBACK_REJECTED_BY_SELECTION_POLICY", "ROLLBACK_NO_EMBEDDED", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteCheckResultNotAvailableReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RemoteCheckResultNotAvailableReason[] $VALUES;
        private final String value;
        public static final RemoteCheckResultNotAvailableReason NO_UPDATE_AVAILABLE_ON_SERVER = new RemoteCheckResultNotAvailableReason("NO_UPDATE_AVAILABLE_ON_SERVER", 0, "noUpdateAvailableOnServer");
        public static final RemoteCheckResultNotAvailableReason UPDATE_REJECTED_BY_SELECTION_POLICY = new RemoteCheckResultNotAvailableReason("UPDATE_REJECTED_BY_SELECTION_POLICY", 1, "updateRejectedBySelectionPolicy");
        public static final RemoteCheckResultNotAvailableReason UPDATE_PREVIOUSLY_FAILED = new RemoteCheckResultNotAvailableReason("UPDATE_PREVIOUSLY_FAILED", 2, "updatePreviouslyFailed");
        public static final RemoteCheckResultNotAvailableReason ROLLBACK_REJECTED_BY_SELECTION_POLICY = new RemoteCheckResultNotAvailableReason("ROLLBACK_REJECTED_BY_SELECTION_POLICY", 3, "rollbackRejectedBySelectionPolicy");
        public static final RemoteCheckResultNotAvailableReason ROLLBACK_NO_EMBEDDED = new RemoteCheckResultNotAvailableReason("ROLLBACK_NO_EMBEDDED", 4, "rollbackNoEmbeddedConfiguration");

        private static final /* synthetic */ RemoteCheckResultNotAvailableReason[] $values() {
            return new RemoteCheckResultNotAvailableReason[]{NO_UPDATE_AVAILABLE_ON_SERVER, UPDATE_REJECTED_BY_SELECTION_POLICY, UPDATE_PREVIOUSLY_FAILED, ROLLBACK_REJECTED_BY_SELECTION_POLICY, ROLLBACK_NO_EMBEDDED};
        }

        public static EnumEntries<RemoteCheckResultNotAvailableReason> getEntries() {
            return $ENTRIES;
        }

        private RemoteCheckResultNotAvailableReason(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            RemoteCheckResultNotAvailableReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static RemoteCheckResultNotAvailableReason valueOf(String str) {
            return (RemoteCheckResultNotAvailableReason) Enum.valueOf(RemoteCheckResultNotAvailableReason.class, str);
        }

        public static RemoteCheckResultNotAvailableReason[] values() {
            return (RemoteCheckResultNotAvailableReason[]) $VALUES.clone();
        }
    }

    /* compiled from: LoaderTask.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult;", "", "status", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$Status;", "<init>", "(Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$Status;)V", "Status", "NoUpdateAvailable", "UpdateAvailable", "RollBackToEmbedded", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$NoUpdateAvailable;", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$RollBackToEmbedded;", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$UpdateAvailable;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class RemoteCheckResult {
        private final Status status;

        public /* synthetic */ RemoteCheckResult(Status status, DefaultConstructorMarker defaultConstructorMarker) {
            this(status);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LoaderTask.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$Status;", "", "<init>", "(Ljava/lang/String;I)V", "NO_UPDATE_AVAILABLE", "UPDATE_AVAILABLE", "ROLL_BACK_TO_EMBEDDED", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status NO_UPDATE_AVAILABLE = new Status("NO_UPDATE_AVAILABLE", 0);
            public static final Status UPDATE_AVAILABLE = new Status("UPDATE_AVAILABLE", 1);
            public static final Status ROLL_BACK_TO_EMBEDDED = new Status("ROLL_BACK_TO_EMBEDDED", 2);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{NO_UPDATE_AVAILABLE, UPDATE_AVAILABLE, ROLL_BACK_TO_EMBEDDED};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        private RemoteCheckResult(Status status) {
            this.status = status;
        }

        /* compiled from: LoaderTask.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$NoUpdateAvailable;", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult;", "reason", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResultNotAvailableReason;", "<init>", "(Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResultNotAvailableReason;)V", "getReason", "()Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResultNotAvailableReason;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoUpdateAvailable extends RemoteCheckResult {
            private final RemoteCheckResultNotAvailableReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoUpdateAvailable(RemoteCheckResultNotAvailableReason reason) {
                super(Status.NO_UPDATE_AVAILABLE, null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.reason = reason;
            }

            public final RemoteCheckResultNotAvailableReason getReason() {
                return this.reason;
            }
        }

        /* compiled from: LoaderTask.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$UpdateAvailable;", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult;", "manifest", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getManifest", "()Lorg/json/JSONObject;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class UpdateAvailable extends RemoteCheckResult {
            private final JSONObject manifest;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateAvailable(JSONObject manifest) {
                super(Status.UPDATE_AVAILABLE, null);
                Intrinsics.checkNotNullParameter(manifest, "manifest");
                this.manifest = manifest;
            }

            public final JSONObject getManifest() {
                return this.manifest;
            }
        }

        /* compiled from: LoaderTask.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult$RollBackToEmbedded;", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResult;", "commitTime", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getCommitTime", "()Ljava/util/Date;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RollBackToEmbedded extends RemoteCheckResult {
            private final Date commitTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RollBackToEmbedded(Date commitTime) {
                super(Status.ROLL_BACK_TO_EMBEDDED, null);
                Intrinsics.checkNotNullParameter(commitTime, "commitTime");
                this.commitTime = commitTime;
            }

            public final Date getCommitTime() {
                return this.commitTime;
            }
        }
    }

    /* renamed from: isRunning, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(10:5|6|7|(1:(4:(1:(1:(5:13|14|15|16|17)(2:19|20))(1:21))(1:23)|22|16|17)(2:24|25))(4:47|(1:54)(1:50)|51|(2:53|33))|26|(2:28|(4:30|(2:32|33)|16|17))|ca|(2:39|(2:41|33))(1:42)|16|17))|61|6|7|(0)(0)|26|(0)|ca) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0051, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ee, code lost:
    
        if (r2 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f0, code lost:
    
        finish(r13);
        r12.isRunning = false;
        r12.callback.onFinishedAllLoading();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
    
        r0.L$0 = r13;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        if (launchRemoteUpdate(r0) != r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0106, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:22:0x0043, B:25:0x004d, B:26:0x009a, B:28:0x00a5, B:30:0x00b9, B:34:0x00ca, B:37:0x00d2, B:39:0x00d5, B:42:0x00e0, B:45:0x00ec, B:46:0x00ed, B:51:0x008f, B:36:0x00cb), top: B:7:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v0, types: [expo.modules.updates.loader.LoaderTask] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object start(Continuation<? super Unit> continuation) {
        LoaderTask$start$1 loaderTask$start$1;
        ?? r2;
        Launcher launcher;
        if (continuation instanceof LoaderTask$start$1) {
            loaderTask$start$1 = (LoaderTask$start$1) continuation;
            if ((loaderTask$start$1.label & Integer.MIN_VALUE) != 0) {
                loaderTask$start$1.label -= Integer.MIN_VALUE;
                Object obj = loaderTask$start$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = loaderTask$start$1.label;
                if (r2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.isRunning = true;
                    boolean shouldCheckForUpdateOnLaunch = UpdatesUtils.INSTANCE.shouldCheckForUpdateOnLaunch(this.configuration, this.logger, this.context);
                    int launchWaitMs = this.configuration.getLaunchWaitMs();
                    if (launchWaitMs > 0 && shouldCheckForUpdateOnLaunch) {
                        this.handlerThread.start();
                        Boxing.boxBoolean(new Handler(this.handlerThread.getLooper()).postDelayed(new Runnable() { // from class: expo.modules.updates.loader.LoaderTask$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                LoaderTask.this.timeout();
                            }
                        }, launchWaitMs));
                    } else {
                        this.timeoutFinished = true;
                    }
                    loaderTask$start$1.Z$0 = shouldCheckForUpdateOnLaunch;
                    loaderTask$start$1.label = 1;
                    r2 = shouldCheckForUpdateOnLaunch;
                    if (launchFallbackUpdateFromDisk(loaderTask$start$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 == 2) {
                            boolean z = loaderTask$start$1.Z$0;
                        } else {
                            if (r2 != 3) {
                                if (r2 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Exception exc = (Exception) loaderTask$start$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                e = exc;
                                this.logger.error("Failed to launch embedded or launchable update", e, UpdatesErrorCode.UpdateFailedToLoad);
                                return Unit.INSTANCE;
                            }
                            boolean z2 = loaderTask$start$1.Z$0;
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    boolean z3 = loaderTask$start$1.Z$0;
                    ResultKt.throwOnFailure(obj);
                    r2 = z3;
                }
                launcher = this.candidateLauncher;
                Intrinsics.checkNotNull(launcher);
                if (launcher.getLaunchedUpdate() != null) {
                    LoaderTaskCallback loaderTaskCallback = this.callback;
                    Launcher launcher2 = this.candidateLauncher;
                    Intrinsics.checkNotNull(launcher2);
                    UpdateEntity launchedUpdate = launcher2.getLaunchedUpdate();
                    Intrinsics.checkNotNull(launchedUpdate);
                    if (!loaderTaskCallback.onCachedUpdateLoaded(launchedUpdate)) {
                        stopTimer();
                        this.candidateLauncher = null;
                        loaderTask$start$1.Z$0 = r2;
                        loaderTask$start$1.label = 2;
                        if (launchRemoteUpdate(loaderTask$start$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                synchronized (this) {
                    this.isReadyToLaunch = true;
                    maybeFinish();
                    Unit unit = Unit.INSTANCE;
                }
                if (r2 != 0) {
                    loaderTask$start$1.Z$0 = r2;
                    loaderTask$start$1.label = 3;
                    if (launchRemoteUpdate(loaderTask$start$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.isRunning = false;
                    runReaper();
                    this.callback.onFinishedAllLoading();
                }
                return Unit.INSTANCE;
            }
        }
        loaderTask$start$1 = new LoaderTask$start$1(this, continuation);
        Object obj2 = loaderTask$start$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = loaderTask$start$1.label;
        if (r2 != 0) {
        }
        launcher = this.candidateLauncher;
        Intrinsics.checkNotNull(launcher);
        if (launcher.getLaunchedUpdate() != null) {
        }
        synchronized (this) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|41|15|16|17))|31|6|7|(0)(0)|41) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        finish(r6);
        r5.isRunning = false;
        runReaper();
        r5.callback.onFinishedAllLoading();
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchRemoteUpdate(Continuation<? super Unit> continuation) {
        LoaderTask$launchRemoteUpdate$1 loaderTask$launchRemoteUpdate$1;
        int i;
        if (continuation instanceof LoaderTask$launchRemoteUpdate$1) {
            loaderTask$launchRemoteUpdate$1 = (LoaderTask$launchRemoteUpdate$1) continuation;
            if ((loaderTask$launchRemoteUpdate$1.label & Integer.MIN_VALUE) != 0) {
                loaderTask$launchRemoteUpdate$1.label -= Integer.MIN_VALUE;
                Object obj = loaderTask$launchRemoteUpdate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loaderTask$launchRemoteUpdate$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    loaderTask$launchRemoteUpdate$1.label = 1;
                    if (launchRemoteUpdateInBackground(loaderTask$launchRemoteUpdate$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                synchronized (this) {
                    this.isReadyToLaunch = true;
                    Unit unit = Unit.INSTANCE;
                }
                finish(null);
                this.isRunning = false;
                runReaper();
                this.callback.onFinishedAllLoading();
                return Unit.INSTANCE;
            }
        }
        loaderTask$launchRemoteUpdate$1 = new LoaderTask$launchRemoteUpdate$1(this, continuation);
        Object obj2 = loaderTask$launchRemoteUpdate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loaderTask$launchRemoteUpdate$1.label;
        if (i != 0) {
        }
        synchronized (this) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x004f, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0008, B:12:0x0014, B:15:0x001e, B:16:0x003b, B:18:0x003f, B:20:0x0044, B:24:0x002b, B:26:0x002f, B:27:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0008, B:12:0x0014, B:15:0x001e, B:16:0x003b, B:18:0x003f, B:20:0x0044, B:24:0x002b, B:26:0x002f, B:27:0x0038), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void finish(Exception e) {
        if (this.hasLaunched) {
            return;
        }
        this.hasLaunched = true;
        Launcher launcher = this.candidateLauncher;
        this.finalizedLauncher = launcher;
        if (this.isReadyToLaunch && launcher != null) {
            Intrinsics.checkNotNull(launcher);
            if (launcher.getLaunchedUpdate() != null) {
                LoaderTaskCallback loaderTaskCallback = this.callback;
                Launcher launcher2 = this.finalizedLauncher;
                Intrinsics.checkNotNull(launcher2);
                loaderTaskCallback.onSuccess(launcher2, this.isUpToDate);
                if (!this.timeoutFinished) {
                    stopTimer();
                }
                if (e != null) {
                    this.logger.error("Unexpected error encountered while loading this app", e, UpdatesErrorCode.Unknown);
                }
            }
        }
        this.callback.onFailure(e == null ? new Exception("LoaderTask encountered an unexpected error and could not launch an update.") : e);
        if (!this.timeoutFinished) {
        }
        if (e != null) {
        }
    }

    private final synchronized void maybeFinish() {
        if (this.isReadyToLaunch && this.timeoutFinished) {
            finish(null);
        }
    }

    private final synchronized void stopTimer() {
        this.timeoutFinished = true;
        this.handlerThread.quitSafely();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void timeout() {
        if (!this.timeoutFinished) {
            this.timeoutFinished = true;
            maybeFinish();
        }
        stopTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0118, code lost:
    
        if (r4.launch(r5, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012b, code lost:
    
        if (r5.launch(r15, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (r11.launch(r0, r2) == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchFallbackUpdateFromDisk(Continuation<? super Unit> continuation) {
        LoaderTask$launchFallbackUpdateFromDisk$1 loaderTask$launchFallbackUpdateFromDisk$1;
        int i;
        UpdateEntity updateEntity;
        UpdatesDatabase updatesDatabase;
        DatabaseLauncher databaseLauncher;
        DatabaseLauncher databaseLauncher2;
        UpdatesDatabase updatesDatabase2;
        EmbeddedLoader embeddedLoader;
        Function1<? super UpdateResponse, Loader.OnUpdateResponseLoadedResult> function1;
        if (continuation instanceof LoaderTask$launchFallbackUpdateFromDisk$1) {
            loaderTask$launchFallbackUpdateFromDisk$1 = (LoaderTask$launchFallbackUpdateFromDisk$1) continuation;
            if ((loaderTask$launchFallbackUpdateFromDisk$1.label & Integer.MIN_VALUE) != 0) {
                loaderTask$launchFallbackUpdateFromDisk$1.label -= Integer.MIN_VALUE;
                Object obj = loaderTask$launchFallbackUpdateFromDisk$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loaderTask$launchFallbackUpdateFromDisk$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UpdatesDatabase database = this.databaseHolder.getDatabase();
                    DatabaseLauncher databaseLauncher3 = new DatabaseLauncher(this.context, this.configuration, this.directory, this.fileDownloader, this.selectionPolicy, this.logger, this.scope, false, 128, null);
                    this.candidateLauncher = databaseLauncher3;
                    if (this.configuration.getHasEmbeddedUpdate()) {
                        EmbeddedUpdate embeddedUpdate = EmbeddedManifestUtils.INSTANCE.getEmbeddedUpdate(this.context, this.configuration);
                        Intrinsics.checkNotNull(embeddedUpdate);
                        updateEntity = embeddedUpdate.getUpdateEntity();
                        loaderTask$launchFallbackUpdateFromDisk$1.L$0 = database;
                        loaderTask$launchFallbackUpdateFromDisk$1.L$1 = databaseLauncher3;
                        loaderTask$launchFallbackUpdateFromDisk$1.L$2 = updateEntity;
                        loaderTask$launchFallbackUpdateFromDisk$1.label = 1;
                        Object launchableUpdate = databaseLauncher3.getLaunchableUpdate(database, loaderTask$launchFallbackUpdateFromDisk$1);
                        if (launchableUpdate != coroutine_suspended) {
                            updatesDatabase = database;
                            obj = launchableUpdate;
                            databaseLauncher = databaseLauncher3;
                            if (!this.selectionPolicy.shouldLoadNewUpdate(updateEntity, (UpdateEntity) obj, ManifestMetadata.INSTANCE.getManifestFilters(updatesDatabase, this.configuration))) {
                            }
                        }
                    } else {
                        loaderTask$launchFallbackUpdateFromDisk$1.label = 5;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    updateEntity = (UpdateEntity) loaderTask$launchFallbackUpdateFromDisk$1.L$2;
                    databaseLauncher = (DatabaseLauncher) loaderTask$launchFallbackUpdateFromDisk$1.L$1;
                    UpdatesDatabase updatesDatabase3 = (UpdatesDatabase) loaderTask$launchFallbackUpdateFromDisk$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    updatesDatabase = updatesDatabase3;
                    if (!this.selectionPolicy.shouldLoadNewUpdate(updateEntity, (UpdateEntity) obj, ManifestMetadata.INSTANCE.getManifestFilters(updatesDatabase, this.configuration))) {
                        try {
                            embeddedLoader = new EmbeddedLoader(this.context, this.configuration, this.logger, updatesDatabase, this.directory);
                            function1 = new Function1() { // from class: expo.modules.updates.loader.LoaderTask$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Loader.OnUpdateResponseLoadedResult launchFallbackUpdateFromDisk$lambda$3;
                                    launchFallbackUpdateFromDisk$lambda$3 = LoaderTask.launchFallbackUpdateFromDisk$lambda$3((UpdateResponse) obj2);
                                    return launchFallbackUpdateFromDisk$lambda$3;
                                }
                            };
                            loaderTask$launchFallbackUpdateFromDisk$1.L$0 = updatesDatabase;
                            loaderTask$launchFallbackUpdateFromDisk$1.L$1 = databaseLauncher;
                            loaderTask$launchFallbackUpdateFromDisk$1.L$2 = null;
                            loaderTask$launchFallbackUpdateFromDisk$1.label = 2;
                        } catch (Exception e) {
                            e = e;
                            databaseLauncher2 = databaseLauncher;
                            updatesDatabase2 = updatesDatabase;
                            this.logger.error("Unexpected error copying embedded update", e, UpdatesErrorCode.Unknown);
                            loaderTask$launchFallbackUpdateFromDisk$1.L$0 = null;
                            loaderTask$launchFallbackUpdateFromDisk$1.L$1 = null;
                            loaderTask$launchFallbackUpdateFromDisk$1.L$2 = null;
                            loaderTask$launchFallbackUpdateFromDisk$1.label = 3;
                        }
                        if (embeddedLoader.load(function1, loaderTask$launchFallbackUpdateFromDisk$1) != coroutine_suspended) {
                            databaseLauncher2 = databaseLauncher;
                            updatesDatabase2 = updatesDatabase;
                            loaderTask$launchFallbackUpdateFromDisk$1.L$0 = null;
                            loaderTask$launchFallbackUpdateFromDisk$1.L$1 = null;
                            loaderTask$launchFallbackUpdateFromDisk$1.L$2 = null;
                            loaderTask$launchFallbackUpdateFromDisk$1.label = 3;
                        }
                    } else {
                        loaderTask$launchFallbackUpdateFromDisk$1.L$0 = null;
                        loaderTask$launchFallbackUpdateFromDisk$1.L$1 = null;
                        loaderTask$launchFallbackUpdateFromDisk$1.L$2 = null;
                        loaderTask$launchFallbackUpdateFromDisk$1.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    databaseLauncher2 = (DatabaseLauncher) loaderTask$launchFallbackUpdateFromDisk$1.L$1;
                    updatesDatabase2 = (UpdatesDatabase) loaderTask$launchFallbackUpdateFromDisk$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        this.logger.error("Unexpected error copying embedded update", e, UpdatesErrorCode.Unknown);
                        loaderTask$launchFallbackUpdateFromDisk$1.L$0 = null;
                        loaderTask$launchFallbackUpdateFromDisk$1.L$1 = null;
                        loaderTask$launchFallbackUpdateFromDisk$1.L$2 = null;
                        loaderTask$launchFallbackUpdateFromDisk$1.label = 3;
                    }
                    loaderTask$launchFallbackUpdateFromDisk$1.L$0 = null;
                    loaderTask$launchFallbackUpdateFromDisk$1.L$1 = null;
                    loaderTask$launchFallbackUpdateFromDisk$1.L$2 = null;
                    loaderTask$launchFallbackUpdateFromDisk$1.label = 3;
                } else {
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
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        loaderTask$launchFallbackUpdateFromDisk$1 = new LoaderTask$launchFallbackUpdateFromDisk$1(this, continuation);
        Object obj2 = loaderTask$launchFallbackUpdateFromDisk$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loaderTask$launchFallbackUpdateFromDisk$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Loader.OnUpdateResponseLoadedResult launchFallbackUpdateFromDisk$lambda$3(UpdateResponse updateResponse) {
        Intrinsics.checkNotNullParameter(updateResponse, "<unused var>");
        return new Loader.OnUpdateResponseLoadedResult(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00cf, code lost:
    
        if (r0 == r2) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e1 A[Catch: all -> 0x0201, TryCatch #13 {all -> 0x0201, blocks: (B:16:0x014f, B:22:0x015c, B:24:0x015f, B:28:0x0167, B:31:0x0175, B:32:0x0176, B:36:0x0178, B:37:0x0188, B:53:0x010f, B:56:0x013e, B:40:0x01db, B:42:0x01e1, B:45:0x0200, B:46:0x01f0), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v44, types: [expo.modules.updates.loader.LoaderTask$LoaderTaskCallback] */
    /* JADX WARN: Type inference failed for: r0v46, types: [expo.modules.updates.loader.LoaderTask$LoaderTaskCallback] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v27, types: [expo.modules.updates.db.entity.UpdateEntity, java.lang.Exception, java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchRemoteUpdateInBackground(Continuation<? super Unit> continuation) {
        LoaderTask$launchRemoteUpdateInBackground$1 loaderTask$launchRemoteUpdateInBackground$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        ?? r14;
        UpdateEntity updateEntity;
        Job job;
        String message;
        UpdatesDatabase updatesDatabase;
        Job launch$default;
        Job job2;
        Job job3;
        Launcher launcher;
        UpdateEntity launchedUpdate;
        UpdatesDatabase updatesDatabase2;
        Job job4;
        UpdateEntity availableUpdate;
        DatabaseLauncher databaseLauncher;
        UpdateEntity updateEntity2;
        DatabaseLauncher databaseLauncher2;
        ?? r142;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (continuation instanceof LoaderTask$launchRemoteUpdateInBackground$1) {
                                                        loaderTask$launchRemoteUpdateInBackground$1 = (LoaderTask$launchRemoteUpdateInBackground$1) continuation;
                                                        if ((loaderTask$launchRemoteUpdateInBackground$1.label & Integer.MIN_VALUE) != 0) {
                                                            loaderTask$launchRemoteUpdateInBackground$1.label -= Integer.MIN_VALUE;
                                                            LoaderTask$launchRemoteUpdateInBackground$1 loaderTask$launchRemoteUpdateInBackground$12 = loaderTask$launchRemoteUpdateInBackground$1;
                                                            obj = loaderTask$launchRemoteUpdateInBackground$12.result;
                                                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            i = loaderTask$launchRemoteUpdateInBackground$12.label;
                                                            r14 = 2;
                                                            if (i != 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                UpdatesDatabase database = this.databaseHolder.getDatabase();
                                                                this.callback.onRemoteCheckForUpdateStarted();
                                                                Context context = this.context;
                                                                UpdatesConfiguration updatesConfiguration = this.configuration;
                                                                UpdatesLogger updatesLogger = this.logger;
                                                                FileDownloader fileDownloader = this.fileDownloader;
                                                                File file = this.directory;
                                                                Launcher launcher2 = this.candidateLauncher;
                                                                RemoteLoader remoteLoader = new RemoteLoader(context, updatesConfiguration, updatesLogger, database, fileDownloader, file, launcher2 != null ? launcher2.getLaunchedUpdate() : null);
                                                                updatesDatabase = database;
                                                                launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LoaderTask$launchRemoteUpdateInBackground$progressJob$1(remoteLoader, this, null), 3, null);
                                                                Function1<? super UpdateResponse, Loader.OnUpdateResponseLoadedResult> function1 = new Function1() { // from class: expo.modules.updates.loader.LoaderTask$$ExternalSyntheticLambda0
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj2) {
                                                                        Loader.OnUpdateResponseLoadedResult launchRemoteUpdateInBackground$lambda$4;
                                                                        launchRemoteUpdateInBackground$lambda$4 = LoaderTask.launchRemoteUpdateInBackground$lambda$4(LoaderTask.this, (UpdateResponse) obj2);
                                                                        return launchRemoteUpdateInBackground$lambda$4;
                                                                    }
                                                                };
                                                                loaderTask$launchRemoteUpdateInBackground$12.L$0 = updatesDatabase;
                                                                loaderTask$launchRemoteUpdateInBackground$12.L$1 = launch$default;
                                                                loaderTask$launchRemoteUpdateInBackground$12.label = 1;
                                                                obj = remoteLoader.load(function1, loaderTask$launchRemoteUpdateInBackground$12);
                                                            } else {
                                                                if (i != 1) {
                                                                    if (i != 2) {
                                                                        if (i != 3) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        databaseLauncher2 = (DatabaseLauncher) loaderTask$launchRemoteUpdateInBackground$12.L$2;
                                                                        updateEntity2 = (UpdateEntity) loaderTask$launchRemoteUpdateInBackground$12.L$1;
                                                                        job4 = (Job) loaderTask$launchRemoteUpdateInBackground$12.L$0;
                                                                        try {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            r142 = 0;
                                                                            synchronized (this) {
                                                                                if (!this.hasLaunched) {
                                                                                    this.candidateLauncher = databaseLauncher2;
                                                                                    this.isUpToDate = true;
                                                                                }
                                                                                Unit unit = Unit.INSTANCE;
                                                                            }
                                                                            if (updateEntity2 == null) {
                                                                                this.callback.onRemoteUpdateFinished(RemoteUpdateStatus.NO_UPDATE_AVAILABLE, r142, r142);
                                                                            } else {
                                                                                this.callback.onRemoteUpdateFinished(RemoteUpdateStatus.UPDATE_AVAILABLE, updateEntity2, r142);
                                                                            }
                                                                            Job.DefaultImpls.cancel$default(job4, (CancellationException) r142, 1, (Object) r142);
                                                                            return Unit.INSTANCE;
                                                                        } catch (Exception e) {
                                                                            e = e;
                                                                            updateEntity = null;
                                                                            this.callback.onRemoteUpdateFinished(RemoteUpdateStatus.ERROR, updateEntity, e);
                                                                            this.logger.error("Loaded new update but it failed to launch", e, UpdatesErrorCode.UpdateFailedToLoad);
                                                                            throw e;
                                                                        }
                                                                    }
                                                                    job4 = (Job) loaderTask$launchRemoteUpdateInBackground$12.L$1;
                                                                    updatesDatabase2 = (UpdatesDatabase) loaderTask$launchRemoteUpdateInBackground$12.L$0;
                                                                    ResultKt.throwOnFailure(obj);
                                                                    updateEntity = null;
                                                                    try {
                                                                        availableUpdate = ((ProcessSuccessLoaderResult) obj).getAvailableUpdate();
                                                                        databaseLauncher = new DatabaseLauncher(this.context, this.configuration, this.directory, this.fileDownloader, this.selectionPolicy, this.logger, this.scope, false, 128, null);
                                                                        try {
                                                                            loaderTask$launchRemoteUpdateInBackground$12.L$0 = job4;
                                                                            loaderTask$launchRemoteUpdateInBackground$12.L$1 = availableUpdate;
                                                                            loaderTask$launchRemoteUpdateInBackground$12.L$2 = databaseLauncher;
                                                                            loaderTask$launchRemoteUpdateInBackground$12.label = 3;
                                                                            if (databaseLauncher.launch(updatesDatabase2, loaderTask$launchRemoteUpdateInBackground$12) != coroutine_suspended) {
                                                                                updateEntity2 = availableUpdate;
                                                                                databaseLauncher2 = databaseLauncher;
                                                                                r142 = updateEntity;
                                                                                synchronized (this) {
                                                                                }
                                                                            }
                                                                            return coroutine_suspended;
                                                                        } catch (Exception e2) {
                                                                            e = e2;
                                                                            this.callback.onRemoteUpdateFinished(RemoteUpdateStatus.ERROR, updateEntity, e);
                                                                            this.logger.error("Loaded new update but it failed to launch", e, UpdatesErrorCode.UpdateFailedToLoad);
                                                                            throw e;
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        message = e.getMessage();
                                                                        if (message != null || !StringsKt.contains$default((CharSequence) message, (CharSequence) "Loaded new update but it failed to launch", false, 2, (Object) updateEntity)) {
                                                                            this.callback.onRemoteUpdateFinished(RemoteUpdateStatus.ERROR, updateEntity, e);
                                                                            this.logger.error("Failed to download remote update", e, UpdatesErrorCode.UpdateFailedToLoad);
                                                                        }
                                                                        throw e;
                                                                    }
                                                                }
                                                                launch$default = (Job) loaderTask$launchRemoteUpdateInBackground$12.L$1;
                                                                updatesDatabase = (UpdatesDatabase) loaderTask$launchRemoteUpdateInBackground$12.L$0;
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            UpdatesDatabase updatesDatabase3 = updatesDatabase;
                                                            job2 = launch$default;
                                                            Loader.LoaderResult loaderResult = (Loader.LoaderResult) obj;
                                                            RemoteLoader.Companion companion = RemoteLoader.INSTANCE;
                                                            Context context2 = this.context;
                                                            UpdatesConfiguration updatesConfiguration2 = this.configuration;
                                                            UpdatesLogger updatesLogger2 = this.logger;
                                                            SelectionPolicy selectionPolicy = this.selectionPolicy;
                                                            File file2 = this.directory;
                                                            launcher = this.candidateLauncher;
                                                            if (launcher == null) {
                                                                try {
                                                                    launchedUpdate = launcher.getLaunchedUpdate();
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    updateEntity = null;
                                                                    message = e.getMessage();
                                                                    if (message != null) {
                                                                    }
                                                                    this.callback.onRemoteUpdateFinished(RemoteUpdateStatus.ERROR, updateEntity, e);
                                                                    this.logger.error("Failed to download remote update", e, UpdatesErrorCode.UpdateFailedToLoad);
                                                                    throw e;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    job = job2;
                                                                    r14 = 0;
                                                                    Job.DefaultImpls.cancel$default(job, (CancellationException) r14, 1, (Object) r14);
                                                                    throw th;
                                                                }
                                                            } else {
                                                                launchedUpdate = null;
                                                            }
                                                            loaderTask$launchRemoteUpdateInBackground$12.L$0 = updatesDatabase3;
                                                            loaderTask$launchRemoteUpdateInBackground$12.L$1 = job2;
                                                            loaderTask$launchRemoteUpdateInBackground$12.label = 2;
                                                            job3 = job2;
                                                            r14 = 0;
                                                            updateEntity = null;
                                                            updateEntity = null;
                                                            obj = companion.processSuccessLoaderResult(context2, updatesConfiguration2, updatesLogger2, updatesDatabase3, selectionPolicy, file2, launchedUpdate, loaderResult, loaderTask$launchRemoteUpdateInBackground$12);
                                                            if (obj != coroutine_suspended) {
                                                                updatesDatabase2 = updatesDatabase3;
                                                                job4 = job3;
                                                                availableUpdate = ((ProcessSuccessLoaderResult) obj).getAvailableUpdate();
                                                                databaseLauncher = new DatabaseLauncher(this.context, this.configuration, this.directory, this.fileDownloader, this.selectionPolicy, this.logger, this.scope, false, 128, null);
                                                                loaderTask$launchRemoteUpdateInBackground$12.L$0 = job4;
                                                                loaderTask$launchRemoteUpdateInBackground$12.L$1 = availableUpdate;
                                                                loaderTask$launchRemoteUpdateInBackground$12.L$2 = databaseLauncher;
                                                                loaderTask$launchRemoteUpdateInBackground$12.label = 3;
                                                                if (databaseLauncher.launch(updatesDatabase2, loaderTask$launchRemoteUpdateInBackground$12) != coroutine_suspended) {
                                                                }
                                                            }
                                                            return coroutine_suspended;
                                                        }
                                                    }
                                                    obj = companion.processSuccessLoaderResult(context2, updatesConfiguration2, updatesLogger2, updatesDatabase3, selectionPolicy, file2, launchedUpdate, loaderResult, loaderTask$launchRemoteUpdateInBackground$12);
                                                    if (obj != coroutine_suspended) {
                                                    }
                                                    return coroutine_suspended;
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    message = e.getMessage();
                                                    if (message != null) {
                                                    }
                                                    this.callback.onRemoteUpdateFinished(RemoteUpdateStatus.ERROR, updateEntity, e);
                                                    this.logger.error("Failed to download remote update", e, UpdatesErrorCode.UpdateFailedToLoad);
                                                    throw e;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    job = job3;
                                                    Job.DefaultImpls.cancel$default(job, (CancellationException) r14, 1, (Object) r14);
                                                    throw th;
                                                }
                                                launcher = this.candidateLauncher;
                                                if (launcher == null) {
                                                }
                                                loaderTask$launchRemoteUpdateInBackground$12.L$0 = updatesDatabase3;
                                                loaderTask$launchRemoteUpdateInBackground$12.L$1 = job2;
                                                loaderTask$launchRemoteUpdateInBackground$12.label = 2;
                                                job3 = job2;
                                                r14 = 0;
                                                updateEntity = null;
                                                updateEntity = null;
                                            } catch (Exception e6) {
                                                e = e6;
                                                job3 = job2;
                                                updateEntity = null;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                job3 = job2;
                                                r14 = 0;
                                            }
                                            File file22 = this.directory;
                                        } catch (Exception e7) {
                                            e = e7;
                                            job3 = job2;
                                            updateEntity = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            job3 = job2;
                                            r14 = 0;
                                        }
                                        SelectionPolicy selectionPolicy2 = this.selectionPolicy;
                                    } catch (Exception e8) {
                                        e = e8;
                                        job3 = job2;
                                        updateEntity = null;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        job3 = job2;
                                        r14 = 0;
                                    }
                                    UpdatesLogger updatesLogger22 = this.logger;
                                } catch (Exception e9) {
                                    e = e9;
                                    job3 = job2;
                                    updateEntity = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    job3 = job2;
                                    r14 = 0;
                                }
                                UpdatesConfiguration updatesConfiguration22 = this.configuration;
                            } catch (Exception e10) {
                                e = e10;
                                job3 = job2;
                                updateEntity = null;
                            } catch (Throwable th7) {
                                th = th7;
                                job3 = job2;
                                r14 = 0;
                            }
                            Context context22 = this.context;
                        } catch (Exception e11) {
                            e = e11;
                            job3 = job2;
                            updateEntity = null;
                        } catch (Throwable th8) {
                            th = th8;
                            job3 = job2;
                            r14 = 0;
                        }
                        Loader.LoaderResult loaderResult2 = (Loader.LoaderResult) obj;
                        RemoteLoader.Companion companion2 = RemoteLoader.INSTANCE;
                    } catch (Exception e12) {
                        e = e12;
                        job3 = job2;
                        updateEntity = null;
                    } catch (Throwable th9) {
                        th = th9;
                        job3 = job2;
                        r14 = 0;
                    }
                    if (i != 0) {
                    }
                    UpdatesDatabase updatesDatabase32 = updatesDatabase;
                    job2 = launch$default;
                } catch (Exception e13) {
                    e = e13;
                    updateEntity = null;
                }
            } catch (Throwable th10) {
                th = th10;
                r14 = 0;
            }
        } catch (Throwable th11) {
            th = th11;
        }
        loaderTask$launchRemoteUpdateInBackground$1 = new LoaderTask$launchRemoteUpdateInBackground$1(this, continuation);
        LoaderTask$launchRemoteUpdateInBackground$1 loaderTask$launchRemoteUpdateInBackground$122 = loaderTask$launchRemoteUpdateInBackground$1;
        obj = loaderTask$launchRemoteUpdateInBackground$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loaderTask$launchRemoteUpdateInBackground$122.label;
        r14 = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Loader.OnUpdateResponseLoadedResult launchRemoteUpdateInBackground$lambda$4(LoaderTask loaderTask, UpdateResponse updateResponse) {
        Intrinsics.checkNotNullParameter(updateResponse, "updateResponse");
        UpdateResponsePart.DirectiveUpdateResponsePart directiveUpdateResponsePart = updateResponse.getDirectiveUpdateResponsePart();
        UpdateDirective updateDirective = directiveUpdateResponsePart != null ? directiveUpdateResponsePart.getUpdateDirective() : null;
        if (updateDirective != null) {
            if (updateDirective instanceof UpdateDirective.RollBackToEmbeddedUpdateDirective) {
                loaderTask.isUpToDate = true;
                loaderTask.callback.onRemoteCheckForUpdateFinished(new RemoteCheckResult.RollBackToEmbedded(((UpdateDirective.RollBackToEmbeddedUpdateDirective) updateDirective).getCommitTime()));
                return new Loader.OnUpdateResponseLoadedResult(false);
            }
            if (!(updateDirective instanceof UpdateDirective.NoUpdateAvailableUpdateDirective)) {
                throw new NoWhenBranchMatchedException();
            }
            loaderTask.isUpToDate = true;
            loaderTask.callback.onRemoteCheckForUpdateFinished(new RemoteCheckResult.NoUpdateAvailable(RemoteCheckResultNotAvailableReason.NO_UPDATE_AVAILABLE_ON_SERVER));
            return new Loader.OnUpdateResponseLoadedResult(false);
        }
        UpdateResponsePart.ManifestUpdateResponsePart manifestUpdateResponsePart = updateResponse.getManifestUpdateResponsePart();
        Update update = manifestUpdateResponsePart != null ? manifestUpdateResponsePart.getUpdate() : null;
        if (update == null) {
            loaderTask.isUpToDate = true;
            loaderTask.callback.onRemoteCheckForUpdateFinished(new RemoteCheckResult.NoUpdateAvailable(RemoteCheckResultNotAvailableReason.NO_UPDATE_AVAILABLE_ON_SERVER));
            return new Loader.OnUpdateResponseLoadedResult(false);
        }
        SelectionPolicy selectionPolicy = loaderTask.selectionPolicy;
        UpdateEntity updateEntity = update.getUpdateEntity();
        Launcher launcher = loaderTask.candidateLauncher;
        UpdateEntity launchedUpdate = launcher != null ? launcher.getLaunchedUpdate() : null;
        ResponseHeaderData responseHeaderData = updateResponse.getResponseHeaderData();
        if (selectionPolicy.shouldLoadNewUpdate(updateEntity, launchedUpdate, responseHeaderData != null ? responseHeaderData.getManifestFilters() : null)) {
            loaderTask.isUpToDate = false;
            loaderTask.callback.onRemoteUpdateManifestResponseUpdateLoaded(update);
            loaderTask.callback.onRemoteCheckForUpdateFinished(new RemoteCheckResult.UpdateAvailable(update.getManifest().getRawJson()));
            loaderTask.callback.onRemoteUpdateLoadStarted();
            return new Loader.OnUpdateResponseLoadedResult(true);
        }
        loaderTask.isUpToDate = true;
        loaderTask.callback.onRemoteCheckForUpdateFinished(new RemoteCheckResult.NoUpdateAvailable(RemoteCheckResultNotAvailableReason.UPDATE_REJECTED_BY_SELECTION_POLICY));
        return new Loader.OnUpdateResponseLoadedResult(false);
    }

    private final void runReaper() {
        synchronized (this) {
            Launcher launcher = this.finalizedLauncher;
            UpdateEntity launchedUpdate = launcher != null ? launcher.getLaunchedUpdate() : null;
            if (launchedUpdate != null) {
                Reaper.reapUnusedUpdates(this.configuration, this.databaseHolder.getDatabase(), this.directory, launchedUpdate, this.selectionPolicy);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
