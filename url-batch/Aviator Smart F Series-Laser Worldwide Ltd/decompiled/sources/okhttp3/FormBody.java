package okhttp3;

import com.yanzhenjie.kalle.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okio.c;
import okio.d;

/* loaded from: classes5.dex */
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get(i.VALUE_APPLICATION_URLENCODED);

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder add(String name, String value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String name, String value) {
            s.checkNotNullParameter(name, "name");
            s.checkNotNullParameter(value, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i8, o oVar) {
            this((i8 & 1) != 0 ? null : charset);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public FormBody(List<String> encodedNames, List<String> encodedValues) {
        s.checkNotNullParameter(encodedNames, "encodedNames");
        s.checkNotNullParameter(encodedValues, "encodedValues");
        this.encodedNames = Util.toImmutableList(encodedNames);
        this.encodedValues = Util.toImmutableList(encodedValues);
    }

    private final long writeOrCountBytes(d dVar, boolean z7) {
        c buffer;
        if (z7) {
            buffer = new c();
        } else {
            s.checkNotNull(dVar);
            buffer = dVar.getBuffer();
        }
        int size = this.encodedNames.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.encodedNames.get(i8));
            buffer.writeByte(61);
            buffer.writeUtf8(this.encodedValues.get(i8));
            i8 = i9;
        }
        if (!z7) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m1340deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i8) {
        return this.encodedNames.get(i8);
    }

    public final String encodedValue(int i8) {
        return this.encodedValues.get(i8);
    }

    public final String name(int i8) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i8), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i8) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i8), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d sink) {
        s.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
