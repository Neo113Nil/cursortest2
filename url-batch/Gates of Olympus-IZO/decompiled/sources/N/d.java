package N;

import a2.InterfaceC0184a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final n[] f2823d;

    /* renamed from: e, reason: collision with root package name */
    public int f2824e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2825f = true;

    public d(m mVar, n[] nVarArr) {
        this.f2823d = nVarArr;
        nVarArr[0].a(mVar.f2843d, Integer.bitCount(mVar.f2840a) * 2, 0);
        this.f2824e = 0;
        a();
    }

    public final void a() {
        int i3 = this.f2824e;
        n[] nVarArr = this.f2823d;
        n nVar = nVarArr[i3];
        if (nVar.f2846f < nVar.f2845e) {
            return;
        }
        while (-1 < i3) {
            int b2 = b(i3);
            if (b2 == -1) {
                n nVar2 = nVarArr[i3];
                int i4 = nVar2.f2846f;
                Object[] objArr = nVar2.f2844d;
                if (i4 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f2846f = i4 + 1;
                    b2 = b(i3);
                }
            }
            if (b2 != -1) {
                this.f2824e = b2;
                return;
            }
            if (i3 > 0) {
                n nVar3 = nVarArr[i3 - 1];
                int i5 = nVar3.f2846f;
                int length2 = nVar3.f2844d.length;
                nVar3.f2846f = i5 + 1;
            }
            nVarArr[i3].a(m.f2839e.f2843d, 0, 0);
            i3--;
        }
        this.f2825f = false;
    }

    public final int b(int i3) {
        n[] nVarArr = this.f2823d;
        n nVar = nVarArr[i3];
        int i4 = nVar.f2846f;
        if (i4 < nVar.f2845e) {
            return i3;
        }
        Object[] objArr = nVar.f2844d;
        if (i4 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i4];
        Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i3 == 6) {
            n nVar2 = nVarArr[i3 + 1];
            Object[] objArr2 = mVar.f2843d;
            nVar2.a(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i3 + 1].a(mVar.f2843d, Integer.bitCount(mVar.f2840a) * 2, 0);
        }
        return b(i3 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2825f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f2825f) {
            throw new NoSuchElementException();
        }
        Object next = this.f2823d[this.f2824e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
