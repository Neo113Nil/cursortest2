package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class bt implements Iterable, pw {
    public final String[] f;

    public bt(String[] strArr) {
        this.f = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.f;
        int length = strArr.length - 2;
        int w = mv.w(length, 0, -2);
        if (w > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == w) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.f[i * 2];
    }

    public final o0 c() {
        o0 o0Var = new o0(27);
        ArrayList arrayList = (ArrayList) o0Var.g;
        arrayList.getClass();
        String[] strArr = this.f;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return o0Var;
    }

    public final String d(int i) {
        return this.f[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bt) {
            return Arrays.equals(this.f, ((bt) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        k50[] k50VarArr = new k50[size];
        for (int i = 0; i < size; i++) {
            k50VarArr[i] = new k50(b(i), d(i));
        }
        return new k(k50VarArr);
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
            if (zk0.n(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
