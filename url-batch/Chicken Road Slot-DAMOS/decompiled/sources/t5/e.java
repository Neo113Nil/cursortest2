package t5;

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
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9300b = o.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final e f9301c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9302a;

    static {
        e eVar = new e(new HashMap());
        c(eVar);
        f9301c = eVar;
    }

    public e(e eVar) {
        this.f9302a = new HashMap(eVar.f9302a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e2;
        String str = f9300b;
        if (bArr.length > 10240) {
            i0.l("Data cannot occupy more than 10240 bytes when serialized");
            return null;
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
                } catch (IOException e9) {
                    e2 = e9;
                    Log.e(str, "Error in Data#fromByteArray: ", e2);
                } catch (ClassNotFoundException e10) {
                    e2 = e10;
                    Log.e(str, "Error in Data#fromByteArray: ", e2);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e11) {
                        Log.e(str, "Error in Data#fromByteArray: ", e11);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e12) {
                    Log.e(str, "Error in Data#fromByteArray: ", e12);
                    throw th;
                }
            }
        } catch (IOException e13) {
            e = e13;
            Throwable th3 = e;
            objectInputStream = null;
            e2 = th3;
            Log.e(str, "Error in Data#fromByteArray: ", e2);
        } catch (ClassNotFoundException e14) {
            e = e14;
            Throwable th32 = e;
            objectInputStream = null;
            e2 = th32;
            Log.e(str, "Error in Data#fromByteArray: ", e2);
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        try {
            objectInputStream.close();
        } catch (IOException e15) {
            Log.e(str, "Error in Data#fromByteArray: ", e15);
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e16) {
            Log.e(str, "Error in Data#fromByteArray: ", e16);
        }
        return new e(hashMap);
    }

    public static byte[] c(e eVar) {
        ObjectOutputStream objectOutputStream;
        String str = f9300b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            objectOutputStream.writeInt(eVar.f9302a.size());
            for (Map.Entry entry : eVar.f9302a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e9) {
                Log.e(str, "Error in Data#toByteArray: ", e9);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e10) {
                Log.e(str, "Error in Data#toByteArray: ", e10);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            i0.l("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        } catch (IOException e11) {
            e = e11;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e12) {
                    Log.e(str, "Error in Data#toByteArray: ", e12);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e13) {
                Log.e(str, "Error in Data#toByteArray: ", e13);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(str, "Error in Data#toByteArray: ", e14);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e15) {
                Log.e(str, "Error in Data#toByteArray: ", e15);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f9302a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                HashMap hashMap = ((e) obj).f9302a;
                HashMap hashMap2 = this.f9302a;
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
        return this.f9302a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap hashMap = this.f9302a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public e(HashMap hashMap) {
        this.f9302a = new HashMap(hashMap);
    }
}
