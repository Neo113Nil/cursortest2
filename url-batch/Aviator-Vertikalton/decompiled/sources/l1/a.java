package l1;

import X0.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3512a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3513b;

    /* renamed from: c, reason: collision with root package name */
    public c f3514c;

    /* renamed from: d, reason: collision with root package name */
    public long f3515d;

    public a(String str, boolean z2) {
        f.e(str, "name");
        this.f3512a = str;
        this.f3513b = z2;
        this.f3515d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3512a;
    }
}
