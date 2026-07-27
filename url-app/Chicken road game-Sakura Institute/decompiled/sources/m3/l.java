package m3;

import G.W0;
import M2.J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class l implements Iterable, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f8391d;

    public l(String[] strArr) {
        this.f8391d = strArr;
    }

    public final String e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f8391d;
        int length = strArr.length - 2;
        int a4 = G2.b.a(length, 0, -2);
        if (a4 <= length) {
            while (!kotlin.text.u.i(true, name, strArr[length])) {
                if (length != a4) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (Arrays.equals(this.f8391d, ((l) obj).f8391d)) {
                return true;
            }
        }
        return false;
    }

    public final String h(int i2) {
        return this.f8391d[i2 * 2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8391d);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            pairArr[i2] = new Pair(h(i2), w(i2));
        }
        return J.f(pairArr);
    }

    public final W0 s() {
        W0 w02 = new W0(4);
        ArrayList arrayList = w02.f2781d;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        String[] elements = this.f8391d;
        Intrinsics.checkNotNullParameter(elements, "elements");
        arrayList.addAll(C1436t.b(elements));
        return w02;
    }

    public final int size() {
        return this.f8391d.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String h4 = h(i2);
            String w4 = w(i2);
            sb.append(h4);
            sb.append(": ");
            if (n3.b.p(h4)) {
                w4 = "██";
            }
            sb.append(w4);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String w(int i2) {
        return this.f8391d[(i2 * 2) + 1];
    }
}
