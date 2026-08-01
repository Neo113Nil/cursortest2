package C1;

import k1.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f108a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f109b;

    /* renamed from: c, reason: collision with root package name */
    public c f110c;
    public long d;

    public a(String str, boolean z2) {
        e.e(str, "name");
        this.f108a = str;
        this.f109b = z2;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f108a;
    }
}
