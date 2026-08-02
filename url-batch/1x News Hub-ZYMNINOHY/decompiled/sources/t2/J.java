package t2;

import c2.C0204b;

/* loaded from: classes.dex */
public abstract class J extends AbstractC1208s {
    public static final /* synthetic */ int f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f10384c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10385d;

    /* renamed from: e, reason: collision with root package name */
    public C0204b f10386e;

    public final void e(boolean z) {
        long j3 = this.f10384c - (z ? 4294967296L : 1L);
        this.f10384c = j3;
        if (j3 <= 0 && this.f10385d) {
            shutdown();
        }
    }

    public abstract Thread f();

    public final void g(boolean z) {
        this.f10384c = (z ? 4294967296L : 1L) + this.f10384c;
        if (z) {
            return;
        }
        this.f10385d = true;
    }

    public abstract long j();

    public final boolean m() {
        C0204b c0204b = this.f10386e;
        if (c0204b == null) {
            return false;
        }
        C c3 = (C) (c0204b.isEmpty() ? null : c0204b.removeFirst());
        if (c3 == null) {
            return false;
        }
        c3.run();
        return true;
    }

    public abstract void shutdown();
}
