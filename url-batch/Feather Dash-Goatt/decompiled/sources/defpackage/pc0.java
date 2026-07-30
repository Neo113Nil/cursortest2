package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class pc0 implements a40, Serializable {
    private final int arity;

    public pc0(int i) {
        this.arity = i;
    }

    @Override // defpackage.a40
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        a21.a.getClass();
        return b21.a(this);
    }
}
