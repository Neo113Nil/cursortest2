package G1;

import android.os.Trace;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3158d = 1;

    public /* synthetic */ u() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3158d) {
            case 0:
                throw null;
            default:
                try {
                    int i2 = X0.g.f4358a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (k1.h.c()) {
                        k1.h.a().d();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i4 = X0.g.f4358a;
                    Trace.endSection();
                    throw th;
                }
        }
    }

    public u(v vVar) {
    }
}
