package wd;

import java.io.Serializable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d implements ce.a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient ce.a f10144d;

    /* renamed from: e, reason: collision with root package name */
    protected final Object f10145e;

    /* renamed from: i, reason: collision with root package name */
    private final Class f10146i;

    /* renamed from: r, reason: collision with root package name */
    private final String f10147r;

    /* renamed from: s, reason: collision with root package name */
    private final String f10148s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f10149t;

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f10145e = obj;
        this.f10146i = cls;
        this.f10147r = str;
        this.f10148s = str2;
        this.f10149t = z10;
    }

    public abstract ce.a b();

    public final String d() {
        return this.f10147r;
    }

    public final f e() {
        Class cls = this.f10146i;
        if (cls == null) {
            return null;
        }
        if (!this.f10149t) {
            return c0.a(cls);
        }
        c0.f10143a.getClass();
        return new u(cls);
    }

    public final String f() {
        return this.f10148s;
    }

    public d() {
        this(c.f10142d, null, null, null, false);
    }
}
