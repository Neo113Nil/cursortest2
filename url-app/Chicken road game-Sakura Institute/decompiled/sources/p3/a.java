package p3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9116a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9117b;

    /* renamed from: c, reason: collision with root package name */
    public c f9118c;

    /* renamed from: d, reason: collision with root package name */
    public long f9119d;

    public a(String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f9116a = name;
        this.f9117b = z4;
        this.f9119d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f9116a;
    }
}
