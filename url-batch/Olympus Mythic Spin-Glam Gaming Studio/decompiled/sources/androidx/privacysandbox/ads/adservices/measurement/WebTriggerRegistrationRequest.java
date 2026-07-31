package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebTriggerRegistrationRequest.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "convertToAdServices", "", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerParams;", "webTriggerParams", "Ljava/util/List;", "getWebTriggerParams", "()Ljava/util/List;", "Landroid/net/Uri;", ShareConstants.DESTINATION, "Landroid/net/Uri;", "getDestination", "()Landroid/net/Uri;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebTriggerRegistrationRequest {

    /* renamed from: destination, reason: from kotlin metadata and from toString */
    private final Uri Destination;
    private final List webTriggerParams;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) other;
        return Intrinsics.areEqual(this.webTriggerParams, webTriggerRegistrationRequest.webTriggerParams) && Intrinsics.areEqual(this.Destination, webTriggerRegistrationRequest.Destination);
    }

    public int hashCode() {
        return (this.webTriggerParams.hashCode() * 31) + this.Destination.hashCode();
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.Destination;
    }

    public final android.adservices.measurement.WebTriggerRegistrationRequest convertToAdServices$ads_adservices_release() {
        android.adservices.measurement.WebTriggerRegistrationRequest build;
        WebTriggerRegistrationRequest$$ExternalSyntheticApiModelOutline1.m();
        build = WebTriggerRegistrationRequest$$ExternalSyntheticApiModelOutline0.m(WebTriggerParams.INSTANCE.convertWebTriggerParams$ads_adservices_release(this.webTriggerParams), this.Destination).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(\n               …   )\n            .build()");
        return build;
    }
}
