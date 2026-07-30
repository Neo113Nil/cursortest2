package okhttp3.internal.publicsuffix;

import com.google.firebase.encoders.json.BuildConfig;
import defpackage.ah0;
import defpackage.dj2;
import defpackage.in1;
import defpackage.lh;
import defpackage.nm1;
import defpackage.o70;
import defpackage.oe0;
import defpackage.p62;
import defpackage.pe0;
import defpackage.pv;
import defpackage.r12;
import defpackage.up2;
import defpackage.ww0;
import defpackage.yv;
import defpackage.zv;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = pv.c("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List G = up2.G(str, new char[]{'.'});
        if (!Intrinsics.b(zv.B(G), BuildConfig.FLAVOR)) {
            return G;
        }
        int size = G.size() - 1;
        return zv.J(size >= 0 ? size : 0, G);
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        List list2;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List c = c(unicode);
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
                        r12 r12Var = r12.a;
                        r12.a.getClass();
                        r12.i("Failed to read public suffix list", 5, e2);
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
            lh.g("Unable to load publicsuffixes.gz resource from the classpath.");
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
                Intrinsics.f("publicSuffixListBytes");
                throw null;
            }
            str2 = nm1.h(bArr2, bArr, i2);
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
                    Intrinsics.f("publicSuffixListBytes");
                    throw null;
                }
                str3 = nm1.h(bArr4, bArr3, i3);
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
                    Intrinsics.f("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = nm1.h(bArr5, bArr, i5);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list2 = up2.G("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list2 = f;
        } else {
            if (str2 == null || (list = up2.G(str2, new char[]{'.'})) == null) {
                list = ah0.m;
            }
            if (str3 == null || (list2 = up2.G(str3, new char[]{'.'})) == null) {
                list2 = ah0.m;
            }
            if (list.size() > list2.size()) {
                list2 = list;
            }
        }
        if (c.size() == list2.size() && ((String) list2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list2.get(0)).charAt(0) == '!') {
            size = c.size();
            size2 = list2.size();
        } else {
            size = c.size();
            size2 = list2.size() + 1;
        }
        int i6 = size - size2;
        List c2 = c(str);
        c2.getClass();
        Sequence yvVar = new yv(0, c2);
        if (i6 < 0) {
            lh.c(in1.l(i6, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i6 != 0) {
            yvVar = yvVar instanceof pe0 ? ((pe0) yvVar).a(i6) : new oe0(yvVar, i6);
        }
        return dj2.d(yvVar, ".");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                p62 p62Var = new p62(new ww0(o70.J(resourceAsStream)));
                try {
                    long readInt = p62Var.readInt();
                    p62Var.F(readInt);
                    byte[] s = p62Var.n.s(readInt);
                    long readInt2 = p62Var.readInt();
                    p62Var.F(readInt2);
                    byte[] s2 = p62Var.n.s(readInt2);
                    Unit unit = Unit.a;
                    p62Var.close();
                    synchronized (this) {
                        this.c = s;
                        this.d = s2;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }
}
