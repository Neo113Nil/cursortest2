package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class uo3 implements Iterable<Byte>, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final uo3 f12885g = new qo3(kq3.f7588d);

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<uo3> f12886h;

    /* renamed from: i, reason: collision with root package name */
    private static final to3 f12887i;

    /* renamed from: f, reason: collision with root package name */
    private int f12888f = 0;

    static {
        int i7 = do3.f4265a;
        f12887i = new to3(null);
        f12886h = new ko3();
    }

    uo3() {
    }

    static int D(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i7);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i8 < i7) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i8);
        sb3.append(" >= ");
        sb3.append(i9);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static ro3 H() {
        return new ro3(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static uo3 I(Iterable<uo3> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f12885g : p(iterable.iterator(), size);
    }

    public static uo3 J(byte[] bArr) {
        return K(bArr, 0, bArr.length);
    }

    public static uo3 K(byte[] bArr, int i7, int i8) {
        D(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new qo3(bArr2);
    }

    public static uo3 L(String str) {
        return new qo3(str.getBytes(kq3.f7586b));
    }

    public static uo3 M(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i7 = 256;
        while (true) {
            byte[] bArr = new byte[i7];
            int i8 = 0;
            while (i8 < i7) {
                int read = inputStream.read(bArr, i8, i7 - i8);
                if (read == -1) {
                    break;
                }
                i8 += read;
            }
            uo3 K = i8 == 0 ? null : K(bArr, 0, i8);
            if (K == null) {
                return I(arrayList);
            }
            arrayList.add(K);
            i7 = Math.min(i7 + i7, 8192);
        }
    }

    static uo3 N(byte[] bArr) {
        return new qo3(bArr);
    }

    static void j(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i7);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    private static uo3 p(Iterator<uo3> it, int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i7)));
        }
        if (i7 == 1) {
            return it.next();
        }
        int i8 = i7 >>> 1;
        uo3 p7 = p(it, i8);
        uo3 p8 = p(it, i7 - i8);
        if (Integer.MAX_VALUE - p7.q() >= p8.q()) {
            return ds3.Q(p7, p8);
        }
        int q7 = p7.q();
        int q8 = p8.q();
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(q7);
        sb.append("+");
        sb.append(q8);
        throw new IllegalArgumentException(sb.toString());
    }

    abstract void B(ho3 ho3Var);

    public abstract boolean C();

    protected final int F() {
        return this.f12888f;
    }

    @Override // java.lang.Iterable
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public no3 iterator() {
        return new io3(this);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.f12888f;
        if (i7 == 0) {
            int q7 = q();
            i7 = u(q7, 0, q7);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f12888f = i7;
        }
        return i7;
    }

    public final String i(Charset charset) {
        return q() == 0 ? "" : y(charset);
    }

    @Deprecated
    public final void k(byte[] bArr, int i7, int i8, int i9) {
        D(0, i9, q());
        D(i8, i8 + i9, bArr.length);
        if (i9 > 0) {
            r(bArr, 0, i8, i9);
        }
    }

    public final boolean l() {
        return q() == 0;
    }

    public final byte[] m() {
        int q7 = q();
        if (q7 == 0) {
            return kq3.f7588d;
        }
        byte[] bArr = new byte[q7];
        r(bArr, 0, 0, q7);
        return bArr;
    }

    public abstract byte n(int i7);

    abstract byte o(int i7);

    public abstract int q();

    protected abstract void r(byte[] bArr, int i7, int i8, int i9);

    protected abstract int s();

    protected abstract boolean t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(q());
        objArr[2] = q() <= 50 ? us3.a(this) : us3.a(w(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    protected abstract int u(int i7, int i8, int i9);

    protected abstract int v(int i7, int i8, int i9);

    public abstract uo3 w(int i7, int i8);

    public abstract cp3 x();

    protected abstract String y(Charset charset);

    public abstract ByteBuffer z();
}
