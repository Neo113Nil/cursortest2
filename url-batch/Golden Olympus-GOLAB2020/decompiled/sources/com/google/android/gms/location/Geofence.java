package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes.dex */
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
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        public Geofence build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i4 = this.zzb;
            if (i4 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i4 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            long j4 = this.zzc;
            if (j4 == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            int i5 = this.zzh;
            if (i5 >= 0) {
                return new com.google.android.gms.internal.location.zzbe(str, i4, (short) 1, this.zze, this.zzf, this.zzg, j4, i5, this.zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public Builder setCircularRegion(double d4, double d5, float f4) {
            boolean z4 = d4 >= -90.0d && d4 <= 90.0d;
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d4);
            Preconditions.checkArgument(z4, sb.toString());
            boolean z5 = d5 >= -180.0d && d5 <= 180.0d;
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d5);
            Preconditions.checkArgument(z5, sb2.toString());
            boolean z6 = f4 > 0.0f;
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f4);
            Preconditions.checkArgument(z6, sb3.toString());
            this.zzd = (short) 1;
            this.zze = d4;
            this.zzf = d5;
            this.zzg = f4;
            return this;
        }

        public Builder setExpirationDuration(long j4) {
            if (j4 < 0) {
                this.zzc = -1L;
                return this;
            }
            this.zzc = DefaultClock.getInstance().elapsedRealtime() + j4;
            return this;
        }

        public Builder setLoiteringDelay(int i4) {
            this.zzi = i4;
            return this;
        }

        public Builder setNotificationResponsiveness(int i4) {
            this.zzh = i4;
            return this;
        }

        public Builder setRequestId(String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        public Builder setTransitionTypes(int i4) {
            this.zzb = i4;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    String getRequestId();
}
