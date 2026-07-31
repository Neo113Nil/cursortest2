package f2;

import java.io.Serializable;
import l2.InterfaceC0600a;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC0600a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient InterfaceC0600a f5812d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5813e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f5814f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5815g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5816h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5817i;

    public b(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f5813e = obj;
        this.f5814f = cls;
        this.f5815g = str;
        this.f5816h = str2;
        this.f5817i = z3;
    }

    public abstract InterfaceC0600a a();

    public final c c() {
        Class cls = this.f5814f;
        if (!this.f5817i) {
            return v.a(cls);
        }
        v.f5833a.getClass();
        return new n(cls);
    }
}
