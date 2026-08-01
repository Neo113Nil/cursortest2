package okhttp3.internal.publicsuffix;

import B1.k;
import B1.m;
import B1.x;
import J0.e;
import S0.g;
import S0.h;
import S0.p;
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
import w1.d;
import w1.l;
import w1.n;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3405e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f3406f = d.Y("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f3407g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3408a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f3409b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3410c;
    public byte[] d;

    public static List c(String str) {
        List L2 = k1.d.L(str, new char[]{'.'});
        if (L2.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!d1.d.a(L2.get(h.x0(L2)), "")) {
            return L2;
        }
        int size = L2.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        p pVar = p.f795a;
        if (size == 0) {
            return pVar;
        }
        if (size >= L2.size()) {
            return g.E0(L2);
        }
        if (size == 1) {
            if (L2.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return d.Y(L2.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = L2.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : d.Y(arrayList.get(0)) : pVar;
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
    
        r5[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f3405e;
        r11 = r12.f3410c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r11 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r11 = J0.e.a(r11, r5, r10);
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
    
        r7 = J0.e.a(r7, r4, r5);
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
    
        r3 = k1.d.L("!".concat(r7), new char[]{'.'});
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
    
        r3 = new S0.n(0, c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
    
        if (r2 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        if (r2 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        r3 = new j1.b(r3, r2);
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
    
        h1.d.b(r13, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r13.append((java.lang.CharSequence) "");
        r13 = r13.toString();
        d1.d.d(r13, "toString(...)");
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
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f3406f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f2, code lost:
    
        r4 = S0.p.f795a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f4, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f6, code lost:
    
        r5 = k1.d.L(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0100, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0102, code lost:
    
        r4 = k1.d.L(r11, new char[]{'.'});
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
    
        d1.d.h("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d7, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b9, code lost:
    
        d1.d.h("publicSuffixListBytes");
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
        d1.d.d(unicode, "unicodeDomain");
        List c2 = c(unicode);
        if (this.f3408a.get() || !this.f3408a.compareAndSet(false, true)) {
            try {
                this.f3409b.await();
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
                        n nVar = n.f4190a;
                        n.f4190a.getClass();
                        n.i("Failed to read public suffix list", 5, e2);
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
        if (this.f3410c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = c2.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) c2.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            d1.d.d(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            d1.d.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.f3410c;
            if (bArr2 == null) {
                d1.d.h("publicSuffixListBytes");
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
            Logger logger = m.f81a;
            B1.p pVar = new B1.p(new k(new B1.d(resourceAsStream, 1, new x())));
            try {
                long l2 = pVar.l();
                pVar.q(l2);
                byte[] j2 = pVar.f88b.j(l2);
                long l3 = pVar.l();
                pVar.q(l3);
                byte[] j3 = pVar.f88b.j(l3);
                l.m(pVar, null);
                synchronized (this) {
                    this.f3410c = j2;
                    this.d = j3;
                }
            } finally {
            }
        } finally {
            this.f3409b.countDown();
        }
    }
}
