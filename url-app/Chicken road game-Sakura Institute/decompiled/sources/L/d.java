package L;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final n[] f3462d;

    /* renamed from: e, reason: collision with root package name */
    public int f3463e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3464i = true;

    public d(m mVar, n[] nVarArr) {
        this.f3462d = nVarArr;
        nVarArr[0].b(mVar.f3487d, Integer.bitCount(mVar.f3484a) * 2, 0);
        this.f3463e = 0;
        b();
    }

    public final void b() {
        int i2 = this.f3463e;
        n[] nVarArr = this.f3462d;
        n nVar = nVarArr[i2];
        if (nVar.f3490i < nVar.f3489e) {
            return;
        }
        while (-1 < i2) {
            int c4 = c(i2);
            if (c4 == -1) {
                n nVar2 = nVarArr[i2];
                int i4 = nVar2.f3490i;
                Object[] objArr = nVar2.f3488d;
                if (i4 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f3490i = i4 + 1;
                    c4 = c(i2);
                }
            }
            if (c4 != -1) {
                this.f3463e = c4;
                return;
            }
            if (i2 > 0) {
                n nVar3 = nVarArr[i2 - 1];
                int i5 = nVar3.f3490i;
                int length2 = nVar3.f3488d.length;
                nVar3.f3490i = i5 + 1;
            }
            nVarArr[i2].b(m.f3483e.f3487d, 0, 0);
            i2--;
        }
        this.f3464i = false;
    }

    public final int c(int i2) {
        n[] nVarArr = this.f3462d;
        n nVar = nVarArr[i2];
        int i4 = nVar.f3490i;
        if (i4 < nVar.f3489e) {
            return i2;
        }
        Object[] objArr = nVar.f3488d;
        if (i4 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i4];
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i2 == 6) {
            n nVar2 = nVarArr[i2 + 1];
            Object[] objArr2 = mVar.f3487d;
            nVar2.b(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i2 + 1].b(mVar.f3487d, Integer.bitCount(mVar.f3484a) * 2, 0);
        }
        return c(i2 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3464i;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f3464i) {
            throw new NoSuchElementException();
        }
        Object next = this.f3462d[this.f3463e].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
