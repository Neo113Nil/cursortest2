package w3;

import i3.d;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3822a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3823b;

    /* renamed from: c, reason: collision with root package name */
    public b f3824c;
    public long d;

    public a(String str, boolean z4) {
        d.e(str, "name");
        this.f3822a = str;
        this.f3823b = z4;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3822a;
    }
}
