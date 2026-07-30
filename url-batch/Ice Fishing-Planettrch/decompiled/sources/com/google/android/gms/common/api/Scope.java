package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000createpolar.PolarVoyageContextPrimeStrikeSpeed7730;
import p000createpolar.PolarVoyageLayoutInflaterMegaAlpha5562;
import p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961;
import p000createpolar.PolarVoyageVideoCaptureOlympianNovaX3124;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class Scope extends PolarVoyageContextPrimeStrikeSpeed7730 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(16);
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final String PolarVoyageStrictModeLegendEpic1532;

    public Scope(String str, int i) {
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAnimatorSetSparkUltraMax8233(str, "scopeUri must not be null or empty");
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.PolarVoyageStrictModeLegendEpic1532.equals(((Scope) obj).PolarVoyageStrictModeLegendEpic1532);
    }

    public final int hashCode() {
        return this.PolarVoyageStrictModeLegendEpic1532.hashCode();
    }

    public final String toString() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, 20293);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageAnimatorSetSparkUltraMax8233(parcel, 1, 4);
        parcel.writeInt(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageDrawableDeltaHyperion5742(parcel, 2, this.PolarVoyageStrictModeLegendEpic1532);
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }
}
