package V0;

import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v2.C1470q;
import v2.G;
import v2.I;
import v2.Y;
import v2.a0;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final C1470q f3186c = new C1470q(new D0.d(16), Y.f15597b);

    /* renamed from: a, reason: collision with root package name */
    public final I f3187a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3188b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(a0 a0Var) {
        long j4;
        int i4 = a0Var.f15607d;
        long j5 = -9223372036854775807L;
        int i5 = 0;
        if (i4 == 1) {
            G listIterator = a0Var.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i5 < 4 && listIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(listIterator.next());
                    i5++;
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            a aVar = (a) next;
            long j6 = aVar.f3183b;
            I i6 = aVar.f3182a;
            long j7 = aVar.f3184c;
            long j8 = j6 == -9223372036854775807L ? 0L : j6;
            if (j7 == -9223372036854775807L) {
                this.f3187a = I.o(i6);
                this.f3188b = new long[]{j8};
                return;
            } else {
                G g4 = I.f15571b;
                this.f3187a = I.p(i6, a0.f15605e);
                this.f3188b = new long[]{j8, j7 + j8};
                return;
            }
        }
        long[] jArr = new long[i4 * 2];
        this.f3188b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        a0 q4 = I.q(f3186c, a0Var);
        int i7 = 0;
        while (i5 < q4.f15607d) {
            a aVar2 = (a) q4.get(i5);
            long j9 = aVar2.f3183b;
            long j10 = aVar2.f3184c;
            I i8 = aVar2.f3182a;
            j9 = j9 == j5 ? 0L : j9;
            long j11 = j9 + j10;
            if (i7 != 0) {
                int i9 = i7 - 1;
                long j12 = this.f3188b[i9];
                if (j12 >= j9) {
                    if (j12 == j9 && ((I) arrayList.get(i9)).isEmpty()) {
                        arrayList.set(i9, i8);
                        j4 = j5;
                    } else {
                        j4 = j5;
                        AbstractC0108a.s("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.f3188b[i9] = j9;
                        arrayList.set(i9, i8);
                    }
                    if (j10 == j4) {
                        this.f3188b[i7] = j11;
                        arrayList.add(a0.f15605e);
                        i7++;
                    }
                    i5++;
                    j5 = j4;
                }
            }
            j4 = j5;
            this.f3188b[i7] = j9;
            arrayList.add(i8);
            i7++;
            if (j10 == j4) {
            }
            i5++;
            j5 = j4;
        }
        this.f3187a = I.k(arrayList);
    }

    @Override // V0.d
    public final int b(long j4) {
        int b4 = J.b(this.f3188b, j4, false);
        if (b4 < this.f3187a.size()) {
            return b4;
        }
        return -1;
    }

    @Override // V0.d
    public final long c(int i4) {
        AbstractC0124a.h(i4 < this.f3187a.size());
        return this.f3188b[i4];
    }

    @Override // V0.d
    public final List e(long j4) {
        int f4 = J.f(this.f3188b, j4, false);
        if (f4 != -1) {
            return (I) this.f3187a.get(f4);
        }
        G g4 = I.f15571b;
        return a0.f15605e;
    }

    @Override // V0.d
    public final int f() {
        return this.f3187a.size();
    }
}
