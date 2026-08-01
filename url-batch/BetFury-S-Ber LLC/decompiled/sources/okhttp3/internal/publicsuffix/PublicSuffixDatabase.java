package okhttp3.internal.publicsuffix;

import defpackage.bi;
import defpackage.cd;
import defpackage.gi0;
import defpackage.j70;
import defpackage.mf0;
import defpackage.mv;
import defpackage.p40;
import defpackage.p7;
import defpackage.q50;
import defpackage.qs;
import defpackage.s9;
import defpackage.uc;
import defpackage.vc0;
import defpackage.wc0;
import defpackage.wm;
import defpackage.xy;
import defpackage.yk;
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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = bi.K("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List C = mf0.C(str, new char[]{'.'});
        if (C.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!mv.c(C.get(C.size() - 1), "")) {
            return C;
        }
        int size = C.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            s9.r(size, " is less than zero.", "Requested element count ");
            return null;
        }
        wm wmVar = wm.f;
        if (size == 0) {
            return wmVar;
        }
        if (size >= C.size()) {
            return uc.q0(C);
        }
        if (size == 1) {
            if (C.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return bi.K(C.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = C.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : bi.K(arrayList.get(0)) : wmVar;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List c = c(unicode);
        List list2 = wm.f;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
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
                    } catch (IOException e2) {
                        q50 q50Var = q50.a;
                        q50.a.getClass();
                        q50.i("Failed to read public suffix list", 5, e2);
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
        if (this.c == null) {
            s9.u("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = c.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str5 = (String) c.get(i);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str5.getBytes(charset);
            bytes.getClass();
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                mv.P("publicSuffixListBytes");
                throw null;
            }
            str2 = xy.b(bArr2, bArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = e;
                byte[] bArr4 = this.c;
                if (bArr4 == null) {
                    mv.P("publicSuffixListBytes");
                    throw null;
                }
                str3 = xy.b(bArr4, bArr3, i3);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                byte[] bArr5 = this.d;
                if (bArr5 == null) {
                    mv.P("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = xy.b(bArr5, bArr, i5);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = mf0.C("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f;
        } else {
            List C = str2 != null ? mf0.C(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = mf0.C(str3, new char[]{'.'});
            }
            list = C.size() > list2.size() ? C : list2;
        }
        if (c.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list.get(0)).charAt(0) == '!') {
            size = c.size();
            size2 = list.size();
        } else {
            size = c.size();
            size2 = list.size() + 1;
        }
        int i6 = size - size2;
        vc0 cdVar = new cd(0, c(str));
        if (i6 < 0) {
            s9.r(i6, " is less than zero.", "Requested element count ");
            return null;
        }
        if (i6 != 0) {
            cdVar = new yk(cdVar, i6);
        }
        return wc0.j(cdVar, ".");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = p40.a;
                j70 j70Var = new j70(new qs(new p7(resourceAsStream, new gi0(), 1)));
                try {
                    long readInt = j70Var.readInt();
                    j70Var.H(readInt);
                    byte[] D = j70Var.g.D(readInt);
                    long readInt2 = j70Var.readInt();
                    j70Var.H(readInt2);
                    byte[] D2 = j70Var.g.D(readInt2);
                    j70Var.close();
                    synchronized (this) {
                        this.c = D;
                        this.d = D2;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }
}
