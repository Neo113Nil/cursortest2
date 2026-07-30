package e6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 implements ListIterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2813f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2814g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2815h;

    public e0(f0 f0Var, int i7) {
        this.f2815h = f0Var;
        List list = f0Var.f2816f;
        if (i7 >= 0 && i7 <= f0Var.a()) {
            this.f2814g = list.listIterator(f0Var.a() - i7);
            return;
        }
        StringBuilder n8 = a0.m.n(i7, "Position index ", " must be in range [");
        n8.append(new w6.d(0, f0Var.a(), 1));
        n8.append("].");
        throw new IndexOutOfBoundsException(n8.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) this.f2814g).hasPrevious();
            default:
                return ((r6.t) this.f2814g).f7966f < ((q0.x) this.f2815h).f7469i - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) this.f2814g).hasNext();
            default:
                return ((r6.t) this.f2814g).f7966f >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) this.f2814g).previous();
            default:
                r6.t tVar = (r6.t) this.f2814g;
                int i7 = tVar.f7966f + 1;
                q0.x xVar = (q0.x) this.f2815h;
                q0.r.a(i7, xVar.f7469i);
                tVar.f7966f = i7;
                return xVar.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = (f0) this.f2815h;
                return m.W(f0Var) - ((ListIterator) this.f2814g).previousIndex();
            default:
                return ((r6.t) this.f2814g).f7966f + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) this.f2814g).next();
            default:
                r6.t tVar = (r6.t) this.f2814g;
                int i7 = tVar.f7966f;
                q0.x xVar = (q0.x) this.f2815h;
                q0.r.a(i7, xVar.f7469i);
                tVar.f7966f = i7 - 1;
                return xVar.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = (f0) this.f2815h;
                return m.W(f0Var) - ((ListIterator) this.f2814g).nextIndex();
            default:
                return ((r6.t) this.f2814g).f7966f;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2813f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public e0(r6.t tVar, q0.x xVar) {
        this.f2814g = tVar;
        this.f2815h = xVar;
    }
}
