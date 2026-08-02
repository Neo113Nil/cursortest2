package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cqr extends bms implements cqs {
    private final int a;

    protected cqr(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        oy.al(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        return str.getBytes(StandardCharsets.ISO_8859_1);
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            csu d = d();
            parcel2.writeNoException();
            bmt.d(parcel2, d);
        } else {
            if (i != 2) {
                return false;
            }
            int i2 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        }
        return true;
    }

    @Override // defpackage.cqs
    public final int c() {
        return this.a;
    }

    @Override // defpackage.cqs
    public final csu d() {
        return new cst(z());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cqs)) {
            return false;
        }
        try {
            cqs cqsVar = (cqs) obj;
            if (cqsVar.c() != this.a) {
                return false;
            }
            return Arrays.equals(z(), (byte[]) cst.b(cqsVar.d()));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] z();
}
