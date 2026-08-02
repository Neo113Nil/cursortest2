package v2;

import a.AbstractC0124a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class N extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f15578a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15580c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f15581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15582e;

    public N() {
        this.f15578a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        AbstractC0124a.t(this.f15578a != 4);
        int b4 = M.j.b(this.f15578a);
        if (b4 == 0) {
            return true;
        }
        if (b4 != 2) {
            this.f15578a = 4;
            switch (this.f15580c) {
                case 0:
                    do {
                        Iterator it = this.f15581d;
                        if (!it.hasNext()) {
                            this.f15578a = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((u2.e) this.f15582e).apply(next));
                default:
                    do {
                        Iterator it2 = this.f15581d;
                        if (!it2.hasNext()) {
                            this.f15578a = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((j0) this.f15582e).f15649b.contains(next));
            }
            this.f15579b = next;
            if (this.f15578a != 3) {
                this.f15578a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15578a = 2;
        Object obj = this.f15579b;
        this.f15579b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(Iterator it, u2.e eVar) {
        this();
        this.f15580c = 0;
        this.f15581d = it;
        this.f15582e = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(j0 j0Var) {
        this();
        this.f15580c = 1;
        this.f15582e = j0Var;
        this.f15581d = j0Var.f15648a.iterator();
    }
}
