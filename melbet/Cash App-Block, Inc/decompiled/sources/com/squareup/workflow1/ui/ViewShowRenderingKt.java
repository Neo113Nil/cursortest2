package com.squareup.workflow1.ui;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.workflow1.ui.NamedViewFactory;
import com.squareup.workflow1.ui.WorkflowViewState;
import kotlin.jvm.functions.Function2;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public abstract class ViewShowRenderingKt {
    public static final void bindShowRendering(View view, Object obj, ViewEnvironment viewEnvironment, Function2 function2) {
        view.getClass();
        obj.getClass();
        viewEnvironment.getClass();
        view.setTag(R.id.workflow_ui_view_state, WorkflowViewStateKt.getWorkflowViewStateOrNull(view) instanceof WorkflowViewState.New ? new WorkflowViewState.New(obj, viewEnvironment, function2, WorkflowViewStateKt.getWorkflowViewStateAsNew(view).starter) : new WorkflowViewState.New(obj, viewEnvironment, function2, NamedViewFactory.AnonymousClass1.INSTANCE$2));
    }

    public static final boolean canShowRendering(View view, Object obj) {
        view.getClass();
        obj.getClass();
        WorkflowViewState workflowViewStateOrNull = WorkflowViewStateKt.getWorkflowViewStateOrNull(view);
        Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
        Object obj2 = showing != null ? showing : null;
        return obj2 != null && CompatibleKt.compatible(obj2, obj);
    }

    public static final DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 displayUnitProto(RealBitcoinProfileRepo realBitcoinProfileRepo) {
        realBitcoinProfileRepo.getClass();
        return new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new CardModelView$cardHeat$$inlined$map$1(realBitcoinProfileRepo.getProfile(), 22), 26);
    }

    public static TelemetryErrorEvent.Os fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("build");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("name");
            String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("version");
            return new TelemetryErrorEvent.Os(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e3);
            return null;
        }
    }

    public static final void showRendering(View view, Object obj, ViewEnvironment viewEnvironment) {
        view.getClass();
        obj.getClass();
        viewEnvironment.getClass();
        WorkflowViewState workflowViewState = WorkflowViewStateKt.getWorkflowViewState(view);
        WorkflowViewState.Started started = workflowViewState instanceof WorkflowViewState.Started ? (WorkflowViewState.Started) workflowViewState : null;
        if (started == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Expected ", view, " to have been started, but View.start() has not been called");
            return;
        }
        Function2 function2 = started.showRendering;
        Object obj2 = started.showing;
        if (CompatibleKt.compatible(obj2, obj)) {
            view.setTag(R.id.workflow_ui_view_state, new WorkflowViewState.Started(obj, viewEnvironment, function2));
            function2.invoke(obj, viewEnvironment);
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(view);
        sb.append(" to be able to show rendering ");
        sb.append(obj);
        sb.append(", but that did not match previous rendering ");
        Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline1.m(sb, obj2, ". Consider using WorkflowViewStub to display arbitrary types."));
    }

    public static final void start(View view) {
        view.getClass();
        WorkflowViewState.New workflowViewStateAsNew = WorkflowViewStateKt.getWorkflowViewStateAsNew(view);
        view.setTag(R.id.workflow_ui_view_state, new WorkflowViewState.Started(workflowViewStateAsNew.showing, workflowViewStateAsNew.environment, workflowViewStateAsNew.showRendering));
        workflowViewStateAsNew.starter.invoke(view);
    }
}
