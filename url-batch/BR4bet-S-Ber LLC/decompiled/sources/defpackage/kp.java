package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kp implements Iterable, wr {
    public final String[] f;

    public kp(String[] strArr) {
        this.f = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.f;
        int length = strArr.length - 2;
        int t = xf.t(length, 0, -2);
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

    public final rc0 c() {
        rc0 rc0Var = new rc0(25);
        ArrayList arrayList = (ArrayList) rc0Var.g;
        arrayList.getClass();
        String[] strArr = this.f;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return rc0Var;
    }

    public final String d(int i) {
        return this.f[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kp) {
            return Arrays.equals(this.f, ((kp) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        tz[] tzVarArr = new tz[size];
        for (int i = 0; i < size; i++) {
            tzVarArr[i] = new tz(b(i), d(i));
        }
        return new j(tzVarArr);
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
            if (cb0.n(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
