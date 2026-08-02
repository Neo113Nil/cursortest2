package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class awp {
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final ldt e;

    protected awp(Context context, ldt ldtVar) {
        this.e = ldtVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == null || !ksp.b(obj2, obj)) {
                this.d = obj;
                this.e.d.execute(new avl((Object) ixc.p(this.c), (Object) this, 3, (short[]) null));
            }
        }
    }
}
