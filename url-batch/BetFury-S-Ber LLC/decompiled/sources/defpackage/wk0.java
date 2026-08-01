package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wk0 implements ww, Serializable {
    public ir f;
    public Object g;

    @Override // defpackage.ww
    public final Object getValue() {
        if (this.g == sl.o) {
            ir irVar = this.f;
            irVar.getClass();
            this.g = irVar.a();
            this.f = null;
        }
        return this.g;
    }

    public final String toString() {
        return this.g != sl.o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
