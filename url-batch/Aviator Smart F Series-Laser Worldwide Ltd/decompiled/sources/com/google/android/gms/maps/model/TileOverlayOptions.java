package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzaw;
import com.google.android.gms.internal.maps.zzax;

@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzak();

    @Nullable
    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzax zza;

    @Nullable
    private TileProvider zzb;

    @SafeParcelable.Field(getter = "isVisible", id = 3)
    private boolean zzc;

    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float zzd;

    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }

    @NonNull
    public TileOverlayOptions fadeIn(boolean z7) {
        this.zze = z7;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    @Nullable
    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    @NonNull
    public TileOverlayOptions tileProvider(@NonNull TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new zzaj(this, tileProvider);
        return this;
    }

    @NonNull
    public TileOverlayOptions transparency(float f8) {
        boolean z7 = false;
        if (f8 >= 0.0f && f8 <= 1.0f) {
            z7 = true;
        }
        Preconditions.checkArgument(z7, "Transparency must be in the range [0..1]");
        this.zzf = f8;
        return this;
    }

    @NonNull
    public TileOverlayOptions visible(boolean z7) {
        this.zzc = z7;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzax zzaxVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzaxVar == null ? null : zzaxVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public TileOverlayOptions zIndex(float f8) {
        this.zzd = f8;
        return this;
    }

    @SafeParcelable.Constructor
    TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z7, @SafeParcelable.Param(id = 4) float f8, @SafeParcelable.Param(id = 5) boolean z8, @SafeParcelable.Param(id = 6) float f9) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        zzax zzc = zzaw.zzc(iBinder);
        this.zza = zzc;
        this.zzb = zzc == null ? null : new zzai(this);
        this.zzc = z7;
        this.zzd = f8;
        this.zze = z8;
        this.zzf = f9;
    }
}
