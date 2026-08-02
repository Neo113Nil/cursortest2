package com.squareup.cash.treehouse.android.configuration;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes7.dex */
public final class TreehouseAppConfiguration {
    public final String appName;
    public final EndpointType endpointType;
    public final HttpUrl fromServerManifestUrl;
    public final HttpUrl lastQrCodeManifestUrl;
    public final Long lastQrCodeScannedAt;
    public final HttpUrl localDevelopmentManifestUrl;
    public final String minimalCommitTimestamp;

    public TreehouseAppConfiguration(String str, EndpointType endpointType, HttpUrl httpUrl, HttpUrl httpUrl2, HttpUrl httpUrl3, Long l, String str2) {
        str.getClass();
        this.appName = str;
        this.endpointType = endpointType;
        this.fromServerManifestUrl = httpUrl;
        this.localDevelopmentManifestUrl = httpUrl2;
        this.lastQrCodeManifestUrl = httpUrl3;
        this.lastQrCodeScannedAt = l;
        this.minimalCommitTimestamp = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreehouseAppConfiguration)) {
            return false;
        }
        TreehouseAppConfiguration treehouseAppConfiguration = (TreehouseAppConfiguration) obj;
        return Intrinsics.areEqual(this.appName, treehouseAppConfiguration.appName) && this.endpointType == treehouseAppConfiguration.endpointType && Intrinsics.areEqual(this.fromServerManifestUrl, treehouseAppConfiguration.fromServerManifestUrl) && this.localDevelopmentManifestUrl.equals(treehouseAppConfiguration.localDevelopmentManifestUrl) && Intrinsics.areEqual(this.lastQrCodeManifestUrl, treehouseAppConfiguration.lastQrCodeManifestUrl) && Intrinsics.areEqual(this.lastQrCodeScannedAt, treehouseAppConfiguration.lastQrCodeScannedAt) && Intrinsics.areEqual(this.minimalCommitTimestamp, treehouseAppConfiguration.minimalCommitTimestamp);
    }

    public final EndpointType getEndpointType() {
        return this.endpointType;
    }

    public final HttpUrl getManifestUrl() {
        int ordinal = this.endpointType.ordinal();
        if (ordinal == 0) {
            return this.fromServerManifestUrl;
        }
        if (ordinal == 1) {
            return this.localDevelopmentManifestUrl;
        }
        if (ordinal == 2) {
            return this.lastQrCodeManifestUrl;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final int hashCode() {
        int hashCode = (this.endpointType.hashCode() + (this.appName.hashCode() * 31)) * 31;
        HttpUrl httpUrl = this.fromServerManifestUrl;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (httpUrl == null ? 0 : httpUrl.url.hashCode())) * 31, 31, this.localDevelopmentManifestUrl.url);
        HttpUrl httpUrl2 = this.lastQrCodeManifestUrl;
        int hashCode2 = (m + (httpUrl2 == null ? 0 : httpUrl2.url.hashCode())) * 31;
        Long l = this.lastQrCodeScannedAt;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.minimalCommitTimestamp;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TreehouseAppConfiguration(appName=");
        sb.append(this.appName);
        sb.append(", endpointType=");
        sb.append(this.endpointType);
        sb.append(", fromServerManifestUrl=");
        sb.append(this.fromServerManifestUrl);
        sb.append(", localDevelopmentManifestUrl=");
        sb.append(this.localDevelopmentManifestUrl);
        sb.append(", lastQrCodeManifestUrl=");
        sb.append(this.lastQrCodeManifestUrl);
        sb.append(", lastQrCodeScannedAt=");
        sb.append(this.lastQrCodeScannedAt);
        sb.append(", minimalCommitTimestamp=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.minimalCommitTimestamp, ")");
    }
}
