package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfpm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpm> CREATOR = new zzfpn();
    public final int zza;
    private zzast zzb = null;
    private byte[] zzc;

    zzfpm(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaN();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzast zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzast.zzh(this.zzc, zzhhr.zza());
                this.zzc = null;
            } catch (zzhiw | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }

    private final void zzb() {
        zzast zzastVar = this.zzb;
        if (zzastVar != null || this.zzc == null) {
            if (zzastVar == null || this.zzc != null) {
                if (zzastVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzastVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }
}
