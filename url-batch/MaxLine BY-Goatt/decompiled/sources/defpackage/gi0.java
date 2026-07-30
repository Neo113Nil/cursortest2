package defpackage;

import defpackage.h0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gi0 extends h0 implements fi0, Serializable {
    public final Enum[] n;

    public gi0(Enum[] enumArr) {
        enumArr.getClass();
        this.n = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new hi0(this.n);
    }

    @Override // defpackage.b0
    public final int a() {
        return this.n.length;
    }

    @Override // defpackage.b0, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) oi.t(r3.ordinal(), this.n)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h0.a aVar = h0.m;
        Enum[] enumArr = this.n;
        int length = enumArr.length;
        aVar.getClass();
        h0.a.a(i, length);
        return enumArr[i];
    }

    @Override // defpackage.h0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) oi.t(ordinal, this.n)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.h0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) oi.t(ordinal, this.n)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
