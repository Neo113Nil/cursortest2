package expo.modules.updates.loader;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* compiled from: FileDownloader.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lexpo/modules/updates/loader/FileDownloadProgressResponseBody;", "Lokhttp3/ResponseBody;", "responseBody", "progressListener", "Lexpo/modules/updates/loader/FileDownloadProgressListener;", "<init>", "(Lokhttp3/ResponseBody;Lexpo/modules/updates/loader/FileDownloadProgressListener;)V", "contentType", "Lokhttp3/MediaType;", "contentLength", "", "bufferedSource", "Lokio/BufferedSource;", "getBufferedSource", "()Lokio/BufferedSource;", "bufferedSource$delegate", "Lkotlin/Lazy;", "source", "Lokio/Source;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FileDownloadProgressResponseBody extends ResponseBody {

    /* renamed from: bufferedSource$delegate, reason: from kotlin metadata */
    private final Lazy bufferedSource;
    private final FileDownloadProgressListener progressListener;
    private final ResponseBody responseBody;

    public FileDownloadProgressResponseBody(ResponseBody responseBody, FileDownloadProgressListener progressListener) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.responseBody = responseBody;
        this.progressListener = progressListener;
        this.bufferedSource = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.loader.FileDownloadProgressResponseBody$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BufferedSource bufferedSource_delegate$lambda$0;
                bufferedSource_delegate$lambda$0 = FileDownloadProgressResponseBody.bufferedSource_delegate$lambda$0(FileDownloadProgressResponseBody.this);
                return bufferedSource_delegate$lambda$0;
            }
        });
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return this.responseBody.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public long getContentLength() {
        return this.responseBody.getContentLength();
    }

    private final BufferedSource getBufferedSource() {
        return (BufferedSource) this.bufferedSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BufferedSource bufferedSource_delegate$lambda$0(FileDownloadProgressResponseBody fileDownloadProgressResponseBody) {
        return Okio.buffer(fileDownloadProgressResponseBody.source(fileDownloadProgressResponseBody.responseBody.getBodySource()));
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public BufferedSource getBodySource() {
        return getBufferedSource();
    }

    private final Source source(final Source source) {
        return new ForwardingSource(source) { // from class: expo.modules.updates.loader.FileDownloadProgressResponseBody$source$1
            private long totalBytesRead;

            public final long getTotalBytesRead() {
                return this.totalBytesRead;
            }

            public final void setTotalBytesRead(long j) {
                this.totalBytesRead = j;
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer sink, long byteCount) {
                FileDownloadProgressListener fileDownloadProgressListener;
                ResponseBody responseBody;
                Intrinsics.checkNotNullParameter(sink, "sink");
                long read = super.read(sink, byteCount);
                this.totalBytesRead += read != -1 ? read : 0L;
                fileDownloadProgressListener = this.progressListener;
                long j = this.totalBytesRead;
                responseBody = this.responseBody;
                fileDownloadProgressListener.update(j, responseBody.getContentLength());
                return read;
            }
        };
    }
}
