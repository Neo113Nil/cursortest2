package A2;

import a2.InterfaceC0184a;
import h2.AbstractC0454p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements Iterable, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f119d;

    public o(String[] strArr) {
        this.f119d = strArr;
    }

    public final String b(String str) {
        Z1.i.f(str, "name");
        String[] strArr = this.f119d;
        int length = strArr.length - 2;
        int D = I2.l.D(length, 0, -2);
        if (D <= length) {
            while (!AbstractC0454p.d0(str, strArr[length], true)) {
                if (length != D) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i3) {
        return this.f119d[i3 * 2];
    }

    public final n d() {
        n nVar = new n(0);
        ArrayList arrayList = nVar.f118a;
        Z1.i.f(arrayList, "<this>");
        String[] strArr = this.f119d;
        Z1.i.f(strArr, "elements");
        arrayList.addAll(M1.k.T(strArr));
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (Arrays.equals(this.f119d, ((o) obj).f119d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f119d);
    }

    public final String i(int i3) {
        return this.f119d[(i3 * 2) + 1];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        L1.j[] jVarArr = new L1.j[size];
        for (int i3 = 0; i3 < size; i3++) {
            jVarArr[i3] = new L1.j(c(i3), i(i3));
        }
        return Z1.i.h(jVarArr);
    }

    public final int size() {
        return this.f119d.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            String c3 = c(i3);
            String i4 = i(i3);
            sb.append(c3);
            sb.append(": ");
            if (B2.c.p(c3)) {
                i4 = "██";
            }
            sb.append(i4);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
