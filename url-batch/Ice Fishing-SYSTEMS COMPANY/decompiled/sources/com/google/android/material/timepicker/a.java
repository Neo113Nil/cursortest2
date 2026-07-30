package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import w3.j;

/* loaded from: classes2.dex */
public final class a extends j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f36337n;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f36337n = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f36337n;
        if (isEmpty) {
            chipTextInputComboView.f36306n.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a9 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f36306n;
        if (TextUtils.isEmpty(a9)) {
            a9 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a9);
    }
}
