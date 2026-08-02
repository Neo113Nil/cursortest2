package com.withpersona.sdk2.inquiry.ui.uiStep;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBinding;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda9;
import com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy;
import com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
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
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;
import net.idrnd.face.iad.capture.internal.e3;
import net.oneformapp.schema.Element;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import papa.Choreographers$$ExternalSyntheticLambda1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "Lcom/withpersona/sdk2/inquiry/shared/di/BaseWorkflowFragment;", "Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2InquiryUiBinding;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen;", "<init>", "()V", "UiStepFragmentArgs", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UiStepFragment extends BaseWorkflowFragment {
    public final FragmentArgsLazy args$delegate;
    public InquiryStateManager$$ExternalSyntheticLambda9 currentOutputHandler;
    public UiWorkflow.Screen pendingRendering;
    public UiScreenRunner runner;
    public SystemUiController systemUiController;
    public final Lazy viewEnvironment$delegate;
    public final ViewModelLazy viewModel$delegate;
    public UiStepViewModel_Factory_Impl viewModelFactory;

    /* renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2InquiryUiBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2InquiryUiBinding;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            layoutInflater.getClass();
            return Pi2InquiryUiBinding.inflate(layoutInflater, (ViewGroup) obj2, booleanValue);
        }
    }

    public final class UiStepFragmentArgs implements Parcelable {
        public static final Parcelable.Creator<UiStepFragmentArgs> CREATOR = new Element.AnonymousClass1(26);
        public final UiWorkflow.Input props;

        public UiStepFragmentArgs(UiWorkflow.Input input) {
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

    public UiStepFragment() {
        super(AnonymousClass1.INSTANCE);
        this.viewEnvironment$delegate = LazyKt.lazy(new Choreographers$$ExternalSyntheticLambda1(this, 12));
        ReflectionFactory reflectionFactory = Reflection.factory;
        int i = 14;
        this.args$delegate = new FragmentArgsLazy(reflectionFactory.getOrCreateKotlinClass(UiStepFragmentArgs.class), new ConvertFromJavaKt$$Lambda$4(this, i));
        KClassImpl$Data$$Lambda$22 kClassImpl$Data$$Lambda$22 = new KClassImpl$Data$$Lambda$22(9, this, new ForwardingFileSystem$$ExternalSyntheticLambda0(this, i));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(new e3(this, 23), 24));
        this.viewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(UiStepViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 0), kClassImpl$Data$$Lambda$22, new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 17));
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        UiStepStateManager uiStepStateManager = ((UiStepViewModel) this.viewModel$delegate.getValue()).uiStepStateManager;
        collectAndRender((StateFlowImpl) uiStepStateManager.next);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new RxConvertKt$asFlow$1(uiStepStateManager, this, null, 5), 3);
        UiWorkflow.Screen screen = this.pendingRendering;
        if (screen != null) {
            render(screen);
        }
        this.pendingRendering = null;
    }

    @Override // com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment
    public final void render(UiWorkflow.Screen screen) {
        screen.getClass();
        if (this._binding == null) {
            this.pendingRendering = screen;
            return;
        }
        if (!(screen instanceof UiWorkflow.Screen.EntryScreen)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        UiScreenRunner uiScreenRunner = this.runner;
        if (uiScreenRunner == null) {
            ViewBinding viewBinding = this._binding;
            viewBinding.getClass();
            uiScreenRunner = new UiScreenRunner((Pi2InquiryUiBinding) viewBinding, (UiWorkflow.Screen.EntryScreen) screen);
            this.runner = uiScreenRunner;
        }
        uiScreenRunner.showRendering((UiWorkflow.Screen.EntryScreen) screen, (ViewEnvironment) this.viewEnvironment$delegate.getValue());
    }
}
