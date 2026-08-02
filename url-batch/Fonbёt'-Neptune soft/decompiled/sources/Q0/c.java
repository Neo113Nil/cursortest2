package Q0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements V0.a, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public transient V0.a f965e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f966f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f967g;

    /* renamed from: h, reason: collision with root package name */
    public final String f968h;

    /* renamed from: i, reason: collision with root package name */
    public final String f969i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f970j;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f966f = obj;
        this.f967g = cls;
        this.f968h = str;
        this.f969i = str2;
        this.f970j = z2;
    }

    public abstract V0.a a();

    public final d b() {
        Class cls = this.f967g;
        if (!this.f970j) {
            return p.a(cls);
        }
        p.f984a.getClass();
        return new j(cls);
    }
}
