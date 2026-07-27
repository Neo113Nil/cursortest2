package s0;

import W2.AbstractC0298u;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import p2.C0996c;
import y2.C1336k;
import y2.InterfaceC1335j;
import z2.C1433q;

/* loaded from: classes.dex */
public final class V extends AbstractC0298u {

    /* renamed from: s, reason: collision with root package name */
    public static final InterfaceC1335j f10139s = C1336k.a(C1126L.f10084n);

    /* renamed from: t, reason: collision with root package name */
    public static final C0996c f10140t = new C0996c(3);

    /* renamed from: i, reason: collision with root package name */
    public final Choreographer f10141i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f10142j;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10147o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10148p;

    /* renamed from: r, reason: collision with root package name */
    public final W f10150r;

    /* renamed from: k, reason: collision with root package name */
    public final Object f10143k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final C1433q f10144l = new C1433q();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f10145m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f10146n = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final U f10149q = new U(this);

    public V(Choreographer choreographer, Handler handler) {
        this.f10141i = choreographer;
        this.f10142j = handler;
        this.f10150r = new W(choreographer, this);
    }

    public static final void A(V v4) {
        Runnable runnable;
        boolean z4;
        do {
            synchronized (v4.f10143k) {
                C1433q c1433q = v4.f10144l;
                runnable = (Runnable) (c1433q.isEmpty() ? null : c1433q.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (v4.f10143k) {
                    C1433q c1433q2 = v4.f10144l;
                    runnable = (Runnable) (c1433q2.isEmpty() ? null : c1433q2.removeFirst());
                }
            }
            synchronized (v4.f10143k) {
                if (v4.f10144l.isEmpty()) {
                    z4 = false;
                    v4.f10147o = false;
                } else {
                    z4 = true;
                }
            }
        } while (z4);
    }

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.f10143k) {
            try {
                this.f10144l.addLast(runnable);
                if (!this.f10147o) {
                    this.f10147o = true;
                    this.f10142j.post(this.f10149q);
                    if (!this.f10148p) {
                        this.f10148p = true;
                        this.f10141i.postFrameCallback(this.f10149q);
                    }
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
