package okhttp3.internal.publicsuffix;

import b3.e;
import g2.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import m0.a;
import n2.g;
import n2.h;
import n2.o;
import p3.d;
import p3.k;
import p3.m;
import p3.p;
import p3.x;
import u2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2996e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f2997f = a.r("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f2998a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f2999b = new CountDownLatch(1);
    public byte[] c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3000d;

    public static List c(String str) {
        List n02 = e.n0(str, new char[]{'.'});
        if (n02.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!c.a(n02.get(h.D(n02)), "")) {
            return n02;
        }
        int size = n02.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        o oVar = o.f2953f;
        if (size == 0) {
            return oVar;
        }
        if (size >= n02.size()) {
            return g.H(n02);
        }
        if (size == 1) {
            if (n02.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return a.r(n02.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = n02.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i4++;
            if (i4 == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : a.r(arrayList.get(0)) : oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r2 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r6 = (byte[][]) r5.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r11 >= r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r6[r11] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f2996e;
        r12 = r13.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r12 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r12 = g2.f.d(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        r2 = r2 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r6 >= r2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r8 = r13.f3000d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r8 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        r8 = g2.f.d(r8, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r8 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if (r8 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        r1 = b3.e.n0("!".concat(r8), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        if (r0.size() != r1.size()) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) == '!') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013c, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) != '!') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        r0 = r0.size();
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0146, code lost:
    
        r0 = r0 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r1 = new a3.e(1, c(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        if (r0 < 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
    
        if (r0 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0160, code lost:
    
        r1 = new a3.c(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0166, code lost:
    
        r14 = new java.lang.StringBuilder();
        r14.append((java.lang.CharSequence) "");
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        if (r1.hasNext() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017a, code lost:
    
        r2 = r1.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
    
        if (r3 <= 1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0181, code lost:
    
        r14.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0186, code lost:
    
        k3.m.h(r14, r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r14.append((java.lang.CharSequence) "");
        r14 = r14.toString();
        u2.c.d(r14, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0196, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b3, code lost:
    
        throw new java.lang.IllegalArgumentException(("Requested element count " + r0 + " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0148, code lost:
    
        r0 = r0.size();
        r1 = r1.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f3, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f5, code lost:
    
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f2997f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        if (r9 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        r5 = b3.e.n0(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0104, code lost:
    
        if (r12 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0106, code lost:
    
        r1 = b3.e.n0(r12, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0116, code lost:
    
        if (r5.size() <= r1.size()) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0118, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0103, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d7, code lost:
    
        u2.c.h("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00dd, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00be, code lost:
    
        u2.c.h("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c2, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        c.d(unicode, "unicodeDomain");
        List c = c(unicode);
        List list = o.f2953f;
        int i4 = 0;
        if (this.f2998a.get() || !this.f2998a.compareAndSet(false, true)) {
            try {
                this.f2999b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z3 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z3 = true;
                    } catch (IOException e4) {
                        k3.o oVar = k3.o.f2841a;
                        k3.o.f2841a.getClass();
                        k3.o.i("Failed to read public suffix list", 5, e4);
                        if (z3) {
                        }
                    }
                } finally {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = c.size();
        byte[][] bArr = new byte[size][];
        for (int i5 = 0; i5 < size; i5++) {
            String str3 = (String) c.get(i5);
            Charset charset = StandardCharsets.UTF_8;
            c.d(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            c.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i5] = bytes;
        }
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                c.h("publicSuffixListBytes");
                throw null;
            }
            str2 = f.d(bArr2, bArr, i6);
            if (str2 != null) {
                break;
            }
            i6++;
        }
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = m.f3037a;
                p pVar = new p(new k(new d(resourceAsStream, new x(), 1)));
                try {
                    long readInt = pVar.readInt();
                    pVar.i(readInt);
                    byte[] q4 = pVar.g.q(readInt);
                    long readInt2 = pVar.readInt();
                    pVar.i(readInt2);
                    byte[] q5 = pVar.g.q(readInt2);
                    pVar.close();
                    synchronized (this) {
                        this.c = q4;
                        this.f3000d = q5;
                    }
                } finally {
                }
            }
        } finally {
            this.f2999b.countDown();
        }
    }
}
