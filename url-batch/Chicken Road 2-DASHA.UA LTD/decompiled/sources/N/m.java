package N;

import java.io.Serializable;
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
public class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final m f350a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f351b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f352c;

    static {
        f351b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f352c = Charset.forName("UTF8");
    }

    public static void a(ByteBuffer byteBuffer, int i2) {
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

    public static void g(l lVar, int i2) {
        int size = lVar.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                lVar.write(0);
            }
        }
    }

    public static void h(l lVar, int i2) {
        if (f351b) {
            lVar.write(i2);
            lVar.write(i2 >>> 8);
            lVar.write(i2 >>> 16);
            lVar.write(i2 >>> 24);
            return;
        }
        lVar.write(i2 >>> 24);
        lVar.write(i2 >>> 16);
        lVar.write(i2 >>> 8);
        lVar.write(i2);
    }

    public static void i(l lVar, long j2) {
        if (f351b) {
            lVar.write((byte) j2);
            lVar.write((byte) (j2 >>> 8));
            lVar.write((byte) (j2 >>> 16));
            lVar.write((byte) (j2 >>> 24));
            lVar.write((byte) (j2 >>> 32));
            lVar.write((byte) (j2 >>> 40));
            lVar.write((byte) (j2 >>> 48));
            lVar.write((byte) (j2 >>> 56));
            return;
        }
        lVar.write((byte) (j2 >>> 56));
        lVar.write((byte) (j2 >>> 48));
        lVar.write((byte) (j2 >>> 40));
        lVar.write((byte) (j2 >>> 32));
        lVar.write((byte) (j2 >>> 24));
        lVar.write((byte) (j2 >>> 16));
        lVar.write((byte) (j2 >>> 8));
        lVar.write((byte) j2);
    }

    public static void j(l lVar, int i2) {
        if (i2 < 254) {
            lVar.write(i2);
            return;
        }
        if (i2 > 65535) {
            lVar.write(255);
            h(lVar, i2);
            return;
        }
        lVar.write(254);
        if (f351b) {
            lVar.write(i2);
            lVar.write(i2 >>> 8);
        } else {
            lVar.write(i2 >>> 8);
            lVar.write(i2);
        }
    }

    @Override // N.i
    public final Object b(ByteBuffer byteBuffer) {
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

    @Override // N.i
    public final ByteBuffer c(Object obj) {
        if (obj == null) {
            return null;
        }
        l lVar = new l();
        k(lVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lVar.size());
        allocateDirect.put(lVar.a(), 0, lVar.size());
        return allocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r0v11, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int[], java.io.Serializable] */
    public Serializable f(byte b2, ByteBuffer byteBuffer) {
        Serializable bigInteger;
        Charset charset = f352c;
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
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case 6:
                a(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case 8:
                ?? r0 = new byte[d(byteBuffer)];
                byteBuffer.get((byte[]) r0);
                return r0;
            case 9:
                int d2 = d(byteBuffer);
                ?? r02 = new int[d2];
                a(byteBuffer, 4);
                byteBuffer.asIntBuffer().get((int[]) r02);
                byteBuffer.position((d2 * 4) + byteBuffer.position());
                return r02;
            case 10:
                int d3 = d(byteBuffer);
                ?? r03 = new long[d3];
                a(byteBuffer, 8);
                byteBuffer.asLongBuffer().get((long[]) r03);
                byteBuffer.position((d3 * 8) + byteBuffer.position());
                return r03;
            case 11:
                int d4 = d(byteBuffer);
                ?? r04 = new double[d4];
                a(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get((double[]) r04);
                byteBuffer.position((d4 * 8) + byteBuffer.position());
                return r04;
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
                ?? r05 = new float[d7];
                a(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get((float[]) r05);
                byteBuffer.position((d7 * 4) + byteBuffer.position());
                return r05;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(l lVar, Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            lVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            lVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z2 = obj instanceof Number;
        Charset charset = f352c;
        if (z2) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                lVar.write(3);
                h(lVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                lVar.write(4);
                i(lVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                lVar.write(6);
                g(lVar, 8);
                i(lVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                lVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(lVar, bytes.length);
                lVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            lVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(lVar, bytes2.length);
            lVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            lVar.write(8);
            byte[] bArr = (byte[]) obj;
            j(lVar, bArr.length);
            lVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            lVar.write(9);
            int[] iArr = (int[]) obj;
            j(lVar, iArr.length);
            g(lVar, 4);
            int length = iArr.length;
            while (i2 < length) {
                h(lVar, iArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            lVar.write(10);
            long[] jArr = (long[]) obj;
            j(lVar, jArr.length);
            g(lVar, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                i(lVar, jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            lVar.write(11);
            double[] dArr = (double[]) obj;
            j(lVar, dArr.length);
            g(lVar, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                i(lVar, Double.doubleToLongBits(dArr[i2]));
                i2++;
            }
            return;
        }
        if (obj instanceof List) {
            lVar.write(12);
            List list = (List) obj;
            j(lVar, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(lVar, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            lVar.write(13);
            Map map = (Map) obj;
            j(lVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(lVar, entry.getKey());
                k(lVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        lVar.write(14);
        float[] fArr = (float[]) obj;
        j(lVar, fArr.length);
        g(lVar, 4);
        int length4 = fArr.length;
        while (i2 < length4) {
            h(lVar, Float.floatToIntBits(fArr[i2]));
            i2++;
        }
    }
}
