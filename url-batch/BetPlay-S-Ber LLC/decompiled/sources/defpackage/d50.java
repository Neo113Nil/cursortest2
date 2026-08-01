package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d50 implements bq, Serializable {
    public vl f;
    public volatile Object g = vg.l;
    public final Object h = this;

    public d50(vl vlVar) {
        this.f = vlVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.g;
        vg vgVar = vg.l;
        if (obj2 != vgVar) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.g;
            if (obj == vgVar) {
                vl vlVar = this.f;
                vlVar.getClass();
                obj = vlVar.a();
                this.g = obj;
                this.f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.g != vg.l ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
