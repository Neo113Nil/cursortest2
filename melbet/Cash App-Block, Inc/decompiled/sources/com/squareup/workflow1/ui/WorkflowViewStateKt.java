package com.squareup.workflow1.ui;

import android.view.View;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.R;
import com.squareup.cash.crypto.backend.profile.BitcoinDisplayUnit;
import com.squareup.cash.crypto.backend.profile.CryptoProfileUtilsKt$WhenMappings;
import com.squareup.workflow1.ui.WorkflowViewState;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes8.dex */
public abstract class WorkflowViewStateKt {
    public static TelemetryErrorEvent.Session fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new TelemetryErrorEvent.Session(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Session", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Session", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Session", e3);
            return null;
        }
    }

    public static final WorkflowViewState getWorkflowViewState(View view) {
        view.getClass();
        WorkflowViewState workflowViewStateOrNull = getWorkflowViewStateOrNull(view);
        if (workflowViewStateOrNull != null) {
            return workflowViewStateOrNull;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Expected ", view, " to have been built by a ViewFactory. Perhaps the factory did not call View.bindShowRendering.");
        return null;
    }

    public static final WorkflowViewState.New getWorkflowViewStateAsNew(View view) {
        view.getClass();
        WorkflowViewState workflowViewState = getWorkflowViewState(view);
        WorkflowViewState.New r0 = workflowViewState instanceof WorkflowViewState.New ? (WorkflowViewState.New) workflowViewState : null;
        if (r0 != null) {
            return r0;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Expected ", view, " to be un-started, but View.start() has been called");
        return null;
    }

    public static final WorkflowViewState getWorkflowViewStateOrNull(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.workflow_ui_view_state);
        if (tag instanceof WorkflowViewState) {
            return (WorkflowViewState) tag;
        }
        return null;
    }

    public static final BitcoinDisplayUnit translateBitcoinDisplayUnit(BitcoinDisplayUnits bitcoinDisplayUnits) {
        int i = bitcoinDisplayUnits == null ? -1 : CryptoProfileUtilsKt$WhenMappings.$EnumSwitchMapping$0[bitcoinDisplayUnits.ordinal()];
        if (i == 1) {
            return BitcoinDisplayUnit.BITCOIN;
        }
        if (i == 2) {
            return BitcoinDisplayUnit.SATOSHIS;
        }
        throw new Exception("Unexpected bitcoin display unit");
    }
}
