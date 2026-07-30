package p000createpolar;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageServiceInfoVortexEpicTurbo8786 implements Parcelable {
    public static final Parcelable.Creator<PolarVoyageServiceInfoVortexEpicTurbo8786> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(0);
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Intent PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageServiceInfoVortexEpicTurbo8786(Intent intent, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.PolarVoyageStrictModeLegendEpic1532);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        Intent intent = this.PolarVoyageStrictModeLegendEpic1532;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
