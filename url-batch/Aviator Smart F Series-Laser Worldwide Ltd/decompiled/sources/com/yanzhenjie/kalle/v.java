package com.yanzhenjie.kalle;

import com.yanzhenjie.kalle.o;
import com.yanzhenjie.kalle.t;
import java.util.List;

/* loaded from: classes4.dex */
public class v extends o {
    private final t mUrl;

    public static class b extends o.a {
        private t.b mUrl;

        protected b(t tVar, RequestMethod requestMethod) {
            super(requestMethod);
            t.b builder = tVar.builder();
            this.mUrl = builder;
            builder.addQuery(k.getConfig().getParams());
        }

        public b params(m mVar) {
            this.mUrl.addQuery(mVar);
            return this;
        }

        public b setParams(m mVar) {
            this.mUrl.setQuery(mVar);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b clearParams() {
            this.mUrl.clearQuery();
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b removeParam(String str) {
            this.mUrl.removeQuery(str);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public /* bridge */ /* synthetic */ o.a param(String str, List list) {
            return param(str, (List<String>) list);
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(int i8) {
            this.mUrl.addPath(i8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(long j8) {
            this.mUrl.addPath(j8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, int i8) {
            this.mUrl.addQuery(str, i8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(boolean z7) {
            this.mUrl.addPath(z7);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, long j8) {
            this.mUrl.addQuery(str, j8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(char c8) {
            this.mUrl.addPath(c8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, boolean z7) {
            this.mUrl.addQuery(str, z7);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(double d8) {
            this.mUrl.addPath(d8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, char c8) {
            this.mUrl.addQuery(str, c8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(float f8) {
            this.mUrl.addPath(f8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, double d8) {
            this.mUrl.addQuery(str, d8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(String str) {
            this.mUrl.addPath(str);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, float f8) {
            this.mUrl.addQuery(str, f8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, short s7) {
            this.mUrl.addQuery(str, s7);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, String str2) {
            this.mUrl.addQuery(str, str2);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, List<String> list) {
            this.mUrl.addQuery(str, list);
            return this;
        }
    }

    public static class c extends b {
        public v build() {
            return new v(this);
        }

        private c(t tVar, RequestMethod requestMethod) {
            super(tVar, requestMethod);
        }
    }

    protected v(b bVar) {
        super(bVar);
        this.mUrl = bVar.mUrl.build();
    }

    public static c newBuilder(String str, RequestMethod requestMethod) {
        return newBuilder(t.newBuilder(str).build(), requestMethod);
    }

    @Override // com.yanzhenjie.kalle.o
    public p body() {
        throw new AssertionError("It should not be called.");
    }

    @Override // com.yanzhenjie.kalle.o
    public m copyParams() {
        return this.mUrl.getParams();
    }

    @Override // com.yanzhenjie.kalle.o
    public t url() {
        return this.mUrl;
    }

    public static c newBuilder(t tVar, RequestMethod requestMethod) {
        return new c(tVar, requestMethod);
    }

    @Deprecated
    public static c newBuilder(t.b bVar, RequestMethod requestMethod) {
        return newBuilder(bVar.build(), requestMethod);
    }
}
