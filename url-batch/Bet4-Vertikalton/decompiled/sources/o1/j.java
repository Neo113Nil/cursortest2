package o1;

import K.X;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import l.Z;

/* loaded from: classes.dex */
public final class j implements Iterable, e1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3309a;

    public j(String[] strArr) {
        this.f3309a = strArr;
    }

    public final String a(String str) {
        d1.d.e(str, "name");
        String[] strArr = this.f3309a;
        int length = strArr.length - 2;
        int B2 = w1.l.B(length, 0, -2);
        if (B2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != B2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f3309a[i * 2];
    }

    public final Z c() {
        Z z2 = new Z(2);
        ArrayList arrayList = (ArrayList) z2.f2878a;
        d1.d.e(arrayList, "<this>");
        String[] strArr = this.f3309a;
        d1.d.e(strArr, "elements");
        arrayList.addAll(S0.f.b0(strArr));
        return z2;
    }

    public final String d(int i) {
        return this.f3309a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Arrays.equals(this.f3309a, ((j) obj).f3309a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3309a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        R0.c[] cVarArr = new R0.c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = new R0.c(b(i), d(i));
        }
        return new X(cVarArr);
    }

    public final int size() {
        return this.f3309a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (p1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        d1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
