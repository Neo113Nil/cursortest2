package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egd {
    public Context a;
    public ExecutorService b;
    public ScheduledExecutorService c;
    public Handler d;
    public efx f;
    public jdd g;
    public final cll e = cll.a;
    public final dih h = new dih();
    private final hac i = hoq.v(new csm(15));

    public final egc a() {
        this.a.getClass();
        if (this.b == null) {
            ExecutorService executorService = this.c;
            if (executorService == null) {
                executorService = Executors.newCachedThreadPool((ThreadFactory) this.i.bB());
            }
            this.b = executorService;
        }
        if (this.c == null) {
            this.c = Executors.newSingleThreadScheduledExecutor((ThreadFactory) this.i.bB());
        }
        return new ehe(this.b, new efm(this, 18), 1);
    }

    public final void b(Context context) {
        this.a = context.getApplicationContext();
    }
}
