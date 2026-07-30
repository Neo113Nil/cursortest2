package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jw2 extends POWyO8hTM6YC {
    public static final Parcelable.Creator<jw2> CREATOR = new BUo4iHFctTZi(9);
    public final String OPXfSBeufaJ8;
    public final List rtx2ld2ELZv4;

    public jw2(ArrayList arrayList, String str) {
        this.rtx2ld2ELZv4 = arrayList;
        this.OPXfSBeufaJ8 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        List<String> list = this.rtx2ld2ELZv4;
        if (list != null) {
            int D0aTLcX6Uhyo2 = ki0.D0aTLcX6Uhyo(parcel, 1);
            parcel.writeStringList(list);
            ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo2);
        }
        ki0.KUoIVIumpKat(parcel, 2, this.OPXfSBeufaJ8);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
