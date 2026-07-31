package a3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class e implements InterfaceC1245b {

    /* renamed from: a, reason: collision with root package name */
    protected final byte[] f9772a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b, reason: collision with root package name */
    protected final byte[] f9773b = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];

    public e() {
        d();
    }

    private static boolean c(char c4) {
        return c4 == '\n' || c4 == '\r' || c4 == '\t' || c4 == ' ';
    }

    @Override // a3.InterfaceC1245b
    public int a(String str, OutputStream outputStream) {
        int length = str.length();
        while (length > 0 && c(str.charAt(length - 1))) {
            length--;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            while (i4 < length && c(str.charAt(i4))) {
                i4++;
            }
            int i6 = i4 + 1;
            byte b4 = this.f9773b[str.charAt(i4)];
            while (i6 < length && c(str.charAt(i6))) {
                i6++;
            }
            int i7 = i6 + 1;
            byte b5 = this.f9773b[str.charAt(i6)];
            if ((b4 | b5) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write((b4 << 4) | b5);
            i5++;
            i4 = i7;
        }
        return i5;
    }

    @Override // a3.InterfaceC1245b
    public int b(byte[] bArr, int i4, int i5, OutputStream outputStream) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            byte b4 = bArr[i6];
            outputStream.write(this.f9772a[(b4 & 255) >>> 4]);
            outputStream.write(this.f9772a[b4 & 15]);
        }
        return i5 * 2;
    }

    protected void d() {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            byte[] bArr = this.f9773b;
            if (i5 >= bArr.length) {
                break;
            }
            bArr[i5] = -1;
            i5++;
        }
        while (true) {
            byte[] bArr2 = this.f9772a;
            if (i4 >= bArr2.length) {
                byte[] bArr3 = this.f9773b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f9773b[bArr2[i4]] = (byte) i4;
            i4++;
        }
    }
}
