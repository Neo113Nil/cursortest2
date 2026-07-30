package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class kf implements xb0, Serializable {
    public transient xb0 d;
    protected final Object e;
    private final Class g;
    private final String h;
    private final String i;
    private final boolean j;

    public kf(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.g = cls;
        this.h = str;
        this.i = str2;
        this.j = z;
    }

    public abstract xb0 c();

    public final String e() {
        return this.h;
    }

    public final wg g() {
        Class cls = this.g;
        if (cls == null) {
            return null;
        }
        if (!this.j) {
            return a21.a(cls);
        }
        a21.a.getClass();
        return new hu0(cls);
    }

    public final String h() {
        return this.i;
    }

    public kf() {
        this(jf.d, null, null, null, false);
    }
}
