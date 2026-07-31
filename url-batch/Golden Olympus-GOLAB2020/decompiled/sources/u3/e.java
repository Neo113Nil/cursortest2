package u3;

import W1.h;
import W1.i;
import W1.l;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    private static final a f46394j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private static final ConcurrentHashMap f46395k = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final t3.c f46396a;

    /* renamed from: b, reason: collision with root package name */
    private final b f46397b;

    /* renamed from: c, reason: collision with root package name */
    private final u3.a f46398c;

    /* renamed from: d, reason: collision with root package name */
    private final w3.a f46399d;

    /* renamed from: e, reason: collision with root package name */
    private final v3.a f46400e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f46401f;

    /* renamed from: g, reason: collision with root package name */
    private final h f46402g;

    /* renamed from: h, reason: collision with root package name */
    private final o3.a f46403h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f46404i;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final C0283b f46405d = new C0283b(null);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f46406a;

        /* renamed from: b, reason: collision with root package name */
        private final int f46407b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f46408c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f46409a;

            /* renamed from: b, reason: collision with root package name */
            private int f46410b = 65536;

            /* renamed from: c, reason: collision with root package name */
            private boolean f46411c;

            public final b a() {
                return new b(this, null);
            }

            public final int b() {
                return this.f46410b;
            }

            public final boolean c() {
                return this.f46411c;
            }

            public final boolean d() {
                return this.f46409a;
            }
        }

        /* renamed from: u3.e$b$b, reason: collision with other inner class name */
        public static final class C0283b {
            public /* synthetic */ C0283b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0283b() {
            }
        }

        public /* synthetic */ b(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }

        public final int a() {
            return this.f46407b;
        }

        public final boolean b() {
            return this.f46408c;
        }

        public final boolean c() {
            return this.f46406a;
        }

        private b(a aVar) {
            this.f46406a = aVar.d();
            this.f46407b = aVar.b();
            this.f46408c = aVar.c();
        }
    }

    static final class c extends s implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(e.this.f46397b.c() || !u3.b.b() || u3.b.a());
        }
    }

    public e(t3.c tracer, b configuration) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f46396a = tracer;
        this.f46397b = configuration;
        this.f46398c = new u3.a(configuration.a());
        w3.a a4 = w3.a.f46674d.a(tracer);
        this.f46399d = a4;
        this.f46400e = new v3.a(tracer, a4);
        this.f46402g = i.a(l.f9607c, new c());
        ConcurrentHashMap concurrentHashMap = f46395k;
        String i4 = tracer.i();
        Object obj = concurrentHashMap.get(i4);
        if (obj == null) {
            o3.a aVar = configuration.b() ? new o3.a(10, 3600000L, TimeUnit.MILLISECONDS) : o3.a.f42109e.a(8);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(i4, aVar);
            obj = putIfAbsent == null ? aVar : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "nonFatalBuckets.getOrPut…        )\n        }\n    }");
        this.f46403h = (o3.a) obj;
        this.f46404i = new AtomicInteger();
    }

    private final k3.a d() {
        return x3.a.f46710b.a(this.f46396a);
    }

    private final Executor e() {
        return y3.b.f46793b.e(this.f46396a).a();
    }

    private final boolean f() {
        return ((Boolean) this.f46402g.getValue()).booleanValue();
    }

    private final t3.a g() {
        return t3.a.f46267c.a(this.f46396a);
    }

    public static /* synthetic */ void i(e eVar, Throwable th, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        eVar.h(th, str);
    }

    private final void j(final String str, final Throwable th, final String str2) {
        if (this.f46401f) {
            Log.d("Tracer", "Tracer is disabled");
            return;
        }
        if (f()) {
            if (this.f46399d.c("CRASH_REPORT", null)) {
                Log.e("Tracer", "Feature CRASH_REPORT limited");
            } else {
                if (o3.a.c(this.f46403h, 0, 1, null)) {
                    e().execute(new Runnable() { // from class: u3.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.l(e.this, str, th, str2);
                        }
                    });
                    return;
                }
                Log.d("Tracer", "Can't handle non fatal exception. Max non fatal count is reached.");
                this.f46404i.incrementAndGet();
                e().execute(new Runnable() { // from class: u3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.k(e.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(e this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d().a("non_fatal", this$0.f46397b.b() ? "max_non_fatals_per_interval_reached" : "max_non_fatals_per_session_reached", this$0.f46404i.getAndSet(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(e this$0, String severity, Throwable e4, String str) {
        String obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(severity, "$severity");
        Intrinsics.checkNotNullParameter(e4, "$e");
        if (this$0.f46396a.n()) {
            Log.d("Tracer", "Tracer is disabled");
            this$0.f46401f = true;
            return;
        }
        String str2 = null;
        if (this$0.f46399d.c("CRASH_REPORT", null)) {
            Log.e("Tracer", "Feature CRASH_REPORT limited");
            return;
        }
        v3.a aVar = this$0.f46400e;
        if (str != null && (obj = StringsKt.W0(str).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                str2 = StringsKt.i1(obj, 32);
            }
        }
        aVar.b(severity, e4, str2, this$0.f46398c.a(), this$0.g().a());
    }

    public final void h(Throwable e4, String str) {
        Intrinsics.checkNotNullParameter(e4, "e");
        j("NON_FATAL", e4, str);
    }

    public /* synthetic */ e(t3.c cVar, b bVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i4 & 2) != 0 ? new b.a().a() : bVar);
    }
}
