package r6;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b implements x6.a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public transient x6.a f7948f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7949g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f7950h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7951i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7952j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7953k;

    public b(Object obj, Class cls, String str, String str2, boolean z8) {
        this.f7949g = obj;
        this.f7950h = cls;
        this.f7951i = str;
        this.f7952j = str2;
        this.f7953k = z8;
    }

    public abstract x6.a g();

    public final c h() {
        boolean z8 = this.f7953k;
        Class cls = this.f7950h;
        if (!z8) {
            return w.a(cls);
        }
        w.f7969a.getClass();
        return new o(cls);
    }
}
