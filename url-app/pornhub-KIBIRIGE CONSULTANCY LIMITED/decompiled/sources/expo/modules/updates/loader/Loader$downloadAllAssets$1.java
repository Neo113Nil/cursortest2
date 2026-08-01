package expo.modules.updates.loader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Loader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.Loader", f = "Loader.kt", i = {0, 0, 0}, l = {212, 234}, m = "downloadAllAssets", n = {"update", "embeddedUpdate", "assetDownloadJobs"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class Loader$downloadAllAssets$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Loader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Loader$downloadAllAssets$1(Loader loader, Continuation<? super Loader$downloadAllAssets$1> continuation) {
        super(continuation);
        this.this$0 = loader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object downloadAllAssets;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        downloadAllAssets = this.this$0.downloadAllAssets(null, this);
        return downloadAllAssets;
    }
}
