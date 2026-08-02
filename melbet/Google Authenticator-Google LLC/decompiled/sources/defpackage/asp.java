package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class asp {
    public Context a;
    public WorkerParameters b;
    public boolean c;
    private final AtomicInteger d = new AtomicInteger(-256);

    public asp(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public hvi a() {
        throw null;
    }

    public abstract hvi b();

    public final int d() {
        return this.d.get();
    }

    public final asa e() {
        return this.b.b;
    }

    public final UUID f() {
        return this.b.a;
    }

    public final Executor g() {
        return this.b.d;
    }

    public final void h(int i) {
        this.d.compareAndSet(-256, i);
    }

    public final boolean i() {
        return this.d.get() != -256;
    }
}
