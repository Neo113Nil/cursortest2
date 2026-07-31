package o3;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import r3.i1;
import r3.j1;

/* loaded from: classes.dex */
abstract class v extends i1 {

    /* renamed from: f, reason: collision with root package name */
    private final int f19872f;

    protected v(byte[] bArr) {
        r3.o.a(bArr.length == 25);
        this.f19872f = Arrays.hashCode(bArr);
    }

    protected static byte[] O0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // r3.j1
    public final int b() {
        return this.f19872f;
    }

    public final boolean equals(Object obj) {
        x3.a g7;
        if (obj != null && (obj instanceof j1)) {
            try {
                j1 j1Var = (j1) obj;
                if (j1Var.b() == this.f19872f && (g7 = j1Var.g()) != null) {
                    return Arrays.equals(q0(), (byte[]) x3.b.O0(g7));
                }
                return false;
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    @Override // r3.j1
    public final x3.a g() {
        return x3.b.B3(q0());
    }

    public final int hashCode() {
        return this.f19872f;
    }

    abstract byte[] q0();
}
