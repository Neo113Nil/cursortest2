package a5;

import a5.c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.c;

/* loaded from: classes.dex */
class c implements m5.c, a5.f {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f232a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, f> f233b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<b>> f234c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f235d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f236e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, c.b> f237f;

    /* renamed from: g, reason: collision with root package name */
    private int f238g;

    /* renamed from: h, reason: collision with root package name */
    private final d f239h;

    /* renamed from: i, reason: collision with root package name */
    private WeakHashMap<c.InterfaceC0107c, d> f240i;

    /* renamed from: j, reason: collision with root package name */
    private i f241j;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f242a;

        /* renamed from: b, reason: collision with root package name */
        int f243b;

        /* renamed from: c, reason: collision with root package name */
        long f244c;

        b(ByteBuffer byteBuffer, int i7, long j7) {
            this.f242a = byteBuffer;
            this.f243b = i7;
            this.f244c = j7;
        }
    }

    /* renamed from: a5.c$c, reason: collision with other inner class name */
    static class C0003c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ExecutorService f245a;

        C0003c(ExecutorService executorService) {
            this.f245a = executorService;
        }

        @Override // a5.c.d
        public void a(Runnable runnable) {
            this.f245a.execute(runnable);
        }
    }

    interface d {
        void a(Runnable runnable);
    }

    private static class e implements i {

        /* renamed from: a, reason: collision with root package name */
        ExecutorService f246a = z4.a.e().b();

        e() {
        }

        @Override // a5.c.i
        public d a(c.d dVar) {
            return dVar.a() ? new h(this.f246a) : new C0003c(this.f246a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f {

        /* renamed from: a, reason: collision with root package name */
        public final c.a f247a;

        /* renamed from: b, reason: collision with root package name */
        public final d f248b;

        f(c.a aVar, d dVar) {
            this.f247a = aVar;
            this.f248b = dVar;
        }
    }

    static class g implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final FlutterJNI f249a;

        /* renamed from: b, reason: collision with root package name */
        private final int f250b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f251c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i7) {
            this.f249a = flutterJNI;
            this.f250b = i7;
        }

        @Override // m5.c.b
        public void a(ByteBuffer byteBuffer) {
            if (this.f251c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f249a.invokePlatformMessageEmptyResponseCallback(this.f250b);
            } else {
                this.f249a.invokePlatformMessageResponseCallback(this.f250b, byteBuffer, byteBuffer.position());
            }
        }
    }

    static class h implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ExecutorService f252a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f253b = new ConcurrentLinkedQueue<>();

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f254c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f252a = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void f() {
            if (this.f254c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f253b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f254c.set(false);
                    if (!this.f253b.isEmpty()) {
                        this.f252a.execute(new Runnable() { // from class: a5.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.h.this.f();
                            }
                        });
                    }
                }
            }
        }

        @Override // a5.c.d
        public void a(Runnable runnable) {
            this.f253b.add(runnable);
            this.f252a.execute(new Runnable() { // from class: a5.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.h.this.e();
                }
            });
        }
    }

    interface i {
        d a(c.d dVar);
    }

    private static class j implements c.InterfaceC0107c {
        private j() {
        }
    }

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f233b = new HashMap();
        this.f234c = new HashMap();
        this.f235d = new Object();
        this.f236e = new AtomicBoolean(false);
        this.f237f = new HashMap();
        this.f238g = 1;
        this.f239h = new a5.g();
        this.f240i = new WeakHashMap<>();
        this.f232a = flutterJNI;
        this.f241j = iVar;
    }

    private void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i7, final long j7) {
        d dVar = fVar != null ? fVar.f248b : null;
        Runnable runnable = new Runnable() { // from class: a5.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.m(str, fVar, byteBuffer, i7, j7);
            }
        };
        if (dVar == null) {
            dVar = this.f239h;
        }
        dVar.a(runnable);
    }

    private static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i7) {
        if (fVar != null) {
            try {
                z4.b.e("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f247a.a(byteBuffer, new g(this.f232a, i7));
                return;
            } catch (Error e7) {
                k(e7);
                return;
            } catch (Exception e8) {
                z4.b.c("DartMessenger", "Uncaught exception in binary message listener", e8);
            }
        } else {
            z4.b.e("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f232a.invokePlatformMessageEmptyResponseCallback(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, f fVar, ByteBuffer byteBuffer, int i7, long j7) {
        u5.e.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            l(fVar, byteBuffer, i7);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f232a.cleanupMessageData(j7);
            u5.e.b();
        }
    }

    @Override // m5.c
    public c.InterfaceC0107c a(c.d dVar) {
        d a7 = this.f241j.a(dVar);
        j jVar = new j();
        this.f240i.put(jVar, a7);
        return jVar;
    }

    @Override // m5.c
    public /* synthetic */ c.InterfaceC0107c b() {
        return m5.b.a(this);
    }

    @Override // m5.c
    public void c(String str, ByteBuffer byteBuffer, c.b bVar) {
        u5.e.a("DartMessenger#send on " + str);
        try {
            z4.b.e("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i7 = this.f238g;
            this.f238g = i7 + 1;
            if (bVar != null) {
                this.f237f.put(Integer.valueOf(i7), bVar);
            }
            if (byteBuffer == null) {
                this.f232a.dispatchEmptyPlatformMessage(str, i7);
            } else {
                this.f232a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i7);
            }
        } finally {
            u5.e.b();
        }
    }

    @Override // m5.c
    public void d(String str, c.a aVar, c.InterfaceC0107c interfaceC0107c) {
        if (aVar == null) {
            z4.b.e("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f235d) {
                this.f233b.remove(str);
            }
            return;
        }
        d dVar = null;
        if (interfaceC0107c != null && (dVar = this.f240i.get(interfaceC0107c)) == null) {
            throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        }
        z4.b.e("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f235d) {
            this.f233b.put(str, new f(aVar, dVar));
            List<b> remove = this.f234c.remove(str);
            if (remove == null) {
                return;
            }
            for (b bVar : remove) {
                j(str, this.f233b.get(str), bVar.f242a, bVar.f243b, bVar.f244c);
            }
        }
    }

    @Override // m5.c
    public void e(String str, ByteBuffer byteBuffer) {
        z4.b.e("DartMessenger", "Sending message over channel '" + str + "'");
        c(str, byteBuffer, null);
    }

    @Override // m5.c
    public void f(String str, c.a aVar) {
        d(str, aVar, null);
    }

    @Override // a5.f
    public void g(int i7, ByteBuffer byteBuffer) {
        z4.b.e("DartMessenger", "Received message reply from Dart.");
        c.b remove = this.f237f.remove(Integer.valueOf(i7));
        if (remove != null) {
            try {
                z4.b.e("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e7) {
                k(e7);
            } catch (Exception e8) {
                z4.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e8);
            }
        }
    }

    @Override // a5.f
    public void h(String str, ByteBuffer byteBuffer, int i7, long j7) {
        f fVar;
        boolean z6;
        z4.b.e("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f235d) {
            fVar = this.f233b.get(str);
            z6 = this.f236e.get() && fVar == null;
            if (z6) {
                if (!this.f234c.containsKey(str)) {
                    this.f234c.put(str, new LinkedList());
                }
                this.f234c.get(str).add(new b(byteBuffer, i7, j7));
            }
        }
        if (z6) {
            return;
        }
        j(str, fVar, byteBuffer, i7, j7);
    }
}
