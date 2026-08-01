package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s6 extends AbstractSet {
    public final /* synthetic */ x6 f;

    public s6(x6 x6Var) {
        this.f = x6Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new v6(this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.h;
    }
}
