package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import coil3.RealImageLoader;
import com.fillr.n;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dev.chrisbanes.haze.Pool;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.FormBody;

/* loaded from: classes9.dex */
public final class DocumentWorkflow_Factory implements Factory {
    public final Provider applicationContextProvider;
    public final DocumentCameraWorker_Factory documentCameraWorkerProvider;
    public final Logger_Factory documentCreateWorkerProvider;
    public final Logger_Factory documentFileDeleteWorkerProvider;
    public final SelfieDirectionFeed_Factory documentFileUploadWorkerProvider;
    public final Logger_Factory documentLoadWorkerProvider;
    public final DocumentCameraWorker_Factory documentSubmitWorkerProvider;
    public final DocumentsSelectWorker_Factory_Factory documentsSelectWorkerFactoryProvider;
    public final Provider externalEventLoggerProvider;
    public final Provider imageLoaderProvider;
    public final Provider navigationStateManagerProvider;
    public final LookupAccount_Factory permissionRequestWorkflowProvider;
    public final Provider trackingEventsLoggerProvider;

    public DocumentWorkflow_Factory(Provider provider, InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, LookupAccount_Factory lookupAccount_Factory, DocumentCameraWorker_Factory documentCameraWorker_Factory, DocumentsSelectWorker_Factory_Factory documentsSelectWorker_Factory_Factory, Logger_Factory logger_Factory, Logger_Factory logger_Factory2, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, Logger_Factory logger_Factory3, DocumentCameraWorker_Factory documentCameraWorker_Factory2, Provider provider2, Provider provider3, Provider provider4) {
        this.imageLoaderProvider = provider;
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.permissionRequestWorkflowProvider = lookupAccount_Factory;
        this.documentCameraWorkerProvider = documentCameraWorker_Factory;
        this.documentsSelectWorkerFactoryProvider = documentsSelectWorker_Factory_Factory;
        this.documentCreateWorkerProvider = logger_Factory;
        this.documentLoadWorkerProvider = logger_Factory2;
        this.documentFileUploadWorkerProvider = selfieDirectionFeed_Factory;
        this.documentFileDeleteWorkerProvider = logger_Factory3;
        this.documentSubmitWorkerProvider = documentCameraWorker_Factory2;
        this.navigationStateManagerProvider = provider2;
        this.externalEventLoggerProvider = provider3;
        this.trackingEventsLoggerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new DocumentWorkflow((RealImageLoader) this.imageLoaderProvider.get(), (Context) this.applicationContextProvider.get(), (PermissionRequestWorkflow) this.permissionRequestWorkflowProvider.get(), (DocumentCameraWorker) this.documentCameraWorkerProvider.get(), (n) this.documentsSelectWorkerFactoryProvider.get(), (Pool) this.documentCreateWorkerProvider.get(), (o0) this.documentLoadWorkerProvider.get(), (FormBody.Builder) this.documentFileUploadWorkerProvider.get(), (MatchResult.Destructured) this.documentFileDeleteWorkerProvider.get(), (TextSetter) this.documentSubmitWorkerProvider.get(), (NavigationStateManager) this.navigationStateManagerProvider.get(), (ExternalEventLogger) this.externalEventLoggerProvider.get(), (TrackingEventsLogger) this.trackingEventsLoggerProvider.get());
    }
}
