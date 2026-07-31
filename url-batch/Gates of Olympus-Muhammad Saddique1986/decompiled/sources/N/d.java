package N;

import g2.InterfaceC0439a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final n[] f3505d;

    /* renamed from: e, reason: collision with root package name */
    public int f3506e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3507f = true;

    public d(m mVar, n[] nVarArr) {
        this.f3505d = nVarArr;
        nVarArr[0].a(mVar.f3525d, Integer.bitCount(mVar.f3522a) * 2, 0);
        this.f3506e = 0;
        a();
    }

    public final void a() {
        int i3 = this.f3506e;
        n[] nVarArr = this.f3505d;
        n nVar = nVarArr[i3];
        if (nVar.f3528f < nVar.f3527e) {
            return;
        }
        while (-1 < i3) {
            int b3 = b(i3);
            if (b3 == -1) {
                n nVar2 = nVarArr[i3];
                int i4 = nVar2.f3528f;
                Object[] objArr = nVar2.f3526d;
                if (i4 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f3528f = i4 + 1;
                    b3 = b(i3);
                }
            }
            if (b3 != -1) {
                this.f3506e = b3;
                return;
            }
            if (i3 > 0) {
                n nVar3 = nVarArr[i3 - 1];
                int i5 = nVar3.f3528f;
                int length2 = nVar3.f3526d.length;
                nVar3.f3528f = i5 + 1;
            }
            nVarArr[i3].a(m.f3521e.f3525d, 0, 0);
            i3--;
        }
        this.f3507f = false;
    }

    public final int b(int i3) {
        n[] nVarArr = this.f3505d;
        n nVar = nVarArr[i3];
        int i4 = nVar.f3528f;
        if (i4 < nVar.f3527e) {
            return i3;
        }
        Object[] objArr = nVar.f3526d;
        if (i4 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i4];
        f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i3 == 6) {
            n nVar2 = nVarArr[i3 + 1];
            Object[] objArr2 = mVar.f3525d;
            nVar2.a(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i3 + 1].a(mVar.f3525d, Integer.bitCount(mVar.f3522a) * 2, 0);
        }
        return b(i3 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3507f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f3507f) {
            throw new NoSuchElementException();
        }
        Object next = this.f3505d[this.f3506e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
