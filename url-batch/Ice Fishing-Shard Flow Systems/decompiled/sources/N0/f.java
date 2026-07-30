package N0;

import K1.o;
import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final D0.j f1784a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1785b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1786c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1787d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1788e;

    public f(Context context, D0.j taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f1784a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f1785b = applicationContext;
        this.f1786c = new Object();
        this.f1787d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(M0.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f1786c) {
            try {
                if (this.f1787d.remove(listener) && this.f1787d.isEmpty()) {
                    e();
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f1786c) {
            Object obj2 = this.f1788e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f1788e = obj;
                ((o) this.f1784a.f332l).execute(new A.j(CollectionsKt.z(this.f1787d), 5, this));
                Unit unit = Unit.f6114a;
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
