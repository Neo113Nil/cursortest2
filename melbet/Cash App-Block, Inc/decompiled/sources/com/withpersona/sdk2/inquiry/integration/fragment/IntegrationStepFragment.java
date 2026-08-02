package com.withpersona.sdk2.inquiry.integration.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBinding;
import com.fillr.n;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$special$$inlined$lazyViewModel$4;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;", "Lcom/withpersona/sdk2/inquiry/shared/di/BaseWorkflowFragment;", "Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;", "<init>", "()V", "IntegrationStepFragmentArgs", "integration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntegrationStepFragment extends BaseWorkflowFragment {
    public final FragmentArgsLazy args$delegate;
    public InquiryStateManager$$ExternalSyntheticLambda7 currentOutputHandler;
    public View currentView;
    public SystemUiController systemUiController;
    public final Lazy viewEnvironment$delegate;
    public final ViewModelLazy viewModel$delegate;
    public IntegrationStepViewModel_Factory_Impl viewModelFactory;

    /* renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2GenericUiStepScreenBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            layoutInflater.getClass();
            return Pi2GenericUiStepScreenBinding.inflate(layoutInflater, (ViewGroup) obj2, booleanValue);
        }
    }

    public final class IntegrationStepFragmentArgs implements Parcelable {
        public static final Parcelable.Creator<IntegrationStepFragmentArgs> CREATOR = new MrzKey.Creator(1);
        public final IntegrationWorkflow.Input props;

        public IntegrationStepFragmentArgs(IntegrationWorkflow.Input input) {
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

    public IntegrationStepFragment() {
        super(AnonymousClass1.INSTANCE);
        this.viewEnvironment$delegate = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 20));
        KClassImpl$Data$$Lambda$22 kClassImpl$Data$$Lambda$22 = new KClassImpl$Data$$Lambda$22(4, this, new HCaptcha$$ExternalSyntheticLambda2(this, 24));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(new e3(this, 13), 14));
        ReflectionFactory reflectionFactory = Reflection.factory;
        this.viewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(IntegrationStepViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 5), kClassImpl$Data$$Lambda$22, new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 6));
        this.args$delegate = new FragmentArgsLazy(reflectionFactory.getOrCreateKotlinClass(IntegrationStepFragmentArgs.class), new ConvertFromJavaKt$$Lambda$4(this, 10));
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        IntegrationStepViewModel integrationStepViewModel = (IntegrationStepViewModel) this.viewModel$delegate.getValue();
        IntegrationWorkflow.Input input = ((IntegrationStepFragmentArgs) this.args$delegate.getValue()).props;
        input.getClass();
        IntegrationStepStateManager integrationStepStateManager = integrationStepViewModel.integrationStepStateManager;
        if (integrationStepStateManager == null) {
            IntegrationStepStateManager_Factory_Impl integrationStepStateManager_Factory_Impl = integrationStepViewModel.integrationStepStateManagerFactory;
            SavedStateHandle savedStateHandle = integrationStepViewModel.savedStateHandle;
            n nVar = integrationStepStateManager_Factory_Impl.delegateFactory;
            IntegrationStepStateManager integrationStepStateManager2 = new IntegrationStepStateManager(input, savedStateHandle, (Context) ((Provider) nVar.a).get(), (NavigationStateManager) ((Provider) nVar.b).get(), (IntegrationBrowserWorker.Factory) ((InstanceFactory) nVar.c).instance, (TrackingEventsLogger) ((Provider) nVar.d).get());
            integrationStepViewModel.integrationStepStateManager = integrationStepStateManager2;
            integrationStepStateManager = integrationStepStateManager2;
        }
        collectAndRender((StateFlowImpl) integrationStepStateManager.next);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new TransitionWorker$run$1(integrationStepStateManager, this, null, 8), 3);
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment
    public final void render(Object obj) {
        IntegrationView integrationView = (IntegrationView) obj;
        View view = this.currentView;
        Lazy lazy = this.viewEnvironment$delegate;
        if (view != null) {
            ViewShowRenderingKt.showRendering(view, integrationView, (ViewEnvironment) lazy.getValue());
            return;
        }
        DecorativeViewFactory decorativeViewFactory = integrationView.viewFactory;
        ViewEnvironment viewEnvironment = (ViewEnvironment) lazy.getValue();
        ViewBinding viewBinding = this._binding;
        viewBinding.getClass();
        Context context = ((Pi2GenericUiStepScreenBinding) viewBinding).rootView.getContext();
        context.getClass();
        ViewBinding viewBinding2 = this._binding;
        viewBinding2.getClass();
        this.currentView = decorativeViewFactory.buildView(integrationView, viewEnvironment, context, ((Pi2GenericUiStepScreenBinding) viewBinding2).rootView);
        ViewBinding viewBinding3 = this._binding;
        viewBinding3.getClass();
        ((Pi2GenericUiStepScreenBinding) viewBinding3).rootView.addView(this.currentView);
        View view2 = this.currentView;
        if (view2 != null) {
            ViewShowRenderingKt.start(view2);
        }
    }
}
