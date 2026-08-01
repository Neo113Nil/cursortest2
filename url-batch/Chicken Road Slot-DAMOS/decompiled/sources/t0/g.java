package t0;

import java.util.ConcurrentModificationException;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: i, reason: collision with root package name */
    public final e f9214i;

    /* renamed from: r, reason: collision with root package name */
    public int f9215r;

    /* renamed from: s, reason: collision with root package name */
    public i f9216s;

    /* renamed from: t, reason: collision with root package name */
    public int f9217t;

    public g(e eVar, int i3) {
        super(i3, eVar.f9211v);
        this.f9214i = eVar;
        this.f9215r = eVar.g();
        this.f9217t = -1;
        b();
    }

    public final void a() {
        if (this.f9215r != this.f9214i.g()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // t0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i3 = this.f9196d;
        e eVar = this.f9214i;
        eVar.add(i3, obj);
        this.f9196d++;
        this.f9197e = eVar.b();
        this.f9215r = eVar.g();
        this.f9217t = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        e eVar = this.f9214i;
        Object[] objArr = eVar.f9209t;
        if (objArr == null) {
            this.f9216s = null;
            return;
        }
        int i3 = (eVar.f9211v - 1) & (-32);
        int i10 = this.f9196d;
        if (i10 > i3) {
            i10 = i3;
        }
        int i11 = (eVar.f9207r / 5) + 1;
        i iVar = this.f9216s;
        if (iVar == null) {
            this.f9216s = new i(objArr, i10, i3, i11);
            return;
        }
        iVar.f9196d = i10;
        iVar.f9197e = i3;
        iVar.f9220i = i11;
        if (iVar.f9221r.length < i11) {
            iVar.f9221r = new Object[i11];
        }
        iVar.f9221r[0] = objArr;
        ?? r62 = i10 == i3 ? 1 : 0;
        iVar.f9222s = r62;
        iVar.b(i10 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            i0.c();
            return null;
        }
        int i3 = this.f9196d;
        this.f9217t = i3;
        i iVar = this.f9216s;
        e eVar = this.f9214i;
        if (iVar == null) {
            Object[] objArr = eVar.f9210u;
            this.f9196d = i3 + 1;
            return objArr[i3];
        }
        if (iVar.hasNext()) {
            this.f9196d++;
            return iVar.next();
        }
        Object[] objArr2 = eVar.f9210u;
        int i10 = this.f9196d;
        this.f9196d = i10 + 1;
        return objArr2[i10 - iVar.f9197e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            i0.c();
            return null;
        }
        int i3 = this.f9196d;
        this.f9217t = i3 - 1;
        i iVar = this.f9216s;
        e eVar = this.f9214i;
        if (iVar == null) {
            Object[] objArr = eVar.f9210u;
            int i10 = i3 - 1;
            this.f9196d = i10;
            return objArr[i10];
        }
        int i11 = iVar.f9197e;
        if (i3 <= i11) {
            this.f9196d = i3 - 1;
            return iVar.previous();
        }
        Object[] objArr2 = eVar.f9210u;
        int i12 = i3 - 1;
        this.f9196d = i12;
        return objArr2[i12 - i11];
    }

    @Override // t0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i3 = this.f9217t;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f9214i;
        eVar.c(i3);
        int i10 = this.f9217t;
        if (i10 < this.f9196d) {
            this.f9196d = i10;
        }
        this.f9197e = eVar.b();
        this.f9215r = eVar.g();
        this.f9217t = -1;
        b();
    }

    @Override // t0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i3 = this.f9217t;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f9214i;
        eVar.set(i3, obj);
        this.f9215r = eVar.g();
        b();
    }
}
