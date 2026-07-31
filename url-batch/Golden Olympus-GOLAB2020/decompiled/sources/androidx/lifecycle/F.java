package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.H;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F implements InterfaceC1354u {

    /* renamed from: i, reason: collision with root package name */
    public static final b f12561i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final F f12562j = new F();

    /* renamed from: a, reason: collision with root package name */
    private int f12563a;

    /* renamed from: b, reason: collision with root package name */
    private int f12564b;

    /* renamed from: e, reason: collision with root package name */
    private Handler f12567e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12565c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12566d = true;

    /* renamed from: f, reason: collision with root package name */
    private final C1356w f12568f = new C1356w(this);

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f12569g = new Runnable() { // from class: androidx.lifecycle.E
        @Override // java.lang.Runnable
        public final void run() {
            F.i(F.this);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final H.a f12570h = new d();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12571a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1354u a() {
            return F.f12562j;
        }

        public final void b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            F.f12562j.h(context);
        }

        private b() {
        }
    }

    public static final class c extends AbstractC1341g {

        public static final class a extends AbstractC1341g {
            final /* synthetic */ F this$0;

            a(F f4) {
                this.this$0 = f4;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC1341g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                H.f12575b.b(activity).e(F.this.f12570h);
            }
        }

        @Override // androidx.lifecycle.AbstractC1341g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            F.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.a(activity, new a(F.this));
        }

        @Override // androidx.lifecycle.AbstractC1341g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            F.this.g();
        }
    }

    public static final class d implements H.a {
        d() {
        }

        @Override // androidx.lifecycle.H.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.H.a
        public void onResume() {
            F.this.e();
        }

        @Override // androidx.lifecycle.H.a
        public void onStart() {
            F.this.f();
        }
    }

    private F() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(F this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public static final InterfaceC1354u l() {
        return f12561i.a();
    }

    public final void d() {
        int i4 = this.f12564b - 1;
        this.f12564b = i4;
        if (i4 == 0) {
            Handler handler = this.f12567e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.f12569g, 700L);
        }
    }

    public final void e() {
        int i4 = this.f12564b + 1;
        this.f12564b = i4;
        if (i4 == 1) {
            if (this.f12565c) {
                this.f12568f.g(AbstractC1346l.a.ON_RESUME);
                this.f12565c = false;
            } else {
                Handler handler = this.f12567e;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.f12569g);
            }
        }
    }

    public final void f() {
        int i4 = this.f12563a + 1;
        this.f12563a = i4;
        if (i4 == 1 && this.f12566d) {
            this.f12568f.g(AbstractC1346l.a.ON_START);
            this.f12566d = false;
        }
    }

    public final void g() {
        this.f12563a--;
        k();
    }

    @Override // androidx.lifecycle.InterfaceC1354u
    public AbstractC1346l getLifecycle() {
        return this.f12568f;
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12567e = new Handler();
        this.f12568f.g(AbstractC1346l.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f12564b == 0) {
            this.f12565c = true;
            this.f12568f.g(AbstractC1346l.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f12563a == 0 && this.f12565c) {
            this.f12568f.g(AbstractC1346l.a.ON_STOP);
            this.f12566d = true;
        }
    }
}
