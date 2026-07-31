package androidx.privacysandbox.ads.adservices.measurement;

import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SourceRegistrationRequest.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Landroid/net/Uri;", "registrationUris", "Ljava/util/List;", "getRegistrationUris", "()Ljava/util/List;", "Landroid/view/InputEvent;", "inputEvent", "Landroid/view/InputEvent;", "getInputEvent", "()Landroid/view/InputEvent;", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.RegisterSourceOptIn
/* loaded from: classes15.dex */
public final class SourceRegistrationRequest {

    /* renamed from: inputEvent, reason: from kotlin metadata and from toString */
    private final InputEvent InputEvent;

    /* renamed from: registrationUris, reason: from kotlin metadata and from toString */
    private final List RegistrationUris;

    /* compiled from: SourceRegistrationRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest$Builder;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    public final InputEvent getInputEvent() {
        return this.InputEvent;
    }

    public final List getRegistrationUris() {
        return this.RegistrationUris;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceRegistrationRequest)) {
            return false;
        }
        SourceRegistrationRequest sourceRegistrationRequest = (SourceRegistrationRequest) other;
        return Intrinsics.areEqual(this.RegistrationUris, sourceRegistrationRequest.RegistrationUris) && Intrinsics.areEqual(this.InputEvent, sourceRegistrationRequest.InputEvent);
    }

    public int hashCode() {
        int hashCode = this.RegistrationUris.hashCode();
        InputEvent inputEvent = this.InputEvent;
        return inputEvent != null ? (hashCode * 31) + inputEvent.hashCode() : hashCode;
    }

    public String toString() {
        return "AppSourcesRegistrationRequest { " + ("RegistrationUris=[" + this.RegistrationUris + "], InputEvent=" + this.InputEvent) + " }";
    }
}
