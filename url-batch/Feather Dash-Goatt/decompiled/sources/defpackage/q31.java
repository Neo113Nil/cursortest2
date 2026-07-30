package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.ListIterator;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q31 implements ListIterator, yb0 {
    public final /* synthetic */ int d = 0;
    public final Object e;
    public final /* synthetic */ Object g;

    public q31(jk0 jk0Var, int i) {
        this.g = jk0Var;
        List list = (List) jk0Var.g;
        if (i >= 0 && i <= jk0Var.size()) {
            this.e = list.listIterator(jk0Var.size() - i);
            return;
        }
        StringBuilder n = qy0.n("Position index ", i, " must be in range [");
        n.append(new IntRange(0, jk0Var.size(), 1));
        n.append("].");
        throw new IndexOutOfBoundsException(n.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((x11) obj).d < ((af1) this.g).h - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).hasNext();
            default:
                return ((x11) obj).d >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).previous();
            default:
                x11 x11Var = (x11) obj;
                int i2 = x11Var.d + 1;
                af1 af1Var = (af1) this.g;
                yr1.A(i2, af1Var.h);
                x11Var.d = i2;
                return af1Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                jk0 jk0Var = (jk0) this.g;
                return (jk0Var.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((x11) obj).d + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).next();
            default:
                x11 x11Var = (x11) obj;
                int i2 = x11Var.d;
                af1 af1Var = (af1) this.g;
                yr1.A(i2, af1Var.h);
                x11Var.d = i2 - 1;
                return af1Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                jk0 jk0Var = (jk0) this.g;
                return (jk0Var.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((x11) obj).d;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public q31(x11 x11Var, af1 af1Var) {
        this.e = x11Var;
        this.g = af1Var;
    }
}
