package k1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class a implements p1.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient p1.a f3233a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3234b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f3235c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3236e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3237f;

    public a(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f3234b = obj;
        this.f3235c = cls;
        this.d = str;
        this.f3236e = str2;
        this.f3237f = z2;
    }

    public final b a() {
        Class cls = this.f3235c;
        if (!this.f3237f) {
            return i.a(cls);
        }
        i.f3246a.getClass();
        return new g(cls);
    }
}
