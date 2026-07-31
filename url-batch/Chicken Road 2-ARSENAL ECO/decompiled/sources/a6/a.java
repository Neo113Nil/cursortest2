package a6;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3161b;

    /* renamed from: c, reason: collision with root package name */
    public c f3162c;

    /* renamed from: d, reason: collision with root package name */
    public long f3163d;

    public a(String name) {
        i.e(name, "name");
        this.f3160a = name;
        this.f3161b = true;
        this.f3163d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3160a;
    }
}
