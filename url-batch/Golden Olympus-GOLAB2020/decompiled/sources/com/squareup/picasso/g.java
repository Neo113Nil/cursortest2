package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ironsource.b9;
import com.squareup.picasso.o;
import d1.InterfaceC2402a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    final b f21701a;

    /* renamed from: b, reason: collision with root package name */
    final Context f21702b;

    /* renamed from: c, reason: collision with root package name */
    final ExecutorService f21703c;

    /* renamed from: d, reason: collision with root package name */
    final d1.c f21704d;

    /* renamed from: e, reason: collision with root package name */
    final Map f21705e;

    /* renamed from: f, reason: collision with root package name */
    final Map f21706f;

    /* renamed from: g, reason: collision with root package name */
    final Map f21707g;

    /* renamed from: h, reason: collision with root package name */
    final Set f21708h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f21709i;

    /* renamed from: j, reason: collision with root package name */
    final Handler f21710j;

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC2402a f21711k;

    /* renamed from: l, reason: collision with root package name */
    final x f21712l;

    /* renamed from: m, reason: collision with root package name */
    final List f21713m;

    /* renamed from: n, reason: collision with root package name */
    final c f21714n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f21715o;

    /* renamed from: p, reason: collision with root package name */
    boolean f21716p;

    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final g f21717a;

        /* renamed from: com.squareup.picasso.g$a$a, reason: collision with other inner class name */
        class RunnableC0177a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Message f21718b;

            RunnableC0177a(Message message) {
                this.f21718b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f21718b.what);
            }
        }

        a(Looper looper, g gVar) {
            super(looper);
            this.f21717a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f21717a.v((com.squareup.picasso.a) message.obj);
                    break;
                case 2:
                    this.f21717a.o((com.squareup.picasso.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    q.f21756o.post(new RunnableC0177a(message));
                    break;
                case 4:
                    this.f21717a.p((com.squareup.picasso.c) message.obj);
                    break;
                case 5:
                    this.f21717a.u((com.squareup.picasso.c) message.obj);
                    break;
                case 6:
                    this.f21717a.q((com.squareup.picasso.c) message.obj, false);
                    break;
                case 7:
                    this.f21717a.n();
                    break;
                case 9:
                    this.f21717a.r((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f21717a.m(message.arg1 == 1);
                    break;
                case 11:
                    this.f21717a.s(message.obj);
                    break;
                case 12:
                    this.f21717a.t(message.obj);
                    break;
            }
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final g f21720a;

        c(g gVar) {
            this.f21720a = gVar;
        }

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f21720a.f21715o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f21720a.f21702b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra(b9.h.f15456P)) {
                    this.f21720a.b(intent.getBooleanExtra(b9.h.f15456P, false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f21720a.f(((ConnectivityManager) y.n(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    g(Context context, ExecutorService executorService, Handler handler, d1.c cVar, InterfaceC2402a interfaceC2402a, x xVar) {
        b bVar = new b();
        this.f21701a = bVar;
        bVar.start();
        y.h(bVar.getLooper());
        this.f21702b = context;
        this.f21703c = executorService;
        this.f21705e = new LinkedHashMap();
        this.f21706f = new WeakHashMap();
        this.f21707g = new WeakHashMap();
        this.f21708h = new LinkedHashSet();
        this.f21709i = new a(bVar.getLooper(), this);
        this.f21704d = cVar;
        this.f21710j = handler;
        this.f21711k = interfaceC2402a;
        this.f21712l = xVar;
        this.f21713m = new ArrayList(4);
        this.f21716p = y.p(context);
        this.f21715o = y.o(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar2 = new c(this);
        this.f21714n = cVar2;
        cVar2.a();
    }

    private void a(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        Bitmap bitmap = cVar.f21688n;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f21713m.add(cVar);
        if (this.f21709i.hasMessages(7)) {
            return;
        }
        this.f21709i.sendEmptyMessageDelayed(7, 200L);
    }

    private void i() {
        if (this.f21706f.isEmpty()) {
            return;
        }
        Iterator it = this.f21706f.values().iterator();
        while (it.hasNext()) {
            com.squareup.picasso.a aVar = (com.squareup.picasso.a) it.next();
            it.remove();
            if (aVar.g().f21770m) {
                y.s("Dispatcher", "replaying", aVar.i().d());
            }
            w(aVar, false);
        }
    }

    private void j(List list) {
        if (list == null || list.isEmpty() || !((com.squareup.picasso.c) list.get(0)).q().f21770m) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.squareup.picasso.c cVar = (com.squareup.picasso.c) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(y.j(cVar));
        }
        y.s("Dispatcher", "delivered", sb.toString());
    }

    private void k(com.squareup.picasso.a aVar) {
        Object k4 = aVar.k();
        if (k4 != null) {
            aVar.f21665k = true;
            this.f21706f.put(k4, aVar);
        }
    }

    private void l(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h4 = cVar.h();
        if (h4 != null) {
            k(h4);
        }
        List i4 = cVar.i();
        if (i4 != null) {
            int size = i4.size();
            for (int i5 = 0; i5 < size; i5++) {
                k((com.squareup.picasso.a) i4.get(i5));
            }
        }
    }

    void b(boolean z4) {
        Handler handler = this.f21709i;
        handler.sendMessage(handler.obtainMessage(10, z4 ? 1 : 0, 0));
    }

    void c(com.squareup.picasso.a aVar) {
        Handler handler = this.f21709i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    void d(com.squareup.picasso.c cVar) {
        Handler handler = this.f21709i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    void e(com.squareup.picasso.c cVar) {
        Handler handler = this.f21709i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f21709i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void g(com.squareup.picasso.c cVar) {
        Handler handler = this.f21709i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    void h(com.squareup.picasso.a aVar) {
        Handler handler = this.f21709i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    void m(boolean z4) {
        this.f21716p = z4;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.f21713m);
        this.f21713m.clear();
        Handler handler = this.f21710j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void o(com.squareup.picasso.a aVar) {
        String d4 = aVar.d();
        com.squareup.picasso.c cVar = (com.squareup.picasso.c) this.f21705e.get(d4);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f21705e.remove(d4);
                if (aVar.g().f21770m) {
                    y.s("Dispatcher", "canceled", aVar.i().d());
                }
            }
        }
        if (this.f21708h.contains(aVar.j())) {
            this.f21707g.remove(aVar.k());
            if (aVar.g().f21770m) {
                y.t("Dispatcher", "canceled", aVar.i().d(), "because paused request got canceled");
            }
        }
        com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) this.f21706f.remove(aVar.k());
        if (aVar2 == null || !aVar2.g().f21770m) {
            return;
        }
        y.t("Dispatcher", "canceled", aVar2.i().d(), "from replaying");
    }

    void p(com.squareup.picasso.c cVar) {
        if (m.b(cVar.p())) {
            this.f21711k.b(cVar.n(), cVar.s());
        }
        this.f21705e.remove(cVar.n());
        a(cVar);
        if (cVar.q().f21770m) {
            y.t("Dispatcher", "batched", y.j(cVar), "for completion");
        }
    }

    void q(com.squareup.picasso.c cVar, boolean z4) {
        if (cVar.q().f21770m) {
            String j4 = y.j(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z4 ? " (will replay)" : "");
            y.t("Dispatcher", "batched", j4, sb.toString());
        }
        this.f21705e.remove(cVar.n());
        a(cVar);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f21703c;
        if (executorService instanceof s) {
            ((s) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    void s(Object obj) {
        if (this.f21708h.add(obj)) {
            Iterator it = this.f21705e.values().iterator();
            while (it.hasNext()) {
                com.squareup.picasso.c cVar = (com.squareup.picasso.c) it.next();
                boolean z4 = cVar.q().f21770m;
                com.squareup.picasso.a h4 = cVar.h();
                List i4 = cVar.i();
                boolean z5 = (i4 == null || i4.isEmpty()) ? false : true;
                if (h4 != null || z5) {
                    if (h4 != null && h4.j().equals(obj)) {
                        cVar.f(h4);
                        this.f21707g.put(h4.k(), h4);
                        if (z4) {
                            y.t("Dispatcher", b9.h.f15475e0, h4.f21656b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z5) {
                        for (int size = i4.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.a aVar = (com.squareup.picasso.a) i4.get(size);
                            if (aVar.j().equals(obj)) {
                                cVar.f(aVar);
                                this.f21707g.put(aVar.k(), aVar);
                                if (z4) {
                                    y.t("Dispatcher", b9.h.f15475e0, aVar.f21656b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (cVar.c()) {
                        it.remove();
                        if (z4) {
                            y.t("Dispatcher", "canceled", y.j(cVar), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (this.f21708h.remove(obj)) {
            Iterator it = this.f21707g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) it.next();
                if (aVar.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f21710j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    void u(com.squareup.picasso.c cVar) {
        if (cVar.u()) {
            return;
        }
        boolean z4 = false;
        if (this.f21703c.isShutdown()) {
            q(cVar, false);
            return;
        }
        if (cVar.w(this.f21716p, this.f21715o ? ((ConnectivityManager) y.n(this.f21702b, "connectivity")).getActiveNetworkInfo() : null)) {
            if (cVar.q().f21770m) {
                y.s("Dispatcher", "retrying", y.j(cVar));
            }
            if (cVar.k() instanceof o.a) {
                cVar.f21684j |= n.NO_CACHE.f21748b;
            }
            cVar.f21689o = this.f21703c.submit(cVar);
            return;
        }
        if (this.f21715o && cVar.x()) {
            z4 = true;
        }
        q(cVar, z4);
        if (z4) {
            l(cVar);
        }
    }

    void v(com.squareup.picasso.a aVar) {
        w(aVar, true);
    }

    void w(com.squareup.picasso.a aVar, boolean z4) {
        if (this.f21708h.contains(aVar.j())) {
            this.f21707g.put(aVar.k(), aVar);
            if (aVar.g().f21770m) {
                y.t("Dispatcher", b9.h.f15475e0, aVar.f21656b.d(), "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.c cVar = (com.squareup.picasso.c) this.f21705e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
            return;
        }
        if (this.f21703c.isShutdown()) {
            if (aVar.g().f21770m) {
                y.t("Dispatcher", "ignored", aVar.f21656b.d(), "because shut down");
                return;
            }
            return;
        }
        com.squareup.picasso.c g4 = com.squareup.picasso.c.g(aVar.g(), this, this.f21711k, this.f21712l, aVar);
        g4.f21689o = this.f21703c.submit(g4);
        this.f21705e.put(aVar.d(), g4);
        if (z4) {
            this.f21706f.remove(aVar.k());
        }
        if (aVar.g().f21770m) {
            y.s("Dispatcher", "enqueued", aVar.f21656b.d());
        }
    }
}
