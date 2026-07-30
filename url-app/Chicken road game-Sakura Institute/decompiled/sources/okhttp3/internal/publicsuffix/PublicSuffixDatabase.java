package okhttp3.internal.publicsuffix;

import a0.m;
import a8.d;
import a8.o;
import e6.l;
import e6.u;
import f8.a0;
import f8.i0;
import f8.p;
import j4.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import r6.k;
import t6.a;
import z6.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f6965e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f6966f = a.F("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f6967g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6968a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f6969b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6970c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6971d;

    public static List c(String str) {
        List Q = h.Q(str, new char[]{'.'});
        if (!k.a(l.n0(Q), "")) {
            return Q;
        }
        int size = Q.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(m.g(size, "Requested element count ", " is less than zero.").toString());
        }
        u uVar = u.f2826f;
        if (size == 0) {
            return uVar;
        }
        if (size >= Q.size()) {
            return l.w0(Q);
        }
        if (size == 1) {
            return a.F(l.g0(Q));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = Q.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i7++;
            if (i7 == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : a.F(arrayList.get(0)) : uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c2, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r2 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r6 = (byte[][]) r5.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r11 >= r10) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r6[r11] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f6965e;
        r12 = r13.f6970c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r12 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r12 = j4.i.c(r12, r6, r11);
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
    
        if (r6 >= r2) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r8 = r13.f6971d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r8 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        r8 = j4.i.c(r8, r5, r6);
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
    
        r1 = z6.h.Q("!".concat(r8), new char[]{'.'});
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
    
        r1 = new e6.s(0, c(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        if (r0 < 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
    
        if (r0 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
    
        if ((r1 instanceof y6.c) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0164, code lost:
    
        r1 = ((y6.c) r1).a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        r1 = new y6.b(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        r14 = new java.lang.StringBuilder();
        r14.append((java.lang.CharSequence) "");
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0183, code lost:
    
        if (r1.hasNext() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        r2 = r1.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018a, code lost:
    
        if (r3 <= 1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        r14.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0191, code lost:
    
        u3.r.b(r14, r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        r14.append((java.lang.CharSequence) "");
        r14 = r14.toString();
        r6.k.e(r14, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a1, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b3, code lost:
    
        throw new java.lang.IllegalArgumentException(a0.m.g(r0, "Requested element count ", " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0148, code lost:
    
        r0 = r0.size();
        r1 = r1.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f1, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f3, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f5, code lost:
    
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f6966f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f8, code lost:
    
        if (r9 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fa, code lost:
    
        r5 = z6.h.Q(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0104, code lost:
    
        if (r12 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0106, code lost:
    
        r1 = z6.h.Q(r12, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0116, code lost:
    
        if (r5.size() <= r1.size()) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0118, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0103, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d7, code lost:
    
        r6.k.j("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00dd, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00be, code lost:
    
        r6.k.j("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        k.e(unicode, "unicodeDomain");
        List c4 = c(unicode);
        List list = u.f2826f;
        int i7 = 0;
        if (this.f6968a.get() || !this.f6968a.compareAndSet(false, true)) {
            try {
                this.f6969b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z8 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z8 = true;
                    } catch (IOException e9) {
                        o oVar = o.f570a;
                        o.f570a.getClass();
                        o.i("Failed to read public suffix list", 5, e9);
                        if (z8) {
                        }
                    }
                } finally {
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f6970c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = c4.size();
        byte[][] bArr = new byte[size][];
        for (int i8 = 0; i8 < size; i8++) {
            String str3 = (String) c4.get(i8);
            Charset charset = StandardCharsets.UTF_8;
            k.e(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            k.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i8] = bytes;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.f6970c;
            if (bArr2 == null) {
                k.j("publicSuffixListBytes");
                throw null;
            }
            str2 = i.c(bArr2, bArr, i9);
            if (str2 != null) {
                break;
            }
            i9++;
        }
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = f8.u.f3642a;
                a0 n8 = d.n(new p(new f8.d(resourceAsStream, 1, new i0())));
                try {
                    long readInt = n8.readInt();
                    n8.J(readInt);
                    byte[] w4 = n8.f3569g.w(readInt);
                    long readInt2 = n8.readInt();
                    n8.J(readInt2);
                    byte[] w5 = n8.f3569g.w(readInt2);
                    n8.close();
                    synchronized (this) {
                        this.f6970c = w4;
                        this.f6971d = w5;
                    }
                } finally {
                }
            }
        } finally {
            this.f6969b.countDown();
        }
    }
}
