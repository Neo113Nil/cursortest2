package com.squareup.preferences;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class PreferenceFlow implements Flow {
    public final CallbackFlowBuilder flow;
    public final String key;
    public final SharedPreferences preferences;
    public final Function0 valueGetter;

    public PreferenceFlow(String str, SharedPreferences sharedPreferences, Function0 function0) {
        str.getClass();
        sharedPreferences.getClass();
        this.key = str;
        this.preferences = sharedPreferences;
        this.valueGetter = function0;
        this.flow = FlowKt.callbackFlow(new PreferenceFlow$flow$1(this, (Continuation) null, 0));
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.flow.collect(flowCollector, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }
}
