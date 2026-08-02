package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krc extends kpd implements RandomAccess, Serializable, List, krb {
    private final Enum[] a;

    public krc(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new krd(this.a);
    }

    @Override // defpackage.koz
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.koz, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        return ixc.J(this.a, r3.ordinal()) == r3;
    }

    @Override // defpackage.kpd, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.a;
        ixc.T(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.kpd, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        Enum[] enumArr = this.a;
        int ordinal = r3.ordinal();
        if (ixc.J(enumArr, ordinal) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.kpd, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
