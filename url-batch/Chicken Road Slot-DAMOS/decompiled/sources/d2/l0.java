package d2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l0 extends ge.t {
    public static final hd.q A = hd.h.b(i0.f3424u);
    public static final com.google.android.gms.internal.measurement.g0 B = new com.google.android.gms.internal.measurement.g0(3);

    /* renamed from: i, reason: collision with root package name */
    public final Choreographer f3456i;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f3457r;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3462w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3463x;

    /* renamed from: z, reason: collision with root package name */
    public final n0 f3465z;

    /* renamed from: s, reason: collision with root package name */
    public final Object f3458s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public final kotlin.collections.s f3459t = new kotlin.collections.s();

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3460u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f3461v = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final k0 f3464y = new k0(this);

    public l0(Choreographer choreographer, Handler handler) {
        this.f3456i = choreographer;
        this.f3457r = handler;
        this.f3465z = new n0(choreographer, this);
    }

    public static final void P(l0 l0Var) {
        Runnable runnable;
        boolean z10;
        do {
            synchronized (l0Var.f3458s) {
                kotlin.collections.s sVar = l0Var.f3459t;
                runnable = (Runnable) (sVar.isEmpty() ? null : sVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (l0Var.f3458s) {
                    kotlin.collections.s sVar2 = l0Var.f3459t;
                    runnable = (Runnable) (sVar2.isEmpty() ? null : sVar2.removeFirst());
                }
            }
            synchronized (l0Var.f3458s) {
                if (l0Var.f3459t.isEmpty()) {
                    z10 = false;
                    l0Var.f3462w = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.f3458s) {
            this.f3459t.addLast(runnable);
            if (!this.f3462w) {
                this.f3462w = true;
                this.f3457r.post(this.f3464y);
                if (!this.f3463x) {
                    this.f3463x = true;
                    this.f3456i.postFrameCallback(this.f3464y);
                }
            }
        }
    }
}
