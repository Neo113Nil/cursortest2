package com.squareup.cash.ui.qrcodes.widget;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.data.ClearAppUserDataApplicationWorker;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class QrWidgetRefreshApplicationWorker$work$2$1$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ VariantSandboxedComponent $dependencies;
    public Throwable L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ ClearAppUserDataApplicationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrWidgetRefreshApplicationWorker$work$2$1$1$2(VariantSandboxedComponent variantSandboxedComponent, ClearAppUserDataApplicationWorker clearAppUserDataApplicationWorker, Continuation continuation) {
        super(2, continuation);
        this.$dependencies = variantSandboxedComponent;
        this.this$0 = clearAppUserDataApplicationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrWidgetRefreshApplicationWorker$work$2$1$1$2 qrWidgetRefreshApplicationWorker$work$2$1$1$2 = new QrWidgetRefreshApplicationWorker$work$2$1$1$2(this.$dependencies, this.this$0, continuation);
        qrWidgetRefreshApplicationWorker$work$2$1$1$2.Z$0 = ((Boolean) obj).booleanValue();
        return qrWidgetRefreshApplicationWorker$work$2$1$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((QrWidgetRefreshApplicationWorker$work$2$1$1$2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r11.collect(r2, r10) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 13;
        Continuation continuation = null;
        int i3 = 1;
        ClearAppUserDataApplicationWorker clearAppUserDataApplicationWorker = this.this$0;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                if (!z) {
                    return Unit.INSTANCE;
                }
                Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealDrawerOpener$getDrawerScreen$$inlined$map$1(((RealProfileManager) ((VariantSandboxedComponent.Impl) this.$dependencies).realProfileManagerProvider.invoke()).publicProfile(), 27));
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(clearAppUserDataApplicationWorker, i3);
                this.Z$0 = z;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    throw th;
                }
                SafeTrace.throwOnFailure(obj);
            }
            NonCancellable nonCancellable = NonCancellable.INSTANCE;
            ExoPlayerVideoView.AnonymousClass2 anonymousClass2 = new ExoPlayerVideoView.AnonymousClass2(clearAppUserDataApplicationWorker, continuation, i2);
            this.Z$0 = z;
            this.label = 2;
            this = JobKt.withContext(nonCancellable, anonymousClass2, this);
        } catch (Throwable th2) {
            NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
            ExoPlayerVideoView.AnonymousClass2 anonymousClass22 = new ExoPlayerVideoView.AnonymousClass2(clearAppUserDataApplicationWorker, continuation, i2);
            this.L$0 = th2;
            this.Z$0 = z;
            this.label = 3;
            if (JobKt.withContext(nonCancellable2, anonymousClass22, this) != coroutineSingletons) {
                throw th2;
            }
        }
    }
}
