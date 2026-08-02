package com.squareup.cash.ui;

import android.app.Application;
import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlagsHolder;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.util.cache.Cache;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class MainActivity$updateThemeInfo$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainActivity$updateThemeInfo$1(MainActivity mainActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MainActivity mainActivity = this.this$0;
        switch (i) {
            case 0:
                return new MainActivity$updateThemeInfo$1(mainActivity, continuation, 0);
            default:
                return new MainActivity$updateThemeInfo$1(mainActivity, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((MainActivity$updateThemeInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((MainActivity$updateThemeInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MainActivity mainActivity = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DerivedStateFlow mapState = StateFlowKt.mapState(InternalArcadeFlagsHolder.immutableFlags, new StorageLinkQueries$$ExternalSyntheticLambda8(mainActivity, 27));
                Cache.AnonymousClass1.C00671 c00671 = new Cache.AnonymousClass1.C00671(mainActivity, 9);
                this.label = 1;
                mapState.collect(c00671, this);
                return coroutineSingletons;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Application application = mainActivity.getApplication();
                application.getClass();
                Context applicationContext = application.getApplicationContext();
                applicationContext.getClass();
                Deferred sandboxedComponentFlow = ((CashApp) applicationContext).getSandboxedComponentFlow();
                this.label = 1;
                Object await = sandboxedComponentFlow.await(this);
                return await == coroutineSingletons2 ? coroutineSingletons2 : await;
        }
    }
}
