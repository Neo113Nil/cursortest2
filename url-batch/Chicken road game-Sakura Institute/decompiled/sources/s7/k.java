package s7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements Iterable, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final String[] f8606f;

    public k(String[] strArr) {
        this.f8606f = strArr;
    }

    public final String a(String str) {
        r6.k.f(str, "name");
        String[] strArr = this.f8606f;
        int length = strArr.length - 2;
        int x8 = a.a.x(length, 0, -2);
        if (x8 > length) {
            return null;
        }
        while (!z6.o.p(true, str, strArr[length])) {
            if (length == x8) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return Arrays.equals(this.f8606f, ((k) obj).f8606f);
        }
        return false;
    }

    public final String g(int i7) {
        return this.f8606f[i7 * 2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8606f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        d6.j[] jVarArr = new d6.j[size];
        for (int i7 = 0; i7 < size; i7++) {
            jVarArr[i7] = new d6.j(g(i7), w(i7));
        }
        return r6.k.h(jVarArr);
    }

    public final f1.g m() {
        f1.g gVar = new f1.g(6);
        ArrayList arrayList = gVar.f3153f;
        r6.k.f(arrayList, "<this>");
        String[] strArr = this.f8606f;
        r6.k.f(strArr, "elements");
        arrayList.addAll(e6.k.T(strArr));
        return gVar;
    }

    public final int size() {
        return this.f8606f.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String g9 = g(i7);
            String w4 = w(i7);
            sb.append(g9);
            sb.append(": ");
            if (t7.b.o(g9)) {
                w4 = "██";
            }
            sb.append(w4);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String w(int i7) {
        return this.f8606f[(i7 * 2) + 1];
    }
}
