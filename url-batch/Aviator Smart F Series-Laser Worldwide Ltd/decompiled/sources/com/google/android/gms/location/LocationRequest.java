package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import cn.hutool.core.text.l;
import com.github.mikephil.charting.utils.i;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzej;
import org.checkerframework.dataflow.qual.Pure;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 14, 1000})
/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzaf();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long zzb;

    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long zzc;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", id = 8)
    private long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", id = 7)
    private float zzg;

    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", id = 11)
    private long zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int zzk;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean zzl;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource zzm;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", id = 17)
    private final com.google.android.gms.internal.location.zze zzn;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    @NonNull
    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String zze(long j8) {
        return j8 == Long.MAX_VALUE ? "∞" : zzej.zzb(j8);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && Objects.equal(this.zzn, locationRequest.zzn)))) {
                return true;
            }
        }
        return false;
    }

    @Pure
    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    @Pure
    public long getExpirationTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = this.zze;
        long j9 = elapsedRealtime + j8;
        if (((elapsedRealtime ^ j9) & (j8 ^ j9)) < 0) {
            return Long.MAX_VALUE;
        }
        return j9;
    }

    @Deprecated
    @Pure
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    @Pure
    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    @Pure
    public long getInterval() {
        return getIntervalMillis();
    }

    @Pure
    public long getIntervalMillis() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    @Pure
    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    @Pure
    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    @Pure
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    @Pure
    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    @Pure
    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    @Pure
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    @Pure
    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    @Pure
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzm);
    }

    @Pure
    public boolean isBatched() {
        long j8 = this.zzd;
        return j8 > 0 && (j8 >> 1) >= this.zzb;
    }

    @Deprecated
    @Pure
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    @Pure
    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationDuration(long j8) {
        Preconditions.checkArgument(j8 > 0, "durationMillis must be greater than 0");
        this.zze = j8;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationTime(long j8) {
        this.zze = Math.max(1L, j8 - SystemClock.elapsedRealtime());
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setFastestInterval(long j8) {
        Preconditions.checkArgument(j8 >= 0, "illegal fastest interval: %d", Long.valueOf(j8));
        this.zzc = j8;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setInterval(long j8) {
        Preconditions.checkArgument(j8 >= 0, "intervalMillis must be greater than or equal to 0");
        long j9 = this.zzc;
        long j10 = this.zzb;
        if (j9 == j10 / 6) {
            this.zzc = j8 / 6;
        }
        if (this.zzi == j10) {
            this.zzi = j8;
        }
        this.zzb = j8;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setMaxWaitTime(long j8) {
        Preconditions.checkArgument(j8 >= 0, "illegal max wait time: %d", Long.valueOf(j8));
        this.zzd = j8;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setNumUpdates(int i8) {
        if (i8 > 0) {
            this.zzf = i8;
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 20);
        sb.append("invalid numUpdates: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    @NonNull
    @Deprecated
    public LocationRequest setPriority(int i8) {
        zzan.zza(i8);
        this.zza = i8;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setSmallestDisplacement(float f8) {
        if (f8 >= 0.0f) {
            this.zzg = f8;
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(f8).length() + 22);
        sb.append("invalid displacement: ");
        sb.append(f8);
        throw new IllegalArgumentException(sb.toString());
    }

    @NonNull
    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z7) {
        this.zzh = z7;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (isPassive()) {
            sb.append(zzan.zzb(this.zza));
            if (this.zzd > 0) {
                sb.append("/");
                zzej.zzc(this.zzd, sb);
            }
        } else {
            sb.append("@");
            if (isBatched()) {
                zzej.zzc(this.zzb, sb);
                sb.append("/");
                zzej.zzc(this.zzd, sb);
            } else {
                zzej.zzc(this.zzb, sb);
            }
            sb.append(l.SPACE);
            sb.append(zzan.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            sb.append(", minUpdateInterval=");
            sb.append(zze(this.zzc));
        }
        if (this.zzg > i.DOUBLE_EPSILON) {
            sb.append(", minUpdateDistance=");
            sb.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(zze(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            sb.append(", duration=");
            zzej.zzc(this.zze, sb);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.zzf);
        }
        if (this.zzk != 0) {
            sb.append(", ");
            sb.append(zzar.zzb(this.zzk));
        }
        if (this.zzj != 0) {
            sb.append(", ");
            sb.append(zzq.zzb(this.zzj));
        }
        if (this.zzh) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            sb.append(", bypass");
        }
        if (!WorkSourceUtil.isEmpty(this.zzm)) {
            sb.append(", ");
            sb.append(this.zzm);
        }
        if (this.zzn != null) {
            sb.append(", impersonation=");
            sb.append(this.zzn);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzl);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzm, i8, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzn, i8, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.zzk;
    }

    @Pure
    public final boolean zzb() {
        return this.zzl;
    }

    @NonNull
    @Pure
    public final WorkSource zzc() {
        return this.zzm;
    }

    @Nullable
    @Pure
    public final com.google.android.gms.internal.location.zze zzd() {
        return this.zzn;
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private boolean zzl;

        @Nullable
        private WorkSource zzm;

        @Nullable
        private com.google.android.gms.internal.location.zze zzn;

        public Builder(int i8, long j8) {
            this(j8);
            setPriority(i8);
        }

        @NonNull
        public LocationRequest build() {
            int i8 = this.zza;
            long j8 = this.zzb;
            long j9 = this.zzc;
            if (j9 == -1) {
                j9 = j8;
            } else if (i8 != 105) {
                j9 = Math.min(j9, j8);
            }
            long max = Math.max(this.zzd, this.zzb);
            long j10 = this.zze;
            int i9 = this.zzf;
            float f8 = this.zzg;
            boolean z7 = this.zzh;
            long j11 = this.zzi;
            return new LocationRequest(i8, j8, j9, max, Long.MAX_VALUE, j10, i9, f8, z7, j11 == -1 ? this.zzb : j11, this.zzj, this.zzk, this.zzl, new WorkSource(this.zzm), this.zzn);
        }

        @NonNull
        public Builder setDurationMillis(long j8) {
            Preconditions.checkArgument(j8 > 0, "durationMillis must be greater than 0");
            this.zze = j8;
            return this;
        }

        @NonNull
        public Builder setGranularity(int i8) {
            zzq.zza(i8);
            this.zzj = i8;
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(long j8) {
            Preconditions.checkArgument(j8 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j8;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j8) {
            boolean z7 = true;
            if (j8 != -1 && j8 < 0) {
                z7 = false;
            }
            Preconditions.checkArgument(z7, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j8;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(long j8) {
            Preconditions.checkArgument(j8 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j8;
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(int i8) {
            Preconditions.checkArgument(i8 > 0, "maxUpdates must be greater than 0");
            this.zzf = i8;
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(float f8) {
            Preconditions.checkArgument(f8 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f8;
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(long j8) {
            boolean z7 = true;
            if (j8 != -1 && j8 < 0) {
                z7 = false;
            }
            Preconditions.checkArgument(z7, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j8;
            return this;
        }

        @NonNull
        public Builder setPriority(int i8) {
            zzan.zza(i8);
            this.zza = i8;
            return this;
        }

        @NonNull
        public Builder setWaitForAccurateLocation(boolean z7) {
            this.zzh = z7;
            return this;
        }

        @NonNull
        public final Builder zza(int i8) {
            zzar.zza(i8);
            this.zzk = i8;
            return this;
        }

        @NonNull
        @RequiresPermission(anyOf = {"android.permission.WRITE_SECURE_SETTINGS", "android.permission.LOCATION_BYPASS"})
        public final Builder zzb(boolean z7) {
            this.zzl = z7;
            return this;
        }

        @NonNull
        @RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
        public final Builder zzc(@Nullable WorkSource workSource) {
            this.zzm = workSource;
            return this;
        }

        public Builder(long j8) {
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = false;
            this.zzm = null;
            this.zzn = null;
            setIntervalMillis(j8);
        }

        public Builder(@NonNull LocationRequest locationRequest) {
            this(locationRequest.getPriority(), locationRequest.getIntervalMillis());
            setMinUpdateIntervalMillis(locationRequest.getMinUpdateIntervalMillis());
            setMaxUpdateDelayMillis(locationRequest.getMaxUpdateDelayMillis());
            setDurationMillis(locationRequest.getDurationMillis());
            setMaxUpdates(locationRequest.getMaxUpdates());
            setMinUpdateDistanceMeters(locationRequest.getMinUpdateDistanceMeters());
            setWaitForAccurateLocation(locationRequest.isWaitForAccurateLocation());
            setMaxUpdateAgeMillis(locationRequest.getMaxUpdateAgeMillis());
            setGranularity(locationRequest.getGranularity());
            int zza = locationRequest.zza();
            zzar.zza(zza);
            this.zzk = zza;
            this.zzl = locationRequest.zzb();
            this.zzm = locationRequest.zzc();
            com.google.android.gms.internal.location.zze zzd = locationRequest.zzd();
            boolean z7 = true;
            if (zzd != null && zzd.zza()) {
                z7 = false;
            }
            Preconditions.checkArgument(z7);
            this.zzn = zzd;
        }
    }

    @SafeParcelable.Constructor
    LocationRequest(@SafeParcelable.Param(id = 1) int i8, @SafeParcelable.Param(id = 2) long j8, @SafeParcelable.Param(id = 3) long j9, @SafeParcelable.Param(id = 8) long j10, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j11, @SafeParcelable.Param(id = 10) long j12, @SafeParcelable.Param(id = 6) int i9, @SafeParcelable.Param(id = 7) float f8, @SafeParcelable.Param(id = 9) boolean z7, @SafeParcelable.Param(id = 11) long j13, @SafeParcelable.Param(id = 12) int i10, @SafeParcelable.Param(id = 13) int i11, @SafeParcelable.Param(id = 15) boolean z8, @SafeParcelable.Param(id = 16) WorkSource workSource, @Nullable @SafeParcelable.Param(id = 17) com.google.android.gms.internal.location.zze zzeVar) {
        long j14;
        this.zza = i8;
        if (i8 == 105) {
            this.zzb = Long.MAX_VALUE;
            j14 = j8;
        } else {
            j14 = j8;
            this.zzb = j14;
        }
        this.zzc = j9;
        this.zzd = j10;
        this.zze = j11 == Long.MAX_VALUE ? j12 : Math.min(Math.max(1L, j11 - SystemClock.elapsedRealtime()), j12);
        this.zzf = i9;
        this.zzg = f8;
        this.zzh = z7;
        this.zzi = j13 != -1 ? j13 : j14;
        this.zzj = i10;
        this.zzk = i11;
        this.zzl = z8;
        this.zzm = workSource;
        this.zzn = zzeVar;
    }
}
