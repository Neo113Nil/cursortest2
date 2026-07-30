package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sq2 implements pq2, Serializable {
    private static final long serialVersionUID = 0;
    public final Object m;

    public sq2(Object obj) {
        this.m = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sq2)) {
            return false;
        }
        Object obj2 = ((sq2) obj).m;
        Object obj3 = this.m;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    @Override // defpackage.pq2
    public final Object get() {
        return this.m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
