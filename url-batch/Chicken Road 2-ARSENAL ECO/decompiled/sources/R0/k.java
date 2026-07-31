package R0;

import U0.r;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b1.BinderC0264a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class k extends e1.a implements r {

    /* renamed from: d, reason: collision with root package name */
    public final int f2074d;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f2074d = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // e1.a
    public final boolean b(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f2074d);
            return true;
        }
        BinderC0264a binderC0264a = new BinderC0264a(d());
        parcel2.writeNoException();
        int i8 = e1.b.f4005a;
        parcel2.writeStrongBinder(binderC0264a);
        return true;
    }

    public abstract byte[] d();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof r)) {
            try {
                r rVar = (r) obj;
                if (((k) rVar).f2074d == this.f2074d) {
                    return Arrays.equals(d(), (byte[]) new BinderC0264a(((k) rVar).d()).f3606d);
                }
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2074d;
    }
}
