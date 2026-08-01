package n;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends AbstractSet {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2919f;

    public a(f fVar) {
        this.f2919f = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f2919f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2919f.h;
    }
}
