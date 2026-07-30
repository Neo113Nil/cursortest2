package d1;

import java.io.Serializable;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class c implements h1.a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient h1.a f79b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f80c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f81d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84g;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f80c = obj;
        this.f81d = cls;
        this.f82e = str;
        this.f83f = str2;
        this.f84g = z2;
    }

    public final d b() {
        boolean z2 = this.f84g;
        Class cls = this.f81d;
        if (!z2) {
            return l.a(cls);
        }
        l.f95a.getClass();
        return new j(cls);
    }
}
