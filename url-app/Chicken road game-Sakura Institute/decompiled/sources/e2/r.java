package e2;

import A.AbstractC0017m;
import A.V;
import B1.C0097d;
import j2.C0712b;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import y.t;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static long f6245k;

    /* renamed from: a, reason: collision with root package name */
    public t f6246a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6247b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6248c = false;

    /* renamed from: d, reason: collision with root package name */
    public long f6249d = 0;

    /* renamed from: e, reason: collision with root package name */
    public f2.b f6250e;

    /* renamed from: f, reason: collision with root package name */
    public final C0559a f6251f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f6252g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f6253h;

    /* renamed from: i, reason: collision with root package name */
    public final C0712b f6254i;

    /* renamed from: j, reason: collision with root package name */
    public final C0097d f6255j;

    public r(C0560b c0560b, V v4, String str, String str2, C0559a c0559a, String str3) {
        this.f6254i = c0560b.f6170a;
        this.f6251f = c0559a;
        long j4 = f6245k;
        f6245k = 1 + j4;
        this.f6255j = new C0097d(c0560b.f6173d, "WebSocket", AbstractC0017m.i("ws_", j4), 18);
        str = str == null ? (String) v4.f62c : str;
        String str4 = v4.f61b ? "wss" : "ws";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("://");
        sb.append(str);
        sb.append("/.ws?ns=");
        String n2 = AbstractC0017m.n(sb, (String) v4.f63d, "&v=5");
        if (str3 != null) {
            n2 = n2 + "&ls=" + str3;
        }
        URI create = URI.create(n2);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", c0560b.f6174e);
        hashMap.put("X-Firebase-GMPID", c0560b.f6175f);
        hashMap.put("X-Firebase-AppCheck", str2);
        this.f6246a = new t(this, new p2.e(c0560b, create, hashMap));
    }

    public static void a(r rVar) {
        if (!rVar.f6248c) {
            C0097d c0097d = rVar.f6255j;
            if (c0097d.y()) {
                c0097d.d("closing itself", null, new Object[0]);
            }
            rVar.f();
        }
        rVar.f6246a = null;
        ScheduledFuture scheduledFuture = rVar.f6252g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b(String str) {
        C0097d c0097d = this.f6255j;
        f2.b bVar = this.f6250e;
        if (bVar.f6661m) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            bVar.f6655d.add(str);
        }
        long j4 = this.f6249d - 1;
        this.f6249d = j4;
        if (j4 == 0) {
            try {
                f2.b bVar2 = this.f6250e;
                if (bVar2.f6661m) {
                    throw new IllegalStateException("Trying to freeze frozen StringListReader");
                }
                bVar2.f6661m = true;
                HashMap t4 = m3.o.t(bVar2.toString());
                this.f6250e = null;
                if (c0097d.y()) {
                    c0097d.d("handleIncomingFrame complete frame: " + t4, null, new Object[0]);
                }
                this.f6251f.v(t4);
            } catch (IOException e4) {
                c0097d.i("Error parsing frame: " + this.f6250e.toString(), e4);
                c();
                f();
            } catch (ClassCastException e5) {
                c0097d.i("Error parsing frame (cast error): " + this.f6250e.toString(), e5);
                c();
                f();
            }
        }
    }

    public final void c() {
        C0097d c0097d = this.f6255j;
        if (c0097d.y()) {
            c0097d.d("websocket is being closed", null, new Object[0]);
        }
        this.f6248c = true;
        ((p2.e) this.f6246a.f11494e).a();
        ScheduledFuture scheduledFuture = this.f6253h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f6252g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void d(int i2) {
        this.f6249d = i2;
        this.f6250e = new f2.b();
        C0097d c0097d = this.f6255j;
        if (c0097d.y()) {
            c0097d.d("HandleNewFrameCount: " + this.f6249d, null, new Object[0]);
        }
    }

    public final void e() {
        if (this.f6248c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f6252g;
        C0097d c0097d = this.f6255j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (c0097d.y()) {
                c0097d.d("Reset keepAlive. Remaining: " + this.f6252g.getDelay(TimeUnit.MILLISECONDS), null, new Object[0]);
            }
        } else if (c0097d.y()) {
            c0097d.d("Reset keepAlive", null, new Object[0]);
        }
        this.f6252g = this.f6254i.schedule(new p(this, 1), 45000L, TimeUnit.MILLISECONDS);
    }

    public final void f() {
        this.f6248c = true;
        boolean z4 = this.f6247b;
        C0559a c0559a = this.f6251f;
        c0559a.f6167d = null;
        C0097d c0097d = (C0097d) c0559a.f6169f;
        if (z4 || c0559a.f6165b != 1) {
            if (c0097d.y()) {
                c0097d.d("Realtime connection lost", null, new Object[0]);
            }
        } else if (c0097d.y()) {
            c0097d.d("Realtime connection failed", null, new Object[0]);
        }
        c0559a.c(2);
    }
}
