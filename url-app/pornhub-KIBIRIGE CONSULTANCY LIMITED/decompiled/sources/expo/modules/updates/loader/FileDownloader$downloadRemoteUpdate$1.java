package expo.modules.updates.loader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileDownloader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.FileDownloader", f = "FileDownloader.kt", i = {}, l = {323}, m = "downloadRemoteUpdate", n = {}, s = {})
/* loaded from: classes2.dex */
final class FileDownloader$downloadRemoteUpdate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileDownloader$downloadRemoteUpdate$1(FileDownloader fileDownloader, Continuation<? super FileDownloader$downloadRemoteUpdate$1> continuation) {
        super(continuation);
        this.this$0 = fileDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.downloadRemoteUpdate(null, this);
    }
}
