package com.baidu.bbalbscesium.i;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.LongBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b implements Cloneable, Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final int f3935d = 6;

    /* renamed from: e, reason: collision with root package name */
    private static final int f3936e = 64;

    /* renamed from: f, reason: collision with root package name */
    private static final int f3937f = 63;

    /* renamed from: g, reason: collision with root package name */
    private static final long f3938g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static final ObjectStreamField[] f3939h = {new ObjectStreamField("bits", long[].class)};

    /* renamed from: i, reason: collision with root package name */
    private static final long f3940i = 7997698588986878753L;

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f3941j = true;

    /* renamed from: a, reason: collision with root package name */
    private long[] f3942a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f3943b;

    /* renamed from: c, reason: collision with root package name */
    private transient boolean f3944c;

    public b() {
        this.f3943b = 0;
        this.f3944c = false;
        f(64);
        this.f3944c = false;
    }

    private void b() {
        int i8;
        int i9;
        boolean z7 = f3941j;
        if (!z7 && (i9 = this.f3943b) != 0 && this.f3942a[i9 - 1] == 0) {
            throw new AssertionError();
        }
        if (!z7 && ((i8 = this.f3943b) < 0 || i8 > this.f3942a.length)) {
            throw new AssertionError();
        }
        if (z7) {
            return;
        }
        int i10 = this.f3943b;
        long[] jArr = this.f3942a;
        if (i10 != jArr.length && jArr[i10] != 0) {
            throw new AssertionError();
        }
    }

    private void f() {
        int i8 = this.f3943b - 1;
        while (i8 >= 0 && this.f3942a[i8] == 0) {
            i8--;
        }
        this.f3943b = i8 + 1;
    }

    private static int l(int i8) {
        return i8 >> 6;
    }

    public int a() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.f3943b; i9++) {
            i8 += Long.bitCount(this.f3942a[i9]);
        }
        return i8;
    }

    public void c() {
        while (true) {
            int i8 = this.f3943b;
            if (i8 <= 0) {
                return;
            }
            long[] jArr = this.f3942a;
            int i9 = i8 - 1;
            this.f3943b = i9;
            jArr[i9] = 0;
        }
    }

    public Object clone() {
        if (!this.f3944c) {
            j();
        }
        try {
            b bVar = (b) super.clone();
            bVar.f3942a = (long[]) this.f3942a.clone();
            bVar.b();
            return bVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public b d(int i8, int i9) {
        long j8;
        int i10 = i9;
        a(i8, i9);
        b();
        int e8 = e();
        int i11 = 0;
        if (e8 <= i8 || i8 == i10) {
            return new b(0);
        }
        if (i10 > e8) {
            i10 = e8;
        }
        int i12 = i10 - i8;
        b bVar = new b(i12);
        int l8 = l(i12 - 1);
        int i13 = l8 + 1;
        int l9 = l(i8);
        int i14 = i8 & 63;
        boolean z7 = i14 == 0;
        while (i11 < l8) {
            long[] jArr = bVar.f3942a;
            long[] jArr2 = this.f3942a;
            jArr[i11] = z7 ? jArr2[l9] : (jArr2[l9] >>> i8) | (jArr2[l9 + 1] << (-i8));
            i11++;
            l9++;
        }
        long j9 = (-1) >>> (-i10);
        long[] jArr3 = bVar.f3942a;
        if (((i10 - 1) & 63) < i14) {
            long[] jArr4 = this.f3942a;
            j8 = ((jArr4[l9 + 1] & j9) << (-i8)) | (jArr4[l9] >>> i8);
        } else {
            j8 = (this.f3942a[l9] & j9) >>> i8;
        }
        jArr3[l8] = j8;
        bVar.f3943b = i13;
        bVar.f();
        bVar.b();
        return bVar;
    }

    public int e() {
        int i8 = this.f3943b;
        if (i8 == 0) {
            return 0;
        }
        int i9 = i8 - 1;
        return (i9 * 64) + (64 - Long.numberOfLeadingZeros(this.f3942a[i9]));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b bVar = (b) obj;
        b();
        bVar.b();
        if (this.f3943b != bVar.f3943b) {
            return false;
        }
        for (int i8 = 0; i8 < this.f3943b; i8++) {
            if (this.f3942a[i8] != bVar.f3942a[i8]) {
                return false;
            }
        }
        return true;
    }

    public int g() {
        return this.f3942a.length * 64;
    }

    public int h(int i8) {
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i8);
        }
        b();
        int l8 = l(i8);
        if (l8 >= this.f3943b) {
            return -1;
        }
        long j8 = this.f3942a[l8] & ((-1) << i8);
        while (j8 == 0) {
            l8++;
            if (l8 == this.f3943b) {
                return -1;
            }
            j8 = this.f3942a[l8];
        }
        return (l8 * 64) + Long.numberOfTrailingZeros(j8);
    }

    public int hashCode() {
        int i8 = this.f3943b;
        long j8 = 1234;
        while (true) {
            int i9 = i8 - 1;
            if (i9 < 0) {
                return (int) ((j8 >> 32) ^ j8);
            }
            j8 ^= this.f3942a[i9] * i8;
            i8 = i9;
        }
    }

    public int i(int i8) {
        if (i8 < 0) {
            if (i8 == -1) {
                return -1;
            }
            throw new IndexOutOfBoundsException("fromIndex < -1: " + i8);
        }
        b();
        int l8 = l(i8);
        if (l8 >= this.f3943b) {
            return i8;
        }
        long j8 = (~this.f3942a[l8]) & ((-1) >>> (-(i8 + 1)));
        while (j8 == 0) {
            int i9 = l8 - 1;
            if (l8 == 0) {
                return -1;
            }
            j8 = ~this.f3942a[i9];
            l8 = i9;
        }
        return (((l8 + 1) * 64) - 1) - Long.numberOfLeadingZeros(j8);
    }

    public int j(int i8) {
        if (i8 < 0) {
            if (i8 == -1) {
                return -1;
            }
            throw new IndexOutOfBoundsException("fromIndex < -1: " + i8);
        }
        b();
        int l8 = l(i8);
        if (l8 >= this.f3943b) {
            return e() - 1;
        }
        long j8 = this.f3942a[l8] & ((-1) >>> (-(i8 + 1)));
        while (j8 == 0) {
            int i9 = l8 - 1;
            if (l8 == 0) {
                return -1;
            }
            j8 = this.f3942a[i9];
            l8 = i9;
        }
        return (((l8 + 1) * 64) - 1) - Long.numberOfLeadingZeros(j8);
    }

    public void k(int i8) {
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i8);
        }
        int l8 = l(i8);
        c(l8);
        long[] jArr = this.f3942a;
        jArr[l8] = jArr[l8] | (1 << i8);
        b();
    }

    public String toString() {
        b();
        int i8 = this.f3943b;
        StringBuilder sb = new StringBuilder(((i8 > 128 ? a() : i8 * 64) * 6) + 2);
        sb.append('{');
        int h8 = h(0);
        if (h8 != -1) {
            sb.append(h8);
            int i9 = h8 + 1;
            while (true) {
                int h9 = h(i9);
                if (h9 < 0) {
                    break;
                }
                int g8 = g(h9);
                while (true) {
                    sb.append(", ");
                    sb.append(h9);
                    int i10 = h9 + 1;
                    if (i10 >= g8) {
                        break;
                    }
                    h9 = i10;
                }
                i9 = h9 + 2;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i8) {
        this.f3943b = 0;
        this.f3944c = false;
        if (i8 >= 0) {
            f(i8);
            this.f3944c = true;
        } else {
            throw new NegativeArraySizeException("nbits < 0: " + i8);
        }
    }

    public static b a(ByteBuffer byteBuffer) {
        ByteBuffer order = byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN);
        int remaining = order.remaining();
        while (remaining > 0 && order.get(remaining - 1) == 0) {
            remaining--;
        }
        long[] jArr = new long[(remaining + 7) / 8];
        order.limit(remaining);
        int i8 = 0;
        while (order.remaining() >= 8) {
            jArr[i8] = order.getLong();
            i8++;
        }
        int remaining2 = order.remaining();
        for (int i9 = 0; i9 < remaining2; i9++) {
            jArr[i8] = jArr[i8] | ((order.get() & 255) << (i9 * 8));
        }
        return new b(jArr);
    }

    private void b(int i8) {
        long[] jArr = this.f3942a;
        if (jArr.length < i8) {
            this.f3942a = Arrays.copyOf(this.f3942a, Math.max(jArr.length * 2, i8));
            this.f3944c = false;
        }
    }

    private void c(int i8) {
        int i9 = i8 + 1;
        if (this.f3943b < i9) {
            b(i9);
            this.f3943b = i9;
        }
    }

    private void f(int i8) {
        this.f3942a = new long[l(i8 - 1) + 1];
    }

    private void j() {
        int i8 = this.f3943b;
        long[] jArr = this.f3942a;
        if (i8 != jArr.length) {
            this.f3942a = Arrays.copyOf(jArr, i8);
            b();
        }
    }

    public void d(int i8) {
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i8);
        }
        int l8 = l(i8);
        c(l8);
        long[] jArr = this.f3942a;
        jArr[l8] = jArr[l8] ^ (1 << i8);
        f();
        b();
    }

    public void e(int i8, int i9) {
        a(i8, i9);
        if (i8 == i9) {
            return;
        }
        int l8 = l(i8);
        int l9 = l(i9 - 1);
        c(l9);
        long j8 = (-1) << i8;
        long j9 = (-1) >>> (-i9);
        if (l8 == l9) {
            long[] jArr = this.f3942a;
            jArr[l8] = (j9 & j8) | jArr[l8];
        } else {
            long[] jArr2 = this.f3942a;
            jArr2[l8] = j8 | jArr2[l8];
            while (true) {
                l8++;
                if (l8 >= l9) {
                    break;
                } else {
                    this.f3942a[l8] = -1;
                }
            }
            long[] jArr3 = this.f3942a;
            jArr3[l9] = j9 | jArr3[l9];
        }
        b();
    }

    public int g(int i8) {
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i8);
        }
        b();
        int l8 = l(i8);
        if (l8 >= this.f3943b) {
            return i8;
        }
        long j8 = (~this.f3942a[l8]) & ((-1) << i8);
        while (j8 == 0) {
            l8++;
            int i9 = this.f3943b;
            if (l8 == i9) {
                return i9 * 64;
            }
            j8 = ~this.f3942a[l8];
        }
        return (l8 * 64) + Long.numberOfTrailingZeros(j8);
    }

    public byte[] h() {
        int i8 = this.f3943b;
        if (i8 == 0) {
            return new byte[0];
        }
        int i9 = i8 - 1;
        int i10 = i9 * 8;
        for (long j8 = this.f3942a[i9]; j8 != 0; j8 >>>= 8) {
            i10++;
        }
        byte[] bArr = new byte[i10];
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (int i11 = 0; i11 < i9; i11++) {
            order.putLong(this.f3942a[i11]);
        }
        for (long j9 = this.f3942a[i9]; j9 != 0; j9 >>>= 8) {
            order.put((byte) (255 & j9));
        }
        return bArr;
    }

    public long[] i() {
        return Arrays.copyOf(this.f3942a, this.f3943b);
    }

    private b(long[] jArr) {
        this.f3943b = 0;
        this.f3944c = false;
        this.f3942a = jArr;
        this.f3943b = jArr.length;
        b();
    }

    public static b a(LongBuffer longBuffer) {
        LongBuffer slice = longBuffer.slice();
        int remaining = slice.remaining();
        while (remaining > 0 && slice.get(remaining - 1) == 0) {
            remaining--;
        }
        long[] jArr = new long[remaining];
        slice.get(jArr);
        return new b(jArr);
    }

    public void b(int i8, int i9) {
        int l8;
        a(i8, i9);
        if (i8 != i9 && (l8 = l(i8)) < this.f3943b) {
            int l9 = l(i9 - 1);
            if (l9 >= this.f3943b) {
                i9 = e();
                l9 = this.f3943b - 1;
            }
            long j8 = (-1) << i8;
            long j9 = (-1) >>> (-i9);
            if (l8 == l9) {
                long[] jArr = this.f3942a;
                jArr[l8] = (~(j9 & j8)) & jArr[l8];
            } else {
                long[] jArr2 = this.f3942a;
                jArr2[l8] = (~j8) & jArr2[l8];
                while (true) {
                    l8++;
                    if (l8 >= l9) {
                        break;
                    } else {
                        this.f3942a[l8] = 0;
                    }
                }
                long[] jArr3 = this.f3942a;
                jArr3[l9] = (~j9) & jArr3[l9];
            }
            f();
            b();
        }
    }

    public void c(int i8, int i9) {
        a(i8, i9);
        if (i8 == i9) {
            return;
        }
        int l8 = l(i8);
        int l9 = l(i9 - 1);
        c(l9);
        long j8 = (-1) << i8;
        long j9 = (-1) >>> (-i9);
        if (l8 == l9) {
            long[] jArr = this.f3942a;
            jArr[l8] = (j9 & j8) ^ jArr[l8];
        } else {
            long[] jArr2 = this.f3942a;
            jArr2[l8] = jArr2[l8] ^ j8;
            while (true) {
                l8++;
                if (l8 >= l9) {
                    break;
                }
                long[] jArr3 = this.f3942a;
                jArr3[l8] = ~jArr3[l8];
            }
            long[] jArr4 = this.f3942a;
            jArr4[l9] = j9 ^ jArr4[l9];
        }
        f();
        b();
    }

    public void d(b bVar) {
        if (this == bVar) {
            return;
        }
        int min = Math.min(this.f3943b, bVar.f3943b);
        int i8 = this.f3943b;
        int i9 = bVar.f3943b;
        if (i8 < i9) {
            b(i9);
            this.f3943b = bVar.f3943b;
        }
        for (int i10 = 0; i10 < min; i10++) {
            long[] jArr = this.f3942a;
            jArr[i10] = jArr[i10] | bVar.f3942a[i10];
        }
        if (min < bVar.f3943b) {
            System.arraycopy(bVar.f3942a, min, this.f3942a, min, this.f3943b - min);
        }
        b();
    }

    public void e(b bVar) {
        int min = Math.min(this.f3943b, bVar.f3943b);
        int i8 = this.f3943b;
        int i9 = bVar.f3943b;
        if (i8 < i9) {
            b(i9);
            this.f3943b = bVar.f3943b;
        }
        for (int i10 = 0; i10 < min; i10++) {
            long[] jArr = this.f3942a;
            jArr[i10] = jArr[i10] ^ bVar.f3942a[i10];
        }
        int i11 = bVar.f3943b;
        if (min < i11) {
            System.arraycopy(bVar.f3942a, min, this.f3942a, min, i11 - min);
        }
        f();
        b();
    }

    public static b a(byte[] bArr) {
        return a(ByteBuffer.wrap(bArr));
    }

    public void b(b bVar) {
        for (int min = Math.min(this.f3943b, bVar.f3943b) - 1; min >= 0; min--) {
            long[] jArr = this.f3942a;
            jArr[min] = jArr[min] & (~bVar.f3942a[min]);
        }
        f();
        b();
    }

    public boolean c(b bVar) {
        for (int min = Math.min(this.f3943b, bVar.f3943b) - 1; min >= 0; min--) {
            if ((this.f3942a[min] & bVar.f3942a[min]) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.f3943b == 0;
    }

    public boolean e(int i8) {
        if (i8 >= 0) {
            b();
            int l8 = l(i8);
            return l8 < this.f3943b && (this.f3942a[l8] & (1 << i8)) != 0;
        }
        throw new IndexOutOfBoundsException("bitIndex < 0: " + i8);
    }

    public static b a(long[] jArr) {
        int length = jArr.length;
        while (length > 0 && jArr[length - 1] == 0) {
            length--;
        }
        return new b(Arrays.copyOf(jArr, length));
    }

    public void a(int i8) {
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("bitIndex < 0: " + i8);
        }
        int l8 = l(i8);
        if (l8 >= this.f3943b) {
            return;
        }
        long[] jArr = this.f3942a;
        jArr[l8] = jArr[l8] & (~(1 << i8));
        f();
        b();
    }

    private static void a(int i8, int i9) {
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex < 0: " + i8);
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("toIndex < 0: " + i9);
        }
        if (i8 <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i8 + " > toIndex: " + i9);
    }

    public void a(int i8, int i9, boolean z7) {
        if (z7) {
            e(i8, i9);
        } else {
            b(i8, i9);
        }
    }

    public void a(int i8, boolean z7) {
        if (z7) {
            k(i8);
        } else {
            a(i8);
        }
    }

    public void a(b bVar) {
        if (this == bVar) {
            return;
        }
        while (true) {
            int i8 = this.f3943b;
            if (i8 <= bVar.f3943b) {
                break;
            }
            long[] jArr = this.f3942a;
            int i9 = i8 - 1;
            this.f3943b = i9;
            jArr[i9] = 0;
        }
        for (int i10 = 0; i10 < this.f3943b; i10++) {
            long[] jArr2 = this.f3942a;
            jArr2[i10] = jArr2[i10] & bVar.f3942a[i10];
        }
        f();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r7[r7.length - 1] == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(ObjectInputStream objectInputStream) {
        long[] jArr = (long[]) objectInputStream.readFields().get("bits", (Object) null);
        this.f3942a = jArr;
        this.f3943b = jArr.length;
        f();
        long[] jArr2 = this.f3942a;
        boolean z7 = jArr2.length > 0;
        this.f3944c = z7;
        b();
    }

    private void a(ObjectOutputStream objectOutputStream) {
        b();
        if (!this.f3944c) {
            j();
        }
        objectOutputStream.putFields().put("bits", this.f3942a);
        objectOutputStream.writeFields();
    }
}
