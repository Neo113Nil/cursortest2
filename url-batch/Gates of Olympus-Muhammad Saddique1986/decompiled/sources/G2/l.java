package G2;

import g2.InterfaceC0439a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class l implements Iterable, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2204d;

    public l(String[] strArr) {
        this.f2204d = strArr;
    }

    public final String b(String str) {
        f2.j.f(str, "name");
        String[] strArr = this.f2204d;
        int length = strArr.length - 2;
        int e02 = O2.l.e0(length, 0, -2);
        if (e02 <= length) {
            while (!AbstractC0737q.s(str, strArr[length], true)) {
                if (length != e02) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i3) {
        return this.f2204d[i3 * 2];
    }

    public final k d() {
        k kVar = new k(0);
        ArrayList arrayList = kVar.f2203d;
        f2.j.f(arrayList, "<this>");
        String[] strArr = this.f2204d;
        f2.j.f(strArr, "elements");
        arrayList.addAll(S1.k.h0(strArr));
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (Arrays.equals(this.f2204d, ((l) obj).f2204d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2204d);
    }

    public final String i(int i3) {
        return this.f2204d[(i3 * 2) + 1];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        R1.i[] iVarArr = new R1.i[size];
        for (int i3 = 0; i3 < size; i3++) {
            iVarArr[i3] = new R1.i(c(i3), i(i3));
        }
        return f2.j.h(iVarArr);
    }

    public final int size() {
        return this.f2204d.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            String c2 = c(i3);
            String i4 = i(i3);
            sb.append(c2);
            sb.append(": ");
            if (H2.b.p(c2)) {
                i4 = "██";
            }
            sb.append(i4);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
