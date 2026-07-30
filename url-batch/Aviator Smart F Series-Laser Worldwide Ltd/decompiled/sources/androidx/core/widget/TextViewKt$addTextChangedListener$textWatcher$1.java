package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import f6.l;
import f6.r;

/* loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ l $afterTextChanged;
    final /* synthetic */ r $beforeTextChanged;
    final /* synthetic */ r $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(l lVar, r rVar, r rVar2) {
        this.$afterTextChanged = lVar;
        this.$beforeTextChanged = rVar;
        this.$onTextChanged = rVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }
}
