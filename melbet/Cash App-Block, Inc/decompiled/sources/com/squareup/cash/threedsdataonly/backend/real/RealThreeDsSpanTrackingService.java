package com.squareup.cash.threedsdataonly.backend.real;

import androidx.media3.ui.HtmlUtils;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndBlockerSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndIssuerLogoSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndSdkAuthenticationParamsSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndSdkInitializationSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartBlockerSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartIssuerLogoSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartSdkAuthenticationParamsSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartSdkInitializationSpan;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes.dex */
public final class RealThreeDsSpanTrackingService {
    public final RealObservabilityManager observabilityManager;
    public final LinkedHashMap openSpans = new LinkedHashMap();

    public RealThreeDsSpanTrackingService(RealObservabilityManager realObservabilityManager) {
        this.observabilityManager = realObservabilityManager;
    }

    public final void onAction(HtmlUtils htmlUtils) {
        if (htmlUtils instanceof ThreeDsSpanAction$StartBlockerSpan) {
            startSpan("three_ds_blocker_duration", MapsKt__MapsJVMKt.mapOf(new Pair("issuer_mode", String.valueOf(((ThreeDsSpanAction$StartBlockerSpan) htmlUtils).getIssuerMode()))));
            return;
        }
        boolean z = htmlUtils instanceof ThreeDsSpanAction$EndBlockerSpan;
        LinkedHashMap linkedHashMap = this.openSpans;
        if (z) {
            Map m = Thread$State$EnumUnboxingLocalUtility.m("sdk_pre_initialized", String.valueOf(((ThreeDsSpanAction$EndBlockerSpan) htmlUtils).getSdkPreInitialized()));
            SpanTracking spanTracking = (SpanTracking) linkedHashMap.remove("three_ds_blocker_duration");
            if (spanTracking != null) {
                SpanTracking.spanEnded$default(spanTracking, m, 1);
                return;
            }
            return;
        }
        if (htmlUtils instanceof ThreeDsSpanAction$StartIssuerLogoSpan) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            startSpan("three_ds_issuer_logo_shown_duration", emptyMap);
            return;
        }
        if (htmlUtils instanceof ThreeDsSpanAction$EndIssuerLogoSpan) {
            EmptyMap emptyMap2 = EmptyMap.INSTANCE;
            emptyMap2.getClass();
            SpanTracking spanTracking2 = (SpanTracking) linkedHashMap.remove("three_ds_issuer_logo_shown_duration");
            if (spanTracking2 != null) {
                SpanTracking.spanEnded$default(spanTracking2, emptyMap2, 1);
                return;
            }
            return;
        }
        if (htmlUtils instanceof ThreeDsSpanAction$StartSdkInitializationSpan) {
            EmptyMap emptyMap3 = EmptyMap.INSTANCE;
            emptyMap3.getClass();
            startSpan("three_ds_sdk_initialization_duration", emptyMap3);
            return;
        }
        if (htmlUtils instanceof ThreeDsSpanAction$EndSdkInitializationSpan) {
            ThreeDsSpanAction$EndSdkInitializationSpan threeDsSpanAction$EndSdkInitializationSpan = (ThreeDsSpanAction$EndSdkInitializationSpan) htmlUtils;
            Map mapOf = MapsKt__MapsKt.mapOf(new Pair("sdk_pre_initialized", String.valueOf(threeDsSpanAction$EndSdkInitializationSpan.getSdkPreInitialized())), new Pair("sdk_initialization_failure", String.valueOf(threeDsSpanAction$EndSdkInitializationSpan.getSdkInitializationFailed())), new Pair("source", threeDsSpanAction$EndSdkInitializationSpan.getSource().name()));
            SpanTracking spanTracking3 = (SpanTracking) linkedHashMap.remove("three_ds_sdk_initialization_duration");
            if (spanTracking3 != null) {
                SpanTracking.spanEnded$default(spanTracking3, mapOf, 1);
                return;
            }
            return;
        }
        if (htmlUtils instanceof ThreeDsSpanAction$StartSdkAuthenticationParamsSpan) {
            startSpan("three_ds_authentication_params_duration", MapsKt__MapsJVMKt.mapOf(new Pair("pre_authentication_params_enabled", String.valueOf(((ThreeDsSpanAction$StartSdkAuthenticationParamsSpan) htmlUtils).getPreAuthenticationParamsEnabled()))));
            return;
        }
        if (!(htmlUtils instanceof ThreeDsSpanAction$EndSdkAuthenticationParamsSpan)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        EmptyMap emptyMap4 = EmptyMap.INSTANCE;
        emptyMap4.getClass();
        SpanTracking spanTracking4 = (SpanTracking) linkedHashMap.remove("three_ds_authentication_params_duration");
        if (spanTracking4 != null) {
            SpanTracking.spanEnded$default(spanTracking4, emptyMap4, 1);
        }
    }

    public final void startSpan(String str, Map map) {
        String str2;
        SpanTracking startTrackingSpan$default;
        LinkedHashMap linkedHashMap = this.openSpans;
        SpanTracking spanTracking = (SpanTracking) linkedHashMap.get("three_ds_blocker_duration");
        if (spanTracking != null) {
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            startTrackingSpan$default = SpanTracking.childSpanStarted$default(spanTracking, uuid, str, map, 8);
            str2 = str;
        } else {
            String uuid2 = UUID.randomUUID().toString();
            uuid2.getClass();
            str2 = str;
            startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default(this.observabilityManager, uuid2, str2, map, null, 8);
        }
        linkedHashMap.put(str2, startTrackingSpan$default);
    }
}
