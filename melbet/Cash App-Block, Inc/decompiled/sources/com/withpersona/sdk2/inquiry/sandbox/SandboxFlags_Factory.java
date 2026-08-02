package com.withpersona.sdk2.inquiry.sandbox;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.networking.RequestSurface;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.camera2.CameraChoiceHelper;
import com.withpersona.sdk2.inquiry.document.DocumentPendingRunner;
import com.withpersona.sdk2.inquiry.document.DocumentReviewRunner;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.internal.integrity.RealStandardIntegrityManagerFactory;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.ui.DisableableContainer;
import com.withpersona.sdk2.inquiry.modal.CustomModalViewContainer;
import com.withpersona.sdk2.inquiry.network.core.NumberAdapter;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColorAdapter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionsHelper;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes9.dex */
public final class SandboxFlags_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SandboxFlags_Factory(int i) {
        this.$r8$classId = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                SandboxFlags sandboxFlags = new SandboxFlags();
                sandboxFlags.debugForcedStatus = SandboxFlags.ForcedStatus.Passed;
                sandboxFlags.simulateGovIdNfc = true;
                return sandboxFlags;
            case 1:
                DefaultDurationProvider defaultDurationProvider = DefaultDurationProvider.instance;
                Preconditions.checkNotNullFromProvides(defaultDurationProvider);
                return defaultDurationProvider;
            case 2:
                DefaultDurationProvider defaultDurationProvider2 = DefaultDurationProvider.instance;
                Preconditions.checkNotNullFromProvides(defaultDurationProvider2);
                return defaultDurationProvider2;
            case 3:
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                Preconditions.checkNotNullFromProvides(handlerContext);
                return handlerContext;
            case 4:
                return new NativeAuthFlowCoordinator();
            case 5:
                return RequestSurface.PaymentElement;
            case 6:
                DefaultDurationProvider defaultDurationProvider3 = DefaultDurationProvider.instance;
                Preconditions.checkNotNullFromProvides(defaultDurationProvider3);
                return defaultDurationProvider3;
            case 7:
                PaymentAuthConfig paymentAuthConfig = PaymentAuthConfig.DEFAULT;
                Preconditions.checkNotNullFromProvides(paymentAuthConfig);
                return paymentAuthConfig;
            case 8:
                return new MessageVersionRegistry();
            case 9:
                return new NavigationManagerImpl();
            case 10:
                CameraChoiceHelper cameraChoiceHelper = new CameraChoiceHelper();
                cameraChoiceHelper.badCameraChoices = EmptyList.INSTANCE;
                return cameraChoiceHelper;
            case 11:
                Set set = ArraysKt___ArraysKt.toSet(new ViewFactory[]{DocumentPendingRunner.Companion, DocumentReviewRunner.Companion});
                Preconditions.checkNotNullFromProvides(set);
                return set;
            case 12:
                List list = Collections.EMPTY_LIST;
                PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactory = new PolymorphicJsonAdapterFactory(AutoClassifyResponse.class, "responseType", list, list, null);
                Set of = SetsKt__SetsJVMKt.setOf(polymorphicJsonAdapterFactory.withFallbackJsonAdapter(new JsonAdapter.AnonymousClass4(polymorphicJsonAdapterFactory, AutoClassifyResponse.Unknown.INSTANCE, false, 1)).withSubtype(AutoClassifyResponse.IdAcceptedResponse.class, "id_accepted").withSubtype(AutoClassifyResponse.ClassificationFailedResponse.class, "classification_failed").withSubtype(AutoClassifyResponse.IdRejectedResponse.class, "id_rejected"));
                Preconditions.checkNotNullFromProvides(of);
                return of;
            case 13:
                return new RealStandardIntegrityManagerFactory();
            case 14:
                EmptySet emptySet = EmptySet.INSTANCE;
                Preconditions.checkNotNullFromProvides(emptySet);
                return emptySet;
            case 15:
                Set set2 = ArraysKt___ArraysKt.toSet(new Object[]{CreateInquiryRequest.Data.Adapter, GpsCollectionRequirement.INSTANCE, GpsPrecisionRequirement.INSTANCE, ComponentParam.Adapter.INSTANCE, InquiryFieldMap.INSTANCE, NextStep.GovernmentId.SelectPage.INSTANCE, NextStep.GovernmentId.PassportNfcOption.INSTANCE, NextStep.GovernmentId.CaptureFileType.INSTANCE, NextStep.GovernmentId.VideoCaptureMethod.INSTANCE, NextStep.Selfie.CaptureFileType.INSTANCE, NextStep.Selfie.VideoCaptureMethod.INSTANCE, Button.ButtonType.INSTANCE, InputText.InputType.INSTANCE, InputText.AutofillHint.INSTANCE, InputFileUpload.PrefillItemAdapter.INSTANCE, RemoteImage.ContentType.INSTANCE, GovernmentIdNfcScan.DataGroupTypes.INSTANCE, GovernmentIdNfcScan.TipsButtonLocation.INSTANCE, UiComponentError.Companion, StyleElements.PositionType.INSTANCE, StyleElements.DPSize.INSTANCE, StyleElements.Size.INSTANCE, StyleElements.FontName.INSTANCE, StyleElements.FontWeight.INSTANCE, StyleElements.Axis.INSTANCE, JsonLogicBoolean.INSTANCE, NumberAdapter.INSTANCE, RgbaHexColorAdapter.INSTANCE, PendingPageTextPosition.INSTANCE});
                Preconditions.checkNotNullFromProvides(set2);
                return set2;
            case 16:
                Set of2 = SetsKt__SetsJVMKt.setOf(InquiryField.INSTANCE.createAdapter());
                Preconditions.checkNotNullFromProvides(of2);
                return of2;
            case 17:
                Set set3 = ArraysKt___ArraysKt.toSet(new ViewFactory[]{BackStackContainer.Companion, DisableableContainer.Companion, ScreenWithTransitionContainer.Companion});
                Preconditions.checkNotNullFromProvides(set3);
                return set3;
            case 18:
                Set set4 = ArraysKt___ArraysKt.toSet(new ViewFactory[]{CustomModalViewContainer.Companion, BackStackContainer.Companion});
                Preconditions.checkNotNullFromProvides(set4);
                return set4;
            case 19:
                Set set5 = ArraysKt___ArraysKt.toSet(new ViewFactory[]{CustomModalViewContainer.Companion, BackStackContainer.Companion});
                Preconditions.checkNotNullFromProvides(set5);
                return set5;
            case 20:
                return new PermissionsHelper();
            case 21:
                Set of3 = SetsKt__SetsJVMKt.setOf(SandboxScreenRunner.Companion);
                Preconditions.checkNotNullFromProvides(of3);
                return of3;
            case 22:
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                Preconditions.checkNotNullFromProvides(defaultScheduler2);
                return defaultScheduler2;
            default:
                DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                return defaultIoScheduler;
        }
    }

    public /* synthetic */ SandboxFlags_Factory(Object obj, int i) {
        this.$r8$classId = i;
    }
}
