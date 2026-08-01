package m1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l.C0207a0;

/* loaded from: classes.dex */
public final class j implements Iterable, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3175a;

    public j(String[] strArr) {
        this.f3175a = strArr;
    }

    public final String a(String str) {
        b1.d.e(str, "name");
        String[] strArr = this.f3175a;
        int length = strArr.length - 2;
        int A2 = u1.l.A(length, 0, -2);
        if (A2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != A2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f3175a[i * 2];
    }

    public final C0207a0 c() {
        C0207a0 c0207a0 = new C0207a0(2);
        ArrayList arrayList = (ArrayList) c0207a0.f2889a;
        b1.d.e(arrayList, "<this>");
        String[] strArr = this.f3175a;
        b1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        b1.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return c0207a0;
    }

    public final String d(int i) {
        return this.f3175a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Arrays.equals(this.f3175a, ((j) obj).f3175a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3175a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        S0.c[] cVarArr = new S0.c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = new S0.c(b(i), d(i));
        }
        return new T0.a(cVarArr);
    }

    public final int size() {
        return this.f3175a.length / 2;
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
