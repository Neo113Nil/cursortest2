package com.yanzhenjie.kalle;

import com.yanzhenjie.kalle.m;
import com.yanzhenjie.kalle.o;
import com.yanzhenjie.kalle.t;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class c extends o {
    private final p mBody;
    private final m mParams;
    private final t mUrl;

    public static class b extends o.a {
        private p mBody;
        private m.b mParams;
        private t.b mUrlBuilder;

        protected b(t tVar, RequestMethod requestMethod) {
            super(requestMethod);
            this.mUrlBuilder = tVar.builder();
            m.b newBuilder = m.newBuilder();
            this.mParams = newBuilder;
            newBuilder.add(k.getConfig().getParams());
        }

        public b binaries(String str, List<com.yanzhenjie.kalle.b> list) {
            this.mParams.binaries(str, list);
            return this;
        }

        public b binary(String str, com.yanzhenjie.kalle.b bVar) {
            this.mParams.binary(str, bVar);
            return this;
        }

        public b body(p pVar) {
            this.mBody = pVar;
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

        public b params(m mVar) {
            this.mParams.add(mVar);
            return this;
        }

        public b setParams(m mVar) {
            this.mParams.set(mVar);
            return this;
        }

        public b setUrlParam(m mVar) {
            this.mUrlBuilder.setQuery(mVar);
            return this;
        }

        public b urlParam(String str, int i8) {
            this.mUrlBuilder.addQuery(str, i8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b clearParams() {
            this.mParams.clear();
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b removeParam(String str) {
            this.mParams.remove(str);
            return this;
        }

        public b urlParam(String str, long j8) {
            this.mUrlBuilder.addQuery(str, j8);
            return this;
        }

        public b urlParam(String str, boolean z7) {
            this.mUrlBuilder.addQuery(str, z7);
            return this;
        }

        public b urlParam(String str, char c8) {
            this.mUrlBuilder.addQuery(str, c8);
            return this;
        }

        public b urlParam(String str, double d8) {
            this.mUrlBuilder.addQuery(str, d8);
            return this;
        }

        public b urlParam(String str, float f8) {
            this.mUrlBuilder.addQuery(str, f8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public /* bridge */ /* synthetic */ o.a param(String str, List list) {
            return param(str, (List<String>) list);
        }

        public b urlParam(String str, short s7) {
            this.mUrlBuilder.addQuery(str, s7);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(int i8) {
            this.mUrlBuilder.addPath(i8);
            return this;
        }

        public b urlParam(String str, String str2) {
            this.mUrlBuilder.addQuery(str, str2);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(long j8) {
            this.mUrlBuilder.addPath(j8);
            return this;
        }

        public b urlParam(String str, List<String> list) {
            this.mUrlBuilder.addQuery(str, list);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, int i8) {
            return param(str, Integer.toString(i8));
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(boolean z7) {
            this.mUrlBuilder.addPath(z7);
            return this;
        }

        public b urlParam(m mVar) {
            this.mUrlBuilder.addQuery(mVar);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, long j8) {
            this.mParams.add(str, j8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(char c8) {
            this.mUrlBuilder.addPath(c8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, boolean z7) {
            this.mParams.add(str, z7);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(double d8) {
            this.mUrlBuilder.addPath(d8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, char c8) {
            this.mParams.add(str, c8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(float f8) {
            this.mUrlBuilder.addPath(f8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, double d8) {
            this.mParams.add(str, d8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b path(String str) {
            this.mUrlBuilder.addPath(str);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, float f8) {
            this.mParams.add(str, f8);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, short s7) {
            this.mParams.add(str, s7);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, String str2) {
            this.mParams.add(str, (CharSequence) str2);
            return this;
        }

        @Override // com.yanzhenjie.kalle.o.a
        public b param(String str, List<String> list) {
            this.mParams.add(str, list);
            return this;
        }
    }

    /* renamed from: com.yanzhenjie.kalle.c$c, reason: collision with other inner class name */
    public static class C0344c extends b {
        public c build() {
            return new c(this);
        }

        private C0344c(t tVar, RequestMethod requestMethod) {
            super(tVar, requestMethod);
        }
    }

    protected c(b bVar) {
        super(bVar);
        this.mUrl = bVar.mUrlBuilder.build();
        m build = bVar.mParams.build();
        this.mParams = build;
        this.mBody = bVar.mBody == null ? build.hasBinary() ? build.toFormBody() : build.toUrlBody() : bVar.mBody;
    }

    public static C0344c newBuilder(String str, RequestMethod requestMethod) {
        return newBuilder(t.newBuilder(str).build(), requestMethod);
    }

    @Override // com.yanzhenjie.kalle.o
    public p body() {
        return this.mBody;
    }

    @Override // com.yanzhenjie.kalle.o
    public m copyParams() {
        return this.mParams;
    }

    @Override // com.yanzhenjie.kalle.o
    public t url() {
        return this.mUrl;
    }

    public static C0344c newBuilder(t tVar, RequestMethod requestMethod) {
        return new C0344c(tVar, requestMethod);
    }

    @Deprecated
    public static C0344c newBuilder(t.b bVar, RequestMethod requestMethod) {
        return newBuilder(bVar.build(), requestMethod);
    }
}
