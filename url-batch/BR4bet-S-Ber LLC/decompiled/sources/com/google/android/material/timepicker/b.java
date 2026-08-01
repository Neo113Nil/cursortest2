package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import defpackage.y80;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b extends y80 {
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
