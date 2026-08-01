package expo.modules.updates.loader;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileDownloader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.FileDownloader", f = "FileDownloader.kt", i = {0, 0}, l = {363}, m = "downloadAsset", n = {UriUtil.LOCAL_ASSET_SCHEME, "filename"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class FileDownloader$downloadAsset$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileDownloader$downloadAsset$1(FileDownloader fileDownloader, Continuation<? super FileDownloader$downloadAsset$1> continuation) {
        super(continuation);
        this.this$0 = fileDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.downloadAsset(null, null, null, null, this);
    }
}
