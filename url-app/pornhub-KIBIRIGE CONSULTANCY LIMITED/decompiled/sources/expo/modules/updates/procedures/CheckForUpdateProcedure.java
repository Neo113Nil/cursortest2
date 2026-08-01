package expo.modules.updates.procedures;

import android.content.Context;
import expo.modules.core.logging.LoggerUtilsKt;
import expo.modules.updates.IUpdatesController;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.DatabaseHolder;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.LoaderTask;
import expo.modules.updates.loader.UpdateDirective;
import expo.modules.updates.loader.UpdateResponse;
import expo.modules.updates.loader.UpdateResponsePart;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.manifest.EmbeddedManifestUtils;
import expo.modules.updates.manifest.EmbeddedUpdate;
import expo.modules.updates.manifest.ResponseHeaderData;
import expo.modules.updates.manifest.Update;
import expo.modules.updates.procedures.StateMachineProcedure;
import expo.modules.updates.selectionpolicy.SelectionPolicy;
import expo.modules.updates.statemachine.UpdatesStateEvent;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CheckForUpdateProcedure.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0082@¢\u0006\u0002\u0010\"J\"\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lexpo/modules/updates/procedures/CheckForUpdateProcedure;", "Lexpo/modules/updates/procedures/StateMachineProcedure;", "context", "Landroid/content/Context;", "updatesConfiguration", "Lexpo/modules/updates/UpdatesConfiguration;", "databaseHolder", "Lexpo/modules/updates/db/DatabaseHolder;", "updatesLogger", "Lexpo/modules/updates/logging/UpdatesLogger;", "fileDownloader", "Lexpo/modules/updates/loader/FileDownloader;", "selectionPolicy", "Lexpo/modules/updates/selectionpolicy/SelectionPolicy;", "launchedUpdate", "Lexpo/modules/updates/db/entity/UpdateEntity;", "callback", "Lkotlin/Function1;", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "", "<init>", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/db/DatabaseHolder;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/loader/FileDownloader;Lexpo/modules/updates/selectionpolicy/SelectionPolicy;Lexpo/modules/updates/db/entity/UpdateEntity;Lkotlin/jvm/functions/Function1;)V", "loggerTimerLabel", "", "getLoggerTimerLabel", "()Ljava/lang/String;", "run", "procedureContext", "Lexpo/modules/updates/procedures/StateMachineProcedure$ProcedureContext;", "(Lexpo/modules/updates/procedures/StateMachineProcedure$ProcedureContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadRemoteUpdate", "Lexpo/modules/updates/loader/UpdateResponse;", "extraHeaders", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processUpdatesResponse", "updateResponse", "embeddedUpdate", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CheckForUpdateProcedure extends StateMachineProcedure {
    private final Function1<IUpdatesController.CheckForUpdateResult, Unit> callback;
    private final Context context;
    private final DatabaseHolder databaseHolder;
    private final FileDownloader fileDownloader;
    private final UpdateEntity launchedUpdate;
    private final String loggerTimerLabel;
    private final SelectionPolicy selectionPolicy;
    private final UpdatesConfiguration updatesConfiguration;
    private final UpdatesLogger updatesLogger;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckForUpdateProcedure(Context context, UpdatesConfiguration updatesConfiguration, DatabaseHolder databaseHolder, UpdatesLogger updatesLogger, FileDownloader fileDownloader, SelectionPolicy selectionPolicy, UpdateEntity updateEntity, Function1<? super IUpdatesController.CheckForUpdateResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updatesConfiguration, "updatesConfiguration");
        Intrinsics.checkNotNullParameter(databaseHolder, "databaseHolder");
        Intrinsics.checkNotNullParameter(updatesLogger, "updatesLogger");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(selectionPolicy, "selectionPolicy");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.context = context;
        this.updatesConfiguration = updatesConfiguration;
        this.databaseHolder = databaseHolder;
        this.updatesLogger = updatesLogger;
        this.fileDownloader = fileDownloader;
        this.selectionPolicy = selectionPolicy;
        this.launchedUpdate = updateEntity;
        this.callback = callback;
        this.loggerTimerLabel = "timer-check-for-update";
    }

    @Override // expo.modules.updates.procedures.StateMachineProcedure
    public String getLoggerTimerLabel() {
        return this.loggerTimerLabel;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // expo.modules.updates.procedures.StateMachineProcedure
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object run(StateMachineProcedure.ProcedureContext procedureContext, Continuation<? super Unit> continuation) {
        CheckForUpdateProcedure$run$1 checkForUpdateProcedure$run$1;
        int i;
        UpdateEntity updateEntity;
        Object downloadRemoteUpdate;
        Exception e;
        StateMachineProcedure.ProcedureContext procedureContext2;
        if (continuation instanceof CheckForUpdateProcedure$run$1) {
            checkForUpdateProcedure$run$1 = (CheckForUpdateProcedure$run$1) continuation;
            if ((checkForUpdateProcedure$run$1.label & Integer.MIN_VALUE) != 0) {
                checkForUpdateProcedure$run$1.label -= Integer.MIN_VALUE;
                Object obj = checkForUpdateProcedure$run$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkForUpdateProcedure$run$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    procedureContext.processStateEvent(new UpdatesStateEvent.Check());
                    EmbeddedUpdate embeddedUpdate = EmbeddedManifestUtils.INSTANCE.getEmbeddedUpdate(this.context, this.updatesConfiguration);
                    updateEntity = embeddedUpdate != null ? embeddedUpdate.getUpdateEntity() : null;
                    JSONObject extraHeadersForRemoteUpdateRequest = FileDownloader.INSTANCE.getExtraHeadersForRemoteUpdateRequest(this.databaseHolder.getDatabase(), this.updatesConfiguration, this.launchedUpdate, updateEntity);
                    try {
                        checkForUpdateProcedure$run$1.L$0 = procedureContext;
                        checkForUpdateProcedure$run$1.L$1 = updateEntity;
                        checkForUpdateProcedure$run$1.label = 1;
                        downloadRemoteUpdate = downloadRemoteUpdate(extraHeadersForRemoteUpdateRequest, checkForUpdateProcedure$run$1);
                        if (downloadRemoteUpdate == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e2) {
                        procedureContext2 = procedureContext;
                        e = e2;
                        procedureContext2.processStateEvent(new UpdatesStateEvent.CheckError(LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(e)));
                        this.callback.invoke(new IUpdatesController.CheckForUpdateResult.ErrorResult(e));
                        procedureContext2.onComplete();
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    UpdateEntity updateEntity2 = (UpdateEntity) checkForUpdateProcedure$run$1.L$1;
                    procedureContext2 = (StateMachineProcedure.ProcedureContext) checkForUpdateProcedure$run$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        updateEntity = updateEntity2;
                        procedureContext = procedureContext2;
                        downloadRemoteUpdate = obj;
                    } catch (Exception e3) {
                        e = e3;
                        procedureContext2.processStateEvent(new UpdatesStateEvent.CheckError(LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(e)));
                        this.callback.invoke(new IUpdatesController.CheckForUpdateResult.ErrorResult(e));
                        procedureContext2.onComplete();
                        return Unit.INSTANCE;
                    }
                }
                processUpdatesResponse((UpdateResponse) downloadRemoteUpdate, procedureContext, updateEntity);
                return Unit.INSTANCE;
            }
        }
        checkForUpdateProcedure$run$1 = new CheckForUpdateProcedure$run$1(this, continuation);
        Object obj2 = checkForUpdateProcedure$run$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkForUpdateProcedure$run$1.label;
        if (i != 0) {
        }
        processUpdatesResponse((UpdateResponse) downloadRemoteUpdate, procedureContext, updateEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadRemoteUpdate(JSONObject jSONObject, Continuation<? super UpdateResponse> continuation) {
        CheckForUpdateProcedure$downloadRemoteUpdate$1 checkForUpdateProcedure$downloadRemoteUpdate$1;
        int i;
        try {
            if (continuation instanceof CheckForUpdateProcedure$downloadRemoteUpdate$1) {
                checkForUpdateProcedure$downloadRemoteUpdate$1 = (CheckForUpdateProcedure$downloadRemoteUpdate$1) continuation;
                if ((checkForUpdateProcedure$downloadRemoteUpdate$1.label & Integer.MIN_VALUE) != 0) {
                    checkForUpdateProcedure$downloadRemoteUpdate$1.label -= Integer.MIN_VALUE;
                    Object obj = checkForUpdateProcedure$downloadRemoteUpdate$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = checkForUpdateProcedure$downloadRemoteUpdate$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    FileDownloader fileDownloader = this.fileDownloader;
                    checkForUpdateProcedure$downloadRemoteUpdate$1.label = 1;
                    Object downloadRemoteUpdate = fileDownloader.downloadRemoteUpdate(jSONObject, checkForUpdateProcedure$downloadRemoteUpdate$1);
                    return downloadRemoteUpdate == coroutine_suspended ? coroutine_suspended : downloadRemoteUpdate;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            UpdatesLogger.info$default(this.updatesLogger, "Download cancelled for remote update check", null, 2, null);
            throw e;
        }
        checkForUpdateProcedure$downloadRemoteUpdate$1 = new CheckForUpdateProcedure$downloadRemoteUpdate$1(this, continuation);
        Object obj2 = checkForUpdateProcedure$downloadRemoteUpdate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkForUpdateProcedure$downloadRemoteUpdate$1.label;
    }

    private final void processUpdatesResponse(UpdateResponse updateResponse, StateMachineProcedure.ProcedureContext procedureContext, UpdateEntity embeddedUpdate) {
        boolean z;
        LoaderTask.RemoteCheckResultNotAvailableReason remoteCheckResultNotAvailableReason;
        UpdateEntity loadUpdateWithId;
        UpdateResponsePart.DirectiveUpdateResponsePart directiveUpdateResponsePart = updateResponse.getDirectiveUpdateResponsePart();
        UpdateDirective updateDirective = directiveUpdateResponsePart != null ? directiveUpdateResponsePart.getUpdateDirective() : null;
        UpdateResponsePart.ManifestUpdateResponsePart manifestUpdateResponsePart = updateResponse.getManifestUpdateResponsePart();
        Update update = manifestUpdateResponsePart != null ? manifestUpdateResponsePart.getUpdate() : null;
        if (updateDirective != null) {
            if (updateDirective instanceof UpdateDirective.NoUpdateAvailableUpdateDirective) {
                procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteUnavailable());
                this.callback.invoke(new IUpdatesController.CheckForUpdateResult.NoUpdateAvailable(LoaderTask.RemoteCheckResultNotAvailableReason.NO_UPDATE_AVAILABLE_ON_SERVER));
                procedureContext.onComplete();
                return;
            }
            if (!(updateDirective instanceof UpdateDirective.RollBackToEmbeddedUpdateDirective)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.updatesConfiguration.getHasEmbeddedUpdate()) {
                procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteUnavailable());
                this.callback.invoke(new IUpdatesController.CheckForUpdateResult.NoUpdateAvailable(LoaderTask.RemoteCheckResultNotAvailableReason.ROLLBACK_NO_EMBEDDED));
                procedureContext.onComplete();
                return;
            }
            if (embeddedUpdate == null) {
                procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteUnavailable());
                this.callback.invoke(new IUpdatesController.CheckForUpdateResult.NoUpdateAvailable(LoaderTask.RemoteCheckResultNotAvailableReason.ROLLBACK_NO_EMBEDDED));
                procedureContext.onComplete();
                return;
            }
            SelectionPolicy selectionPolicy = this.selectionPolicy;
            UpdateDirective.RollBackToEmbeddedUpdateDirective rollBackToEmbeddedUpdateDirective = (UpdateDirective.RollBackToEmbeddedUpdateDirective) updateDirective;
            UpdateEntity updateEntity = this.launchedUpdate;
            ResponseHeaderData responseHeaderData = updateResponse.getResponseHeaderData();
            if (!selectionPolicy.shouldLoadRollBackToEmbeddedDirective(rollBackToEmbeddedUpdateDirective, embeddedUpdate, updateEntity, responseHeaderData != null ? responseHeaderData.getManifestFilters() : null)) {
                procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteUnavailable());
                this.callback.invoke(new IUpdatesController.CheckForUpdateResult.NoUpdateAvailable(LoaderTask.RemoteCheckResultNotAvailableReason.ROLLBACK_REJECTED_BY_SELECTION_POLICY));
                procedureContext.onComplete();
                return;
            } else {
                procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteWithRollback(rollBackToEmbeddedUpdateDirective.getCommitTime()));
                this.callback.invoke(new IUpdatesController.CheckForUpdateResult.RollBackToEmbedded(rollBackToEmbeddedUpdateDirective.getCommitTime()));
                procedureContext.onComplete();
                return;
            }
        }
        if (update == null) {
            procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteUnavailable());
            this.callback.invoke(new IUpdatesController.CheckForUpdateResult.NoUpdateAvailable(LoaderTask.RemoteCheckResultNotAvailableReason.NO_UPDATE_AVAILABLE_ON_SERVER));
            procedureContext.onComplete();
            return;
        }
        if (this.launchedUpdate == null) {
            procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteWithUpdate(update.getManifest().getRawJson()));
            this.callback.invoke(new IUpdatesController.CheckForUpdateResult.UpdateAvailable(update));
            procedureContext.onComplete();
            return;
        }
        SelectionPolicy selectionPolicy2 = this.selectionPolicy;
        UpdateEntity updateEntity2 = update.getUpdateEntity();
        UpdateEntity updateEntity3 = this.launchedUpdate;
        ResponseHeaderData responseHeaderData2 = updateResponse.getResponseHeaderData();
        boolean shouldLoadNewUpdate = selectionPolicy2.shouldLoadNewUpdate(updateEntity2, updateEntity3, responseHeaderData2 != null ? responseHeaderData2.getManifestFilters() : null);
        if (shouldLoadNewUpdate) {
            UpdateEntity updateEntity4 = update.getUpdateEntity();
            if (updateEntity4 == null || (loadUpdateWithId = this.databaseHolder.getDatabase().updateDao().loadUpdateWithId(updateEntity4.getId())) == null) {
                z = false;
                r10 = true;
            } else {
                r10 = loadUpdateWithId.getFailedLaunchCount() == 0;
                UpdatesLogger.info$default(this.updatesLogger, "Stored update found: ID = " + updateEntity4.getId() + ", failureCount = " + loadUpdateWithId.getFailedLaunchCount(), null, 2, null);
                z = !r10;
            }
        } else {
            z = false;
        }
        if (r10) {
            procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteWithUpdate(update.getManifest().getRawJson()));
            this.callback.invoke(new IUpdatesController.CheckForUpdateResult.UpdateAvailable(update));
            procedureContext.onComplete();
        } else {
            if (z) {
                remoteCheckResultNotAvailableReason = LoaderTask.RemoteCheckResultNotAvailableReason.UPDATE_PREVIOUSLY_FAILED;
            } else {
                remoteCheckResultNotAvailableReason = LoaderTask.RemoteCheckResultNotAvailableReason.UPDATE_REJECTED_BY_SELECTION_POLICY;
            }
            procedureContext.processStateEvent(new UpdatesStateEvent.CheckCompleteUnavailable());
            this.callback.invoke(new IUpdatesController.CheckForUpdateResult.NoUpdateAvailable(remoteCheckResultNotAvailableReason));
            procedureContext.onComplete();
        }
    }
}
