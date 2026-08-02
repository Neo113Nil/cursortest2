package g0;

import android.os.SystemClock;
import java.util.List;
import t0.AbstractC1429d;

/* loaded from: classes.dex */
public final class h extends AbstractC1429d {

    /* renamed from: g, reason: collision with root package name */
    public int f8840g;

    @Override // t0.t
    public final int d() {
        return this.f8840g;
    }

    @Override // t0.t
    public final void j(long j4, long j5, long j6, List list, r0.n[] nVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.f8840g, elapsedRealtime)) {
            for (int i4 = this.f15281b - 1; i4 >= 0; i4--) {
                if (!a(i4, elapsedRealtime)) {
                    this.f8840g = i4;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // t0.t
    public final int m() {
        return 0;
    }

    @Override // t0.t
    public final Object q() {
        return null;
    }
}
