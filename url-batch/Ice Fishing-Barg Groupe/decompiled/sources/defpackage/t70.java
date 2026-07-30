package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t70 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<t70> CREATOR = new BUo4iHFctTZi(18);
    public final int OPXfSBeufaJ8;
    public final String rtx2ld2ELZv4;
    public final long wdg6QnbFHrFF;

    public t70() {
        this.rtx2ld2ELZv4 = "CLIENT_TELEMETRY";
        this.wdg6QnbFHrFF = 1L;
        this.OPXfSBeufaJ8 = -1;
    }

    public final long PxuCJdSBwIXG() {
        long j = this.wdg6QnbFHrFF;
        return j == -1 ? this.OPXfSBeufaJ8 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t70) {
            t70 t70Var = (t70) obj;
            String str = t70Var.rtx2ld2ELZv4;
            String str2 = this.rtx2ld2ELZv4;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && PxuCJdSBwIXG() == t70Var.PxuCJdSBwIXG()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.rtx2ld2ELZv4, Long.valueOf(PxuCJdSBwIXG())});
    }

    public final String toString() {
        op0 op0Var = new op0(this);
        op0Var.wdg6QnbFHrFF(this.rtx2ld2ELZv4, "name");
        op0Var.wdg6QnbFHrFF(Long.valueOf(PxuCJdSBwIXG()), "version");
        return op0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.KUoIVIumpKat(parcel, 1, this.rtx2ld2ELZv4);
        ki0.JTxCbbCwomzt(parcel, 2, 4);
        parcel.writeInt(this.OPXfSBeufaJ8);
        long PxuCJdSBwIXG = PxuCJdSBwIXG();
        ki0.JTxCbbCwomzt(parcel, 3, 8);
        parcel.writeLong(PxuCJdSBwIXG);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }

    public t70(int i, long j, String str) {
        this.rtx2ld2ELZv4 = str;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = j;
    }
}
