package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eec {
    public Context a;
    public drb b;
    public ExecutorService c;
    public dpd d;
    public efc e;
    public dme f;
    public efu g;
    public ede h;
    public final gzp i = gyf.a;
    public gwh j;

    public final ede a() {
        ede edeVar = this.h;
        if (edeVar != null) {
            return edeVar;
        }
        throw new IllegalStateException("Property \"accountLayer\" has not been set");
    }

    public final gzp b() {
        ExecutorService executorService = this.c;
        return executorService == null ? gyf.a : gzp.h(executorService);
    }

    public final void c(ExecutorService executorService) {
        if (executorService == null) {
            throw new NullPointerException("Null backgroundExecutor");
        }
        this.c = executorService;
    }
}
