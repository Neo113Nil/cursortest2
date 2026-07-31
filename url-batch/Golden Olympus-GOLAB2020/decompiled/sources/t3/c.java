package t3;

import W1.h;
import W1.i;
import W1.l;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f46274a;

    /* renamed from: b, reason: collision with root package name */
    private final a f46275b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f46276c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f46277d;

    /* renamed from: e, reason: collision with root package name */
    private final h f46278e;

    /* renamed from: f, reason: collision with root package name */
    private final h f46279f;

    /* renamed from: g, reason: collision with root package name */
    private final t3.a f46280g;

    /* renamed from: h, reason: collision with root package name */
    private final x3.a f46281h;

    /* renamed from: i, reason: collision with root package name */
    private final x3.b f46282i;

    /* renamed from: j, reason: collision with root package name */
    private final y3.b f46283j;

    /* renamed from: k, reason: collision with root package name */
    private final w3.a f46284k;

    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final b f46285f = new b(null);

        /* renamed from: a, reason: collision with root package name */
        private final V1.a f46286a;

        /* renamed from: b, reason: collision with root package name */
        private final int f46287b;

        /* renamed from: c, reason: collision with root package name */
        private final V1.a f46288c;

        /* renamed from: d, reason: collision with root package name */
        private final int f46289d;

        /* renamed from: e, reason: collision with root package name */
        private final Executor f46290e;

        /* renamed from: t3.c$a$a, reason: collision with other inner class name */
        public static final class C0280a {

            /* renamed from: a, reason: collision with root package name */
            private V1.a f46291a = m3.a.a("https://sdk-api.apptracer.ru");

            /* renamed from: b, reason: collision with root package name */
            private V1.a f46292b = m3.a.a(null);

            /* renamed from: c, reason: collision with root package name */
            private int f46293c = -1;

            /* renamed from: d, reason: collision with root package name */
            private final int f46294d = 30;

            /* renamed from: e, reason: collision with root package name */
            private Executor f46295e;

            public final a a() {
                return new a(this, null);
            }

            public final V1.a b() {
                return this.f46291a;
            }

            public final int c() {
                return this.f46294d;
            }

            public final Executor d() {
                return this.f46295e;
            }

            public final V1.a e() {
                return this.f46292b;
            }

            public final int f() {
                return this.f46293c;
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ a(C0280a c0280a, DefaultConstructorMarker defaultConstructorMarker) {
            this(c0280a);
        }

        public final String a() {
            Object obj = this.f46286a.get();
            Intrinsics.checkNotNullExpressionValue(obj, "apiUrlProvider.get()");
            return (String) obj;
        }

        public final Executor b() {
            return this.f46290e;
        }

        public final int c() {
            return this.f46289d;
        }

        public final V1.a d() {
            return this.f46288c;
        }

        public final int e() {
            return this.f46287b;
        }

        private a(C0280a c0280a) {
            this.f46286a = c0280a.b();
            this.f46287b = c0280a.f();
            this.f46288c = c0280a.e();
            this.f46289d = c0280a.c();
            this.f46290e = c0280a.d();
        }
    }

    static final class b extends s implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final t3.b invoke() {
            String str;
            String i4 = c.this.i();
            z3.b k4 = c.this.k();
            if (k4 == null || (str = k4.versionName()) == null) {
                str = "NA";
            }
            z3.b k5 = c.this.k();
            String buildUuid = k5 != null ? k5.buildUuid() : null;
            z3.b k6 = c.this.k();
            return new t3.b(i4, str, buildUuid, k6 != null ? k6.environment() : null);
        }
    }

    /* renamed from: t3.c$c, reason: collision with other inner class name */
    static final class C0281c extends s implements Function0 {
        C0281c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final z3.b invoke() {
            try {
                return p3.a.b(c.this.i());
            } catch (Exception unused) {
                Log.e("Tracer", "Could not find manifest for library " + c.this.i());
                return null;
            }
        }
    }

    public c(Context context, String libraryPackageName, a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f46274a = libraryPackageName;
        this.f46275b = configuration;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f46277d = applicationContext;
        l lVar = l.f9607c;
        this.f46278e = i.a(lVar, new C0281c());
        this.f46279f = i.a(lVar, new b());
        this.f46280g = new t3.a(configuration.c());
        this.f46281h = new x3.a(context, libraryPackageName);
        this.f46282i = new x3.b(context, libraryPackageName, configuration.e());
        this.f46283j = new y3.b(configuration.b(), libraryPackageName);
        this.f46284k = new w3.a(context, libraryPackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z3.b k() {
        return (z3.b) this.f46278e.getValue();
    }

    public final a b() {
        return this.f46275b;
    }

    public final Context c() {
        return this.f46277d;
    }

    public final x3.a d() {
        return this.f46281h;
    }

    public final y3.b e() {
        return this.f46283j;
    }

    public final x3.b f() {
        return this.f46282i;
    }

    public final String g() {
        String str = (String) this.f46275b.d().get();
        if (str != null) {
            return str;
        }
        z3.b k4 = k();
        if (k4 != null) {
            if (k4.isDisabled()) {
                k4 = null;
            }
            if (k4 != null) {
                return k4.appToken();
            }
        }
        return null;
    }

    public final t3.b h() {
        return (t3.b) this.f46279f.getValue();
    }

    public final String i() {
        return this.f46274a;
    }

    public final w3.a j() {
        return this.f46284k;
    }

    public final String l() {
        return q3.b.b();
    }

    public final t3.a m() {
        return this.f46280g;
    }

    public final boolean n() {
        if (this.f46276c) {
            return true;
        }
        z3.b k4 = k();
        if (k4 != null && !k4.isDisabled()) {
            return false;
        }
        this.f46276c = true;
        return true;
    }

    public /* synthetic */ c(Context context, String str, a aVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i4 & 4) != 0 ? new a.C0280a().a() : aVar);
    }
}
