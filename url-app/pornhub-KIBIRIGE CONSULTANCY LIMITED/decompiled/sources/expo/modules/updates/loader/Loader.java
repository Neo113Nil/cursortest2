package expo.modules.updates.loader;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.UpdatesUtils;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.dao.AssetDao;
import expo.modules.updates.db.dao.UpdateDao;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.db.enums.UpdateStatus;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.UpdateResponsePart;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.manifest.ManifestMetadata;
import expo.modules.updates.manifest.ResponseHeaderData;
import expo.modules.updates.manifest.Update;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: Loader.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 R2\u00020\u0001:\u0005NOPQRBC\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020&J\b\u00105\u001a\u00020)H\u0002J\u001e\u00106\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H¤@¢\u0006\u0002\u00107J<\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u00192\b\u0010<\u001a\u0004\u0018\u00010\u0019H¤@¢\u0006\u0002\u0010=J\"\u0010>\u001a\u00020?2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020A0(H\u0086@¢\u0006\u0002\u0010BJ\b\u0010C\u001a\u00020)H\u0002J\b\u0010D\u001a\u00020?H\u0002J\u0016\u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00020GH\u0082@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020?2\u0006\u0010F\u001a\u00020GH\u0082@¢\u0006\u0002\u0010HJ\u001e\u0010J\u001a\u00020K2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010L\u001a\u00020KH\u0082@¢\u0006\u0002\u0010MR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020&0%X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020)\u0018\u00010(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020#0/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006S"}, d2 = {"Lexpo/modules/updates/loader/Loader;", "", "context", "Landroid/content/Context;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "database", "Lexpo/modules/updates/db/UpdatesDatabase;", "updatesDirectory", "Ljava/io/File;", "loaderFiles", "Lexpo/modules/updates/loader/LoaderFiles;", PermissionsResponse.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lexpo/modules/updates/loader/LoaderFiles;Lkotlinx/coroutines/CoroutineScope;)V", "getContext", "()Landroid/content/Context;", "getLogger", "()Lexpo/modules/updates/logging/UpdatesLogger;", "updateResponse", "Lexpo/modules/updates/loader/UpdateResponse;", "updateEntity", "Lexpo/modules/updates/db/entity/UpdateEntity;", "assetTotal", "", "erroredAssetList", "", "Lexpo/modules/updates/db/entity/AssetEntity;", "existingAssetList", "finishedAssetList", "_progressFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lexpo/modules/updates/loader/Loader$AssetLoadProgress;", "assetProgressMap", "", "", "assetLoadProgressBlock", "Lkotlin/Function1;", "", "getAssetLoadProgressBlock$expo_updates_release", "()Lkotlin/jvm/functions/Function1;", "setAssetLoadProgressBlock$expo_updates_release", "(Lkotlin/jvm/functions/Function1;)V", "progressFlow", "Lkotlinx/coroutines/flow/Flow;", "getProgressFlow", "()Lkotlinx/coroutines/flow/Flow;", "assetLoadProgressListener", UriUtil.LOCAL_ASSET_SCHEME, "progress", "notifyAssetLoadProgress", "loadRemoteUpdate", "(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/UpdatesConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAsset", "Lexpo/modules/updates/loader/FileDownloader$AssetDownloadResult;", "assetEntity", "requestedUpdate", "embeddedUpdate", "(Lexpo/modules/updates/db/entity/AssetEntity;Ljava/io/File;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/db/entity/UpdateEntity;Lexpo/modules/updates/db/entity/UpdateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lexpo/modules/updates/loader/Loader$LoaderResult;", "updateResponseDecision", "Lexpo/modules/updates/loader/Loader$OnUpdateResponseLoadedResult;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "finish", "processUpdate", "update", "Lexpo/modules/updates/manifest/Update;", "(Lexpo/modules/updates/manifest/Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadAllAssets", "handleAssetDownloadCompleted", "Lexpo/modules/updates/loader/Loader$AssetLoadResult;", "result", "(Lexpo/modules/updates/db/entity/AssetEntity;Lexpo/modules/updates/loader/Loader$AssetLoadResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LoaderResult", "OnUpdateResponseLoadedResult", "AssetLoadProgress", "AssetLoadResult", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Loader {
    private static final String TAG = "Loader";
    private final MutableSharedFlow<AssetLoadProgress> _progressFlow;
    private Function1<? super Double, Unit> assetLoadProgressBlock;
    private Map<AssetEntity, Double> assetProgressMap;
    private int assetTotal;
    private final UpdatesConfiguration configuration;
    private final Context context;
    private final UpdatesDatabase database;
    private List<AssetEntity> erroredAssetList;
    private List<AssetEntity> existingAssetList;
    private List<AssetEntity> finishedAssetList;
    private final LoaderFiles loaderFiles;
    private final UpdatesLogger logger;
    private final Flow<AssetLoadProgress> progressFlow;
    private CoroutineScope scope;
    private UpdateEntity updateEntity;
    private UpdateResponse updateResponse;
    private final File updatesDirectory;

    /* compiled from: Loader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetLoadResult.values().length];
            try {
                iArr[AssetLoadResult.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetLoadResult.ALREADY_EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetLoadResult.ERRORED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected abstract Object loadAsset(AssetEntity assetEntity, File file, UpdatesConfiguration updatesConfiguration, UpdateEntity updateEntity, UpdateEntity updateEntity2, Continuation<? super FileDownloader.AssetDownloadResult> continuation);

    protected abstract Object loadRemoteUpdate(UpdatesDatabase updatesDatabase, UpdatesConfiguration updatesConfiguration, Continuation<? super UpdateResponse> continuation);

    protected Loader(Context context, UpdatesConfiguration configuration, UpdatesLogger logger, UpdatesDatabase database, File updatesDirectory, LoaderFiles loaderFiles, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
        Intrinsics.checkNotNullParameter(loaderFiles, "loaderFiles");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.context = context;
        this.configuration = configuration;
        this.logger = logger;
        this.database = database;
        this.updatesDirectory = updatesDirectory;
        this.loaderFiles = loaderFiles;
        this.scope = scope;
        this.erroredAssetList = new ArrayList();
        this.existingAssetList = new ArrayList();
        this.finishedAssetList = new ArrayList();
        MutableSharedFlow<AssetLoadProgress> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._progressFlow = MutableSharedFlow$default;
        this.assetProgressMap = new ConcurrentHashMap();
        this.progressFlow = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    protected final Context getContext() {
        return this.context;
    }

    protected final UpdatesLogger getLogger() {
        return this.logger;
    }

    public /* synthetic */ Loader(Context context, UpdatesConfiguration updatesConfiguration, UpdatesLogger updatesLogger, UpdatesDatabase updatesDatabase, File file, LoaderFiles loaderFiles, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, updatesConfiguration, updatesLogger, updatesDatabase, file, loaderFiles, (i & 64) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO())) : coroutineScope);
    }

    public final Function1<Double, Unit> getAssetLoadProgressBlock$expo_updates_release() {
        return this.assetLoadProgressBlock;
    }

    public final void setAssetLoadProgressBlock$expo_updates_release(Function1<? super Double, Unit> function1) {
        this.assetLoadProgressBlock = function1;
    }

    public final Flow<AssetLoadProgress> getProgressFlow() {
        return this.progressFlow;
    }

    /* compiled from: Loader.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lexpo/modules/updates/loader/Loader$LoaderResult;", "", "updateEntity", "Lexpo/modules/updates/db/entity/UpdateEntity;", "updateDirective", "Lexpo/modules/updates/loader/UpdateDirective;", "<init>", "(Lexpo/modules/updates/db/entity/UpdateEntity;Lexpo/modules/updates/loader/UpdateDirective;)V", "getUpdateEntity", "()Lexpo/modules/updates/db/entity/UpdateEntity;", "getUpdateDirective", "()Lexpo/modules/updates/loader/UpdateDirective;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoaderResult {
        private final UpdateDirective updateDirective;
        private final UpdateEntity updateEntity;

        public static /* synthetic */ LoaderResult copy$default(LoaderResult loaderResult, UpdateEntity updateEntity, UpdateDirective updateDirective, int i, Object obj) {
            if ((i & 1) != 0) {
                updateEntity = loaderResult.updateEntity;
            }
            if ((i & 2) != 0) {
                updateDirective = loaderResult.updateDirective;
            }
            return loaderResult.copy(updateEntity, updateDirective);
        }

        /* renamed from: component1, reason: from getter */
        public final UpdateEntity getUpdateEntity() {
            return this.updateEntity;
        }

        /* renamed from: component2, reason: from getter */
        public final UpdateDirective getUpdateDirective() {
            return this.updateDirective;
        }

        public final LoaderResult copy(UpdateEntity updateEntity, UpdateDirective updateDirective) {
            return new LoaderResult(updateEntity, updateDirective);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoaderResult)) {
                return false;
            }
            LoaderResult loaderResult = (LoaderResult) other;
            return Intrinsics.areEqual(this.updateEntity, loaderResult.updateEntity) && Intrinsics.areEqual(this.updateDirective, loaderResult.updateDirective);
        }

        public int hashCode() {
            UpdateEntity updateEntity = this.updateEntity;
            int hashCode = (updateEntity == null ? 0 : updateEntity.hashCode()) * 31;
            UpdateDirective updateDirective = this.updateDirective;
            return hashCode + (updateDirective != null ? updateDirective.hashCode() : 0);
        }

        public String toString() {
            return "LoaderResult(updateEntity=" + this.updateEntity + ", updateDirective=" + this.updateDirective + ")";
        }

        public LoaderResult(UpdateEntity updateEntity, UpdateDirective updateDirective) {
            this.updateEntity = updateEntity;
            this.updateDirective = updateDirective;
        }

        public final UpdateDirective getUpdateDirective() {
            return this.updateDirective;
        }

        public final UpdateEntity getUpdateEntity() {
            return this.updateEntity;
        }
    }

    /* compiled from: Loader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lexpo/modules/updates/loader/Loader$OnUpdateResponseLoadedResult;", "", "shouldDownloadManifestIfPresentInResponse", "", "<init>", "(Z)V", "getShouldDownloadManifestIfPresentInResponse", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUpdateResponseLoadedResult {
        private final boolean shouldDownloadManifestIfPresentInResponse;

        public static /* synthetic */ OnUpdateResponseLoadedResult copy$default(OnUpdateResponseLoadedResult onUpdateResponseLoadedResult, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onUpdateResponseLoadedResult.shouldDownloadManifestIfPresentInResponse;
            }
            return onUpdateResponseLoadedResult.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldDownloadManifestIfPresentInResponse() {
            return this.shouldDownloadManifestIfPresentInResponse;
        }

        public final OnUpdateResponseLoadedResult copy(boolean shouldDownloadManifestIfPresentInResponse) {
            return new OnUpdateResponseLoadedResult(shouldDownloadManifestIfPresentInResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnUpdateResponseLoadedResult) && this.shouldDownloadManifestIfPresentInResponse == ((OnUpdateResponseLoadedResult) other).shouldDownloadManifestIfPresentInResponse;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldDownloadManifestIfPresentInResponse);
        }

        public String toString() {
            return "OnUpdateResponseLoadedResult(shouldDownloadManifestIfPresentInResponse=" + this.shouldDownloadManifestIfPresentInResponse + ")";
        }

        public OnUpdateResponseLoadedResult(boolean z) {
            this.shouldDownloadManifestIfPresentInResponse = z;
        }

        public final boolean getShouldDownloadManifestIfPresentInResponse() {
            return this.shouldDownloadManifestIfPresentInResponse;
        }
    }

    /* compiled from: Loader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lexpo/modules/updates/loader/Loader$AssetLoadProgress;", "", UriUtil.LOCAL_ASSET_SCHEME, "Lexpo/modules/updates/db/entity/AssetEntity;", "successfulAssetCount", "", "failedAssetCount", "totalAssetCount", "<init>", "(Lexpo/modules/updates/db/entity/AssetEntity;III)V", "getAsset", "()Lexpo/modules/updates/db/entity/AssetEntity;", "getSuccessfulAssetCount", "()I", "getFailedAssetCount", "getTotalAssetCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AssetLoadProgress {
        private final AssetEntity asset;
        private final int failedAssetCount;
        private final int successfulAssetCount;
        private final int totalAssetCount;

        public static /* synthetic */ AssetLoadProgress copy$default(AssetLoadProgress assetLoadProgress, AssetEntity assetEntity, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                assetEntity = assetLoadProgress.asset;
            }
            if ((i4 & 2) != 0) {
                i = assetLoadProgress.successfulAssetCount;
            }
            if ((i4 & 4) != 0) {
                i2 = assetLoadProgress.failedAssetCount;
            }
            if ((i4 & 8) != 0) {
                i3 = assetLoadProgress.totalAssetCount;
            }
            return assetLoadProgress.copy(assetEntity, i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetEntity getAsset() {
            return this.asset;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSuccessfulAssetCount() {
            return this.successfulAssetCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getFailedAssetCount() {
            return this.failedAssetCount;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTotalAssetCount() {
            return this.totalAssetCount;
        }

        public final AssetLoadProgress copy(AssetEntity asset, int successfulAssetCount, int failedAssetCount, int totalAssetCount) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            return new AssetLoadProgress(asset, successfulAssetCount, failedAssetCount, totalAssetCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetLoadProgress)) {
                return false;
            }
            AssetLoadProgress assetLoadProgress = (AssetLoadProgress) other;
            return Intrinsics.areEqual(this.asset, assetLoadProgress.asset) && this.successfulAssetCount == assetLoadProgress.successfulAssetCount && this.failedAssetCount == assetLoadProgress.failedAssetCount && this.totalAssetCount == assetLoadProgress.totalAssetCount;
        }

        public int hashCode() {
            return (((((this.asset.hashCode() * 31) + Integer.hashCode(this.successfulAssetCount)) * 31) + Integer.hashCode(this.failedAssetCount)) * 31) + Integer.hashCode(this.totalAssetCount);
        }

        public String toString() {
            return "AssetLoadProgress(asset=" + this.asset + ", successfulAssetCount=" + this.successfulAssetCount + ", failedAssetCount=" + this.failedAssetCount + ", totalAssetCount=" + this.totalAssetCount + ")";
        }

        public AssetLoadProgress(AssetEntity asset, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
            this.successfulAssetCount = i;
            this.failedAssetCount = i2;
            this.totalAssetCount = i3;
        }

        public final AssetEntity getAsset() {
            return this.asset;
        }

        public final int getSuccessfulAssetCount() {
            return this.successfulAssetCount;
        }

        public final int getFailedAssetCount() {
            return this.failedAssetCount;
        }

        public final int getTotalAssetCount() {
            return this.totalAssetCount;
        }
    }

    public final void assetLoadProgressListener(AssetEntity asset, double progress) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.assetProgressMap.put(asset, Double.valueOf(progress));
        notifyAssetLoadProgress();
    }

    private final void notifyAssetLoadProgress() {
        if (this.assetTotal > 0) {
            double sumOfDouble = CollectionsKt.sumOfDouble(this.assetProgressMap.values()) / this.assetTotal;
            Function1<? super Double, Unit> function1 = this.assetLoadProgressBlock;
            if (function1 != null) {
                function1.invoke(Double.valueOf(sumOfDouble));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:17:0x003b, B:18:0x0051, B:20:0x005c, B:21:0x0062, B:23:0x006a, B:25:0x0070, B:29:0x007c, B:33:0x0042), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(Function1<? super UpdateResponse, OnUpdateResponseLoadedResult> function1, Continuation<? super LoaderResult> continuation) {
        Loader$load$1 loader$load$1;
        int i;
        Update update;
        try {
            if (continuation instanceof Loader$load$1) {
                loader$load$1 = (Loader$load$1) continuation;
                if ((loader$load$1.label & Integer.MIN_VALUE) != 0) {
                    loader$load$1.label -= Integer.MIN_VALUE;
                    Object obj = loader$load$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = loader$load$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        UpdatesDatabase updatesDatabase = this.database;
                        UpdatesConfiguration updatesConfiguration = this.configuration;
                        loader$load$1.L$0 = function1;
                        loader$load$1.label = 1;
                        obj = loadRemoteUpdate(updatesDatabase, updatesConfiguration, loader$load$1);
                        if (obj == coroutine_suspended) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        function1 = (Function1) loader$load$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    UpdateResponse updateResponse = (UpdateResponse) obj;
                    this.updateResponse = updateResponse;
                    UpdateResponsePart.ManifestUpdateResponsePart manifestUpdateResponsePart = updateResponse.getManifestUpdateResponsePart();
                    update = manifestUpdateResponsePart == null ? manifestUpdateResponsePart.getUpdate() : null;
                    OnUpdateResponseLoadedResult invoke = function1.invoke(updateResponse);
                    if (update == null && invoke.getShouldDownloadManifestIfPresentInResponse()) {
                        loader$load$1.L$0 = null;
                        loader$load$1.label = 2;
                        Object processUpdate = processUpdate(update, loader$load$1);
                        return processUpdate == coroutine_suspended ? coroutine_suspended : processUpdate;
                    }
                    this.updateEntity = null;
                    return finish();
                }
            }
            if (i != 0) {
            }
            UpdateResponse updateResponse2 = (UpdateResponse) obj;
            this.updateResponse = updateResponse2;
            UpdateResponsePart.ManifestUpdateResponsePart manifestUpdateResponsePart2 = updateResponse2.getManifestUpdateResponsePart();
            if (manifestUpdateResponsePart2 == null) {
            }
            OnUpdateResponseLoadedResult invoke2 = function1.invoke(updateResponse2);
            if (update == null) {
            }
            this.updateEntity = null;
            return finish();
        } catch (Exception e) {
            this.logger.error("Load error", e, UpdatesErrorCode.UpdateFailedToLoad);
            throw e;
        }
        loader$load$1 = new Loader$load$1(this, continuation);
        Object obj2 = loader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loader$load$1.label;
    }

    private final void reset() {
        this.updateResponse = null;
        this.updateEntity = null;
        this.assetTotal = 0;
        this.erroredAssetList = new ArrayList();
        this.existingAssetList = new ArrayList();
        this.finishedAssetList = new ArrayList();
        this.assetProgressMap = new ConcurrentHashMap();
        this.assetLoadProgressBlock = null;
    }

    private final LoaderResult finish() {
        UpdateResponse updateResponse = this.updateResponse;
        Intrinsics.checkNotNull(updateResponse);
        ResponseHeaderData responseHeaderData = updateResponse.getResponseHeaderData();
        if (responseHeaderData != null) {
            ManifestMetadata.INSTANCE.saveMetadata(responseHeaderData, this.database, this.configuration);
        }
        UpdateResponse updateResponse2 = this.updateResponse;
        Intrinsics.checkNotNull(updateResponse2);
        UpdateResponsePart.DirectiveUpdateResponsePart directiveUpdateResponsePart = updateResponse2.getDirectiveUpdateResponsePart();
        LoaderResult loaderResult = new LoaderResult(this.updateEntity, directiveUpdateResponsePart != null ? directiveUpdateResponsePart.getUpdateDirective() : null);
        reset();
        return loaderResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processUpdate(Update update, Continuation<? super LoaderResult> continuation) {
        if (update.getIsDevelopmentMode()) {
            UpdateEntity updateEntity = update.getUpdateEntity();
            UpdateDao updateDao = this.database.updateDao();
            Intrinsics.checkNotNull(updateEntity);
            updateDao.insertUpdate(updateEntity);
            this.database.updateDao().markUpdateFinished(updateEntity);
            this.updateEntity = updateEntity;
            return finish();
        }
        UpdateEntity updateEntity2 = update.getUpdateEntity();
        UpdateDao updateDao2 = this.database.updateDao();
        Intrinsics.checkNotNull(updateEntity2);
        UpdateEntity loadUpdateWithId = updateDao2.loadUpdateWithId(updateEntity2.getId());
        if (loadUpdateWithId != null && !Intrinsics.areEqual(loadUpdateWithId.getScopeKey(), updateEntity2.getScopeKey())) {
            UpdatesLogger.warn$default(this.logger, "Loaded an update with the same ID but a different scopeKey than one we already have on disk. This is a server error. Overwriting the scopeKey and loading the existing update.", null, 2, null);
            this.database.updateDao().setUpdateScopeKey(loadUpdateWithId, updateEntity2.getScopeKey());
        }
        if (loadUpdateWithId != null && loadUpdateWithId.getStatus() == UpdateStatus.READY) {
            this.updateEntity = loadUpdateWithId;
            return finish();
        }
        if (loadUpdateWithId == null) {
            this.updateEntity = updateEntity2;
            UpdateDao updateDao3 = this.database.updateDao();
            UpdateEntity updateEntity3 = this.updateEntity;
            Intrinsics.checkNotNull(updateEntity3);
            updateDao3.insertUpdate(updateEntity3);
        } else {
            this.updateEntity = loadUpdateWithId;
        }
        return downloadAllAssets(update, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Loader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/updates/loader/Loader$AssetLoadResult;", "", "<init>", "(Ljava/lang/String;I)V", "FINISHED", "ALREADY_EXISTS", "ERRORED", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class AssetLoadResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetLoadResult[] $VALUES;
        public static final AssetLoadResult FINISHED = new AssetLoadResult("FINISHED", 0);
        public static final AssetLoadResult ALREADY_EXISTS = new AssetLoadResult("ALREADY_EXISTS", 1);
        public static final AssetLoadResult ERRORED = new AssetLoadResult("ERRORED", 2);

        private static final /* synthetic */ AssetLoadResult[] $values() {
            return new AssetLoadResult[]{FINISHED, ALREADY_EXISTS, ERRORED};
        }

        public static EnumEntries<AssetLoadResult> getEntries() {
            return $ENTRIES;
        }

        private AssetLoadResult(String str, int i) {
        }

        static {
            AssetLoadResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static AssetLoadResult valueOf(String str) {
            return (AssetLoadResult) Enum.valueOf(AssetLoadResult.class, str);
        }

        public static AssetLoadResult[] values() {
            return (AssetLoadResult[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013f, code lost:
    
        if (kotlinx.coroutines.AwaitKt.awaitAll(r12, r10) == r6) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, expo.modules.updates.db.entity.AssetEntity] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, expo.modules.updates.db.entity.AssetEntity] */
    /* JADX WARN: Type inference failed for: r19v0, types: [expo.modules.updates.loader.Loader] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [expo.modules.updates.db.dao.AssetDao] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadAllAssets(Update update, Continuation<? super LoaderResult> continuation) {
        Loader$downloadAllAssets$1 loader$downloadAllAssets$1;
        int i;
        Loader$downloadAllAssets$1 loader$downloadAllAssets$12;
        ArrayList arrayList;
        Iterator it;
        Update update2;
        Update update3;
        Deferred async$default;
        byte[] bArr;
        if (continuation instanceof Loader$downloadAllAssets$1) {
            loader$downloadAllAssets$1 = (Loader$downloadAllAssets$1) continuation;
            if ((loader$downloadAllAssets$1.label & Integer.MIN_VALUE) != 0) {
                loader$downloadAllAssets$1.label -= Integer.MIN_VALUE;
                Object obj = loader$downloadAllAssets$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loader$downloadAllAssets$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<AssetEntity> assetEntityList = update.getAssetEntityList();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : assetEntityList) {
                        if (hashSet.add(((AssetEntity) obj2).getKey())) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    this.assetTotal = arrayList3.size();
                    Update readEmbeddedUpdate = this.loaderFiles.readEmbeddedUpdate(this.context, this.configuration);
                    loader$downloadAllAssets$12 = loader$downloadAllAssets$1;
                    arrayList = new ArrayList();
                    it = arrayList3.iterator();
                    update2 = update;
                    update3 = readEmbeddedUpdate;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        try {
                            for (AssetEntity assetEntity : this.existingAssetList) {
                                AssetDao assetDao = this.database.assetDao();
                                UpdateEntity updateEntity = this.updateEntity;
                                Intrinsics.checkNotNull(updateEntity);
                                if (!assetDao.addExistingAssetToUpdate(updateEntity, assetEntity, assetEntity.getIsLaunchAsset())) {
                                    try {
                                        bArr = UpdatesUtils.INSTANCE.sha256(new File(this.updatesDirectory, assetEntity.getRelativePath()));
                                    } catch (Exception unused) {
                                        bArr = null;
                                    }
                                    assetEntity.setDownloadTime(new Date());
                                    assetEntity.setHash(bArr);
                                    this.finishedAssetList.add(assetEntity);
                                }
                            }
                            AssetDao assetDao2 = this.database.assetDao();
                            List<AssetEntity> list = this.finishedAssetList;
                            UpdateEntity updateEntity2 = this.updateEntity;
                            Intrinsics.checkNotNull(updateEntity2);
                            assetDao2.insertAssets(list, updateEntity2);
                            UpdateDao updateDao = this.database.updateDao();
                            UpdateEntity updateEntity3 = this.updateEntity;
                            Intrinsics.checkNotNull(updateEntity3);
                            updateDao.markUpdateFinished(updateEntity3);
                            return finish();
                        } catch (Exception e) {
                            throw new IOException("Error while adding new update to database", e);
                        }
                    }
                    Iterator it2 = (Iterator) loader$downloadAllAssets$1.L$3;
                    ?? r4 = (List) loader$downloadAllAssets$1.L$2;
                    Update update4 = (Update) loader$downloadAllAssets$1.L$1;
                    Update update5 = (Update) loader$downloadAllAssets$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    it = it2;
                    arrayList = r4;
                    update3 = update4;
                    update2 = update5;
                    loader$downloadAllAssets$12 = loader$downloadAllAssets$1;
                }
                while (true) {
                    if (!it.hasNext()) {
                        ?? r0 = (AssetEntity) it.next();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = r0;
                        ?? loadAssetWithKey = this.database.assetDao().loadAssetWithKey(((AssetEntity) objectRef.element).getKey());
                        if (loadAssetWithKey != 0) {
                            this.database.assetDao().mergeAndUpdateAsset(loadAssetWithKey, (AssetEntity) objectRef.element);
                            objectRef.element = loadAssetWithKey;
                        }
                        if (((AssetEntity) objectRef.element).getRelativePath() == null || !this.loaderFiles.fileExists(this.context, this.updatesDirectory, ((AssetEntity) objectRef.element).getRelativePath())) {
                            async$default = BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new Loader$downloadAllAssets$job$1(this, objectRef, update2, update3, null), 3, null);
                            arrayList.add(async$default);
                        } else {
                            AssetEntity assetEntity2 = (AssetEntity) objectRef.element;
                            AssetLoadResult assetLoadResult = AssetLoadResult.ALREADY_EXISTS;
                            loader$downloadAllAssets$12.L$0 = update2;
                            loader$downloadAllAssets$12.L$1 = update3;
                            loader$downloadAllAssets$12.L$2 = arrayList;
                            loader$downloadAllAssets$12.L$3 = it;
                            loader$downloadAllAssets$12.label = 1;
                            if (handleAssetDownloadCompleted(assetEntity2, assetLoadResult, loader$downloadAllAssets$12) == coroutine_suspended) {
                                break;
                            }
                        }
                    } else {
                        loader$downloadAllAssets$12.L$0 = null;
                        loader$downloadAllAssets$12.L$1 = null;
                        loader$downloadAllAssets$12.L$2 = null;
                        loader$downloadAllAssets$12.L$3 = null;
                        loader$downloadAllAssets$12.label = 2;
                    }
                }
                return coroutine_suspended;
            }
        }
        loader$downloadAllAssets$1 = new Loader$downloadAllAssets$1(this, continuation);
        Object obj3 = loader$downloadAllAssets$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loader$downloadAllAssets$1.label;
        if (i != 0) {
        }
        while (true) {
            if (!it.hasNext()) {
            }
        }
        return coroutine_suspended2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAssetDownloadCompleted(AssetEntity assetEntity, AssetLoadResult assetLoadResult, Continuation<? super AssetLoadResult> continuation) {
        Loader$handleAssetDownloadCompleted$1 loader$handleAssetDownloadCompleted$1;
        int i;
        if (continuation instanceof Loader$handleAssetDownloadCompleted$1) {
            loader$handleAssetDownloadCompleted$1 = (Loader$handleAssetDownloadCompleted$1) continuation;
            if ((loader$handleAssetDownloadCompleted$1.label & Integer.MIN_VALUE) != 0) {
                loader$handleAssetDownloadCompleted$1.label -= Integer.MIN_VALUE;
                Object obj = loader$handleAssetDownloadCompleted$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loader$handleAssetDownloadCompleted$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AssetLoadResult assetLoadResult2 = (AssetLoadResult) loader$handleAssetDownloadCompleted$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return assetLoadResult2;
                }
                ResultKt.throwOnFailure(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[assetLoadResult.ordinal()];
                if (i2 == 1) {
                    this.finishedAssetList.add(assetEntity);
                } else if (i2 == 2) {
                    this.existingAssetList.add(assetEntity);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.erroredAssetList.add(assetEntity);
                }
                if (assetLoadResult == AssetLoadResult.FINISHED || assetLoadResult == AssetLoadResult.ALREADY_EXISTS) {
                    this.assetProgressMap.put(assetEntity, Boxing.boxDouble(1.0d));
                    notifyAssetLoadProgress();
                }
                MutableSharedFlow<AssetLoadProgress> mutableSharedFlow = this._progressFlow;
                AssetLoadProgress assetLoadProgress = new AssetLoadProgress(assetEntity, this.finishedAssetList.size() + this.existingAssetList.size(), this.erroredAssetList.size(), this.assetTotal);
                loader$handleAssetDownloadCompleted$1.L$0 = assetLoadResult;
                loader$handleAssetDownloadCompleted$1.label = 1;
                return mutableSharedFlow.emit(assetLoadProgress, loader$handleAssetDownloadCompleted$1) == coroutine_suspended ? coroutine_suspended : assetLoadResult;
            }
        }
        loader$handleAssetDownloadCompleted$1 = new Loader$handleAssetDownloadCompleted$1(this, continuation);
        Object obj2 = loader$handleAssetDownloadCompleted$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loader$handleAssetDownloadCompleted$1.label;
        if (i == 0) {
        }
    }
}
