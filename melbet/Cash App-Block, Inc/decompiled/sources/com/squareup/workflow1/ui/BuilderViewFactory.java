package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.camera2.CameraChoiceHelper;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.Lazy;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes9.dex */
public final class BuilderViewFactory implements ViewFactory {
    public final /* synthetic */ int $r8$classId = 2;

    /* renamed from: type, reason: collision with root package name */
    public final Object f1422type;
    public final Object viewConstructor;

    public BuilderViewFactory(GovernmentIdFeed governmentIdFeed, CameraPreview cameraPreview, FeatureFlagManager featureFlagManager, TrackingEventsLogger trackingEventsLogger) {
        governmentIdFeed.getClass();
        cameraPreview.getClass();
        featureFlagManager.getClass();
        trackingEventsLogger.getClass();
        this.f1422type = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(Screen.CameraScreen.class), new TabToolbarsKt$$ExternalSyntheticLambda16(governmentIdFeed, cameraPreview, featureFlagManager, trackingEventsLogger, 9));
        this.viewConstructor = trackingEventsLogger;
    }

    @Override // com.squareup.workflow1.ui.ViewFactory
    public final View buildView(Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup) {
        int i = this.$r8$classId;
        Object obj2 = this.f1422type;
        switch (i) {
            case 0:
                obj.getClass();
                viewEnvironment.getClass();
                context.getClass();
                return (View) ((Function4) this.viewConstructor).invoke(obj, viewEnvironment, context, viewGroup);
            case 1:
                Screen.CameraScreen cameraScreen = (Screen.CameraScreen) obj;
                cameraScreen.getClass();
                viewEnvironment.getClass();
                context.getClass();
                return ((BuilderViewFactory) obj2).buildView(cameraScreen, viewEnvironment, context, viewGroup);
            case 2:
                SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen = (SelfieWorkflow.Screen.OldCameraScreen) obj;
                oldCameraScreen.getClass();
                viewEnvironment.getClass();
                context.getClass();
                return ((BuilderViewFactory) obj2).buildView(oldCameraScreen, viewEnvironment, context, viewGroup);
            default:
                SelfieWorkflow.Screen.CameraScreen cameraScreen2 = (SelfieWorkflow.Screen.CameraScreen) obj;
                cameraScreen2.getClass();
                viewEnvironment.getClass();
                context.getClass();
                return ((BuilderViewFactory) obj2).buildView(cameraScreen2, viewEnvironment, context, viewGroup);
        }
    }

    @Override // com.squareup.workflow1.ui.ViewFactory
    public final KClass getType() {
        switch (this.$r8$classId) {
        }
        return (KClass) ((BuilderViewFactory) this.f1422type).f1422type;
    }

    public BuilderViewFactory(KClass kClass, Function4 function4) {
        kClass.getClass();
        this.f1422type = kClass;
        this.viewConstructor = function4;
    }

    public BuilderViewFactory(CameraPreview cameraPreview, Lazy lazy, CameraChoiceHelper cameraChoiceHelper, TrackingEventsLogger trackingEventsLogger) {
        cameraPreview.getClass();
        lazy.getClass();
        cameraChoiceHelper.getClass();
        trackingEventsLogger.getClass();
        this.f1422type = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(SelfieWorkflow.Screen.OldCameraScreen.class), new FirstTimeBorrowKt$$ExternalSyntheticLambda2(18, lazy, cameraPreview, trackingEventsLogger));
        this.viewConstructor = trackingEventsLogger;
    }

    public BuilderViewFactory(CameraPreview cameraPreview, Lazy lazy, TrackingEventsLogger trackingEventsLogger, FeatureFlagManager featureFlagManager) {
        cameraPreview.getClass();
        lazy.getClass();
        trackingEventsLogger.getClass();
        featureFlagManager.getClass();
        this.f1422type = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(SelfieWorkflow.Screen.CameraScreen.class), new TabToolbarsKt$$ExternalSyntheticLambda16(cameraPreview, lazy, trackingEventsLogger, featureFlagManager, 10));
        this.viewConstructor = trackingEventsLogger;
    }
}
