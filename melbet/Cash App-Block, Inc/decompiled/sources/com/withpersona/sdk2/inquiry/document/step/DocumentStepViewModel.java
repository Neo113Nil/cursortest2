package com.withpersona.sdk2.inquiry.document.step;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import app.cash.zipline.loader.ZiplineLoader;
import coil3.RealImageLoader;
import com.fillr.n;
import com.squareup.scannerview.TextSetter;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker_Factory_Factory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import dev.chrisbanes.haze.Pool;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.FormBody;

/* loaded from: classes8.dex */
public final class DocumentStepViewModel extends ViewModel {
    public final DocumentStepStateManager stateManager;

    public DocumentStepViewModel(SavedStateHandle savedStateHandle, DocumentWorkflow.Input input, DocumentStepStateManager_Factory_Impl documentStepStateManager_Factory_Impl) {
        savedStateHandle.getClass();
        input.getClass();
        documentStepStateManager_Factory_Impl.getClass();
        ZiplineLoader ziplineLoader = documentStepStateManager_Factory_Impl.delegateFactory;
        this.stateManager = new DocumentStepStateManager(input, savedStateHandle, (RealImageLoader) ((Provider) ziplineLoader.dispatcher).get(), (Context) ((Provider) ziplineLoader.cacheDispatcher).get(), (DocumentCameraWorker) ((DocumentCameraWorker_Factory) ziplineLoader.manifestVerifier).get(), (n) ((DocumentsSelectWorker_Factory_Factory) ziplineLoader.httpFetcher).get(), (Pool) ((Logger_Factory) ziplineLoader.eventListenerFactory).get(), (o0) ((Logger_Factory) ziplineLoader.nowEpochMs).get(), (FormBody.Builder) ((SelfieDirectionFeed_Factory) ziplineLoader.embeddedDir).get(), (MatchResult.Destructured) ((Logger_Factory) ziplineLoader.embeddedFileSystem).get(), (TextSetter) ((DocumentCameraWorker_Factory) ziplineLoader.cache).get(), (NavigationStateManager) ((Provider) ziplineLoader.concurrentDownloadsSemaphore).get(), (ExternalEventLogger) ((Provider) ziplineLoader.embeddedFetcher).get(), (TrackingEventsLogger) ((Provider) ziplineLoader.cachingFetcher).get(), (PermissionRequestWorker_Factory_Impl) ((InstanceFactory) ziplineLoader.moduleFetchers).instance);
    }
}
