package q1;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import t1.InterfaceC0913J;

/* loaded from: classes.dex */
public abstract class l extends E1.g implements InterfaceC0913J {

    /* renamed from: f, reason: collision with root package name */
    public final int f7343f;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f7343f = Arrays.hashCode(bArr);
    }

    public static byte[] d(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // E1.g
    public final boolean b(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f7343f);
            return true;
        }
        A1.a aVar = new A1.a(c());
        parcel2.writeNoException();
        int i5 = E1.h.f671a;
        parcel2.writeStrongBinder(aVar);
        return true;
    }

    public abstract byte[] c();

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC0913J) {
            try {
                InterfaceC0913J interfaceC0913J = (InterfaceC0913J) obj;
                if (((l) interfaceC0913J).f7343f == this.f7343f) {
                    return Arrays.equals(c(), (byte[]) new A1.a(((l) interfaceC0913J).c()).f86f);
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7343f;
    }
}
