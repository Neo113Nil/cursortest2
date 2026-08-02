package com.squareup.workflow1.ui;

import android.view.View;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes8.dex */
public final class AttachedScope implements View.OnAttachStateChangeListener {
    public final ArrayList attachHandlers = new ArrayList();
    public final ContextScope coroutineScope;

    public AttachedScope(ContextScope contextScope) {
        JobImpl jobImpl = new JobImpl(JobKt.getJob(contextScope.coroutineContext));
        jobImpl.invokeOnCompletion(new InterceptedRenderContext$send$1(this, 3));
        this.coroutineScope = JobKt.plus(jobImpl, contextScope);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        ArrayList arrayList = this.attachHandlers;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        arrayList.clear();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        JobKt.cancel(this.coroutineScope, JobKt.CancellationException("View detached", null));
        view.removeOnAttachStateChangeListener(this);
    }
}
