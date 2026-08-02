package J3;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1196a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1197b;

    /* renamed from: c, reason: collision with root package name */
    public c f1198c;

    /* renamed from: d, reason: collision with root package name */
    public long f1199d;

    public a(String name, boolean z) {
        i.e(name, "name");
        this.f1196a = name;
        this.f1197b = z;
        this.f1199d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f1196a;
    }
}
