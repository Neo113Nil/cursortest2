package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hhp extends hdc {
    private final Collection a;

    public hhp(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.hdc
    protected final Collection a() {
        return this.a;
    }

    @Override // defpackage.hdc, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hdc, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new hhi(this.a.iterator());
    }

    @Override // defpackage.hdc, java.util.Collection
    public final Object[] toArray() {
        return d();
    }

    @Override // defpackage.hdc, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hnu.r(this, objArr);
    }
}
