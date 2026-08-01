package m;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069c {

    /* renamed from: a, reason: collision with root package name */
    public final int f939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f940b;

    /* renamed from: c, reason: collision with root package name */
    public final long f941c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f942d;

    public C0069c(byte[] bArr, int i2, int i3) {
        this(-1L, bArr, i2, i3);
    }

    public static C0069c a(long j2, ByteOrder byteOrder) {
        long[] jArr = {j2};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0073g.f951D[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C0069c(wrap.array(), 4, 1);
    }

    public static C0069c b(C0071e c0071e, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0073g.f951D[5]]);
        wrap.order(byteOrder);
        C0071e c0071e2 = new C0071e[]{c0071e}[0];
        wrap.putInt((int) c0071e2.f947a);
        wrap.putInt((int) c0071e2.f948b);
        return new C0069c(wrap.array(), 5, 1);
    }

    public static C0069c c(int i2, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0073g.f951D[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i2}[0]);
        return new C0069c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g2 = g(byteOrder);
        if (g2 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g2 instanceof String) {
            return Double.parseDouble((String) g2);
        }
        if (g2 instanceof long[]) {
            if (((long[]) g2).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g2 instanceof int[]) {
            if (((int[]) g2).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g2 instanceof double[]) {
            double[] dArr = (double[]) g2;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g2 instanceof C0071e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0071e[] c0071eArr = (C0071e[]) g2;
        if (c0071eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0071e c0071e = c0071eArr[0];
        return c0071e.f947a / c0071e.f948b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g2 = g(byteOrder);
        if (g2 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g2 instanceof String) {
            return Integer.parseInt((String) g2);
        }
        if (g2 instanceof long[]) {
            long[] jArr = (long[]) g2;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g2 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g2;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g2 = g(byteOrder);
        if (g2 == null) {
            return null;
        }
        if (g2 instanceof String) {
            return (String) g2;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (g2 instanceof long[]) {
            long[] jArr = (long[]) g2;
            while (i2 < jArr.length) {
                sb.append(jArr[i2]);
                i2++;
                if (i2 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g2 instanceof int[]) {
            int[] iArr = (int[]) g2;
            while (i2 < iArr.length) {
                sb.append(iArr[i2]);
                i2++;
                if (i2 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g2 instanceof double[]) {
            double[] dArr = (double[]) g2;
            while (i2 < dArr.length) {
                sb.append(dArr[i2]);
                i2++;
                if (i2 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g2 instanceof C0071e[])) {
            return null;
        }
        C0071e[] c0071eArr = (C0071e[]) g2;
        while (i2 < c0071eArr.length) {
            sb.append(c0071eArr[i2].f947a);
            sb.append('/');
            sb.append(c0071eArr[i2].f948b);
            i2++;
            if (i2 != c0071eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0129, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:51), block:B:158:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.io.Serializable, m.e[]] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.io.Serializable, m.e[]] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        C0068b c0068b;
        InputStream inputStream;
        byte b2;
        int i2 = 0;
        byte[] bArr = this.f942d;
        InputStream inputStream2 = null;
        try {
            try {
                c0068b = new C0068b(bArr);
                try {
                    c0068b.f936d = byteOrder;
                    int i3 = this.f939a;
                    int i4 = this.f940b;
                    switch (i3) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                                String str = new String(bArr, C0073g.f958M);
                                try {
                                    c0068b.close();
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b2 + 48)});
                            try {
                                c0068b.close();
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i4 >= C0073g.f952E.length) {
                                int i5 = 0;
                                while (true) {
                                    byte[] bArr2 = C0073g.f952E;
                                    if (i5 >= bArr2.length) {
                                        i2 = bArr2.length;
                                    } else if (bArr[i5] == bArr2[i5]) {
                                        i5++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i2 < i4) {
                                byte b3 = bArr[i2];
                                if (b3 == 0) {
                                    String sb2 = sb.toString();
                                    c0068b.close();
                                    return sb2;
                                }
                                if (b3 >= 32) {
                                    sb.append((char) b3);
                                } else {
                                    sb.append('?');
                                }
                                i2++;
                            }
                            String sb22 = sb.toString();
                            c0068b.close();
                            return sb22;
                        case 3:
                            ?? r15 = new int[i4];
                            while (i2 < i4) {
                                r15[i2] = c0068b.readUnsignedShort();
                                i2++;
                            }
                            try {
                                c0068b.close();
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                            }
                            return r15;
                        case 4:
                            ?? r152 = new long[i4];
                            while (i2 < i4) {
                                r152[i2] = c0068b.readInt() & 4294967295L;
                                i2++;
                            }
                            try {
                                c0068b.close();
                            } catch (IOException e5) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                            }
                            return r152;
                        case 5:
                            ?? r153 = new C0071e[i4];
                            while (i2 < i4) {
                                r153[i2] = new C0071e(c0068b.readInt() & 4294967295L, c0068b.readInt() & 4294967295L);
                                i2++;
                            }
                            try {
                                c0068b.close();
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                            return r153;
                        case 8:
                            ?? r154 = new int[i4];
                            while (i2 < i4) {
                                r154[i2] = c0068b.readShort();
                                i2++;
                            }
                            try {
                                c0068b.close();
                            } catch (IOException e7) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                            }
                            return r154;
                        case 9:
                            ?? r155 = new int[i4];
                            while (i2 < i4) {
                                r155[i2] = c0068b.readInt();
                                i2++;
                            }
                            try {
                                c0068b.close();
                            } catch (IOException e8) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                            }
                            return r155;
                        case 10:
                            ?? r156 = new C0071e[i4];
                            while (i2 < i4) {
                                r156[i2] = new C0071e(c0068b.readInt(), c0068b.readInt());
                                i2++;
                            }
                            try {
                                c0068b.close();
                            } catch (IOException e9) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                            }
                            return r156;
                        case 11:
                            ?? r157 = new double[i4];
                            while (i2 < i4) {
                                r157[i2] = c0068b.readFloat();
                                i2++;
                            }
                            try {
                                c0068b.close();
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return r157;
                        case 12:
                            ?? r158 = new double[i4];
                            while (i2 < i4) {
                                r158[i2] = c0068b.readDouble();
                                i2++;
                            }
                            try {
                                c0068b.close();
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return r158;
                        default:
                            try {
                                c0068b.close();
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c0068b != null) {
                        try {
                            c0068b.close();
                        } catch (IOException e14) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e15) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                    }
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            c0068b = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + C0073g.f950C[this.f939a] + ", data length:" + this.f942d.length + ")";
    }

    public C0069c(long j2, byte[] bArr, int i2, int i3) {
        this.f939a = i2;
        this.f940b = i3;
        this.f941c = j2;
        this.f942d = bArr;
    }
}
