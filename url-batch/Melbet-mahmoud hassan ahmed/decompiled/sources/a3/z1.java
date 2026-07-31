package a3;

import android.content.Context;

/* loaded from: classes.dex */
final class z1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f206f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ g2 f207g;

    z1(g2 g2Var, Context context) {
        this.f207g = g2Var;
        this.f206f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.f207g.f77d;
        synchronized (obj) {
            this.f207g.f78e = g2.v(this.f206f);
            obj2 = this.f207g.f77d;
            obj2.notifyAll();
        }
    }
}
