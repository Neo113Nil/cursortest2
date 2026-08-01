package k1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements Iterable, a1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f2823a;

    public l(String[] strArr) {
        this.f2823a = strArr;
    }

    public final String a(String str) {
        Z0.d.e(str, "name");
        String[] strArr = this.f2823a;
        int length = strArr.length - 2;
        int C2 = s1.l.C(length, 0, -2);
        if (C2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != C2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f2823a[i * 2];
    }

    public final C.g c() {
        C.g gVar = new C.g(28);
        ArrayList arrayList = (ArrayList) gVar.f64b;
        Z0.d.e(arrayList, "<this>");
        String[] strArr = this.f2823a;
        Z0.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        Z0.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return gVar;
    }

    public final String d(int i) {
        return this.f2823a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (Arrays.equals(this.f2823a, ((l) obj).f2823a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2823a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Q0.c[] cVarArr = new Q0.c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = new Q0.c(b(i), d(i));
        }
        return new R0.a(cVarArr);
    }

    public final int size() {
        return this.f2823a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (l1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Z0.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
