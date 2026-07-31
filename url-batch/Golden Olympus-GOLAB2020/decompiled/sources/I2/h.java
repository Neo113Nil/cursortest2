package I2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f785a;

    public h(OutputStream outputStream) {
        this.f785a = outputStream;
    }

    h a() {
        return new n(this.f785a);
    }

    void b(int i4) {
        this.f785a.write(i4);
    }

    void c(byte[] bArr) {
        this.f785a.write(bArr);
    }

    void d(int i4, byte[] bArr) {
        b(i4);
        e(bArr.length);
        c(bArr);
    }

    void e(int i4) {
        if (i4 <= 127) {
            b((byte) i4);
            return;
        }
        int i5 = i4;
        int i6 = 1;
        while (true) {
            i5 >>>= 8;
            if (i5 == 0) {
                break;
            } else {
                i6++;
            }
        }
        b((byte) (i6 | UserVerificationMethods.USER_VERIFY_PATTERN));
        for (int i7 = (i6 - 1) * 8; i7 >= 0; i7 -= 8) {
            b((byte) (i4 >> i7));
        }
    }

    public void f(b bVar) {
        if (bVar == null) {
            throw new IOException("null object detected");
        }
        bVar.b().e(this);
    }
}
