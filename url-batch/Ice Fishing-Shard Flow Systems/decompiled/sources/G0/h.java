package G0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f808b = s.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final h f809c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f810a;

    static {
        h hVar = new h(new HashMap());
        c(hVar);
        f809c = hVar;
    }

    public h(h hVar) {
        this.f810a = new HashMap(hVar.f810a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(7:4|5|6|7|(2:9|10)|12|13)|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        android.util.Log.e(r1, "Error in Data#fromByteArray: ", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h a(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e7;
        String str = f808b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e8) {
                        Log.e(str, "Error in Data#fromByteArray: ", e8);
                    }
                } catch (IOException e9) {
                    e7 = e9;
                    Log.e(str, "Error in Data#fromByteArray: ", e7);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e10) {
                            Log.e(str, "Error in Data#fromByteArray: ", e10);
                        }
                    }
                    byteArrayInputStream.close();
                    return new h(hashMap);
                } catch (ClassNotFoundException e11) {
                    e7 = e11;
                    Log.e(str, "Error in Data#fromByteArray: ", e7);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new h(hashMap);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e12) {
                        Log.e(str, "Error in Data#fromByteArray: ", e12);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e13) {
                    Log.e(str, "Error in Data#fromByteArray: ", e13);
                    throw th;
                }
            }
        } catch (IOException e14) {
            e = e14;
            Throwable th3 = e;
            objectInputStream = null;
            e7 = th3;
            Log.e(str, "Error in Data#fromByteArray: ", e7);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new h(hashMap);
        } catch (ClassNotFoundException e15) {
            e = e15;
            Throwable th32 = e;
            objectInputStream = null;
            e7 = th32;
            Log.e(str, "Error in Data#fromByteArray: ", e7);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new h(hashMap);
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        byteArrayInputStream.close();
        return new h(hashMap);
    }

    public static byte[] c(h hVar) {
        ObjectOutputStream objectOutputStream;
        String str = f808b;
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
            objectOutputStream.writeInt(hVar.f810a.size());
            for (Map.Entry entry : hVar.f810a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e8) {
                Log.e(str, "Error in Data#toByteArray: ", e8);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(str, "Error in Data#toByteArray: ", e9);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e10) {
            e = e10;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e11) {
                    Log.e(str, "Error in Data#toByteArray: ", e11);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(str, "Error in Data#toByteArray: ", e12);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e13) {
                    Log.e(str, "Error in Data#toByteArray: ", e13);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e14) {
                Log.e(str, "Error in Data#toByteArray: ", e14);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f810a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h.class == obj.getClass()) {
                HashMap hashMap = ((h) obj).f810a;
                HashMap hashMap2 = this.f810a;
                Set<String> keySet = hashMap2.keySet();
                if (keySet.equals(hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f810a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f810a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
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

    public h(HashMap hashMap) {
        this.f810a = new HashMap(hashMap);
    }
}
