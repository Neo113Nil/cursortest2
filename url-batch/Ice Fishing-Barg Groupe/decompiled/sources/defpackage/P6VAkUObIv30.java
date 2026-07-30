package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class P6VAkUObIv30 implements Parcelable {
    public final Intent OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;
    public static final HiC8volkyM7b Companion = new HiC8volkyM7b();
    public static final Parcelable.Creator<P6VAkUObIv30> CREATOR = new BUo4iHFctTZi(0);

    public P6VAkUObIv30(Intent intent, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        Companion.getClass();
        int i = this.rtx2ld2ELZv4;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.OPXfSBeufaJ8);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.rtx2ld2ELZv4);
        Intent intent = this.OPXfSBeufaJ8;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
