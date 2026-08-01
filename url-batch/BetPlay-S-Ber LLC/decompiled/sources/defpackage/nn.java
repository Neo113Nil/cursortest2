package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class nn implements Iterable, vp {
    public final String[] f;

    public nn(String[] strArr) {
        this.f = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.f;
        int length = strArr.length - 2;
        int t = l70.t(length, 0, -2);
        if (t > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == t) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.f[i * 2];
    }

    public final j1 c() {
        j1 j1Var = new j1(21);
        ArrayList arrayList = (ArrayList) j1Var.g;
        arrayList.getClass();
        String[] strArr = this.f;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return j1Var;
    }

    public final String d(int i) {
        return this.f[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nn) {
            return Arrays.equals(this.f, ((nn) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        cx[] cxVarArr = new cx[size];
        for (int i = 0; i < size; i++) {
            cxVarArr[i] = new cx(b(i), d(i));
        }
        return new h(cxVarArr);
    }

    public final int size() {
        return this.f.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = b(i);
            String d = d(i);
            sb.append(b);
            sb.append(": ");
            if (y70.n(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
