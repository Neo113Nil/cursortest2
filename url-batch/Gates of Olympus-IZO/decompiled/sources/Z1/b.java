package Z1;

import f2.InterfaceC0386a;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC0386a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient InterfaceC0386a f3460d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3461e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f3462f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3463g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3464h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3465i;

    public b(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f3461e = obj;
        this.f3462f = cls;
        this.f3463g = str;
        this.f3464h = str2;
        this.f3465i = z3;
    }

    public abstract InterfaceC0386a a();

    public final c c() {
        Class cls = this.f3462f;
        if (!this.f3465i) {
            return u.a(cls);
        }
        u.f3481a.getClass();
        return new m(cls);
    }
}
