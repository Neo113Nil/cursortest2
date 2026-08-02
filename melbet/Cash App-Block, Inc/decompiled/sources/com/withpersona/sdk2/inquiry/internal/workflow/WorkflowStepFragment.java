package com.withpersona.sdk2.inquiry.internal.workflow;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.viewbinding.ViewBinding;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.NoopWorkflowInterceptor;
import com.squareup.workflow1.RenderingAndSnapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TreeSnapshot;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.WorkflowNode;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.squareup.workflow1.internal.WorkflowNodeId;
import com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1;
import com.squareup.workflow1.ui.PickledTreesnapshot;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewRegistry;
import com.squareup.workflow1.ui.WorkflowLayout;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2FragmentWorkflowStepBinding;
import com.withpersona.sdk2.inquiry.internal.state.WorkflowStepModel;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.WorkflowStateViewModel;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerKey;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import net.idrnd.misnap.iad.IadFrame;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflow/WorkflowStepFragment;", "Lcom/withpersona/sdk2/inquiry/shared/di/BaseDaggerFragment;", "Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2FragmentWorkflowStepBinding;", "<init>", "()V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WorkflowStepFragment extends BaseDaggerFragment {
    public WorkflowStepModel lastRendering;
    public final StateFlowImpl propsFlow;
    public SystemUiController systemUiController;
    public ViewRegistry viewRegistry;

    /* renamed from: com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(3, Pi2FragmentWorkflowStepBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2FragmentWorkflowStepBinding;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            ViewGroup viewGroup = (ViewGroup) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.pi2_fragment_workflow_step, viewGroup, false);
            if (booleanValue) {
                viewGroup.addView(inflate);
            }
            if (inflate != null) {
                return new Pi2FragmentWorkflowStepBinding((FrameLayout) inflate);
            }
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
    }

    public WorkflowStepFragment() {
        super(AnonymousClass1.INSTANCE);
        this.propsFlow = FlowKt.MutableStateFlow(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initialize$inquiry_internal_release(WorkflowStepModel workflowStepModel) {
        PickledTreesnapshot pickledTreesnapshot;
        workflowStepModel.getClass();
        if (this._binding == null) {
            this.lastRendering = workflowStepModel;
            return;
        }
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(workflowStepModel.getProps());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new TransitionWorker$run$1(this, MutableStateFlow, 0 == true ? 1 : 0, 17), 3);
        Fragment parentFragment = getParentFragment();
        parentFragment.getClass();
        WorkflowStateViewModel workflowStateViewModel = (WorkflowStateViewModel) ((InquiryWorkflowFragment) parentFragment).workflowStateViewModel$delegate.getValue();
        SavedStateHandle savedStateHandle = workflowStateViewModel.savedStateHandle;
        SavedStateHandle.SavingStateLiveData savingStateLiveData = workflowStateViewModel.renderingName;
        if (!Intrinsics.areEqual(savingStateLiveData.getValue(), workflowStepModel.getName())) {
            JWECryptoParts jWECryptoParts = savedStateHandle.impl;
            Iterator it = SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus(((LinkedHashMap) jWECryptoParts.header).keySet(), (Iterable) ((LinkedHashMap) jWECryptoParts.encryptedKey).keySet()), (Iterable) savedStateHandle.liveDatas.keySet()).iterator();
            while (it.hasNext()) {
                savedStateHandle.set(null, (String) it.next());
            }
        }
        savingStateLiveData.setValue(workflowStepModel.getName());
        Context requireContext = requireContext();
        requireContext.getClass();
        WorkflowLayout workflowLayout = new WorkflowLayout(requireContext, null);
        Lifecycle lifecycle = getLifecycle();
        lifecycle.getClass();
        StatefulWorkflow child = workflowStepModel.getChild();
        LifecycleCoroutineScopeImpl coroutineScope = ViewModelKt.getCoroutineScope(getLifecycle());
        EmptyList emptyList = EmptyList.INSTANCE;
        InquiryViewModel.AnonymousClass1 anonymousClass1 = new InquiryViewModel.AnonymousClass1(workflowStepModel, objArr3 == true ? 1 : 0, 23);
        child.getClass();
        emptyList.getClass();
        TreeSnapshot treeSnapshot = (savedStateHandle == null || (pickledTreesnapshot = (PickledTreesnapshot) savedStateHandle.get("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) ? null : pickledTreesnapshot.snapshot;
        NoopWorkflowInterceptor noopWorkflowInterceptor = NoopWorkflowInterceptor.INSTANCE;
        noopWorkflowInterceptor.getClass();
        UnleashContext unleashContext = new UnleashContext();
        unleashContext.userId = child;
        IadFrame iadFrame = new IadFrame(13);
        unleashContext.sessionId = MutableStateFlow.getValue();
        unleashContext.remoteAddress = new ChannelFlowOperatorImpl(0, 14, null, null, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(MutableStateFlow, new WorkflowRunner$nextOutput$2$1(unleashContext, null, 1), 2)).produceImpl(coroutineScope);
        unleashContext.properties = new WorkflowNode(new WorkflowNodeId(Workflows.getIdentifier(child), ""), child, unleashContext.sessionId, treeSnapshot, coroutineScope.coroutineContext, WorkflowNode.AnonymousClass1.INSTANCE, null, noopWorkflowInterceptor, iadFrame);
        WorkflowNode workflowNode = (WorkflowNode) unleashContext.properties;
        try {
            StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(new RenderingAndSnapshot(workflowNode.render(child, unleashContext.sessionId), workflowNode.snapshot(child)));
            JobKt.launch$default(coroutineScope, null, null, new TakeUntil$collectSafely$2((Object) unleashContext, (Object) MutableStateFlow2, (Object) anonymousClass1, (Continuation) (objArr2 == true ? 1 : 0), 26), 3);
            ReadonlyStateFlow stateIn = FlowKt.stateIn(new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(MutableStateFlow2, new WorkflowNode$tick$1$1((Object) savedStateHandle, (Continuation) (objArr == true ? 1 : 0), 26), 3), 9), coroutineScope, SharingStarted.Companion.Eagerly, ((RenderingAndSnapshot) MutableStateFlow2.getValue()).rendering);
            ViewRegistry.Companion companion = ViewRegistry.Companion;
            ViewRegistry viewRegistry = this.viewRegistry;
            if (viewRegistry == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewRegistry");
                throw null;
            }
            Pair pair = new Pair(companion, viewRegistry);
            SystemUiControllerKey systemUiControllerKey = SystemUiControllerKey.INSTANCE;
            SystemUiController systemUiController = this.systemUiController;
            if (systemUiController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            }
            JobKt.launch$default(ViewModelKt.getCoroutineScope(lifecycle), null, null, new WorkflowLayout$start$1(lifecycle, Lifecycle.State.STARTED, stateIn, workflowLayout, new ViewEnvironment(MapsKt__MapsKt.mapOf(pair, new Pair(systemUiControllerKey, systemUiController))), null, 0), 3);
            ViewBinding viewBinding = this._binding;
            viewBinding.getClass();
            ((Pi2FragmentWorkflowStepBinding) viewBinding).rootView.removeAllViews();
            ViewBinding viewBinding2 = this._binding;
            viewBinding2.getClass();
            ((Pi2FragmentWorkflowStepBinding) viewBinding2).rootView.addView(workflowLayout);
            ViewBinding viewBinding3 = this._binding;
            viewBinding3.getClass();
            ((Pi2FragmentWorkflowStepBinding) viewBinding3).rootView.post(new Task$$ExternalSyntheticLambda0(this, 10));
        } catch (Throwable th) {
            CancellationException cancellationException = th instanceof CancellationException ? th : null;
            if (cancellationException == null) {
                cancellationException = JobKt.CancellationException("Workflow runtime failed", th);
            }
            JobKt.cancel(workflowNode.coroutineContext, cancellationException);
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        postponeEnterTransition();
        WorkflowStepModel workflowStepModel = this.lastRendering;
        if (workflowStepModel != null) {
            initialize$inquiry_internal_release(workflowStepModel);
        }
    }

    public final void render$inquiry_internal_release(WorkflowStepModel workflowStepModel) {
        workflowStepModel.getClass();
        Object props = workflowStepModel.getProps();
        props.getClass();
        StateFlowImpl stateFlowImpl = this.propsFlow;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, props);
    }
}
