package w0;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class o implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3561a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3562b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f3563c;

    static {
        f3562b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f3563c = Charset.forName("UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int i2) {
        int position = byteBuffer.position() % i2;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i2) - position);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i2 = byteBuffer.get() & 255;
        return i2 < 254 ? i2 : i2 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void g(n nVar, int i2) {
        int size = nVar.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                nVar.write(0);
            }
        }
    }

    public static final void h(n nVar, int i2) {
        if (f3562b) {
            nVar.write(i2);
            nVar.write(i2 >>> 8);
            nVar.write(i2 >>> 16);
            nVar.write(i2 >>> 24);
            return;
        }
        nVar.write(i2 >>> 24);
        nVar.write(i2 >>> 16);
        nVar.write(i2 >>> 8);
        nVar.write(i2);
    }

    public static final void i(n nVar, long j2) {
        if (f3562b) {
            nVar.write((byte) j2);
            nVar.write((byte) (j2 >>> 8));
            nVar.write((byte) (j2 >>> 16));
            nVar.write((byte) (j2 >>> 24));
            nVar.write((byte) (j2 >>> 32));
            nVar.write((byte) (j2 >>> 40));
            nVar.write((byte) (j2 >>> 48));
            nVar.write((byte) (j2 >>> 56));
            return;
        }
        nVar.write((byte) (j2 >>> 56));
        nVar.write((byte) (j2 >>> 48));
        nVar.write((byte) (j2 >>> 40));
        nVar.write((byte) (j2 >>> 32));
        nVar.write((byte) (j2 >>> 24));
        nVar.write((byte) (j2 >>> 16));
        nVar.write((byte) (j2 >>> 8));
        nVar.write((byte) j2);
    }

    public static final void j(n nVar, int i2) {
        if (i2 < 254) {
            nVar.write(i2);
            return;
        }
        if (i2 > 65535) {
            nVar.write(255);
            h(nVar, i2);
            return;
        }
        nVar.write(254);
        if (f3562b) {
            nVar.write(i2);
            nVar.write(i2 >>> 8);
        } else {
            nVar.write(i2 >>> 8);
            nVar.write(i2);
        }
    }

    @Override // w0.k
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e2 = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return e2;
    }

    @Override // w0.k
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        k(nVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nVar.size());
        allocateDirect.put(nVar.a(), 0, nVar.size());
        return allocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b2, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f3563c;
        int i2 = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                return Long.valueOf(byteBuffer.getLong());
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int d2 = d(byteBuffer);
                int[] iArr = new int[d2];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((d2 * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int d3 = d(byteBuffer);
                long[] jArr = new long[d3];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((d3 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int d4 = d(byteBuffer);
                double[] dArr = new double[d4];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((d4 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int d5 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d5);
                while (i2 < d5) {
                    arrayList.add(e(byteBuffer));
                    i2++;
                }
                return arrayList;
            case 13:
                int d6 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i2 < d6) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    i2++;
                }
                return hashMap;
            case 14:
                int d7 = d(byteBuffer);
                float[] fArr = new float[d7];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((d7 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(n nVar, Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            nVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            nVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z2 = obj instanceof Number;
        Charset charset = f3563c;
        if (z2) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                nVar.write(3);
                h(nVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                nVar.write(4);
                i(nVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                nVar.write(6);
                g(nVar, 8);
                i(nVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                nVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(nVar, bytes.length);
                nVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            nVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(nVar, bytes2.length);
            nVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            nVar.write(8);
            byte[] bArr = (byte[]) obj;
            j(nVar, bArr.length);
            nVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            nVar.write(9);
            int[] iArr = (int[]) obj;
            j(nVar, iArr.length);
            g(nVar, 4);
            int length = iArr.length;
            while (i2 < length) {
                h(nVar, iArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            nVar.write(10);
            long[] jArr = (long[]) obj;
            j(nVar, jArr.length);
            g(nVar, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                i(nVar, jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            nVar.write(11);
            double[] dArr = (double[]) obj;
            j(nVar, dArr.length);
            g(nVar, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                i(nVar, Double.doubleToLongBits(dArr[i2]));
                i2++;
            }
            return;
        }
        if (obj instanceof List) {
            nVar.write(12);
            List list = (List) obj;
            j(nVar, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(nVar, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            nVar.write(13);
            Map map = (Map) obj;
            j(nVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(nVar, entry.getKey());
                k(nVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        nVar.write(14);
        float[] fArr = (float[]) obj;
        j(nVar, fArr.length);
        g(nVar, 4);
        int length4 = fArr.length;
        while (i2 < length4) {
            h(nVar, Float.floatToIntBits(fArr[i2]));
            i2++;
        }
    }
}
