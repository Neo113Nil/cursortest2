package okhttp3.internal.publicsuffix;

import E.AbstractC0005f;
import O3.n;
import T3.l;
import T3.p;
import T3.x;
import a.AbstractC0124a;
import d3.h;
import d3.q;
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
import kotlin.jvm.internal.i;
import v3.c;
import v3.d;
import v3.j;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f14626e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f14627f = AbstractC0124a.H("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f14628g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f14629a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f14630b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f14631c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f14632d;

    public static List c(String str) {
        List o02 = AbstractC1510g.o0(str, new char[]{'.'});
        return i.a(d3.i.h0(o02), "") ? d3.i.c0(o02) : o02;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        int size;
        int size2;
        String unicodeDomain = IDN.toUnicode(str);
        i.d(unicodeDomain, "unicodeDomain");
        List c4 = c(unicodeDomain);
        List list = q.f8333a;
        int i4 = 0;
        if (this.f14629a.get() || !this.f14629a.compareAndSet(false, true)) {
            try {
                this.f14630b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e4) {
                        n nVar = n.f2081a;
                        n.f2081a.getClass();
                        n.i("Failed to read public suffix list", 5, e4);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f14631c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = c4.size();
        byte[][] bArr = new byte[size3][];
        for (int i5 = 0; i5 < size3; i5++) {
            String str5 = (String) c4.get(i5);
            Charset UTF_8 = StandardCharsets.UTF_8;
            i.d(UTF_8, "UTF_8");
            byte[] bytes = str5.getBytes(UTF_8);
            i.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i5] = bytes;
        }
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                str2 = null;
                break;
            }
            int i7 = i6 + 1;
            byte[] bArr2 = this.f14631c;
            if (bArr2 == null) {
                i.i("publicSuffixListBytes");
                throw null;
            }
            str2 = a2.i.h(bArr2, bArr, i6);
            if (str2 != null) {
                break;
            }
            i6 = i7;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8 + 1;
                bArr3[i8] = f14626e;
                byte[] bArr4 = this.f14631c;
                if (bArr4 == null) {
                    i.i("publicSuffixListBytes");
                    throw null;
                }
                str3 = a2.i.h(bArr4, bArr3, i8);
                if (str3 != null) {
                    break;
                }
                i8 = i9;
            }
        }
        str3 = null;
        if (str3 != null) {
            int i10 = size3 - 1;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                byte[] bArr5 = this.f14632d;
                if (bArr5 == null) {
                    i.i("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = a2.i.h(bArr5, bArr, i11);
                if (str4 != null) {
                    break;
                }
                i11 = i12;
            }
        }
        str4 = null;
        if (str4 != null) {
            list = AbstractC1510g.o0(i.h(str4, "!"), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f14627f;
        } else {
            List o02 = str2 == null ? null : AbstractC1510g.o0(str2, new char[]{'.'});
            if (o02 == null) {
                o02 = list;
            }
            List o03 = str3 == null ? null : AbstractC1510g.o0(str3, new char[]{'.'});
            if (o03 != null) {
                list = o03;
            }
            if (o02.size() > list.size()) {
                list = o02;
            }
        }
        if (c4.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list.get(0)).charAt(0) == '!') {
            size = c4.size();
            size2 = list.size();
        } else {
            size = c4.size();
            size2 = list.size() + 1;
        }
        int i13 = size - size2;
        j hVar = new h(1, c(str));
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC0005f.k(i13, "Requested element count ", " is less than zero.").toString());
        }
        if (i13 != 0) {
            hVar = hVar instanceof d ? ((d) hVar).a(i13) : new c(hVar, i13);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : hVar) {
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) ".");
            }
            O3.d.d(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = T3.n.f2990a;
        p pVar = new p(new l(new T3.d(resourceAsStream, 1, new x())));
        try {
            long readInt = pVar.readInt();
            pVar.p(readInt);
            byte[] k4 = pVar.f2995b.k(readInt);
            long readInt2 = pVar.readInt();
            pVar.p(readInt2);
            byte[] k5 = pVar.f2995b.k(readInt2);
            pVar.close();
            synchronized (this) {
                this.f14631c = k4;
                this.f14632d = k5;
            }
            this.f14630b.countDown();
        } finally {
        }
    }
}
