package X5;

import a1.AbstractC0223a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k5.C0477g;
import l5.AbstractC0505i;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class n implements Iterable, InterfaceC0766a {

    /* renamed from: g, reason: collision with root package name */
    public static final n f2972g = new n(new String[0]);

    /* renamed from: f, reason: collision with root package name */
    public final String[] f2973f;

    public n(String[] namesAndValues) {
        kotlin.jvm.internal.i.e(namesAndValues, "namesAndValues");
        this.f2973f = namesAndValues;
    }

    public final String a(String str) {
        String[] namesAndValues = this.f2973f;
        kotlin.jvm.internal.i.e(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int x6 = AbstractC0223a.x(length, 0, -2);
        if (x6 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(namesAndValues[length])) {
            if (length == x6) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final String b(int i7) {
        String str = (String) AbstractC0505i.L(this.f2973f, i7 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i7 + ']');
    }

    public final Q4.j c() {
        Q4.j jVar = new Q4.j(2);
        ArrayList arrayList = jVar.f2027a;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        String[] elements = this.f2973f;
        kotlin.jvm.internal.i.e(elements, "elements");
        arrayList.addAll(AbstractC0505i.E(elements));
        return jVar;
    }

    public final String d(int i7) {
        String str = (String) AbstractC0505i.L(this.f2973f, (i7 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i7 + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return Arrays.equals(this.f2973f, ((n) obj).f2973f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2973f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C0477g[] c0477gArr = new C0477g[size];
        for (int i7 = 0; i7 < size; i7++) {
            c0477gArr[i7] = new C0477g(b(i7), d(i7));
        }
        return new R5.g(c0477gArr);
    }

    public final int size() {
        return this.f2973f.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String b7 = b(i7);
            String d7 = d(i7);
            sb.append(b7);
            sb.append(": ");
            if (Y5.c.i(b7)) {
                d7 = "██";
            }
            sb.append(d7);
            sb.append("\n");
        }
        return sb.toString();
    }
}
