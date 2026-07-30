package j4;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m extends u4.a implements m4.m {

    /* renamed from: d, reason: collision with root package name */
    public final int f5026d;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f5026d = Arrays.hashCode(bArr);
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // u4.a
    public final boolean e(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f5026d);
            return true;
        }
        s4.a aVar = new s4.a(g());
        parcel2.writeNoException();
        int i8 = v4.a.f9158a;
        parcel2.writeStrongBinder(aVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m4.m)) {
            try {
                m4.m mVar = (m4.m) obj;
                if (((m) mVar).f5026d == this.f5026d) {
                    return Arrays.equals(g(), (byte[]) new s4.a(((m) mVar).g()).f8528d);
                }
            } catch (RemoteException e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            }
        }
        return false;
    }

    public abstract byte[] g();

    public final int hashCode() {
        return this.f5026d;
    }
}
