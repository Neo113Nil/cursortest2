package okhttp3.internal.publicsuffix;

import b4.n;
import g4.k;
import g4.m;
import g4.p;
import g4.x;
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
import o2.f;
import p3.d;
import s.a;
import x2.h;
import x2.i;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3034e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f3035f = a.s("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f3036g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3037a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f3038b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3039c;
    public byte[] d;

    public static List c(String str) {
        List B0 = d.B0(str, new char[]{'.'});
        if (B0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!i3.d.a(B0.get(i.A(B0)), "")) {
            return B0;
        }
        int size = B0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        q qVar = q.f3887f;
        if (size == 0) {
            return qVar;
        }
        if (size >= B0.size()) {
            return h.G(B0);
        }
        if (size == 1) {
            if (B0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return a.s(B0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = B0.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : a.s(arrayList.get(0)) : qVar;
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
    
        r6[r11] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f3034e;
        r12 = r13.f3039c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r12 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r12 = o2.f.c(r12, r6, r11);
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
    
        r8 = r13.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r8 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        r8 = o2.f.c(r8, r5, r6);
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
    
        r1 = p3.d.B0("!".concat(r8), new char[]{'.'});
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
    
        r1 = new x2.o(c(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        if (r0 < 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
    
        if (r0 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0160, code lost:
    
        r1 = new o3.b(r1, r0);
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
    
        b4.l.a(r14, r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
    
        r14.append((java.lang.CharSequence) "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
    
        return r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ae, code lost:
    
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
    
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f3035f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        if (r9 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        r5 = p3.d.B0(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0104, code lost:
    
        if (r12 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0106, code lost:
    
        r1 = p3.d.B0(r12, new char[]{'.'});
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
    
        i3.d.h("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00dd, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00be, code lost:
    
        i3.d.h("publicSuffixListBytes");
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
        i3.d.d(unicode, "unicodeDomain");
        List c5 = c(unicode);
        List list = q.f3887f;
        int i = 0;
        if (this.f3037a.get() || !this.f3037a.compareAndSet(false, true)) {
            try {
                this.f3038b.await();
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
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z4 = true;
                    } catch (IOException e4) {
                        n nVar = n.f853a;
                        n.f853a.getClass();
                        n.i("Failed to read public suffix list", 5, e4);
                        if (z4) {
                        }
                    }
                } finally {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f3039c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = c5.size();
        byte[][] bArr = new byte[size][];
        for (int i4 = 0; i4 < size; i4++) {
            String str3 = (String) c5.get(i4);
            Charset charset = StandardCharsets.UTF_8;
            i3.d.d(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            i3.d.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i4] = bytes;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.f3039c;
            if (bArr2 == null) {
                i3.d.h("publicSuffixListBytes");
                throw null;
            }
            str2 = f.c(bArr2, bArr, i5);
            if (str2 != null) {
                break;
            }
            i5++;
        }
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = m.f1944a;
                p pVar = new p(new k(new g4.d(resourceAsStream, new x(), 1)));
                try {
                    long readInt = pVar.readInt();
                    pVar.i(readInt);
                    byte[] q4 = pVar.f1950g.q(readInt);
                    long readInt2 = pVar.readInt();
                    pVar.i(readInt2);
                    byte[] q5 = pVar.f1950g.q(readInt2);
                    pVar.close();
                    synchronized (this) {
                        this.f3039c = q4;
                        this.d = q5;
                    }
                } finally {
                }
            }
        } finally {
            this.f3038b.countDown();
        }
    }
}
