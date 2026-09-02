package M;

import android.util.Log;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1533b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1534c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1535d;

    public c(byte[] bArr, int i7, int i8) {
        this(-1L, bArr, i7, i8);
    }

    public static c a(long j4, ByteOrder byteOrder) {
        long[] jArr = {j4};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1544C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1544C[5]]);
        wrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        wrap.putInt((int) eVar2.f1540a);
        wrap.putInt((int) eVar2.f1541b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i7, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1544C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i7}[0]);
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
        return eVar.f1540a / eVar.f1541b;
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
        int i7 = 0;
        if (g7 instanceof long[]) {
            long[] jArr = (long[]) g7;
            while (i7 < jArr.length) {
                sb.append(jArr[i7]);
                i7++;
                if (i7 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g7 instanceof int[]) {
            int[] iArr = (int[]) g7;
            while (i7 < iArr.length) {
                sb.append(iArr[i7]);
                i7++;
                if (i7 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g7 instanceof double[]) {
            double[] dArr = (double[]) g7;
            while (i7 < dArr.length) {
                sb.append(dArr[i7]);
                i7++;
                if (i7 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g7 instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) g7;
        while (i7 < eVarArr.length) {
            sb.append(eVarArr[i7].f1540a);
            sb.append('/');
            sb.append(eVarArr[i7].f1541b);
            i7++;
            if (i7 != eVarArr.length) {
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
    /* JADX WARN: Type inference failed for: r14v25, types: [M.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [M.e[]] */
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
        byte[] bArr = this.f1535d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f1529h = byteOrder;
                    int i7 = this.f1532a;
                    int i8 = 0;
                    int i9 = this.f1533b;
                    switch (i7) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        case 6:
                            if (bArr.length == 1 && (b7 = bArr[0]) >= 0 && b7 <= 1) {
                                String str2 = new String(new char[]{(char) (b7 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return str2;
                                }
                            }
                            str = new String(bArr, g.f1553L);
                            break;
                            break;
                        case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        case 7:
                            if (i9 >= g.f1545D.length) {
                                int i10 = 0;
                                while (true) {
                                    byte[] bArr2 = g.f1545D;
                                    if (i10 >= bArr2.length) {
                                        i8 = bArr2.length;
                                    } else if (bArr[i10] == bArr2[i10]) {
                                        i10++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i8 < i9) {
                                byte b8 = bArr[i8];
                                if (b8 == 0) {
                                    str = sb.toString();
                                    break;
                                } else {
                                    if (b8 >= 32) {
                                        sb.append((char) b8);
                                    } else {
                                        sb.append('?');
                                    }
                                    i8++;
                                }
                            }
                            str = sb.toString();
                        case 3:
                            str = new int[i9];
                            while (i8 < i9) {
                                str[i8] = bVar.readUnsignedShort();
                                i8++;
                            }
                        case 4:
                            str = new long[i9];
                            while (i8 < i9) {
                                str[i8] = bVar.readInt() & 4294967295L;
                                i8++;
                            }
                        case 5:
                            str = new e[i9];
                            while (i8 < i9) {
                                str[i8] = new e(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i8++;
                            }
                        case 8:
                            str = new int[i9];
                            while (i8 < i9) {
                                str[i8] = bVar.readShort();
                                i8++;
                            }
                        case 9:
                            str = new int[i9];
                            while (i8 < i9) {
                                str[i8] = bVar.readInt();
                                i8++;
                            }
                        case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                            str = new e[i9];
                            while (i8 < i9) {
                                str[i8] = new e(bVar.readInt(), bVar.readInt());
                                i8++;
                            }
                        case 11:
                            str = new double[i9];
                            while (i8 < i9) {
                                str[i8] = bVar.readFloat();
                                i8++;
                            }
                        case 12:
                            str = new double[i9];
                            while (i8 < i9) {
                                str[i8] = bVar.readDouble();
                                i8++;
                            }
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e7) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                return null;
                            }
                    }
                    try {
                        bVar.close();
                        return str;
                    } catch (IOException e8) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                        return str;
                    }
                } catch (IOException e9) {
                    e = e9;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e10) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
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
                    } catch (IOException e11) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + g.f1543B[this.f1532a] + ", data length:" + this.f1535d.length + ")";
    }

    public c(long j4, byte[] bArr, int i7, int i8) {
        this.f1532a = i7;
        this.f1533b = i8;
        this.f1534c = j4;
        this.f1535d = bArr;
    }
}
