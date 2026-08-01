package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements Iterable, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f2703a;

    public n(String[] strArr) {
        this.f2703a = strArr;
    }

    public final String a(String str) {
        X0.f.e(str, "name");
        String[] strArr = this.f2703a;
        int length = strArr.length - 2;
        int F = q1.l.F(length, 0, -2);
        if (F <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != F) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f2703a[i * 2];
    }

    public final B0.d c() {
        B0.d dVar = new B0.d(26);
        ArrayList arrayList = (ArrayList) dVar.f67b;
        X0.f.e(arrayList, "<this>");
        String[] strArr = this.f2703a;
        X0.f.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        X0.f.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return dVar;
    }

    public final String d(int i) {
        return this.f2703a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            if (Arrays.equals(this.f2703a, ((n) obj).f2703a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2703a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        N0.c[] cVarArr = new N0.c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = new N0.c(b(i), d(i));
        }
        return new O0.a(cVarArr);
    }

    public final int size() {
        return this.f2703a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d2 = d(i);
            sb.append(b2);
            sb.append(": ");
            if (j1.b.o(b2)) {
                d2 = "██";
            }
            sb.append(d2);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        X0.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
