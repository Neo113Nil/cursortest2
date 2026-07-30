package y;

import java.io.File;
import kotlin.jvm.internal.s;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.j0;
import okio.x0;

/* loaded from: classes.dex */
public abstract class f {

    public static final class a extends RequestBody {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaType f17329a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f17330b;

        public a(MediaType mediaType, File file) {
            this.f17329a = mediaType;
            this.f17330b = file;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f17330b.length();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f17329a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.d sink) {
            s.checkNotNullParameter(sink, "sink");
            x0 source = j0.source(this.f17330b);
            try {
                sink.writeAll(source);
                kotlin.io.b.closeFinally(source, null);
            } finally {
            }
        }
    }

    public static /* synthetic */ RequestBody a(File file, MediaType mediaType, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            mediaType = null;
        }
        return a(file, mediaType);
    }

    public static final RequestBody a(File file, MediaType mediaType) {
        s.checkNotNullParameter(file, "<this>");
        if (mediaType == null) {
            mediaType = com.drake.net.utils.a.mediaType(file);
        }
        return new a(mediaType, file);
    }
}
