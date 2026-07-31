package q6;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c implements w6.a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient w6.a f6188d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6189e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f6190f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6191g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6192h;
    public final boolean i;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f6189e = obj;
        this.f6190f = cls;
        this.f6191g = str;
        this.f6192h = str2;
        this.i = z3;
    }

    public abstract w6.a a();

    public final d e() {
        boolean z3 = this.i;
        Class cls = this.f6190f;
        if (!z3) {
            return t.a(cls);
        }
        t.f6206a.getClass();
        return new l(cls);
    }
}
