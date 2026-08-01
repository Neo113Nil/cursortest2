package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x40 implements Serializable {
    public ml f;
    public volatile Object g = dh.l;
    public final Object h = this;

    public x40(ml mlVar) {
        this.f = mlVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.g;
        dh dhVar = dh.l;
        if (obj2 != dhVar) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.g;
            if (obj == dhVar) {
                ml mlVar = this.f;
                mlVar.getClass();
                obj = mlVar.a();
                this.g = obj;
                this.f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.g != dh.l ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
