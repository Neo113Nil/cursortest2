package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.MetadataRepo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.android.play.integrity.internal.ah;
import com.squareup.cash.R;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.CheckRequestPermissionRationaleStateView;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2FragmentPermissionRequestBinding;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2RequestPermissionRationaleBinding;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy;
import com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$special$$inlined$lazyViewModel$4;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.idrnd.face.iad.capture.internal.e3;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;", "Lcom/withpersona/sdk2/inquiry/shared/di/BaseWorkflowFragment;", "Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2FragmentPermissionRequestBinding;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$Rendering;", "<init>", "()V", "PermissionRequestFragmentArgs", "PermissionRequestFragmentResult", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PermissionRequestFragment extends BaseWorkflowFragment {
    public final FragmentArgsLazy args$delegate;
    public final ViewModelLazy viewModel$delegate;
    public PermissionRequestViewModel_Factory_Impl viewModelFactory;

    /* renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2FragmentPermissionRequestBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2FragmentPermissionRequestBinding;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            ViewGroup viewGroup = (ViewGroup) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.pi2_fragment_permission_request, viewGroup, false);
            if (booleanValue) {
                viewGroup.addView(inflate);
            }
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.content);
            if (frameLayout != null) {
                return new Pi2FragmentPermissionRequestBinding((ConstraintLayout) inflate, frameLayout);
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.content)));
            return null;
        }
    }

    public final class PermissionRequestFragmentArgs implements Parcelable {
        public static final Parcelable.Creator<PermissionRequestFragmentArgs> CREATOR = new PoseConfig.Creator(17);
        public final PermissionRequestWorkflow.Props props;
        public final String requestId;

        public PermissionRequestFragmentArgs(String str, PermissionRequestWorkflow.Props props) {
            str.getClass();
            props.getClass();
            this.requestId = str;
            this.props = props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.requestId);
            this.props.writeToParcel(parcel, i);
        }
    }

    public final class PermissionRequestFragmentResult implements Parcelable {
        public static final Parcelable.Creator<PermissionRequestFragmentResult> CREATOR = new PoseConfig.Creator(18);
        public final PermissionState permissionState;
        public final String requestId;

        public PermissionRequestFragmentResult(String str, PermissionState permissionState) {
            str.getClass();
            permissionState.getClass();
            this.requestId = str;
            this.permissionState = permissionState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.requestId);
            this.permissionState.writeToParcel(parcel, i);
        }
    }

    public PermissionRequestFragment() {
        super(AnonymousClass1.INSTANCE);
        ReflectionFactory reflectionFactory = Reflection.factory;
        this.args$delegate = new FragmentArgsLazy(reflectionFactory.getOrCreateKotlinClass(PermissionRequestFragmentArgs.class), new ConvertFromJavaKt$$Lambda$4(this, 12));
        KClassImpl$Data$$Lambda$22 kClassImpl$Data$$Lambda$22 = new KClassImpl$Data$$Lambda$22(7, this, new HCaptcha$$ExternalSyntheticLambda2(this, 29));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(new e3(this, 19), 20));
        this.viewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(PermissionRequestViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 13), kClassImpl$Data$$Lambda$22, new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 14));
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        PermissionRequestViewModel permissionRequestViewModel = (PermissionRequestViewModel) this.viewModel$delegate.getValue();
        PermissionRequestWorkflow.Props props = ((PermissionRequestFragmentArgs) this.args$delegate.getValue()).props;
        props.getClass();
        final PermissionRequestStateManager permissionRequestStateManager = permissionRequestViewModel.permissionRequestStateManager;
        if (permissionRequestStateManager == null) {
            PermissionRequestStateManager_Factory_Impl permissionRequestStateManager_Factory_Impl = permissionRequestViewModel.permissionRequestStateManagerFactory;
            SavedStateHandle savedStateHandle = permissionRequestViewModel.savedStateHandle;
            MetadataRepo metadataRepo = permissionRequestStateManager_Factory_Impl.delegateFactory;
            PermissionRequestStateManager permissionRequestStateManager2 = new PermissionRequestStateManager(props, savedStateHandle, (Context) ((Provider) metadataRepo.mMetadataList).get(), (MarkwonImpl) ((DocumentCameraWorker_Factory) metadataRepo.mEmojiCharArray).get(), (DeviceFeatureRequestWorker_Factory_Impl) ((InstanceFactory) metadataRepo.mRootNode).instance, (TrackingEventsLogger) ((Provider) metadataRepo.mTypeface).get());
            permissionRequestViewModel.permissionRequestStateManager = permissionRequestStateManager2;
            permissionRequestStateManager = permissionRequestStateManager2;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.addCallback(new OnBackPressedCallback() { // from class: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$onViewCreated$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void handleOnBackPressed() {
                StateFlowImpl stateFlowImpl = (StateFlowImpl) PermissionRequestStateManager.this.prev;
                PermissionRequestWorkflow.Output output = new PermissionRequestWorkflow.Output(new PermissionState(((PermissionRequestFragment.PermissionRequestFragmentArgs) this.args$delegate.getValue()).props.permission, PermissionResult.PermissionRejected));
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, output);
            }
        }, viewLifecycleOwner);
        collectAndRender((StateFlowImpl) permissionRequestStateManager.next);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner2.getLifecycle()), null, null, new TransitionWorker$run$1(permissionRequestStateManager, this, null, 19), 3);
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment
    public final void render(Object obj) {
        int colorFromAttr$default;
        Integer backgroundColorValue;
        PermissionRequestStateManager.Rendering rendering = (PermissionRequestStateManager.Rendering) obj;
        ViewBinding viewBinding = this._binding;
        viewBinding.getClass();
        FrameLayout frameLayout = ((Pi2FragmentPermissionRequestBinding) viewBinding).content;
        frameLayout.removeAllViews();
        if (!(rendering instanceof PermissionRequestStateManager.Rendering.BottomSheetRendering)) {
            if (!(rendering instanceof PermissionRequestStateManager.Rendering.CheckRequestPermissionRationaleRendering)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = ((PermissionRequestStateManager.Rendering.CheckRequestPermissionRationaleRendering) rendering).view;
            Context context = frameLayout.getContext();
            context.getClass();
            AppCompatActivity activity = ContextUtilsKt.getActivity(context);
            if (activity != null) {
                frameLayout.post(new CardEntryActivityController$$ExternalSyntheticLambda1(17, frameLayout, checkRequestPermissionRationaleStateView, activity));
                return;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
        }
        final SubtreeManager subtreeManager = ((PermissionRequestStateManager.Rendering.BottomSheetRendering) rendering).view;
        final int i = 1;
        Pi2RequestPermissionRationaleBinding inflate = Pi2RequestPermissionRationaleBinding.inflate(LayoutInflater.from(getContext()), frameLayout, true);
        FrameLayout frameLayout2 = inflate.bottomSheet;
        BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout2);
        CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda0 = new CameraHelper$$ExternalSyntheticLambda0(subtreeManager, 27);
        View view = inflate.tintScreen;
        zzbk.setup(from, cameraHelper$$ExternalSyntheticLambda0, frameLayout2, null, view);
        CoordinatorLayout coordinatorLayout = inflate.rootView;
        coordinatorLayout.postDelayed(new UiStepBottomSheet$$ExternalSyntheticLambda1(from, 2), 100L);
        frameLayout2.setOnClickListener(new ArcadeModal$$ExternalSyntheticLambda0(3));
        view.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(from, 3));
        StepStyle stepStyle = (StepStyle) subtreeManager.workflowSession;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context2 = coordinatorLayout.getContext();
            context2.getClass();
            colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context2, R.attr.colorSurface);
        } else {
            colorFromAttr$default = backgroundColorValue.intValue();
        }
        coordinatorLayout.setTag(R.id.pi2_background_color_hint, Integer.valueOf(colorFromAttr$default));
        String str = (String) subtreeManager.snapshotCache;
        int length = str.length();
        TextView textView = inflate.title;
        int i2 = 8;
        if (length > 0) {
            ExtensionsKt.setMarkdown(textView, str);
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = inflate.message;
        PersonaMaterialButton personaMaterialButton = inflate.positiveButton;
        PersonaMaterialButton personaMaterialButton2 = inflate.negativeButton;
        ExtensionsKt.setMarkdown(textView2, (String) subtreeManager.contextForChildren);
        personaMaterialButton.setText((String) subtreeManager.emitActionToParent);
        final int i3 = 0;
        personaMaterialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                SubtreeManager subtreeManager2 = subtreeManager;
                switch (i4) {
                    case 0:
                        ((Function0) subtreeManager2.interceptor).invoke();
                        break;
                    default:
                        ((Function0) subtreeManager2.children).invoke();
                        break;
                }
            }
        });
        personaMaterialButton2.setText((String) subtreeManager.idCounter);
        personaMaterialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i;
                SubtreeManager subtreeManager2 = subtreeManager;
                switch (i4) {
                    case 0:
                        ((Function0) subtreeManager2.interceptor).invoke();
                        break;
                    default:
                        ((Function0) subtreeManager2.children).invoke();
                        break;
                }
            }
        });
        ah.addOneShotPreDrawListenerAndDiscardFrame(personaMaterialButton2, new StateFlowsKt$$ExternalSyntheticLambda2(i2, inflate, subtreeManager));
    }
}
