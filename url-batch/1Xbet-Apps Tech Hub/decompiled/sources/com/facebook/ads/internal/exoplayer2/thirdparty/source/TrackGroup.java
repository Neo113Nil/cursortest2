package com.facebook.ads.internal.exoplayer2.thirdparty.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.redexgen.X.F1;
import com.facebook.ads.redexgen.X.HI;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TrackGroup implements Parcelable {
    public static String[] A03 = {"", "NMittKxTOqnCpR0XVNiGFQTgWBdVnSBQ", "6q2S2IWbxt3Au5KHDEjHre", "yesKExk412D9rxhfpJlSlvbFBwA7zIdr", "", "HTCNZO0GmLRgbnlHCzceXp", "rqCvvFRkFLctqovtMSwPdniKfX3FbXhx", "eUM"};
    public static final Parcelable.Creator<TrackGroup> CREATOR = new F1();
    public int A00;
    public final int A01;
    public final Format[] A02;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new Format[readInt];
        for (int i = 0; i < i; i++) {
            this.A02[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        HI.A04(formatArr.length > 0);
        this.A02 = formatArr;
        this.A01 = formatArr.length;
    }

    public final int A00(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.A02;
            int i2 = formatArr.length;
            if (i < i2) {
                if (format == formatArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final Format A01(int i) {
        return this.A02[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.A01 == trackGroup.A01 && Arrays.equals(this.A02, trackGroup.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            if (A03[0].length() == 29) {
                throw new RuntimeException();
            }
            A03[6] = "7PEwa6COELc4k3zf5JXJInB5hEQAk2SR";
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        int i2 = 0;
        while (true) {
            int i3 = this.A01;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[5];
            int length = str.length();
            int i4 = str2.length();
            if (length != i4) {
                throw new RuntimeException();
            }
            A03[6] = "BrTDzXvstLX2a3jCZEwFRrav1URrTsvk";
            if (i2 < i3) {
                parcel.writeParcelable(this.A02[i2], 0);
                i2++;
            } else {
                return;
            }
        }
    }
}
