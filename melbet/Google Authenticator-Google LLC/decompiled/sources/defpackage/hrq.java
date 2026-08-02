package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hrq extends hdm {
    private final Set a;

    public hrq(Set set) {
        this.a = set;
    }

    @Override // defpackage.hdm, defpackage.hdc
    protected final /* synthetic */ Collection a() {
        return this.a;
    }

    @Override // defpackage.hdm
    protected final Set b() {
        return this.a;
    }

    @Override // defpackage.hdc, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hdc, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return hnu.L(this.a.iterator(), new gxw(3));
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
