package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.ServerProtocol;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mk0 extends i1 {
    public static final Parcelable.Creator<mk0> CREATOR = new va3(13);
    public final String m;
    public final int n;
    public final long o;

    public mk0() {
        this.m = "CLIENT_TELEMETRY";
        this.o = 1L;
        this.n = -1;
    }

    public final long a() {
        long j = this.o;
        return j == -1 ? this.n : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mk0) {
            mk0 mk0Var = (mk0) obj;
            String str = mk0Var.m;
            String str2 = this.m;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && a() == mk0Var.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, Long.valueOf(a())});
    }

    public final String toString() {
        tt1 tt1Var = new tt1(this);
        tt1Var.k(this.m, "name");
        tt1Var.k(Long.valueOf(a()), ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
        return tt1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.W(parcel, 1, this.m);
        yk3.d0(parcel, 2, 4);
        parcel.writeInt(this.n);
        long a = a();
        yk3.d0(parcel, 3, 8);
        parcel.writeLong(a);
        yk3.c0(parcel, b0);
    }

    public mk0(String str, int i, long j) {
        this.m = str;
        this.n = i;
        this.o = j;
    }
}
