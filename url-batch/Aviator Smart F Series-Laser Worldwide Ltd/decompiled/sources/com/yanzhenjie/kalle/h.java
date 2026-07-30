package com.yanzhenjie.kalle;

import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import com.yanzhenjie.kalle.m;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes4.dex */
public class h extends com.yanzhenjie.kalle.a implements p {
    private String mBoundary;
    private final Charset mCharset;
    private final String mContentType;
    private final m mParams;

    public static class b {
        private Charset mCharset;
        private String mContentType;
        private m.b mParams;

        public b binaries(String str, List<com.yanzhenjie.kalle.b> list) {
            this.mParams.binaries(str, list);
            return this;
        }

        public b binary(String str, com.yanzhenjie.kalle.b bVar) {
            this.mParams.binary(str, bVar);
            return this;
        }

        public h build() {
            return new h(this);
        }

        public b charset(Charset charset) {
            this.mCharset = charset;
            return this;
        }

        public b clearParams() {
            this.mParams.clear();
            return this;
        }

        public b contentType(String str) {
            this.mContentType = str;
            return this;
        }

        public b file(String str, File file) {
            this.mParams.file(str, file);
            return this;
        }

        public b files(String str, List<File> list) {
            this.mParams.files(str, list);
            return this;
        }

        public b param(String str, int i8) {
            this.mParams.add(str, i8);
            return this;
        }

        public b params(m mVar) {
            this.mParams.add(mVar);
            return this;
        }

        public b removeParam(String str) {
            this.mParams.remove(str);
            return this;
        }

        private b() {
            this.mParams = m.newBuilder();
        }

        public b param(String str, long j8) {
            this.mParams.add(str, j8);
            return this;
        }

        public b param(String str, boolean z7) {
            this.mParams.add(str, z7);
            return this;
        }

        public b param(String str, char c8) {
            this.mParams.add(str, c8);
            return this;
        }

        public b param(String str, double d8) {
            this.mParams.add(str, d8);
            return this;
        }

        public b param(String str, float f8) {
            this.mParams.add(str, f8);
            return this;
        }

        public b param(String str, short s7) {
            this.mParams.add(str, s7);
            return this;
        }

        public b param(String str, CharSequence charSequence) {
            this.mParams.add(str, charSequence);
            return this;
        }

        public b param(String str, String str2) {
            this.mParams.add(str, (CharSequence) str2);
            return this;
        }

        public b param(String str, List<String> list) {
            this.mParams.add(str, list);
            return this;
        }
    }

    private static String createBoundary() {
        StringBuilder sb = new StringBuilder("-------FormBoundary");
        for (int i8 = 1; i8 < 12; i8++) {
            long currentTimeMillis = System.currentTimeMillis() + i8;
            long j8 = currentTimeMillis % 3;
            if (j8 == 0) {
                sb.append(((char) currentTimeMillis) % '\t');
            } else if (j8 == 1) {
                sb.append((char) ((currentTimeMillis % 26) + 65));
            } else {
                sb.append((char) ((currentTimeMillis % 26) + 97));
            }
        }
        return sb.toString();
    }

    public static b newBuilder() {
        return new b();
    }

    private void writeFormBinary(OutputStream outputStream, String str, com.yanzhenjie.kalle.b bVar) {
        com.yanzhenjie.kalle.util.a.write(outputStream, HttpClient.ENDFLAG + this.mBoundary + "\r\n", this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, "Content-Disposition: form-data; name=\"" + str + "\"", this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, "; filename=\"" + bVar.name() + "\"", this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, "\r\n", this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, "Content-Type: " + bVar.contentType() + "\r\n\r\n", this.mCharset);
        if (outputStream instanceof com.yanzhenjie.kalle.util.b) {
            ((com.yanzhenjie.kalle.util.b) outputStream).write(bVar.contentLength());
        } else {
            bVar.writeTo(outputStream);
        }
        com.yanzhenjie.kalle.util.a.write(outputStream, "\r\n", this.mCharset);
    }

    private void writeFormString(OutputStream outputStream, String str, String str2) {
        com.yanzhenjie.kalle.util.a.write(outputStream, HttpClient.ENDFLAG + this.mBoundary + "\r\n", this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, "Content-Disposition: form-data; name=\"" + str + "\"", this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, "\r\n\r\n", this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, str2, this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, "\r\n", this.mCharset);
    }

    @Override // com.yanzhenjie.kalle.a, com.yanzhenjie.kalle.f
    public long contentLength() {
        com.yanzhenjie.kalle.util.b bVar = new com.yanzhenjie.kalle.util.b();
        try {
            onWrite(bVar);
        } catch (IOException unused) {
        }
        return bVar.getLength();
    }

    @Override // com.yanzhenjie.kalle.a, com.yanzhenjie.kalle.f
    public String contentType() {
        return this.mContentType + "; boundary=" + this.mBoundary;
    }

    public m copyParams() {
        return this.mParams;
    }

    @Override // com.yanzhenjie.kalle.a
    protected void onWrite(OutputStream outputStream) {
        for (String str : this.mParams.keySet()) {
            for (Object obj : this.mParams.get(str)) {
                if (obj instanceof String) {
                    writeFormString(outputStream, str, (String) obj);
                } else if (obj instanceof com.yanzhenjie.kalle.b) {
                    writeFormBinary(outputStream, str, (com.yanzhenjie.kalle.b) obj);
                }
            }
        }
        com.yanzhenjie.kalle.util.a.write(outputStream, "\r\n", this.mCharset);
        com.yanzhenjie.kalle.util.a.write(outputStream, HttpClient.ENDFLAG + this.mBoundary + "--\r\n", this.mCharset);
    }

    private h(b bVar) {
        this.mCharset = bVar.mCharset == null ? k.getConfig().getCharset() : bVar.mCharset;
        this.mContentType = TextUtils.isEmpty(bVar.mContentType) ? i.VALUE_APPLICATION_FORM : bVar.mContentType;
        this.mParams = bVar.mParams.build();
        this.mBoundary = createBoundary();
    }
}
