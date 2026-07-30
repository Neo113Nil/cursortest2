package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z implements Iterator, yb0 {
    public final /* synthetic */ int d;
    public final Iterator e;

    public z(jw0 jw0Var) {
        this.d = 3;
        pj1[] pj1VarArr = new pj1[8];
        for (int i = 0; i < 8; i++) {
            pj1VarArr[i] = new rj1(this);
        }
        this.e = new nw0(jw0Var, pj1VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e.hasNext();
            case 1:
                return this.e.hasNext();
            case 2:
                return this.e.hasNext();
            default:
                return ((nw0) this.e).g;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Map.Entry) this.e.next()).getKey();
            case 1:
                return ((Map.Entry) this.e.next()).getValue();
            case 2:
                return (nm1) this.e.next();
            default:
                return (Map.Entry) ((nw0) this.e).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((nw0) this.e).remove();
                return;
        }
    }

    public /* synthetic */ z(Iterator it, int i) {
        this.d = i;
        this.e = it;
    }

    public z(lm1 lm1Var) {
        this.d = 2;
        this.e = lm1Var.n.iterator();
    }
}
