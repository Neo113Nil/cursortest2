package g1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class a implements l1.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient l1.a f2559a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2560b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f2561c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2562e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2563f;

    public a(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f2560b = obj;
        this.f2561c = cls;
        this.d = str;
        this.f2562e = str2;
        this.f2563f = z2;
    }

    public final b a() {
        Class cls = this.f2561c;
        if (!this.f2563f) {
            return j.a(cls);
        }
        j.f2571a.getClass();
        return new h(cls);
    }
}
