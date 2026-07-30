package F0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements J0.a, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public transient J0.a f306e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f307f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f308g;

    /* renamed from: h, reason: collision with root package name */
    public final String f309h;

    /* renamed from: i, reason: collision with root package name */
    public final String f310i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f311j;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f307f = obj;
        this.f308g = cls;
        this.f309h = str;
        this.f310i = str2;
        this.f311j = z2;
    }

    public abstract J0.a a();

    public final d b() {
        Class cls = this.f308g;
        if (!this.f311j) {
            return q.a(cls);
        }
        q.f325a.getClass();
        return new k(cls);
    }
}
