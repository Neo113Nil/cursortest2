package l1;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import o1.s;
import v1.BinderC1495a;

/* loaded from: classes.dex */
public abstract class n extends A1.a implements s {

    /* renamed from: e, reason: collision with root package name */
    public final int f11024e;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f11024e = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // A1.a
    public final boolean b(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            BinderC1495a binderC1495a = new BinderC1495a(f());
            parcel2.writeNoException();
            int i3 = A1.b.f28a;
            parcel2.writeStrongBinder(binderC1495a);
        } else {
            if (i2 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f11024e);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            try {
                s sVar = (s) obj;
                if (((n) sVar).f11024e != this.f11024e) {
                    return false;
                }
                return Arrays.equals(f(), new BinderC1495a(((n) sVar).f()).f12093e);
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.f11024e;
    }
}
