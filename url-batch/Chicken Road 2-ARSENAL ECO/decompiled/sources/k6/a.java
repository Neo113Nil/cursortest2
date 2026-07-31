package k6;

import C1.c;
import D0.h;
import F5.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.AbstractC0506j;
import l5.C0512p;
import n6.i;
import u0.AbstractC0676f;
import y1.C0760d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final i f5222b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f5223c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f5224d;

    /* renamed from: a, reason: collision with root package name */
    public final h f5225a;

    static {
        byte[] copyOf = Arrays.copyOf(new byte[]{42}, 1);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        f5222b = new i(copyOf);
        f5223c = AbstractC0676f.n("*");
        f5224d = new a(new h(5));
    }

    public a(h hVar) {
        this.f5225a = hVar;
    }

    public static List b(String str) {
        List c02 = j.c0(str, new char[]{'.'});
        if (!kotlin.jvm.internal.i.a(AbstractC0506j.J(c02), "")) {
            return c02;
        }
        int size = c02.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(c.g("Requested element count ", size, " is less than zero.").toString());
        }
        C0512p c0512p = C0512p.f5303f;
        if (size == 0) {
            return c0512p;
        }
        if (size >= c02.size()) {
            return AbstractC0506j.P(c02);
        }
        if (size == 1) {
            return AbstractC0676f.n(AbstractC0506j.E(c02));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = c02.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i7++;
            if (i7 == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : AbstractC0676f.n(arrayList.get(0)) : c0512p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r2 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r6 = (n6.i[]) r3.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r11 >= r10) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r6[r11] = k6.a.f5222b;
        r12 = (n6.i) r1.f333e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r12 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r12 = U0.h.e(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        r2 = r2 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r6 >= r2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        r7 = (n6.i) r1.f334f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r7 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r7 = U0.h.e(r7, r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        r1 = F5.j.c0("!".concat(r7), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        if (r0.size() != r1.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) == '!') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) != '!') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        r0 = r0.size();
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
    
        r0 = r0 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        r1 = new E5.h(1, b(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0152, code lost:
    
        if (r0 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        if (r0 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        r1 = new E5.c(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        r14 = new java.lang.StringBuilder();
        r14.append((java.lang.CharSequence) "");
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
    
        if (r1.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        r2 = r1.next();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
    
        if (r5 <= 1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0178, code lost:
    
        r14.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017d, code lost:
    
        u0.AbstractC0676f.b(r14, r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        r14.append((java.lang.CharSequence) "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0188, code lost:
    
        return r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019a, code lost:
    
        throw new java.lang.IllegalArgumentException(C1.c.g("Requested element count ", r0, " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013f, code lost:
    
        r0 = r0.size();
        r1 = r1.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e4, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e6, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e8, code lost:
    
        r1 = k6.a.f5223c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00eb, code lost:
    
        r2 = l5.C0512p.f5303f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        if (r9 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ef, code lost:
    
        r3 = F5.j.c0(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f9, code lost:
    
        if (r12 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fb, code lost:
    
        r2 = F5.j.c0(r12, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010b, code lost:
    
        if (r3.size() <= r2.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010d, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010f, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f8, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ca, code lost:
    
        kotlin.jvm.internal.i.l("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d0, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00af, code lost:
    
        kotlin.jvm.internal.i.l("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00b3, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        kotlin.jvm.internal.i.b(unicode);
        List b7 = b(unicode);
        h hVar = this.f5225a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) hVar.f331c;
        int i7 = 0;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) hVar.f332d).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z5 = false;
            while (true) {
                try {
                    try {
                        hVar.k();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z5 = true;
                    } catch (IOException e4) {
                        hVar.f335g = e4;
                        if (z5) {
                        }
                    }
                } finally {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((i) hVar.f333e) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(hVar.f330b);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) hVar.f335g);
            throw illegalStateException;
        }
        int size = b7.size();
        i[] iVarArr = new i[size];
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = i.f5525i;
            iVarArr[i8] = C0760d.d((String) b7.get(i8));
        }
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                str2 = null;
                break;
            }
            i iVar2 = (i) hVar.f333e;
            if (iVar2 == null) {
                kotlin.jvm.internal.i.l("bytes");
                throw null;
            }
            str2 = U0.h.e(iVar2, iVarArr, i9);
            if (str2 != null) {
                break;
            }
            i9++;
        }
    }
}
