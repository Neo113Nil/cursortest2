package com.withpersona.sdk2.inquiry.sandbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewFactory;
import com.squareup.workflow1.ui.WorkflowViewStub;
import com.withpersona.sdk2.inquiry.document.DocumentPendingRunner$Companion$1;
import com.withpersona.sdk2.inquiry.document.DocumentPendingRunner$Companion$2;
import com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$Companion$1;
import com.withpersona.sdk2.inquiry.document.DocumentReviewRunner$Companion$2;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$Companion$1;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$Companion$2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdSubmittingRunner$Companion$1;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdSubmittingRunner$Companion$2;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.sandbox.databinding.Pi2SandboxOverlayBinding;
import com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$Companion$1;
import com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$Companion$2;
import com.withpersona.sdk2.inquiry.selfie.SelfieRestartCameraRunner$Companion$1;
import com.withpersona.sdk2.inquiry.selfie.SelfieRestartCameraRunner$Companion$2;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$Companion$1;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$Companion$2;
import com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$Companion$1;
import com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$Companion$2;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes9.dex */
public final class SandboxScreenRunner implements LayoutRunner {
    public static final Companion Companion = new Companion(0);

    public final class Companion implements ViewFactory {
        public final /* synthetic */ DecorativeViewFactory $$delegate_0;
        public final /* synthetic */ int $r8$classId;

        /* renamed from: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$Companion$1, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2SandboxOverlayBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", 0);

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                layoutInflater.getClass();
                View inflate = layoutInflater.inflate(R.layout.pi2_sandbox_overlay, viewGroup, false);
                if (booleanValue) {
                    viewGroup.addView(inflate);
                }
                int i = R.id.child_stub;
                WorkflowViewStub workflowViewStub = (WorkflowViewStub) ViewBindings.findChildViewById(inflate, R.id.child_stub);
                if (workflowViewStub != null) {
                    i = R.id.floating_action_button;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(inflate, R.id.floating_action_button);
                    if (floatingActionButton != null) {
                        return new Pi2SandboxOverlayBinding((CoordinatorLayout) inflate, workflowViewStub, floatingActionButton);
                    }
                }
                a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return null;
            }
        }

        /* renamed from: com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner$Companion$2, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1 {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2(1, SandboxScreenRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;)V", 0);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Pi2SandboxOverlayBinding) obj).getClass();
                return new SandboxScreenRunner();
            }
        }

        public Companion(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(DocumentWorkflow.Screen.LoadingAnimation.class), DocumentPendingRunner$Companion$1.INSTANCE, DocumentPendingRunner$Companion$2.INSTANCE);
                    break;
                case 2:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(DocumentWorkflow.Screen.ReviewCaptures.class), DocumentReviewRunner$Companion$1.INSTANCE, DocumentReviewRunner$Companion$2.INSTANCE);
                    break;
                case 3:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(Screen.InstructionsScreen.class), GovernmentIdInstructionsRunner$Companion$1.INSTANCE, GovernmentIdInstructionsRunner$Companion$2.INSTANCE);
                    break;
                case 4:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(Screen.SubmittingScreen.class), GovernmentIdSubmittingRunner$Companion$1.INSTANCE, GovernmentIdSubmittingRunner$Companion$2.INSTANCE);
                    break;
                case 5:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(SelfieWorkflow.Screen.InstructionsScreen.class), SelfieInstructionsRunner$Companion$1.INSTANCE, SelfieInstructionsRunner$Companion$2.INSTANCE);
                    break;
                case 6:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(SelfieWorkflow.Screen.RestartCameraScreen.class), SelfieRestartCameraRunner$Companion$1.INSTANCE, SelfieRestartCameraRunner$Companion$2.INSTANCE);
                    break;
                case 7:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(SelfieWorkflow.Screen.ReviewCapturesScreen.class), SelfieReviewCapturesRunner$Companion$1.INSTANCE, SelfieReviewCapturesRunner$Companion$2.INSTANCE);
                    break;
                case 8:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(SelfieWorkflow.Screen.SubmittingScreen.class), SelfieSubmittingRunner$Companion$1.INSTANCE, SelfieSubmittingRunner$Companion$2.INSTANCE);
                    break;
                default:
                    this.$$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(SandboxScreen.class), AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
                    break;
            }
        }

        @Override // com.squareup.workflow1.ui.ViewFactory
        public final View buildView(Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup) {
            int i = this.$r8$classId;
            DecorativeViewFactory decorativeViewFactory = this.$$delegate_0;
            switch (i) {
                case 0:
                    throw Boxes$$ExternalSyntheticOutline1.m(obj);
                case 1:
                    DocumentWorkflow.Screen.LoadingAnimation loadingAnimation = (DocumentWorkflow.Screen.LoadingAnimation) obj;
                    loadingAnimation.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return decorativeViewFactory.buildView(loadingAnimation, viewEnvironment, context, viewGroup);
                case 2:
                    DocumentWorkflow.Screen.ReviewCaptures reviewCaptures = (DocumentWorkflow.Screen.ReviewCaptures) obj;
                    reviewCaptures.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return decorativeViewFactory.buildView(reviewCaptures, viewEnvironment, context, viewGroup);
                case 3:
                    Screen.InstructionsScreen instructionsScreen = (Screen.InstructionsScreen) obj;
                    instructionsScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return decorativeViewFactory.buildView(instructionsScreen, viewEnvironment, context, viewGroup);
                case 4:
                    Screen.SubmittingScreen submittingScreen = (Screen.SubmittingScreen) obj;
                    submittingScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return decorativeViewFactory.buildView(submittingScreen, viewEnvironment, context, viewGroup);
                case 5:
                    SelfieWorkflow.Screen.InstructionsScreen instructionsScreen2 = (SelfieWorkflow.Screen.InstructionsScreen) obj;
                    instructionsScreen2.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return decorativeViewFactory.buildView(instructionsScreen2, viewEnvironment, context, viewGroup);
                case 6:
                    SelfieWorkflow.Screen.RestartCameraScreen restartCameraScreen = (SelfieWorkflow.Screen.RestartCameraScreen) obj;
                    restartCameraScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return decorativeViewFactory.buildView(restartCameraScreen, viewEnvironment, context, viewGroup);
                case 7:
                    SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen = (SelfieWorkflow.Screen.ReviewCapturesScreen) obj;
                    reviewCapturesScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return decorativeViewFactory.buildView(reviewCapturesScreen, viewEnvironment, context, viewGroup);
                default:
                    SelfieWorkflow.Screen.SubmittingScreen submittingScreen2 = (SelfieWorkflow.Screen.SubmittingScreen) obj;
                    submittingScreen2.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return decorativeViewFactory.buildView(submittingScreen2, viewEnvironment, context, viewGroup);
            }
        }

        @Override // com.squareup.workflow1.ui.ViewFactory
        public final KClass getType() {
            int i = this.$r8$classId;
            DecorativeViewFactory decorativeViewFactory = this.$$delegate_0;
            switch (i) {
            }
            return decorativeViewFactory.f1423type;
        }
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(Object obj, ViewEnvironment viewEnvironment) {
        throw new ClassCastException();
    }
}
