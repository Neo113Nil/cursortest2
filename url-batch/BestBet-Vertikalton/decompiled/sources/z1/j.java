package z1;

import K.V;
import c1.AbstractC0091d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k.C0191o;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class j implements Iterable, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f4685a;

    public j(String[] strArr) {
        this.f4685a = strArr;
    }

    public final String a(String str) {
        k1.e.e(str, "name");
        String[] strArr = this.f4685a;
        int length = strArr.length - 2;
        int k2 = AbstractC0091d.k(length, 0, -2);
        if (k2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != k2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f4685a[i * 2];
    }

    public final C0191o c() {
        C0191o c0191o = new C0191o(7);
        ArrayList arrayList = (ArrayList) c0191o.f3187a;
        k1.e.e(arrayList, "<this>");
        String[] strArr = this.f4685a;
        k1.e.e(strArr, "elements");
        arrayList.addAll(Y0.i.i0(strArr));
        return c0191o;
    }

    public final String d(int i) {
        return this.f4685a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Arrays.equals(this.f4685a, ((j) obj).f4685a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4685a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        X0.c[] cVarArr = new X0.c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = new X0.c(b(i), d(i));
        }
        return new V(cVarArr);
    }

    public final int size() {
        return this.f4685a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (A1.c.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        k1.e.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
