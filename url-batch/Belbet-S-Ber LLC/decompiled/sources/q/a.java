package q;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends AbstractSet {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3098f;

    public a(f fVar) {
        this.f3098f = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f3098f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3098f.h;
    }
}
