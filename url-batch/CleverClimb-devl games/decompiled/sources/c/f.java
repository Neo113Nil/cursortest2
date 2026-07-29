package c;

import com.umeng.commonsdk.proguard.ao;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f2189a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final f f2190b = a(new byte[0]);

    /* renamed from: c, reason: collision with root package name */
    final byte[] f2191c;

    /* renamed from: d, reason: collision with root package name */
    transient int f2192d;
    transient String e;

    f(byte[] bArr) {
        this.f2191c = bArr;
    }

    public static f a(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new f((byte[]) bArr.clone());
    }

    public static f a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(t.f2226a));
        fVar.e = str;
        return fVar;
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f2191c, t.f2226a);
        this.e = str2;
        return str2;
    }

    public String b() {
        return b.a(this.f2191c);
    }

    public f c() {
        return c("SHA-1");
    }

    public f d() {
        return c("SHA-256");
    }

    private f c(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f2191c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public String e() {
        char[] cArr = new char[this.f2191c.length * 2];
        int i = 0;
        for (byte b2 : this.f2191c) {
            int i2 = i + 1;
            cArr[i] = f2189a[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = f2189a[b2 & ao.m];
        }
        return new String(cArr);
    }

    public static f b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
        }
        return a(bArr);
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return (c2 - 'a') + 10;
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return (c2 - 'A') + 10;
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static f a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + i);
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
        return new f(bArr);
    }

    public f f() {
        for (int i = 0; i < this.f2191c.length; i++) {
            byte b2 = this.f2191c[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr = (byte[]) this.f2191c.clone();
                bArr[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr.length; i2++) {
                    byte b3 = bArr[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr[i2] = (byte) (b3 + 32);
                    }
                }
                return new f(bArr);
            }
        }
        return this;
    }

    public f a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (i2 > this.f2191c.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f2191c.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == this.f2191c.length) {
            return this;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2191c, i, bArr, 0, i3);
        return new f(bArr);
    }

    public byte a(int i) {
        return this.f2191c[i];
    }

    public int g() {
        return this.f2191c.length;
    }

    public byte[] h() {
        return (byte[]) this.f2191c.clone();
    }

    void a(c cVar) {
        cVar.c(this.f2191c, 0, this.f2191c.length);
    }

    public boolean a(int i, f fVar, int i2, int i3) {
        return fVar.a(i2, this.f2191c, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.f2191c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && t.a(this.f2191c, i, bArr, i2, i3);
    }

    public final boolean a(f fVar) {
        return a(0, fVar, 0, fVar.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.g() == this.f2191c.length && fVar.a(0, this.f2191c, 0, this.f2191c.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f2192d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f2191c);
        this.f2192d = hashCode;
        return hashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int g = g();
        int g2 = fVar.g();
        int min = Math.min(g, g2);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = fVar.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (g == g2) {
            return 0;
        }
        return g < g2 ? -1 : 1;
    }

    public String toString() {
        if (this.f2191c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int a3 = a(a2, 64);
        if (a3 == -1) {
            if (this.f2191c.length <= 64) {
                return "[hex=" + e() + "]";
            }
            return "[size=" + this.f2191c.length + " hex=" + a(0, 64).e() + "…]";
        }
        String replace = a2.substring(0, a3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a3 < a2.length()) {
            return "[size=" + this.f2191c.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
    }

    static int a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        f a2 = a(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = f.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, a2.f2191c);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f2191c.length);
        objectOutputStream.write(this.f2191c);
    }
}
