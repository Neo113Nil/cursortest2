package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements Iterable, f1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3355a;

    public k(String[] strArr) {
        this.f3355a = strArr;
    }

    public final String a(String str) {
        e1.d.e(str, "name");
        String[] strArr = this.f3355a;
        int length = strArr.length - 2;
        int J2 = x1.l.J(length, 0, -2);
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
        return this.f3355a[i * 2];
    }

    public final g c() {
        g gVar = new g(1);
        ArrayList arrayList = (ArrayList) gVar.f3336a;
        e1.d.e(arrayList, "<this>");
        String[] strArr = this.f3355a;
        e1.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        e1.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return gVar;
    }

    public final String d(int i) {
        return this.f3355a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (Arrays.equals(this.f3355a, ((k) obj).f3355a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3355a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        V0.c[] cVarArr = new V0.c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = new V0.c(b(i), d(i));
        }
        return new W0.a(cVarArr);
    }

    public final int size() {
        return this.f3355a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (q1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        e1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
