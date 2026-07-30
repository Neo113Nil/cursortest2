package l0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final l[] f5749f;

    /* renamed from: g, reason: collision with root package name */
    public int f5750g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5751h = true;

    public d(k kVar, l[] lVarArr) {
        this.f5749f = lVarArr;
        lVarArr[0].a(kVar.f5765d, Integer.bitCount(kVar.f5762a) * 2, 0);
        this.f5750g = 0;
        a();
    }

    public final void a() {
        int i7 = this.f5750g;
        l[] lVarArr = this.f5749f;
        l lVar = lVarArr[i7];
        if (lVar.f5768h < lVar.f5767g) {
            return;
        }
        while (-1 < i7) {
            int b9 = b(i7);
            if (b9 == -1) {
                l lVar2 = lVarArr[i7];
                int i8 = lVar2.f5768h;
                Object[] objArr = lVar2.f5766f;
                if (i8 < objArr.length) {
                    int length = objArr.length;
                    lVar2.f5768h = i8 + 1;
                    b9 = b(i7);
                }
            }
            if (b9 != -1) {
                this.f5750g = b9;
                return;
            }
            if (i7 > 0) {
                l lVar3 = lVarArr[i7 - 1];
                int i9 = lVar3.f5768h;
                int length2 = lVar3.f5766f.length;
                lVar3.f5768h = i9 + 1;
            }
            lVarArr[i7].a(k.f5761e.f5765d, 0, 0);
            i7--;
        }
        this.f5751h = false;
    }

    public final int b(int i7) {
        l[] lVarArr = this.f5749f;
        l lVar = lVarArr[i7];
        int i8 = lVar.f5768h;
        if (i8 < lVar.f5767g) {
            return i7;
        }
        Object[] objArr = lVar.f5766f;
        if (i8 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i8];
        r6.k.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        k kVar = (k) obj;
        if (i7 == 6) {
            l lVar2 = lVarArr[i7 + 1];
            Object[] objArr2 = kVar.f5765d;
            lVar2.a(objArr2, objArr2.length, 0);
        } else {
            lVarArr[i7 + 1].a(kVar.f5765d, Integer.bitCount(kVar.f5762a) * 2, 0);
        }
        return b(i7 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5751h;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f5751h) {
            throw new NoSuchElementException();
        }
        Object next = this.f5749f[this.f5750g].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
