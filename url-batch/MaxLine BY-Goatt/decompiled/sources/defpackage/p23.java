package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p23 implements y91, Serializable {
    public Function0 m;
    public Object n;

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new f21(getValue());
    }

    @Override // defpackage.y91
    public final boolean a() {
        return this.n != r13.a;
    }

    @Override // defpackage.y91
    public final Object getValue() {
        if (this.n == r13.a) {
            Function0 function0 = this.m;
            function0.getClass();
            this.n = function0.invoke();
            this.m = null;
        }
        return this.n;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
