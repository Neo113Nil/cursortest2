package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hff extends hfx {
    private static final long serialVersionUID = 0;
    final /* synthetic */ hfh a;

    public hff(hfh hfhVar) {
        this.a = hfhVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.hfx
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof hid) {
            hid hidVar = (hid) obj;
            if (hidVar.a() > 0 && this.a.b(hidVar.a) == hidVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hfm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.heb
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.i().size();
    }

    @Override // defpackage.hfx, defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return new hfg(this.a);
    }
}
