package C1;

import j1.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f134b;

    /* renamed from: c, reason: collision with root package name */
    public c f135c;

    /* renamed from: d, reason: collision with root package name */
    public long f136d;

    public a(String str, boolean z2) {
        h.e(str, "name");
        this.f133a = str;
        this.f134b = z2;
        this.f136d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f133a;
    }
}
