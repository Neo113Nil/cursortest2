package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9888a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f9889b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f9890c;

    /* renamed from: d, reason: collision with root package name */
    private int f9891d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9892e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9893f;

    /* renamed from: g, reason: collision with root package name */
    private final List f9894g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f9895h;

    public t(Executor executor, Function0 reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f9888a = executor;
        this.f9889b = reportFullyDrawn;
        this.f9890c = new Object();
        this.f9894g = new ArrayList();
        this.f9895h = new Runnable() { // from class: androidx.activity.s
            @Override // java.lang.Runnable
            public final void run() {
                t.d(t.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(t this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f9890c) {
            try {
                this$0.f9892e = false;
                if (this$0.f9891d == 0 && !this$0.f9893f) {
                    this$0.f9889b.invoke();
                    this$0.b();
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f9890c) {
            try {
                this.f9893f = true;
                Iterator it = this.f9894g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f9894g.clear();
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z4;
        synchronized (this.f9890c) {
            z4 = this.f9893f;
        }
        return z4;
    }
}
