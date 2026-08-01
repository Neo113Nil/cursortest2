package j1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements o1.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient o1.a f3170a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3171b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f3172c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3173d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3174f;

    public b(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f3171b = obj;
        this.f3172c = cls;
        this.f3173d = str;
        this.e = str2;
        this.f3174f = z2;
    }

    public final c a() {
        Class cls = this.f3172c;
        if (!this.f3174f) {
            return l.a(cls);
        }
        l.f3186a.getClass();
        return new j(cls);
    }
}
