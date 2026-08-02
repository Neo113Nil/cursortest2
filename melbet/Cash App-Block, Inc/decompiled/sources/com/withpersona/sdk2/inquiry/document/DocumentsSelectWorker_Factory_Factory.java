package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.fillr.n;
import com.squareup.workflow1.ui.BuilderViewFactory;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.camera2.CameraChoiceHelper;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class DocumentsSelectWorker_Factory_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider contextProvider;
    public final Provider openDocumentLauncherProvider;
    public final Provider sdkFilesManagerProvider;
    public final Provider selectFromPhotoLibraryLauncherProvider;

    public /* synthetic */ DocumentsSelectWorker_Factory_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, int i) {
        this.$r8$classId = i;
        this.openDocumentLauncherProvider = provider;
        this.selectFromPhotoLibraryLauncherProvider = provider2;
        this.contextProvider = provider3;
        this.sdkFilesManagerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.sdkFilesManagerProvider;
        Provider provider2 = this.contextProvider;
        Provider provider3 = this.selectFromPhotoLibraryLauncherProvider;
        Provider provider4 = this.openDocumentLauncherProvider;
        switch (i) {
            case 0:
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) provider4.get();
                ActivityResultLauncher activityResultLauncher2 = (ActivityResultLauncher) provider3.get();
                Context context = (Context) provider2.get();
                SdkFilesManager sdkFilesManager = (SdkFilesManager) provider.get();
                activityResultLauncher.getClass();
                activityResultLauncher2.getClass();
                context.getClass();
                sdkFilesManager.getClass();
                n nVar = new n();
                nVar.a = activityResultLauncher;
                nVar.b = activityResultLauncher2;
                nVar.c = context;
                nVar.d = sdkFilesManager;
                return nVar;
            case 1:
                return new PollAttachPaymentAccount((FinancialConnectionsAccountsRepositoryImpl) provider4.get(), (RealConsumerSessionRepository) provider3.get(), (AttachedPaymentAccountRepository) provider2.get(), (FinancialConnectionsSheetConfiguration) provider.get());
            case 2:
                return new RealCreateInstantDebitsResult((FinancialConnectionsConsumerSessionRepositoryImpl) provider4.get(), (FinancialConnectionsRepositoryImpl) provider3.get(), (RealConsumerSessionRepository) provider2.get(), (ElementsSessionContext) provider.get());
            case 3:
                return new BuilderViewFactory((GovernmentIdFeed) provider4.get(), (CameraPreview) provider3.get(), (FeatureFlagManager) provider2.get(), (TrackingEventsLogger) provider.get());
            case 4:
                return new BuilderViewFactory((CameraPreview) provider4.get(), DoubleCheck.lazy(provider3), (CameraChoiceHelper) provider2.get(), (TrackingEventsLogger) provider.get());
            default:
                return new BuilderViewFactory((CameraPreview) provider4.get(), DoubleCheck.lazy(provider3), (TrackingEventsLogger) provider2.get(), (FeatureFlagManager) provider.get());
        }
    }
}
