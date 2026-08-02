package com.withpersona.sdk2.inquiry.shared.di;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes9.dex */
public abstract class BaseWorkflowFragment extends BaseDaggerFragment {
    public final void collectAndRender(StateFlowImpl stateFlowImpl) {
        stateFlowImpl.getClass();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new TransitionWorker$run$1(stateFlowImpl, this, null, 24), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        postponeEnterTransition();
    }

    public abstract void render(Object obj);
}
