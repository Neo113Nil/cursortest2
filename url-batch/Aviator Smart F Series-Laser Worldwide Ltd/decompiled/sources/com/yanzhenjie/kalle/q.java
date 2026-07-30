package com.yanzhenjie.kalle;

import java.io.Closeable;

/* loaded from: classes4.dex */
public final class q implements Closeable {
    private final r mBody;
    private final int mCode;
    private final i mHeaders;

    public static final class b {
        private r mBody;
        private int mCode;
        private i mHeaders;

        public b body(r rVar) {
            this.mBody = rVar;
            return this;
        }

        public q build() {
            return new q(this);
        }

        public b code(int i8) {
            this.mCode = i8;
            return this;
        }

        public b headers(i iVar) {
            this.mHeaders = iVar;
            return this;
        }
    }

    public static b newBuilder() {
        return new b();
    }

    public r body() {
        return this.mBody;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.yanzhenjie.kalle.util.a.closeQuietly(this.mBody);
    }

    public int code() {
        return this.mCode;
    }

    public i headers() {
        return this.mHeaders;
    }

    public boolean isRedirect() {
        int i8 = this.mCode;
        if (i8 == 307 || i8 == 308) {
            return true;
        }
        switch (i8) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private q(b bVar) {
        this.mCode = bVar.mCode;
        this.mHeaders = bVar.mHeaders;
        this.mBody = bVar.mBody;
    }
}
