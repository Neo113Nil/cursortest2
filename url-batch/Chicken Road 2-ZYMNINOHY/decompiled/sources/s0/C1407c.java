package s0;

import a.AbstractC0124a;
import io.appmetrica.analytics.impl.Zo;
import java.util.ArrayList;
import v2.C1452A;
import v2.C1470q;
import v2.F;
import v2.G;
import v2.I;
import v2.Y;
import v2.a0;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1407c implements InterfaceC1405a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1452A f15207b = new C1452A(new C1470q(new Zo(11), Y.f15597b), new C1470q(new Zo(12), Y.f15598c));

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15208a = new ArrayList();

    @Override // s0.InterfaceC1405a
    public final long a(long j4) {
        int i4 = 0;
        long j5 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f15208a;
            if (i4 >= arrayList.size()) {
                break;
            }
            long j6 = ((V0.a) arrayList.get(i4)).f3183b;
            long j7 = ((V0.a) arrayList.get(i4)).f3185d;
            if (j4 < j6) {
                j5 = j5 == -9223372036854775807L ? j6 : Math.min(j5, j6);
            } else {
                if (j4 < j7) {
                    j5 = j5 == -9223372036854775807L ? j7 : Math.min(j5, j7);
                }
                i4++;
            }
        }
        if (j5 != -9223372036854775807L) {
            return j5;
        }
        return Long.MIN_VALUE;
    }

    @Override // s0.InterfaceC1405a
    public final I b(long j4) {
        ArrayList arrayList = this.f15208a;
        if (!arrayList.isEmpty()) {
            if (j4 >= ((V0.a) arrayList.get(0)).f3183b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    V0.a aVar = (V0.a) arrayList.get(i4);
                    if (j4 >= aVar.f3183b && j4 < aVar.f3185d) {
                        arrayList2.add(aVar);
                    }
                    if (j4 < aVar.f3183b) {
                        break;
                    }
                }
                a0 q4 = I.q(f15207b, arrayList2);
                F j5 = I.j();
                for (int i5 = 0; i5 < q4.f15607d; i5++) {
                    j5.c(((V0.a) q4.get(i5)).f3182a);
                }
                return j5.f();
            }
        }
        G g4 = I.f15571b;
        return a0.f15605e;
    }

    @Override // s0.InterfaceC1405a
    public final long c(long j4) {
        ArrayList arrayList = this.f15208a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j4 < ((V0.a) arrayList.get(0)).f3183b) {
            return -9223372036854775807L;
        }
        long j5 = ((V0.a) arrayList.get(0)).f3183b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            long j6 = ((V0.a) arrayList.get(i4)).f3183b;
            long j7 = ((V0.a) arrayList.get(i4)).f3185d;
            if (j7 > j4) {
                if (j6 > j4) {
                    break;
                }
                j5 = Math.max(j5, j6);
            } else {
                j5 = Math.max(j5, j7);
            }
        }
        return j5;
    }

    @Override // s0.InterfaceC1405a
    public final void clear() {
        this.f15208a.clear();
    }

    @Override // s0.InterfaceC1405a
    public final boolean d(V0.a aVar, long j4) {
        long j5 = aVar.f3183b;
        AbstractC0124a.h(j5 != -9223372036854775807L);
        AbstractC0124a.h(aVar.f3184c != -9223372036854775807L);
        boolean z = j5 <= j4 && j4 < aVar.f3185d;
        ArrayList arrayList = this.f15208a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j5 >= ((V0.a) arrayList.get(size)).f3183b) {
                arrayList.add(size + 1, aVar);
                return z;
            }
        }
        arrayList.add(0, aVar);
        return z;
    }

    @Override // s0.InterfaceC1405a
    public final void e(long j4) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f15208a;
            if (i4 >= arrayList.size()) {
                return;
            }
            long j5 = ((V0.a) arrayList.get(i4)).f3183b;
            if (j4 > j5 && j4 > ((V0.a) arrayList.get(i4)).f3185d) {
                arrayList.remove(i4);
                i4--;
            } else if (j4 < j5) {
                return;
            }
            i4++;
        }
    }
}
