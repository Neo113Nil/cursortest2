package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ym implements Iterable, kp {
    public final String[] f;

    public ym(String[] strArr) {
        this.f = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.f;
        int length = strArr.length - 2;
        int y = jw.y(length, 0, -2);
        if (y > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == y) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.f[i * 2];
    }

    public final k0 c() {
        k0 k0Var = new k0(25);
        ArrayList arrayList = (ArrayList) k0Var.g;
        arrayList.getClass();
        String[] strArr = this.f;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return k0Var;
    }

    public final String d(int i) {
        return this.f[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ym) {
            return Arrays.equals(this.f, ((ym) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        pw[] pwVarArr = new pw[size];
        for (int i = 0; i < size; i++) {
            pwVarArr[i] = new pw(b(i), d(i));
        }
        return new h(pwVarArr);
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
            if (r70.n(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
