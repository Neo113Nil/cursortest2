package G3;

import a.AbstractC0124a;
import java.util.ArrayList;
import s0.InterfaceC1405a;
import v2.G;
import v2.I;
import v2.a0;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class m implements InterfaceC1405a {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f936a;

    public m(int i4) {
        switch (i4) {
            case 2:
                this.f936a = new ArrayList();
                break;
            default:
                this.f936a = new ArrayList(20);
                break;
        }
    }

    @Override // s0.InterfaceC1405a
    public long a(long j4) {
        ArrayList arrayList = this.f936a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j4 < ((V0.a) arrayList.get(0)).f3183b) {
            return ((V0.a) arrayList.get(0)).f3183b;
        }
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            V0.a aVar = (V0.a) arrayList.get(i4);
            long j5 = aVar.f3183b;
            long j6 = aVar.f3183b;
            if (j4 < j5) {
                long j7 = ((V0.a) arrayList.get(i4 - 1)).f3185d;
                return (j7 == -9223372036854775807L || j7 <= j4 || j7 >= j6) ? j6 : j7;
            }
        }
        long j8 = ((V0.a) v2.r.j(arrayList)).f3185d;
        if (j8 == -9223372036854775807L || j4 >= j8) {
            return Long.MIN_VALUE;
        }
        return j8;
    }

    @Override // s0.InterfaceC1405a
    public I b(long j4) {
        int h2 = h(j4);
        if (h2 == 0) {
            G g4 = I.f15571b;
            return a0.f15605e;
        }
        V0.a aVar = (V0.a) this.f936a.get(h2 - 1);
        long j5 = aVar.f3185d;
        if (j5 == -9223372036854775807L || j4 < j5) {
            return aVar.f3182a;
        }
        G g5 = I.f15571b;
        return a0.f15605e;
    }

    @Override // s0.InterfaceC1405a
    public long c(long j4) {
        ArrayList arrayList = this.f936a;
        if (arrayList.isEmpty() || j4 < ((V0.a) arrayList.get(0)).f3183b) {
            return -9223372036854775807L;
        }
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            long j5 = ((V0.a) arrayList.get(i4)).f3183b;
            if (j4 == j5) {
                return j5;
            }
            if (j4 < j5) {
                V0.a aVar = (V0.a) arrayList.get(i4 - 1);
                long j6 = aVar.f3185d;
                return (j6 == -9223372036854775807L || j6 > j4) ? aVar.f3183b : j6;
            }
        }
        V0.a aVar2 = (V0.a) v2.r.j(arrayList);
        long j7 = aVar2.f3185d;
        return (j7 == -9223372036854775807L || j4 < j7) ? aVar2.f3183b : j7;
    }

    @Override // s0.InterfaceC1405a
    public void clear() {
        this.f936a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // s0.InterfaceC1405a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(V0.a aVar, long j4) {
        boolean z;
        int size;
        ArrayList arrayList = this.f936a;
        long j5 = aVar.f3183b;
        AbstractC0124a.h(j5 != -9223372036854775807L);
        if (j5 <= j4) {
            long j6 = aVar.f3185d;
            if (j6 == -9223372036854775807L || j4 < j6) {
                z = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j5 >= ((V0.a) arrayList.get(size)).f3183b) {
                        arrayList.add(size + 1, aVar);
                        return z;
                    }
                    if (((V0.a) arrayList.get(size)).f3183b <= j4) {
                        z = false;
                    }
                }
                arrayList.add(0, aVar);
                return z;
            }
        }
        z = false;
        while (size >= 0) {
        }
        arrayList.add(0, aVar);
        return z;
    }

    @Override // s0.InterfaceC1405a
    public void e(long j4) {
        ArrayList arrayList = this.f936a;
        int h2 = h(j4);
        if (h2 == 0) {
            return;
        }
        long j5 = ((V0.a) arrayList.get(h2 - 1)).f3185d;
        if (j5 == -9223372036854775807L || j5 >= j4) {
            h2--;
        }
        arrayList.subList(0, h2).clear();
    }

    public void f(String name, String value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        ArrayList arrayList = this.f936a;
        arrayList.add(name);
        arrayList.add(AbstractC1510g.r0(value).toString());
    }

    public n g() {
        Object[] array = this.f936a.toArray(new String[0]);
        if (array != null) {
            return new n((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public int h(long j4) {
        ArrayList arrayList = this.f936a;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (j4 < ((V0.a) arrayList.get(i4)).f3183b) {
                return i4;
            }
        }
        return arrayList.size();
    }

    public void i(String str) {
        ArrayList arrayList = this.f936a;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i4))) {
                arrayList.remove(i4);
                arrayList.remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
    }
}
