package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebSourceRegistrationRequest;
import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSourceRegistrationRequest.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001&J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010 \u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0019\u0010$\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a¨\u0006'"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/measurement/WebSourceRegistrationRequest;", "convertToAdServices", "", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceParams;", "webSourceParams", "Ljava/util/List;", "getWebSourceParams", "()Ljava/util/List;", "Landroid/net/Uri;", "topOriginUri", "Landroid/net/Uri;", "getTopOriginUri", "()Landroid/net/Uri;", "Landroid/view/InputEvent;", "inputEvent", "Landroid/view/InputEvent;", "getInputEvent", "()Landroid/view/InputEvent;", "appDestination", "getAppDestination", "webDestination", "getWebDestination", "verifiedDestination", "getVerifiedDestination", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WebSourceRegistrationRequest {

    /* renamed from: appDestination, reason: from kotlin metadata and from toString */
    private final Uri AppDestination;

    /* renamed from: inputEvent, reason: from kotlin metadata and from toString */
    private final InputEvent InputEvent;

    /* renamed from: topOriginUri, reason: from kotlin metadata and from toString */
    private final Uri TopOriginUri;

    /* renamed from: verifiedDestination, reason: from kotlin metadata and from toString */
    private final Uri VerifiedDestination;

    /* renamed from: webDestination, reason: from kotlin metadata and from toString */
    private final Uri WebDestination;

    /* renamed from: webSourceParams, reason: from kotlin metadata and from toString */
    private final List WebSourceParams;

    /* compiled from: WebSourceRegistrationRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSourceRegistrationRequest)) {
            return false;
        }
        WebSourceRegistrationRequest webSourceRegistrationRequest = (WebSourceRegistrationRequest) other;
        return Intrinsics.areEqual(this.WebSourceParams, webSourceRegistrationRequest.WebSourceParams) && Intrinsics.areEqual(this.WebDestination, webSourceRegistrationRequest.WebDestination) && Intrinsics.areEqual(this.AppDestination, webSourceRegistrationRequest.AppDestination) && Intrinsics.areEqual(this.TopOriginUri, webSourceRegistrationRequest.TopOriginUri) && Intrinsics.areEqual(this.InputEvent, webSourceRegistrationRequest.InputEvent) && Intrinsics.areEqual(this.VerifiedDestination, webSourceRegistrationRequest.VerifiedDestination);
    }

    public int hashCode() {
        int hashCode = (this.WebSourceParams.hashCode() * 31) + this.TopOriginUri.hashCode();
        InputEvent inputEvent = this.InputEvent;
        if (inputEvent != null) {
            hashCode = (hashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.AppDestination;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.WebDestination;
        if (uri2 != null) {
            hashCode = (hashCode * 31) + uri2.hashCode();
        }
        int hashCode2 = (hashCode * 31) + this.TopOriginUri.hashCode();
        InputEvent inputEvent2 = this.InputEvent;
        if (inputEvent2 != null) {
            hashCode2 = (hashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.VerifiedDestination;
        return uri3 != null ? (hashCode2 * 31) + uri3.hashCode() : hashCode2;
    }

    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.WebSourceParams + "], TopOriginUri=" + this.TopOriginUri + ", InputEvent=" + this.InputEvent + ", AppDestination=" + this.AppDestination + ", WebDestination=" + this.WebDestination + ", VerifiedDestination=" + this.VerifiedDestination) + " }";
    }

    public final android.adservices.measurement.WebSourceRegistrationRequest convertToAdServices$ads_adservices_release() {
        WebSourceRegistrationRequest.Builder webDestination;
        WebSourceRegistrationRequest.Builder appDestination;
        WebSourceRegistrationRequest.Builder inputEvent;
        WebSourceRegistrationRequest.Builder verifiedDestination;
        android.adservices.measurement.WebSourceRegistrationRequest build;
        WebSourceRegistrationRequest$$ExternalSyntheticApiModelOutline1.m();
        webDestination = WebSourceRegistrationRequest$$ExternalSyntheticApiModelOutline0.m(WebSourceParams.INSTANCE.convertWebSourceParams$ads_adservices_release(this.WebSourceParams), this.TopOriginUri).setWebDestination(this.WebDestination);
        appDestination = webDestination.setAppDestination(this.AppDestination);
        inputEvent = appDestination.setInputEvent(this.InputEvent);
        verifiedDestination = inputEvent.setVerifiedDestination(this.VerifiedDestination);
        build = verifiedDestination.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(\n               …ion)\n            .build()");
        return build;
    }
}
