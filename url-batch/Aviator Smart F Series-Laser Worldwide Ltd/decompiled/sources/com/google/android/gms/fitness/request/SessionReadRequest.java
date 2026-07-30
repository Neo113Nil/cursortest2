package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzci;
import com.google.android.gms.internal.fitness.zzcj;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SafeParcelable.Class(creator = "SessionReadRequestCreator")
@SafeParcelable.Reserved({11, 1000})
/* loaded from: classes3.dex */
public class SessionReadRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SessionReadRequest> CREATOR = new zzaq();

    @SafeParcelable.Field(getter = "getSessionName", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 3)
    private final long zzc;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 4)
    private final long zzd;

    @SafeParcelable.Field(getter = "getDataTypes", id = 5)
    private final List zze;

    @SafeParcelable.Field(getter = "getDataSources", id = 6)
    private final List zzf;

    @SafeParcelable.Field(getter = "includeSessionsFromAllApps", id = 7)
    private final boolean zzg;

    @SafeParcelable.Field(getter = "areServerQueriesEnabled", id = 8)
    private final boolean zzh;

    @SafeParcelable.Field(getter = "getExcludedPackages", id = 9)
    private final List zzi;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 10, type = "android.os.IBinder")
    private final zzcj zzj;

    @SafeParcelable.Field(defaultValue = "true", getter = "areActivitySessionsIncluded", id = 12)
    private final boolean zzk;

    @SafeParcelable.Field(defaultValue = "false", getter = "areSleepSessionsIncluded", id = 13)
    private final boolean zzl;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionReadRequest(SessionReadRequest sessionReadRequest, zzcj zzcjVar) {
        this(sessionReadRequest.zza, sessionReadRequest.zzb, sessionReadRequest.zzc, sessionReadRequest.zzd, sessionReadRequest.zze, sessionReadRequest.zzf, sessionReadRequest.zzg, sessionReadRequest.zzh, sessionReadRequest.zzi, zzcjVar, sessionReadRequest.zzk, sessionReadRequest.zzl);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionReadRequest)) {
            return false;
        }
        SessionReadRequest sessionReadRequest = (SessionReadRequest) obj;
        return Objects.equal(this.zza, sessionReadRequest.zza) && this.zzb.equals(sessionReadRequest.zzb) && this.zzc == sessionReadRequest.zzc && this.zzd == sessionReadRequest.zzd && Objects.equal(this.zze, sessionReadRequest.zze) && Objects.equal(this.zzf, sessionReadRequest.zzf) && this.zzg == sessionReadRequest.zzg && this.zzi.equals(sessionReadRequest.zzi) && this.zzh == sessionReadRequest.zzh && this.zzk == sessionReadRequest.zzk && this.zzl == sessionReadRequest.zzl;
    }

    @NonNull
    public List<DataSource> getDataSources() {
        return this.zzf;
    }

    @NonNull
    public List<DataType> getDataTypes() {
        return this.zze;
    }

    public long getEndTime(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.zzd, TimeUnit.MILLISECONDS);
    }

    @NonNull
    public List<String> getExcludedPackages() {
        return this.zzi;
    }

    @Nullable
    public String getSessionId() {
        return this.zzb;
    }

    @Nullable
    public String getSessionName() {
        return this.zza;
    }

    public long getStartTime(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.zzc, TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Long.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    public boolean includeSessionsFromAllApps() {
        return this.zzg;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("sessionName", this.zza).add("sessionId", this.zzb).add("startTimeMillis", Long.valueOf(this.zzc)).add("endTimeMillis", Long.valueOf(this.zzd)).add("dataTypes", this.zze).add("dataSources", this.zzf).add("sessionsFromAllApps", Boolean.valueOf(this.zzg)).add("excludedPackages", this.zzi).add("useServer", Boolean.valueOf(this.zzh)).add("activitySessionsIncluded", Boolean.valueOf(this.zzk)).add("sleepSessionsIncluded", Boolean.valueOf(this.zzl)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getSessionName(), false);
        SafeParcelWriter.writeString(parcel, 2, getSessionId(), false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeTypedList(parcel, 5, getDataTypes(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, getDataSources(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, includeSessionsFromAllApps());
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeStringList(parcel, 9, getExcludedPackages(), false);
        zzcj zzcjVar = this.zzj;
        SafeParcelWriter.writeIBinder(parcel, 10, zzcjVar == null ? null : zzcjVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private String zza;
        private String zzb;
        private long zzc = 0;
        private long zzd = 0;
        private final List zze = new ArrayList();
        private final List zzf = new ArrayList();
        private boolean zzg = false;
        private boolean zzh = false;
        private final List zzi = new ArrayList();
        private boolean zzj = false;
        private boolean zzk = false;
        private boolean zzl = false;

        @NonNull
        public SessionReadRequest build() {
            long j8 = this.zzc;
            Preconditions.checkArgument(j8 > 0, "Invalid start time: %s", Long.valueOf(j8));
            long j9 = this.zzd;
            Preconditions.checkArgument(j9 > 0 && j9 > this.zzc, "Invalid end time: %s", Long.valueOf(j9));
            if (!this.zzl) {
                this.zzj = true;
            }
            return new SessionReadRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, null, this.zzj, this.zzk);
        }

        @NonNull
        public Builder enableServerQueries() {
            this.zzh = true;
            return this;
        }

        @NonNull
        public Builder excludePackage(@NonNull String str) {
            Preconditions.checkNotNull(str, "Attempting to use a null package name");
            if (!this.zzi.contains(str)) {
                this.zzi.add(str);
            }
            return this;
        }

        @NonNull
        public Builder includeActivitySessions() {
            this.zzj = true;
            this.zzl = true;
            return this;
        }

        @NonNull
        public Builder includeSleepSessions() {
            this.zzk = true;
            this.zzl = true;
            return this;
        }

        @NonNull
        public Builder read(@NonNull DataSource dataSource) {
            Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            if (!this.zzf.contains(dataSource)) {
                this.zzf.add(dataSource);
            }
            return this;
        }

        @NonNull
        public Builder readSessionsFromAllApps() {
            this.zzg = true;
            return this;
        }

        @NonNull
        public Builder setSessionId(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setSessionName(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setTimeInterval(long j8, long j9, @NonNull TimeUnit timeUnit) {
            this.zzc = timeUnit.toMillis(j8);
            this.zzd = timeUnit.toMillis(j9);
            return this;
        }

        @NonNull
        public Builder read(@NonNull DataType dataType) {
            Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            if (!this.zze.contains(dataType)) {
                this.zze.add(dataType);
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    SessionReadRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) long j8, @SafeParcelable.Param(id = 4) long j9, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) List list2, @SafeParcelable.Param(id = 7) boolean z7, @SafeParcelable.Param(id = 8) boolean z8, @SafeParcelable.Param(id = 9) List list3, @Nullable @SafeParcelable.Param(id = 10) IBinder iBinder, @SafeParcelable.Param(id = 12) boolean z9, @SafeParcelable.Param(id = 13) boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j8;
        this.zzd = j9;
        this.zze = list;
        this.zzf = list2;
        this.zzg = z7;
        this.zzh = z8;
        this.zzi = list3;
        this.zzj = iBinder == null ? null : zzci.zzb(iBinder);
        this.zzk = z9;
        this.zzl = z10;
    }
}
