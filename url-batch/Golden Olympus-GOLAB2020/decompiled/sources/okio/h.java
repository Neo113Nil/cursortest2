package okio;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public class h implements Serializable, Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f43270e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final h f43271f = new h(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f43272b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f43273c;

    /* renamed from: d, reason: collision with root package name */
    private transient String f43274d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h f(a aVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = AbstractC3369b.c();
            }
            return aVar.e(bArr, i4, i5);
        }

        public final h a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] a4 = AbstractC3368a.a(str);
            if (a4 != null) {
                return new h(a4);
            }
            return null;
        }

        public final h b(String str) {
            int e4;
            int e5;
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i4 * 2;
                e4 = H2.b.e(str.charAt(i5));
                e5 = H2.b.e(str.charAt(i5 + 1));
                bArr[i4] = (byte) ((e4 << 4) + e5);
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new h(bytes);
        }

        public final h d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            h hVar = new h(E.a(str));
            hVar.s(str);
            return hVar;
        }

        public final h e(byte[] bArr, int i4, int i5) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int f4 = AbstractC3369b.f(bArr, i5);
            AbstractC3369b.b(bArr.length, i4, f4);
            return new h(AbstractC3219i.k(bArr, i4, f4 + i4));
        }

        private a() {
        }
    }

    public h(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f43272b = data;
    }

    public static final h f(String str) {
        return f43270e.d(str);
    }

    public String c() {
        return AbstractC3368a.c(h(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int v4 = v();
        int v5 = other.v();
        int min = Math.min(v4, v5);
        for (int i4 = 0; i4 < min; i4++) {
            int g4 = g(i4) & 255;
            int g5 = other.g(i4) & 255;
            if (g4 != g5) {
                return g4 < g5 ? -1 : 1;
            }
        }
        if (v4 == v5) {
            return 0;
        }
        return v4 < v5 ? -1 : 1;
    }

    public h e(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f43272b, 0, v());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new h(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.v() == h().length && hVar.q(0, h(), 0, h().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte g(int i4) {
        return n(i4);
    }

    public final byte[] h() {
        return this.f43272b;
    }

    public int hashCode() {
        int i4 = i();
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(h());
        r(hashCode);
        return hashCode;
    }

    public final int i() {
        return this.f43273c;
    }

    public int j() {
        return h().length;
    }

    public final String k() {
        return this.f43274d;
    }

    public String l() {
        char[] cArr = new char[h().length * 2];
        int i4 = 0;
        for (byte b4 : h()) {
            int i5 = i4 + 1;
            cArr[i4] = H2.b.f()[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i5] = H2.b.f()[b4 & 15];
        }
        return StringsKt.r(cArr);
    }

    public byte[] m() {
        return h();
    }

    public byte n(int i4) {
        return h()[i4];
    }

    public final h o() {
        return e("MD5");
    }

    public boolean p(int i4, h other, int i5, int i6) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.q(i5, h(), i4, i6);
    }

    public boolean q(int i4, byte[] other, int i5, int i6) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i4 >= 0 && i4 <= h().length - i6 && i5 >= 0 && i5 <= other.length - i6 && AbstractC3369b.a(h(), i4, other, i5, i6);
    }

    public final void r(int i4) {
        this.f43273c = i4;
    }

    public final void s(String str) {
        this.f43274d = str;
    }

    public final h t() {
        return e("SHA-1");
    }

    public String toString() {
        int c4;
        if (h().length == 0) {
            return "[size=0]";
        }
        c4 = H2.b.c(h(), 64);
        if (c4 != -1) {
            String y4 = y();
            String substring = y4.substring(0, c4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String G3 = StringsKt.G(StringsKt.G(StringsKt.G(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (c4 >= y4.length()) {
                return "[text=" + G3 + ']';
            }
            return "[size=" + h().length + " text=" + G3 + "…]";
        }
        if (h().length <= 64) {
            return "[hex=" + l() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(h().length);
        sb.append(" hex=");
        int e4 = AbstractC3369b.e(this, 64);
        if (e4 <= h().length) {
            if (e4 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb.append((e4 == h().length ? this : new h(AbstractC3219i.k(h(), 0, e4))).l());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + h().length + ')').toString());
    }

    public final h u() {
        return e("SHA-256");
    }

    public final int v() {
        return j();
    }

    public final boolean w(h prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return p(0, prefix, 0, prefix.v());
    }

    public h x() {
        for (int i4 = 0; i4 < h().length; i4++) {
            byte b4 = h()[i4];
            if (b4 >= 65 && b4 <= 90) {
                byte[] h4 = h();
                byte[] copyOf = Arrays.copyOf(h4, h4.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i4] = (byte) (b4 + 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b5 = copyOf[i5];
                    if (b5 >= 65 && b5 <= 90) {
                        copyOf[i5] = (byte) (b5 + 32);
                    }
                }
                return new h(copyOf);
            }
        }
        return this;
    }

    public String y() {
        String k4 = k();
        if (k4 != null) {
            return k4;
        }
        String b4 = E.b(m());
        s(b4);
        return b4;
    }

    public void z(C3372e buffer, int i4, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        H2.b.d(this, buffer, i4, i5);
    }
}
