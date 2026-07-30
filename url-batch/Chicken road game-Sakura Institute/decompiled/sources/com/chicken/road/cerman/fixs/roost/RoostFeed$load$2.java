package com.chicken.road.cerman.fixs.roost;

import androidx.core.view.MotionEventCompat;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RoostFeed.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/chicken/road/cerman/fixs/roost/RoostConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.roost.RoostFeed$load$2", f = "RoostFeed.kt", i = {0}, l = {MotionEventCompat.AXIS_GENERIC_13}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class RoostFeed$load$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RoostConfig>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    RoostFeed$load$2(Continuation<? super RoostFeed$load$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoostFeed$load$2 roostFeed$load$2 = new RoostFeed$load$2(continuation);
        roostFeed$load$2.L$0 = obj;
        return roostFeed$load$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RoostConfig> continuation) {
        return ((RoostFeed$load$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.chicken.road.cerman.fixs.roost.RoostFeed$load$2$1$listener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6819constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.L$0 = (CoroutineScope) this.L$0;
        this.label = 1;
        RoostFeed$load$2 roostFeed$load$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(roostFeed$load$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(FirebaseDatabase.getInstance().getReference(RoostBank.INSTANCE.at(0)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m6825isFailureimpl(m6819constructorimpl)) {
            m6819constructorimpl = null;
        }
        final DatabaseReference databaseReference = (DatabaseReference) m6819constructorimpl;
        if (databaseReference == null) {
            if (cancellableContinuationImpl2.isActive()) {
                Result.Companion companion3 = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m6819constructorimpl(null));
            }
        } else {
            final ?? r4 = new ValueEventListener() { // from class: com.chicken.road.cerman.fixs.roost.RoostFeed$load$2$1$listener$1
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot snap) {
                    Intrinsics.checkNotNullParameter(snap, "snap");
                    Boolean bool = (Boolean) snap.child(RoostBank.INSTANCE.at(1)).getValue(Boolean.TYPE);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    String str = (String) snap.child(RoostBank.INSTANCE.at(2)).getValue(String.class);
                    if (str == null) {
                        str = "";
                    }
                    String str2 = (String) snap.child(RoostBank.INSTANCE.at(3)).getValue(String.class);
                    RoostConfig roostConfig = new RoostConfig(booleanValue, str, str2 != null ? str2 : "");
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<RoostConfig> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion4 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m6819constructorimpl(roostConfig));
                    }
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<RoostConfig> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion4 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m6819constructorimpl(null));
                    }
                }
            };
            databaseReference.addListenerForSingleValueEvent((ValueEventListener) r4);
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.chicken.road.cerman.fixs.roost.RoostFeed$load$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    DatabaseReference.this.removeEventListener(r4);
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(roostFeed$load$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
