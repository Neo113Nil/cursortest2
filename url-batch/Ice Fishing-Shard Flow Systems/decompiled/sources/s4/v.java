package s4;

import com.appsflyer.attribution.RequestError;
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
public class v implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final v f7772a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f7773b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f7774c;

    static {
        f7773b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f7774c = Charset.forName("UTF8");
    }

    public static void c(ByteBuffer byteBuffer, int i2) {
        int position = byteBuffer.position() % i2;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i2) - position);
        }
    }

    public static int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i2 = byteBuffer.get() & 255;
        return i2 < 254 ? i2 : i2 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static void g(u uVar, int i2) {
        int size = uVar.size() % i2;
        if (size != 0) {
            for (int i5 = 0; i5 < i2 - size; i5++) {
                uVar.write(0);
            }
        }
    }

    public static void h(u uVar, int i2) {
        if (f7773b) {
            uVar.write(i2);
            uVar.write(i2 >>> 8);
            uVar.write(i2 >>> 16);
            uVar.write(i2 >>> 24);
            return;
        }
        uVar.write(i2 >>> 24);
        uVar.write(i2 >>> 16);
        uVar.write(i2 >>> 8);
        uVar.write(i2);
    }

    public static void i(u uVar, long j) {
        if (f7773b) {
            uVar.write((byte) j);
            uVar.write((byte) (j >>> 8));
            uVar.write((byte) (j >>> 16));
            uVar.write((byte) (j >>> 24));
            uVar.write((byte) (j >>> 32));
            uVar.write((byte) (j >>> 40));
            uVar.write((byte) (j >>> 48));
            uVar.write((byte) (j >>> 56));
            return;
        }
        uVar.write((byte) (j >>> 56));
        uVar.write((byte) (j >>> 48));
        uVar.write((byte) (j >>> 40));
        uVar.write((byte) (j >>> 32));
        uVar.write((byte) (j >>> 24));
        uVar.write((byte) (j >>> 16));
        uVar.write((byte) (j >>> 8));
        uVar.write((byte) j);
    }

    public static void j(u uVar, int i2) {
        if (i2 < 254) {
            uVar.write(i2);
            return;
        }
        if (i2 > 65535) {
            uVar.write(255);
            h(uVar, i2);
            return;
        }
        uVar.write(254);
        if (f7773b) {
            uVar.write(i2);
            uVar.write(i2 >>> 8);
        } else {
            uVar.write(i2 >>> 8);
            uVar.write(i2);
        }
    }

    @Override // s4.m
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        u uVar = new u();
        k(uVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(uVar.size());
        allocateDirect.put(uVar.a(), 0, uVar.size());
        return allocateDirect;
    }

    @Override // s4.m
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e7 = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return e7;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b7, ByteBuffer byteBuffer) {
        Charset charset = f7774c;
        int i2 = 0;
        switch (b7) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                return new BigInteger(new String(bArr, charset), 16);
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                return new String(bArr2, charset);
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int d7 = d(byteBuffer);
                int[] iArr = new int[d7];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((d7 * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int d8 = d(byteBuffer);
                long[] jArr = new long[d8];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((d8 * 8) + byteBuffer.position());
                return jArr;
            case RequestError.STOP_TRACKING /* 11 */:
                int d9 = d(byteBuffer);
                double[] dArr = new double[d9];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((d9 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int d10 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d10);
                while (i2 < d10) {
                    arrayList.add(e(byteBuffer));
                    i2++;
                }
                return arrayList;
            case 13:
                int d11 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i2 < d11) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    i2++;
                }
                return hashMap;
            case 14:
                int d12 = d(byteBuffer);
                float[] fArr = new float[d12];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((d12 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public void k(u uVar, Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            uVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            uVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z7 = obj instanceof Number;
        Charset charset = f7774c;
        if (z7) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                uVar.write(3);
                h(uVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                uVar.write(4);
                i(uVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                uVar.write(6);
                g(uVar, 8);
                i(uVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                uVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(uVar, bytes.length);
                uVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            uVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(uVar, bytes2.length);
            uVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            uVar.write(8);
            byte[] bArr = (byte[]) obj;
            j(uVar, bArr.length);
            uVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            uVar.write(9);
            int[] iArr = (int[]) obj;
            j(uVar, iArr.length);
            g(uVar, 4);
            int length = iArr.length;
            while (i2 < length) {
                h(uVar, iArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            uVar.write(10);
            long[] jArr = (long[]) obj;
            j(uVar, jArr.length);
            g(uVar, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                i(uVar, jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            uVar.write(11);
            double[] dArr = (double[]) obj;
            j(uVar, dArr.length);
            g(uVar, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                i(uVar, Double.doubleToLongBits(dArr[i2]));
                i2++;
            }
            return;
        }
        if (obj instanceof List) {
            uVar.write(12);
            List list = (List) obj;
            j(uVar, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(uVar, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            uVar.write(13);
            Map map = (Map) obj;
            j(uVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(uVar, entry.getKey());
                k(uVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        uVar.write(14);
        float[] fArr = (float[]) obj;
        j(uVar, fArr.length);
        g(uVar, 4);
        int length4 = fArr.length;
        while (i2 < length4) {
            h(uVar, Float.floatToIntBits(fArr[i2]));
            i2++;
        }
    }
}
