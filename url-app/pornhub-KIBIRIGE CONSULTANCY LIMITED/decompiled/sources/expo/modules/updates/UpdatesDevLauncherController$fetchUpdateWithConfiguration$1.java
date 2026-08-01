package expo.modules.updates;

import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.Loader;
import expo.modules.updates.loader.RemoteLoader;
import expo.modules.updates.loader.UpdateDirective;
import expo.modules.updates.loader.UpdateResponse;
import expo.modules.updates.loader.UpdateResponsePart;
import expo.modules.updates.manifest.Update;
import expo.modules.updatesinterface.UpdatesInterface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: UpdatesDevLauncherController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.UpdatesDevLauncherController$fetchUpdateWithConfiguration$1", f = "UpdatesDevLauncherController.kt", i = {0, 1}, l = {182, 203}, m = "invokeSuspend", n = {"progressJob", "progressJob"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class UpdatesDevLauncherController$fetchUpdateWithConfiguration$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UpdatesInterface.UpdateCallback $callback;
    final /* synthetic */ FileDownloader $fileDownloader;
    final /* synthetic */ RemoteLoader $loader;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpdatesDevLauncherController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatesDevLauncherController$fetchUpdateWithConfiguration$1(RemoteLoader remoteLoader, UpdatesInterface.UpdateCallback updateCallback, UpdatesDevLauncherController updatesDevLauncherController, FileDownloader fileDownloader, Continuation<? super UpdatesDevLauncherController$fetchUpdateWithConfiguration$1> continuation) {
        super(2, continuation);
        this.$loader = remoteLoader;
        this.$callback = updateCallback;
        this.this$0 = updatesDevLauncherController;
        this.$fileDownloader = fileDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpdatesDevLauncherController$fetchUpdateWithConfiguration$1 updatesDevLauncherController$fetchUpdateWithConfiguration$1 = new UpdatesDevLauncherController$fetchUpdateWithConfiguration$1(this.$loader, this.$callback, this.this$0, this.$fileDownloader, continuation);
        updatesDevLauncherController$fetchUpdateWithConfiguration$1.L$0 = obj;
        return updatesDevLauncherController$fetchUpdateWithConfiguration$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdatesDevLauncherController$fetchUpdateWithConfiguration$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.Job] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UpdatesConfiguration updatesConfiguration;
        Job job;
        Job launch$default;
        Job job2;
        UpdatesConfiguration updatesConfiguration2;
        Object launchUpdate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            try {
            } catch (Exception e) {
                UpdatesDevLauncherController updatesDevLauncherController = this.this$0;
                updatesConfiguration = updatesDevLauncherController.previousUpdatesConfiguration;
                updatesDevLauncherController.updatesConfiguration = updatesConfiguration;
                this.$callback.onFailure(e);
                job = r1;
            }
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                launch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new UpdatesDevLauncherController$fetchUpdateWithConfiguration$1$progressJob$1(this.$loader, this.$callback, null), 3, null);
                RemoteLoader remoteLoader = this.$loader;
                final UpdatesInterface.UpdateCallback updateCallback = this.$callback;
                this.L$0 = launch$default;
                this.label = 1;
                obj = remoteLoader.load(new Function1() { // from class: expo.modules.updates.UpdatesDevLauncherController$fetchUpdateWithConfiguration$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Loader.OnUpdateResponseLoadedResult invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = UpdatesDevLauncherController$fetchUpdateWithConfiguration$1.invokeSuspend$lambda$0(UpdatesInterface.UpdateCallback.this, (UpdateResponse) obj2);
                        return invokeSuspend$lambda$0;
                    }
                }, this);
                job2 = launch$default;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job job3 = (Job) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    job = job3;
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
                Job job4 = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                job2 = job4;
            }
            Loader.LoaderResult loaderResult = (Loader.LoaderResult) obj;
            if (loaderResult.getUpdateEntity() == null) {
                this.$callback.onSuccess(null);
                Unit unit = Unit.INSTANCE;
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                return unit;
            }
            UpdatesDevLauncherController updatesDevLauncherController2 = this.this$0;
            UpdateEntity updateEntity = loaderResult.getUpdateEntity();
            updatesConfiguration2 = this.this$0.updatesConfiguration;
            Intrinsics.checkNotNull(updatesConfiguration2);
            this.L$0 = job2;
            this.label = 2;
            launchUpdate = updatesDevLauncherController2.launchUpdate(updateEntity, updatesConfiguration2, this.$fileDownloader, this.$callback, this);
            job = job2;
        } catch (Throwable th) {
            Job.DefaultImpls.cancel$default((Job) r1, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Loader.OnUpdateResponseLoadedResult invokeSuspend$lambda$0(UpdatesInterface.UpdateCallback updateCallback, UpdateResponse updateResponse) {
        Update update;
        UpdateResponsePart.DirectiveUpdateResponsePart directiveUpdateResponsePart = updateResponse.getDirectiveUpdateResponsePart();
        UpdateDirective updateDirective = directiveUpdateResponsePart != null ? directiveUpdateResponsePart.getUpdateDirective() : null;
        if (updateDirective != null) {
            if ((updateDirective instanceof UpdateDirective.RollBackToEmbeddedUpdateDirective) || (updateDirective instanceof UpdateDirective.NoUpdateAvailableUpdateDirective)) {
                return new Loader.OnUpdateResponseLoadedResult(false);
            }
            throw new NoWhenBranchMatchedException();
        }
        UpdateResponsePart.ManifestUpdateResponsePart manifestUpdateResponsePart = updateResponse.getManifestUpdateResponsePart();
        if (manifestUpdateResponsePart == null || (update = manifestUpdateResponsePart.getUpdate()) == null) {
            return new Loader.OnUpdateResponseLoadedResult(false);
        }
        return new Loader.OnUpdateResponseLoadedResult(updateCallback.onManifestLoaded(update.getManifest().getRawJson()));
    }
}
