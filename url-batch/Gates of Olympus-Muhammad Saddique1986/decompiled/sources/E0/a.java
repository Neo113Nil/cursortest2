package E0;

import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1022a;

    public a(e eVar) {
        this.f1022a = eVar;
    }

    public final int nextEndBoundary(int i3) {
        return this.f1022a.w(i3);
    }

    public final int nextStartBoundary(int i3) {
        return this.f1022a.B(i3);
    }

    public final int previousEndBoundary(int i3) {
        return this.f1022a.D(i3);
    }

    public final int previousStartBoundary(int i3) {
        return this.f1022a.v(i3);
    }
}
