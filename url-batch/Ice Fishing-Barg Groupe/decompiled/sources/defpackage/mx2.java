package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class mx2 extends sv2 implements IInterface {
    public final int Y1f8riQaR6yg;

    public mx2(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.Y1f8riQaR6yg = Arrays.hashCode(bArr);
    }

    public static byte[] a92UlCVFR9N8(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] RAsUl2FVSrh6();

    @Override // defpackage.sv2
    public final boolean e9gEMXR7LXtO(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.Y1f8riQaR6yg);
            return true;
        }
        se1 se1Var = new se1(RAsUl2FVSrh6());
        parcel2.writeNoException();
        int i2 = bx2.PxuCJdSBwIXG;
        parcel2.writeStrongBinder(se1Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof mx2)) {
            try {
                mx2 mx2Var = (mx2) obj;
                if (mx2Var.Y1f8riQaR6yg == this.Y1f8riQaR6yg) {
                    return Arrays.equals(RAsUl2FVSrh6(), (byte[]) new se1(mx2Var.RAsUl2FVSrh6()).Y1f8riQaR6yg);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.Y1f8riQaR6yg;
    }
}
