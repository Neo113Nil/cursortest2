package D6;

import f6.InterfaceC0406a;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements Iterable, InterfaceC0406a {

    /* renamed from: e, reason: collision with root package name */
    public static final q f552e = new q(new String[0]);

    /* renamed from: d, reason: collision with root package name */
    public final String[] f553d;

    public q(String[] namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        this.f553d = namesAndValues;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] namesAndValues = this.f553d;
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = namesAndValues.length - 2;
        int a7 = Z5.c.a(length, 0, -2);
        if (a7 > length) {
            return null;
        }
        while (!name.equalsIgnoreCase(namesAndValues[length])) {
            if (length == a7) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final String b(int i2) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        String str = (String) kotlin.collections.p.m(this.f553d, i2 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i2 + ']');
    }

    public final C4.d c() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        C4.d dVar = new C4.d(2);
        kotlin.collections.w.i(dVar.f300a, this.f553d);
        return dVar;
    }

    public final String d(int i2) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        String str = (String) kotlin.collections.p.m(this.f553d, (i2 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i2 + ']');
    }

    public final boolean equals(Object obj) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (obj instanceof q) {
            return Arrays.equals(this.f553d, ((q) obj).f553d);
        }
        return false;
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return Arrays.hashCode(this.f553d);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        int size = size();
        Pair[] array = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            array[i2] = new Pair(b(i2), d(i2));
        }
        Intrinsics.checkNotNullParameter(array, "array");
        return new R5.u(array);
    }

    public final int size() {
        return this.f553d.length / 2;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String b7 = b(i2);
            String d7 = d(i2);
            sb.append(b7);
            sb.append(": ");
            if (E6.c.i(b7)) {
                d7 = "██";
            }
            sb.append(d7);
            sb.append("\n");
        }
        return sb.toString();
    }
}
