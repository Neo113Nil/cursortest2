package com.yanzhenjie.kalle;

import android.text.TextUtils;
import com.yanzhenjie.kalle.m;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes4.dex */
public class u extends com.yanzhenjie.kalle.a implements p {
    private final Charset mCharset;
    private final String mContentType;
    private final m mParams;

    public static class b {
        private Charset mCharset;
        private String mContentType;
        private m.b mParams;

        public u build() {
            return new u(this);
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

    public static b newBuilder() {
        return new b();
    }

    @Override // com.yanzhenjie.kalle.a, com.yanzhenjie.kalle.f
    public long contentLength() {
        return com.yanzhenjie.kalle.util.a.toByteArray(this.mParams.toString(true), this.mCharset).length;
    }

    @Override // com.yanzhenjie.kalle.a, com.yanzhenjie.kalle.f
    public String contentType() {
        return this.mContentType + "; charset=" + this.mCharset.name();
    }

    public m copyParams() {
        return this.mParams;
    }

    @Override // com.yanzhenjie.kalle.a
    protected void onWrite(OutputStream outputStream) {
        com.yanzhenjie.kalle.util.a.write(outputStream, this.mParams.toString(true), this.mCharset);
    }

    public String toString() {
        return toString(false);
    }

    private u(b bVar) {
        this.mParams = bVar.mParams.build();
        this.mCharset = bVar.mCharset == null ? k.getConfig().getCharset() : bVar.mCharset;
        this.mContentType = TextUtils.isEmpty(bVar.mContentType) ? i.VALUE_APPLICATION_URLENCODED : bVar.mContentType;
    }

    public String toString(boolean z7) {
        return this.mParams.toString(z7);
    }
}
