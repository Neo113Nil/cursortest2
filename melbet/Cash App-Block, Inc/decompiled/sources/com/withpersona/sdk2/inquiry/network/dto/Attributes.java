package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "Landroid/os/Parcelable;", "gpsCollectionRequirement", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;", "gpsPrecisionRequirement", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "playIntegrityProjectId", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;Ljava/lang/String;)V", "getGpsCollectionRequirement", "()Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;", "getGpsPrecisionRequirement", "()Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "getPlayIntegrityProjectId", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Attributes implements Parcelable {
    public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
    private final GpsCollectionRequirement gpsCollectionRequirement;
    private final GpsPrecisionRequirement gpsPrecisionRequirement;
    private final String playIntegrityProjectId;

    public /* synthetic */ Attributes(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : gpsCollectionRequirement, (i & 2) != 0 ? null : gpsPrecisionRequirement, (i & 4) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GpsCollectionRequirement getGpsCollectionRequirement() {
        return this.gpsCollectionRequirement;
    }

    public final GpsPrecisionRequirement getGpsPrecisionRequirement() {
        return this.gpsPrecisionRequirement;
    }

    public final String getPlayIntegrityProjectId() {
        return this.playIntegrityProjectId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        GpsCollectionRequirement gpsCollectionRequirement = this.gpsCollectionRequirement;
        if (gpsCollectionRequirement == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            gpsCollectionRequirement.writeToParcel(dest, flags);
        }
        GpsPrecisionRequirement gpsPrecisionRequirement = this.gpsPrecisionRequirement;
        if (gpsPrecisionRequirement == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            gpsPrecisionRequirement.writeToParcel(dest, flags);
        }
        dest.writeString(this.playIntegrityProjectId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Attributes> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attributes createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Attributes(parcel.readInt() == 0 ? null : GpsCollectionRequirement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GpsPrecisionRequirement.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attributes[] newArray(int i) {
            return new Attributes[i];
        }
    }

    public Attributes(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement, String str) {
        this.gpsCollectionRequirement = gpsCollectionRequirement;
        this.gpsPrecisionRequirement = gpsPrecisionRequirement;
        this.playIntegrityProjectId = str;
    }

    public Attributes() {
        this(null, null, null, 7, null);
    }
}
