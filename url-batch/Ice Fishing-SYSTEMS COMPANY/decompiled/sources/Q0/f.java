package Q0;

import N2.A;
import android.content.Context;
import java.util.LinkedHashSet;
import r7.AbstractC4979j;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Y2.e f2701a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2702b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2703c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2704d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2705e;

    public f(Context context, Y2.e eVar) {
        this.f2701a = eVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext, "context.applicationContext");
        this.f2702b = applicationContext;
        this.f2703c = new Object();
        this.f2704d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(P0.b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        synchronized (this.f2703c) {
            if (this.f2704d.remove(listener) && this.f2704d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f2703c) {
            Object obj2 = this.f2705e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f2705e = obj;
                ((A) this.f2701a.f3965w).execute(new D5.b(9, AbstractC4979j.R(this.f2704d), this));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
