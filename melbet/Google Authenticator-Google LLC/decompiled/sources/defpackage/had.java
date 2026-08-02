package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class had implements Serializable, hac {
    private static final long serialVersionUID = 0;
    final hac a;
    volatile transient boolean b;
    transient Object c;
    private transient hak d = new hak();

    public had(hac hacVar) {
        this.a = hacVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = new hak();
    }

    @Override // defpackage.hac
    public final Object bB() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    Object bB = this.a.bB();
                    this.c = bB;
                    this.b = true;
                    return bB;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return a.aa(obj, "Suppliers.memoize(", ")");
    }
}
