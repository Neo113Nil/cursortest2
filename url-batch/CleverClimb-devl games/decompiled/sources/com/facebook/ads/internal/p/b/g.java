package com.facebook.ads.internal.p.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class g {

    /* renamed from: b, reason: collision with root package name */
    private final String f5342b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f5343c;
    private final b e;
    private final c f;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f5341a = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    private final List<b> f5344d = new CopyOnWriteArrayList();

    private static final class a extends Handler implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f5345a;

        /* renamed from: b, reason: collision with root package name */
        private final List<b> f5346b;

        public a(String str, List<b> list) {
            super(Looper.getMainLooper());
            this.f5345a = str;
            this.f5346b = list;
        }

        @Override // com.facebook.ads.internal.p.b.b
        public void a(File file, String str, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator<b> it = this.f5346b.iterator();
            while (it.hasNext()) {
                it.next().a((File) message.obj, this.f5345a, message.arg1);
            }
        }
    }

    public g(String str, c cVar) {
        this.f5342b = (String) j.a(str);
        this.f = (c) j.a(cVar);
        this.e = new a(str, this.f5344d);
    }

    private synchronized void c() {
        this.f5343c = this.f5343c == null ? e() : this.f5343c;
    }

    private synchronized void d() {
        if (this.f5341a.decrementAndGet() <= 0) {
            this.f5343c.a();
            this.f5343c = null;
        }
    }

    private e e() {
        e eVar = new e(new h(this.f5342b), new com.facebook.ads.internal.p.b.a.b(this.f.a(this.f5342b), this.f.f5319c));
        eVar.a(this.e);
        return eVar;
    }

    public void a() {
        this.f5344d.clear();
        if (this.f5343c != null) {
            this.f5343c.a((b) null);
            this.f5343c.a();
            this.f5343c = null;
        }
        this.f5341a.set(0);
    }

    public void a(d dVar, Socket socket) {
        c();
        try {
            this.f5341a.incrementAndGet();
            this.f5343c.a(dVar, socket);
        } finally {
            d();
        }
    }

    public int b() {
        return this.f5341a.get();
    }
}
