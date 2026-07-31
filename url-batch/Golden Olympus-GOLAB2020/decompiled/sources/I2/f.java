package I2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public class f extends j {

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f781d = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final String f782b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f783c;

    public f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        if (m(str)) {
            this.f782b = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    private void i(ByteArrayOutputStream byteArrayOutputStream) {
        p pVar = new p(this.f782b);
        int parseInt = Integer.parseInt(pVar.b()) * 40;
        String b4 = pVar.b();
        if (b4.length() <= 18) {
            n(byteArrayOutputStream, parseInt + Long.parseLong(b4));
        } else {
            o(byteArrayOutputStream, new BigInteger(b4).add(BigInteger.valueOf(parseInt)));
        }
        while (pVar.a()) {
            String b5 = pVar.b();
            if (b5.length() <= 18) {
                n(byteArrayOutputStream, Long.parseLong(b5));
            } else {
                o(byteArrayOutputStream, new BigInteger(b5));
            }
        }
    }

    private synchronized byte[] j() {
        try {
            if (this.f783c == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                i(byteArrayOutputStream);
                this.f783c = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f783c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r3 != '.') goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean l(String str, int i4) {
        boolean z4;
        int length = str.length();
        do {
            z4 = false;
            while (true) {
                length--;
                if (length < i4) {
                    return z4;
                }
                char charAt = str.charAt(length);
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                z4 = true;
            }
        } while (z4);
        return false;
    }

    private static boolean m(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return l(str, 2);
    }

    private void n(ByteArrayOutputStream byteArrayOutputStream, long j4) {
        byte[] bArr = new byte[9];
        int i4 = 8;
        bArr[8] = (byte) (((int) j4) & 127);
        while (j4 >= 128) {
            j4 >>= 7;
            i4--;
            bArr[i4] = (byte) ((((int) j4) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        byteArrayOutputStream.write(bArr, i4, 9 - i4);
    }

    private void o(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i4 = bitLength - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            bArr[i5] = (byte) ((bigInteger.intValue() & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i4] = (byte) (bArr[i4] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // I2.j
    boolean d(j jVar) {
        if (jVar == this) {
            return true;
        }
        if (jVar instanceof f) {
            return this.f782b.equals(((f) jVar).f782b);
        }
        return false;
    }

    @Override // I2.j
    void e(h hVar) {
        byte[] j4 = j();
        hVar.b(6);
        hVar.e(j4.length);
        hVar.c(j4);
    }

    @Override // I2.j
    int f() {
        int length = j().length;
        return q.a(length) + 1 + length;
    }

    public f h(String str) {
        return new f(this, str);
    }

    @Override // I2.j, I2.e
    public int hashCode() {
        return this.f782b.hashCode();
    }

    public String k() {
        return this.f782b;
    }

    public String toString() {
        return k();
    }

    f(f fVar, String str) {
        if (l(str, 0)) {
            this.f782b = fVar.k() + "." + str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID branch");
    }
}
