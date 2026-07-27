package E1;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n extends P1.a implements H1.m {

    /* renamed from: b, reason: collision with root package name */
    public final int f2303b;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f2303b = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // P1.a
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            N1.a aVar = new N1.a(f());
            parcel2.writeNoException();
            int i4 = Q1.a.f3939a;
            parcel2.writeStrongBinder(aVar);
        } else {
            if (i2 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f2303b);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof H1.m)) {
            try {
                H1.m mVar = (H1.m) obj;
                if (((n) mVar).f2303b != this.f2303b) {
                    return false;
                }
                return Arrays.equals(f(), new N1.a(((n) mVar).f()).f3618b);
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.f2303b;
    }
}
