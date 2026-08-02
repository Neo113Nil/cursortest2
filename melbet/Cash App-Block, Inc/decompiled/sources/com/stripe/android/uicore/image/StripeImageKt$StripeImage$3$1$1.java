package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$4$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.stripe.android.uicore.image.StripeImageState;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import okio.Utf8;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class StripeImageKt$StripeImage$3$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $height;
    public Object $imageLoader;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $state;
    public final /* synthetic */ Object $url;
    public final /* synthetic */ int $width;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeImageKt$StripeImage$3$1$1(DefaultStripeImageLoader defaultStripeImageLoader, String str, int i, int i2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$imageLoader = defaultStripeImageLoader;
        this.$url = str;
        this.$width = i;
        this.$height = i2;
        this.$state = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$state;
        Object obj3 = this.$url;
        switch (i) {
            case 0:
                return new StripeImageKt$StripeImage$3$1$1((DefaultStripeImageLoader) this.$imageLoader, (String) obj3, this.$width, this.$height, (MutableState) obj2, continuation);
            default:
                return new StripeImageKt$StripeImage$3$1$1((GLSceneScope) obj3, (SurfaceTexture) obj2, this.$width, this.$height, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((StripeImageKt$StripeImage$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m4077loadBWLJW6A;
        Bitmap bitmap;
        Throwable th;
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl;
        int i = this.$r8$classId;
        Object obj2 = this.$state;
        Object obj3 = this.$url;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    m4077loadBWLJW6A = ((DefaultStripeImageLoader) this.$imageLoader).m4077loadBWLJW6A((String) obj3, this.$width, this.$height, this);
                    if (m4077loadBWLJW6A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4077loadBWLJW6A = ((Result) obj).value;
                }
                Result.Companion companion = Result.Companion;
                if (!(m4077loadBWLJW6A instanceof Result.Failure) && (bitmap = (Bitmap) m4077loadBWLJW6A) != null) {
                    mutableState.setValue(new StripeImageState.Success(new BitmapPainter(new AndroidImageBitmap(bitmap))));
                }
                if (Result.m4120exceptionOrNullimpl(m4077loadBWLJW6A) != null) {
                    mutableState.setValue(StripeImageState.Error.INSTANCE);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ExecutorCoroutineDispatcherImpl newSingleThreadContext = ThreadPoolDispatcherKt.newSingleThreadContext("GLScope");
                    try {
                        CardStylePickerViewKt$CardStylePicker$1$1$1$4$1 cardStylePickerViewKt$CardStylePicker$1$1$1$4$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$4$1((GLSceneScope) obj3, (SurfaceTexture) obj2, this.$width, this.$height, null);
                        this.$imageLoader = newSingleThreadContext;
                        this.label = 1;
                        if (JobKt.withContext(newSingleThreadContext, cardStylePickerViewKt$CardStylePicker$1$1$1$4$1, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        executorCoroutineDispatcherImpl = newSingleThreadContext;
                    } catch (Throwable th2) {
                        th = th2;
                        executorCoroutineDispatcherImpl = newSingleThreadContext;
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    executorCoroutineDispatcherImpl = (ExecutorCoroutineDispatcherImpl) this.$imageLoader;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            Utf8.closeFinally(executorCoroutineDispatcherImpl, th);
                            throw th4;
                        }
                    }
                }
                Utf8.closeFinally(executorCoroutineDispatcherImpl, null);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeImageKt$StripeImage$3$1$1(GLSceneScope gLSceneScope, SurfaceTexture surfaceTexture, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$url = gLSceneScope;
        this.$state = surfaceTexture;
        this.$width = i;
        this.$height = i2;
    }
}
