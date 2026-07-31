package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.WebTriggerParams;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebTriggerParams.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "registrationUri", "Landroid/net/Uri;", "getRegistrationUri", "()Landroid/net/Uri;", "debugKeyAllowed", "Z", "getDebugKeyAllowed", "()Z", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebTriggerParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: debugKeyAllowed, reason: from kotlin metadata and from toString */
    private final boolean DebugKeyAllowed;
    private final Uri registrationUri;

    public final boolean getDebugKeyAllowed() {
        return this.DebugKeyAllowed;
    }

    public final Uri getRegistrationUri() {
        return this.registrationUri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebTriggerParams)) {
            return false;
        }
        WebTriggerParams webTriggerParams = (WebTriggerParams) other;
        return Intrinsics.areEqual(this.registrationUri, webTriggerParams.registrationUri) && this.DebugKeyAllowed == webTriggerParams.DebugKeyAllowed;
    }

    public int hashCode() {
        return (this.registrationUri.hashCode() * 31) + Boolean.hashCode(this.DebugKeyAllowed);
    }

    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.registrationUri + ", DebugKeyAllowed=" + this.DebugKeyAllowed + " }";
    }

    /* compiled from: WebTriggerParams.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerParams$Companion;", "", "()V", "convertWebTriggerParams", "", "Landroid/adservices/measurement/WebTriggerParams;", "request", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerParams;", "convertWebTriggerParams$ads_adservices_release", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List convertWebTriggerParams$ads_adservices_release(List request) {
            WebTriggerParams.Builder debugKeyAllowed;
            android.adservices.measurement.WebTriggerParams build;
            Intrinsics.checkNotNullParameter(request, "request");
            ArrayList arrayList = new ArrayList();
            Iterator it = request.iterator();
            while (it.hasNext()) {
                WebTriggerParams webTriggerParams = (WebTriggerParams) it.next();
                WebTriggerParams$Companion$$ExternalSyntheticApiModelOutline1.m();
                debugKeyAllowed = WebTriggerParams$Companion$$ExternalSyntheticApiModelOutline0.m(webTriggerParams.getRegistrationUri()).setDebugKeyAllowed(webTriggerParams.getDebugKeyAllowed());
                build = debugKeyAllowed.build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder(param.registrati…                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }
    }
}
