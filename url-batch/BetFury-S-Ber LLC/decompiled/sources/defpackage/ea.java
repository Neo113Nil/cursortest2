package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ea implements nw, Serializable {
    public transient nw f;
    public final Object g;
    public final Class h;
    public final String i;
    public final String j;
    public final boolean k;

    public ea(Object obj, Class cls, String str, String str2, boolean z) {
        this.g = obj;
        this.h = cls;
        this.i = str;
        this.j = str2;
        this.k = z;
    }

    public abstract nw c();

    public final cc d() {
        boolean z = this.k;
        Class cls = this.h;
        if (!z) {
            return b90.a(cls);
        }
        b90.a.getClass();
        return new h50(cls);
    }
}
