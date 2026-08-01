package t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j implements Iterable, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public final String[] f3453f;

    public j(String[] strArr) {
        this.f3453f = strArr;
    }

    public final String a(String str) {
        i3.d.e(str, "name");
        String[] strArr = this.f3453f;
        int length = strArr.length - 2;
        int z4 = b4.d.z(length, 0, -2);
        if (z4 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == z4) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.f3453f[i * 2];
    }

    public final q3.a c() {
        q3.a aVar = new q3.a(5);
        ArrayList arrayList = (ArrayList) aVar.f3172a;
        i3.d.e(arrayList, "<this>");
        String[] strArr = this.f3453f;
        i3.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        i3.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return aVar;
    }

    public final String d(int i) {
        return this.f3453f[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return Arrays.equals(this.f3453f, ((j) obj).f3453f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3453f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        w2.a[] aVarArr = new w2.a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = new w2.a(b(i), d(i));
        }
        return new i3.a(aVarArr);
    }

    public final int size() {
        return this.f3453f.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (u3.b.n(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        i3.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
