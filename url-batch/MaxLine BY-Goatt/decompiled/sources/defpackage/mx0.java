package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mx0 implements Iterable, k71 {
    public final String[] m;

    public mx0(String[] strArr) {
        this.m = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.m;
        int length = strArr.length - 2;
        int G = l41.G(length, 0, -2);
        if (G > length) {
            return null;
        }
        while (!tp2.i(str, strArr[length], true)) {
            if (length == G) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.m[i * 2];
    }

    public final lx0 c() {
        lx0 lx0Var = new lx0(0);
        ArrayList arrayList = lx0Var.m;
        arrayList.getClass();
        String[] strArr = this.m;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return lx0Var;
    }

    public final String d(int i) {
        return this.m[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mx0) {
            return Arrays.equals(this.m, ((mx0) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.m);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(b(i), d(i));
        }
        return new i0(pairArr);
    }

    public final int size() {
        return this.m.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = b(i);
            String d = d(i);
            sb.append(b);
            sb.append(": ");
            if (n33.n(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
