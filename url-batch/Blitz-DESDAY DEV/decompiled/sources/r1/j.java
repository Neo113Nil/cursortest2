package r1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l.C0176a0;

/* loaded from: classes.dex */
public final class j implements Iterable, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3488a;

    public j(String[] strArr) {
        this.f3488a = strArr;
    }

    public final String a(String str) {
        g1.d.e(str, "name");
        String[] strArr = this.f3488a;
        int length = strArr.length - 2;
        int O2 = z1.l.O(length, 0, -2);
        if (O2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != O2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f3488a[i * 2];
    }

    public final C0176a0 c() {
        C0176a0 c0176a0 = new C0176a0(2);
        ArrayList arrayList = (ArrayList) c0176a0.f2962a;
        g1.d.e(arrayList, "<this>");
        String[] strArr = this.f3488a;
        g1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        g1.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return c0176a0;
    }

    public final String d(int i) {
        return this.f3488a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Arrays.equals(this.f3488a, ((j) obj).f3488a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3488a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        W0.c[] cVarArr = new W0.c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = new W0.c(b(i), d(i));
        }
        return new X0.b(cVarArr);
    }

    public final int size() {
        return this.f3488a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (s1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        g1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
