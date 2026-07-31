package com.linecorp.linesdk.openchat;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class KotlinExtensionsKt {
    public static final void addAfterTextChangedAction(@NotNull EditText editText, @NotNull final Function1<? super String, Unit> textChangedAction) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(textChangedAction, "textChangedAction");
        editText.addTextChangedListener(new TextWatcher() { // from class: com.linecorp.linesdk.openchat.KotlinExtensionsKt$addAfterTextChangedAction$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                Function1<String, Unit> function1 = textChangedAction;
                String obj = editable != null ? editable.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                function1.invoke(obj);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
    }
}
