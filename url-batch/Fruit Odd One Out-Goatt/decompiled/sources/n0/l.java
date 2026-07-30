package n0;

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

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final l f933a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f934b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f935c;

    static {
        f934b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f935c = Charset.forName("UTF8");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [float[], java.io.Serializable] */
    public static Serializable e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        byte b2 = byteBuffer.get();
        Charset charset = f935c;
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
                return new BigInteger(new String(bArr, charset), 16);
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                return new String(bArr2, charset);
            case 8:
                ?? r02 = new byte[d(byteBuffer)];
                byteBuffer.get((byte[]) r02);
                return r02;
            case 9:
                int d2 = d(byteBuffer);
                ?? r1 = new int[d2];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get((int[]) r1);
                byteBuffer.position((d2 * 4) + byteBuffer.position());
                return r1;
            case 10:
                int d3 = d(byteBuffer);
                ?? r12 = new long[d3];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get((long[]) r12);
                byteBuffer.position((d3 * 8) + byteBuffer.position());
                return r12;
            case 11:
                int d4 = d(byteBuffer);
                ?? r13 = new double[d4];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get((double[]) r13);
                byteBuffer.position((d4 * 8) + byteBuffer.position());
                return r13;
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
                ?? r14 = new float[d7];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get((float[]) r14);
                byteBuffer.position((d7 * 4) + byteBuffer.position());
                return r14;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public static void f(k kVar, int i2) {
        int size = kVar.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                kVar.write(0);
            }
        }
    }

    public static void g(k kVar, int i2) {
        if (f934b) {
            kVar.write(i2);
            kVar.write(i2 >>> 8);
            kVar.write(i2 >>> 16);
            kVar.write(i2 >>> 24);
            return;
        }
        kVar.write(i2 >>> 24);
        kVar.write(i2 >>> 16);
        kVar.write(i2 >>> 8);
        kVar.write(i2);
    }

    public static void h(k kVar, long j2) {
        if (f934b) {
            kVar.write((byte) j2);
            kVar.write((byte) (j2 >>> 8));
            kVar.write((byte) (j2 >>> 16));
            kVar.write((byte) (j2 >>> 24));
            kVar.write((byte) (j2 >>> 32));
            kVar.write((byte) (j2 >>> 40));
            kVar.write((byte) (j2 >>> 48));
            kVar.write((byte) (j2 >>> 56));
            return;
        }
        kVar.write((byte) (j2 >>> 56));
        kVar.write((byte) (j2 >>> 48));
        kVar.write((byte) (j2 >>> 40));
        kVar.write((byte) (j2 >>> 32));
        kVar.write((byte) (j2 >>> 24));
        kVar.write((byte) (j2 >>> 16));
        kVar.write((byte) (j2 >>> 8));
        kVar.write((byte) j2);
    }

    public static void i(k kVar, int i2) {
        if (i2 < 254) {
            kVar.write(i2);
            return;
        }
        if (i2 > 65535) {
            kVar.write(255);
            g(kVar, i2);
            return;
        }
        kVar.write(254);
        if (f934b) {
            kVar.write(i2);
            kVar.write(i2 >>> 8);
        } else {
            kVar.write(i2 >>> 8);
            kVar.write(i2);
        }
    }

    public static void j(k kVar, Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            kVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            kVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z2 = obj instanceof Number;
        Charset charset = f935c;
        if (z2) {
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
                f(kVar, 8);
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
            f(kVar, 4);
            int length = iArr.length;
            while (i2 < length) {
                g(kVar, iArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            kVar.write(10);
            long[] jArr = (long[]) obj;
            i(kVar, jArr.length);
            f(kVar, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                h(kVar, jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            kVar.write(11);
            double[] dArr = (double[]) obj;
            i(kVar, dArr.length);
            f(kVar, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                h(kVar, Double.doubleToLongBits(dArr[i2]));
                i2++;
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
            StringBuilder sb = new StringBuilder("Unsupported value: '");
            sb.append(obj);
            Class<?> cls = obj.getClass();
            sb.append("' of type '");
            sb.append(cls);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
        kVar.write(14);
        float[] fArr = (float[]) obj;
        i(kVar, fArr.length);
        f(kVar, 4);
        int length4 = fArr.length;
        while (i2 < length4) {
            g(kVar, Float.floatToIntBits(fArr[i2]));
            i2++;
        }
    }

    @Override // n0.h
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Serializable e2 = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return e2;
    }

    @Override // n0.h
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
}
