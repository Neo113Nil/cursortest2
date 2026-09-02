package W;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: f, reason: collision with root package name */
    public static s f3336f;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3337a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3338b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3339c;

    /* renamed from: d, reason: collision with root package name */
    public int f3340d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3341e;

    public s(Context context) {
        Executor g4 = AbstractC0108a.g();
        this.f3337a = g4;
        this.f3338b = new CopyOnWriteArrayList();
        this.f3339c = new Object();
        this.f3340d = 0;
        g4.execute(new R1.e(this, 5, context));
    }

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (s.class) {
            try {
                if (f3336f == null) {
                    f3336f = new s(context);
                }
                sVar = f3336f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public final int b() {
        int i4;
        synchronized (this.f3339c) {
            i4 = this.f3340d;
        }
        return i4;
    }

    public final void c(int i4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3338b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.f3331a.get() == null) {
                copyOnWriteArrayList.remove(qVar);
            }
        }
        synchronized (this.f3339c) {
            try {
                if (this.f3341e && this.f3340d == i4) {
                    return;
                }
                this.f3341e = true;
                this.f3340d = i4;
                Iterator it2 = this.f3338b.iterator();
                while (it2.hasNext()) {
                    q qVar2 = (q) it2.next();
                    qVar2.f3332b.execute(new R1.n(3, qVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
