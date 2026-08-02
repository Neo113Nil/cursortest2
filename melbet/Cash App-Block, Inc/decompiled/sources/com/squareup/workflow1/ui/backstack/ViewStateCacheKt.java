package com.squareup.workflow1.ui.backstack;

import android.view.View;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo;
import com.squareup.workflow1.ui.Named;
import com.squareup.workflow1.ui.WorkflowViewState;
import com.squareup.workflow1.ui.WorkflowViewStateKt;
import dev.zacsweers.metro.Provider;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public abstract class ViewStateCacheKt {
    public static final String access$getNamedKey(View view) {
        WorkflowViewState workflowViewStateOrNull = WorkflowViewStateKt.getWorkflowViewStateOrNull(view);
        Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
        Named named = showing == null ? null : (Named) showing;
        String str = named == null ? null : named.compatibilityKey;
        if (str != null) {
            return str;
        }
        Handlers$$ExternalSyntheticBUOutline0.m("Expected ", view, " to be showing a Named<*> rendering, found ", named);
        return null;
    }

    public static TelemetryErrorEvent.View fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new TelemetryErrorEvent.View(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type View", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type View", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type View", e3);
            return null;
        }
    }

    public static StablecoinNetworkRepo provideStablecoinNetworkRepo$real(Provider provider, Provider provider2, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        provider.getClass();
        provider2.getClass();
        return (StablecoinNetworkRepo) (cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? provider2.invoke() : provider.invoke());
    }
}
