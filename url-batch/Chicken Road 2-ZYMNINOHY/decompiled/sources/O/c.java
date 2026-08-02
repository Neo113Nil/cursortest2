package O;

import E.AbstractC0005f;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1958b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1959c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1960d;

    public c(byte[] bArr, int i4, int i5) {
        this(-1L, bArr, i4, i5);
    }

    public static c a(long j4, ByteOrder byteOrder) {
        long[] jArr = {j4};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1969C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1969C[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f1965a);
        wrap.putInt((int) eVar2.f1966b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i4, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1969C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i4}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g4 instanceof String) {
            return Double.parseDouble((String) g4);
        }
        if (g4 instanceof long[]) {
            if (((long[]) g4).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g4 instanceof int[]) {
            if (((int[]) g4).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g4 instanceof double[]) {
            double[] dArr = (double[]) g4;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g4 instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) g4;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f1965a / eVar.f1966b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g4 instanceof String) {
            return Integer.parseInt((String) g4);
        }
        if (g4 instanceof long[]) {
            long[] jArr = (long[]) g4;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g4 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g4;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            return null;
        }
        if (g4 instanceof String) {
            return (String) g4;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        if (g4 instanceof long[]) {
            long[] jArr = (long[]) g4;
            while (i4 < jArr.length) {
                sb.append(jArr[i4]);
                i4++;
                if (i4 != jArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (g4 instanceof int[]) {
            int[] iArr = (int[]) g4;
            while (i4 < iArr.length) {
                sb.append(iArr[i4]);
                i4++;
                if (i4 != iArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (g4 instanceof double[]) {
            double[] dArr = (double[]) g4;
            while (i4 < dArr.length) {
                sb.append(dArr[i4]);
                i4++;
                if (i4 != dArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (!(g4 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g4;
        while (i4 < eVarArr.length) {
            sb.append(eVarArr[i4].f1965a);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(eVarArr[i4].f1966b);
            i4++;
            if (i4 != eVarArr.length) {
                sb.append(StringUtils.COMMA);
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
    /* JADX WARN: Type inference failed for: r14v25, types: [O.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [O.e[]] */
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
        byte b4;
        byte[] bArr = this.f1960d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f1954c = byteOrder;
                    int i4 = this.f1957a;
                    int i5 = 0;
                    int i6 = this.f1958b;
                    switch (i4) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b4 = bArr[0]) >= 0 && b4 <= 1) {
                                String str2 = new String(new char[]{(char) (b4 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return str2;
                                }
                            }
                            str = new String(bArr, g.L);
                            break;
                            break;
                        case 2:
                        case 7:
                            if (i6 >= g.f1970D.length) {
                                int i7 = 0;
                                while (true) {
                                    byte[] bArr2 = g.f1970D;
                                    if (i7 >= bArr2.length) {
                                        i5 = bArr2.length;
                                    } else if (bArr[i7] == bArr2[i7]) {
                                        i7++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i5 < i6) {
                                byte b5 = bArr[i5];
                                if (b5 == 0) {
                                    str = sb.toString();
                                    break;
                                } else {
                                    if (b5 >= 32) {
                                        sb.append((char) b5);
                                    } else {
                                        sb.append('?');
                                    }
                                    i5++;
                                }
                            }
                            str = sb.toString();
                        case 3:
                            str = new int[i6];
                            while (i5 < i6) {
                                str[i5] = bVar.readUnsignedShort();
                                i5++;
                            }
                        case 4:
                            str = new long[i6];
                            while (i5 < i6) {
                                str[i5] = bVar.readInt() & KeyboardMap.kValueMask;
                                i5++;
                            }
                        case 5:
                            str = new e[i6];
                            while (i5 < i6) {
                                str[i5] = new e(bVar.readInt() & KeyboardMap.kValueMask, bVar.readInt() & KeyboardMap.kValueMask);
                                i5++;
                            }
                        case 8:
                            str = new int[i6];
                            while (i5 < i6) {
                                str[i5] = bVar.readShort();
                                i5++;
                            }
                        case 9:
                            str = new int[i6];
                            while (i5 < i6) {
                                str[i5] = bVar.readInt();
                                i5++;
                            }
                        case 10:
                            str = new e[i6];
                            while (i5 < i6) {
                                str[i5] = new e(bVar.readInt(), bVar.readInt());
                                i5++;
                            }
                        case 11:
                            str = new double[i6];
                            while (i5 < i6) {
                                str[i5] = bVar.readFloat();
                                i5++;
                            }
                        case 12:
                            str = new double[i6];
                            while (i5 < i6) {
                                str[i5] = bVar.readDouble();
                                i5++;
                            }
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e5) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                return null;
                            }
                    }
                    try {
                        bVar.close();
                        return str;
                    } catch (IOException e6) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        return str;
                    }
                } catch (IOException e7) {
                    e = e7;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e8) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
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
                    } catch (IOException e9) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                    }
                }
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f1968B[this.f1957a]);
        sb.append(", data length:");
        return AbstractC0005f.o(sb, this.f1960d.length, ")");
    }

    public c(long j4, byte[] bArr, int i4, int i5) {
        this.f1957a = i4;
        this.f1958b = i5;
        this.f1959c = j4;
        this.f1960d = bArr;
    }
}
