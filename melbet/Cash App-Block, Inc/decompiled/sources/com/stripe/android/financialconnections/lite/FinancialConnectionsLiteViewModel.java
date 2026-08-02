package com.stripe.android.financialconnections.lite;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final class FinancialConnectionsLiteViewModel extends ViewModel {
    public final StateFlowImpl _state;
    public final SharedFlowImpl _viewEffects;
    public final FinancialConnectionsSheetActivityArgs args;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final ToolbarTuckTargets repository;
    public final ReadonlySharedFlow viewEffects;
    public final CoroutineDispatcher workContext;

    public final class State {
        public final String cancelUrl;
        public final String hostedAuthUrl;
        public final String successUrl;

        public State(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.successUrl = str;
            this.cancelUrl = str2;
            this.hostedAuthUrl = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.successUrl, state.successUrl) && Intrinsics.areEqual(this.cancelUrl, state.cancelUrl) && this.hostedAuthUrl.equals(state.hostedAuthUrl);
        }

        public final int hashCode() {
            return this.hostedAuthUrl.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.successUrl.hashCode() * 31, 31, this.cancelUrl);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("State(successUrl=", this.successUrl, ", cancelUrl=", this.cancelUrl, ", hostedAuthUrl="), this.hostedAuthUrl, ")");
        }
    }

    public abstract class ViewEffect {

        public final class FinishWithResult extends ViewEffect {
            public final FinancialConnectionsSheetActivityResult result;

            public FinishWithResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
                this.result = financialConnectionsSheetActivityResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinishWithResult) && this.result.equals(((FinishWithResult) obj).result);
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final String toString() {
                return "FinishWithResult(result=" + this.result + ")";
            }
        }

        public final class OpenAuthFlowWithUrl extends ViewEffect {
            public final String url;

            public OpenAuthFlowWithUrl(String str) {
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAuthFlowWithUrl) && this.url.equals(((OpenAuthFlowWithUrl) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenAuthFlowWithUrl(url=", this.url, ")");
            }
        }

        public final class OpenCustomTab extends ViewEffect {
            public final String url;

            public OpenCustomTab(String str) {
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenCustomTab) && this.url.equals(((OpenCustomTab) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenCustomTab(url=", this.url, ")");
            }
        }
    }

    public FinancialConnectionsLiteViewModel(Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, SavedStateHandle savedStateHandle, ToolbarTuckTargets toolbarTuckTargets, CoroutineDispatcher coroutineDispatcher, String str) {
        logger$Companion$NOOP_LOGGER$1.getClass();
        coroutineDispatcher.getClass();
        str.getClass();
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.repository = toolbarTuckTargets;
        this.workContext = coroutineDispatcher;
        FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = (FinancialConnectionsSheetActivityArgs) savedStateHandle.get("FinancialConnectionsSheetActivityArgs");
        Continuation continuation = null;
        if (financialConnectionsSheetActivityArgs == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Missing arguments");
            throw null;
        }
        this.args = financialConnectionsSheetActivityArgs;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        this._viewEffects = MutableSharedFlow$default;
        this.viewEffects = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this._state = FlowKt.MutableStateFlow(null);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new BufferCountKt$bufferSkip$1(this, str, continuation, 10), 2);
    }

    public final void handleError(String str, Throwable th) {
        this.logger.error(str, th);
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ShimmerModifierKt$shimmer$1$1(this, th, null, 10), 3);
    }
}
