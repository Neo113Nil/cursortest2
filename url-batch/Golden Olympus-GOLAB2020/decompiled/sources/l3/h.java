package l3;

import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public interface h {

    /* renamed from: L2, reason: collision with root package name */
    public static final a f41350L2 = a.f41351a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f41351a = new a();

        private a() {
        }

        public static /* synthetic */ h c(a aVar, String str, String str2, Charset charset, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                charset = Charsets.UTF_8;
            }
            return aVar.b(str, str2, charset);
        }

        public final h a(String contentType, byte[] content) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(content, "content");
            return new l3.a(contentType, content);
        }

        public final h b(String contentType, String content, Charset charset) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = content.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new l3.a(contentType, bytes);
        }
    }

    void a(OutputStream outputStream);

    String getContentType();

    long m();
}
