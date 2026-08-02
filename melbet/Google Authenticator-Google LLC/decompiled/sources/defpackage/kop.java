package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kop implements Serializable, koi {
    private kri a;
    private volatile Object b = kot.a;
    private final Object c = this;

    public kop(kri kriVar) {
        this.a = kriVar;
    }

    private final Object writeReplace() {
        return new kog(a());
    }

    @Override // defpackage.koi
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        kot kotVar = kot.a;
        if (obj2 != kotVar) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == kotVar) {
                kri kriVar = this.a;
                kriVar.getClass();
                obj = kriVar.a();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    @Override // defpackage.koi
    public final boolean b() {
        return this.b != kot.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
