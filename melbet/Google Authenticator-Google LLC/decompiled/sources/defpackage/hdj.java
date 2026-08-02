package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hdj extends hdk implements hhu {
    protected hdj() {
    }

    protected abstract hhu b();

    @Override // defpackage.hhu
    public final int d() {
        throw null;
    }

    @Override // defpackage.hhu
    public final boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    @Override // defpackage.hdk
    protected /* bridge */ /* synthetic */ Object f() {
        throw null;
    }

    @Override // defpackage.hhu
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // defpackage.hhu
    public void k() {
        throw null;
    }

    @Override // defpackage.hhu
    public final boolean m(Object obj) {
        throw null;
    }

    @Override // defpackage.hhu
    public boolean n(Object obj, Object obj2) {
        return b().n(obj, obj2);
    }

    @Override // defpackage.hhu
    public Collection o() {
        return b().o();
    }

    @Override // defpackage.hhu
    public Map p() {
        return b().p();
    }

    @Override // defpackage.hhu
    public Set q() {
        return b().q();
    }

    @Override // defpackage.hhu
    public final boolean r(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.hhu
    public boolean s(Object obj, Object obj2) {
        throw null;
    }
}
