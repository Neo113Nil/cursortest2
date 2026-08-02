package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public abstract class ReviewScreenUtilsKt {
    public static final GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelectState(GovernmentIdState.ReviewImageState reviewImageState, List list, ArrayList arrayList, GovernmentIdState governmentIdState) {
        String str;
        String str2;
        if (arrayList.size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.first((List) arrayList);
            String str3 = idConfigForCountry.ids.size() == 1 ? ((IdConfig) CollectionsKt.first((List) idConfigForCountry.ids)).idClassKey : null;
            str = idConfigForCountry.countryCode;
            str2 = str3;
        } else {
            str = null;
            str2 = null;
        }
        return new GovernmentIdState.AutoClassificationManualSelect(reviewImageState.getCurrentPart$government_id_release$1(), reviewImageState.getUploadingIds$government_id_release(), reviewImageState.getParts$government_id_release(), reviewImageState.getPartIndex$government_id_release(), governmentIdState, reviewImageState.getCountryCode$government_id_release(), list, new CameraProperties(null, null, null, 0, 31, 0), arrayList, str, str2);
    }

    public static final void onAcceptImageClick(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, StatefulWorkflow.RenderContext renderContext, POPMatchingFactory pOPMatchingFactory, TrackingEventsLogger trackingEventsLogger) {
        input.getClass();
        reviewImageState.getClass();
        pOPMatchingFactory.getClass();
        trackingEventsLogger.getClass();
        TrackingEventsLogger.DefaultImpls.logGovernmentIdButtonClickEvent$default(trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CONTINUE, null, 2, null), false, 2, null);
        CaptureConfig captureConfig = reviewImageState.getCaptureConfig();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(16)));
        } else if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            GovernmentIdWorkflowUtilsKt.moveToNextStep$default(reviewImageState, renderContext, input, reviewImageState.getIdForReview(), ((CaptureConfig.IdCaptureConfig) captureConfig).id, pOPMatchingFactory, reviewImageState.getCameraProperties(), false, null, 0, null, 3968);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public static final void runAutoClassificationWorker(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, StatefulWorkflow.RenderContext renderContext, POPMatchingFactory pOPMatchingFactory, AutoClassifyWorker.Factory factory) {
        input.getClass();
        reviewImageState.getClass();
        pOPMatchingFactory.getClass();
        factory.getClass();
        String str = input.sessionToken;
        String str2 = input.inquiryId;
        String str3 = input.fromStep;
        String str4 = input.fromComponent;
        GovernmentId idForReview = reviewImageState.getIdForReview();
        AutoClassifyWorker.SupplementaryData supplementaryData = new AutoClassifyWorker.SupplementaryData();
        long j = input.manualCaptureButtonDelayMs;
        boolean z = input.autoClassificationConfig.extractTextFromImage;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        idForReview.getClass();
        Workflows.runningWorker(renderContext, new AutoClassifyWorker(str, str2, str3, str4, factory.service, idForReview, factory.imageHelper, supplementaryData, j, z), Reflection.typeOf(AutoClassifyWorker.class), "", new OpenSourceKt$$ExternalSyntheticLambda9(renderContext, pOPMatchingFactory, input, reviewImageState, 22));
    }
}
