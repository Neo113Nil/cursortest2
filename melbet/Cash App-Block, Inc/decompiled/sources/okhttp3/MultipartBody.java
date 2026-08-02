package okhttp3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.UnsignedKt;
import kotlin.text.Regex;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes9.dex */
public final class MultipartBody extends RequestBody {
    public static final byte[] COLONSPACE;
    public static final byte[] CRLF;
    public static final byte[] DASHDASH;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public final ByteString boundaryByteString;
    public long contentLength;
    public final MediaType contentType;
    public final List parts;

    /* renamed from: type, reason: collision with root package name */
    public final MediaType f1546type;

    static {
        Regex regex = MediaType.TYPE_SUBTYPE;
        MIXED = UnsignedKt.get("multipart/mixed");
        UnsignedKt.get("multipart/alternative");
        UnsignedKt.get("multipart/digest");
        UnsignedKt.get("multipart/parallel");
        FORM = UnsignedKt.get("multipart/form-data");
        COLONSPACE = new byte[]{58, PnmConstants.PNM_SEPARATOR};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, List list) {
        byteString.getClass();
        mediaType.getClass();
        list.getClass();
        this.boundaryByteString = byteString;
        this.f1546type = mediaType;
        this.parts = list;
        Regex regex = MediaType.TYPE_SUBTYPE;
        this.contentType = UnsignedKt.get(mediaType + "; boundary=" + byteString.utf8());
        this.contentLength = -1L;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes$1 = writeOrCountBytes$1(null, true);
        this.contentLength = writeOrCountBytes$1;
        return writeOrCountBytes$1;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        List list = this.parts;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).body.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long writeOrCountBytes$1(BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        BufferedSink bufferedSink2;
        if (z) {
            bufferedSink2 = new Buffer();
            buffer = bufferedSink2;
        } else {
            buffer = 0;
            bufferedSink2 = bufferedSink;
        }
        List list = this.parts;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.boundaryByteString;
            byte[] bArr = DASHDASH;
            byte[] bArr2 = CRLF;
            if (i >= size) {
                bufferedSink2.getClass();
                bufferedSink2.write(bArr);
                bufferedSink2.write(byteString);
                bufferedSink2.write(bArr);
                bufferedSink2.write(bArr2);
                if (!z) {
                    return j;
                }
                buffer.getClass();
                long j2 = j + buffer.size;
                buffer.clear();
                return j2;
            }
            Part part = (Part) list.get(i);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            bufferedSink2.getClass();
            bufferedSink2.write(bArr);
            bufferedSink2.write(byteString);
            bufferedSink2.write(bArr2);
            int size2 = headers.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bufferedSink2.writeUtf8(headers.name(i2)).write(COLONSPACE).writeUtf8(headers.value(i2)).write(bArr2);
            }
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                bufferedSink2.writeUtf8("Content-Type: ").writeUtf8(contentType.mediaType).write(bArr2);
            }
            long contentLength = requestBody.contentLength();
            if (contentLength == -1 && z) {
                buffer.getClass();
                buffer.clear();
                return -1L;
            }
            bufferedSink2.write(bArr2);
            if (z) {
                j += contentLength;
            } else {
                requestBody.writeTo(bufferedSink2);
            }
            bufferedSink2.write(bArr2);
            i++;
        }
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        writeOrCountBytes$1(bufferedSink, false);
    }

    /* loaded from: classes4.dex */
    public abstract class Companion {
        public static final /* synthetic */ Serializable a(Bundle bundle, String str) {
            if (bundle == null || !bundle.containsKey(str)) {
                return null;
            }
            return bundle.getSerializable(str);
        }

        public static void appendQuotedString$okhttp(StringBuilder sb, String str) {
            str.getClass();
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }

        public static final /* synthetic */ Boolean b(Bundle bundle, String str) {
            if (bundle == null || !bundle.containsKey(str)) {
                return null;
            }
            return Boolean.valueOf(bundle.getBoolean(str, false));
        }

        public static final /* synthetic */ Float c(Bundle bundle, String str) {
            if (bundle == null || !bundle.containsKey(str)) {
                return null;
            }
            return Float.valueOf(bundle.getFloat(str, RecyclerView.DECELERATION_RATE));
        }

        public static final /* synthetic */ Integer d(Bundle bundle, String str) {
            if (bundle == null || !bundle.containsKey(str)) {
                return null;
            }
            return Integer.valueOf(bundle.getInt(str, 0));
        }

        public static final /* synthetic */ String e(Bundle bundle) {
            if (bundle == null || !bundle.containsKey("successViewSoundUri")) {
                return null;
            }
            return bundle.getString("successViewSoundUri", "");
        }

        public static final /* synthetic */ Animation a(Context context, int i) {
            context.getClass();
            if (i != 0) {
                return AnimationUtils.loadAnimation(context, i);
            }
            return null;
        }

        public static final /* synthetic */ Drawable b(Context context, int i) {
            context.getClass();
            if (i != 0) {
                return DimensionKt.getDrawable(context, i);
            }
            return null;
        }
    }

    public final class Part {
        public final RequestBody body;
        public final Headers headers;

        public Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public abstract class Companion {
            public static Part createFormData(String str, String str2, RequestBody requestBody) {
                StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("form-data; name=");
                MediaType mediaType = MultipartBody.MIXED;
                Companion.appendQuotedString$okhttp(m, str);
                if (str2 != null) {
                    m.append("; filename=");
                    Companion.appendQuotedString$okhttp(m, str2);
                }
                String sb = m.toString();
                Headers.Builder builder = new Headers.Builder();
                builder.addUnsafeNonAscii("Content-Disposition", sb);
                Headers build = builder.build();
                if (build.get("Content-Type") != null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unexpected header: Content-Type");
                    return null;
                }
                if (build.get("Content-Length") == null) {
                    return new Part(build, requestBody);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Unexpected header: Content-Length");
                return null;
            }

            public static final EquityType toEquityType(InvestmentEntityType investmentEntityType) {
                investmentEntityType.getClass();
                int ordinal = investmentEntityType.ordinal();
                if (ordinal == 0) {
                    return null;
                }
                if (ordinal == 1) {
                    return EquityType.STOCK;
                }
                if (ordinal == 2) {
                    return EquityType.ETF;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }

            public static Part createFormData(String str, String str2) {
                str2.getClass();
                RequestBody.Companion.getClass();
                return createFormData(str, null, RequestBody.Companion.create(str2, null));
            }
        }
    }
}
