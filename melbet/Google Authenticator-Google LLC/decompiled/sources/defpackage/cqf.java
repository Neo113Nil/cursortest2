package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqf implements Executor {
    public static Context a;
    private static volatile cqf b;

    private cqf() {
    }

    public static cqf a(Context context) {
        cqf cqfVar;
        cqf cqfVar2 = b;
        if (cqfVar2 != null) {
            return cqfVar2;
        }
        synchronized (cqf.class) {
            cqfVar = b;
            if (cqfVar == null) {
                Context applicationContext = context.getApplicationContext();
                oy.at(applicationContext);
                a = applicationContext;
                cqfVar = new cqf();
                b = cqfVar;
            }
        }
        return cqfVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        cqe.a.post(runnable);
    }
}
