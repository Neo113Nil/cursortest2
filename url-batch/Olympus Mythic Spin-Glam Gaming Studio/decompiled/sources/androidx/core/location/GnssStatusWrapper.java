package androidx.core.location;

import android.location.GnssStatus;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

@RequiresApi
@RestrictTo
/* loaded from: classes3.dex */
class GnssStatusWrapper extends GnssStatusCompat {
    private final GnssStatus mWrapped;

    GnssStatusWrapper(Object obj) {
        this.mWrapped = (GnssStatus) Preconditions.checkNotNull((GnssStatus) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return this.mWrapped.equals(((GnssStatusWrapper) obj).mWrapped);
        }
        return false;
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static float getCarrierFrequencyHz(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        @DoNotInline
        static boolean hasCarrierFrequencyHz(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    @RequiresApi
    static class Api30Impl {
        @DoNotInline
        static boolean hasBasebandCn0DbHz(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }

        @DoNotInline
        static float getBasebandCn0DbHz(GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }
    }
}
