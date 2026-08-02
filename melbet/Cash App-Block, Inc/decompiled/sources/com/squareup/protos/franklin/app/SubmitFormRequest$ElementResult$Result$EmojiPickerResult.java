package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$EmojiPickerResult extends zzdi {
    public final SubmitFormRequest.ElementResult.EmojiPickerResult value;

    public SubmitFormRequest$ElementResult$Result$EmojiPickerResult(SubmitFormRequest.ElementResult.EmojiPickerResult emojiPickerResult) {
        emojiPickerResult.getClass();
        this.value = emojiPickerResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$EmojiPickerResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$EmojiPickerResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EmojiPickerResult(value=" + this.value + ")";
    }
}
