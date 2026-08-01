package expo.modules.updates.loader;

import com.facebook.imageutils.JfifUtil;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.Loader;
import expo.modules.updates.manifest.Update;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Loader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/updates/loader/Loader$AssetLoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.Loader$downloadAllAssets$job$1", f = "Loader.kt", i = {}, l = {JfifUtil.MARKER_EOI, JfifUtil.MARKER_APP1}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class Loader$downloadAllAssets$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Loader.AssetLoadResult>, Object> {
    final /* synthetic */ Ref.ObjectRef<AssetEntity> $assetEntity;
    final /* synthetic */ Update $embeddedUpdate;
    final /* synthetic */ Update $update;
    int label;
    final /* synthetic */ Loader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Loader$downloadAllAssets$job$1(Loader loader, Ref.ObjectRef<AssetEntity> objectRef, Update update, Update update2, Continuation<? super Loader$downloadAllAssets$job$1> continuation) {
        super(2, continuation);
        this.this$0 = loader;
        this.$assetEntity = objectRef;
        this.$update = update;
        this.$embeddedUpdate = update2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Loader$downloadAllAssets$job$1(this.this$0, this.$assetEntity, this.$update, this.$embeddedUpdate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Loader.AssetLoadResult> continuation) {
        return ((Loader$downloadAllAssets$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r11 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File file;
        UpdatesConfiguration updatesConfiguration;
        Object handleAssetDownloadCompleted;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Loader loader = this.this$0;
            AssetEntity assetEntity = this.$assetEntity.element;
            file = this.this$0.updatesDirectory;
            updatesConfiguration = this.this$0.configuration;
            UpdateEntity updateEntity = this.$update.getUpdateEntity();
            Update update = this.$embeddedUpdate;
            UpdateEntity updateEntity2 = update != null ? update.getUpdateEntity() : null;
            this.label = 1;
            obj = loader.loadAsset(assetEntity, file, updatesConfiguration, updateEntity, updateEntity2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
        }
        FileDownloader.AssetDownloadResult assetDownloadResult = (FileDownloader.AssetDownloadResult) obj;
        Loader loader2 = this.this$0;
        AssetEntity assetEntity2 = assetDownloadResult.getAssetEntity();
        Loader.AssetLoadResult assetLoadResult = assetDownloadResult.isNew() ? Loader.AssetLoadResult.FINISHED : Loader.AssetLoadResult.ALREADY_EXISTS;
        this.label = 2;
        handleAssetDownloadCompleted = loader2.handleAssetDownloadCompleted(assetEntity2, assetLoadResult, this);
        return handleAssetDownloadCompleted == coroutine_suspended ? coroutine_suspended : handleAssetDownloadCompleted;
    }
}
