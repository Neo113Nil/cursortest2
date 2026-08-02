package com.withpersona.sdk2.inquiry.document.step;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.MetadataRepo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.document.DocumentInstructionsView;
import com.withpersona.sdk2.inquiry.document.DocumentPendingRunner;
import com.withpersona.sdk2.inquiry.document.DocumentReviewRunner;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentLoadingBinding;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentReviewBinding;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2FragmentDocumentStepBinding;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepBottomSheetBinding;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.steps.ui.ScreenRenderer;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepUtils;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$special$$inlined$lazyViewModel$4;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.idrnd.face.iad.capture.internal.e3;
import net.idrnd.face.iad.capture.internal.o0;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "Lcom/withpersona/sdk2/inquiry/shared/di/BaseWorkflowFragment;", "Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2FragmentDocumentStepBinding;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Screen;", "<init>", "()V", "DocumentStepFragmentArgs", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentStepFragment extends BaseWorkflowFragment {
    public final FragmentArgsLazy args$delegate;
    public UiStepBottomSheet currentBottomSheet;
    public HCaptcha$$ExternalSyntheticLambda1 currentOutputHandler;
    public ScreenRenderer currentScreenRenderer;
    public SystemUiController systemUiController;
    public final ViewModelLazy viewModel$delegate;
    public DocumentStepViewModel_Factory_Impl viewModelFactory;

    /* renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2FragmentDocumentStepBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2FragmentDocumentStepBinding;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            ViewGroup viewGroup = (ViewGroup) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.pi2_fragment_document_step, viewGroup, false);
            if (booleanValue) {
                viewGroup.addView(inflate);
            }
            int i = R.id.bottom_sheet;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet);
            if (frameLayout != null) {
                i = R.id.content;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.content);
                if (frameLayout2 != null) {
                    return new Pi2FragmentDocumentStepBinding((FrameLayout) inflate, frameLayout, frameLayout2);
                }
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            return null;
        }
    }

    public final class DocumentStepFragmentArgs implements Parcelable {
        public static final Parcelable.Creator<DocumentStepFragmentArgs> CREATOR = new Frame.Creator(7);
        public final DocumentWorkflow.Input props;

        public DocumentStepFragmentArgs(DocumentWorkflow.Input input) {
            input.getClass();
            this.props = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.props.writeToParcel(parcel, i);
        }
    }

    public DocumentStepFragment() {
        super(AnonymousClass1.INSTANCE);
        ReflectionFactory reflectionFactory = Reflection.factory;
        this.args$delegate = new FragmentArgsLazy(reflectionFactory.getOrCreateKotlinClass(DocumentStepFragmentArgs.class), new ConvertFromJavaKt$$Lambda$4(this, 8));
        KClassImpl$Data$$Lambda$22 kClassImpl$Data$$Lambda$22 = new KClassImpl$Data$$Lambda$22(2, this, new HCaptcha$$ExternalSyntheticLambda2(this, 13));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(new e3(this, 9), 10));
        this.viewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(DocumentStepViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 1), kClassImpl$Data$$Lambda$22, new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 2));
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        DocumentStepStateManager documentStepStateManager = ((DocumentStepViewModel) this.viewModel$delegate.getValue()).stateManager;
        collectAndRender((StateFlowImpl) documentStepStateManager.next);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new TransitionWorker$run$1(documentStepStateManager, this, null, 1), 3);
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment
    public final void render(Object obj) {
        DocumentWorkflow.Screen screen = (DocumentWorkflow.Screen) obj;
        screen.getClass();
        if (screen instanceof DocumentInstructionsView) {
            ScreenRenderer screenRenderer = this.currentScreenRenderer;
            DocumentInstructionsScreenRenderer documentInstructionsScreenRenderer = screenRenderer instanceof DocumentInstructionsScreenRenderer ? (DocumentInstructionsScreenRenderer) screenRenderer : null;
            if (documentInstructionsScreenRenderer == null) {
                ViewBinding viewBinding = this._binding;
                viewBinding.getClass();
                FrameLayout frameLayout = ((Pi2FragmentDocumentStepBinding) viewBinding).content;
                UiComponentScreen uiComponentScreen = ((DocumentInstructionsView) screen).uiScreen;
                Equals$$ExternalSyntheticLambda0 equals$$ExternalSyntheticLambda0 = new Equals$$ExternalSyntheticLambda0(6);
                StateFlowKt$combineState$2 stateFlowKt$combineState$2 = new StateFlowKt$combineState$2(3, screen, DocumentInstructionsView.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0, 7);
                Pi2GenericUiStepScreenBinding inflate = Pi2GenericUiStepScreenBinding.inflate(LayoutInflater.from(frameLayout.getContext()), frameLayout, false);
                frameLayout.removeAllViews();
                frameLayout.addView(inflate.rootView);
                documentInstructionsScreenRenderer = new DocumentInstructionsScreenRenderer(new MetadataRepo(uiComponentScreen, inflate, stateFlowKt$combineState$2, UiStepUtils.INSTANCE.setupViewsForNestedUiStep(inflate, uiComponentScreen, equals$$ExternalSyntheticLambda0)));
            }
            DocumentInstructionsView documentInstructionsView = (DocumentInstructionsView) screen;
            SystemUiController systemUiController = this.systemUiController;
            if (systemUiController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            }
            MetadataRepo metadataRepo = documentInstructionsScreenRenderer.wrapped;
            Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding = (Pi2GenericUiStepScreenBinding) metadataRepo.mEmojiCharArray;
            ConstraintLayout constraintLayout = pi2GenericUiStepScreenBinding.rootView;
            documentInstructionsView.getClass();
            UiComponentScreen uiComponentScreen2 = (UiComponentScreen) metadataRepo.mMetadataList;
            Integer backgroundColor = uiComponentScreen2.getBackgroundColor();
            if (backgroundColor != null) {
                int intValue = backgroundColor.intValue();
                constraintLayout.setBackgroundColor(intValue);
                Context context = constraintLayout.getContext();
                context.getClass();
                systemUiController.updateSystemUiColor(context, intValue);
            }
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            StepStyles.UiStepStyle uiStepStyle = uiComponentScreen2.styles;
            Drawable backgroundImageDrawable = uiStepStyle != null ? AbstractHashFunction.backgroundImageDrawable(uiStepStyle, context2) : null;
            if (backgroundImageDrawable != null) {
                constraintLayout.setBackground(backgroundImageDrawable);
                pi2GenericUiStepScreenBinding.footerContainer.setBackgroundColor(0);
            }
            ((StateFlowKt$combineState$2) metadataRepo.mRootNode).invoke(pi2GenericUiStepScreenBinding, documentInstructionsView, (LinkedHashMap) ((o0) ((MarkwonImpl) metadataRepo.mTypeface).parser).a);
            this.currentScreenRenderer = documentInstructionsScreenRenderer;
        } else if (screen instanceof DocumentWorkflow.Screen.LoadingAnimation) {
            ScreenRenderer screenRenderer2 = this.currentScreenRenderer;
            DocumentPendingRunner documentPendingRunner = screenRenderer2 instanceof DocumentPendingRunner ? (DocumentPendingRunner) screenRenderer2 : null;
            if (documentPendingRunner == null) {
                ViewBinding viewBinding2 = this._binding;
                viewBinding2.getClass();
                LayoutInflater from = LayoutInflater.from(((Pi2FragmentDocumentStepBinding) viewBinding2).content.getContext());
                ViewBinding viewBinding3 = this._binding;
                viewBinding3.getClass();
                Pi2DocumentLoadingBinding inflate2 = Pi2DocumentLoadingBinding.inflate(from, ((Pi2FragmentDocumentStepBinding) viewBinding3).content, false);
                ViewBinding viewBinding4 = this._binding;
                viewBinding4.getClass();
                ((Pi2FragmentDocumentStepBinding) viewBinding4).content.removeAllViews();
                ViewBinding viewBinding5 = this._binding;
                viewBinding5.getClass();
                ((Pi2FragmentDocumentStepBinding) viewBinding5).content.addView(inflate2.rootView);
                documentPendingRunner = new DocumentPendingRunner(inflate2);
            }
            DocumentWorkflow.Screen.LoadingAnimation loadingAnimation = (DocumentWorkflow.Screen.LoadingAnimation) screen;
            SystemUiController systemUiController2 = this.systemUiController;
            if (systemUiController2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            }
            documentPendingRunner.render(loadingAnimation, systemUiController2);
            this.currentScreenRenderer = documentPendingRunner;
        } else {
            if (!(screen instanceof DocumentWorkflow.Screen.ReviewCaptures)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            ScreenRenderer screenRenderer3 = this.currentScreenRenderer;
            DocumentReviewRunner documentReviewRunner = screenRenderer3 instanceof DocumentReviewRunner ? (DocumentReviewRunner) screenRenderer3 : null;
            if (documentReviewRunner == null) {
                ViewBinding viewBinding6 = this._binding;
                viewBinding6.getClass();
                LayoutInflater from2 = LayoutInflater.from(((Pi2FragmentDocumentStepBinding) viewBinding6).content.getContext());
                ViewBinding viewBinding7 = this._binding;
                viewBinding7.getClass();
                Pi2DocumentReviewBinding inflate3 = Pi2DocumentReviewBinding.inflate(from2, ((Pi2FragmentDocumentStepBinding) viewBinding7).content, false);
                ViewBinding viewBinding8 = this._binding;
                viewBinding8.getClass();
                ((Pi2FragmentDocumentStepBinding) viewBinding8).content.removeAllViews();
                ViewBinding viewBinding9 = this._binding;
                viewBinding9.getClass();
                ((Pi2FragmentDocumentStepBinding) viewBinding9).content.addView(inflate3.rootView);
                documentReviewRunner = new DocumentReviewRunner(inflate3);
            }
            DocumentWorkflow.Screen.ReviewCaptures reviewCaptures = (DocumentWorkflow.Screen.ReviewCaptures) screen;
            SystemUiController systemUiController3 = this.systemUiController;
            if (systemUiController3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            }
            documentReviewRunner.render(reviewCaptures, systemUiController3);
            this.currentScreenRenderer = documentReviewRunner;
        }
        UiStepBottomSheet bottomSheet = screen.getBottomSheet();
        if (bottomSheet == null) {
            UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
            if (uiStepBottomSheet != null) {
                BottomSheetBehavior bottomSheetBehavior = uiStepBottomSheet.bottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(5);
                }
                uiStepBottomSheet.bottomSheetBehavior = null;
            }
            this.currentBottomSheet = null;
            return;
        }
        ViewBinding viewBinding10 = this._binding;
        viewBinding10.getClass();
        FrameLayout frameLayout2 = ((Pi2FragmentDocumentStepBinding) viewBinding10).bottomSheet;
        if (bottomSheet.bottomSheetBehavior == null) {
            Pi2GenericUiStepBottomSheetBinding inflate4 = Pi2GenericUiStepBottomSheetBinding.inflate(LayoutInflater.from(frameLayout2.getContext()), frameLayout2, false);
            bottomSheet.showRendering(inflate4, bottomSheet);
            frameLayout2.removeAllViews();
            frameLayout2.addView(inflate4.rootView);
        }
        this.currentBottomSheet = bottomSheet;
    }
}
