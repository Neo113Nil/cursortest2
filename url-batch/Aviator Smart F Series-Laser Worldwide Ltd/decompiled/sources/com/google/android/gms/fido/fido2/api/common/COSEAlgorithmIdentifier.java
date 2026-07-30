package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzm();

    @NonNull
    private Algorithm zza;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int i8) {
            super("Algorithm with COSE value " + i8 + " not supported");
        }
    }

    COSEAlgorithmIdentifier(@NonNull Algorithm algorithm) {
        this.zza = (Algorithm) Preconditions.checkNotNull(algorithm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static COSEAlgorithmIdentifier fromCoseValue(int i8) {
        RSAAlgorithm rSAAlgorithm;
        if (i8 == RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            rSAAlgorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] values = RSAAlgorithm.values();
            int length = values.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    for (RSAAlgorithm rSAAlgorithm2 : EC2Algorithm.values()) {
                        if (rSAAlgorithm2.getAlgoValue() == i8) {
                            rSAAlgorithm = rSAAlgorithm2;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(i8);
                }
                RSAAlgorithm rSAAlgorithm3 = values[i9];
                if (rSAAlgorithm3.getAlgoValue() == i8) {
                    rSAAlgorithm = rSAAlgorithm3;
                    break;
                }
                i9++;
            }
        }
        return new COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@NonNull Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
