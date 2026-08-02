package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hed extends hep {
    private final transient EnumMap b;

    public hed(EnumMap enumMap) {
        this.b = enumMap;
        hoq.x(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.hep
    public final hjr a() {
        return new hhi(this.b.entrySet().iterator());
    }

    @Override // defpackage.her
    public final hjr bL() {
        return hnu.J(this.b.keySet().iterator());
    }

    @Override // defpackage.her, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.her
    public final boolean e() {
        return false;
    }

    @Override // defpackage.her, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hed) {
            obj = ((hed) obj).b;
        }
        return this.b.equals(obj);
    }

    @Override // defpackage.her, java.util.Map
    public final Object get(Object obj) {
        return this.b.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.hep, defpackage.her
    public Object writeReplace() {
        return new hec(this.b);
    }
}
