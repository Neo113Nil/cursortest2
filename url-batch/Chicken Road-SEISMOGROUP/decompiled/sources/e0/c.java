package e0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements h0.a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient h0.a f545b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f546c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f547d;

    /* renamed from: e, reason: collision with root package name */
    public final String f548e;

    /* renamed from: f, reason: collision with root package name */
    public final String f549f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f550g;

    public c(Object obj, Class cls, String str, String str2, boolean z) {
        this.f546c = obj;
        this.f547d = cls;
        this.f548e = str;
        this.f549f = str2;
        this.f550g = z;
    }

    public final d b() {
        Class cls = this.f547d;
        if (!this.f550g) {
            return l.a(cls);
        }
        l.f561a.getClass();
        return new j(cls);
    }
}
