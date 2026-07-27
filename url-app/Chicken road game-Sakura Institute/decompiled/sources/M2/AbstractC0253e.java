package M2;

import java.io.Serializable;

/* renamed from: M2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0253e implements S2.a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient S2.a f3590d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3591e;

    /* renamed from: i, reason: collision with root package name */
    public final Class f3592i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3593j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3594k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3595l;

    public AbstractC0253e() {
        this(C0252d.f3589d, null, null, null, false);
    }

    public abstract S2.a a();

    public final InterfaceC0255g b() {
        Class cls = this.f3592i;
        if (cls == null) {
            return null;
        }
        if (!this.f3595l) {
            return F.a(cls);
        }
        F.f3581a.getClass();
        return new v(cls);
    }

    public AbstractC0253e(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f3591e = obj;
        this.f3592i = cls;
        this.f3593j = str;
        this.f3594k = str2;
        this.f3595l = z4;
    }
}
