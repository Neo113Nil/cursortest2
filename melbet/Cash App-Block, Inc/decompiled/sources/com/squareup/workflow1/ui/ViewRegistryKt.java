package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import com.bugsnag.android.TraceParser$parse$1;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.R;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo$Factory$Impl;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.workflow1.ui.WorkflowViewState;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public abstract class ViewRegistryKt {
    public static final View buildView(ViewRegistry viewRegistry, Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup, WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0) {
        viewRegistry.getClass();
        obj.getClass();
        viewEnvironment.getClass();
        context.getClass();
        Class<?> cls = obj.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        Object obj2 = ((TypedViewRegistry) viewRegistry).bindings.get(reflectionFactory.getOrCreateKotlinClass(cls));
        ViewFactory viewFactory = obj2 instanceof ViewFactory ? (ViewFactory) obj2 : null;
        if (viewFactory == null) {
            AndroidViewRendering androidViewRendering = obj instanceof AndroidViewRendering ? (AndroidViewRendering) obj : null;
            viewFactory = androidViewRendering == null ? null : androidViewRendering.getViewFactory();
            if (viewFactory == null) {
                viewFactory = null;
            }
            if (viewFactory == null) {
                NamedViewFactory namedViewFactory = (obj instanceof Named ? (Named) obj : null) != null ? NamedViewFactory.INSTANCE : null;
                if (namedViewFactory == null) {
                    StringBuilder sb = new StringBuilder("A ");
                    sb.append((Object) reflectionFactory.getOrCreateKotlinClass(ViewFactory.class).getQualifiedName());
                    sb.append(" should have been registered to display ");
                    sb.append((Object) reflectionFactory.getOrCreateKotlinClass(obj.getClass()).getQualifiedName());
                    sb.append(" instances, or that class should implement ");
                    sb.append((Object) reflectionFactory.getOrCreateKotlinClass(AndroidViewRendering.class).getSimpleName());
                    String simpleName = reflectionFactory.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
                    sb.append('<');
                    sb.append((Object) simpleName);
                    sb.append(">.");
                    throw new IllegalArgumentException(sb.toString());
                }
                viewFactory = namedViewFactory;
            }
        }
        View buildView = viewFactory.buildView(obj, viewEnvironment, context, viewGroup);
        if (WorkflowViewStateKt.getWorkflowViewStateOrNull(buildView) == null) {
            StringBuilder sb2 = new StringBuilder("View.bindShowRendering should have been called for ");
            sb2.append(buildView);
            String name = ViewFactory.class.getName();
            sb2.append(", typically by the ");
            sb2.append((Object) name);
            sb2.append(" that created it.");
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 == null) {
            return buildView;
        }
        TraceParser$parse$1 traceParser$parse$1 = new TraceParser$parse$1(15, workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0, WorkflowViewStateKt.getWorkflowViewStateAsNew(buildView).starter);
        WorkflowViewState.New workflowViewStateAsNew = WorkflowViewStateKt.getWorkflowViewStateAsNew(buildView);
        Object obj3 = workflowViewStateAsNew.showing;
        ViewEnvironment viewEnvironment2 = workflowViewStateAsNew.environment;
        Function2 function2 = workflowViewStateAsNew.showRendering;
        obj3.getClass();
        viewEnvironment2.getClass();
        buildView.setTag(R.id.workflow_ui_view_state, new WorkflowViewState.New(obj3, viewEnvironment2, function2, traceParser$parse$1));
        return buildView;
    }

    public static final RealCryptoDisclosuresRepo cryptoDisclosureRepo(RealCryptoDisclosuresRepo$Factory$Impl realCryptoDisclosuresRepo$Factory$Impl, GapComposer gapComposer) {
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            coroutineScope.getClass();
            RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = realCryptoDisclosuresRepo$Factory$Impl.delegateFactory;
            CoroutineContext coroutineContext = (CoroutineContext) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) realYouPresenter$MetroFactory.passcodeProvider.invoke();
            coroutineContext.getClass();
            androidStringManager.getClass();
            cashAccountDatabaseImpl.getClass();
            RealCryptoDisclosuresRepo realCryptoDisclosuresRepo = new RealCryptoDisclosuresRepo(coroutineContext, androidStringManager, cashAccountDatabaseImpl, coroutineScope);
            gapComposer.updateRememberedValue(realCryptoDisclosuresRepo);
            rememberedValue2 = realCryptoDisclosuresRepo;
        }
        return (RealCryptoDisclosuresRepo) rememberedValue2;
    }

    public static TelemetryErrorEvent.Error fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("stack");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("kind");
            return new TelemetryErrorEvent.Error(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e3);
            return null;
        }
    }
}
