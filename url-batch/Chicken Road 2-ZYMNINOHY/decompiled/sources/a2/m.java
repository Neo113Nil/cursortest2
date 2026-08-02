package a2;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractBinderC0310e;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import d2.q;
import j2.BinderC1175a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import n2.AbstractC1320a;

/* loaded from: classes.dex */
public abstract class m extends AbstractBinderC0310e implements q {

    /* renamed from: b, reason: collision with root package name */
    public final int f4290b;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f4290b = Arrays.hashCode(bArr);
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes(CharEncoding.ISO_8859_1);
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC0310e
    public final boolean d(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f4290b);
            return true;
        }
        BinderC1175a binderC1175a = new BinderC1175a(g());
        parcel2.writeNoException();
        int i5 = AbstractC1320a.f14587a;
        parcel2.writeStrongBinder(binderC1175a);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q)) {
            try {
                q qVar = (q) obj;
                if (((m) qVar).f4290b == this.f4290b) {
                    return Arrays.equals(g(), (byte[]) new BinderC1175a(((m) qVar).g()).f13896b);
                }
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public abstract byte[] g();

    public final int hashCode() {
        return this.f4290b;
    }
}
