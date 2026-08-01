package okhttp3.internal.publicsuffix;

import defpackage.ap;
import defpackage.dc;
import defpackage.e10;
import defpackage.f70;
import defpackage.f90;
import defpackage.g7;
import defpackage.g9;
import defpackage.ik;
import defpackage.kr;
import defpackage.ky;
import defpackage.ni;
import defpackage.wb;
import defpackage.x40;
import defpackage.xf;
import defpackage.yy;
import defpackage.zz;
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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = kr.J("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List e0 = f70.e0(str, new char[]{'.'});
        if (e0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!kr.b(e0.get(e0.size() - 1), "")) {
            return e0;
        }
        int size = e0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            g9.p(size, " is less than zero.", "Requested element count ");
            return null;
        }
        ik ikVar = ik.f;
        if (size == 0) {
            return ikVar;
        }
        if (size >= e0.size()) {
            return wb.n0(e0);
        }
        if (size == 1) {
            if (e0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return kr.J(e0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = e0.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : kr.J(arrayList.get(0)) : ikVar;
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
        List list2 = ik.f;
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
                        zz zzVar = zz.a;
                        zz.a.getClass();
                        zz.i("Failed to read public suffix list", 5, e2);
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
            g9.s("Unable to load publicsuffixes.gz resource from the classpath.");
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
                kr.g0("publicSuffixListBytes");
                throw null;
            }
            str2 = ky.a(bArr2, bArr, i3);
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
                    kr.g0("publicSuffixListBytes");
                    throw null;
                }
                str3 = ky.a(bArr4, bArr3, i4);
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
                    kr.g0("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = ky.a(bArr5, bArr, i6);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = f70.e0("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f;
        } else {
            List e0 = str2 != null ? f70.e0(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = f70.e0(str3, new char[]{'.'});
            }
            list = e0.size() > list2.size() ? e0 : list2;
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
        x40 dcVar = new dc(0, c(str));
        if (i7 < 0) {
            g9.p(i7, " is less than zero.", "Requested element count ");
            return null;
        }
        if (i7 != 0) {
            dcVar = new ni(dcVar, i7);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : dcVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            xf.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = yy.a;
                e10 e10Var = new e10(new ap(new g7(resourceAsStream, new f90(), 1)));
                try {
                    long readInt = e10Var.readInt();
                    e10Var.l(readInt);
                    byte[] q = e10Var.g.q(readInt);
                    long readInt2 = e10Var.readInt();
                    e10Var.l(readInt2);
                    byte[] q2 = e10Var.g.q(readInt2);
                    e10Var.close();
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
