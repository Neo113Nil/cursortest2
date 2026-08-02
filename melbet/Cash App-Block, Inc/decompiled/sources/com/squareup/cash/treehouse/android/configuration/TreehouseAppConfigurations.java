package com.squareup.cash.treehouse.android.configuration;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TreehouseAppConfigurations {
    public final EndpointType endpoint_type;
    public final String id;
    public final String last_qr_code_manifest_url;
    public final Long last_qr_code_scanned_at;

    public TreehouseAppConfigurations(String str, EndpointType endpointType, String str2, Long l) {
        str.getClass();
        this.id = str;
        this.endpoint_type = endpointType;
        this.last_qr_code_manifest_url = str2;
        this.last_qr_code_scanned_at = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreehouseAppConfigurations)) {
            return false;
        }
        TreehouseAppConfigurations treehouseAppConfigurations = (TreehouseAppConfigurations) obj;
        return Intrinsics.areEqual(this.id, treehouseAppConfigurations.id) && this.endpoint_type == treehouseAppConfigurations.endpoint_type && Intrinsics.areEqual(this.last_qr_code_manifest_url, treehouseAppConfigurations.last_qr_code_manifest_url) && Intrinsics.areEqual(this.last_qr_code_scanned_at, treehouseAppConfigurations.last_qr_code_scanned_at);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        EndpointType endpointType = this.endpoint_type;
        int hashCode2 = (hashCode + (endpointType == null ? 0 : endpointType.hashCode())) * 31;
        String str = this.last_qr_code_manifest_url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.last_qr_code_scanned_at;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "TreehouseAppConfigurations(id=" + this.id + ", endpoint_type=" + this.endpoint_type + ", last_qr_code_manifest_url=" + this.last_qr_code_manifest_url + ", last_qr_code_scanned_at=" + this.last_qr_code_scanned_at + ")";
    }
}
