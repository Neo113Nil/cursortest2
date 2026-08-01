package okhttp3.internal.publicsuffix;

import defpackage.cw;
import defpackage.d60;
import defpackage.db;
import defpackage.dn;
import defpackage.eg;
import defpackage.i20;
import defpackage.ix;
import defpackage.j8;
import defpackage.jx;
import defpackage.k7;
import defpackage.kb;
import defpackage.l40;
import defpackage.l70;
import defpackage.o8;
import defpackage.op;
import defpackage.ry;
import defpackage.vh;
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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = l70.z("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List o0 = l40.o0(str, new char[]{'.'});
        if (o0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!op.d(o0.get(o0.size() - 1), "")) {
            return o0;
        }
        int size = o0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            o8.q(size, " is less than zero.", "Requested element count ");
            return null;
        }
        vh vhVar = vh.f;
        if (size == 0) {
            return vhVar;
        }
        if (size >= o0.size()) {
            return db.f0(o0);
        }
        if (size == 1) {
            if (o0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return l70.z(o0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = o0.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : l70.z(arrayList.get(0)) : vhVar;
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
        List list2 = vh.f;
        int i = 0;
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
                        jx jxVar = jx.a;
                        jx.a.getClass();
                        jx.i("Failed to read public suffix list", 5, e2);
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
            o8.t("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = c.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str5 = (String) c.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str5.getBytes(charset);
            bytes.getClass();
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                op.T("publicSuffixListBytes");
                throw null;
            }
            str2 = ix.d(bArr2, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                bArr3[i4] = e;
                byte[] bArr4 = this.c;
                if (bArr4 == null) {
                    op.T("publicSuffixListBytes");
                    throw null;
                }
                str3 = ix.d(bArr4, bArr3, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                byte[] bArr5 = this.d;
                if (bArr5 == null) {
                    op.T("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = ix.d(bArr5, bArr, i6);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = l40.o0("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f;
        } else {
            List o0 = str2 != null ? l40.o0(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = l40.o0(str3, new char[]{'.'});
            }
            list = o0.size() > list2.size() ? o0 : list2;
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
        int i7 = size - size2;
        i20 kbVar = new kb(c(str));
        if (i7 < 0) {
            o8.q(i7, " is less than zero.", "Requested element count ");
            return null;
        }
        if (i7 != 0) {
            kbVar = new eg(kbVar, i7);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : kbVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            j8.c(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = cw.a;
                ry ryVar = new ry(new dn(new k7(resourceAsStream, new d60(), 1)));
                try {
                    long readInt = ryVar.readInt();
                    ryVar.h(readInt);
                    byte[] q = ryVar.g.q(readInt);
                    long readInt2 = ryVar.readInt();
                    ryVar.h(readInt2);
                    byte[] q2 = ryVar.g.q(readInt2);
                    ryVar.close();
                    synchronized (this) {
                        this.c = q;
                        this.d = q2;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }
}
