package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TransformedTextFieldState.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0}, l = {755}, m = "collectImeNotifications", n = {"transformedNotifyImeListener"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class TransformedTextFieldState$collectImeNotifications$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransformedTextFieldState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformedTextFieldState$collectImeNotifications$1(TransformedTextFieldState transformedTextFieldState, Continuation<? super TransformedTextFieldState$collectImeNotifications$1> continuation) {
        super(continuation);
        this.this$0 = transformedTextFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collectImeNotifications(null, this);
    }
}
