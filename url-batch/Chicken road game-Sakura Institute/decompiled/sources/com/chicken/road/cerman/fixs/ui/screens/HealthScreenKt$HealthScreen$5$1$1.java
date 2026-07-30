package com.chicken.road.cerman.fixs.ui.screens;

import android.content.Context;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.data.Vaccination;
import com.chicken.road.cerman.fixs.notifications.VaccineReminders;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HealthScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$HealthScreen$5$1$1", f = "HealthScreen.kt", i = {}, l = {180, 181}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HealthScreenKt$HealthScreen$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ Vaccination $v;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthScreenKt$HealthScreen$5$1$1(Repository repository, Vaccination vaccination, Context context, Continuation<? super HealthScreenKt$HealthScreen$5$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$v = vaccination;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HealthScreenKt$HealthScreen$5$1$1(this.$repo, this.$v, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HealthScreenKt$HealthScreen$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$repo.addVaccination(this.$v, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        if (VaccineReminders.INSTANCE.rescheduleAll(this.$ctx, this.$repo, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
