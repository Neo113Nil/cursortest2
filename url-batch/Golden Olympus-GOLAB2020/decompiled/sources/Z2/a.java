package Z2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Z2.a$a, reason: collision with other inner class name */
    public static class C0070a implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f9749b;

        /* renamed from: c, reason: collision with root package name */
        private int f9750c = 0;

        public C0070a(Object[] objArr) {
            this.f9749b = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9750c < this.f9749b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i4 = this.f9750c;
            Object[] objArr = this.f9749b;
            if (i4 != objArr.length) {
                this.f9750c = i4 + 1;
                return objArr[i4];
            }
            throw new NoSuchElementException("Out of elements: " + this.f9750c);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 != bArr.length; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 != iArr.length; i4++) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] d(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static long[] e(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    public static int[] f(int[] iArr, int i4, int i5) {
        int g4 = g(i4, i5);
        int[] iArr2 = new int[g4];
        if (iArr.length - i4 < g4) {
            System.arraycopy(iArr, i4, iArr2, 0, iArr.length - i4);
            return iArr2;
        }
        System.arraycopy(iArr, i4, iArr2, 0, g4);
        return iArr2;
    }

    private static int g(int i4, int i5) {
        int i6 = i5 - i4;
        if (i6 >= 0) {
            return i6;
        }
        StringBuffer stringBuffer = new StringBuffer(i4);
        stringBuffer.append(" > ");
        stringBuffer.append(i5);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int h(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i4 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i4;
            }
            i4 = (i4 * 257) ^ bArr[length];
        }
    }

    public static int i(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i4 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i4;
            }
            i4 = (i4 * 257) ^ iArr[length];
        }
    }

    public static int j(int[] iArr, int i4, int i5) {
        if (iArr == null) {
            return 0;
        }
        int i6 = i5 + 1;
        while (true) {
            i5--;
            if (i5 < 0) {
                return i6;
            }
            i6 = (i6 * 257) ^ iArr[i4 + i5];
        }
    }

    public static int k(long[] jArr, int i4, int i5) {
        if (jArr == null) {
            return 0;
        }
        int i6 = i5 + 1;
        while (true) {
            i5--;
            if (i5 < 0) {
                return i6;
            }
            long j4 = jArr[i4 + i5];
            i6 = (((i6 * 257) ^ ((int) j4)) * 257) ^ ((int) (j4 >>> 32));
        }
    }

    public static int[] l(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i4 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            iArr2[length] = iArr[i4];
            i4++;
        }
    }
}
