package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acf {
    private static final ThreadLocal i = new ThreadLocal();
    public acd f;
    public final afr g;
    public final qy a = new qy(0);
    public final ArrayList b = new ArrayList();
    public final kee h = new kee(this);
    public final Runnable c = new nc(this, 12);
    public boolean d = false;
    public float e = 1.0f;

    public acf(afr afrVar) {
        this.g = afrVar;
    }

    static acf a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new acf(new afr((byte[]) null)));
        }
        return (acf) threadLocal.get();
    }

    final boolean b() {
        return Thread.currentThread() == ((Looper) this.g.b).getThread();
    }
}
