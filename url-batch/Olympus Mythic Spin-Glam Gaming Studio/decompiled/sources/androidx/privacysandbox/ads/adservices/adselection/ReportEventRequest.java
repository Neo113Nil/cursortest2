package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.ReportEventRequest;
import android.util.Log;
import android.view.InputEvent;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReportEventRequest.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0004$%&'J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\bR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/adselection/ReportEventRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/adselection/ReportEventRequest;", "convertToAdServices", "", "adSelectionId", "J", "getAdSelectionId", "()J", "eventKey", "Ljava/lang/String;", "getEventKey", "eventData", "getEventData", "reportingDestinations", "I", "getReportingDestinations", "Landroid/view/InputEvent;", "inputEvent", "Landroid/view/InputEvent;", "getInputEvent", "()Landroid/view/InputEvent;", "getInputEvent$annotations", "()V", "Companion", "Ext10Impl", "Ext8Impl", "ReportingDestination", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext8OptIn
/* loaded from: classes9.dex */
public final class ReportEventRequest {
    private final long adSelectionId;
    private final String eventData;
    private final String eventKey;
    private final InputEvent inputEvent;
    private final int reportingDestinations;

    /* compiled from: ReportEventRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$ReportingDestination;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ReportingDestination {
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final String getEventData() {
        return this.eventData;
    }

    public final int getReportingDestinations() {
        return this.reportingDestinations;
    }

    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportEventRequest)) {
            return false;
        }
        ReportEventRequest reportEventRequest = (ReportEventRequest) other;
        return this.adSelectionId == reportEventRequest.adSelectionId && Intrinsics.areEqual(this.eventKey, reportEventRequest.eventKey) && Intrinsics.areEqual(this.eventData, reportEventRequest.eventData) && this.reportingDestinations == reportEventRequest.reportingDestinations && Intrinsics.areEqual(this.inputEvent, reportEventRequest.inputEvent);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.adSelectionId) * 31) + this.eventKey.hashCode()) * 31) + this.eventData.hashCode()) * 31) + Integer.hashCode(this.reportingDestinations)) * 31;
        InputEvent inputEvent = this.inputEvent;
        return hashCode + (inputEvent != null ? inputEvent.hashCode() : 0);
    }

    public String toString() {
        return "ReportEventRequest: adSelectionId=" + this.adSelectionId + ", eventKey=" + this.eventKey + ", eventData=" + this.eventData + ", reportingDestinations=" + this.reportingDestinations + "inputEvent=" + this.inputEvent;
    }

    public final android.adservices.adselection.ReportEventRequest convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.INSTANCE.convertReportEventRequest(this);
        }
        return Ext8Impl.INSTANCE.convertReportEventRequest(this);
    }

    /* compiled from: ReportEventRequest.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext10Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: ReportEventRequest.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext10Impl$Companion;", "", "()V", "convertReportEventRequest", "Landroid/adservices/adselection/ReportEventRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.ReportEventRequest convertReportEventRequest(ReportEventRequest request) {
                ReportEventRequest.Builder inputEvent;
                android.adservices.adselection.ReportEventRequest build;
                Intrinsics.checkNotNullParameter(request, "request");
                ReportEventRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline1.m();
                inputEvent = ReportEventRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline0.m(request.getAdSelectionId(), request.getEventKey(), request.getEventData(), request.getReportingDestinations()).setInputEvent(request.getInputEvent());
                build = inputEvent.build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder(\n               …                 .build()");
                return build;
            }
        }
    }

    /* compiled from: ReportEventRequest.kt */
    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext8Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Ext8Impl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: ReportEventRequest.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest$Ext8Impl$Companion;", "", "()V", "convertReportEventRequest", "Landroid/adservices/adselection/ReportEventRequest;", "request", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final android.adservices.adselection.ReportEventRequest convertReportEventRequest(ReportEventRequest request) {
                android.adservices.adselection.ReportEventRequest build;
                Intrinsics.checkNotNullParameter(request, "request");
                if (request.getInputEvent() != null) {
                    Log.w("ReportEventRequest", "inputEvent is ignored. Min version to use inputEvent is API 31 ext 10");
                }
                ReportEventRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline1.m();
                build = ReportEventRequest$Ext10Impl$Companion$$ExternalSyntheticApiModelOutline0.m(request.getAdSelectionId(), request.getEventKey(), request.getEventData(), request.getReportingDestinations()).build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder(\n               …                 .build()");
                return build;
            }
        }
    }
}
