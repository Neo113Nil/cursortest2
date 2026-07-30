package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class jk3 extends y93 implements IInterface {
    public final int h;

    public jk3(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        ll3.p(bArr.length == 25);
        this.h = Arrays.hashCode(bArr);
    }

    public static byte[] J(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.y93
    public final boolean H(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b01 I = I();
            parcel2.writeNoException();
            wd3.c(parcel2, I);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.h);
        return true;
    }

    public final b01 I() {
        return new st1(K());
    }

    public abstract byte[] K();

    public final boolean equals(Object obj) {
        b01 I;
        if (obj != null && (obj instanceof jk3)) {
            try {
                jk3 jk3Var = (jk3) obj;
                if (jk3Var.h == this.h && (I = jk3Var.I()) != null) {
                    return Arrays.equals(K(), (byte[]) st1.J(I));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.h;
    }
}
