package com.squareup.cash.tabprovider.real;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class EmptyTabProvider implements IoActivitySetupTeardown {
    public final /* synthetic */ int $r8$classId;
    public final Object tabPublisher;

    public /* synthetic */ EmptyTabProvider(Object obj, int i) {
        this.$r8$classId = i;
        this.tabPublisher = obj;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1(continuation, this, 8), 1);
                break;
            default:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1(continuation, this, 9), 1);
                break;
        }
        return StateFlowKt.noOpTeardown;
    }
}
