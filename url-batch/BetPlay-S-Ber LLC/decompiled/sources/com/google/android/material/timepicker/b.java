package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import defpackage.z50;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class b extends z50 {
    public final /* synthetic */ ChipTextInputComboView f;

    public b(ChipTextInputComboView chipTextInputComboView) {
        this.f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f;
        if (isEmpty) {
            chipTextInputComboView.i = ChipTextInputComboView.a(chipTextInputComboView, "00");
            return;
        }
        String a = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a)) {
            a = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.i = a;
    }
}
