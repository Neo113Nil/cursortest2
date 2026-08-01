package o3;

import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f3024a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3025b;

    public b(e eVar, int i) {
        this.f3024a = eVar;
        this.f3025b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o3.e
    public final Iterator iterator() {
        return new i3.a(this);
    }
}
