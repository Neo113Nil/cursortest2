package com.yanzhenjie.kalle.simple;

/* loaded from: classes4.dex */
public final class j {
    private final int mCode;
    private final Object mFailed;
    private final boolean mFromCache;
    private final com.yanzhenjie.kalle.i mHeaders;
    private final Object mSucceed;

    public static final class b {
        private int mCode;
        private Object mFailed;
        private boolean mFromCache;
        private com.yanzhenjie.kalle.i mHeaders;
        private Object mSucceed;

        public j build() {
            return new j(this);
        }

        public b code(int i8) {
            this.mCode = i8;
            return this;
        }

        public b failed(Object obj) {
            this.mFailed = obj;
            return this;
        }

        public b fromCache(boolean z7) {
            this.mFromCache = z7;
            return this;
        }

        public b headers(com.yanzhenjie.kalle.i iVar) {
            this.mHeaders = iVar;
            return this;
        }

        public b succeed(Object obj) {
            this.mSucceed = obj;
            return this;
        }

        private b() {
        }
    }

    public static <Succeed, Failed> b newBuilder() {
        return new b();
    }

    public int code() {
        return this.mCode;
    }

    public Object failed() {
        return this.mFailed;
    }

    public boolean fromCache() {
        return this.mFromCache;
    }

    public com.yanzhenjie.kalle.i headers() {
        return this.mHeaders;
    }

    public boolean isSucceed() {
        return this.mFailed == null || this.mSucceed != null;
    }

    public Object succeed() {
        return this.mSucceed;
    }

    private j(b bVar) {
        this.mCode = bVar.mCode;
        this.mHeaders = bVar.mHeaders;
        this.mFromCache = bVar.mFromCache;
        this.mSucceed = bVar.mSucceed;
        this.mFailed = bVar.mFailed;
    }
}
