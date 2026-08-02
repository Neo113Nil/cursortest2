package com.squareup.cash.work.tinygraph.models;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.squareup.protos.wire.roster.mds.Unit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001:\u0001,BU\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010 \u0012\u0004\b#\u0010\u0015\u001a\u0004\b!\u0010\"R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010$\u0012\u0004\b'\u0010\u0015\u001a\u0004\b%\u0010&R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010(\u0012\u0004\b+\u0010\u0015\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Location;", "Lcom/squareup/cash/work/tinygraph/models/IBaseEntity;", "", "id", "", "createdAt", "updatedAt", "", "protoJson", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "merchantId", "Lcom/squareup/cash/work/tinygraph/models/LocationStatus;", "status", "Lcom/squareup/cash/work/tinygraph/models/Location$Coordinates;", "coordinates", "<init>", "(Ljava/lang/String;JJLjava/lang/Object;Lcom/squareup/cash/work/tinygraph/models/EntityReference;Lcom/squareup/cash/work/tinygraph/models/LocationStatus;Lcom/squareup/cash/work/tinygraph/models/Location$Coordinates;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "J", "getCreatedAt", "()J", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Ljava/lang/Object;", "getProtoJson", "()Ljava/lang/Object;", "getProtoJson$annotations", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "getMerchantId", "()Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "getMerchantId$annotations", "Lcom/squareup/cash/work/tinygraph/models/LocationStatus;", "getStatus", "()Lcom/squareup/cash/work/tinygraph/models/LocationStatus;", "getStatus$annotations", "Lcom/squareup/cash/work/tinygraph/models/Location$Coordinates;", "getCoordinates", "()Lcom/squareup/cash/work/tinygraph/models/Location$Coordinates;", "getCoordinates$annotations", "Coordinates", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Location implements IBaseEntity {
    public final Coordinates coordinates;
    public final long createdAt;
    public final String id;
    public final EntityReference merchantId;
    public final Object protoJson;
    public final transient Lazy protoModel$delegate;
    public final LocationStatus status;
    public final long updatedAt;

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u0012\u0004\b\u000f\u0010\r\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Location$Coordinates;", "", "", "latitude", "longitude", "<init>", "(DD)V", "copy", "(DD)Lcom/squareup/cash/work/tinygraph/models/Location$Coordinates;", "D", "getLatitude", "()D", "getLatitude$annotations", "()V", "getLongitude", "getLongitude$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Coordinates {
        public final double latitude;
        public final double longitude;

        public Coordinates(@Json(name = "latitude") double d, @Json(name = "longitude") double d2) {
            this.latitude = d;
            this.longitude = d2;
        }

        @Json(name = "latitude")
        public static /* synthetic */ void getLatitude$annotations() {
        }

        @Json(name = "longitude")
        public static /* synthetic */ void getLongitude$annotations() {
        }

        public final Coordinates copy(@Json(name = "latitude") double latitude, @Json(name = "longitude") double longitude) {
            return new Coordinates(latitude, longitude);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Coordinates)) {
                return false;
            }
            Coordinates coordinates = (Coordinates) obj;
            return Double.compare(this.latitude, coordinates.latitude) == 0 && Double.compare(this.longitude, coordinates.longitude) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Coordinates(latitude=", ", longitude=", this.latitude), this.longitude, ")");
        }
    }

    public Location(@Json(name = "id") String str, @Json(name = "createdAt") long j, @Json(name = "updatedAt") long j2, @Json(name = "proto") Object obj, @Json(name = "merchantId") EntityReference entityReference, @Json(name = "status") LocationStatus locationStatus, @Json(name = "coordinates") Coordinates coordinates) {
        str.getClass();
        this.id = str;
        this.createdAt = j;
        this.updatedAt = j2;
        this.protoJson = obj;
        this.merchantId = entityReference;
        this.status = locationStatus;
        this.coordinates = coordinates;
        this.protoModel$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 29));
    }

    @Json(name = "coordinates")
    public static /* synthetic */ void getCoordinates$annotations() {
    }

    @Json(name = "createdAt")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @Json(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @Json(name = "merchantId")
    public static /* synthetic */ void getMerchantId$annotations() {
    }

    @Json(name = "proto")
    public static /* synthetic */ void getProtoJson$annotations() {
    }

    @Json(name = "status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @Json(name = "updatedAt")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @Override // com.squareup.cash.work.tinygraph.models.IBaseEntity
    public final String getId() {
        return this.id;
    }

    public final Unit getProtoModel() {
        return (Unit) this.protoModel$delegate.getValue();
    }

    @Override // com.squareup.cash.work.tinygraph.models.IBaseEntity
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public /* synthetic */ Location(String str, long j, long j2, Object obj, EntityReference entityReference, LocationStatus locationStatus, Coordinates coordinates, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, obj, entityReference, locationStatus, (i & 64) != 0 ? null : coordinates);
    }
}
