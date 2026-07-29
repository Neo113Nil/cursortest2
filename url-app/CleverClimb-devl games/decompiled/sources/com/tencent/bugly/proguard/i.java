package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f8746a;

    /* renamed from: b, reason: collision with root package name */
    private String f8747b = "GBK";

    /* compiled from: BUGLY */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte f8748a;

        /* renamed from: b, reason: collision with root package name */
        public int f8749b;
    }

    public i() {
    }

    public i(byte[] bArr) {
        this.f8746a = ByteBuffer.wrap(bArr);
    }

    public i(byte[] bArr, int i) {
        this.f8746a = ByteBuffer.wrap(bArr);
        this.f8746a.position(4);
    }

    public final void a(byte[] bArr) {
        if (this.f8746a != null) {
            this.f8746a.clear();
        }
        this.f8746a = ByteBuffer.wrap(bArr);
    }

    private static int a(a aVar, ByteBuffer byteBuffer) {
        byte b2 = byteBuffer.get();
        aVar.f8748a = (byte) (b2 & com.umeng.commonsdk.proguard.ao.m);
        aVar.f8749b = (b2 & 240) >> 4;
        if (aVar.f8749b != 15) {
            return 1;
        }
        aVar.f8749b = byteBuffer.get();
        return 2;
    }

    private boolean a(int i) {
        try {
            a aVar = new a();
            while (true) {
                int a2 = a(aVar, this.f8746a.duplicate());
                if (i <= aVar.f8749b || aVar.f8748a == 11) {
                    break;
                }
                this.f8746a.position(this.f8746a.position() + a2);
                a(aVar.f8748a);
            }
            return i == aVar.f8749b;
        } catch (g | BufferUnderflowException unused) {
            return false;
        }
    }

    private void a() {
        a aVar = new a();
        do {
            a(aVar, this.f8746a);
            a(aVar.f8748a);
        } while (aVar.f8748a != 11);
    }

    private void a(byte b2) {
        int i = 0;
        switch (b2) {
            case 0:
                this.f8746a.position(this.f8746a.position() + 1);
                return;
            case 1:
                this.f8746a.position(this.f8746a.position() + 2);
                return;
            case 2:
                this.f8746a.position(this.f8746a.position() + 4);
                return;
            case 3:
                this.f8746a.position(this.f8746a.position() + 8);
                return;
            case 4:
                this.f8746a.position(this.f8746a.position() + 4);
                return;
            case 5:
                this.f8746a.position(this.f8746a.position() + 8);
                return;
            case 6:
                int i2 = this.f8746a.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                this.f8746a.position(this.f8746a.position() + i2);
                return;
            case 7:
                this.f8746a.position(this.f8746a.position() + this.f8746a.getInt());
                return;
            case 8:
                int a2 = a(0, 0, true);
                while (i < (a2 << 1)) {
                    a aVar = new a();
                    a(aVar, this.f8746a);
                    a(aVar.f8748a);
                    i++;
                }
                return;
            case 9:
                int a3 = a(0, 0, true);
                while (i < a3) {
                    a aVar2 = new a();
                    a(aVar2, this.f8746a);
                    a(aVar2.f8748a);
                    i++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar3 = new a();
                a(aVar3, this.f8746a);
                if (aVar3.f8748a != 0) {
                    throw new g("skipField with invalid type, type value: " + ((int) b2) + ", " + ((int) aVar3.f8748a));
                }
                this.f8746a.position(this.f8746a.position() + a(0, 0, true));
                return;
            default:
                throw new g("invalid type.");
        }
    }

    public final boolean a(int i, boolean z) {
        return a((byte) 0, i, z) != 0;
    }

    public final byte a(byte b2, int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return b2;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        byte b3 = aVar.f8748a;
        if (b3 == 0) {
            return this.f8746a.get();
        }
        if (b3 == 12) {
            return (byte) 0;
        }
        throw new g("type mismatch.");
    }

    public final short a(short s, int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return s;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        byte b2 = aVar.f8748a;
        if (b2 == 12) {
            return (short) 0;
        }
        switch (b2) {
            case 0:
                return this.f8746a.get();
            case 1:
                return this.f8746a.getShort();
            default:
                throw new g("type mismatch.");
        }
    }

    public final int a(int i, int i2, boolean z) {
        if (!a(i2)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return i;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        byte b2 = aVar.f8748a;
        if (b2 == 12) {
            return 0;
        }
        switch (b2) {
            case 0:
                return this.f8746a.get();
            case 1:
                return this.f8746a.getShort();
            case 2:
                return this.f8746a.getInt();
            default:
                throw new g("type mismatch.");
        }
    }

    public final long a(long j, int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return j;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        byte b2 = aVar.f8748a;
        if (b2 == 12) {
            return 0L;
        }
        switch (b2) {
            case 0:
                return this.f8746a.get();
            case 1:
                return this.f8746a.getShort();
            case 2:
                return this.f8746a.getInt();
            case 3:
                return this.f8746a.getLong();
            default:
                throw new g("type mismatch.");
        }
    }

    private float a(float f, int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return f;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        byte b2 = aVar.f8748a;
        if (b2 == 4) {
            return this.f8746a.getFloat();
        }
        if (b2 == 12) {
            return 0.0f;
        }
        throw new g("type mismatch.");
    }

    private double a(double d2, int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return d2;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        byte b2 = aVar.f8748a;
        if (b2 == 12) {
            return 0.0d;
        }
        switch (b2) {
            case 4:
                return this.f8746a.getFloat();
            case 5:
                return this.f8746a.getDouble();
            default:
                throw new g("type mismatch.");
        }
    }

    public final String b(int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        switch (aVar.f8748a) {
            case 6:
                int i2 = this.f8746a.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                byte[] bArr = new byte[i2];
                this.f8746a.get(bArr);
                try {
                    return new String(bArr, this.f8747b);
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr);
                }
            case 7:
                int i3 = this.f8746a.getInt();
                if (i3 > 104857600 || i3 < 0) {
                    throw new g("String too long: " + i3);
                }
                byte[] bArr2 = new byte[i3];
                this.f8746a.get(bArr2);
                try {
                    return new String(bArr2, this.f8747b);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            default:
                throw new g("type mismatch.");
        }
    }

    public final <K, V> HashMap<K, V> a(Map<K, V> map, int i, boolean z) {
        return (HashMap) a(new HashMap(), map, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i, boolean z) {
        if (map2 == null || map2.isEmpty()) {
            return new HashMap();
        }
        Map.Entry<K, V> next = map2.entrySet().iterator().next();
        K key = next.getKey();
        V value = next.getValue();
        if (a(i)) {
            a aVar = new a();
            a(aVar, this.f8746a);
            if (aVar.f8748a == 8) {
                int a2 = a(0, 0, true);
                if (a2 < 0) {
                    throw new g("size invalid: " + a2);
                }
                for (int i2 = 0; i2 < a2; i2++) {
                    map.put(a((i) key, 0, true), a((i) value, 1, true));
                }
            } else {
                throw new g("type mismatch.");
            }
        } else if (z) {
            throw new g("require field not exist.");
        }
        return map;
    }

    private boolean[] d(int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        if (aVar.f8748a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new g("size invalid: " + a2);
            }
            boolean[] zArr = new boolean[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                zArr[i2] = a((byte) 0, 0, true) != 0;
            }
            return zArr;
        }
        throw new g("type mismatch.");
    }

    public final byte[] c(int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        byte b2 = aVar.f8748a;
        if (b2 == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new g("size invalid: " + a2);
            }
            byte[] bArr = new byte[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                bArr[i2] = a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b2 == 13) {
            a aVar2 = new a();
            a(aVar2, this.f8746a);
            if (aVar2.f8748a != 0) {
                throw new g("type mismatch, tag: " + i + ", type: " + ((int) aVar.f8748a) + ", " + ((int) aVar2.f8748a));
            }
            int a3 = a(0, 0, true);
            if (a3 < 0) {
                throw new g("invalid size, tag: " + i + ", type: " + ((int) aVar.f8748a) + ", " + ((int) aVar2.f8748a) + ", size: " + a3);
            }
            byte[] bArr2 = new byte[a3];
            this.f8746a.get(bArr2);
            return bArr2;
        }
        throw new g("type mismatch.");
    }

    private short[] e(int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        if (aVar.f8748a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new g("size invalid: " + a2);
            }
            short[] sArr = new short[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                sArr[i2] = a(sArr[0], 0, true);
            }
            return sArr;
        }
        throw new g("type mismatch.");
    }

    private int[] f(int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        if (aVar.f8748a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new g("size invalid: " + a2);
            }
            int[] iArr = new int[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                iArr[i2] = a(iArr[0], 0, true);
            }
            return iArr;
        }
        throw new g("type mismatch.");
    }

    private long[] g(int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        if (aVar.f8748a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new g("size invalid: " + a2);
            }
            long[] jArr = new long[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                jArr[i2] = a(jArr[0], 0, true);
            }
            return jArr;
        }
        throw new g("type mismatch.");
    }

    private float[] h(int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        if (aVar.f8748a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new g("size invalid: " + a2);
            }
            float[] fArr = new float[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                fArr[i2] = a(fArr[0], 0, true);
            }
            return fArr;
        }
        throw new g("type mismatch.");
    }

    private double[] i(int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        if (aVar.f8748a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new g("size invalid: " + a2);
            }
            double[] dArr = new double[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                dArr[i2] = a(dArr[0], 0, true);
            }
            return dArr;
        }
        throw new g("type mismatch.");
    }

    private <T> T[] a(T[] tArr, int i, boolean z) {
        if (tArr == null || tArr.length == 0) {
            throw new g("unable to get type of key and value.");
        }
        return (T[]) b(tArr[0], i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t, int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f8746a);
        if (aVar.f8748a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new g("size invalid: " + a2);
            }
            T[] tArr = (T[]) ((Object[]) Array.newInstance(t.getClass(), a2));
            for (int i2 = 0; i2 < a2; i2++) {
                tArr[i2] = a((i) t, 0, true);
            }
            return tArr;
        }
        throw new g("type mismatch.");
    }

    public final k a(k kVar, int i, boolean z) {
        if (!a(i)) {
            if (z) {
                throw new g("require field not exist.");
            }
            return null;
        }
        try {
            k kVar2 = (k) kVar.getClass().newInstance();
            a aVar = new a();
            a(aVar, this.f8746a);
            if (aVar.f8748a != 10) {
                throw new g("type mismatch.");
            }
            kVar2.a(this);
            a();
            return kVar2;
        } catch (Exception e) {
            throw new g(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Object a(T t, int i, boolean z) {
        if (t instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i, z));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(a((byte) 0, i, z) != 0);
        }
        if (t instanceof Short) {
            return Short.valueOf(a((short) 0, i, z));
        }
        if (t instanceof Integer) {
            return Integer.valueOf(a(0, i, z));
        }
        if (t instanceof Long) {
            return Long.valueOf(a(0L, i, z));
        }
        if (t instanceof Float) {
            return Float.valueOf(a(0.0f, i, z));
        }
        if (t instanceof Double) {
            return Double.valueOf(a(0.0d, i, z));
        }
        if (t instanceof String) {
            return String.valueOf(b(i, z));
        }
        if (t instanceof Map) {
            return (HashMap) a(new HashMap(), (Map) t, i, z);
        }
        if (t instanceof List) {
            List list = (List) t;
            if (list == null || list.isEmpty()) {
                return new ArrayList();
            }
            Object[] b2 = b(list.get(0), i, z);
            if (b2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : b2) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        if (t instanceof k) {
            return a((k) t, i, z);
        }
        if (t.getClass().isArray()) {
            if ((t instanceof byte[]) || (t instanceof Byte[])) {
                return c(i, z);
            }
            if (t instanceof boolean[]) {
                return d(i, z);
            }
            if (t instanceof short[]) {
                return e(i, z);
            }
            if (t instanceof int[]) {
                return f(i, z);
            }
            if (t instanceof long[]) {
                return g(i, z);
            }
            if (t instanceof float[]) {
                return h(i, z);
            }
            if (t instanceof double[]) {
                return i(i, z);
            }
            return a((Object[]) t, i, z);
        }
        throw new g("read object error: unsupport type.");
    }

    public final int a(String str) {
        this.f8747b = str;
        return 0;
    }
}
