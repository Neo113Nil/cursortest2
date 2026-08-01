package b7;

import android.os.Trace;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p0 f1330e = new p0(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1331d;

    public /* synthetic */ p0(int i3) {
        this.f1331d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1331d) {
            case 0:
                return;
            case 1:
                try {
                    int i3 = k3.h.f5384a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (c4.k.c()) {
                        c4.k.a().d();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i10 = k3.h.f5384a;
                    Trace.endSection();
                    throw th;
                }
            default:
                return;
        }
    }

    private final /* synthetic */ void a() {
    }

    private final void b() {
    }
}
