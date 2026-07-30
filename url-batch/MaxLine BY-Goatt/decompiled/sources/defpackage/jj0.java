package defpackage;

import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jj0 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public jj0(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static jj0 a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[nj0.B[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new jj0(wrap.array(), 4, 1);
    }

    public static jj0 b(lj0 lj0Var, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[nj0.B[5]]);
        wrap.order(byteOrder);
        lj0 lj0Var2 = new lj0[]{lj0Var}[0];
        wrap.putInt((int) lj0Var2.a);
        wrap.putInt((int) lj0Var2.b);
        return new jj0(wrap.array(), 5, 1);
    }

    public static jj0 c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[nj0.B[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new jj0(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g instanceof String) {
            return Double.parseDouble((String) g);
        }
        if (g instanceof long[]) {
            if (((long[]) g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof int[]) {
            if (((int[]) g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof lj0[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        lj0[] lj0VarArr = (lj0[]) g;
        if (lj0VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        lj0 lj0Var = lj0VarArr[0];
        return lj0Var.a / lj0Var.b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g instanceof String) {
            return Integer.parseInt((String) g);
        }
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            return null;
        }
        if (g instanceof String) {
            return (String) g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g instanceof int[]) {
            int[] iArr = (int[]) g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g instanceof lj0[])) {
            return null;
        }
        lj0[] lj0VarArr = (lj0[]) g;
        while (i < lj0VarArr.length) {
            sb.append(lj0VarArr[i].a);
            sb.append('/');
            sb.append(lj0VarArr[i].b);
            i++;
            if (i != lj0VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:107:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [lj0[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [lj0[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        ij0 ij0Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.d;
        InputStream inputStream2 = null;
        try {
            try {
                ij0Var = new ij0(bArr);
                try {
                    ij0Var.o = byteOrder;
                    int i = this.a;
                    int i2 = 0;
                    int i3 = this.b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, nj0.K);
                                try {
                                    ij0Var.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                ij0Var.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (i3 >= nj0.C.length) {
                                int i4 = 0;
                                while (true) {
                                    byte[] bArr2 = nj0.C;
                                    if (i4 >= bArr2.length) {
                                        i2 = bArr2.length;
                                    } else if (bArr[i4] == bArr2[i4]) {
                                        i4++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i2 < i3) {
                                byte b2 = bArr[i2];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    ij0Var.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i2++;
                            }
                            str = sb.toString();
                            ij0Var.close();
                            return str;
                        case 3:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = ij0Var.readUnsignedShort();
                                i2++;
                            }
                            try {
                                ij0Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i3];
                            while (i2 < i3) {
                                r13[i2] = ij0Var.readInt() & 4294967295L;
                                i2++;
                            }
                            ij0Var.close();
                            return r13;
                        case 5:
                            r13 = new lj0[i3];
                            while (i2 < i3) {
                                r13[i2] = new lj0(ij0Var.readInt() & 4294967295L, ij0Var.readInt() & 4294967295L);
                                i2++;
                            }
                            ij0Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = ij0Var.readShort();
                                i2++;
                            }
                            ij0Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i3];
                            while (i2 < i3) {
                                r13[i2] = ij0Var.readInt();
                                i2++;
                            }
                            ij0Var.close();
                            return r13;
                        case 10:
                            r13 = new lj0[i3];
                            while (i2 < i3) {
                                r13[i2] = new lj0(ij0Var.readInt(), ij0Var.readInt());
                                i2++;
                            }
                            ij0Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i3];
                            while (i2 < i3) {
                                r13[i2] = ij0Var.readFloat();
                                i2++;
                            }
                            ij0Var.close();
                            return r13;
                        case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                            r13 = new double[i3];
                            while (i2 < i3) {
                                r13[i2] = ij0Var.readDouble();
                                i2++;
                            }
                            ij0Var.close();
                            return r13;
                        default:
                            try {
                                ij0Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (ij0Var != null) {
                        try {
                            ij0Var.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
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
                    } catch (IOException e7) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            ij0Var = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + nj0.A[this.a] + ", data length:" + this.d.length + ")";
    }

    public jj0(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
