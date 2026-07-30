package com.chicken.road.cerman.fixs.roost;

import androidx.core.view.MotionEventCompat;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RoostGate.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.roost.RoostGate", f = "RoostGate.kt", i = {0, 0, 1, 1, 1, 3, 3, 3, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 9, 9}, l = {19, 21, 22, 26, 30, 34, MotionEventCompat.AXIS_GENERIC_4, 36, MotionEventCompat.AXIS_GENERIC_6, 40, MotionEventCompat.AXIS_GENERIC_12}, m = "resolve", n = {"this", "started", "this", "cfg", "started", "this", "cfg", "started", "this", "cfg", "started", "this", "cfg", "ids", "started", "this", "cfg", "ids", "ref", "started", "this", "started", "this", ImagesContract.URL}, s = {"L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "J$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class RoostGate$resolve$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RoostGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoostGate$resolve$1(RoostGate roostGate, Continuation<? super RoostGate$resolve$1> continuation) {
        super(continuation);
        this.this$0 = roostGate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object resolve;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        resolve = this.this$0.resolve(this);
        return resolve;
    }
}
