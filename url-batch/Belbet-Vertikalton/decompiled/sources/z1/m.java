package z1;

import a.AbstractC0058a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import n.C0288n;

/* loaded from: classes.dex */
public final class m implements Iterable, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f4867a;

    public m(String[] strArr) {
        this.f4867a = strArr;
    }

    public final String a(String str) {
        j1.h.e(str, "name");
        String[] strArr = this.f4867a;
        int length = strArr.length - 2;
        int D2 = AbstractC0058a.D(length, 0, -2);
        if (D2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != D2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f4867a[i * 2];
    }

    public final C0288n c() {
        C0288n c0288n = new C0288n(8);
        ArrayList arrayList = (ArrayList) c0288n.f3677b;
        j1.h.e(arrayList, "<this>");
        String[] strArr = this.f4867a;
        j1.h.e(strArr, "elements");
        arrayList.addAll(X0.j.l0(strArr));
        return c0288n;
    }

    public final String d(int i) {
        return this.f4867a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (Arrays.equals(this.f4867a, ((m) obj).f4867a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4867a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        W0.d[] dVarArr = new W0.d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = new W0.d(b(i), d(i));
        }
        return new X0.b(dVarArr);
    }

    public final int size() {
        return this.f4867a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d2 = d(i);
            sb.append(b2);
            sb.append(": ");
            if (A1.c.o(b2)) {
                d2 = "██";
            }
            sb.append(d2);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        j1.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
