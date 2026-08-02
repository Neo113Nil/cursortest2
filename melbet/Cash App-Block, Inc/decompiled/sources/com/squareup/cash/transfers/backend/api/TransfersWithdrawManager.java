package com.squareup.cash.transfers.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public interface TransfersWithdrawManager {

    public final class FeeData implements Parcelable {
        public static final Parcelable.Creator<FeeData> CREATOR = new TaxMenuSheet.Creator(8);
        public final TreeMap feeStepTiers;

        public final class FeeStepTier implements Parcelable {
            public static final Parcelable.Creator<FeeStepTier> CREATOR = new TaxMenuSheet.Creator(9);
            public final long feeBps;
            public final long lowerBoundAmountCents;
            public final long maximumFeeCents;
            public final long minimumFeeCents;

            public FeeStepTier(long j, long j2, long j3, long j4) {
                this.lowerBoundAmountCents = j;
                this.feeBps = j2;
                this.minimumFeeCents = j3;
                this.maximumFeeCents = j4;
                if (j < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("lowerBoundAmountCents must be non-negative");
                    throw null;
                }
                if (j2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("feeBps must be non-negative");
                    throw null;
                }
                if (j3 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("minimumFeeCents must be non-negative");
                    throw null;
                }
                if (j4 > 0) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("maximumFeeCents must be positive");
                throw null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FeeStepTier)) {
                    return false;
                }
                FeeStepTier feeStepTier = (FeeStepTier) obj;
                return this.lowerBoundAmountCents == feeStepTier.lowerBoundAmountCents && this.feeBps == feeStepTier.feeBps && this.minimumFeeCents == feeStepTier.minimumFeeCents && this.maximumFeeCents == feeStepTier.maximumFeeCents;
            }

            public final int hashCode() {
                return Long.hashCode(this.maximumFeeCents) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.lowerBoundAmountCents) * 31, 31, this.feeBps), 31, this.minimumFeeCents);
            }

            public final String toString() {
                StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.lowerBoundAmountCents, "FeeStepTier(lowerBoundAmountCents=", ", feeBps=");
                m1149m.append(this.feeBps);
                Boxes$$ExternalSyntheticOutline1.m1151m(this.minimumFeeCents, ", minimumFeeCents=", ", maximumFeeCents=", m1149m);
                return CameraState$Type$EnumUnboxingLocalUtility.m(this.maximumFeeCents, ")", m1149m);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeLong(this.lowerBoundAmountCents);
                parcel.writeLong(this.feeBps);
                parcel.writeLong(this.minimumFeeCents);
                parcel.writeLong(this.maximumFeeCents);
            }
        }

        public FeeData(TreeMap treeMap) {
            this.feeStepTiers = treeMap;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FeeData) && this.feeStepTiers.equals(((FeeData) obj).feeStepTiers);
        }

        public final int hashCode() {
            return this.feeStepTiers.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FeeData(feeStepTiers=", "FeeStepTiers(tiers=" + this.feeStepTiers + ")", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            FeeStepTiers.m3771writeToParcelimpl(this.feeStepTiers, parcel, i);
        }
    }
}
