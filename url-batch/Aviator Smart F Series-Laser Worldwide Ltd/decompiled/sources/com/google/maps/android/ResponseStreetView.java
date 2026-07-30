package com.google.maps.android;

import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class ResponseStreetView {
    private final Status status;

    public ResponseStreetView(Status status) {
        s.checkNotNullParameter(status, "status");
        this.status = status;
    }

    public static /* synthetic */ ResponseStreetView copy$default(ResponseStreetView responseStreetView, Status status, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            status = responseStreetView.status;
        }
        return responseStreetView.copy(status);
    }

    public final Status component1() {
        return this.status;
    }

    public final ResponseStreetView copy(Status status) {
        s.checkNotNullParameter(status, "status");
        return new ResponseStreetView(status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResponseStreetView) && this.status == ((ResponseStreetView) obj).status;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "ResponseStreetView(status=" + this.status + ")";
    }
}
