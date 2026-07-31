package O3;

import com.onesignal.inAppMessages.internal.display.impl.a;
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
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final l f1771a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1772b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f1773c;

    static {
        f1772b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f1773c = Charset.forName("UTF8");
    }

    public static void a(ByteBuffer byteBuffer, int i7) {
        int position = byteBuffer.position() % i7;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i7) - position);
        }
    }

    public static int c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i7 = byteBuffer.get() & 255;
        return i7 < 254 ? i7 : i7 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [float[], java.io.Serializable] */
    public static Serializable d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        byte b7 = byteBuffer.get();
        Charset charset = f1773c;
        int i7 = 0;
        switch (b7) {
            case 0:
                return null;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Boolean.TRUE;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[c(byteBuffer)];
                byteBuffer.get(bArr);
                return new BigInteger(new String(bArr, charset), 16);
            case 6:
                a(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[c(byteBuffer)];
                byteBuffer.get(bArr2);
                return new String(bArr2, charset);
            case 8:
                ?? r02 = new byte[c(byteBuffer)];
                byteBuffer.get((byte[]) r02);
                return r02;
            case 9:
                int c7 = c(byteBuffer);
                ?? r12 = new int[c7];
                a(byteBuffer, 4);
                byteBuffer.asIntBuffer().get((int[]) r12);
                byteBuffer.position((c7 * 4) + byteBuffer.position());
                return r12;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                int c8 = c(byteBuffer);
                ?? r13 = new long[c8];
                a(byteBuffer, 8);
                byteBuffer.asLongBuffer().get((long[]) r13);
                byteBuffer.position((c8 * 8) + byteBuffer.position());
                return r13;
            case 11:
                int c9 = c(byteBuffer);
                ?? r14 = new double[c9];
                a(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get((double[]) r14);
                byteBuffer.position((c9 * 8) + byteBuffer.position());
                return r14;
            case 12:
                int c10 = c(byteBuffer);
                ArrayList arrayList = new ArrayList(c10);
                while (i7 < c10) {
                    arrayList.add(d(byteBuffer));
                    i7++;
                }
                return arrayList;
            case 13:
                int c11 = c(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i7 < c11) {
                    hashMap.put(d(byteBuffer), d(byteBuffer));
                    i7++;
                }
                return hashMap;
            case 14:
                int c12 = c(byteBuffer);
                ?? r15 = new float[c12];
                a(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get((float[]) r15);
                byteBuffer.position((c12 * 4) + byteBuffer.position());
                return r15;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public static void e(k kVar, int i7) {
        int size = kVar.size() % i7;
        if (size != 0) {
            for (int i8 = 0; i8 < i7 - size; i8++) {
                kVar.write(0);
            }
        }
    }

    public static void g(k kVar, int i7) {
        if (f1772b) {
            kVar.write(i7);
            kVar.write(i7 >>> 8);
            kVar.write(i7 >>> 16);
            kVar.write(i7 >>> 24);
            return;
        }
        kVar.write(i7 >>> 24);
        kVar.write(i7 >>> 16);
        kVar.write(i7 >>> 8);
        kVar.write(i7);
    }

    public static void h(k kVar, long j4) {
        if (f1772b) {
            kVar.write((byte) j4);
            kVar.write((byte) (j4 >>> 8));
            kVar.write((byte) (j4 >>> 16));
            kVar.write((byte) (j4 >>> 24));
            kVar.write((byte) (j4 >>> 32));
            kVar.write((byte) (j4 >>> 40));
            kVar.write((byte) (j4 >>> 48));
            kVar.write((byte) (j4 >>> 56));
            return;
        }
        kVar.write((byte) (j4 >>> 56));
        kVar.write((byte) (j4 >>> 48));
        kVar.write((byte) (j4 >>> 40));
        kVar.write((byte) (j4 >>> 32));
        kVar.write((byte) (j4 >>> 24));
        kVar.write((byte) (j4 >>> 16));
        kVar.write((byte) (j4 >>> 8));
        kVar.write((byte) j4);
    }

    public static void i(k kVar, int i7) {
        if (i7 < 254) {
            kVar.write(i7);
            return;
        }
        if (i7 > 65535) {
            kVar.write(255);
            g(kVar, i7);
            return;
        }
        kVar.write(254);
        if (f1772b) {
            kVar.write(i7);
            kVar.write(i7 >>> 8);
        } else {
            kVar.write(i7 >>> 8);
            kVar.write(i7);
        }
    }

    public static void j(k kVar, Object obj) {
        int i7 = 0;
        if (obj == null || obj.equals(null)) {
            kVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            kVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z5 = obj instanceof Number;
        Charset charset = f1773c;
        if (z5) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                kVar.write(3);
                g(kVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                kVar.write(4);
                h(kVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                kVar.write(6);
                e(kVar, 8);
                h(kVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                kVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                i(kVar, bytes.length);
                kVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            kVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            i(kVar, bytes2.length);
            kVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            kVar.write(8);
            byte[] bArr = (byte[]) obj;
            i(kVar, bArr.length);
            kVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            kVar.write(9);
            int[] iArr = (int[]) obj;
            i(kVar, iArr.length);
            e(kVar, 4);
            int length = iArr.length;
            while (i7 < length) {
                g(kVar, iArr[i7]);
                i7++;
            }
            return;
        }
        if (obj instanceof long[]) {
            kVar.write(10);
            long[] jArr = (long[]) obj;
            i(kVar, jArr.length);
            e(kVar, 8);
            int length2 = jArr.length;
            while (i7 < length2) {
                h(kVar, jArr[i7]);
                i7++;
            }
            return;
        }
        if (obj instanceof double[]) {
            kVar.write(11);
            double[] dArr = (double[]) obj;
            i(kVar, dArr.length);
            e(kVar, 8);
            int length3 = dArr.length;
            while (i7 < length3) {
                h(kVar, Double.doubleToLongBits(dArr[i7]));
                i7++;
            }
            return;
        }
        if (obj instanceof List) {
            kVar.write(12);
            List list = (List) obj;
            i(kVar, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j(kVar, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            kVar.write(13);
            Map map = (Map) obj;
            i(kVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                j(kVar, entry.getKey());
                j(kVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        kVar.write(14);
        float[] fArr = (float[]) obj;
        i(kVar, fArr.length);
        e(kVar, 4);
        int length4 = fArr.length;
        while (i7 < length4) {
            g(kVar, Float.floatToIntBits(fArr[i7]));
            i7++;
        }
    }

    @Override // O3.h
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        k kVar = new k();
        j(kVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(kVar.size());
        allocateDirect.put(kVar.a(), 0, kVar.size());
        return allocateDirect;
    }

    @Override // O3.h
    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Serializable d7 = d(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return d7;
    }
}
