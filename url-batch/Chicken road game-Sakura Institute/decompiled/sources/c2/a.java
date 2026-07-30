package c2;

import android.text.SegmentFinder;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1629a;

    public a(e eVar) {
        this.f1629a = eVar;
    }

    public final int nextEndBoundary(int i7) {
        return this.f1629a.d(i7);
    }

    public final int nextStartBoundary(int i7) {
        return this.f1629a.g(i7);
    }

    public final int previousEndBoundary(int i7) {
        return this.f1629a.j(i7);
    }

    public final int previousStartBoundary(int i7) {
        return this.f1629a.c(i7);
    }
}
