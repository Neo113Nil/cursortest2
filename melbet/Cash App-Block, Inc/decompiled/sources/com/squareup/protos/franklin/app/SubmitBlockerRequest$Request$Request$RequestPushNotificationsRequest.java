package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest extends zzdh {
    public final RequestPushNotificationsRequest value;

    public SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest(RequestPushNotificationsRequest requestPushNotificationsRequest) {
        requestPushNotificationsRequest.getClass();
        this.value = requestPushNotificationsRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest) obj).value);
    }

    public final RequestPushNotificationsRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RequestPushNotificationsRequest(value=" + this.value + ")";
    }
}
