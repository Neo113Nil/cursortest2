package Q0;

import W.AbstractC0108a;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
import y0.j;
import y0.x;
import y0.y;
import y0.z;

/* loaded from: classes.dex */
public final class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public final j f2135a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f2136b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2137c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2138d;

    public d(SparseArray sparseArray, long j4, int i4, long j5, long j6) {
        j jVar;
        int i5;
        this.f2136b = sparseArray;
        this.f2137c = j4;
        this.f2138d = i4;
        List list = (List) sparseArray.get(i4);
        if (list == null || list.isEmpty()) {
            jVar = null;
        } else {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                c cVar = (c) list.get(i7);
                jArr3[i7] = cVar.f2132a;
                jArr[i7] = cVar.f2133b;
            }
            while (true) {
                i5 = size - 1;
                if (i6 >= i5) {
                    break;
                }
                int i8 = i6 + 1;
                iArr[i6] = (int) (jArr[i8] - jArr[i6]);
                jArr2[i6] = jArr3[i8] - jArr3[i6];
                i6 = i8;
            }
            int i9 = i5;
            while (i9 > 0 && jArr3[i9] >= j4) {
                i9--;
            }
            iArr[i9] = (int) ((j5 + j6) - jArr[i9]);
            jArr2[i9] = j4 - jArr3[i9];
            if (i9 < i5) {
                AbstractC0108a.s("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i10 = i9 + 1;
                iArr = Arrays.copyOf(iArr, i10);
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                jArr3 = Arrays.copyOf(jArr3, i10);
            }
            jVar = new j(iArr, jArr, jArr2, jArr3);
        }
        this.f2135a = jVar;
    }

    @Override // y0.y
    public final boolean c() {
        List list = (List) this.f2136b.get(this.f2138d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // y0.y
    public final x e(long j4) {
        j jVar = this.f2135a;
        if (jVar != null) {
            return jVar.e(j4);
        }
        z zVar = z.f16224c;
        return new x(zVar, zVar);
    }

    @Override // y0.y
    public final long g() {
        return this.f2137c;
    }
}
