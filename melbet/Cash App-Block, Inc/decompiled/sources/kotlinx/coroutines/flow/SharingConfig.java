package kotlinx.coroutines.flow;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.ImeEditCommandScope;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes3.dex */
public final class SharingConfig implements ImeEditCommandScope {
    public final Object context;
    public int extraBufferCapacity;
    public Object onBufferOverflow;
    public final Object upstream;

    public SharingConfig(TransformedTextFieldState transformedTextFieldState) {
        this.upstream = transformedTextFieldState;
        this.context = new MutableVector(0, new Function1[16]);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(Function1 function1) {
        this.extraBufferCapacity++;
        ((MutableVector) this.context).add(function1);
        endBatchEdit();
    }

    public boolean endBatchEdit() {
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) this.upstream;
        MutableVector mutableVector = (MutableVector) this.context;
        int i = this.extraBufferCapacity - 1;
        this.extraBufferCapacity = i;
        if (i == 0 && mutableVector.size != 0) {
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
            TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
            if (transformedTextFieldState.outputTransformation == null && transformedTextFieldState.codepointTransformation == null) {
                this.onBufferOverflow = textFieldBuffer;
            }
            Object[] objArr = mutableVector.content;
            int i2 = mutableVector.size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((Function1) objArr[i3]).invoke(textFieldBuffer);
            }
            transformedTextFieldState.updateWedgeAffinity(textFieldBuffer);
            TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, false, textFieldEditUndoBehavior);
            textFieldState.setUserCommit(true);
            mutableVector.clear();
        }
        return this.extraBufferCapacity > 0;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public int getTransformedLength() {
        TextFieldBuffer textFieldBuffer = (TextFieldBuffer) this.onBufferOverflow;
        return textFieldBuffer != null ? textFieldBuffer.buffer.length() : ((TransformedTextFieldState) this.upstream).getVisualText().text.length();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI */
    public long mo387mapFromTransformedGEjPoXI(long j) {
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) this.upstream;
        return (transformedTextFieldState.outputTransformation == null && transformedTextFieldState.codepointTransformation == null) ? j : transformedTextFieldState.m414mapFromTransformedGEjPoXI(j);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI */
    public long mo388mapToTransformedGEjPoXI(long j) {
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) this.upstream;
        return (transformedTextFieldState.outputTransformation == null && transformedTextFieldState.codepointTransformation == null) ? j : transformedTextFieldState.m415mapToTransformedGEjPoXI(j);
    }

    public SharingConfig(int i, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        this.upstream = flow;
        this.extraBufferCapacity = i;
        this.onBufferOverflow = bufferOverflow;
        this.context = coroutineContext;
    }
}
