package T2;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class t implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f4057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f4058e;

    public t(s sVar) {
        this.f4058e = sVar;
        this.f4057d = ((Sequence) sVar.f4055b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4057d.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f4058e.f4056c.invoke(this.f4057d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
