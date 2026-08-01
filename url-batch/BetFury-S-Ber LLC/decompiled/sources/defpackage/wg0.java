package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wg0 implements ww, Serializable {
    public ir f;
    public volatile Object g = sl.o;
    public final Object h = this;

    public wg0(ir irVar) {
        this.f = irVar;
    }

    @Override // defpackage.ww
    public final Object getValue() {
        Object obj;
        Object obj2 = this.g;
        sl slVar = sl.o;
        if (obj2 != slVar) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.g;
            if (obj == slVar) {
                ir irVar = this.f;
                irVar.getClass();
                obj = irVar.a();
                this.g = obj;
                this.f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.g != sl.o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
