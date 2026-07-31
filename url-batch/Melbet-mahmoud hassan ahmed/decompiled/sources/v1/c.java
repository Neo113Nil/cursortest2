package v1;

import o2.r;
import t1.p0;
import v1.g;
import w0.e0;

/* loaded from: classes.dex */
public final class c implements g.b {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f22726a;

    /* renamed from: b, reason: collision with root package name */
    private final p0[] f22727b;

    public c(int[] iArr, p0[] p0VarArr) {
        this.f22726a = iArr;
        this.f22727b = p0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f22727b.length];
        int i7 = 0;
        while (true) {
            p0[] p0VarArr = this.f22727b;
            if (i7 >= p0VarArr.length) {
                return iArr;
            }
            iArr[i7] = p0VarArr[i7].G();
            i7++;
        }
    }

    public void b(long j7) {
        for (p0 p0Var : this.f22727b) {
            p0Var.a0(j7);
        }
    }

    @Override // v1.g.b
    public e0 d(int i7, int i8) {
        int i9 = 0;
        while (true) {
            int[] iArr = this.f22726a;
            if (i9 >= iArr.length) {
                r.c("BaseMediaChunkOutput", "Unmatched track of type: " + i8);
                return new w0.k();
            }
            if (i8 == iArr[i9]) {
                return this.f22727b[i9];
            }
            i9++;
        }
    }
}
