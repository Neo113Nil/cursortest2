package o3;

import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g implements Iterable, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f3033f;

    public g(d dVar) {
        this.f3033f = dVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p3.b(this.f3033f);
    }
}
