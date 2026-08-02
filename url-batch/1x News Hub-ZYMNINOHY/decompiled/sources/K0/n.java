package K0;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n extends X0.a implements N0.p {

    /* renamed from: c, reason: collision with root package name */
    public final int f860c;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f860c = Arrays.hashCode(bArr);
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes(CharEncoding.ISO_8859_1);
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // X0.a
    public final boolean d(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f860c);
            return true;
        }
        T0.a aVar = new T0.a(g());
        parcel2.writeNoException();
        int i4 = X0.b.f1728a;
        parcel2.writeStrongBinder(aVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof N0.p)) {
            try {
                N0.p pVar = (N0.p) obj;
                if (((n) pVar).f860c == this.f860c) {
                    return Arrays.equals(g(), new T0.a(((n) pVar).g()).f1342c);
                }
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            }
        }
        return false;
    }

    public abstract byte[] g();

    public final int hashCode() {
        return this.f860c;
    }
}
