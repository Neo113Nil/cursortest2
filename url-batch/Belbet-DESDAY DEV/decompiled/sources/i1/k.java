package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements Iterable, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f2445a;

    public k(String[] strArr) {
        this.f2445a = strArr;
    }

    public final String a(String str) {
        X0.d.e(str, "name");
        String[] strArr = this.f2445a;
        int length = strArr.length - 2;
        int N2 = q1.d.N(length, 0, -2);
        if (N2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != N2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f2445a[i * 2];
    }

    public final B0.d c() {
        B0.d dVar = new B0.d(27);
        ArrayList arrayList = (ArrayList) dVar.f59b;
        X0.d.e(arrayList, "<this>");
        String[] strArr = this.f2445a;
        X0.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        X0.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return dVar;
    }

    public final String d(int i) {
        return this.f2445a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (Arrays.equals(this.f2445a, ((k) obj).f2445a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2445a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        P0.b[] bVarArr = new P0.b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = new P0.b(b(i), d(i));
        }
        return new Q0.a(bVarArr);
    }

    public final int size() {
        return this.f2445a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (j1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        X0.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
