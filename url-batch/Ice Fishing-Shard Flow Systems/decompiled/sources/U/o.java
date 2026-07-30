package U;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f2682a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f2683b;

    /* renamed from: c, reason: collision with root package name */
    public r f2684c;

    /* renamed from: d, reason: collision with root package name */
    public r f2685d;

    /* renamed from: e, reason: collision with root package name */
    public int f2686e;

    /* renamed from: f, reason: collision with root package name */
    public int f2687f;

    public o(r rVar) {
        this.f2683b = rVar;
        this.f2684c = rVar;
    }

    public final int a(int i2) {
        SparseArray sparseArray = this.f2684c.f2700a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(i2);
        int i5 = 1;
        int i7 = 2;
        if (this.f2682a == 2) {
            if (rVar != null) {
                this.f2684c = rVar;
                this.f2687f++;
            } else if (i2 == 65038) {
                b();
            } else if (i2 != 65039) {
                r rVar2 = this.f2684c;
                if (rVar2.f2701b != null) {
                    i7 = 3;
                    if (this.f2687f != 1) {
                        this.f2685d = rVar2;
                        b();
                    } else if (c()) {
                        this.f2685d = this.f2684c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i5 = i7;
        } else if (rVar == null) {
            b();
        } else {
            this.f2682a = 2;
            this.f2684c = rVar;
            this.f2687f = 1;
            i5 = i7;
        }
        this.f2686e = i2;
        return i5;
    }

    public final void b() {
        this.f2682a = 1;
        this.f2684c = this.f2683b;
        this.f2687f = 0;
    }

    public final boolean c() {
        V.a b7 = this.f2684c.f2701b.b();
        int a7 = b7.a(6);
        return !(a7 == 0 || ((ByteBuffer) b7.f1145l).get(a7 + b7.f1142d) == 0) || this.f2686e == 65039;
    }
}
