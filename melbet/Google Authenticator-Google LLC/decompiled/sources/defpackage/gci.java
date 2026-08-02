package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gci implements asz {
    final Handler a;

    public gci(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.asz
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.asz
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
