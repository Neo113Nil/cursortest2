package C0;

import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1150a;

    public a(e eVar) {
        this.f1150a = eVar;
    }

    public final int nextEndBoundary(int i2) {
        return this.f1150a.x(i2);
    }

    public final int nextStartBoundary(int i2) {
        return this.f1150a.C(i2);
    }

    public final int previousEndBoundary(int i2) {
        return this.f1150a.E(i2);
    }

    public final int previousStartBoundary(int i2) {
        return this.f1150a.w(i2);
    }
}
