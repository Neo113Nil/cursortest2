package com.withpersona.sdk2.inquiry.internal.state;

import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow_Factory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow_Factory;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow_Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class InquiryStateManager_Factory {
    public final InstanceFactory createInquiryWorkerProvider;
    public final DocumentWorkflow_Factory documentWorkflowProvider;
    public final InstanceFactory exchangeOneTimeCodeWorkerFactoryProvider;
    public final Provider externalEventLoggerProvider;
    public final Provider externalInquiryControllerProvider;
    public final Provider featureFlagManagerProvider;
    public final InstanceFactory featureFlagWorkerFactoryProvider;
    public final GovernmentIdWorkflow_Factory governmentIdWorkflowProvider;
    public final InstanceFactory inquirySessionWorkerProvider;
    public final LookupAccount_Factory integrationWorkflowProvider;
    public final Provider navigationStateManagerProvider;
    public final InstanceFactory pollingWorkerProvider;
    public final InstanceFactory restoreUiStepStateWorkerFactoryProvider;
    public final SelfieWorkflow_Factory selfieWorkflowProvider;
    public final Provider silentNetworkAuthenticationManagerProvider;
    public final Provider trackingEventsLoggerProvider;
    public final Provider trackingMetadataProvider;
    public final InstanceFactory transitionBackWorkerProvider;
    public final InstanceFactory transitionWorkerFactoryProvider;
    public final Provider uiStepSavedStateHelperProvider;
    public final UiWorkflow_Factory uiWorkflowProvider;
    public final InstanceFactory updateInquirySessionWorkerFactoryProvider;

    public InquiryStateManager_Factory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, GovernmentIdWorkflow_Factory governmentIdWorkflow_Factory, SelfieWorkflow_Factory selfieWorkflow_Factory, UiWorkflow_Factory uiWorkflow_Factory, DocumentWorkflow_Factory documentWorkflow_Factory, LookupAccount_Factory lookupAccount_Factory, CameraPreview_Factory cameraPreview_Factory, Provider provider, Provider provider2, Provider provider3, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, Provider provider4, Provider provider5, Provider provider6, DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory) {
        this.createInquiryWorkerProvider = instanceFactory;
        this.inquirySessionWorkerProvider = instanceFactory2;
        this.pollingWorkerProvider = instanceFactory3;
        this.transitionBackWorkerProvider = instanceFactory4;
        this.transitionWorkerFactoryProvider = instanceFactory5;
        this.updateInquirySessionWorkerFactoryProvider = instanceFactory6;
        this.exchangeOneTimeCodeWorkerFactoryProvider = instanceFactory7;
        this.governmentIdWorkflowProvider = governmentIdWorkflow_Factory;
        this.selfieWorkflowProvider = selfieWorkflow_Factory;
        this.uiWorkflowProvider = uiWorkflow_Factory;
        this.documentWorkflowProvider = documentWorkflow_Factory;
        this.integrationWorkflowProvider = lookupAccount_Factory;
        this.externalInquiryControllerProvider = cameraPreview_Factory;
        this.navigationStateManagerProvider = provider;
        this.externalEventLoggerProvider = provider2;
        this.uiStepSavedStateHelperProvider = provider3;
        this.restoreUiStepStateWorkerFactoryProvider = instanceFactory8;
        this.featureFlagWorkerFactoryProvider = instanceFactory9;
        this.featureFlagManagerProvider = provider4;
        this.trackingEventsLoggerProvider = provider5;
        this.trackingMetadataProvider = provider6;
        this.silentNetworkAuthenticationManagerProvider = deviceModule_AppSetIdHelperFactory;
    }
}
