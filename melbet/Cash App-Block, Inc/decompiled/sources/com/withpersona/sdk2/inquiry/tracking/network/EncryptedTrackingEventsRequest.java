package com.withpersona.sdk2.inquiry.tracking.network;

import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "", "keyVersion", "", "encryptedKey", BreadcrumbHelper.Category.EVENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKeyVersion", "()Ljava/lang/String;", "getEncryptedKey", "getEvent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EncryptedTrackingEventsRequest {
    private final String encryptedKey;
    private final String event;
    private final String keyVersion;

    public EncryptedTrackingEventsRequest(@Json(name = "key_version") String str, @Json(name = "encrypted_key") String str2, @Json(name = "event") String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.keyVersion = str;
        this.encryptedKey = str2;
        this.event = str3;
    }

    public static /* synthetic */ EncryptedTrackingEventsRequest copy$default(EncryptedTrackingEventsRequest encryptedTrackingEventsRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encryptedTrackingEventsRequest.keyVersion;
        }
        if ((i & 2) != 0) {
            str2 = encryptedTrackingEventsRequest.encryptedKey;
        }
        if ((i & 4) != 0) {
            str3 = encryptedTrackingEventsRequest.event;
        }
        return encryptedTrackingEventsRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKeyVersion() {
        return this.keyVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    public final EncryptedTrackingEventsRequest copy(@Json(name = "key_version") String keyVersion, @Json(name = "encrypted_key") String encryptedKey, @Json(name = "event") String event) {
        keyVersion.getClass();
        encryptedKey.getClass();
        event.getClass();
        return new EncryptedTrackingEventsRequest(keyVersion, encryptedKey, event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedTrackingEventsRequest)) {
            return false;
        }
        EncryptedTrackingEventsRequest encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) other;
        return Intrinsics.areEqual(this.keyVersion, encryptedTrackingEventsRequest.keyVersion) && Intrinsics.areEqual(this.encryptedKey, encryptedTrackingEventsRequest.encryptedKey) && Intrinsics.areEqual(this.event, encryptedTrackingEventsRequest.event);
    }

    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getKeyVersion() {
        return this.keyVersion;
    }

    public int hashCode() {
        return this.event.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keyVersion.hashCode() * 31, 31, this.encryptedKey);
    }

    public String toString() {
        String str = this.keyVersion;
        String str2 = this.encryptedKey;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EncryptedTrackingEventsRequest(keyVersion=", str, ", encryptedKey=", str2, ", event="), this.event, ")");
    }
}
