package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hui {
    private static final hvh d = new hvh(hui.class);
    public boolean a;
    public final hak b = new hak();
    public byo c;

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            d.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }
}
