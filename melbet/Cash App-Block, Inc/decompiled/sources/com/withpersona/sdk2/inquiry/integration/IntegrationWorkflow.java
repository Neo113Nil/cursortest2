package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStepKt;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import papa.InputEventTrigger;

/* loaded from: classes9.dex */
public final class IntegrationWorkflow extends StatefulWorkflow {
    public final Context applicationContext;
    public final IntegrationBrowserWorker.Factory integrationBrowserWorkerFactory;
    public final NavigationStateManager navigationStateManager;
    public final TrackingEventsLogger trackingEventsLogger;

    public interface Event {

        public final class Back implements Event {
            public static final Back INSTANCE = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return 224778200;
            }

            public final String toString() {
                return Constants.META_BACK_BUTTON;
            }
        }

        public final class Cancel implements Event {
            public static final Cancel INSTANCE = new Cancel();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancel);
            }

            public final int hashCode() {
                return 1292437803;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        public final class OpenBrowser implements Event {
            public static final OpenBrowser INSTANCE = new OpenBrowser();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenBrowser);
            }

            public final int hashCode() {
                return 1979122029;
            }

            public final String toString() {
                return "OpenBrowser";
            }
        }
    }

    public final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final boolean backStepEnabled;
        public final boolean cancelButtonEnabled;
        public final String flowUrl;
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;
        public final boolean isSubmitting;
        public final String redirectPath;
        public final String sessionToken;
        public final IntegrationPage startPage;
        public final String stepName;
        public final StepStyles.IntegrationStepStyle styles;
        public final InternalErrorInfo transitionError;

        /* renamed from: type, reason: collision with root package name */
        public final String f1455type;

        public final class Creator implements Parcelable.Creator {
            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r18) {
                /*
                    r17 = this;
                    r0 = r18
                    r0.getClass()
                    com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$Input r1 = new com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$Input
                    r2 = r1
                    java.lang.String r1 = r0.readString()
                    r3 = r2
                    java.lang.String r2 = r0.readString()
                    r4 = r3
                    java.lang.String r3 = r0.readString()
                    r5 = r4
                    java.lang.String r4 = r0.readString()
                    r6 = r5
                    java.lang.String r5 = r0.readString()
                    r7 = r6
                    java.lang.String r6 = r0.readString()
                    java.lang.String r8 = r0.readString()
                    com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType r8 = com.withpersona.sdk2.inquiry.network.dto.NextStep.Integration.IntegrationStepBrowserType.valueOf(r8)
                    int r9 = r0.readInt()
                    r11 = 1
                    if (r9 == 0) goto L38
                    r9 = r7
                    r7 = r8
                    r8 = r11
                    goto L3b
                L38:
                    r9 = r7
                    r7 = r8
                    r8 = 0
                L3b:
                    int r12 = r0.readInt()
                    if (r12 == 0) goto L44
                    r12 = r9
                    r9 = r11
                    goto L46
                L44:
                    r12 = r9
                    r9 = 0
                L46:
                    java.lang.Class<com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$Input> r13 = com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.Input.class
                    java.lang.ClassLoader r14 = r13.getClassLoader()
                    android.os.Parcelable r14 = r0.readParcelable(r14)
                    com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r14 = (com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig) r14
                    java.lang.ClassLoader r15 = r13.getClassLoader()
                    android.os.Parcelable r15 = r0.readParcelable(r15)
                    com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle r15 = (com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles.IntegrationStepStyle) r15
                    java.lang.ClassLoader r13 = r13.getClassLoader()
                    android.os.Parcelable r13 = r0.readParcelable(r13)
                    com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r13 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo) r13
                    int r16 = r0.readInt()
                    if (r16 != 0) goto L6f
                    r16 = 0
                    goto L75
                L6f:
                    android.os.Parcelable$Creator<com.withpersona.sdk2.inquiry.integration.IntegrationPage> r10 = com.withpersona.sdk2.inquiry.integration.IntegrationPage.CREATOR
                    java.lang.Object r16 = r10.createFromParcel(r0)
                L75:
                    com.withpersona.sdk2.inquiry.integration.IntegrationPage r16 = (com.withpersona.sdk2.inquiry.integration.IntegrationPage) r16
                    int r0 = r0.readInt()
                    r10 = r14
                    if (r0 == 0) goto L85
                    r14 = r11
                    r0 = r12
                    r12 = r13
                    r13 = r16
                    r11 = r15
                    goto L8b
                L85:
                    r14 = 0
                    r0 = r12
                    r12 = r13
                    r11 = r15
                    r13 = r16
                L8b:
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.Input.Creator.createFromParcel(android.os.Parcel):java.lang.Object");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Input[i];
            }
        }

        public Input(String str, String str2, String str3, String str4, String str5, String str6, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, boolean z, boolean z2, InquirySessionConfig inquirySessionConfig, StepStyles.IntegrationStepStyle integrationStepStyle, InternalErrorInfo internalErrorInfo, IntegrationPage integrationPage, boolean z3) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
            str6.getClass();
            integrationStepBrowserType.getClass();
            inquirySessionConfig.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.stepName = str3;
            this.f1455type = str4;
            this.flowUrl = str5;
            this.redirectPath = str6;
            this.integrationStepBrowserType = integrationStepBrowserType;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.inquirySessionConfig = inquirySessionConfig;
            this.styles = integrationStepStyle;
            this.transitionError = internalErrorInfo;
            this.startPage = integrationPage;
            this.isSubmitting = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            return Intrinsics.areEqual(this.inquiryId, input.inquiryId) && Intrinsics.areEqual(this.sessionToken, input.sessionToken) && Intrinsics.areEqual(this.stepName, input.stepName) && Intrinsics.areEqual(this.f1455type, input.f1455type) && Intrinsics.areEqual(this.flowUrl, input.flowUrl) && Intrinsics.areEqual(this.redirectPath, input.redirectPath) && this.integrationStepBrowserType == input.integrationStepBrowserType && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.areEqual(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.areEqual(this.styles, input.styles) && Intrinsics.areEqual(this.transitionError, input.transitionError) && Intrinsics.areEqual(this.startPage, input.startPage) && this.isSubmitting == input.isSubmitting;
        }

        public final int hashCode() {
            int hashCode = (this.inquirySessionConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.integrationStepBrowserType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken), 31, this.stepName), 31, this.f1455type), 31, this.flowUrl), 31, this.redirectPath)) * 31, 31, this.backStepEnabled), 31, this.cancelButtonEnabled)) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int hashCode2 = (hashCode + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int hashCode3 = (hashCode2 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31;
            IntegrationPage integrationPage = this.startPage;
            return Boolean.hashCode(this.isSubmitting) + ((hashCode3 + (integrationPage != null ? integrationPage.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Input(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", stepName=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.stepName, ", type=", this.f1455type, ", flowUrl=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.flowUrl, ", redirectPath=", this.redirectPath, ", integrationStepBrowserType=");
            m.append(this.integrationStepBrowserType);
            m.append(", backStepEnabled=");
            m.append(this.backStepEnabled);
            m.append(", cancelButtonEnabled=");
            m.append(this.cancelButtonEnabled);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", transitionError=");
            m.append(this.transitionError);
            m.append(", startPage=");
            m.append(this.startPage);
            m.append(", isSubmitting=");
            m.append(this.isSubmitting);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.stepName);
            parcel.writeString(this.f1455type);
            parcel.writeString(this.flowUrl);
            parcel.writeString(this.redirectPath);
            parcel.writeString(this.integrationStepBrowserType.name());
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeParcelable(this.inquirySessionConfig, i);
            parcel.writeParcelable(this.styles, i);
            parcel.writeParcelable(this.transitionError, i);
            IntegrationPage integrationPage = this.startPage;
            if (integrationPage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                integrationPage.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.isSubmitting ? 1 : 0);
        }
    }

    public interface Output {

        public final class Back implements Output {
            public static final Back INSTANCE = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return -1494152841;
            }

            public final String toString() {
                return Constants.META_BACK_BUTTON;
            }
        }

        public final class Cancel implements Output {
            public static final Cancel INSTANCE = new Cancel();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancel);
            }

            public final int hashCode() {
                return -1332850934;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        public final class Error implements Output {
            public static final Error INSTANCE = new Error();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                return 929193848;
            }

            public final String toString() {
                return "Error";
            }
        }

        public final class Finished implements Output {
            public static final Finished INSTANCE = new Finished();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Finished);
            }

            public final int hashCode() {
                return -1519977214;
            }

            public final String toString() {
                return "Finished";
            }
        }
    }

    public IntegrationWorkflow(Context context, NavigationStateManager navigationStateManager, IntegrationBrowserWorker.Factory factory, TrackingEventsLogger trackingEventsLogger) {
        context.getClass();
        navigationStateManager.getClass();
        factory.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = factory;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object initialState(Object obj, Snapshot snapshot) {
        ((Input) obj).getClass();
        if (snapshot != null) {
            ByteString bytes = snapshot.bytes();
            Parcelable parcelable = null;
            if (bytes.getSize$okio() <= 0) {
                bytes = null;
            }
            if (bytes != null) {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                byte[] byteArray = bytes.toByteArray();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                parcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                parcelable.getClass();
                obtain.recycle();
            }
            IntegrationWorkflow$State$Starting integrationWorkflow$State$Starting = (IntegrationWorkflow$State$Starting) parcelable;
            if (integrationWorkflow$State$Starting != null) {
                return integrationWorkflow$State$Starting;
            }
        }
        return new IntegrationWorkflow$State$Starting(IntegrationWorkflow$PendingAction$OpenBrowser.INSTANCE);
    }

    public final void onEvent(StatefulWorkflow.RenderContext renderContext, Event event) {
        BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
        if (event instanceof Event.Back) {
            baseRenderContext.getActionSink().send(Workflows.action$default(this, new SelfieWorkflow$$ExternalSyntheticLambda79(3)));
            return;
        }
        if (event instanceof Event.Cancel) {
            baseRenderContext.getActionSink().send(Workflows.action$default(this, new SelfieWorkflow$$ExternalSyntheticLambda79(4)));
        } else if (event instanceof Event.OpenBrowser) {
            baseRenderContext.getActionSink().send(Workflows.action$default(this, new SelfieWorkflow$$ExternalSyntheticLambda79(5)));
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object render(Object obj, Object obj2, final StatefulWorkflow.RenderContext renderContext) {
        IntentFilter intentFilter;
        boolean z;
        Input input = (Input) obj;
        IntegrationWorkflow$State$Starting integrationWorkflow$State$Starting = (IntegrationWorkflow$State$Starting) obj2;
        input.getClass();
        integrationWorkflow$State$Starting.getClass();
        IntegrationWorkflow$PendingAction$OpenBrowser integrationWorkflow$PendingAction$OpenBrowser = integrationWorkflow$State$Starting.pendingAction;
        final int i = 1;
        final int i2 = 0;
        if (integrationWorkflow$PendingAction$OpenBrowser != null) {
            Context context = this.applicationContext;
            context.getClass();
            String packageName = InputEventTrigger.Companion.getPackageName(context);
            if (packageName != null) {
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && packageName.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory("androidx.browser.auth.category.AuthTab")) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            TrackingEventsLogger.DefaultImpls.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, input.flowUrl, Boolean.valueOf(z), null, 8, null), false, 2, null);
            String str = input.flowUrl;
            String str2 = input.redirectPath;
            NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = input.integrationStepBrowserType;
            C0349IntegrationBrowserWorker_Factory c0349IntegrationBrowserWorker_Factory = ((IntegrationBrowserWorker_Factory_Impl) this.integrationBrowserWorkerFactory).delegateFactory;
            Workflows.runningWorker(renderContext, new IntegrationBrowserWorker((Context) c0349IntegrationBrowserWorker_Factory.applicationContextProvider.get(), (ActivityResultLauncher) c0349IntegrationBrowserWorker_Factory.customTabsLauncherProvider.get(), str, str2, z, integrationStepBrowserType), Reflection.typeOf(IntegrationBrowserWorker.class), "", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(this, input, z, integrationWorkflow$State$Starting, 20));
        } else if (integrationWorkflow$PendingAction$OpenBrowser != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        boolean z2 = input.backStepEnabled;
        IntegrationPage integrationPage = input.startPage;
        boolean z3 = input.isSubmitting;
        boolean z4 = input.cancelButtonEnabled;
        boolean z5 = integrationWorkflow$PendingAction$OpenBrowser == null && !z3;
        NavigationStateManager navigationStateManager = this.navigationStateManager;
        NavigationStateManager.setState$default(navigationStateManager, z2, z4, z5, 8);
        integrationPage.getClass();
        UiComponentScreen uiComponentScreen = NestedUiStepKt.to(integrationPage);
        NavigationState navigationState = navigationStateManager.getNavigationState();
        Function0 function0 = new Function0(this) { // from class: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$$ExternalSyntheticLambda1
            public final /* synthetic */ IntegrationWorkflow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                StatefulWorkflow.RenderContext renderContext2 = renderContext;
                IntegrationWorkflow integrationWorkflow = this.f$0;
                switch (i3) {
                    case 0:
                        integrationWorkflow.onEvent(renderContext2, IntegrationWorkflow.Event.Back.INSTANCE);
                        break;
                    default:
                        integrationWorkflow.onEvent(renderContext2, IntegrationWorkflow.Event.Cancel.INSTANCE);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Function0 function02 = new Function0(this) { // from class: com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$$ExternalSyntheticLambda1
            public final /* synthetic */ IntegrationWorkflow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                StatefulWorkflow.RenderContext renderContext2 = renderContext;
                IntegrationWorkflow integrationWorkflow = this.f$0;
                switch (i3) {
                    case 0:
                        integrationWorkflow.onEvent(renderContext2, IntegrationWorkflow.Event.Back.INSTANCE);
                        break;
                    default:
                        integrationWorkflow.onEvent(renderContext2, IntegrationWorkflow.Event.Cancel.INSTANCE);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = integrationPage.openBrowserButton;
        HCaptcha$$ExternalSyntheticLambda1 hCaptcha$$ExternalSyntheticLambda1 = new HCaptcha$$ExternalSyntheticLambda1(18, this, renderContext);
        if (str3 != null) {
            linkedHashMap.put(str3, hCaptcha$$ExternalSyntheticLambda1);
        }
        IntegrationView integrationView = new IntegrationView(uiComponentScreen, navigationState, function0, function02, MapsKt___MapsKt.toList(linkedHashMap), integrationWorkflow$PendingAction$OpenBrowser != null || z3);
        new ModalContainerScreen(integrationView, "PermissionFlowModal", EmptyList.INSTANCE);
        return integrationView;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Snapshot snapshotState(Object obj) {
        IntegrationWorkflow$State$Starting integrationWorkflow$State$Starting = (IntegrationWorkflow$State$Starting) obj;
        integrationWorkflow$State$Starting.getClass();
        return SnapshotParcelsKt.toSnapshot(integrationWorkflow$State$Starting);
    }
}
