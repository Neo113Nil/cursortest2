package okhttp3.internal.publicsuffix;

import A.AbstractC0017m;
import H1.f;
import J2.q;
import M2.E;
import T2.c;
import T2.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.l;
import kotlin.text.y;
import u3.n;
import z2.C1403G;
import z2.C1405I;
import z2.C1437u;
import z2.C1440x;
import z3.C1446d;
import z3.H;
import z3.o;
import z3.t;
import z3.z;

@Metadata
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f8958e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f8959f = C1440x.a("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f8960g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f8961a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f8962b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8963c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8964d;

    public static List c(String str) {
        List H3 = y.H(str, new char[]{'.'});
        if (!Intrinsics.a(C1403G.x(H3), "")) {
            return H3;
        }
        Intrinsics.checkNotNullParameter(H3, "<this>");
        int size = H3.size() - 1;
        return C1403G.E(H3, size >= 0 ? size : 0);
    }

    public final String a(String domain) {
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        int size;
        int size2;
        int i2 = 0;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List c4 = c(unicodeDomain);
        if (this.f8961a.get() || !this.f8961a.compareAndSet(false, true)) {
            try {
                this.f8962b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z4 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } finally {
                        if (z4) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z4 = true;
                } catch (IOException e4) {
                    n nVar = n.f10964a;
                    n.f10964a.getClass();
                    n.i("Failed to read public suffix list", 5, e4);
                    if (z4) {
                    }
                }
            }
        }
        if (this.f8963c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = c4.size();
        byte[][] bArr = new byte[size3][];
        for (int i4 = 0; i4 < size3; i4++) {
            String str4 = (String) c4.get(i4);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i4] = bytes;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                str = null;
                break;
            }
            byte[] bArr2 = this.f8963c;
            if (bArr2 == null) {
                Intrinsics.g("publicSuffixListBytes");
                throw null;
            }
            str = f.d(bArr2, bArr, i5);
            if (str != null) {
                break;
            }
            i5++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = f8958e;
                byte[] bArr4 = this.f8963c;
                if (bArr4 == null) {
                    Intrinsics.g("publicSuffixListBytes");
                    throw null;
                }
                str2 = f.d(bArr4, bArr3, i6);
                if (str2 != null) {
                    break;
                }
            }
        }
        str2 = null;
        if (str2 != null) {
            int i7 = size3 - 1;
            for (int i8 = 0; i8 < i7; i8++) {
                byte[] bArr5 = this.f8964d;
                if (bArr5 == null) {
                    Intrinsics.g("publicSuffixExceptionListBytes");
                    throw null;
                }
                str3 = f.d(bArr5, bArr, i8);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            list2 = y.H("!".concat(str3), new char[]{'.'});
        } else if (str == null && str2 == null) {
            list2 = f8959f;
        } else {
            if (str == null || (list = y.H(str, new char[]{'.'})) == null) {
                list = C1405I.f11931d;
            }
            if (str2 == null || (list2 = y.H(str2, new char[]{'.'})) == null) {
                list2 = C1405I.f11931d;
            }
            if (list.size() > list2.size()) {
                list2 = list;
            }
        }
        if (c4.size() == list2.size() && ((String) list2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list2.get(0)).charAt(0) == '!') {
            size = c4.size();
            size2 = list2.size();
        } else {
            size = c4.size();
            size2 = list2.size() + 1;
        }
        int i9 = size - size2;
        List c5 = c(domain);
        Intrinsics.checkNotNullParameter(c5, "<this>");
        Sequence c1437u = new C1437u(1, c5);
        Intrinsics.checkNotNullParameter(c1437u, "<this>");
        if (i9 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.h(i9, "Requested element count ", " is less than zero.").toString());
        }
        if (i9 != 0) {
            c1437u = c1437u instanceof d ? ((d) c1437u).a(i9) : new c(c1437u, i9);
        }
        Intrinsics.checkNotNullParameter(c1437u, "<this>");
        Intrinsics.checkNotNullParameter(".", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(c1437u, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(".", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        for (Object obj : c1437u) {
            i2++;
            if (i2 > 1) {
                buffer.append((CharSequence) ".");
            }
            l.a(buffer, obj, null);
        }
        buffer.append((CharSequence) "");
        String sb = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public final void b() {
        try {
            E e4 = new E();
            E e5 = new E();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            Logger logger = t.f12033a;
            Intrinsics.checkNotNullParameter(resourceAsStream, "<this>");
            z h4 = m3.z.h(new o(new C1446d(resourceAsStream, new H())));
            try {
                long h5 = h4.h();
                h4.t(h5);
                e4.f3580d = h4.f12045e.i(h5);
                long h6 = h4.h();
                h4.t(h6);
                e5.f3580d = h4.f12045e.i(h6);
                Unit unit = Unit.f7487a;
                q.a(h4, null);
                synchronized (this) {
                    Object obj = e4.f3580d;
                    Intrinsics.c(obj);
                    this.f8963c = (byte[]) obj;
                    Object obj2 = e5.f3580d;
                    Intrinsics.c(obj2);
                    this.f8964d = (byte[]) obj2;
                }
            } finally {
            }
        } finally {
            this.f8962b.countDown();
        }
    }
}
