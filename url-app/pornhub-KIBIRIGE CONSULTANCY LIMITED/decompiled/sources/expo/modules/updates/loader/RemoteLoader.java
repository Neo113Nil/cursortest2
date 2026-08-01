package expo.modules.updates.loader;

import android.content.Context;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.dao.UpdateDao;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.Loader;
import expo.modules.updates.loader.RemoteLoader;
import expo.modules.updates.loader.UpdateDirective;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.manifest.EmbeddedManifestUtils;
import expo.modules.updates.manifest.EmbeddedUpdate;
import expo.modules.updates.manifest.ManifestMetadata;
import expo.modules.updates.manifest.Update;
import expo.modules.updates.selectionpolicy.SelectionPolicy;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteLoader.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 BK\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013BC\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0094@¢\u0006\u0002\u0010\u0018J<\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0094@¢\u0006\u0002\u0010\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lexpo/modules/updates/loader/RemoteLoader;", "Lexpo/modules/updates/loader/Loader;", "context", "Landroid/content/Context;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "database", "Lexpo/modules/updates/db/UpdatesDatabase;", "mFileDownloader", "Lexpo/modules/updates/loader/FileDownloader;", "updatesDirectory", "Ljava/io/File;", "launchedUpdate", "Lexpo/modules/updates/db/entity/UpdateEntity;", "loaderFiles", "Lexpo/modules/updates/loader/LoaderFiles;", "<init>", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/loader/FileDownloader;Ljava/io/File;Lexpo/modules/updates/db/entity/UpdateEntity;Lexpo/modules/updates/loader/LoaderFiles;)V", "fileDownloader", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/loader/FileDownloader;Ljava/io/File;Lexpo/modules/updates/db/entity/UpdateEntity;)V", "loadRemoteUpdate", "Lexpo/modules/updates/loader/UpdateResponse;", "(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/UpdatesConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAsset", "Lexpo/modules/updates/loader/FileDownloader$AssetDownloadResult;", "assetEntity", "Lexpo/modules/updates/db/entity/AssetEntity;", "requestedUpdate", "embeddedUpdate", "(Lexpo/modules/updates/db/entity/AssetEntity;Ljava/io/File;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/db/entity/UpdateEntity;Lexpo/modules/updates/db/entity/UpdateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoteLoader extends Loader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "RemoteLoader";
    private final UpdateEntity launchedUpdate;
    private final LoaderFiles loaderFiles;
    private final FileDownloader mFileDownloader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLoader(Context context, UpdatesConfiguration configuration, UpdatesLogger logger, UpdatesDatabase database, FileDownloader mFileDownloader, File updatesDirectory, UpdateEntity updateEntity, LoaderFiles loaderFiles) {
        super(context, configuration, logger, database, updatesDirectory, loaderFiles, null, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(mFileDownloader, "mFileDownloader");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
        Intrinsics.checkNotNullParameter(loaderFiles, "loaderFiles");
        this.mFileDownloader = mFileDownloader;
        this.launchedUpdate = updateEntity;
        this.loaderFiles = loaderFiles;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoteLoader(Context context, UpdatesConfiguration configuration, UpdatesLogger logger, UpdatesDatabase database, FileDownloader fileDownloader, File updatesDirectory, UpdateEntity updateEntity) {
        this(context, configuration, logger, database, fileDownloader, updatesDirectory, updateEntity, new LoaderFiles());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
    }

    @Override // expo.modules.updates.loader.Loader
    protected Object loadRemoteUpdate(UpdatesDatabase updatesDatabase, UpdatesConfiguration updatesConfiguration, Continuation<? super UpdateResponse> continuation) {
        Update readEmbeddedUpdate = this.loaderFiles.readEmbeddedUpdate(getContext(), updatesConfiguration);
        return this.mFileDownloader.downloadRemoteUpdate(FileDownloader.INSTANCE.getExtraHeadersForRemoteUpdateRequest(updatesDatabase, updatesConfiguration, this.launchedUpdate, readEmbeddedUpdate != null ? readEmbeddedUpdate.getUpdateEntity() : null), continuation);
    }

    @Override // expo.modules.updates.loader.Loader
    protected Object loadAsset(final AssetEntity assetEntity, File file, UpdatesConfiguration updatesConfiguration, UpdateEntity updateEntity, UpdateEntity updateEntity2, Continuation<? super FileDownloader.AssetDownloadResult> continuation) {
        return this.mFileDownloader.downloadAsset(assetEntity, file, FileDownloader.INSTANCE.getExtraHeadersForRemoteAssetRequest(this.launchedUpdate, updateEntity2, updateEntity), new Function1() { // from class: expo.modules.updates.loader.RemoteLoader$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit loadAsset$lambda$0;
                loadAsset$lambda$0 = RemoteLoader.loadAsset$lambda$0(RemoteLoader.this, assetEntity, ((Double) obj).doubleValue());
                return loadAsset$lambda$0;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAsset$lambda$0(RemoteLoader remoteLoader, AssetEntity assetEntity, double d) {
        remoteLoader.assetLoadProgressListener(assetEntity, d);
        return Unit.INSTANCE;
    }

    /* compiled from: RemoteLoader.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019JP\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010\u001eR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lexpo/modules/updates/loader/RemoteLoader$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "processSuccessLoaderResult", "Lexpo/modules/updates/loader/ProcessSuccessLoaderResult;", "context", "Landroid/content/Context;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "database", "Lexpo/modules/updates/db/UpdatesDatabase;", "selectionPolicy", "Lexpo/modules/updates/selectionpolicy/SelectionPolicy;", "directory", "Ljava/io/File;", "launchedUpdate", "Lexpo/modules/updates/db/entity/UpdateEntity;", "loaderResult", "Lexpo/modules/updates/loader/Loader$LoaderResult;", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/selectionpolicy/SelectionPolicy;Ljava/io/File;Lexpo/modules/updates/db/entity/UpdateEntity;Lexpo/modules/updates/loader/Loader$LoaderResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processRollBackToEmbeddedDirective", "", "updateDirective", "Lexpo/modules/updates/loader/UpdateDirective$RollBackToEmbeddedUpdateDirective;", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/selectionpolicy/SelectionPolicy;Ljava/io/File;Lexpo/modules/updates/db/entity/UpdateEntity;Lexpo/modules/updates/loader/UpdateDirective$RollBackToEmbeddedUpdateDirective;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object processSuccessLoaderResult(Context context, UpdatesConfiguration updatesConfiguration, UpdatesLogger updatesLogger, UpdatesDatabase updatesDatabase, SelectionPolicy selectionPolicy, File file, UpdateEntity updateEntity, Loader.LoaderResult loaderResult, Continuation<? super ProcessSuccessLoaderResult> continuation) {
            RemoteLoader$Companion$processSuccessLoaderResult$1 remoteLoader$Companion$processSuccessLoaderResult$1;
            int i;
            if (continuation instanceof RemoteLoader$Companion$processSuccessLoaderResult$1) {
                remoteLoader$Companion$processSuccessLoaderResult$1 = (RemoteLoader$Companion$processSuccessLoaderResult$1) continuation;
                if ((remoteLoader$Companion$processSuccessLoaderResult$1.label & Integer.MIN_VALUE) != 0) {
                    remoteLoader$Companion$processSuccessLoaderResult$1.label -= Integer.MIN_VALUE;
                    RemoteLoader$Companion$processSuccessLoaderResult$1 remoteLoader$Companion$processSuccessLoaderResult$12 = remoteLoader$Companion$processSuccessLoaderResult$1;
                    Object obj = remoteLoader$Companion$processSuccessLoaderResult$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = remoteLoader$Companion$processSuccessLoaderResult$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        UpdateEntity updateEntity2 = loaderResult.getUpdateEntity();
                        UpdateDirective updateDirective = loaderResult.getUpdateDirective();
                        if (updateDirective != null && (updateDirective instanceof UpdateDirective.RollBackToEmbeddedUpdateDirective)) {
                            remoteLoader$Companion$processSuccessLoaderResult$12.label = 1;
                            obj = processRollBackToEmbeddedDirective(context, updatesConfiguration, updatesLogger, updatesDatabase, selectionPolicy, file, updateEntity, (UpdateDirective.RollBackToEmbeddedUpdateDirective) updateDirective, remoteLoader$Companion$processSuccessLoaderResult$12);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            return new ProcessSuccessLoaderResult(updateEntity2, false);
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return new ProcessSuccessLoaderResult(null, ((Boolean) obj).booleanValue());
                }
            }
            remoteLoader$Companion$processSuccessLoaderResult$1 = new RemoteLoader$Companion$processSuccessLoaderResult$1(this, continuation);
            RemoteLoader$Companion$processSuccessLoaderResult$1 remoteLoader$Companion$processSuccessLoaderResult$122 = remoteLoader$Companion$processSuccessLoaderResult$1;
            Object obj2 = remoteLoader$Companion$processSuccessLoaderResult$122.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = remoteLoader$Companion$processSuccessLoaderResult$122.label;
            if (i != 0) {
            }
            return new ProcessSuccessLoaderResult(null, ((Boolean) obj2).booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:19|20))(2:21|(2:23|24)(2:25|(2:27|28)(3:29|30|(1:32)(1:33))))|13|14|15|16))|37|6|7|(0)(0)|13|14|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x003d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        
            r14.error("Embedded update erroneously null when applying roll back to embedded directive", r0, expo.modules.updates.logging.UpdatesErrorCode.UpdateFailedToLoad);
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object processRollBackToEmbeddedDirective(Context context, UpdatesConfiguration updatesConfiguration, UpdatesLogger updatesLogger, UpdatesDatabase updatesDatabase, SelectionPolicy selectionPolicy, File file, UpdateEntity updateEntity, UpdateDirective.RollBackToEmbeddedUpdateDirective rollBackToEmbeddedUpdateDirective, Continuation<? super Boolean> continuation) {
            RemoteLoader$Companion$processRollBackToEmbeddedDirective$1 remoteLoader$Companion$processRollBackToEmbeddedDirective$1;
            int i;
            UpdatesDatabase updatesDatabase2;
            UpdateDirective.RollBackToEmbeddedUpdateDirective rollBackToEmbeddedUpdateDirective2 = rollBackToEmbeddedUpdateDirective;
            if (continuation instanceof RemoteLoader$Companion$processRollBackToEmbeddedDirective$1) {
                remoteLoader$Companion$processRollBackToEmbeddedDirective$1 = (RemoteLoader$Companion$processRollBackToEmbeddedDirective$1) continuation;
                if ((remoteLoader$Companion$processRollBackToEmbeddedDirective$1.label & Integer.MIN_VALUE) != 0) {
                    remoteLoader$Companion$processRollBackToEmbeddedDirective$1.label -= Integer.MIN_VALUE;
                    RemoteLoader$Companion$processRollBackToEmbeddedDirective$1 remoteLoader$Companion$processRollBackToEmbeddedDirective$12 = remoteLoader$Companion$processRollBackToEmbeddedDirective$1;
                    Object obj = remoteLoader$Companion$processRollBackToEmbeddedDirective$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = remoteLoader$Companion$processRollBackToEmbeddedDirective$12.label;
                    boolean z = false;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!updatesConfiguration.getHasEmbeddedUpdate()) {
                            return Boxing.boxBoolean(false);
                        }
                        EmbeddedUpdate embeddedUpdate = EmbeddedManifestUtils.INSTANCE.getEmbeddedUpdate(context, updatesConfiguration);
                        Intrinsics.checkNotNull(embeddedUpdate);
                        UpdateEntity updateEntity2 = embeddedUpdate.getUpdateEntity();
                        if (!selectionPolicy.shouldLoadRollBackToEmbeddedDirective(rollBackToEmbeddedUpdateDirective2, updateEntity2, updateEntity, ManifestMetadata.INSTANCE.getManifestFilters(updatesDatabase, updatesConfiguration))) {
                            return Boxing.boxBoolean(false);
                        }
                        updateEntity2.setCommitTime(rollBackToEmbeddedUpdateDirective2.getCommitTime());
                        EmbeddedLoader embeddedLoader = new EmbeddedLoader(context, updatesConfiguration, updatesLogger, updatesDatabase, file);
                        Function1<? super UpdateResponse, Loader.OnUpdateResponseLoadedResult> function1 = new Function1() { // from class: expo.modules.updates.loader.RemoteLoader$Companion$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Loader.OnUpdateResponseLoadedResult processRollBackToEmbeddedDirective$lambda$0;
                                processRollBackToEmbeddedDirective$lambda$0 = RemoteLoader.Companion.processRollBackToEmbeddedDirective$lambda$0((UpdateResponse) obj2);
                                return processRollBackToEmbeddedDirective$lambda$0;
                            }
                        };
                        remoteLoader$Companion$processRollBackToEmbeddedDirective$12.L$0 = updatesLogger;
                        remoteLoader$Companion$processRollBackToEmbeddedDirective$12.L$1 = updatesDatabase;
                        remoteLoader$Companion$processRollBackToEmbeddedDirective$12.L$2 = rollBackToEmbeddedUpdateDirective2;
                        remoteLoader$Companion$processRollBackToEmbeddedDirective$12.label = 1;
                        obj = embeddedLoader.load(function1, remoteLoader$Companion$processRollBackToEmbeddedDirective$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        updatesDatabase2 = updatesDatabase;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        UpdateDirective.RollBackToEmbeddedUpdateDirective rollBackToEmbeddedUpdateDirective3 = (UpdateDirective.RollBackToEmbeddedUpdateDirective) remoteLoader$Companion$processRollBackToEmbeddedDirective$12.L$2;
                        updatesDatabase2 = (UpdatesDatabase) remoteLoader$Companion$processRollBackToEmbeddedDirective$12.L$1;
                        updatesLogger = (UpdatesLogger) remoteLoader$Companion$processRollBackToEmbeddedDirective$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        rollBackToEmbeddedUpdateDirective2 = rollBackToEmbeddedUpdateDirective3;
                    }
                    UpdateEntity updateEntity3 = ((Loader.LoaderResult) obj).getUpdateEntity();
                    UpdateDao updateDao = updatesDatabase2.updateDao();
                    Intrinsics.checkNotNull(updateEntity3);
                    updateDao.setUpdateCommitTime(updateEntity3, rollBackToEmbeddedUpdateDirective2.getCommitTime());
                    z = true;
                    return Boxing.boxBoolean(z);
                }
            }
            remoteLoader$Companion$processRollBackToEmbeddedDirective$1 = new RemoteLoader$Companion$processRollBackToEmbeddedDirective$1(this, continuation);
            RemoteLoader$Companion$processRollBackToEmbeddedDirective$1 remoteLoader$Companion$processRollBackToEmbeddedDirective$122 = remoteLoader$Companion$processRollBackToEmbeddedDirective$1;
            Object obj2 = remoteLoader$Companion$processRollBackToEmbeddedDirective$122.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = remoteLoader$Companion$processRollBackToEmbeddedDirective$122.label;
            boolean z2 = false;
            if (i != 0) {
            }
            UpdateEntity updateEntity32 = ((Loader.LoaderResult) obj2).getUpdateEntity();
            UpdateDao updateDao2 = updatesDatabase2.updateDao();
            Intrinsics.checkNotNull(updateEntity32);
            updateDao2.setUpdateCommitTime(updateEntity32, rollBackToEmbeddedUpdateDirective2.getCommitTime());
            z2 = true;
            return Boxing.boxBoolean(z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loader.OnUpdateResponseLoadedResult processRollBackToEmbeddedDirective$lambda$0(UpdateResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Loader.OnUpdateResponseLoadedResult(true);
        }
    }
}
