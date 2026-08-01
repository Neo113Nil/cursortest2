package okhttp3.internal.publicsuffix;

import defpackage.bb;
import defpackage.c40;
import defpackage.cy;
import defpackage.di;
import defpackage.ib;
import defpackage.jw;
import defpackage.mg;
import defpackage.o8;
import defpackage.qm;
import defpackage.t8;
import defpackage.v50;
import defpackage.vv;
import defpackage.vw;
import defpackage.w6;
import defpackage.ww;
import defpackage.y10;
import defpackage.zo;
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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = o8.U("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List w0 = c40.w0(str, new char[]{'.'});
        if (w0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!zo.b(w0.get(w0.size() - 1), "")) {
            return w0;
        }
        int size = w0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            t8.q(size, " is less than zero.", "Requested element count ");
            return null;
        }
        di diVar = di.f;
        if (size == 0) {
            return diVar;
        }
        if (size >= w0.size()) {
            return bb.K0(w0);
        }
        if (size == 1) {
            if (w0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return o8.U(w0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = w0.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : o8.U(arrayList.get(0)) : diVar;
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
        List list2 = di.f;
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
                        ww wwVar = ww.a;
                        ww.a.getClass();
                        ww.i("Failed to read public suffix list", 5, e2);
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
            t8.t("Unable to load publicsuffixes.gz resource from the classpath.");
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
                zo.O("publicSuffixListBytes");
                throw null;
            }
            str2 = vw.a(bArr2, bArr, i3);
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
                    zo.O("publicSuffixListBytes");
                    throw null;
                }
                str3 = vw.a(bArr4, bArr3, i4);
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
                    zo.O("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = vw.a(bArr5, bArr, i6);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = c40.w0("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f;
        } else {
            List w0 = str2 != null ? c40.w0(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = c40.w0(str3, new char[]{'.'});
            }
            list = w0.size() > list2.size() ? w0 : list2;
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
        y10 ibVar = new ib(c(str));
        if (i7 < 0) {
            t8.q(i7, " is less than zero.", "Requested element count ");
            return null;
        }
        if (i7 != 0) {
            ibVar = new mg(ibVar, i7);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : ibVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            jw.c(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = vv.a;
                cy cyVar = new cy(new qm(new w6(resourceAsStream, new v50(), 1)));
                try {
                    long readInt = cyVar.readInt();
                    cyVar.h(readInt);
                    byte[] q = cyVar.g.q(readInt);
                    long readInt2 = cyVar.readInt();
                    cyVar.h(readInt2);
                    byte[] q2 = cyVar.g.q(readInt2);
                    cyVar.close();
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
