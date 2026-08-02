package defpackage;

import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljw extends ExperimentalUrlRequest.Builder {
    private static final String a = "ljw";
    private final lip b;
    private final String c;
    private final UrlRequest.Callback d;
    private final Executor e;
    private String f;
    private boolean h;
    private Collection j;
    private UploadDataProvider k;
    private Executor l;
    private boolean m;
    private boolean n;
    private int o;
    private boolean p;
    private int q;
    private RequestFinishedInfo.Listener r;
    private final ArrayList g = new ArrayList();
    private int i = 3;
    private long s = -1;

    public ljw(String str, UrlRequest.Callback callback, Executor executor, lip lipVar) {
        str.getClass();
        this.c = str;
        callback.getClass();
        this.d = callback;
        executor.getClass();
        this.e = executor;
        this.b = lipVar;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!"Accept-Encoding".equalsIgnoreCase(str)) {
            this.g.add(new AbstractMap.SimpleEntry(str, str2));
            return;
        }
        String str3 = a;
        if (jav.f(str3, 3)) {
            jav.b(str3, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        b(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder allowDirectExecutor() {
        c();
        return this;
    }

    public final void b(Object obj) {
        obj.getClass();
        if (this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(obj);
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder bindToNetwork(long j) {
        this.s = j;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest build() {
        int i = this.i;
        Collection collection = this.j;
        boolean z = this.h;
        boolean z2 = this.m;
        boolean z3 = this.n;
        int i2 = this.o;
        boolean z4 = this.p;
        int i3 = this.q;
        RequestFinishedInfo.Listener listener = this.r;
        long j = this.s;
        String str = this.f;
        if (str == null) {
            str = "GET";
        }
        String str2 = str;
        UploadDataProvider uploadDataProvider = this.k;
        Executor executor = this.l;
        return this.b.b(this.c, this.d, this.e, i, collection, z, z2, z3, i2, z4, i3, listener, j, str2, this.g, uploadDataProvider, executor);
    }

    public final void c() {
        this.m = true;
    }

    public final void d() {
        this.h = true;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableCache() {
        d();
        return this;
    }

    public final void e(int i) {
        this.n = true;
        this.o = i;
    }

    public final void f(int i) {
        this.p = true;
        this.q = i;
    }

    public final void g(UploadDataProvider uploadDataProvider, Executor executor) {
        uploadDataProvider.getClass();
        this.k = uploadDataProvider;
        executor.getClass();
        this.l = executor;
        if (this.f == null) {
            this.f = "POST";
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        str.getClass();
        this.f = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setPriority(int i) {
        this.i = i;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setRawCompressionDictionary(byte[] bArr, ByteBuffer byteBuffer, String str) {
        bArr.getClass();
        if (bArr.length != 32) {
            throw new IllegalArgumentException("SHA-256 hashes are supposed to be 32 bytes");
        }
        byteBuffer.getClass();
        jay.h(byteBuffer);
        str.getClass();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        e(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        f(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        g(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder setPriority(int i) {
        this.i = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder addRequestAnnotation(Object obj) {
        b(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder allowDirectExecutor() {
        c();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder disableCache() {
        d();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setTrafficStatsTag(int i) {
        e(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setTrafficStatsUid(int i) {
        f(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        g(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setHttpMethod(String str) {
        setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setIdempotency(int i) {
        return this;
    }
}
