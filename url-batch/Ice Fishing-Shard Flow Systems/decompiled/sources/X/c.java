package X;

import S.j;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2798a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2799b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2800c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2801d;

    public c(byte[] bArr, int i2, int i5) {
        this(-1L, bArr, i2, i5);
    }

    public static c a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f2810C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f2810C[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f2806a);
        wrap.putInt((int) eVar2.f2807b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i2, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f2810C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i2}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g7 = g(byteOrder);
        if (g7 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g7 instanceof String) {
            return Double.parseDouble((String) g7);
        }
        if (g7 instanceof long[]) {
            if (((long[]) g7).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g7 instanceof int[]) {
            if (((int[]) g7).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g7 instanceof double[]) {
            double[] dArr = (double[]) g7;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g7 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g7;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f2806a / eVar.f2807b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g7 = g(byteOrder);
        if (g7 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g7 instanceof String) {
            return Integer.parseInt((String) g7);
        }
        if (g7 instanceof long[]) {
            long[] jArr = (long[]) g7;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g7 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g7;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g7 = g(byteOrder);
        if (g7 == null) {
            return null;
        }
        if (g7 instanceof String) {
            return (String) g7;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (g7 instanceof long[]) {
            long[] jArr = (long[]) g7;
            while (i2 < jArr.length) {
                sb.append(jArr[i2]);
                i2++;
                if (i2 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g7 instanceof int[]) {
            int[] iArr = (int[]) g7;
            while (i2 < iArr.length) {
                sb.append(iArr[i2]);
                i2++;
                if (i2 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g7 instanceof double[]) {
            double[] dArr = (double[]) g7;
            while (i2 < dArr.length) {
                sb.append(dArr[i2]);
                i2++;
                if (i2 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g7 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g7;
        while (i2 < eVarArr.length) {
            sb.append(eVarArr[i2].f2806a);
            sb.append('/');
            sb.append(eVarArr[i2].f2807b);
            i2++;
            if (i2 != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:100:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [X.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [X.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        b bVar;
        InputStream inputStream;
        ?? str;
        byte b7;
        byte[] bArr = this.f2801d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f2795i = byteOrder;
                    int i2 = this.f2798a;
                    int i5 = 0;
                    int i7 = this.f2799b;
                    switch (i2) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b7 = bArr[0]) >= 0 && b7 <= 1) {
                                String str2 = new String(new char[]{(char) (b7 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                    return str2;
                                }
                            }
                            str = new String(bArr, g.f2819L);
                            break;
                            break;
                        case 2:
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (i7 >= g.f2811D.length) {
                                int i8 = 0;
                                while (true) {
                                    byte[] bArr2 = g.f2811D;
                                    if (i8 >= bArr2.length) {
                                        i5 = bArr2.length;
                                    } else if (bArr[i8] == bArr2[i8]) {
                                        i8++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i5 < i7) {
                                byte b8 = bArr[i5];
                                if (b8 == 0) {
                                    str = sb.toString();
                                    break;
                                } else {
                                    if (b8 >= 32) {
                                        sb.append((char) b8);
                                    } else {
                                        sb.append('?');
                                    }
                                    i5++;
                                }
                            }
                            str = sb.toString();
                        case 3:
                            str = new int[i7];
                            while (i5 < i7) {
                                str[i5] = bVar.readUnsignedShort();
                                i5++;
                            }
                        case 4:
                            str = new long[i7];
                            while (i5 < i7) {
                                str[i5] = bVar.readInt() & 4294967295L;
                                i5++;
                            }
                        case 5:
                            str = new e[i7];
                            while (i5 < i7) {
                                str[i5] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i5++;
                            }
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            str = new int[i7];
                            while (i5 < i7) {
                                str[i5] = bVar.readShort();
                                i5++;
                            }
                        case 9:
                            str = new int[i7];
                            while (i5 < i7) {
                                str[i5] = bVar.readInt();
                                i5++;
                            }
                        case 10:
                            str = new e[i7];
                            while (i5 < i7) {
                                str[i5] = new e(bVar.readInt(), bVar.readInt());
                                i5++;
                            }
                        case RequestError.STOP_TRACKING /* 11 */:
                            str = new double[i7];
                            while (i5 < i7) {
                                str[i5] = bVar.readFloat();
                                i5++;
                            }
                        case 12:
                            str = new double[i7];
                            while (i5 < i7) {
                                str[i5] = bVar.readDouble();
                                i5++;
                            }
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e8) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                return null;
                            }
                    }
                    try {
                        bVar.close();
                        return str;
                    } catch (IOException e9) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                        return str;
                    }
                } catch (IOException e10) {
                    e = e10;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e11) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
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
                    } catch (IOException e12) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                    }
                }
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + g.f2809B[this.f2798a] + ", data length:" + this.f2801d.length + ")";
    }

    public c(long j, byte[] bArr, int i2, int i5) {
        this.f2798a = i2;
        this.f2799b = i5;
        this.f2800c = j;
        this.f2801d = bArr;
    }
}
