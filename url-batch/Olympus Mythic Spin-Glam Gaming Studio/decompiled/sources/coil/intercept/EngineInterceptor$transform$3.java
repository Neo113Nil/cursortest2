package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import coil.EventListener;
import coil.intercept.EngineInterceptor;
import coil.request.ImageRequest;
import coil.request.Options;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EngineInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class EngineInterceptor$transform$3 extends SuspendLambda implements Function2 {
    final /* synthetic */ EventListener $eventListener;
    final /* synthetic */ Options $options;
    final /* synthetic */ ImageRequest $request;
    final /* synthetic */ EngineInterceptor.ExecuteResult $result;
    final /* synthetic */ List<Object> $transformations;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$transform$3(EngineInterceptor engineInterceptor, EngineInterceptor.ExecuteResult executeResult, Options options, List<Object> list, EventListener eventListener, ImageRequest imageRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = engineInterceptor;
        this.$result = executeResult;
        this.$options = options;
        this.$transformations = list;
        this.$eventListener = eventListener;
        this.$request = imageRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, continuation);
        engineInterceptor$transform$3.L$0 = obj;
        return engineInterceptor$transform$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((EngineInterceptor$transform$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Bitmap convertDrawableToBitmap;
        List<Object> list;
        Options options;
        int size;
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            convertDrawableToBitmap = this.this$0.convertDrawableToBitmap(this.$result.getDrawable(), this.$options, this.$transformations);
            this.$eventListener.transformStart(this.$request, convertDrawableToBitmap);
            list = this.$transformations;
            options = this.$options;
            size = list.size();
            i = 0;
        } else if (i2 == 1) {
            size = this.I$1;
            int i3 = this.I$0;
            options = (Options) this.L$2;
            list = (List) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            convertDrawableToBitmap = (Bitmap) obj;
            CoroutineScopeKt.ensureActive(coroutineScope);
            i = i3 + 1;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (i < size) {
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(list.get(i));
            options.getSize();
            this.L$0 = coroutineScope;
            this.L$1 = list;
            this.L$2 = options;
            this.I$0 = i;
            this.I$1 = size;
            this.label = 1;
            throw null;
        }
        this.$eventListener.transformEnd(this.$request, convertDrawableToBitmap);
        return EngineInterceptor.ExecuteResult.copy$default(this.$result, new BitmapDrawable(this.$request.getContext().getResources(), convertDrawableToBitmap), false, null, null, 14, null);
    }
}
