package G6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f846a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f847b;

    /* renamed from: c, reason: collision with root package name */
    public c f848c;

    /* renamed from: d, reason: collision with root package name */
    public long f849d;

    public a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f846a = name;
        this.f847b = true;
        this.f849d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f846a;
    }
}
