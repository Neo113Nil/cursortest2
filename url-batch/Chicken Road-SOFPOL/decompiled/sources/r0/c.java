package r0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final k[] f6476d;

    /* renamed from: e, reason: collision with root package name */
    public int f6477e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6478f = true;

    public c(j jVar, k[] kVarArr) {
        this.f6476d = kVarArr;
        kVarArr[0].a(jVar.f6492d, Integer.bitCount(jVar.f6489a) * 2, 0);
        this.f6477e = 0;
        a();
    }

    public final void a() {
        int i = this.f6477e;
        k[] kVarArr = this.f6476d;
        k kVar = kVarArr[i];
        if (kVar.f6495f < kVar.f6494e) {
            return;
        }
        while (-1 < i) {
            int b8 = b(i);
            if (b8 == -1) {
                k kVar2 = kVarArr[i];
                int i8 = kVar2.f6495f;
                Object[] objArr = kVar2.f6493d;
                if (i8 < objArr.length) {
                    int length = objArr.length;
                    kVar2.f6495f = i8 + 1;
                    b8 = b(i);
                }
            }
            if (b8 != -1) {
                this.f6477e = b8;
                return;
            }
            if (i > 0) {
                k kVar3 = kVarArr[i - 1];
                int i9 = kVar3.f6495f;
                int length2 = kVar3.f6493d.length;
                kVar3.f6495f = i9 + 1;
            }
            kVarArr[i].a(j.f6488e.f6492d, 0, 0);
            i--;
        }
        this.f6478f = false;
    }

    public final int b(int i) {
        k[] kVarArr = this.f6476d;
        k kVar = kVarArr[i];
        int i8 = kVar.f6495f;
        if (i8 < kVar.f6494e) {
            return i;
        }
        Object[] objArr = kVar.f6493d;
        if (i8 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i8];
        q6.i.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        j jVar = (j) obj;
        if (i == 6) {
            k kVar2 = kVarArr[i + 1];
            Object[] objArr2 = jVar.f6492d;
            kVar2.a(objArr2, objArr2.length, 0);
        } else {
            kVarArr[i + 1].a(jVar.f6492d, Integer.bitCount(jVar.f6489a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6478f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f6478f) {
            throw new NoSuchElementException();
        }
        Object next = this.f6476d[this.f6477e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
