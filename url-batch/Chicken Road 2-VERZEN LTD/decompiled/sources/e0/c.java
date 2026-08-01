package e0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements h0.a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient h0.a f489b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f490c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f491d;

    /* renamed from: e, reason: collision with root package name */
    public final String f492e;

    /* renamed from: f, reason: collision with root package name */
    public final String f493f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f494g;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f490c = obj;
        this.f491d = cls;
        this.f492e = str;
        this.f493f = str2;
        this.f494g = z2;
    }

    public final d b() {
        Class cls = this.f491d;
        if (!this.f494g) {
            return l.a(cls);
        }
        l.f505a.getClass();
        return new j(cls);
    }
}
