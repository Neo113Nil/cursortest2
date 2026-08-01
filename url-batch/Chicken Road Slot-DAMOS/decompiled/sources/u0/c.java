package u0;

import java.util.Iterator;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final j[] f9579d;

    /* renamed from: e, reason: collision with root package name */
    public int f9580e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9581i = true;

    public c(i iVar, j[] jVarArr) {
        this.f9579d = jVarArr;
        jVarArr[0].a(iVar.f9594d, Integer.bitCount(iVar.f9591a) * 2, 0);
        this.f9580e = 0;
        a();
    }

    public final void a() {
        int i3 = this.f9580e;
        j[] jVarArr = this.f9579d;
        j jVar = jVarArr[i3];
        if (jVar.f9597i < jVar.f9596e) {
            return;
        }
        while (-1 < i3) {
            int b10 = b(i3);
            if (b10 == -1) {
                j jVar2 = jVarArr[i3];
                int i10 = jVar2.f9597i;
                Object[] objArr = jVar2.f9595d;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    jVar2.f9597i = i10 + 1;
                    b10 = b(i3);
                }
            }
            if (b10 != -1) {
                this.f9580e = b10;
                return;
            }
            if (i3 > 0) {
                j jVar3 = jVarArr[i3 - 1];
                int i11 = jVar3.f9597i;
                int length2 = jVar3.f9595d.length;
                jVar3.f9597i = i11 + 1;
            }
            jVarArr[i3].a(i.f9590e.f9594d, 0, 0);
            i3--;
        }
        this.f9581i = false;
    }

    public final int b(int i3) {
        j[] jVarArr = this.f9579d;
        j jVar = jVarArr[i3];
        int i10 = jVar.f9597i;
        if (i10 < jVar.f9596e) {
            return i3;
        }
        Object[] objArr = jVar.f9595d;
        if (i10 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        obj.getClass();
        i iVar = (i) obj;
        if (i3 == 6) {
            j jVar2 = jVarArr[i3 + 1];
            Object[] objArr2 = iVar.f9594d;
            jVar2.a(objArr2, objArr2.length, 0);
        } else {
            jVarArr[i3 + 1].a(iVar.f9594d, Integer.bitCount(iVar.f9591a) * 2, 0);
        }
        return b(i3 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9581i;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f9581i) {
            i0.c();
            return null;
        }
        Object next = this.f9579d[this.f9580e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
