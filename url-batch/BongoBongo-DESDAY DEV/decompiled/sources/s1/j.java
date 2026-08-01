package s1;

import L.X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m.C0202a0;

/* loaded from: classes.dex */
public final class j implements Iterable, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3640a;

    public j(String[] strArr) {
        this.f3640a = strArr;
    }

    public final String a(String str) {
        h1.d.e(str, "name");
        String[] strArr = this.f3640a;
        int length = strArr.length - 2;
        int J2 = A1.d.J(length, 0, -2);
        if (J2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != J2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f3640a[i * 2];
    }

    public final C0202a0 c() {
        C0202a0 c0202a0 = new C0202a0(2);
        ArrayList arrayList = (ArrayList) c0202a0.f3068a;
        h1.d.e(arrayList, "<this>");
        String[] strArr = this.f3640a;
        h1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        h1.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return c0202a0;
    }

    public final String d(int i) {
        return this.f3640a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Arrays.equals(this.f3640a, ((j) obj).f3640a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3640a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        V0.b[] bVarArr = new V0.b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = new V0.b(b(i), d(i));
        }
        return new X(bVarArr);
    }

    public final int size() {
        return this.f3640a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (t1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        h1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
