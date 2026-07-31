package P0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements T0.a, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public transient T0.a f791e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f792f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f793g;

    /* renamed from: h, reason: collision with root package name */
    public final String f794h;

    /* renamed from: i, reason: collision with root package name */
    public final String f795i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f796j;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f792f = obj;
        this.f793g = cls;
        this.f794h = str;
        this.f795i = str2;
        this.f796j = z2;
    }

    public abstract T0.a a();

    public final d b() {
        boolean z2 = this.f796j;
        Class cls = this.f793g;
        if (!z2) {
            return p.a(cls);
        }
        p.f808a.getClass();
        return new j(cls);
    }
}
