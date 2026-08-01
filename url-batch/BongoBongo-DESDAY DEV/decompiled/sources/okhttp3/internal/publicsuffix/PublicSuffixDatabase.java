package okhttp3.internal.publicsuffix;

import A1.d;
import A1.o;
import F1.k;
import F1.m;
import F1.p;
import F1.x;
import K0.e;
import W0.g;
import W0.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3429e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f3430f = d.T("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f3431g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3432a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f3433b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3434c;
    public byte[] d;

    public static List c(String str) {
        List O2 = o1.d.O(str, new char[]{'.'});
        if (O2.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!h1.d.a(O2.get(h.m0(O2)), "")) {
            return O2;
        }
        int size = O2.size() - 1;
        return g.t0(O2, size >= 0 ? size : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r3 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r5 = (byte[][]) r4.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r10 >= r9) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r5[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f3429e;
        r11 = r12.f3434c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r11 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r11 = K0.e.a(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r11 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        r3 = r3 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r5 >= r3) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r7 = r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r7 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        r7 = K0.e.a(r7, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        r3 = o1.d.O("!".concat(r7), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        if (r2.size() != r3.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) == '!') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) != '!') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        r2 = r2.size();
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0150, code lost:
    
        r3 = new W0.n(0, c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
    
        if (r2 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        if (r2 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        r3 = new n1.b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
    
        r13 = new java.lang.StringBuilder();
        r13.append((java.lang.CharSequence) "");
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r3.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0178, code lost:
    
        r4 = r3.next();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        if (r0 <= 1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017f, code lost:
    
        r13.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
    
        h0.d0.a(r13, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r13.append((java.lang.CharSequence) "");
        r13 = r13.toString();
        h1.d.d(r13, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b1, code lost:
    
        throw new java.lang.IllegalArgumentException(("Requested element count " + r2 + " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0146, code lost:
    
        r2 = r2.size();
        r3 = r3.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00eb, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ed, code lost:
    
        if (r11 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ef, code lost:
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f3430f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f2, code lost:
    
        r4 = W0.p.f959a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f4, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f6, code lost:
    
        r5 = o1.d.O(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0100, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0102, code lost:
    
        r4 = o1.d.O(r11, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0112, code lost:
    
        if (r5.size() <= r4.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0114, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0116, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ff, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d1, code lost:
    
        h1.d.h("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d7, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b9, code lost:
    
        h1.d.h("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00bd, code lost:
    
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        int i = 0;
        String unicode = IDN.toUnicode(str);
        h1.d.d(unicode, "unicodeDomain");
        List c2 = c(unicode);
        if (this.f3432a.get() || !this.f3432a.compareAndSet(false, true)) {
            try {
                this.f3433b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z2 = true;
                    } catch (IOException e2) {
                        o oVar = o.f39a;
                        o.f39a.getClass();
                        o.i("Failed to read public suffix list", 5, e2);
                        if (z2) {
                        }
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f3434c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = c2.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) c2.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            h1.d.d(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            h1.d.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.f3434c;
            if (bArr2 == null) {
                h1.d.h("publicSuffixListBytes");
                throw null;
            }
            str2 = e.a(bArr2, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            Logger logger = m.f259a;
            p pVar = new p(new k(new F1.d(resourceAsStream, 1, new x())));
            try {
                long l2 = pVar.l();
                pVar.q(l2);
                byte[] j2 = pVar.f266b.j(l2);
                long l3 = pVar.l();
                pVar.q(l3);
                byte[] j3 = pVar.f266b.j(l3);
                d.p(pVar, null);
                synchronized (this) {
                    this.f3434c = j2;
                    this.d = j3;
                }
            } finally {
            }
        } finally {
            this.f3433b.countDown();
        }
    }
}
