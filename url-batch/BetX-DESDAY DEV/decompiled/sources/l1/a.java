package l1;

import X0.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3515a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3516b;

    /* renamed from: c, reason: collision with root package name */
    public c f3517c;

    /* renamed from: d, reason: collision with root package name */
    public long f3518d;

    public a(String str, boolean z2) {
        f.e(str, "name");
        this.f3515a = str;
        this.f3516b = z2;
        this.f3518d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3515a;
    }
}
