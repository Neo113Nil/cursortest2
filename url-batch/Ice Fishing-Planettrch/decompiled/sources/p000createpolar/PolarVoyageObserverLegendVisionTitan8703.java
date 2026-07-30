package p000createpolar;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageObserverLegendVisionTitan8703 implements Parcelable {
    public static final Parcelable.Creator<PolarVoyageObserverLegendVisionTitan8703> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(3);
    public final int PolarVoyageBottomSheetOmegaNeo1907;
    public final IntentSender PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Intent PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageObserverLegendVisionTitan8703(IntentSender intentSender, Intent intent, int i, int i2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = intentSender;
        this.PolarVoyageStrictModeLegendEpic1532 = intent;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i);
        parcel.writeParcelable(this.PolarVoyageStrictModeLegendEpic1532, i);
        parcel.writeInt(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        parcel.writeInt(this.PolarVoyageBottomSheetOmegaNeo1907);
    }
}
