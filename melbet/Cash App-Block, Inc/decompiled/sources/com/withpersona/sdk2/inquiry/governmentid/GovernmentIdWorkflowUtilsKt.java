package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.squareup.cash.appmessages.db.FullScreenMessageQueries$$ExternalSyntheticLambda3;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.BottomSheetCaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public abstract class GovernmentIdWorkflowUtilsKt {
    public static final void cancel(StatefulWorkflow.RenderContext renderContext) {
        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(13)));
    }

    public static final GovernmentIdState createBackState(WorkflowAction.Updater updater, boolean z) {
        updater.getClass();
        Object obj = updater.state;
        return z ? (GovernmentIdState) obj : ((GovernmentIdState) obj).getBackState$government_id_release();
    }

    public static final String getCaptureScreenTitle(GovernmentIdWorkflow.Input.Strings strings, IdConfig.Side side, String str, String str2) {
        strings.getClass();
        side.getClass();
        str.getClass();
        String text = strings.captureScreenTitle.getText(str2, str, side);
        return text == null ? "" : text;
    }

    public static final CaptureTipsViewModel getCaptureTips(GovernmentIdWorkflow.Input input, IdConfig.Side side) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        input.getClass();
        side.getClass();
        boolean z = input.staticCaptureTipsEnabled;
        GovernmentIdWorkflow.Input.Strings strings = input.strings;
        if (z) {
            return new StaticCaptureTipsViewModel(strings.staticCaptureTipsTitle, strings.staticCaptureTipsSubtext, input.assetConfig.getCapturePage());
        }
        int ordinal = side.ordinal();
        if (ordinal == 0) {
            String str13 = strings.helpButtonText;
            if (str13 != null && (str = strings.idFrontHelpModalTitle) != null && (str2 = strings.idFrontHelpModalPrompt) != null && (str3 = strings.idFrontHelpModalHints) != null && (str4 = strings.idFrontHelpModalContinueButtonText) != null) {
                return new BottomSheetCaptureTipsViewModel(str13, str, str2, str3, str4, side);
            }
        } else if (ordinal == 1) {
            String str14 = strings.helpButtonText;
            if (str14 != null && (str5 = strings.idBackHelpModalTitle) != null && (str6 = strings.idBackHelpModalPrompt) != null && (str7 = strings.idBackHelpModalHints) != null && (str8 = strings.idBackHelpModalContinueButtonText) != null) {
                return new BottomSheetCaptureTipsViewModel(str14, str5, str6, str7, str8, side);
            }
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                String str15 = strings.helpButtonText;
                if (str15 != null && (str9 = strings.barcodeHelpModalTitle) != null && (str10 = strings.barcodeHelpModalPrompt) != null && (str11 = strings.barcodeHelpModalHints) != null && (str12 = strings.barcodeHelpModalContinueButtonText) != null) {
                    return new BottomSheetCaptureTipsViewModel(str15, str9, str10, str11, str12, side);
                }
            } else if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return null;
    }

    public static final Screen.CameraScreen.ManualCapture getManualCaptureDefaultState(GovernmentIdWorkflow.Input input, IdConfig.Side side) {
        input.getClass();
        side.getClass();
        return side == IdConfig.Side.PassportSignature ? Screen.CameraScreen.ManualCapture.Enabled : (Intrinsics.areEqual(input.countryCode, "US") || side != IdConfig.Side.Back) ? Screen.CameraScreen.ManualCapture.Hidden : Screen.CameraScreen.ManualCapture.Enabled;
    }

    public static final String getTextForHint(GovernmentIdWorkflow.Input.Strings strings, Hint hint) {
        strings.getClass();
        if (Intrinsics.areEqual(hint, HoldStillHint.INSTANCE)) {
            return strings.hintHoldStill;
        }
        if (Intrinsics.areEqual(hint, LowLightHint.INSTANCE)) {
            return strings.hintLowLight;
        }
        if (hint == null) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void goBack(StatefulWorkflow.RenderContext renderContext, POPMatchingFactory pOPMatchingFactory) {
        renderContext.getClass();
        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(14)));
    }

    public static final void handlePermissionChanged(Context context, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, boolean z) {
        context.getClass();
        renderContext.getClass();
        input.getClass();
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Permission.Camera);
        if (z && ContextUtilsKt.isMicPresent(context)) {
            mutableListOf.add(Permission.RecordAudio);
        }
        ArrayList missingPermissions = PermissionsStateKt.getMissingPermissions(context, mutableListOf);
        if (missingPermissions.isEmpty()) {
            return;
        }
        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new TextStreamsKt$$ExternalSyntheticLambda0(11, missingPermissions)));
    }

    public static void moveToNextStep$default(GovernmentIdState governmentIdState, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, GovernmentId governmentId, IdConfig idConfig, POPMatchingFactory pOPMatchingFactory, CameraProperties cameraProperties, boolean z, ArrayList arrayList, int i, String str, int i2) {
        boolean z2 = (i2 & 128) != 0 ? true : z;
        List parts$government_id_release = (i2 & 256) != 0 ? governmentIdState.getParts$government_id_release() : arrayList;
        int partIndex$government_id_release = (i2 & 512) != 0 ? governmentIdState.getPartIndex$government_id_release() : i;
        String countryCode$government_id_release = (i2 & 2048) != 0 ? governmentIdState.getCountryCode$government_id_release() : str;
        governmentIdState.getClass();
        renderContext.getClass();
        input.getClass();
        idConfig.getClass();
        pOPMatchingFactory.getClass();
        cameraProperties.getClass();
        parts$government_id_release.getClass();
        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new FullScreenMessageQueries$$ExternalSyntheticLambda3(governmentIdState, governmentId, partIndex$government_id_release, parts$government_id_release, input, pOPMatchingFactory, idConfig, z2, countryCode$government_id_release, POPMatchingFactory.videoCaptureMethod(input), cameraProperties, (String) null, renderContext)));
    }

    public static final void setOutputForWorkflow(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Output output, POPMatchingFactory pOPMatchingFactory) {
        renderContext.getClass();
        pOPMatchingFactory.getClass();
        if (!(output instanceof GovernmentIdWorkflow.Output.Finished) && !(output instanceof GovernmentIdWorkflow.Output.Back) && !(output instanceof GovernmentIdWorkflow.Output.Error)) {
            boolean z = output instanceof GovernmentIdWorkflow.Output.Canceled;
        }
        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new HCaptcha$$ExternalSyntheticLambda2(output, 16)));
    }

    public static final GovernmentId.Side toGovIdSide(IdConfig.Side side) {
        side.getClass();
        int ordinal = side.ordinal();
        if (ordinal == 0) {
            return GovernmentId.Side.FRONT;
        }
        if (ordinal == 1) {
            return GovernmentId.Side.BACK;
        }
        if (ordinal == 2) {
            return GovernmentId.Side.FRONT;
        }
        if (ordinal != 3 && ordinal != 4) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return GovernmentId.Side.BACK;
    }
}
