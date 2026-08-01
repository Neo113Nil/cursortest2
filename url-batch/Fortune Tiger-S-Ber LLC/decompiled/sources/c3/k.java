package c3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k implements Iterable, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public final String[] f1068f;

    public k(String[] strArr) {
        this.f1068f = strArr;
    }

    public final String a(String str) {
        u2.c.e(str, "name");
        String[] strArr = this.f1068f;
        int length = strArr.length - 2;
        int j4 = l0.g.j(length, 0, -2);
        if (j4 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == j4) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i4) {
        return this.f1068f[i4 * 2];
    }

    public final a2.e c() {
        a2.e eVar = new a2.e(10);
        ArrayList arrayList = (ArrayList) eVar.g;
        u2.c.e(arrayList, "<this>");
        String[] strArr = this.f1068f;
        u2.c.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        u2.c.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return eVar;
    }

    public final String d(int i4) {
        return this.f1068f[(i4 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return Arrays.equals(this.f1068f, ((k) obj).f1068f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1068f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        m2.a[] aVarArr = new m2.a[size];
        for (int i4 = 0; i4 < size; i4++) {
            aVarArr[i4] = new m2.a(b(i4), d(i4));
        }
        return new a3.b(aVarArr);
    }

    public final int size() {
        return this.f1068f.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String b2 = b(i4);
            String d4 = d(i4);
            sb.append(b2);
            sb.append(": ");
            if (d3.c.n(b2)) {
                d4 = "██";
            }
            sb.append(d4);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        u2.c.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
