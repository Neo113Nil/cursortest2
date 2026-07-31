package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {189}, m = "textInputCommandEventLoop")
/* loaded from: classes.dex */
final class TextInputServiceAndroid$textInputCommandEventLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputServiceAndroid$textInputCommandEventLoop$1(TextInputServiceAndroid textInputServiceAndroid, Continuation continuation) {
        super(continuation);
        this.this$0 = textInputServiceAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.textInputCommandEventLoop(this);
    }
}
