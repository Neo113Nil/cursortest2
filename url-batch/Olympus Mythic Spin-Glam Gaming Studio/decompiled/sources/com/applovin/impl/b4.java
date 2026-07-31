package com.applovin.impl;

import android.os.Process;
import android.os.SystemClock;
import androidx.core.util.Consumer;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public class b4 {
    private final PriorityBlockingQueue a = new PriorityBlockingQueue();
    private final com.applovin.impl.sdk.k b;

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends Thread {
        private final BlockingQueue a;
        private final com.applovin.impl.sdk.k b;

        private void a() {
            b((c) this.a.take());
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x00f1 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #13 {all -> 0x00fd, blocks: (B:55:0x00d9, B:57:0x00f1, B:72:0x0134), top: B:54:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void b(final c cVar) {
            Throwable th;
            HttpURLConnection httpURLConnection;
            byte[] bArr;
            long elapsedRealtime;
            long j;
            byte[] bArr2;
            byte[] bArr3;
            byte[] bArr4;
            InputStream errorStream;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            int i = 0;
            try {
                httpURLConnection = a(cVar);
                try {
                    if (cVar.d != null && cVar.d.length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(cVar.d.length);
                        try {
                            OutputStream urlConnectionGetOutputStream = AppLovinNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                            try {
                                urlConnectionGetOutputStream.write(cVar.d);
                                urlConnectionGetOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable th2) {
                            HashMap hashMap = new HashMap();
                            CollectionUtils.putStringIfValid("details", "outputStream", hashMap);
                            CollectionUtils.putStringIfValid("url", cVar.a, hashMap);
                            CollectionUtils.putStringIfValid("code", Integer.toString(0), hashMap);
                            this.b.D().a("NetworkCommunicationThread", "processRequest", th2, hashMap);
                            throw th2;
                        }
                    }
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                    i = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (i > 0) {
                        try {
                            InputStream urlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                            try {
                                bArr = r0.a(urlConnectionGetInputStream, this.b);
                                if (urlConnectionGetInputStream != null) {
                                    try {
                                        urlConnectionGetInputStream.close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            HashMap hashMap2 = new HashMap();
                                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", hashMap2);
                                            CollectionUtils.putStringIfValid("url", cVar.a, hashMap2);
                                            CollectionUtils.putStringIfValid("code", Integer.toString(i), hashMap2);
                                            this.b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap2);
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                elapsedRealtime = SystemClock.elapsedRealtime();
                                                this.b.O().a("NetworkCommunicationThread", th);
                                                this.b.O();
                                                if (com.applovin.impl.sdk.o.a()) {
                                                    this.b.O().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                                }
                                                if (httpURLConnection == null) {
                                                    try {
                                                        errorStream = httpURLConnection.getErrorStream();
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        j = elapsedRealtime2;
                                                    }
                                                    try {
                                                        byte[] a = r0.a(errorStream, this.b);
                                                        if (errorStream != null) {
                                                            try {
                                                                errorStream.close();
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                j = elapsedRealtime2;
                                                                bArr2 = a;
                                                                this.b.O().a("NetworkCommunicationThread", th);
                                                                HashMap hashMap3 = new HashMap();
                                                                CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap3);
                                                                CollectionUtils.putStringIfValid("url", cVar.a, hashMap3);
                                                                CollectionUtils.putStringIfValid("code", Integer.toString(i), hashMap3);
                                                                this.b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap3);
                                                                bArr3 = bArr2;
                                                                bArr4 = bArr;
                                                                elapsedRealtime2 = j;
                                                                n7.a(httpURLConnection, this.b);
                                                                final d a2 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                                                                cVar.g.execute(new Runnable() { // from class: com.applovin.impl.b4$b$$ExternalSyntheticLambda0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        b4.b.a(b4.c.this, a2);
                                                                    }
                                                                });
                                                            }
                                                        }
                                                        bArr4 = bArr;
                                                        bArr3 = a;
                                                    } catch (Throwable th7) {
                                                        j = elapsedRealtime2;
                                                        if (errorStream == null) {
                                                            throw th7;
                                                        }
                                                        try {
                                                            try {
                                                                errorStream.close();
                                                                throw th7;
                                                            } catch (Throwable th8) {
                                                                th7.addSuppressed(th8);
                                                                throw th7;
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            bArr2 = null;
                                                            this.b.O().a("NetworkCommunicationThread", th);
                                                            HashMap hashMap32 = new HashMap();
                                                            CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap32);
                                                            CollectionUtils.putStringIfValid("url", cVar.a, hashMap32);
                                                            CollectionUtils.putStringIfValid("code", Integer.toString(i), hashMap32);
                                                            this.b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap32);
                                                            bArr3 = bArr2;
                                                            bArr4 = bArr;
                                                            elapsedRealtime2 = j;
                                                            n7.a(httpURLConnection, this.b);
                                                            final d a22 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                                                            cVar.g.execute(new Runnable() { // from class: com.applovin.impl.b4$b$$ExternalSyntheticLambda0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    b4.b.a(b4.c.this, a22);
                                                                }
                                                            });
                                                        }
                                                        th = th9;
                                                        bArr2 = null;
                                                        this.b.O().a("NetworkCommunicationThread", th);
                                                        HashMap hashMap322 = new HashMap();
                                                        CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap322);
                                                        CollectionUtils.putStringIfValid("url", cVar.a, hashMap322);
                                                        CollectionUtils.putStringIfValid("code", Integer.toString(i), hashMap322);
                                                        this.b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap322);
                                                        bArr3 = bArr2;
                                                        bArr4 = bArr;
                                                        elapsedRealtime2 = j;
                                                        n7.a(httpURLConnection, this.b);
                                                        final d a222 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                                                        cVar.g.execute(new Runnable() { // from class: com.applovin.impl.b4$b$$ExternalSyntheticLambda0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                b4.b.a(b4.c.this, a222);
                                                            }
                                                        });
                                                    }
                                                } else {
                                                    bArr4 = bArr;
                                                    bArr3 = null;
                                                }
                                                n7.a(httpURLConnection, this.b);
                                                final d a2222 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                                                cVar.g.execute(new Runnable() { // from class: com.applovin.impl.b4$b$$ExternalSyntheticLambda0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        b4.b.a(b4.c.this, a2222);
                                                    }
                                                });
                                            } catch (Throwable th10) {
                                                n7.a(httpURLConnection, this.b);
                                                throw th10;
                                            }
                                        }
                                    }
                                }
                                elapsedRealtime = elapsedRealtime3;
                                bArr4 = bArr;
                                bArr3 = null;
                            } catch (Throwable th11) {
                                if (urlConnectionGetInputStream == null) {
                                    throw th11;
                                }
                                try {
                                    urlConnectionGetInputStream.close();
                                    throw th11;
                                } catch (Throwable th12) {
                                    th11.addSuppressed(th12);
                                    throw th11;
                                }
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            bArr = null;
                            HashMap hashMap22 = new HashMap();
                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", hashMap22);
                            CollectionUtils.putStringIfValid("url", cVar.a, hashMap22);
                            CollectionUtils.putStringIfValid("code", Integer.toString(i), hashMap22);
                            this.b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap22);
                            throw th;
                        }
                    } else {
                        elapsedRealtime = elapsedRealtime3;
                        bArr3 = null;
                        bArr4 = null;
                    }
                    th = null;
                } catch (Throwable th14) {
                    th = th14;
                    bArr = null;
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    this.b.O().a("NetworkCommunicationThread", th);
                    this.b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                    }
                    if (httpURLConnection == null) {
                    }
                    n7.a(httpURLConnection, this.b);
                    final d a22222 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
                    cVar.g.execute(new Runnable() { // from class: com.applovin.impl.b4$b$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            b4.b.a(b4.c.this, a22222);
                        }
                    });
                }
            } catch (Throwable th15) {
                th = th15;
                httpURLConnection = null;
            }
            n7.a(httpURLConnection, this.b);
            final d a222222 = d.a().a(i).a(bArr4).b(bArr3).a(elapsedRealtime - elapsedRealtime2).a(th).a();
            cVar.g.execute(new Runnable() { // from class: com.applovin.impl.b4$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    b4.b.a(b4.c.this, a222222);
                }
            });
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.a = blockingQueue;
            this.b = kVar;
            setPriority(((Integer) kVar.a(x4.S)).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.a).openConnection();
            httpURLConnection.setRequestMethod(cVar.b);
            httpURLConnection.setConnectTimeout(cVar.e);
            httpURLConnection.setReadTimeout(cVar.e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.c.isEmpty()) {
                for (Map.Entry entry : cVar.c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {
        private static final AtomicInteger i = new AtomicInteger();
        private final String a;
        private final String b;
        private final Map c;
        private final byte[] d;
        private final int e;
        private final Consumer f;
        private final Executor g;
        private final int h;

        public static class a {
            private String a;
            private String b;
            private Map c = new HashMap();
            private byte[] d;
            private int e;
            private Consumer f;
            private Executor g;

            public a a(String str) {
                this.a = str;
                return this;
            }

            public a b(String str) {
                this.b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.d = bArr;
                return this;
            }

            public a a(int i) {
                this.e = i;
                return this;
            }

            public a a(Consumer consumer) {
                this.f = consumer;
                return this;
            }

            public a a(Executor executor) {
                this.g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.h - cVar.h;
        }

        private c(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c != null ? aVar.c : Collections.emptyMap();
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = i.incrementAndGet();
        }
    }

    public static class d {
        private final int a;
        private final byte[] b;
        private final byte[] c;
        private final long d;
        private final Throwable e;

        public static class a {
            private int a;
            private byte[] b;
            private byte[] c;
            private long d;
            private Throwable e;

            public a a(int i) {
                this.a = i;
                return this;
            }

            public a b(byte[] bArr) {
                this.c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.e = th;
                return this;
            }

            public a a(long j) {
                this.d = j;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.a;
        }

        public int c() {
            Throwable th = this.e;
            if (th == null) {
                return this.a;
            }
            throw th;
        }

        public byte[] d() {
            Throwable th = this.e;
            if (th == null) {
                return this.b;
            }
            throw th;
        }

        public long e() {
            return this.d;
        }

        public byte[] f() {
            return this.c;
        }

        private d(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.b = kVar;
    }

    public void a() {
        for (int i = 0; i < ((Integer) this.b.a(x4.R)).intValue(); i++) {
            new b(this.a, i, this.b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
