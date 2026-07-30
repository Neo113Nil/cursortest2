package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ee2 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<ee2> CREATOR = new BUo4iHFctTZi(6);
    public List OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;

    public ee2(int i, List list) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.jJwa0q7P5wHq(parcel, 2, this.OPXfSBeufaJ8);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
