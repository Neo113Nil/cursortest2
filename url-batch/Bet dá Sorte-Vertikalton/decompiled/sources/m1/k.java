package m1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements Iterable, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3208a;

    public k(String[] strArr) {
        this.f3208a = strArr;
    }

    public final String a(String str) {
        b1.d.e(str, "name");
        String[] strArr = this.f3208a;
        int length = strArr.length - 2;
        int H2 = u1.l.H(length, 0, -2);
        if (H2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != H2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f3208a[i * 2];
    }

    public final g c() {
        g gVar = new g(1);
        ArrayList arrayList = (ArrayList) gVar.f3189a;
        b1.d.e(arrayList, "<this>");
        String[] strArr = this.f3208a;
        b1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        b1.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return gVar;
    }

    public final String d(int i) {
        return this.f3208a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (Arrays.equals(this.f3208a, ((k) obj).f3208a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3208a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        S0.b[] bVarArr = new S0.b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = new S0.b(b(i), d(i));
        }
        return new T0.a(bVarArr);
    }

    public final int size() {
        return this.f3208a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (n1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        b1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
