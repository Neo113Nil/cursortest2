package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.a;
import d1.InterfaceC2402a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: o, reason: collision with root package name */
    static final Handler f21756o = new a(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    static volatile q f21757p = null;

    /* renamed from: a, reason: collision with root package name */
    private final g f21758a;

    /* renamed from: b, reason: collision with root package name */
    private final c f21759b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21760c;

    /* renamed from: d, reason: collision with root package name */
    final Context f21761d;

    /* renamed from: e, reason: collision with root package name */
    final com.squareup.picasso.g f21762e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC2402a f21763f;

    /* renamed from: g, reason: collision with root package name */
    final x f21764g;

    /* renamed from: h, reason: collision with root package name */
    final Map f21765h;

    /* renamed from: i, reason: collision with root package name */
    final Map f21766i;

    /* renamed from: j, reason: collision with root package name */
    final ReferenceQueue f21767j;

    /* renamed from: k, reason: collision with root package name */
    final Bitmap.Config f21768k;

    /* renamed from: l, reason: collision with root package name */
    boolean f21769l;

    /* renamed from: m, reason: collision with root package name */
    volatile boolean f21770m;

    /* renamed from: n, reason: collision with root package name */
    boolean f21771n;

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.g().f21770m) {
                    y.t("Main", "canceled", aVar.f21656b.d(), "target got garbage collected");
                }
                aVar.f21655a.a(aVar.k());
                return;
            }
            int i5 = 0;
            if (i4 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i5 < size) {
                    com.squareup.picasso.c cVar = (com.squareup.picasso.c) list.get(i5);
                    cVar.f21677c.c(cVar);
                    i5++;
                }
                return;
            }
            if (i4 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i5 < size2) {
                com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) list2.get(i5);
                aVar2.f21655a.k(aVar2);
                i5++;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f21772a;

        /* renamed from: b, reason: collision with root package name */
        private d1.c f21773b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f21774c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC2402a f21775d;

        /* renamed from: e, reason: collision with root package name */
        private g f21776e;

        /* renamed from: f, reason: collision with root package name */
        private List f21777f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap.Config f21778g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f21779h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f21780i;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f21772a = context.getApplicationContext();
        }

        public q a() {
            Context context = this.f21772a;
            if (this.f21773b == null) {
                this.f21773b = new p(context);
            }
            if (this.f21775d == null) {
                this.f21775d = new j(context);
            }
            if (this.f21774c == null) {
                this.f21774c = new s();
            }
            if (this.f21776e == null) {
                this.f21776e = g.f21794a;
            }
            x xVar = new x(this.f21775d);
            return new q(context, new com.squareup.picasso.g(context, this.f21774c, q.f21756o, this.f21773b, this.f21775d, xVar), this.f21775d, null, this.f21776e, this.f21777f, xVar, this.f21778g, this.f21779h, this.f21780i);
        }
    }

    private static class c extends Thread {

        /* renamed from: b, reason: collision with root package name */
        private final ReferenceQueue f21781b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f21782c;

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Exception f21783b;

            a(Exception exc) {
                this.f21783b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f21783b);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.f21781b = referenceQueue;
            this.f21782c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0175a c0175a = (a.C0175a) this.f21781b.remove(1000L);
                    Message obtainMessage = this.f21782c.obtainMessage();
                    if (c0175a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0175a.f21667a;
                        this.f21782c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e4) {
                    this.f21782c.post(new a(e4));
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);


        /* renamed from: b, reason: collision with root package name */
        final int f21789b;

        e(int i4) {
            this.f21789b = i4;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f21794a = new a();

        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.q.g
            public t a(t tVar) {
                return tVar;
            }
        }

        t a(t tVar);
    }

    q(Context context, com.squareup.picasso.g gVar, InterfaceC2402a interfaceC2402a, d dVar, g gVar2, List list, x xVar, Bitmap.Config config, boolean z4, boolean z5) {
        this.f21761d = context;
        this.f21762e = gVar;
        this.f21763f = interfaceC2402a;
        this.f21758a = gVar2;
        this.f21768k = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new w(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.d(context));
        arrayList.add(new l(context));
        arrayList.add(new com.squareup.picasso.e(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new h(context));
        arrayList.add(new o(gVar.f21704d, xVar));
        this.f21760c = Collections.unmodifiableList(arrayList);
        this.f21764g = xVar;
        this.f21765h = new WeakHashMap();
        this.f21766i = new WeakHashMap();
        this.f21769l = z4;
        this.f21770m = z5;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f21767j = referenceQueue;
        c cVar = new c(referenceQueue, f21756o);
        this.f21759b = cVar;
        cVar.start();
    }

    private void e(Bitmap bitmap, e eVar, com.squareup.picasso.a aVar, Exception exc) {
        if (aVar.l()) {
            return;
        }
        if (!aVar.m()) {
            this.f21765h.remove(aVar.k());
        }
        if (bitmap == null) {
            aVar.c(exc);
            if (this.f21770m) {
                y.t("Main", "errored", aVar.f21656b.d(), exc.getMessage());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.b(bitmap, eVar);
        if (this.f21770m) {
            y.t("Main", "completed", aVar.f21656b.d(), "from " + eVar);
        }
    }

    public static q g() {
        if (f21757p == null) {
            synchronized (q.class) {
                try {
                    if (f21757p == null) {
                        Context context = PicassoProvider.f21654a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        f21757p = new b(context).a();
                    }
                } finally {
                }
            }
        }
        return f21757p;
    }

    void a(Object obj) {
        y.c();
        com.squareup.picasso.a aVar = (com.squareup.picasso.a) this.f21765h.remove(obj);
        if (aVar != null) {
            aVar.a();
            this.f21762e.c(aVar);
        }
        if (obj instanceof ImageView) {
            com.squareup.picasso.f fVar = (com.squareup.picasso.f) this.f21766i.remove((ImageView) obj);
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        a(imageView);
    }

    void c(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h4 = cVar.h();
        List i4 = cVar.i();
        boolean z4 = (i4 == null || i4.isEmpty()) ? false : true;
        if (h4 != null || z4) {
            Uri uri = cVar.j().f21808d;
            Exception k4 = cVar.k();
            Bitmap s4 = cVar.s();
            e o4 = cVar.o();
            if (h4 != null) {
                e(s4, o4, h4, k4);
            }
            if (z4) {
                int size = i4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    e(s4, o4, (com.squareup.picasso.a) i4.get(i5), k4);
                }
            }
        }
    }

    void d(ImageView imageView, com.squareup.picasso.f fVar) {
        if (this.f21766i.containsKey(imageView)) {
            a(imageView);
        }
        this.f21766i.put(imageView, fVar);
    }

    void f(com.squareup.picasso.a aVar) {
        Object k4 = aVar.k();
        if (k4 != null && this.f21765h.get(k4) != aVar) {
            a(k4);
            this.f21765h.put(k4, aVar);
        }
        l(aVar);
    }

    List h() {
        return this.f21760c;
    }

    public u i(Uri uri) {
        return new u(this, uri, 0);
    }

    Bitmap j(String str) {
        Bitmap bitmap = this.f21763f.get(str);
        if (bitmap != null) {
            this.f21764g.d();
            return bitmap;
        }
        this.f21764g.e();
        return bitmap;
    }

    void k(com.squareup.picasso.a aVar) {
        Bitmap j4 = m.a(aVar.f21659e) ? j(aVar.d()) : null;
        if (j4 == null) {
            f(aVar);
            if (this.f21770m) {
                y.s("Main", "resumed", aVar.f21656b.d());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        e(j4, eVar, aVar, null);
        if (this.f21770m) {
            y.t("Main", "completed", aVar.f21656b.d(), "from " + eVar);
        }
    }

    void l(com.squareup.picasso.a aVar) {
        this.f21762e.h(aVar);
    }

    t m(t tVar) {
        t a4 = this.f21758a.a(tVar);
        if (a4 != null) {
            return a4;
        }
        throw new IllegalStateException("Request transformer " + this.f21758a.getClass().getCanonicalName() + " returned null for " + tVar);
    }
}
