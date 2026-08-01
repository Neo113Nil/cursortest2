package io.ktor.client.request.forms;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: FormDataContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.request.forms.FormDataContentKt", f = "FormDataContent.kt", i = {1, 1, 1, 2, 2}, l = {Opcodes.IF_ICMPGE, Opcodes.RETURN, Opcodes.INVOKESTATIC, Opcodes.INVOKESTATIC}, m = "copyTo", n = {"$this$copyTo", "channel", "$this$write_u24default$iv", "$this$copyTo", "channel"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class FormDataContentKt$copyTo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    FormDataContentKt$copyTo$1(Continuation<? super FormDataContentKt$copyTo$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object copyTo;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        copyTo = FormDataContentKt.copyTo(null, null, this);
        return copyTo;
    }
}
