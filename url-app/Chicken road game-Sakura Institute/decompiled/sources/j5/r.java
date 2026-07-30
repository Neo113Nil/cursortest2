package j5;

import a0.s0;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u3.t;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static long f5109k;

    /* renamed from: a, reason: collision with root package name */
    public androidx.room.c f5110a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5111b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5112c = false;

    /* renamed from: d, reason: collision with root package name */
    public long f5113d = 0;

    /* renamed from: e, reason: collision with root package name */
    public k5.b f5114e;

    /* renamed from: f, reason: collision with root package name */
    public final a f5115f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f5116g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f5117h;

    /* renamed from: i, reason: collision with root package name */
    public final ScheduledExecutorService f5118i;

    /* renamed from: j, reason: collision with root package name */
    public final b1.b f5119j;

    public r(b bVar, s0 s0Var, String str, String str2, a aVar, String str3) {
        this.f5118i = bVar.f5039a;
        this.f5115f = aVar;
        long j8 = f5109k;
        f5109k = 1 + j8;
        this.f5119j = new b1.b(bVar.f5042d, "WebSocket", a0.m.h(j8, "ws_"), 22);
        str = str == null ? (String) s0Var.f137c : str;
        boolean z8 = s0Var.f136b;
        String str4 = (String) s0Var.f138d;
        String str5 = (z8 ? "wss" : "ws") + "://" + str + "/.ws?ns=" + str4 + "&v=5";
        if (str3 != null) {
            str5 = str5 + "&ls=" + str3;
        }
        URI create = URI.create(str5);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", bVar.f5043e);
        hashMap.put("X-Firebase-GMPID", bVar.f5044f);
        hashMap.put("X-Firebase-AppCheck", str2);
        this.f5110a = new androidx.room.c(this, new u5.d(bVar, create, hashMap));
    }

    public static void a(r rVar) {
        b1.b bVar = rVar.f5119j;
        if (!rVar.f5112c) {
            if (bVar.v()) {
                bVar.d("closing itself", null, new Object[0]);
            }
            rVar.f();
        }
        rVar.f5110a = null;
        ScheduledFuture scheduledFuture = rVar.f5116g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b(String str) {
        b1.b bVar = this.f5119j;
        k5.b bVar2 = this.f5114e;
        if (bVar2.f5375l) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            bVar2.f5369f.add(str);
        }
        long j8 = this.f5113d - 1;
        this.f5113d = j8;
        if (j8 == 0) {
            try {
                k5.b bVar3 = this.f5114e;
                if (bVar3.f5375l) {
                    throw new IllegalStateException("Trying to freeze frozen StringListReader");
                }
                bVar3.f5375l = true;
                HashMap k8 = t.k(bVar3.toString());
                this.f5114e = null;
                if (bVar.v()) {
                    bVar.d("handleIncomingFrame complete frame: " + k8, null, new Object[0]);
                }
                this.f5115f.v(k8);
            } catch (IOException e9) {
                bVar.i("Error parsing frame: " + this.f5114e.toString(), e9);
                c();
                f();
            } catch (ClassCastException e10) {
                bVar.i("Error parsing frame (cast error): " + this.f5114e.toString(), e10);
                c();
                f();
            }
        }
    }

    public final void c() {
        b1.b bVar = this.f5119j;
        if (bVar.v()) {
            bVar.d("websocket is being closed", null, new Object[0]);
        }
        this.f5112c = true;
        ((u5.d) this.f5110a.f1069g).a();
        ScheduledFuture scheduledFuture = this.f5117h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f5116g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void d(int i7) {
        this.f5113d = i7;
        this.f5114e = new k5.b();
        b1.b bVar = this.f5119j;
        if (bVar.v()) {
            bVar.d("HandleNewFrameCount: " + this.f5113d, null, new Object[0]);
        }
    }

    public final void e() {
        if (this.f5112c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f5116g;
        b1.b bVar = this.f5119j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (bVar.v()) {
                bVar.d("Reset keepAlive. Remaining: " + this.f5116g.getDelay(TimeUnit.MILLISECONDS), null, new Object[0]);
            }
        } else if (bVar.v()) {
            bVar.d("Reset keepAlive", null, new Object[0]);
        }
        this.f5116g = this.f5118i.schedule(new p(this, 1), 45000L, TimeUnit.MILLISECONDS);
    }

    public final void f() {
        this.f5112c = true;
        boolean z8 = this.f5111b;
        a aVar = this.f5115f;
        b1.b bVar = (b1.b) aVar.f5038f;
        aVar.f5036d = null;
        if (z8 || aVar.f5034b != 1) {
            if (bVar.v()) {
                bVar.d("Realtime connection lost", null, new Object[0]);
            }
        } else if (bVar.v()) {
            bVar.d("Realtime connection failed", null, new Object[0]);
        }
        aVar.c(2);
    }
}
