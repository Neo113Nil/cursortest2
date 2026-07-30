package v7;

import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9159a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9160b;

    /* renamed from: c, reason: collision with root package name */
    public c f9161c;

    /* renamed from: d, reason: collision with root package name */
    public long f9162d;

    public a(String str, boolean z8) {
        k.f(str, "name");
        this.f9159a = str;
        this.f9160b = z8;
        this.f9162d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f9159a;
    }
}
