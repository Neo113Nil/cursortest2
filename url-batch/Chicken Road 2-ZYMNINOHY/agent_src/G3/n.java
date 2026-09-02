package G3;

import c3.C0292d;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Arrays;
import java.util.Iterator;
import p3.InterfaceC1349a;

/* loaded from: classes.dex */
public final class n implements Iterable, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f937a;

    public n(String[] strArr) {
        this.f937a = strArr;
    }

    public final String b(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        String[] strArr = this.f937a;
        int length = strArr.length - 2;
        int q4 = V3.b.q(length, 0, -2);
        if (q4 > length) {
            return null;
        }
        while (true) {
            int i4 = length - 2;
            if (name.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
            if (length == q4) {
                return null;
            }
            length = i4;
        }
    }

    public final String c(int i4) {
        return this.f937a[i4 * 2];
    }

    public final m d() {
        m mVar = new m(0);
        d3.o.a0(mVar.f936a, this.f937a);
        return mVar;
    }

    public final String e(int i4) {
        return this.f937a[(i4 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return Arrays.equals(this.f937a, ((n) obj).f937a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f937a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C0292d[] c0292dArr = new C0292d[size];
        for (int i4 = 0; i4 < size; i4++) {
            c0292dArr[i4] = new C0292d(c(i4), e(i4));
        }
        return new d3.a(c0292dArr);
    }

    public final int size() {
        return this.f937a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            String c4 = c(i4);
            String e4 = e(i4);
            sb.append(c4);
            sb.append(": ");
            if (H3.b.o(c4)) {
                e4 = "██";
            }
            sb.append(e4);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            i4 = i5;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
