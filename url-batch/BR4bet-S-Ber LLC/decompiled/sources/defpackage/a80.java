package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class a80 implements Serializable {
    public rn f;
    public volatile Object g = ej.p;
    public final Object h = this;

    public a80(rn rnVar) {
        this.f = rnVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.g;
        ej ejVar = ej.p;
        if (obj2 != ejVar) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.g;
            if (obj == ejVar) {
                rn rnVar = this.f;
                rnVar.getClass();
                obj = rnVar.a();
                this.g = obj;
                this.f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.g != ej.p ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
