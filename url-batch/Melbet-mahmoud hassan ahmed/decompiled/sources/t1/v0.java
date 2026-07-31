package t1;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class v0<V> {

    /* renamed from: c, reason: collision with root package name */
    private final o2.h<V> f22256c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f22255b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f22254a = -1;

    public v0(o2.h<V> hVar) {
        this.f22256c = hVar;
    }

    public void a(int i7, V v6) {
        if (this.f22254a == -1) {
            o2.a.f(this.f22255b.size() == 0);
            this.f22254a = 0;
        }
        if (this.f22255b.size() > 0) {
            SparseArray<V> sparseArray = this.f22255b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            o2.a.a(i7 >= keyAt);
            if (keyAt == i7) {
                o2.h<V> hVar = this.f22256c;
                SparseArray<V> sparseArray2 = this.f22255b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f22255b.append(i7, v6);
    }

    public void b() {
        for (int i7 = 0; i7 < this.f22255b.size(); i7++) {
            this.f22256c.accept(this.f22255b.valueAt(i7));
        }
        this.f22254a = -1;
        this.f22255b.clear();
    }

    public void c(int i7) {
        for (int size = this.f22255b.size() - 1; size >= 0 && i7 < this.f22255b.keyAt(size); size--) {
            this.f22256c.accept(this.f22255b.valueAt(size));
            this.f22255b.removeAt(size);
        }
        this.f22254a = this.f22255b.size() > 0 ? Math.min(this.f22254a, this.f22255b.size() - 1) : -1;
    }

    public void d(int i7) {
        int i8 = 0;
        while (i8 < this.f22255b.size() - 1) {
            int i9 = i8 + 1;
            if (i7 < this.f22255b.keyAt(i9)) {
                return;
            }
            this.f22256c.accept(this.f22255b.valueAt(i8));
            this.f22255b.removeAt(i8);
            int i10 = this.f22254a;
            if (i10 > 0) {
                this.f22254a = i10 - 1;
            }
            i8 = i9;
        }
    }

    public V e(int i7) {
        if (this.f22254a == -1) {
            this.f22254a = 0;
        }
        while (true) {
            int i8 = this.f22254a;
            if (i8 <= 0 || i7 >= this.f22255b.keyAt(i8)) {
                break;
            }
            this.f22254a--;
        }
        while (this.f22254a < this.f22255b.size() - 1 && i7 >= this.f22255b.keyAt(this.f22254a + 1)) {
            this.f22254a++;
        }
        return this.f22255b.valueAt(this.f22254a);
    }

    public V f() {
        return this.f22255b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f22255b.size() == 0;
    }
}
