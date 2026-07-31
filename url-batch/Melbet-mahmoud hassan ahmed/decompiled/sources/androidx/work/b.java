package androidx.work;

import android.util.Log;
import d0.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f1445b = j.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final b f1446c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    Map<String, Object> f1447a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, Object> f1448a = new HashMap();

        public b a() {
            b bVar = new b((Map<String, ?>) this.f1448a);
            b.k(bVar);
            return bVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f1448a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f1448a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f1448a.put(str, b.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f1448a.put(str, b.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f1448a.put(str, b.e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f1448a.put(str, b.f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f1448a.put(str, b.d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f1448a.put(str, b.c((double[]) obj));
                }
            }
            return this;
        }

        public a c(b bVar) {
            d(bVar.f1447a);
            return this;
        }

        public a d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, String str2) {
            this.f1448a.put(str, str2);
            return this;
        }
    }

    b() {
    }

    public b(b bVar) {
        this.f1447a = new HashMap(bVar.f1447a);
    }

    public b(Map<String, ?> map) {
        this.f1447a = new HashMap(map);
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i7 = 0; i7 < zArr.length; i7++) {
            boolArr[i7] = Boolean.valueOf(zArr[i7]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = Byte.valueOf(bArr[i7]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i7 = 0; i7 < dArr.length; i7++) {
            dArr2[i7] = Double.valueOf(dArr[i7]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr2[i7] = Float.valueOf(fArr[i7]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            numArr[i7] = Integer.valueOf(iArr[i7]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i7 = 0; i7 < jArr.length; i7++) {
            lArr[i7] = Long.valueOf(jArr[i7]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x005d -> B:16:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b g(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e7;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (IOException e8) {
            Log.e(f1445b, "Error in Data#fromByteArray: ", e8);
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e9) {
                        Log.e(f1445b, "Error in Data#fromByteArray: ", e9);
                    }
                    byteArrayInputStream.close();
                } catch (IOException e10) {
                    e7 = e10;
                    Log.e(f1445b, "Error in Data#fromByteArray: ", e7);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            Log.e(f1445b, "Error in Data#fromByteArray: ", e11);
                        }
                    }
                    byteArrayInputStream.close();
                    return new b(hashMap);
                } catch (ClassNotFoundException e12) {
                    e7 = e12;
                    Log.e(f1445b, "Error in Data#fromByteArray: ", e7);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new b(hashMap);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e13) {
                        Log.e(f1445b, "Error in Data#fromByteArray: ", e13);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e14) {
                    Log.e(f1445b, "Error in Data#fromByteArray: ", e14);
                    throw th;
                }
            }
        } catch (IOException e15) {
            e = e15;
            Throwable th3 = e;
            objectInputStream = null;
            e7 = th3;
            Log.e(f1445b, "Error in Data#fromByteArray: ", e7);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new b(hashMap);
        } catch (ClassNotFoundException e16) {
            e = e16;
            Throwable th32 = e;
            objectInputStream = null;
            e7 = th32;
            Log.e(f1445b, "Error in Data#fromByteArray: ", e7);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new b(hashMap);
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        return new b(hashMap);
    }

    public static byte[] k(b bVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e7) {
            e = e7;
        }
        try {
            objectOutputStream.writeInt(bVar.j());
            for (Map.Entry<String, Object> entry : bVar.f1447a.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e8) {
                Log.e(f1445b, "Error in Data#toByteArray: ", e8);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(f1445b, "Error in Data#toByteArray: ", e9);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e10) {
            e = e10;
            objectOutputStream2 = objectOutputStream;
            Log.e(f1445b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e11) {
                    Log.e(f1445b, "Error in Data#toByteArray: ", e11);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(f1445b, "Error in Data#toByteArray: ", e12);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e13) {
                    Log.e(f1445b, "Error in Data#toByteArray: ", e13);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e14) {
                Log.e(f1445b, "Error in Data#toByteArray: ", e14);
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> keySet = this.f1447a.keySet();
        if (!keySet.equals(bVar.f1447a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f1447a.get(str);
            Object obj3 = bVar.f1447a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public Map<String, Object> h() {
        return Collections.unmodifiableMap(this.f1447a);
    }

    public int hashCode() {
        return this.f1447a.hashCode() * 31;
    }

    public String i(String str) {
        Object obj = this.f1447a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int j() {
        return this.f1447a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f1447a.isEmpty()) {
            for (String str : this.f1447a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f1447a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
