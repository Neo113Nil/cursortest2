package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ku1 extends nr1 implements IInterface {
    public final int c;

    public ku1(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.c = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.nr1
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.c);
            return true;
        }
        tq0 tq0Var = new tq0(f());
        parcel2.writeNoException();
        int i2 = ut1.a;
        parcel2.writeStrongBinder(tq0Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ku1)) {
            try {
                ku1 ku1Var = (ku1) obj;
                if (ku1Var.c == this.c) {
                    return Arrays.equals(f(), (byte[]) new tq0(ku1Var.f()).c);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.c;
    }
}
