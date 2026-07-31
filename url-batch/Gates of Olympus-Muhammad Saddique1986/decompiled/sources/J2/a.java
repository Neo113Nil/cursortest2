package J2;

import f2.j;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3185a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3186b;

    /* renamed from: c, reason: collision with root package name */
    public c f3187c;

    /* renamed from: d, reason: collision with root package name */
    public long f3188d;

    public a(String str, boolean z3) {
        j.f(str, "name");
        this.f3185a = str;
        this.f3186b = z3;
        this.f3188d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3185a;
    }
}
