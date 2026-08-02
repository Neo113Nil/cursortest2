package defpackage;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adh {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public adh(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static adh b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(adj.h);
        return new adh(2, bytes.length, -1L, bytes);
    }

    public static adh c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[adj.f[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new adh(4, 1, -1L, wrap.array());
    }

    public static adh d(adi adiVar, ByteOrder byteOrder) {
        adi[] adiVarArr = {adiVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[adj.f[5]]);
        wrap.order(byteOrder);
        adi adiVar2 = adiVarArr[0];
        wrap.putInt((int) adiVar2.a);
        wrap.putInt((int) adiVar2.b);
        return new adh(5, 1, -1L, wrap.array());
    }

    public static adh e(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[adj.f[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new adh(3, 1, -1L, wrap.array());
    }

    public final int a(ByteOrder byteOrder) {
        Object f = f(byteOrder);
        if (f == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (f instanceof String) {
            return Integer.parseInt((String) f);
        }
        if (f instanceof long[]) {
            long[] jArr = (long[]) f;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(f instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) f;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0135: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:310), block:B:100:0x0135 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [adi[]] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v16, types: [adi[]] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v19, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Object f(ByteOrder byteOrder) {
        adg adgVar;
        adg adgVar2;
        Object str;
        byte b;
        String str2;
        adg adgVar3 = null;
        try {
            try {
                adgVar = new adg(this.d);
                try {
                    adgVar.c = byteOrder;
                    int i = 0;
                    switch (this.a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.d;
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(this.d, adj.h);
                                try {
                                    adgVar.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                adgVar.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            int i2 = this.b;
                            byte[] bArr2 = adj.g;
                            int length = bArr2.length;
                            if (i2 >= 8) {
                                int i3 = 0;
                                while (true) {
                                    int length2 = bArr2.length;
                                    if (i3 >= 8) {
                                        i = 8;
                                    } else if (this.d[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i < i2) {
                                byte b2 = this.d[i];
                                if (b2 == 0) {
                                    str2 = sb.toString();
                                    adgVar.close();
                                    return str2;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            str2 = sb.toString();
                            adgVar.close();
                            return str2;
                        case 3:
                            int i4 = this.b;
                            str = new int[i4];
                            while (i < i4) {
                                str[i] = adgVar.readUnsignedShort();
                                i++;
                            }
                            adgVar.close();
                            return str;
                        case 4:
                            int i5 = this.b;
                            str = new long[i5];
                            while (i < i5) {
                                str[i] = adgVar.a();
                                i++;
                            }
                            adgVar.close();
                            return str;
                        case 5:
                            int i6 = this.b;
                            str = new adi[i6];
                            while (i < i6) {
                                str[i] = new adi(adgVar.a(), adgVar.a());
                                i++;
                            }
                            adgVar.close();
                            return str;
                        case 8:
                            int i7 = this.b;
                            str = new int[i7];
                            while (i < i7) {
                                str[i] = adgVar.readShort();
                                i++;
                            }
                            adgVar.close();
                            return str;
                        case 9:
                            int i8 = this.b;
                            str = new int[i8];
                            while (i < i8) {
                                str[i] = adgVar.readInt();
                                i++;
                            }
                            adgVar.close();
                            return str;
                        case 10:
                            int i9 = this.b;
                            str = new adi[i9];
                            while (i < i9) {
                                str[i] = new adi(adgVar.readInt(), adgVar.readInt());
                                i++;
                            }
                            adgVar.close();
                            return str;
                        case 11:
                            int i10 = this.b;
                            str = new double[i10];
                            while (i < i10) {
                                str[i] = adgVar.readFloat();
                                i++;
                            }
                            adgVar.close();
                            return str;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            int i11 = this.b;
                            str = new double[i11];
                            while (i < i11) {
                                str[i] = adgVar.readDouble();
                                i++;
                            }
                            adgVar.close();
                            return str;
                        default:
                            try {
                                adgVar.close();
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                            }
                            return null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (adgVar != null) {
                        try {
                            adgVar.close();
                        } catch (IOException e5) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                adgVar3 = adgVar2;
                if (adgVar3 != null) {
                    try {
                        adgVar3.close();
                    } catch (IOException e6) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            adgVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (adgVar3 != null) {
            }
            throw th;
        }
    }

    public final String g(ByteOrder byteOrder) {
        Object f = f(byteOrder);
        if (f == null) {
            return null;
        }
        if (f instanceof String) {
            return (String) f;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (f instanceof long[]) {
            long[] jArr = (long[]) f;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (f instanceof int[]) {
            int[] iArr = (int[]) f;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    break;
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (f instanceof double[]) {
            double[] dArr = (double[]) f;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    break;
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else {
            if (!(f instanceof adi[])) {
                return null;
            }
            adi[] adiVarArr = (adi[]) f;
            while (true) {
                int length4 = adiVarArr.length;
                if (i >= length4) {
                    break;
                }
                sb.append(adiVarArr[i].a);
                sb.append('/');
                sb.append(adiVarArr[i].b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return "(" + adj.e[this.a] + ", data length:" + this.d.length + ")";
    }
}
