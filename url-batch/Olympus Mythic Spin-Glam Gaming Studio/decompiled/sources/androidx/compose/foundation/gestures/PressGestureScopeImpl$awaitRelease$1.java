package androidx.compose.foundation.gestures;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TapGestureDetector.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE}, m = "awaitRelease")
/* loaded from: classes13.dex */
final class PressGestureScopeImpl$awaitRelease$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PressGestureScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$awaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitRelease(this);
    }
}
