package retrofit2;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import io.noties.markwon.MarkwonImpl;
import java.util.regex.Pattern;
import kotlin.UnsignedKt;
import kotlin.text.Regex;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.BufferedSink;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class RequestBuilder {
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final HttpUrl baseUrl;
    public RequestBody body;
    public MediaType contentType;
    public final FormBody.Builder formBuilder;
    public final boolean hasBody;
    public final Headers.Builder headersBuilder;
    public final String method;
    public final MarkwonImpl multipartBuilder;
    public String relativeUrl;
    public final Request.Builder requestBuilder = new Request.Builder();
    public HttpUrl.Builder urlBuilder;

    /* loaded from: classes9.dex */
    public final class ContentTypeOverridingRequestBody extends RequestBody {
        public final MediaType contentType;
        public final RequestBody delegate;

        public ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.delegate = requestBody;
            this.contentType = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.RequestBody
        public final MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(BufferedSink bufferedSink) {
            this.delegate.writeTo(bufferedSink);
        }
    }

    public RequestBuilder(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        this.contentType = mediaType;
        this.hasBody = z;
        if (headers != null) {
            this.headersBuilder = headers.newBuilder();
        } else {
            this.headersBuilder = new Headers.Builder();
        }
        if (z2) {
            this.formBuilder = new FormBody.Builder();
        } else if (z3) {
            MarkwonImpl markwonImpl = new MarkwonImpl();
            this.multipartBuilder = markwonImpl;
            markwonImpl.setType(MultipartBody.FORM);
        }
    }

    public final void addHeader(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = MediaType.TYPE_SUBTYPE;
                this.contentType = UnsignedKt.get(str2);
                return;
            } catch (IllegalArgumentException e) {
                Handlers$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Malformed content type: ", str2), e);
                return;
            }
        }
        Headers.Builder builder = this.headersBuilder;
        if (z) {
            builder.addUnsafeNonAscii(str, str2);
        } else {
            builder.add(str, str2);
        }
    }

    public final void addQueryParam(String str, String str2, boolean z) {
        HttpUrl.Builder builder;
        String str3 = this.relativeUrl;
        if (str3 != null) {
            HttpUrl httpUrl = this.baseUrl;
            httpUrl.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.parse$okhttp(httpUrl, str3);
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            this.urlBuilder = builder;
            if (builder == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                Handlers$$ExternalSyntheticBUOutline0.m(sb, ", Relative: ", this.relativeUrl);
                return;
            }
            this.relativeUrl = null;
        }
        HttpUrl.Builder builder2 = this.urlBuilder;
        if (z) {
            builder2.addEncodedQueryParameter(str, str2);
        } else {
            builder2.addQueryParameter(str, str2);
        }
    }
}
