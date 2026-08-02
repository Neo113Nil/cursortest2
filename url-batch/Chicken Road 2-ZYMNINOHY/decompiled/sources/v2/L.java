package v2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class L extends C {
    @Override // v2.C
    public final C a(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public final M f() {
        int i4 = this.f15560b;
        if (i4 == 0) {
            int i5 = M.f15576c;
            return h0.f15638j;
        }
        if (i4 != 1) {
            M j4 = M.j(i4, this.f15559a);
            this.f15560b = j4.size();
            this.f15561c = true;
            return j4;
        }
        Object obj = this.f15559a[0];
        Objects.requireNonNull(obj);
        int i6 = M.f15576c;
        return new n0(obj);
    }
}
