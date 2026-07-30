package com.google.android.gms.fitness;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class FitnessOptions implements GoogleSignInOptionsExtension {
    public static final int ACCESS_READ = 0;
    public static final int ACCESS_WRITE = 1;
    private final Set zza;

    public static final class Builder {
        private final Set zza = new HashSet();

        private Builder() {
        }

        @NonNull
        public Builder accessActivitySessions(int i8) {
            if (i8 == 0) {
                this.zza.add(new Scope("https://www.googleapis.com/auth/fitness.activity.read"));
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException("valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
                }
                this.zza.add(new Scope("https://www.googleapis.com/auth/fitness.activity.write"));
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
        @NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder accessSleepSessions(int i8) {
            boolean z7;
            if (i8 != 0) {
                if (i8 != 1) {
                    z7 = false;
                    Preconditions.checkArgument(z7, "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
                    if (i8 != 0) {
                        this.zza.add(new Scope("https://www.googleapis.com/auth/fitness.sleep.read"));
                    } else if (i8 == 1) {
                        this.zza.add(new Scope("https://www.googleapis.com/auth/fitness.sleep.write"));
                    }
                    return this;
                }
                i8 = 1;
            }
            z7 = true;
            Preconditions.checkArgument(z7, "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
            if (i8 != 0) {
            }
            return this;
        }

        @NonNull
        public Builder addDataType(@NonNull DataType dataType) {
            addDataType(dataType, 0);
            return this;
        }

        @NonNull
        public FitnessOptions build() {
            return new FitnessOptions(this, null);
        }

        /* synthetic */ Builder(zzg zzgVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        @NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder addDataType(@NonNull DataType dataType, int i8) {
            boolean z7;
            if (i8 != 0) {
                if (i8 != 1) {
                    z7 = false;
                    Preconditions.checkArgument(z7, "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
                    String zza = dataType.zza();
                    String zzb = dataType.zzb();
                    if (i8 != 0) {
                        if (zza != null) {
                            this.zza.add(new Scope(zza));
                        }
                    } else if (i8 == 1 && zzb != null) {
                        this.zza.add(new Scope(zzb));
                    }
                    return this;
                }
                i8 = 1;
            }
            z7 = true;
            Preconditions.checkArgument(z7, "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
            String zza2 = dataType.zza();
            String zzb2 = dataType.zzb();
            if (i8 != 0) {
            }
            return this;
        }
    }

    /* synthetic */ FitnessOptions(Builder builder, zzh zzhVar) {
        this.zza = builder.zza;
    }

    @NonNull
    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FitnessOptions) {
            return this.zza.equals(((FitnessOptions) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public int getExtensionType() {
        return 3;
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    @NonNull
    public List<Scope> getImpliedScopes() {
        return new ArrayList(this.zza);
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    @NonNull
    public Bundle toBundle() {
        return new Bundle();
    }
}
