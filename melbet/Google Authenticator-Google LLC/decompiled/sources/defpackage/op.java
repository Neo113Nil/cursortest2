package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class op extends ow {
    public static final Executor a = new oo(0);
    private static volatile op c;
    public final ow b;
    private final ow d;

    private op() {
        oq oqVar = new oq();
        this.d = oqVar;
        this.b = oqVar;
    }

    public static op a() {
        if (c == null) {
            synchronized (op.class) {
                if (c == null) {
                    c = new op();
                }
            }
        }
        return c;
    }

    public final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
