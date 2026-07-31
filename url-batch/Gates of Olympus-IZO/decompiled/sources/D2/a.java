package D2;

import Z1.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f586a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f587b;

    /* renamed from: c, reason: collision with root package name */
    public c f588c;

    /* renamed from: d, reason: collision with root package name */
    public long f589d;

    public a(String str, boolean z3) {
        i.f(str, "name");
        this.f586a = str;
        this.f587b = z3;
        this.f589d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f586a;
    }
}
