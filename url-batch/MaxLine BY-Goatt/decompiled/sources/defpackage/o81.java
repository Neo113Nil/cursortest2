package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class o81 implements fu0, Serializable {
    private final int arity;

    public o81(int i) {
        this.arity = i;
    }

    @Override // defpackage.fu0
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        d82.a.getClass();
        return f82.a(this);
    }
}
