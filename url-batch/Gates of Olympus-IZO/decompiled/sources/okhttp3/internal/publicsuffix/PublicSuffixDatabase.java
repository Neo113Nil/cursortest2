package okhttp3.internal.publicsuffix;

import F0.a;
import I2.d;
import I2.n;
import M1.l;
import N2.C0148d;
import N2.H;
import N2.o;
import N2.t;
import N2.z;
import Z1.i;
import a.AbstractC0157a;
import h2.AbstractC0447i;
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

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f6746e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f6747f = AbstractC0157a.M("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f6748g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6749a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f6750b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6751c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6752d;

    public static List c(String str) {
        List C02 = AbstractC0447i.C0(str, new char[]{'.'});
        if (!i.a(l.s0(C02), "")) {
            return C02;
        }
        int size = C02.size() - 1;
        return l.z0(size >= 0 ? size : 0, C02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00bd, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r3 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r5 = (byte[][]) r4.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r10 >= r9) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r5[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f6746e;
        r11 = r12.f6751c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r11 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r11 = F0.a.b(r11, r5, r10);
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
    
        if (r5 >= r3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r7 = r12.f6752d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r7 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        r7 = F0.a.b(r7, r4, r5);
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
    
        r3 = h2.AbstractC0447i.C0("!".concat(r7), new char[]{'.'});
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
    
        r3 = new M1.s(0, c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
    
        if (r2 < 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        if (r2 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        if ((r3 instanceof g2.InterfaceC0407c) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
    
        r3 = ((g2.InterfaceC0407c) r3).a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        r3 = new g2.C0406b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        r13 = new java.lang.StringBuilder();
        r13.append((java.lang.CharSequence) "");
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0181, code lost:
    
        if (r3.hasNext() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0183, code lost:
    
        r4 = r3.next();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0188, code lost:
    
        if (r0 <= 1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        r13.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018f, code lost:
    
        g2.i.H(r13, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        r13.append((java.lang.CharSequence) "");
        r13 = r13.toString();
        Z1.i.e(r13, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019f, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b1, code lost:
    
        throw new java.lang.IllegalArgumentException(H2.AbstractC0080b.i("Requested element count ", r2, " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0146, code lost:
    
        r2 = r2.size();
        r3 = r3.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00eb, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        if (r11 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ef, code lost:
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f6747f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f2, code lost:
    
        r4 = M1.u.f2803d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f4, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f6, code lost:
    
        r5 = h2.AbstractC0447i.C0(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0100, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0102, code lost:
    
        r4 = h2.AbstractC0447i.C0(r11, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0112, code lost:
    
        if (r5.size() <= r4.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0114, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0116, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ff, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d1, code lost:
    
        Z1.i.j("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00d7, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00b9, code lost:
    
        Z1.i.j("publicSuffixListBytes");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        int i3 = 0;
        String unicode = IDN.toUnicode(str);
        i.e(unicode, "unicodeDomain");
        List c3 = c(unicode);
        if (this.f6749a.get() || !this.f6749a.compareAndSet(false, true)) {
            try {
                this.f6750b.await();
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
                    } catch (IOException e3) {
                        n nVar = n.f2519a;
                        n.f2519a.getClass();
                        n.i("Failed to read public suffix list", 5, e3);
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
        if (this.f6751c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = c3.size();
        byte[][] bArr = new byte[size][];
        for (int i4 = 0; i4 < size; i4++) {
            String str3 = (String) c3.get(i4);
            Charset charset = StandardCharsets.UTF_8;
            i.e(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            i.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i4] = bytes;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.f6751c;
            if (bArr2 == null) {
                i.j("publicSuffixListBytes");
                throw null;
            }
            str2 = a.b(bArr2, bArr, i5);
            if (str2 != null) {
                break;
            }
            i5++;
        }
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            Logger logger = t.f2963a;
            z j3 = AbstractC0157a.j(new o(new C0148d(resourceAsStream, 1, new H())));
            try {
                long j4 = j3.j();
                j3.z(j4);
                byte[] k3 = j3.f2974e.k(j4);
                long j5 = j3.j();
                j3.z(j5);
                byte[] k4 = j3.f2974e.k(j5);
                d.u(j3, null);
                synchronized (this) {
                    this.f6751c = k3;
                    this.f6752d = k4;
                }
            } finally {
            }
        } finally {
            this.f6750b.countDown();
        }
    }
}
