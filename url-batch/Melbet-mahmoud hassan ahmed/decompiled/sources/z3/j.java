package z3;

import android.content.Context;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f23694f;

    /* synthetic */ j(l lVar, i iVar) {
        this.f23694f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        long b7 = this.f23694f.b();
        if (b7 == -1 || v3.g.d().b() <= b7) {
            return;
        }
        context = this.f23694f.f23696a;
        l.f(context);
    }
}
