package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class het extends hfm {
    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract her a();

    @Override // defpackage.hfm
    public final boolean b() {
        return false;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hfm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // defpackage.heb
    public final boolean l() {
        return a().e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }

    @Override // defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return new hes(a());
    }
}
