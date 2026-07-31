package d;

import b.t;
import c5.x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final x f2044a;

    /* renamed from: b, reason: collision with root package name */
    public final t f2045b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(x xVar, t tVar) {
        this.f2044a = xVar;
        this.f2045b = tVar;
        if ((xVar == null ? tVar : xVar) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }
}
