package q;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends AbstractSet {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3014f;

    public a(f fVar) {
        this.f3014f = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f3014f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3014f.f3036h;
    }
}
