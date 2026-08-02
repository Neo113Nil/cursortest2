package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahi {
    public final kpi a;
    public final kpi b;
    public ahe c;
    public int d;
    public ahh e;
    public final lao f = lak.a(ahj.a);
    private final lai g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final qt k;
    private final qt l;
    private final qt m;
    private final lao n;

    public ahi() {
        lao a = lak.a(new ahf(null));
        this.n = a;
        this.g = new lag(a);
        this.a = new kpi();
        this.b = new kpi();
        int i = qu.a;
        this.k = new qt(6);
        this.l = new qt(6);
        this.m = new qt(6);
    }

    public final ahe a(int i) {
        Object obj;
        Object obj2;
        kpi kpiVar = this.a;
        Object obj3 = null;
        if (i != -1) {
            Iterator<E> it = kpiVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((ahe) obj2).e) {
                    break;
                }
            }
            ahe aheVar = (ahe) obj2;
            if (aheVar != null) {
                return aheVar;
            }
            Iterator<E> it2 = this.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((ahe) next).e) {
                    obj3 = next;
                    break;
                }
            }
            return (ahe) obj3;
        }
        Iterator<E> it3 = kpiVar.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (((ahe) obj).e) {
                break;
            }
        }
        ahe aheVar2 = (ahe) obj;
        if (aheVar2 != null) {
            return aheVar2;
        }
        Iterator<E> it4 = this.b.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            if (((ahe) next2).e) {
                obj3 = next2;
                break;
            }
        }
        return (ahe) obj3;
    }

    public final void b() {
        boolean z;
        boolean z2;
        ahf ahfVar;
        kpi kpiVar = this.a;
        boolean z3 = true;
        if (!kpiVar.isEmpty()) {
            Iterator<E> it = kpiVar.iterator();
            while (it.hasNext()) {
                if (((ahe) it.next()).e) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        kpi kpiVar2 = this.b;
        if (!kpiVar2.isEmpty()) {
            Iterator<E> it2 = kpiVar2.iterator();
            while (it2.hasNext()) {
                if (((ahe) it2.next()).e) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z && !z2) {
            z3 = false;
        }
        boolean z4 = this.i;
        boolean z5 = this.h;
        boolean z6 = this.j;
        if (z4 != z) {
            qt qtVar = this.m;
            Object[] objArr = qtVar.b;
            long[] jArr = qtVar.c;
            int i = qtVar.e;
            while (i != Integer.MAX_VALUE) {
                long j = (jArr[i] >> 31) & 2147483647L;
                ((ahh) objArr[i]).a(z);
                i = (int) j;
            }
        }
        if (z5 != z2) {
            qt qtVar2 = this.l;
            Object[] objArr2 = qtVar2.b;
            long[] jArr2 = qtVar2.c;
            int i2 = qtVar2.e;
            while (i2 != Integer.MAX_VALUE) {
                long j2 = (jArr2[i2] >> 31) & 2147483647L;
                ((ahh) objArr2[i2]).a(z2);
                i2 = (int) j2;
            }
        }
        if (z6 != z3) {
            qt qtVar3 = this.k;
            Object[] objArr3 = qtVar3.b;
            long[] jArr3 = qtVar3.c;
            int i3 = qtVar3.e;
            while (i3 != Integer.MAX_VALUE) {
                long j3 = (jArr3[i3] >> 31) & 2147483647L;
                ((ahh) objArr3[i3]).a(z3);
                i3 = (int) j3;
            }
        }
        this.i = z;
        this.h = z2;
        this.j = z3;
        ahe aheVar = this.c;
        if (aheVar == null) {
            aheVar = a(0);
        }
        ahe aheVar2 = this.c;
        if (aheVar2 == null) {
            aheVar2 = a(0);
        }
        if (ksp.b(aheVar2, aheVar)) {
            if (aheVar2 == null) {
                ahfVar = new ahf(null);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = kpiVar.iterator();
                while (it3.hasNext()) {
                    ahe aheVar3 = (ahe) it3.next();
                    if (aheVar3.e) {
                        List list = aheVar3.c;
                    }
                }
                Iterator it4 = kpiVar2.iterator();
                while (it4.hasNext()) {
                    ahe aheVar4 = (ahe) it4.next();
                    if (aheVar4.e) {
                        List list2 = aheVar4.c;
                    }
                }
                ahfVar = new ahf(aheVar2.b, arrayList, aheVar2.d, arrayList.size());
            }
            lao laoVar = this.n;
            if (ksp.b((ahf) laoVar.b(), ahfVar)) {
                return;
            }
            laoVar.d(ahfVar);
            qt qtVar4 = this.m;
            Object[] objArr4 = qtVar4.b;
            long[] jArr4 = qtVar4.c;
            int i4 = qtVar4.e;
            while (i4 != Integer.MAX_VALUE) {
                long j4 = (jArr4[i4] >> 31) & 2147483647L;
                i4 = (int) j4;
            }
            qt qtVar5 = this.l;
            Object[] objArr5 = qtVar5.b;
            long[] jArr5 = qtVar5.c;
            int i5 = qtVar5.e;
            while (i5 != Integer.MAX_VALUE) {
                long j5 = (jArr5[i5] >> 31) & 2147483647L;
                i5 = (int) j5;
            }
            qt qtVar6 = this.k;
            Object[] objArr6 = qtVar6.b;
            long[] jArr6 = qtVar6.c;
            int i6 = qtVar6.e;
            while (i6 != Integer.MAX_VALUE) {
                long j6 = (jArr6[i6] >> 31) & 2147483647L;
                i6 = (int) j6;
            }
        }
    }

    public final void c(cfz cfzVar, ahh ahhVar, int i) {
        qt qtVar = i != 0 ? i != 1 ? this.k : this.l : this.m;
        int a = qtVar.a(ahhVar);
        qtVar.b[a] = ahhVar;
        long[] jArr = qtVar.c;
        int i2 = qtVar.d;
        jArr[a] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & a) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        qtVar.d = a;
        if (qtVar.e == Integer.MAX_VALUE) {
            qtVar.e = a;
        }
        cfz cfzVar2 = ahhVar.d;
        if (cfzVar2 != null) {
            throw new IllegalArgumentException(a.ac(cfzVar2, ahhVar, "Input '", "' is already added to dispatcher ", "."));
        }
        ahhVar.d = cfzVar;
        ((ahf) ((lag) this.g).a.b()).getClass();
        ahhVar.a(i != 0 ? i != 1 ? this.j : this.h : this.i);
    }
}
