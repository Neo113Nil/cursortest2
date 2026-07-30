package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.location.zzef;

/* loaded from: classes3.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 3;
        private long zzc = -1;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @NonNull
        public Geofence build() {
            if (this.zza == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i8 = this.zzb;
            if (i8 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i8 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.zzc == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.zzh >= 0) {
                return new zzef(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        @NonNull
        public Builder setCircularRegion(@FloatRange(from = -90.0d, to = 90.0d) double d8, @FloatRange(from = -180.0d, to = 180.0d) double d9, @FloatRange(from = 0.0d, fromInclusive = false) float f8) {
            boolean z7 = d8 >= -90.0d && d8 <= 90.0d;
            StringBuilder sb = new StringBuilder(String.valueOf(d8).length() + 18);
            sb.append("Invalid latitude: ");
            sb.append(d8);
            Preconditions.checkArgument(z7, sb.toString());
            boolean z8 = d9 >= -180.0d && d9 <= 180.0d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(d9).length() + 19);
            sb2.append("Invalid longitude: ");
            sb2.append(d9);
            Preconditions.checkArgument(z8, sb2.toString());
            boolean z9 = f8 > 0.0f;
            StringBuilder sb3 = new StringBuilder(String.valueOf(f8).length() + 16);
            sb3.append("Invalid radius: ");
            sb3.append(f8);
            Preconditions.checkArgument(z9, sb3.toString());
            this.zzd = (short) 1;
            this.zze = d8;
            this.zzf = d9;
            this.zzg = f8;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j8) {
            if (j8 < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j8;
            }
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i8) {
            this.zzi = i8;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(@IntRange(from = 0) int i8) {
            this.zzh = i8;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i8) {
            this.zzb = i8;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    @NonNull
    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
