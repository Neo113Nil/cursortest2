package Q;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2426b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2427c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2428d;

    public c(byte[] bArr, int i2, int i3) {
        this(-1L, bArr, i2, i3);
    }

    public static c a(long j2, ByteOrder byteOrder) {
        long[] jArr = {j2};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f2438D[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f2438D[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f2433a);
        wrap.putInt((int) eVar2.f2434b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i2, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f2438D[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i2}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g6 = g(byteOrder);
        if (g6 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g6 instanceof String) {
            return Double.parseDouble((String) g6);
        }
        if (g6 instanceof long[]) {
            if (((long[]) g6).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g6 instanceof int[]) {
            if (((int[]) g6).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g6 instanceof double[]) {
            double[] dArr = (double[]) g6;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g6 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g6;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f2433a / eVar.f2434b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g6 = g(byteOrder);
        if (g6 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g6 instanceof String) {
            return Integer.parseInt((String) g6);
        }
        if (g6 instanceof long[]) {
            long[] jArr = (long[]) g6;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g6 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g6;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g6 = g(byteOrder);
        if (g6 == null) {
            return null;
        }
        if (g6 instanceof String) {
            return (String) g6;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (g6 instanceof long[]) {
            long[] jArr = (long[]) g6;
            while (i2 < jArr.length) {
                sb.append(jArr[i2]);
                i2++;
                if (i2 != jArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (g6 instanceof int[]) {
            int[] iArr = (int[]) g6;
            while (i2 < iArr.length) {
                sb.append(iArr[i2]);
                i2++;
                if (i2 != iArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (g6 instanceof double[]) {
            double[] dArr = (double[]) g6;
            while (i2 < dArr.length) {
                sb.append(dArr[i2]);
                i2++;
                if (i2 != dArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (!(g6 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g6;
        while (i2 < eVarArr.length) {
            sb.append(eVarArr[i2].f2433a);
            sb.append('/');
            sb.append(eVarArr[i2].f2434b);
            i2++;
            if (i2 != eVarArr.length) {
                sb.append(StringUtils.COMMA);
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
    /* JADX WARN: Type inference failed for: r15v25, types: [Q.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [Q.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        b bVar;
        InputStream inputStream;
        byte b6;
        int i2 = 0;
        byte[] bArr = this.f2428d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f2422c = byteOrder;
                    int i3 = this.f2425a;
                    int i6 = this.f2426b;
                    switch (i3) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b6 = bArr[0]) < 0 || b6 > 1) {
                                String str = new String(bArr, g.f2447M);
                                try {
                                    bVar.close();
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b6 + 48)});
                            try {
                                bVar.close();
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i6 >= g.f2439E.length) {
                                int i7 = 0;
                                while (true) {
                                    byte[] bArr2 = g.f2439E;
                                    if (i7 >= bArr2.length) {
                                        i2 = bArr2.length;
                                    } else if (bArr[i7] == bArr2[i7]) {
                                        i7++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i2 < i6) {
                                byte b7 = bArr[i2];
                                if (b7 == 0) {
                                    String sb2 = sb.toString();
                                    bVar.close();
                                    return sb2;
                                }
                                if (b7 >= 32) {
                                    sb.append((char) b7);
                                } else {
                                    sb.append('?');
                                }
                                i2++;
                            }
                            String sb22 = sb.toString();
                            bVar.close();
                            return sb22;
                        case 3:
                            ?? r15 = new int[i6];
                            while (i2 < i6) {
                                r15[i2] = bVar.readUnsignedShort();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e7) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                            }
                            return r15;
                        case 4:
                            ?? r152 = new long[i6];
                            while (i2 < i6) {
                                r152[i2] = bVar.readInt() & 4294967295L;
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e8) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                            }
                            return r152;
                        case 5:
                            ?? r153 = new e[i6];
                            while (i2 < i6) {
                                r153[i2] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e9) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                            }
                            return r153;
                        case 8:
                            ?? r154 = new int[i6];
                            while (i2 < i6) {
                                r154[i2] = bVar.readShort();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return r154;
                        case 9:
                            ?? r155 = new int[i6];
                            while (i2 < i6) {
                                r155[i2] = bVar.readInt();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return r155;
                        case 10:
                            ?? r156 = new e[i6];
                            while (i2 < i6) {
                                r156[i2] = new e(bVar.readInt(), bVar.readInt());
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return r156;
                        case 11:
                            ?? r157 = new double[i6];
                            while (i2 < i6) {
                                r157[i2] = bVar.readFloat();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                            return r157;
                        case 12:
                            ?? r158 = new double[i6];
                            while (i2 < i6) {
                                r158[i2] = bVar.readDouble();
                                i2++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                            return r158;
                        default:
                            try {
                                bVar.close();
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                            return null;
                    }
                } catch (IOException e16) {
                    e = e16;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e17) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
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
                    } catch (IOException e18) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                    }
                }
                throw th;
            }
        } catch (IOException e19) {
            e = e19;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + g.f2437C[this.f2425a] + ", data length:" + this.f2428d.length + ")";
    }

    public c(long j2, byte[] bArr, int i2, int i3) {
        this.f2425a = i2;
        this.f2426b = i3;
        this.f2427c = j2;
        this.f2428d = bArr;
    }
}
