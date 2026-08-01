package z6;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c7.c0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o extends o7.g implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final int f10895e;

    public o(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        c0.b(bArr.length == 25);
        this.f10895e = Arrays.hashCode(bArr);
    }

    public static byte[] G(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // o7.g
    public final boolean D(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            j7.a F = F();
            parcel2.writeNoException();
            o7.h.b(parcel2, F);
            return true;
        }
        if (i3 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f10895e);
        return true;
    }

    public abstract byte[] E();

    public final j7.a F() {
        return new j7.b(E());
    }

    public final boolean equals(Object obj) {
        j7.a F;
        if (obj instanceof o) {
            try {
                o oVar = (o) obj;
                if (oVar.f10895e == this.f10895e && (F = oVar.F()) != null) {
                    return Arrays.equals(E(), (byte[]) j7.b.F(F));
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10895e;
    }
}
